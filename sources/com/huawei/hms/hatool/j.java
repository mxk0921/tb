package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.UUID;
import tb.lmo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j {
    private static j b;

    /* renamed from: a  reason: collision with root package name */
    private Context f5383a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends e0 {

        /* renamed from: a  reason: collision with root package name */
        String f5384a;
        String b;

        public a(String str, String str2) {
            this.f5384a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.f5384a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.f5384a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.f5384a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            int i;
            int i2 = 0;
            if (z.k(this.f5384a, this.b)) {
                i = 4;
            } else {
                i = 0;
            }
            if (z.e(this.f5384a, this.b)) {
                i2 = 2;
            }
            return i | i2 | (z.h(this.f5384a, this.b) ? 1 : 0);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return lmo.b(str);
        }
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            try {
                if (b == null) {
                    b = new j();
                }
                jVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public String b(String str, String str2) {
        return i0.b(this.f5383a, str, str2);
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.f5383a);
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!z.f(str, str2)) {
            return new Pair<>("", "");
        }
        String p = s.c().b().p();
        String q = s.c().b().q();
        if (!TextUtils.isEmpty(p) && !TextUtils.isEmpty(q)) {
            return new Pair<>(p, q);
        }
        Pair<String, String> e = x0.e(this.f5383a);
        s.c().b().k((String) e.first);
        s.c().b().l((String) e.second);
        return e;
    }

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }

    public String a(String str, String str2) {
        return i0.a(this.f5383a, str, str2);
    }

    public String a(boolean z) {
        if (!z) {
            return "";
        }
        String e = q0.e();
        if (TextUtils.isEmpty(e)) {
            e = d.a(this.f5383a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(e)) {
                e = UUID.randomUUID().toString().replace("-", "");
                d.b(this.f5383a, "global_v2", "uuid", e);
            }
            q0.h(e);
        }
        return e;
    }

    public void a(Context context) {
        if (this.f5383a == null) {
            this.f5383a = context;
        }
    }
}
