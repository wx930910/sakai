/*
 * This file is part of "SnipSnap Radeox Rendering Engine".
 *
 * Copyright (c) 2002 Stephan J. Schmidt, Matthias L. Jugel
 * All Rights Reserved.
 *
 * Please visit http://radeox.org/ for updates and contact.
 *
 * --LICENSE NOTICE--
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * --LICENSE NOTICE--
 */

package org.radeox.test.filter.mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.radeox.filter.Filter;
import org.radeox.filter.context.FilterContext;

public class MockReplacedFilter {
	public static Filter mockFilter1() {
		Filter mockInstance = mock(Filter.class);
		when(mockInstance.getDescription()).thenReturn("");
		when(mockInstance.filter(any(String.class), any(FilterContext.class))).thenAnswer((stubInvo) -> {
			String input = stubInvo.getArgument(0);
			return input;
		});
		when(mockInstance.before()).thenReturn(new String[0]);
		when(mockInstance.replaces()).thenReturn(new String[0]);
		return mockInstance;
	}
}
