/**
 * Copyright (C) 2016 The CyanogenMod Project
 *               2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.touch.gestures;

class TouchscreenGestureConstants {
    // Broadcast action for settings update
    static final String UPDATE_PREFS_ACTION = "com.android.touch.gestures.UPDATE_SETTINGS";
    // Broadcast extra: keycode mapping (int[]: key = gesture ID, value = keycode)
    static final String UPDATE_EXTRA_KEYCODE_MAPPING = "keycode_mappings";
    // Broadcast extra: assigned actions (int[]: key = gesture ID, value = action)
    static final String UPDATE_EXTRA_ACTION_MAPPING = "action_mappings";

    // Touchscreen gesture actions
    static final int ACTION_FLASHLIGHT = 1;
    static final int ACTION_CAMERA = 2;
    static final int ACTION_BROWSER = 3;
    static final int ACTION_DIALER = 4;
    static final int ACTION_EMAIL = 5;
    static final int ACTION_MESSAGES = 6;
    static final int ACTION_PLAY_PAUSE_MUSIC = 7;
    static final int ACTION_PREVIOUS_TRACK = 8;
    static final int ACTION_NEXT_TRACK = 9;
    static final int ACTION_VOLUME_DOWN = 10;
    static final int ACTION_VOLUME_UP = 11;
    static final int ACTION_AMBIENT_DISPLAY = 12;
    static final int ACTION_WAKE_DEVICE = 13;
    static final int ACTION_WECHAT_PAY = 14;
    static final int ACTION_ALIPAY_PAY = 15;
    static final int ACTION_WECHAT_SCAN = 16;
    static final int ACTION_ALIPAY_SCAN = 17;
    static final int ACTION_ALIPAY_TRIP = 18;
    static final int ACTION_WALLET_TRIP = 19;
    static final int ACTION_GPAY = 20;
    static final int ACTION_PAYTM = 21;
    static final int ACTION_PAYTM_SCAN_PAY = 22;
    static final int ACTION_PAYTM_QR_CODE = 23;
    static final int ACTION_PHONEPE = 24;
    static final int ACTION_GOOGLE_MAPS = 25;
    static final int ACTION_GOOGLE_SEARCH = 26;
}
