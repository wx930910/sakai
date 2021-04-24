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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.sakaiproject.conditions.api.ConditionTemplate;
import org.sakaiproject.conditions.api.ConditionTemplateSet;

public class MyConditionTemplateSet {
	public static ConditionTemplateSet mockConditionTemplateSet1() {
		Set<ConditionTemplate> mockFieldVariableMyConditionTemplates = new HashSet<ConditionTemplate>();
		ConditionTemplateSet mockInstance = mock(ConditionTemplateSet.class);
		ConditionTemplate aConditionTemplate = MyConditionTemplate.mockConditionTemplate1();
		mockFieldVariableMyConditionTemplates.add(aConditionTemplate);
		when(mockInstance.getId()).thenReturn("sakai.service.gradebook");
		when(mockInstance.getConditionTemplates()).thenAnswer((stubInvo) -> {
			return mockFieldVariableMyConditionTemplates;
		});
		when(mockInstance.getDisplayName()).thenReturn("Gradebook");
		return mockInstance;
	}

}
