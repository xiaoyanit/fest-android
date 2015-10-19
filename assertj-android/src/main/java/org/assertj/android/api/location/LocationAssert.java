// Copyright 2013 Square, Inc.
package org.assertj.android.api.location;

import android.annotation.TargetApi;
import android.location.Location;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Location} instances. */
public class LocationAssert extends AbstractAssert<LocationAssert, Location> {
  public LocationAssert(Location actual) {
    super(actual, LocationAssert.class);
  }

  public LocationAssert hasAccuracy(float accuracy) {
    isNotNull();
    float actualAccuracy = actual.getAccuracy();
    assertThat(actualAccuracy) //
        .overridingErrorMessage("Expected accuracy <%s> but was <%s>.", accuracy, actualAccuracy) //
        .isEqualTo(accuracy);
    return this;
  }

  public LocationAssert hasAltitude(double altitude) {
    isNotNull();
    double actualAltitude = actual.getAltitude();
    assertThat(actualAltitude) //
        .overridingErrorMessage("Expected altitude <%s> but was <%s>.", altitude, actualAltitude) //
        .isEqualTo(altitude);
    return this;
  }

  public LocationAssert hasBearing(float bearing) {
    isNotNull();
    float actualBearing = actual.getBearing();
    assertThat(actualBearing) //
        .overridingErrorMessage("Expected bearing <%s> but was <%s>.", bearing, actualBearing) //
        .isEqualTo(bearing);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public LocationAssert hasElapsedRealTimeNanos(long nanos) {
    isNotNull();
    float actualNanos = actual.getElapsedRealtimeNanos();
    assertThat(actualNanos) //
        .overridingErrorMessage("Expected elapsed real-time nanos <%s> but was <%s>.", nanos,
            actualNanos) //
        .isEqualTo(nanos);
    return this;
  }

  public LocationAssert hasLatitude(double latitude) {
    isNotNull();
    double actualLatitude = actual.getLatitude();
    assertThat(actualLatitude) //
        .overridingErrorMessage("Expected latitude <%s> but was <%s>.", latitude, actualLatitude) //
        .isEqualTo(latitude);
    return this;
  }

  public LocationAssert hasLongitude(double longitude) {
    isNotNull();
    double actualLongitude = actual.getLongitude();
    assertThat(actualLongitude) //
        .overridingErrorMessage("Expected longitude <%s> but was <%s>.", longitude,
            actualLongitude) //
        .isEqualTo(longitude);
    return this;
  }

  public LocationAssert hasProvider(String name) {
    isNotNull();
    String actualName = actual.getProvider();
    assertThat(actualName) //
        .overridingErrorMessage("Expected provider <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public LocationAssert hasSpeed(float speed) {
    isNotNull();
    float actualSpeed = actual.getSpeed();
    assertThat(actualSpeed) //
        .overridingErrorMessage("Expected speed <%s> but was <%s>.", speed, actualSpeed) //
        .isEqualTo(speed);
    return this;
  }

  public LocationAssert hasTime(long time) {
    isNotNull();
    long actualTime = actual.getTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected time <%s> but was <%s>.", time, actualTime) //
        .isEqualTo(time);
    return this;
  }

  public LocationAssert hasAccuracy() {
    isNotNull();
    assertThat(actual.hasAccuracy()) //
        .overridingErrorMessage("Expected to have accuracy but did not.") //
        .isTrue();
    return this;
  }

  public LocationAssert hasNoAccuracy() {
    isNotNull();
    assertThat(actual.hasAccuracy()) //
        .overridingErrorMessage("Expected to not have accuracy but did.") //
        .isFalse();
    return this;
  }

  public LocationAssert hasAltitude() {
    isNotNull();
    assertThat(actual.hasAltitude()) //
        .overridingErrorMessage("Expected to have altitude but did not.") //
        .isTrue();
    return this;
  }

  public LocationAssert hasNoAltitude() {
    isNotNull();
    assertThat(actual.hasAltitude()) //
        .overridingErrorMessage("Expected to not have altitude but did.") //
        .isFalse();
    return this;
  }

  public LocationAssert hasBearing() {
    isNotNull();
    assertThat(actual.hasBearing()) //
        .overridingErrorMessage("Expected to have bearing but did not.") //
        .isTrue();
    return this;
  }

  public LocationAssert hasNoBearing() {
    isNotNull();
    assertThat(actual.hasBearing()) //
        .overridingErrorMessage("Expected to not have bearing but did.") //
        .isFalse();
    return this;
  }

  public LocationAssert hasSpeed() {
    isNotNull();
    assertThat(actual.hasSpeed()) //
        .overridingErrorMessage("Expected to have speed but did not.") //
        .isTrue();
    return this;
  }

  public LocationAssert hasNoSpeed() {
    isNotNull();
    assertThat(actual.hasSpeed()) //
        .overridingErrorMessage("Expected to not have speed but did.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public LocationAssert isFromMockProvider() {
    isNotNull();
    assertThat(actual.isFromMockProvider()) //
        .overridingErrorMessage("Expected to be from mock provider but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public LocationAssert isNotFromMockProvider() {
    isNotNull();
    assertThat(actual.isFromMockProvider()) //
        .overridingErrorMessage("Expected to not be from mock provider but was.") //
        .isFalse();
    return this;
  }
}
