
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

public final class DataElementType {


    public static final int UNKNOWN = (int) (-1L);

    public static final int DATA_PIPE = UNKNOWN + 1;

    public static final int CHUNKED_DATA_PIPE = DATA_PIPE + 1;

    public static final int RAW_FILE = CHUNKED_DATA_PIPE + 1;

    public static final int BLOB = RAW_FILE + 1;

    public static final int FILE = BLOB + 1;

    public static final int BYTES = FILE + 1;

    public static final int MIN_VALUE = (int) (-1);
    public static final int MAX_VALUE = (int) (5);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private DataElementType() {}

}