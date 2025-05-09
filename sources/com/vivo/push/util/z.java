package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class z extends c {
    private Context b;

    public z(Context context) {
        if (context != null) {
            this.b = context;
            a(context);
        }
    }

    private synchronized void a(Context context) {
        a(context, "com.vivo.push_preferences.appconfig_v1");
    }

    public final String b() {
        String str;
        Context context = this.b;
        String packageName = context.getPackageName();
        Object a2 = ag.a(context, packageName, "com.vivo.push.app_id");
        if (a2 != null) {
            str = a2.toString();
        } else {
            Object a3 = ag.a(context, packageName, "app_id");
            if (a3 != null) {
                str = a3.toString();
            } else {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return b("APP_APPID", "");
        }
        return str;
    }

    public final String c() {
        String str;
        Context context = this.b;
        String packageName = context.getPackageName();
        Object a2 = ag.a(context, packageName, "com.vivo.push.api_key");
        if (a2 != null) {
            str = a2.toString();
        } else {
            Object a3 = ag.a(context, packageName, "api_key");
            if (a3 != null) {
                str = a3.toString();
            } else {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return b("APP_APIKEY", "");
        }
        return str;
    }
}
