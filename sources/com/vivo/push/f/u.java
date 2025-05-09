package com.vivo.push.f;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.b.h;
import com.vivo.push.b.q;
import com.vivo.push.b.x;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.m;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.t;
import com.vivo.push.util.aa;
import com.vivo.push.util.ag;
import com.vivo.push.util.f;
import com.vivo.push.v;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u extends aa {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b();
    }

    public u(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        if (vVar == null) {
            com.vivo.push.util.u.a("OnNotificationArrivedTask", "command is null");
            return;
        }
        boolean isEnablePush = ClientConfigManagerImpl.getInstance(this.f14645a).isEnablePush();
        q qVar = (q) vVar;
        Context context = this.f14645a;
        if (!aa.d(context, context.getPackageName())) {
            x xVar = new x(2101L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("messageID", String.valueOf(qVar.f()));
            String a2 = com.vivo.push.restructure.a.a().e().a();
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("remoteAppId", a2);
            }
            xVar.a(hashMap);
            m.a().a(xVar);
            return;
        }
        m.a().a(new h(String.valueOf(qVar.f())));
        com.vivo.push.util.u.d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f14645a.getPackageName() + " isEnablePush :" + isEnablePush);
        if (!isEnablePush) {
            x xVar2 = new x(1020L);
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("messageID", String.valueOf(qVar.f()));
            String a3 = com.vivo.push.restructure.a.a().e().a();
            if (!TextUtils.isEmpty(a3)) {
                hashMap2.put("remoteAppId", a3);
            }
            xVar2.a(hashMap2);
            m.a().a(xVar2);
        } else if (!m.a().g() || a(ag.c(this.f14645a), qVar.e(), qVar.g())) {
            InsideNotificationItem d = qVar.d();
            if (d != null) {
                int targetType = d.getTargetType();
                String tragetContent = d.getTragetContent();
                com.vivo.push.util.u.d("OnNotificationArrivedTask", "tragetType is " + targetType + " ; target is " + tragetContent);
                t.c(new v(this, d, qVar));
                return;
            }
            com.vivo.push.util.u.a("OnNotificationArrivedTask", "notify is null");
            Context context2 = this.f14645a;
            com.vivo.push.util.u.c(context2, "通知内容为空，" + qVar.f());
            f.a(qVar.f(), 1027L);
        } else {
            x xVar3 = new x(1021L);
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put("messageID", String.valueOf(qVar.f()));
            String a4 = com.vivo.push.restructure.a.a().e().a();
            if (!TextUtils.isEmpty(a4)) {
                hashMap3.put("remoteAppId", a4);
            }
            xVar3.a(hashMap3);
            m.a().a(xVar3);
        }
    }
}
