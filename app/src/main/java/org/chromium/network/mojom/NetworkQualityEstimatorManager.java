
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_quality_estimator_manager.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface NetworkQualityEstimatorManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NetworkQualityEstimatorManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkQualityEstimatorManager, NetworkQualityEstimatorManager.Proxy> MANAGER = NetworkQualityEstimatorManager_Internal.MANAGER;


    void requestNotifications(
NetworkQualityEstimatorManagerClient clientPtr);


}
