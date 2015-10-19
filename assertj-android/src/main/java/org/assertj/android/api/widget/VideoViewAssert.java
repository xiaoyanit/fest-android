// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.VideoView;
import org.assertj.android.api.view.AbstractViewAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link VideoView} instances. */
public class VideoViewAssert extends AbstractViewAssert<VideoViewAssert, VideoView> {
  public VideoViewAssert(VideoView actual) {
    super(actual, VideoViewAssert.class);
  }

  public VideoViewAssert isPausable() {
    isNotNull();
    assertThat(actual.canPause()) //
        .overridingErrorMessage("Expected to be pausable but was not.") //
        .isTrue();
    return this;
  }

  public VideoViewAssert isNotPausable() {
    isNotNull();
    assertThat(actual.canPause()) //
        .overridingErrorMessage("Expected to not be pausable but was.") //
        .isFalse();
    return this;
  }

  public VideoViewAssert isSeekableBackward() {
    isNotNull();
    assertThat(actual.canSeekBackward()) //
        .overridingErrorMessage("Expected to be seekable backward but was not.") //
        .isTrue();
    return this;
  }

  public VideoViewAssert isNotSeekableBackward() {
    isNotNull();
    assertThat(actual.canSeekBackward()) //
        .overridingErrorMessage("Expected to not be seekable backward but was.") //
        .isFalse();
    return this;
  }

  public VideoViewAssert isSeekableForward() {
    isNotNull();
    assertThat(actual.canSeekForward()) //
        .overridingErrorMessage("Expected to be seekable forward but was not.") //
        .isTrue();
    return this;
  }

  public VideoViewAssert isNotSeekableForward() {
    isNotNull();
    assertThat(actual.canSeekForward()) //
        .overridingErrorMessage("Expected to not be seekable forward but was.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public VideoViewAssert hasAudioSessionId(int id) {
    isNotNull();
    int actualId = actual.getAudioSessionId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected audio session ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public VideoViewAssert hasBufferPercentage(int percentage) {
    isNotNull();
    int actualPercentage = actual.getBufferPercentage();
    assertThat(actualPercentage) //
        .overridingErrorMessage("Expected buffer percentage <%s> but was <%s>.", percentage,
            actualPercentage) //
        .isEqualTo(percentage);
    return this;
  }

  public VideoViewAssert hasCurrentPosition(int position) {
    isNotNull();
    int actualPosition = actual.getCurrentPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected current position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public VideoViewAssert hasDuration(int duration) {
    isNotNull();
    int actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public VideoViewAssert isPlaying() {
    isNotNull();
    assertThat(actual.isPlaying()) //
        .overridingErrorMessage("Expected to be playing but was not.") //
        .isTrue();
    return this;
  }

  public VideoViewAssert isNotPlaying() {
    isNotNull();
    assertThat(actual.isPlaying()) //
        .overridingErrorMessage("Expected to not be playing but was.") //
        .isFalse();
    return this;
  }
}
