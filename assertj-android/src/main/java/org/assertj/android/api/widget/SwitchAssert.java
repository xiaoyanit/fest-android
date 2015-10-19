// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.Switch;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(ICE_CREAM_SANDWICH)
public class SwitchAssert extends AbstractCompoundButtonAssert<SwitchAssert, Switch> {
  public SwitchAssert(Switch actual) {
    super(actual, SwitchAssert.class);
  }

  @TargetApi(JELLY_BEAN)
  public SwitchAssert hasSwitchMinWidth(int width) {
    isNotNull();
    int actualWidth = actual.getSwitchMinWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected switch min width <%s> but was <%s>.", width,
            actualWidth) //
        .isEqualTo(width);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SwitchAssert hasSwitchPadding(int padding) {
    isNotNull();
    int actualPadding = actual.getSwitchPadding();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected switch padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public SwitchAssert hasOnText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getTextOn();
    assertThat(actualText) //
        .overridingErrorMessage("Expected 'on' text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public SwitchAssert hasOnText(int resId) {
    isNotNull();
    return hasOnText(actual.getContext().getString(resId));
  }

  public SwitchAssert hasOffText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getTextOff();
    assertThat(actualText) //
        .overridingErrorMessage("Expected 'off' text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public SwitchAssert hasOffText(int resId) {
    isNotNull();
    return hasOffText(actual.getContext().getString(resId));
  }

  @TargetApi(JELLY_BEAN)
  public SwitchAssert hasThumbDrawable(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getThumbDrawable();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected thumb drawable <%s> but was <%s>.", drawable,
            actualDrawable) //
        .isSameAs(drawable);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SwitchAssert hasThumbTextPadding(int padding) {
    isNotNull();
    int actualPadding = actual.getThumbTextPadding();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected thumb text padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SwitchAssert hasTrackDrawable(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getTrackDrawable();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected track drawable <%s> but was <%s>.", drawable,
            actualDrawable) //
        .isSameAs(drawable);
    return this;
  }
}
