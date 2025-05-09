package com.huawei.hms.hatool;

import tb.ce8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m1 {
    private static m1 b = new m1();

    /* renamed from: a  reason: collision with root package name */
    private a f5393a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f5394a;
        String b;
        long c = 0;

        public a() {
        }

        public void a(long j) {
            m1.this.f5393a.c = j;
        }

        public void b(String str) {
            m1.this.f5393a.f5394a = str;
        }

        public void a(String str) {
            m1.this.f5393a.b = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public long b() {
        return this.f5393a.c;
    }

    public String c() {
        return this.f5393a.f5394a;
    }

    public String a() {
        return this.f5393a.b;
    }

    public void a(String str, String str2) {
        long b2 = b();
        String c = w0.c(str, str2);
        if (c == null || c.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b2 == 0) {
            b2 = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - b2 <= 43200000) {
            return;
        }
        String d = ce8.d(16);
        String a2 = h0.a(c, d);
        this.f5393a.a(b2);
        this.f5393a.b(d);
        this.f5393a.a(a2);
    }
}
