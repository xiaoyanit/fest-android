package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.ListFragment;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ListFragment} instances. */
@TargetApi(HONEYCOMB)
public class ListFragmentAssert extends AbstractFragmentAssert<ListFragmentAssert, ListFragment> {
  public ListFragmentAssert(ListFragment actual) {
    super(actual, ListFragmentAssert.class);
  }

  public ListFragmentAssert hasSelectedItemId(long id) {
    isNotNull();
    long actualId = actual.getSelectedItemId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected selected ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public ListFragmentAssert hasSelectedItemPosition(int position) {
    isNotNull();
    long actualPosition = actual.getSelectedItemPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selected position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }
}
