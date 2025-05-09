package com.vivo.push.b;

import com.vivo.push.d;
import com.vivo.push.v;
import tb.vox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class y extends v {

    /* renamed from: a  reason: collision with root package name */
    private String f14576a;

    public y(String str) {
        super(vox.CLASS_2008);
        this.f14576a = str;
    }

    @Override // com.vivo.push.v
    public final void c(d dVar) {
        dVar.a("package_name", this.f14576a);
    }

    @Override // com.vivo.push.v
    public final void d(d dVar) {
        this.f14576a = dVar.a("package_name");
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "StopServiceCommand";
    }

    public y() {
        super(vox.CLASS_2008);
    }
}
