package com.xiaomi.push;

import com.xiaomi.push.ak;
import com.xiaomi.push.du;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dw extends ak.b {

    /* renamed from: a  reason: collision with root package name */
    ak.b f14841a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ du f873a;

    public dw(du duVar) {
        this.f873a = duVar;
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo598b() {
        du.b bVar = (du.b) this.f873a.f861a.peek();
        if (bVar != null && bVar.a()) {
            if (this.f873a.f861a.remove(bVar)) {
                this.f14841a = bVar;
            }
            ak.b bVar2 = this.f14841a;
            if (bVar2 != null) {
                bVar2.mo598b();
            }
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: c */
    public void mo599c() {
        ak.b bVar = this.f14841a;
        if (bVar != null) {
            bVar.mo599c();
        }
    }
}
