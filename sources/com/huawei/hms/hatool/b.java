package com.huawei.hms.hatool;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    s0 f5368a;
    s0 b;
    Context c;
    String d;

    public b(Context context) {
        if (context != null) {
            this.c = context.getApplicationContext();
        }
        this.f5368a = new s0();
        this.b = new s0();
    }

    public b a(int i, String str) {
        s0 s0Var;
        v.c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
        if (!p1.b(str)) {
            str = "";
        }
        if (i == 0) {
            s0Var = this.f5368a;
        } else if (i != 1) {
            v.f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        } else {
            s0Var = this.b;
        }
        s0Var.b(str);
        return this;
    }

    @Deprecated
    public b b(boolean z) {
        v.c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f5368a.j().b(z);
        this.b.j().b(z);
        return this;
    }

    @Deprecated
    public b c(boolean z) {
        v.c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f5368a.j().c(z);
        this.b.j().c(z);
        return this;
    }

    public b a(String str) {
        v.c("hmsSdk", "Builder.setAppID is execute");
        this.d = str;
        return this;
    }

    @Deprecated
    public b a(boolean z) {
        v.c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f5368a.j().a(z);
        this.b.j().a(z);
        return this;
    }

    public void a() {
        if (this.c == null) {
            v.b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        v.c("hmsSdk", "Builder.create() is execute.");
        z0 z0Var = new z0("_hms_config_tag");
        z0Var.b(new s0(this.f5368a));
        z0Var.a(new s0(this.b));
        m.a().a(this.c);
        g0.a().a(this.c);
        q.c().a(z0Var);
        m.a().a(this.d);
    }
}
