// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ToggleButton;

import static org.assertj.core.api.Assertions.assertThat;

public class ToggleButtonAssert
    extends AbstractCompoundButtonAssert<ToggleButtonAssert, ToggleButton> {
  public ToggleButtonAssert(ToggleButton actual) {
    super(actual, ToggleButtonAssert.class);
  }

  public ToggleButtonAssert hasOnText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getTextOn();
    assertThat(actualText) //
        .overridingErrorMessage("Expected 'on' text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public ToggleButtonAssert hasOnText(int resId) {
    isNotNull();
    return hasOnText(actual.getContext().getString(resId));
  }

  public ToggleButtonAssert hasOffText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getTextOff();
    assertThat(actualText) //
        .overridingErrorMessage("Expected 'off' text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public ToggleButtonAssert hasOffText(int resId) {
    isNotNull();
    return hasOffText(actual.getContext().getString(resId));
  }
}
