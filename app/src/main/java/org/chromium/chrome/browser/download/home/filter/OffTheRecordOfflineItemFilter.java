// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.download.home.filter;

import org.chromium.components.offline_items_collection.OfflineItem;

/** A {@link OfflineItemFilter} responsible for pruning out off the record items if we are not
 * showing them for this instance of the download manager.
 */
public class OffTheRecordOfflineItemFilter extends OfflineItemFilter {
    private final boolean mIncludeOffTheRecordItems;

    /** Creates an instance of this filter and wraps {@code source}. */
    public OffTheRecordOfflineItemFilter(boolean offTheRecord, OfflineItemFilterSource source) {
        super(source);
        mIncludeOffTheRecordItems = offTheRecord;
        onFilterChanged();
    }

    // OfflineItemFilter implementation.
    @Override
    protected boolean isFilteredOut(OfflineItem item) {
        return mIncludeOffTheRecordItems ? false : item.isOffTheRecord;
    }
}