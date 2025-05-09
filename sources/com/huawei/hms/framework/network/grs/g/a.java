package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.e.c;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected d f5344a;
    private final String b;
    private final c c;
    private final int d;
    private final Context e;
    private final String f;
    private final GrsBaseInfo g;
    private final c h;

    public a(String str, int i, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, c cVar2) {
        this.b = str;
        this.c = cVar;
        this.d = i;
        this.e = context;
        this.f = str2;
        this.g = grsBaseInfo;
        this.h = cVar2;
    }

    public Context a() {
        return this.e;
    }

    public c b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public c f() {
        return this.h;
    }

    public Callable<d> g() {
        return new f(this.b, this.d, this.c, this.e, this.f, this.g, this.h);
    }
}
