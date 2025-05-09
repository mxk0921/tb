package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.gr;
import com.xiaomi.push.gu;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cq extends gr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(XMPushService xMPushService, Map map, int i, String str, gu guVar) {
        super(map, i, str, guVar);
        this.f15106a = xMPushService;
    }

    @Override // com.xiaomi.push.gr
    /* renamed from: a */
    public byte[] mo744a() {
        try {
            em.b bVar = new em.b();
            bVar.a(bw.a().m1063a());
            return bVar.m601a();
        } catch (Exception e) {
            b.m410a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
