package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.d;
import com.vivo.push.model.UnvarnishedMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o extends v {

    /* renamed from: a  reason: collision with root package name */
    protected UnvarnishedMessage f14567a;

    public o() {
        super(3);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("msg_v1", this.f14567a.unpackToJson());
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        String a2 = dVar.a("msg_v1");
        if (!TextUtils.isEmpty(a2)) {
            UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(a2);
            this.f14567a = unvarnishedMessage;
            unvarnishedMessage.setMsgId(f());
        }
    }

    public final UnvarnishedMessage e() {
        return this.f14567a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnMessageCommand";
    }

    public final String d() {
        UnvarnishedMessage unvarnishedMessage = this.f14567a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }
}
