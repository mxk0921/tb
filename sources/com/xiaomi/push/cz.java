package com.xiaomi.push;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cz implements gv, hd {

    /* renamed from: a  reason: collision with root package name */
    private Context f14816a;

    public cz(Context context) {
        this.f14816a = context;
    }

    @Override // com.xiaomi.push.gv
    public void a(gf gfVar) {
        if (gfVar == null || gfVar.a() != 0 || !"PING".equals(gfVar.m718a())) {
            dk.b(this.f14816a);
        } else {
            dk.d(this.f14816a);
        }
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a */
    public void mo734a(hh hhVar) {
        dk.b(this.f14816a);
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo734a(hh hhVar) {
        return true;
    }
}
