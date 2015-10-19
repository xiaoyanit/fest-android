// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.Keyframe;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Keyframe} instances. */
@TargetApi(HONEYCOMB)
public class KeyframeAssert extends AbstractAssert<KeyframeAssert, Keyframe> {
  public KeyframeAssert(Keyframe actual) {
    super(actual, KeyframeAssert.class);
  }

  public KeyframeAssert hasFraction(float fraction) {
    isNotNull();
    float actualFraction = actual.getFraction();
    assertThat(actualFraction) //
        .overridingErrorMessage("Expected fraction <%s> but was <%s>.", fraction, actualFraction) //
        .isEqualTo(fraction);
    return this;
  }

  public KeyframeAssert hasInterpolator(TimeInterpolator interpolator) {
    isNotNull();
    TimeInterpolator actualInterpolator = actual.getInterpolator();
    assertThat(actualInterpolator) //
        .overridingErrorMessage("Expected interpolator <%s> but was <%s>.", interpolator,
            actualInterpolator) //
        .isSameAs(interpolator);
    return this;
  }

  public KeyframeAssert hasType(Class type) {
    isNotNull();
    Class actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public KeyframeAssert hasValue(Object value) {
    isNotNull();
    Object actualValue = actual.getValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected value <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return this;
  }
}
