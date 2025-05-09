package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.iy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static a f15039a;

    /* renamed from: a  reason: collision with other field name */
    private static b f1545a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        Map<String, String> a(Context context, iy iyVar);

        /* renamed from: a  reason: collision with other method in class */
        void m1012a(Context context, iy iyVar);

        boolean a(Context context, iy iyVar, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface b {
        void a(iy iyVar);

        void a(String str);

        /* renamed from: a  reason: collision with other method in class */
        boolean m1013a(iy iyVar);
    }

    public static Map<String, String> a(Context context, iy iyVar) {
        a aVar = f15039a;
        if (aVar != null && iyVar != null) {
            return aVar.a(context, iyVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("pepa listener or container is null");
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1010a(Context context, iy iyVar) {
        a aVar = f15039a;
        if (aVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m410a("handle msg wrong");
        } else {
            aVar.m1012a(context, iyVar);
        }
    }

    public static void a(iy iyVar) {
        b bVar = f1545a;
        if (bVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m410a("pepa clearMessage is null");
        } else {
            bVar.a(iyVar);
        }
    }

    public static void a(String str) {
        b bVar = f1545a;
        if (bVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.b.m410a("pepa clearMessage is null");
        } else {
            bVar.a(str);
        }
    }

    public static boolean a(Context context, iy iyVar, boolean z) {
        a aVar = f15039a;
        if (aVar != null && iyVar != null) {
            return aVar.a(context, iyVar, z);
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("pepa judement listener or container is null");
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1011a(iy iyVar) {
        b bVar = f1545a;
        if (bVar != null && iyVar != null) {
            return bVar.m1013a(iyVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("pepa handleReceiveMessage is null");
        return false;
    }
}
