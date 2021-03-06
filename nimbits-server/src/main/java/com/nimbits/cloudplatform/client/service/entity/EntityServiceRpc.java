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

package com.nimbits.cloudplatform.client.service.entity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.nimbits.cloudplatform.client.enums.EntityType;
import com.nimbits.cloudplatform.client.model.entity.Entity;
import com.nimbits.cloudplatform.client.model.entity.EntityName;
import com.nimbits.cloudplatform.client.model.user.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Benjamin Sautner
 * User: BSautner
 * Date: 2/7/12
 * Time: 12:02 PM
 */
@RemoteServiceRelativePath("entityService")
public interface EntityServiceRpc extends RemoteService {


    List<Entity> addUpdateEntityRpc(final List<Entity> entity) throws Exception;

    List<Entity> deleteEntityRpc(final List<Entity> entity) throws Exception;

    Map<String, Entity> getEntityMapRpc(final User user, final int type, final int limit) ;

    List<Entity> copyEntity(final Entity originalEntity, final EntityName newName);

    List<Entity> getEntityByKeyRpc(final User u, final String key, final EntityType type);

    List<Entity> getEntitiesRpc(User user) throws Exception;




    static class App {
        private static EntityServiceRpcAsync ourInstance = GWT.create(EntityServiceRpc.class);

        public static synchronized EntityServiceRpcAsync getInstance() {
            return ourInstance;
        }
    }

}
