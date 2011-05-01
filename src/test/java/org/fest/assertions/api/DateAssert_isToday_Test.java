/*
 * Created on Dec 21, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

import org.junit.Test;

/**
 * Tests for <code>{@link DateAssert#isToday()}</code>.
 *
 * @author Joel Costigliola
 */
public class DateAssert_isToday_Test extends AbstractBaseDateAssert_Test {

  @Test
  public void should_verify_that_actual_is_today() {
    assertions.isToday();
    verify(dates).assertIsToday(assertions.info, assertions.actual);
  }

  @Test
  public void should_return_this() {
    DateAssert returned = assertions.isToday();
    assertSame(assertions, returned);
  }

}
