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

package com.nimbits.mobile.settings;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Benjamin Sautner
 * Date: 12/29/12
 * Time: 3:49 PM
 */
public enum Settings {

    gps(Constants.GPS);

    private static final int CAPACITY = 10;
    private static final Map<String, Settings> lookup = new HashMap<String, Settings>(CAPACITY);

    static {
        for (Settings s : EnumSet.allOf(Settings.class))
            lookup.put(s.code, s);
    }

    private final String code;

    private Settings(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Settings get(String code) {
        return lookup.get(code);
    }

    private class Constants {
        protected final static String GPS = "USE_GPS";


    }
}
