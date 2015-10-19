// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.app;

import android.support.v4.app.Fragment;

/**
 * Assertions for {@link Fragment} instances.
 * <p>
 * This class is final. To extend use {@link AbstractFragmentAssert}.
 */
public final class FragmentAssert extends AbstractFragmentAssert<FragmentAssert, Fragment> {
  public FragmentAssert(Fragment actual) {
    super(actual, FragmentAssert.class);
  }
}
