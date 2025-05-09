package com.vivo.push.f;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.b.u;
import com.vivo.push.b.x;
import com.vivo.push.m;
import com.vivo.push.restructure.a;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.util.f;
import com.vivo.push.v;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ag extends aa {
    public ag(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        u uVar = (u) vVar;
        if (!m.a().g() || a(com.vivo.push.util.ag.c(this.f14645a), uVar.e(), uVar.g())) {
            boolean repealNotifyById = NotifyAdapterUtil.repealNotifyById(this.f14645a, uVar.d());
            com.vivo.push.util.u.d("OnUndoMsgTask", "undo message " + uVar.d() + ", " + repealNotifyById);
            if (repealNotifyById) {
                Context context = this.f14645a;
                com.vivo.push.util.u.b(context, "回收client通知成功, 上报埋点 1031, messageId = " + uVar.d());
                f.a(uVar.d(), 1031L);
                return;
            }
            com.vivo.push.util.u.d("OnUndoMsgTask", "undo message fail，messageId = " + uVar.d());
            Context context2 = this.f14645a;
            com.vivo.push.util.u.c(context2, "回收client通知失败，messageId = " + uVar.d());
            return;
        }
        com.vivo.push.util.u.d("OnUndoMsgTask", " vertify msg is error ");
        x xVar = new x(1021L);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("messageID", String.valueOf(uVar.f()));
        String a2 = a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("remoteAppId", a2);
        }
        xVar.a(hashMap);
        m.a().a(xVar);
    }
}
