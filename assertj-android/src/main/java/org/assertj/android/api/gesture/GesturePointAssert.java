// Copyright 2013 Square, Inc.
package org.assertj.android.api.gesture;

import android.gesture.GesturePoint;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AbstractAssert;

/** Assertions for {@link GesturePoint} instances. */
public class GesturePointAssert extends AbstractAssert<GesturePointAssert, GesturePoint> {
  public GesturePointAssert(GesturePoint actual) {
    super(actual, GesturePointAssert.class);
  }

  public GesturePointAssert hasTimestamp(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.timestamp;
    Assertions.assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp <%s> but was <%s>.", timestamp, actualTimestamp) //
        .isEqualTo(timestamp);
    return this;
  }

  public GesturePointAssert hasX(float x) {
    isNotNull();
    float actualX = actual.x;
    Assertions.assertThat(actualX) //
        .overridingErrorMessage("Expected X <%s> but was <%s>.", x, actualX) //
        .isEqualTo(x);
    return this;
  }

  public GesturePointAssert hasY(float y) {
    isNotNull();
    float actualY = actual.y;
    Assertions.assertThat(actualY) //
        .overridingErrorMessage("Expected Y <%s> but was <%s>.", y, actualY) //
        .isEqualTo(y);
    return this;
  }
}
