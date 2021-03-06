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

package com.nimbits.cloudplatform.server.transactions.entity.cache;

import com.nimbits.cloudplatform.client.enums.EntityType;
import com.nimbits.cloudplatform.client.model.entity.Entity;
import com.nimbits.cloudplatform.client.model.entity.EntityName;
import com.nimbits.cloudplatform.client.model.point.Point;
import com.nimbits.cloudplatform.client.model.user.User;

import java.util.List;
import java.util.Map;

/**
 * Created by benjamin on 10/14/13.
 */
public interface EntityCache {
    Map<String, Point> getActivePoints();

    void removeEntityFromCache(List<Entity> entities);

    List<Entity> getEntityByName(User user, EntityName name, Class<?> cls);

    void removeEntityNameFromCache(User user, EntityName name, String className);

    List<Entity> getEntityByTrigger(User user, Entity entity, Class<?> cls);

    List<Entity> getIdleEntities(User admin) throws Exception;

    List<Entity> getSubscriptionsToEntity(User user, Entity subscribedEntity);

    void addEntityToCache(User user, List<Entity> entities);

    List<Entity> getEntityFromCache(String key);

    Map<String, Entity> getEntityMap(User user, EntityType type, int limit);

    List<Entity> getChildren(User user, List<Entity> entity);

    List<Entity> addUpdateEntity(User user, List<Entity> sample, boolean clearRelatives);

    List<Entity> getEntities(User user);

    List<Entity> deleteEntity(User user, Entity entity, Class<?> cls) throws Exception;

    List<Entity> getEntityByKey(User user, String key, Class<?> cls);

    List<Entity> getEntityByUUID(User user, String uuid, Class<?> cls);

    Map<String, Entity> getSystemWideEntityMap(User user, EntityType type) throws Exception;
}
