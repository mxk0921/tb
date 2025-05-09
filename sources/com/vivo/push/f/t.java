package com.vivo.push.f;

import com.vivo.push.b.h;
import com.vivo.push.b.o;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.m;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.ag;
import com.vivo.push.util.u;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t extends aa {
    public t(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        o oVar = (o) vVar;
        m.a().a(new h(String.valueOf(oVar.f())));
        if (!ClientConfigManagerImpl.getInstance(this.f14645a).isEnablePush()) {
            u.d("OnMessageTask", "command  " + vVar + " is ignore by disable push ");
            a(1020);
        } else if (!m.a().g() || a(ag.c(this.f14645a), oVar.d(), oVar.g())) {
            UnvarnishedMessage e = oVar.e();
            if (e != null) {
                int targetType = e.getTargetType();
                long msgId = e.getMsgId();
                u.d("OnMessageTask", "tragetType is " + targetType + " ; messageId is " + msgId);
                ((aa) this).b.onTransmissionMessage(this.f14645a, e);
                a(0);
                return;
            }
            a(2807);
            u.a("OnMessageTask", " message is null");
        } else {
            a(1021);
        }
    }
}
