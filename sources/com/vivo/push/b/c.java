package com.vivo.push.b;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.d;
import com.vivo.push.util.aa;
import com.vivo.push.util.u;
import com.vivo.push.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c extends v {
    private String b;
    private int e;
    private String f;
    private String g;
    private String h;
    private long c = -1;
    private int d = -1;

    /* renamed from: a  reason: collision with root package name */
    private String f14558a = null;

    public c(int i, String str) {
        super(i);
        this.b = str;
    }

    public final int a(Context context) {
        if (this.d == -1) {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                u.a("BaseAppCommand", "pkg name is null");
                str = a();
                if (TextUtils.isEmpty(str)) {
                    u.a("BaseAppCommand", "src is null");
                    return -1;
                }
            }
            this.d = aa.b(context, str);
            if (!TextUtils.isEmpty(this.f)) {
                this.d = 2;
            }
        }
        return this.d;
    }

    public final void b(int i) {
        this.e = i;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final int d() {
        return this.e;
    }

    public final void e() {
        this.f = null;
    }

    public final String f() {
        return this.f14558a;
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "BaseAppCommand";
    }

    public final void b(String str) {
        this.f14558a = str;
    }

    @Override // com.vivo.push.v
    public void c(d dVar) {
        dVar.a("req_id", this.f14558a);
        dVar.a("package_name", this.b);
        dVar.a("sdk_version", 341L);
        dVar.a("PUSH_APP_STATUS", this.d);
        if (!TextUtils.isEmpty(this.f)) {
            dVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f);
        }
        dVar.a("BaseAppCommand.EXTRA_APPID", this.h);
        dVar.a("BaseAppCommand.EXTRA_APPKEY", this.g);
    }

    public final void d(String str) {
        this.g = str;
    }

    @Override // com.vivo.push.v
    public void d(d dVar) {
        this.f14558a = dVar.a("req_id");
        this.b = dVar.a("package_name");
        this.c = dVar.b("sdk_version", 0L);
        this.d = dVar.b("PUSH_APP_STATUS", 0);
        this.f = dVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
        this.h = dVar.a("BaseAppCommand.EXTRA_APPID");
        this.g = dVar.a("BaseAppCommand.EXTRA_APPKEY");
    }
}
