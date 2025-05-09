package com.huawei.hms.framework.common;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ContextHolder {
    private static final String TAG = "ContextHolder";
    private static Context sAppContext;
    private static Context sKitContext;

    public static Context getAppContext() {
        return sAppContext;
    }

    public static Context getKitContext() {
        return sKitContext;
    }

    public static Context getResourceContext() {
        if (getKitContext() != null) {
            return getKitContext();
        }
        return getAppContext();
    }

    public static void setAppContext(Context context) {
        if (sAppContext == null) {
            CheckParamUtils.checkNotNull(context, "sAppContext == null");
            sAppContext = context.getApplicationContext();
        }
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        sKitContext = context;
    }
}
