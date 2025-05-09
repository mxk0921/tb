package com.alibaba.security.realidentity.service.camera.utils;

import android.content.SharedPreferences;
import com.alibaba.security.realidentity.g3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum FrontLightMode {
    ON,
    AUTO,
    OFF;

    public static FrontLightMode parse(String str) {
        if (str == null) {
            return OFF;
        }
        return valueOf(str);
    }

    public static FrontLightMode readPref(SharedPreferences sharedPreferences) {
        return parse(sharedPreferences.getString(g3.b, "OFF"));
    }
}
