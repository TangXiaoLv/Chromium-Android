
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../device/gamepad/gamepad_standard_mappings.h

package org.chromium.device.gamepad;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    CanonicalButtonIndex.PRIMARY, CanonicalButtonIndex.SECONDARY, CanonicalButtonIndex.TERTIARY,
    CanonicalButtonIndex.QUATERNARY, CanonicalButtonIndex.LEFT_SHOULDER,
    CanonicalButtonIndex.RIGHT_SHOULDER, CanonicalButtonIndex.LEFT_TRIGGER,
    CanonicalButtonIndex.RIGHT_TRIGGER, CanonicalButtonIndex.BACK_SELECT,
    CanonicalButtonIndex.START, CanonicalButtonIndex.LEFT_THUMBSTICK,
    CanonicalButtonIndex.RIGHT_THUMBSTICK, CanonicalButtonIndex.DPAD_UP,
    CanonicalButtonIndex.DPAD_DOWN, CanonicalButtonIndex.DPAD_LEFT, CanonicalButtonIndex.DPAD_RIGHT,
    CanonicalButtonIndex.META, CanonicalButtonIndex.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface CanonicalButtonIndex {
  int PRIMARY = 0;
  int SECONDARY = 1;
  int TERTIARY = 2;
  int QUATERNARY = 3;
  int LEFT_SHOULDER = 4;
  int RIGHT_SHOULDER = 5;
  int LEFT_TRIGGER = 6;
  int RIGHT_TRIGGER = 7;
  int BACK_SELECT = 8;
  int START = 9;
  int LEFT_THUMBSTICK = 10;
  int RIGHT_THUMBSTICK = 11;
  int DPAD_UP = 12;
  int DPAD_DOWN = 13;
  int DPAD_LEFT = 14;
  int DPAD_RIGHT = 15;
  int META = 16;
  int COUNT = 17;
}
