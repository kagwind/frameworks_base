/*
 * Copyright (C) 2014 SlimRoms Project
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

package com.android.internal.util.slim;

import android.content.Context;
import android.os.UserHandle;
import android.provider.Settings;

public class VKeyHelper {

    // These need to match the documentation/constant in
    // core/res/res/values/config.xml
    static final int LONG_PRESS_HOME_NOTHING = 0;
    static final int LONG_PRESS_HOME_RECENT_SYSTEM_UI = 1;
    static final int LONG_PRESS_HOME_ASSIST = 2;

    static final int DOUBLE_TAP_HOME_NOTHING = 0;
    static final int DOUBLE_TAP_HOME_RECENT_SYSTEM_UI = 1;


    public static String getDoubleTapOnHomeBehavior(Context context, boolean getDefault) {
        String defaultValue;
        int doubleTapOnHome = context.getResources().getInteger(
                com.android.internal.R.integer.config_doubleTapOnHomeBehavior);
        if (doubleTapOnHome == DOUBLE_TAP_HOME_RECENT_SYSTEM_UI) {
            defaultValue = ActionConstants.ACTION_RECENTS;
        } else {
            defaultValue = ActionConstants.ACTION_NULL;
        }
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_HOME_DOUBLE_TAP_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getLongPressOnBackBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_NULL;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_BACK_LONG_PRESS_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getPressOnAssistBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_SEARCH;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_ASSIST_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getLongPressOnAssistBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_VOICE_SEARCH;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_ASSIST_LONG_PRESS_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getDoubleTapOnAssistBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_NULL;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_ASSIST_DOUBLE_TAP_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getLongPressOnAppSwitchBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_NULL;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_APP_SWITCH_LONG_PRESS_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getDoubleTapOnAppSwitchBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_NULL;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_APP_SWITCH_DOUBLE_TAP_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getPressOnCameraBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_CAMERA;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_CAMERA_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getLongPressOnCameraBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_NULL;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_CAMERA_LONG_PRESS_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }

    public static String getDoubleTapOnCameraBehavior(Context context, boolean getDefault) {
        String defaultValue = ActionConstants.ACTION_NULL;
        if (getDefault) {
            return defaultValue;
        }
        String value = Settings.System.getStringForUser(
                context.getContentResolver(),
                Settings.System.VKEY_CAMERA_DOUBLE_TAP_ACTION,
                UserHandle.USER_CURRENT);
        return value == null ? defaultValue : value;
    }
}
