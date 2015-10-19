// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.SimpleCursorAdapter;

import static android.widget.SimpleCursorAdapter.CursorToStringConverter;
import static android.widget.SimpleCursorAdapter.ViewBinder;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SimpleCursorAdapter} instances. */
public class SimpleCursorAdapterAssert
    extends AbstractCursorAdapterAssert<SimpleCursorAdapterAssert, SimpleCursorAdapter> {
  public SimpleCursorAdapterAssert(SimpleCursorAdapter actual) {
    super(actual, SimpleCursorAdapterAssert.class);
  }

  public SimpleCursorAdapterAssert hasCursorToStringConverter(CursorToStringConverter converter) {
    isNotNull();
    CursorToStringConverter actualConverter = actual.getCursorToStringConverter();
    assertThat(actualConverter) //
        .overridingErrorMessage("Expected cursor 'toString' converter <%s> but was <%s>.",
            converter, actualConverter) //
        .isSameAs(converter);
    return this;
  }

  public SimpleCursorAdapterAssert hasStringConversionColumn(int column) {
    isNotNull();
    int actualColumn = actual.getStringConversionColumn();
    assertThat(actualColumn) //
        .overridingErrorMessage("Expected string conversion column <%s> but was <%s>.", column,
            actualColumn) //
        .isEqualTo(column);
    return this;
  }

  public SimpleCursorAdapterAssert hasViewBinder(ViewBinder binder) {
    isNotNull();
    ViewBinder actualBinder = actual.getViewBinder();
    assertThat(actualBinder) //
        .overridingErrorMessage("Expected view binder <%s> but was <%s>.", binder, actualBinder) //
        .isSameAs(binder);
    return this;
  }
}
