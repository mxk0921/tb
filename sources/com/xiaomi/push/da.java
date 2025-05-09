package com.xiaomi.push;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class da implements gv, hd {

    /* renamed from: a  reason: collision with root package name */
    private Context f14817a;

    public da(Context context) {
        this.f14817a = context;
    }

    @Override // com.xiaomi.push.gv
    public void a(gf gfVar) {
        if (gfVar == null || gfVar.a() != 0 || !"PING".equals(gfVar.m718a())) {
            dk.a(this.f14817a);
        } else {
            dk.c(this.f14817a);
        }
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a */
    public void mo734a(hh hhVar) {
        dk.a(this.f14817a);
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo734a(hh hhVar) {
        return true;
    }
}
