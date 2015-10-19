// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.Picture;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Picture} instances. */
public class PictureAssert extends AbstractAssert<PictureAssert, Picture> {
  public PictureAssert(Picture actual) {
    super(actual, PictureAssert.class);
  }

  public PictureAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public PictureAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }
}
