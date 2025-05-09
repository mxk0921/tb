package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ax implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ax f14766a;

    /* renamed from: a  reason: collision with other field name */
    private int f751a = aw.f14765a;

    /* renamed from: a  reason: collision with other field name */
    private ar f752a;

    private ax(Context context) {
        this.f752a = aw.a(context);
        b.m410a("create id manager is: " + this.f751a);
    }

    public static ax a(Context context) {
        if (f14766a == null) {
            synchronized (ax.class) {
                try {
                    if (f14766a == null) {
                        f14766a = new ax(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14766a;
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo506a() {
        return a(this.f752a.mo506a());
    }

    private String a(String str) {
        return str == null ? "" : str;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public void mo506a() {
    }

    public void a(Map<String, String> map) {
        if (map != null) {
            String b = b();
            if (!TextUtils.isEmpty(b)) {
                map.put("udid", b);
            }
            String a2 = mo506a();
            if (!TextUtils.isEmpty(a2)) {
                map.put("oaid", a2);
            }
            String c = c();
            if (!TextUtils.isEmpty(c)) {
                map.put("vaid", c);
            }
            String d = d();
            if (!TextUtils.isEmpty(d)) {
                map.put("aaid", d);
            }
            map.put("oaid_type", String.valueOf(this.f751a));
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public boolean mo506a() {
        return this.f752a.a();
    }
}
