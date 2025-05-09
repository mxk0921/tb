package com.xiaomi.mipush.sdk;

import com.xiaomi.push.ih;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<e, a> f14733a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14734a;
        public String b;

        public a(String str, String str2) {
            this.f14734a = str;
            this.b = str2;
        }
    }

    static {
        a(e.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static au a(e eVar) {
        int i = m.f14735a[eVar.ordinal()];
        if (i == 1) {
            return au.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return au.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return au.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return au.UPLOAD_FTOS_TOKEN;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static a m477a(e eVar) {
        return f14733a.get(eVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static ih m478a(e eVar) {
        return ih.AggregatePushSwitch;
    }

    private static void a(e eVar, a aVar) {
        if (aVar != null) {
            f14733a.put(eVar, aVar);
        }
    }
}
