package com.meizu.cloud.pushsdk.handler.e.h;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private long f5889a;
    private int b;
    private List<String> c;
    private List<String> d;
    private List<a> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f5890a;
        private String b;

        public a(String str, String str2) {
            this.f5890a = str;
            this.b = str2;
        }

        public String a() {
            return this.f5890a;
        }

        public String b() {
            return this.b;
        }

        public String toString() {
            return "ShieldConfig{mModel=" + this.f5890a + "mOs=" + this.b + '}';
        }
    }

    public List<a> a() {
        return this.e;
    }

    public List<String> b() {
        return this.d;
    }

    public List<String> c() {
        return this.c;
    }

    public boolean d() {
        int i;
        long j = this.f5889a;
        if (j == 0 || (i = this.b) == 0 || j + (i * 3600000) <= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "PushConfigInfo{mRequestTime=" + this.f5889a + "mIntervalHour=" + this.b + "mShieldPackageList=" + this.d + "mWhitePackageList=" + this.c + "mShieldConfigList=" + this.e + '}';
    }

    public void a(int i) {
        this.b = i;
    }

    public void b(String str) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(str);
    }

    public void a(long j) {
        this.f5889a = j;
    }

    public void a(a aVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(aVar);
    }

    public void a(String str) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(str);
    }
}
