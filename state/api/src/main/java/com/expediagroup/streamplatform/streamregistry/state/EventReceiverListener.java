/**
 * Copyright (C) 2018-2020 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.expediagroup.streamplatform.streamregistry.state;

import com.expediagroup.streamplatform.streamregistry.state.model.Entity;
import com.expediagroup.streamplatform.streamregistry.state.model.event.Event;
import com.expediagroup.streamplatform.streamregistry.state.model.specification.Specification;

/**
 * A listener that is invoked for each event received by the {@link EventReceiver}.
 */
public interface EventReceiverListener {
  /**
   * Method invoked upon receiving an {@link Event} by the {@link EventReceiver}.
   *
   * @param event the event.
   * @param <K>   the key type.
   * @param <S>   the specification type.
   */
  <K extends Entity.Key<S>, S extends Specification> void onEvent(Event<K, S> event);
}
