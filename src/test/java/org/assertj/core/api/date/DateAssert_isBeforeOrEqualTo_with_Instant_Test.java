/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2022 the original author or authors.
 */
package org.assertj.core.api.date;

import org.assertj.core.api.DateAssert;

import java.util.Date;

import static org.mockito.Mockito.verify;

/**
 * Tests for <code>{@link DateAssert#isBeforeOrEqualTo(Date)}</code>.
 *
 * @author Joel Costigliola
 */
class DateAssert_isBeforeOrEqualTo_with_Instant_Test extends AbstractDateAssertWithDateArg_Test {

  @Override
  protected DateAssert assertionInvocationWithDateArg() {
    return assertions.isBeforeOrEqualTo(otherDate);
  }

  @Override
  protected DateAssert assertionInvocationWithStringArg(String date) {
    return assertions.isBeforeOrEqualTo(date);
  }

  @Override
  protected void verifyAssertionInvocation(Date date) {
    verify(dates).assertIsBeforeOrEqualTo(getInfo(assertions), getActual(assertions), date);
  }

  @Override
  protected DateAssert assertionInvocationWithInstantArg() {
    return assertions.isBeforeOrEqualTo(otherDate);
  }

}
