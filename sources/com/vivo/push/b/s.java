package com.vivo.push.b;

import com.vivo.push.d;
import com.vivo.push.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s extends v {

    /* renamed from: a  reason: collision with root package name */
    private String f14570a = null;
    private int b = 0;

    public s(int i) {
        super(i);
    }

    @Override // com.vivo.push.v
    public void c(d dVar) {
        dVar.a("req_id", this.f14570a);
        dVar.a("status_msg_code", this.b);
    }

    @Override // com.vivo.push.v
    public void d(d dVar) {
        this.f14570a = dVar.a("req_id");
        this.b = dVar.b("status_msg_code", this.b);
    }

    public final String h() {
        return this.f14570a;
    }

    public final int i() {
        return this.b;
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "OnReceiveCommand";
    }
}
