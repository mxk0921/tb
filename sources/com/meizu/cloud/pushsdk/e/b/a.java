package com.meizu.cloud.pushsdk.e.b;

import com.meizu.cloud.pushinternal.DebugLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5803a = false;
    private static String b = "AndroidNetworking";

    public static void a() {
        f5803a = true;
    }

    public static void b(String str) {
        if (f5803a) {
            DebugLogger.i(b, str);
        }
    }

    public static void a(String str) {
        if (f5803a) {
            DebugLogger.d(b, str);
        }
    }
}
