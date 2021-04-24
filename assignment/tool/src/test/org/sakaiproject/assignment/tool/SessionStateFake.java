/**
 * Copyright (c) 2003-2017 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.assignment.tool;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.sakaiproject.event.api.SessionState;

/**
 * Fake SessionState that just uses a map.
 */
public class SessionStateFake {
	public static SessionState mockSessionState1() {
		Map<String, Object> mockFieldVariableMap = new HashMap<>();
		SessionState mockInstance = mock(SessionState.class);
		when(mockInstance.getAttributeNames()).thenAnswer((stubInvo) -> {
			return new ArrayList<>(mockFieldVariableMap.keySet());
		});
		when(mockInstance.setAttribute(any(String.class), any(Object.class))).thenAnswer((stubInvo) -> {
			String name = stubInvo.getArgument(0);
			Object value = stubInvo.getArgument(1);
			return mockFieldVariableMap.put(name, value);
		});
		when(mockInstance.removeAttribute(any(String.class))).thenAnswer((stubInvo) -> {
			String name = stubInvo.getArgument(0);
			return mockFieldVariableMap.remove(name);
		});
		when(mockInstance.getAttribute(any(String.class))).thenAnswer((stubInvo) -> {
			String name = stubInvo.getArgument(0);
			return mockFieldVariableMap.get(name);
		});
		doAnswer((stubInvo) -> {
			mockFieldVariableMap.clear();
			return null;
		}).when(mockInstance).clear();
		return mockInstance;
	}
}
