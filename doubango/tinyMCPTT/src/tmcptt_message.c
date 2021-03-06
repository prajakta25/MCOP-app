#if HAVE_CRT
#define _CRTDBG_MAP_ALLOC 
#include <stdlib.h> 
#include <crtdbg.h>
#endif //HAVE_CRT
/* 

*  Copyright (C) 2017, University of the Basque Country (UPV/EHU)
*
* Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
*       
* This file is part of MCOP MCPTT Client
*
* This is free software: you can redistribute it and/or modify it under the terms of
* the GNU General Public License as published by the Free Software Foundation, either version 3 
* of the License, or (at your option) any later version.
*       
* This is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
* See the GNU General Public License for more details.
*       
* You should have received a copy of the GNU General Public License along 
* with this program; if not, write to the Free Software Foundation, Inc., 
* 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/

/*
 * @file tmcptt_message.c
 * @brief MCPTT message.
 *
 */

#include "tinymcptt/tmcptt_message.h"

#include "tsk_string.h"
#include "tsk_memory.h"
#include "tsk_debug.h"


tmcptt_message_t* tmcptt_message_create(uint16_t rcode, const char* rphrase, const char* p_user, uint16_t parts, uint16_t t)
{
	tmcptt_message_t* message;
	if((message = (tmcptt_message_t*)tsk_object_new(tmcptt_message_def_t))){
		message->reason_code = rcode;
		if(rphrase)
			message->reason_phrase = tsk_strdup(rphrase);
		else
			message->reason_phrase = tsk_null;

		if(p_user)
			message->user = tsk_strdup(p_user);
		else
			message->user = tsk_null;

		message->participants = parts;
		message->time = t;

		message->is_broadcast_call = tsk_false;
	}
	return message;
}

tmcptt_message_t* tmcptt_message_create_null()
{
	return tmcptt_message_create(0, tsk_null, tsk_null, 0, 0);
}



//=================================================================================================
//	MCPTT object definition
//
static void* tmcptt_message_ctor(tsk_object_t * self, va_list * app)
{
	tmcptt_message_t *message = (tmcptt_message_t *)self;
	if(message){
	}
	return self;
}

static void* tmcptt_message_dtor(tsk_object_t * self)
{ 
	tmcptt_message_t *message = (tmcptt_message_t *)self;
	if(message){
		TSK_FREE(message->reason_phrase);
		TSK_FREE(message->user);
	}
	return self;
}

static int tmcptt_message_cmp(const tsk_object_t *obj1, const tsk_object_t *obj2)
{
	return -1;
}

static const tsk_object_def_t tmcptt_message_def_s = 
{
	sizeof(tmcptt_message_t),
	tmcptt_message_ctor,
	tmcptt_message_dtor,
	tmcptt_message_cmp, 
};
const tsk_object_def_t *tmcptt_message_def_t = &tmcptt_message_def_s;
