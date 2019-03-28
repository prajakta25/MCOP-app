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




package org.doubango.ngn.datatype.ms.cms.mcpttServiceConfig;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(strict=false, name =  "transmit-timeType")
public class TransmitTimeType {

    @Element(required = false , name = "time-limit")
    protected String timeLimit;
    @Element(required = false , name = "time-warning")
    protected String timeWarning;





    public String getTimeLimit() {
        return timeLimit;
    }


    public void setTimeLimit(String value) {
        this.timeLimit = value;
    }


    public String getTimeWarning() {
        return timeWarning;
    }


    public void setTimeWarning(String value) {
        this.timeWarning = value;
    }

}
