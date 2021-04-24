/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.portal.charon.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.sakaiproject.tool.api.Session;

/**
 * @author ieb
 *
 */
public class MockSession {

	public static Session mockSession1() {
		Session mockInstance = mock(Session.class);
		when(mockInstance.getUserId()).thenReturn("ToolSession.getUserID");
		when(mockInstance.getId()).thenReturn("Session.getID");
		when(mockInstance.getMaxInactiveInterval()).thenReturn(2003);
		when(mockInstance.getCreationTime()).thenReturn((long) 2001);
		when(mockInstance.getLastAccessedTime()).thenReturn((long) 2002);
		when(mockInstance.getUserEid()).thenReturn("ToolSession.getUserEID");
		return mockInstance;
	}

}
