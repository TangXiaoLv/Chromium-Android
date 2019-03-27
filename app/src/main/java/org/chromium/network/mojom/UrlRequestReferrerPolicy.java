
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_loader.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class UrlRequestReferrerPolicy {


    public static final int CLEAR_REFERRER_ON_TRANSITION_FROM_SECURE_TO_INSECURE = 0;

    public static final int REDUCE_REFERRER_GRANULARITY_ON_TRANSITION_CROSS_ORIGIN = CLEAR_REFERRER_ON_TRANSITION_FROM_SECURE_TO_INSECURE + 1;

    public static final int ORIGIN_ONLY_ON_TRANSITION_CROSS_ORIGIN = REDUCE_REFERRER_GRANULARITY_ON_TRANSITION_CROSS_ORIGIN + 1;

    public static final int NEVER_CLEAR_REFERRER = ORIGIN_ONLY_ON_TRANSITION_CROSS_ORIGIN + 1;

    public static final int ORIGIN = NEVER_CLEAR_REFERRER + 1;

    public static final int CLEAR_REFERRER_ON_TRANSITION_CROSS_ORIGIN = ORIGIN + 1;

    public static final int ORIGIN_CLEAR_ON_TRANSITION_FROM_SECURE_TO_INSECURE = CLEAR_REFERRER_ON_TRANSITION_CROSS_ORIGIN + 1;

    public static final int NO_REFERRER = ORIGIN_CLEAR_ON_TRANSITION_FROM_SECURE_TO_INSECURE + 1;

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (7);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private UrlRequestReferrerPolicy() {}

}