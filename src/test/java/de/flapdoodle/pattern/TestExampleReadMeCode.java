/**
 * Copyright (C) 2013
 *   Michael Mosmann <michael@mosmann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.pattern;

import com.google.common.base.Optional;
import de.flapdoodle.pattern.regex.Patterns;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestExampleReadMeCode {
	// ### Usage
	// ->
	// ..
	// <-

	@Test
	public void expectOneOrNone() {
		// ->
		Pattern pattern = Pattern.compile("(?<start>[a-zA-Z]+):(?<end>[a-zA-Z]+(?<number>[0-9]+))");
		Matcher matcher = pattern.matcher("stuff:has42");

		Optional<Map<String, String>> match = Patterns.match(matcher);
		
		assertTrue(match.isPresent());
		assertEquals("start", "stuff", match.get().get("start"));
		assertEquals("end", "has42", match.get().get("end"));
		assertEquals("number", "42", match.get().get("number"));
		// <-
	}

}
