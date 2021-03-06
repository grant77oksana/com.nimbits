/*
 * Copyright (c) 2013 Nimbits Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.  See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.cloudplatform.server.transactions.cache;

import com.nimbits.cloudplatform.client.enums.MemCacheKey;

/**
 * Created by benjamin on 10/9/13.
 */
public interface NimbitsCache {
    boolean containsKey(String key);

    void remove(String key);

    Object get(String key);

    void put(String key, Object object);

    void reloadCache();

    boolean confirmCached(String key);

    boolean contains(MemCacheKey key);

    Object get(MemCacheKey key);

    void delete(MemCacheKey hotPoints);

    void put(MemCacheKey key, Object newMap);

    boolean contains(String key);

    void delete(String key);



}
