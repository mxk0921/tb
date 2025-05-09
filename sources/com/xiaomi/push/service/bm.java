package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.xiaomi.push.aa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bm {

    /* renamed from: a  reason: collision with root package name */
    private static bm f15076a;

    /* renamed from: a  reason: collision with other field name */
    private int f1597a = 0;

    /* renamed from: a  reason: collision with other field name */
    private Context f1598a;

    private bm(Context context) {
        this.f1598a = context.getApplicationContext();
    }

    public int a() {
        int i = this.f1597a;
        if (i != 0) {
            return i;
        }
        try {
            this.f1597a = Settings.Global.getInt(this.f1598a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f1597a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Uri m1055a() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    public static bm a(Context context) {
        if (f15076a == null) {
            f15076a = new bm(context);
        }
        return f15076a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1056a() {
        String str = aa.f717a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains("miui");
    }
}
