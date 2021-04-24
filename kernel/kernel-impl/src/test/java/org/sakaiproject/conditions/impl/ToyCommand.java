/**
 * Copyright (c) 2003-2009 The Apereo Foundation
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
package org.sakaiproject.conditions.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import org.sakaiproject.conditions.api.EvaluationAction;
import org.sakaiproject.event.api.Event;

public class ToyCommand {

	public static EvaluationAction mockEvaluationAction1() throws Exception {
		EvaluationAction mockInstance = mock(EvaluationAction.class);
		doAnswer((stubInvo) -> {
			Event e = stubInvo.getArgument(0);
			ToyMessagePad.messages.add("I've been hit!");
			ToyMessagePad.messages.add(e.getResource());
			return null;
		}).when(mockInstance).execute(any(), anyBoolean());
		return mockInstance;
	}

}
