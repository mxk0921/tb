package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static z0 f5366a;

    private static synchronized z0 a() {
        z0 z0Var;
        synchronized (a.class) {
            try {
                if (f5366a == null) {
                    f5366a = q.c().b();
                }
                z0Var = f5366a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z0Var;
    }

    public static void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() != null && q1.b().a()) {
            if (i == 1 || i == 0) {
                f5366a.b(i, str, linkedHashMap);
                return;
            }
            v.d("hmsSdk", "Data type no longer collects range.type: " + i);
        }
    }

    public static void c() {
        if (a() != null && q1.b().a()) {
            f5366a.a(-1);
        }
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() != null && q1.b().a()) {
            if (i == 1 || i == 0) {
                f5366a.a(i, str, linkedHashMap);
                return;
            }
            v.d("hmsSdk", "Data type no longer collects range.type: " + i);
        }
    }

    public static boolean b() {
        return q.c().a();
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f5366a.a(context, str, str2);
        }
    }
}
