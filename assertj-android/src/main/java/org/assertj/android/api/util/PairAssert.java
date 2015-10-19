// Copyright 2013 Square, Inc.
package org.assertj.android.api.util;

import android.util.Pair;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Pair} instances. */
public class PairAssert<F, S> extends AbstractAssert<PairAssert<F, S>, Pair<F, S>> {
  public PairAssert(Pair<F, S> actual) {
    super(actual, PairAssert.class);
  }

  public PairAssert<F, S> hasFirst(F first) {
    isNotNull();
    F actualFirst = actual.first;
    assertThat(actualFirst) //
        .overridingErrorMessage("Expected first value <%s> but was <%s>.", first, actualFirst) //
        .isEqualTo(first);
    return this;
  }

  public PairAssert<F, S> hasSecond(S second) {
    isNotNull();
    S actualSecond = actual.second;
    assertThat(actualSecond) //
        .overridingErrorMessage("Expected second value <%s> but was <%s>.", second, actualSecond) //
        .isEqualTo(second);
    return this;
  }
}
