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

package org.doubango.ngn.datatype.pocsettings;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict=false, name = "isbSettingType")
public class IsbSettingType {

    @Element(required = false, name = "incoming-session-barring")
    protected IsbSettingType.IncomingSessionBarring incomingSessionBarring;

    public IsbSettingType.IncomingSessionBarring getIncomingSessionBarring() {
        return incomingSessionBarring;
    }


    public void setIncomingSessionBarring(IsbSettingType.IncomingSessionBarring value) {
        this.incomingSessionBarring = value;
    }




    @Root(strict=false, name = "")
    public static class IncomingSessionBarring {

        @Attribute(name = "active")
        protected boolean active;


        public boolean isActive() {
            return active;
        }

        public void setActive(boolean value) {
            this.active = value;
        }

    }

}