package com.huawei.hms.hatool;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l1 {

    /* renamed from: a  reason: collision with root package name */
    private s0 f5390a;
    private s0 b;
    private s0 c;
    private s0 d;

    public l1(String str) {
    }

    public s0 a() {
        return this.c;
    }

    public s0 b() {
        return this.f5390a;
    }

    public s0 c() {
        return this.b;
    }

    public s0 d() {
        return this.d;
    }

    public s0 a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        v.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: ".concat(str));
        return null;
    }

    public void b(s0 s0Var) {
        this.b = s0Var;
    }

    public void a(s0 s0Var) {
        this.f5390a = s0Var;
    }
}
