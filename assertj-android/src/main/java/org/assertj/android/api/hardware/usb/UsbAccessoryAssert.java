// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware.usb;

import android.annotation.TargetApi;
import android.hardware.usb.UsbAccessory;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link UsbAccessory} instances. */
@TargetApi(HONEYCOMB_MR1)
public class UsbAccessoryAssert extends AbstractAssert<UsbAccessoryAssert, UsbAccessory> {
  public UsbAccessoryAssert(UsbAccessory actual) {
    super(actual, UsbAccessoryAssert.class);
  }

  public UsbAccessoryAssert hasDescription(String description) {
    isNotNull();
    String actualDescription = actual.getDescription();
    assertThat(actualDescription) //
        .overridingErrorMessage("Expected description <%s> but was <%s>.", description,
            actualDescription) //
        .isEqualTo(description);
    return this;
  }

  public UsbAccessoryAssert hasManufacturer(String manufacturer) {
    isNotNull();
    String actualManufacturer = actual.getManufacturer();
    assertThat(actualManufacturer) //
        .overridingErrorMessage("Expected manufacturer <%s> but was <%s>.", manufacturer,
            actualManufacturer) //
        .isEqualTo(manufacturer);
    return this;
  }

  public UsbAccessoryAssert hasModel(String model) {
    isNotNull();
    String actualModel = actual.getModel();
    assertThat(actualModel) //
        .overridingErrorMessage("Expected model <%s> but was <%s>.", model, actualModel) //
        .isEqualTo(model);
    return this;
  }

  public UsbAccessoryAssert hasSerial(String serial) {
    isNotNull();
    String actualSerial = actual.getSerial();
    assertThat(actualSerial) //
        .overridingErrorMessage("Expected serial <%s> but was <%s>.", serial, actualSerial) //
        .isEqualTo(serial);
    return this;
  }

  public UsbAccessoryAssert hasUri(String uri) {
    isNotNull();
    String actualUri = actual.getUri();
    assertThat(actualUri) //
        .overridingErrorMessage("Expected uri <%s> but was <%s>.", uri, actualUri) //
        .isEqualTo(uri);
    return this;
  }

  public UsbAccessoryAssert hasVersion(String version) {
    isNotNull();
    String actualVersion = actual.getVersion();
    assertThat(actualVersion) //
        .overridingErrorMessage("Expected version <%s> but was <%s>.", version, actualVersion) //
        .isEqualTo(version);
    return this;
  }
}
