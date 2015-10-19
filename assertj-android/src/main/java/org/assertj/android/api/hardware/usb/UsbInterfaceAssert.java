// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware.usb;

import android.annotation.TargetApi;
import android.hardware.usb.UsbInterface;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;

/** Assertions for {@link UsbInterface} instances. */
@TargetApi(HONEYCOMB_MR1)
public class UsbInterfaceAssert extends AbstractAssert<UsbInterfaceAssert, UsbInterface> {
  public UsbInterfaceAssert(UsbInterface actual) {
    super(actual, UsbInterfaceAssert.class);
  }

  public UsbInterfaceAssert hasEndpointCount(int count) {
    isNotNull();
    int actualCount = actual.getEndpointCount();
    Assertions.assertThat(actualCount) //
        .overridingErrorMessage("Expected endpoint count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public UsbInterfaceAssert hasId(int id) {
    isNotNull();
    int actualId = actual.getId();
    Assertions.assertThat(actualId) //
        .overridingErrorMessage("Expected id <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public UsbInterfaceAssert hasInterfaceClass(int interfaceClass) {
    isNotNull();
    int actualInterfaceClass = actual.getInterfaceClass();
    Assertions.assertThat(actualInterfaceClass) //
        .overridingErrorMessage("Expected interface class <%s> but was <%s>.", interfaceClass,
            actualInterfaceClass) //
        .isEqualTo(interfaceClass);
    return this;
  }

  public UsbInterfaceAssert hasInterfaceProtocol(int protocol) {
    isNotNull();
    int actualProtocol = actual.getInterfaceProtocol();
    Assertions.assertThat(actualProtocol) //
        .overridingErrorMessage("Expected interface protocol <%s> but was <%s>.", protocol,
            actualProtocol) //
        .isEqualTo(protocol);
    return this;
  }

  public UsbInterfaceAssert hasInterfaceSubclass(int subclass) {
    isNotNull();
    int actualSubclass = actual.getInterfaceSubclass();
    Assertions.assertThat(actualSubclass) //
        .overridingErrorMessage("Expected interface subclass <%s> but was <%s>.", subclass,
            actualSubclass) //
        .isEqualTo(subclass);
    return this;
  }
}
