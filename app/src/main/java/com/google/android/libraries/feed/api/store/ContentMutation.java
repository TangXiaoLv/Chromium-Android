// Copyright 2018 The Feed Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.libraries.feed.api.store;

import com.google.android.libraries.feed.host.storage.CommitResult;
import com.google.search.now.feed.client.StreamDataProto.StreamPayload;

/**
 * Mutation for adding and updating Content in the Feed Store. Remove will be handled by a task
 * which garbage collects the content that is not longer defined in any sessions.
 */
public interface ContentMutation {

  /** Add a new Mutation to the Store */
  ContentMutation add(String contentId, StreamPayload payload);

  /** Commit the mutations to the backing store */
  CommitResult commit();
}
