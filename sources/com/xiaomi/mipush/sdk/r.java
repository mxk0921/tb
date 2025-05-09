package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.eb;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r implements eb {

    /* renamed from: a  reason: collision with root package name */
    private Context f14739a;

    public r(Context context) {
        this.f14739a = context;
    }

    @Override // com.xiaomi.push.eb
    public String a() {
        return b.m452a(this.f14739a).d();
    }

    @Override // com.xiaomi.push.eb
    public void a(jb jbVar, ic icVar, ip ipVar) {
        ao.a(this.f14739a).a((ao) jbVar, icVar, ipVar);
    }
}
