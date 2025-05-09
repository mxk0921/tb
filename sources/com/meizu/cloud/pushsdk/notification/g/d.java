package com.meizu.cloud.pushsdk.notification.g;

import android.content.Context;
import android.content.res.AssetManager;
import com.meizu.cloud.pushinternal.DebugLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f5910a;
    private AssetManager b;

    private d(Context context) {
        b(context);
    }

    private void b(Context context) {
        this.b = context.getAssets();
    }

    public int a(Context context, String str, String str2) {
        DebugLogger.i("ResourceReader", "Get resource type " + str2 + " " + str);
        return context.getResources().getIdentifier(str, str2, context.getApplicationInfo().packageName);
    }

    public static d a(Context context) {
        if (f5910a == null) {
            f5910a = new d(context);
        }
        return f5910a;
    }
}
