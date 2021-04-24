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

import org.sakaiproject.tool.api.ToolSession;

/**
 * @author ieb
 *
 */
public class MockToolSession {

	public static ToolSession mockToolSession1() {
		ToolSession mockInstance = mock(ToolSession.class);
		when(mockInstance.getId()).thenReturn("toolSessionID");
		when(mockInstance.getCreationTime()).thenReturn((long) 1001);
		when(mockInstance.getPlacementId()).thenReturn("ToolSession.placementId");
		when(mockInstance.getUserId()).thenReturn("ToolSession.userID");
		when(mockInstance.getUserEid()).thenReturn("ToolSession.userEID");
		when(mockInstance.getLastAccessedTime()).thenReturn((long) 1002);
		return mockInstance;
	}

}
