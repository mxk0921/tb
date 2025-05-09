package com.vivo.push.restructure.a.a;

import com.vivo.push.restructure.a.a;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class j implements i<a> {

    /* renamed from: a  reason: collision with root package name */
    private a f14628a;
    private n b;
    private k c;
    private com.vivo.push.restructure.c.a d;

    public j(n nVar, k kVar, com.vivo.push.restructure.c.a aVar) {
        this.b = nVar;
        this.c = kVar;
        this.d = aVar;
    }

    @Override // com.vivo.push.restructure.a.a.i
    public final /* synthetic */ void a(a aVar, a aVar2, int i) {
        a aVar3 = aVar2;
        if (aVar3 == null) {
            u.a("onNodeError() receivedMsg is null ");
            return;
        }
        u.a("onNodeError() , msgID = " + aVar3.a() + ", nodeName = " + aVar.b());
        com.vivo.push.restructure.c.a aVar4 = this.d;
        if (aVar4 != null) {
            aVar4.a(i, aVar3.a());
        }
        a2(aVar3);
    }

    @Override // com.vivo.push.restructure.a.a.i
    public final /* bridge */ /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            u.a("onAllNodeExecuteComplete, receivedMsg is null");
        } else if (this.f14628a == null) {
            u.a("onAllNodeExecuteComplete, mFirstNode is null");
        } else {
            a2(aVar2);
        }
    }

    @Override // com.vivo.push.restructure.a.a.i
    public final void a(a aVar) {
        this.f14628a = aVar;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(a aVar) {
        if (aVar != null) {
            if (!aVar.e()) {
                u.a("core is not support monitor report");
                return;
            }
            u.a("reportNodeMonitorInfo() , isNeedCollectNodeMonitor: " + aVar.f());
            if (aVar.f()) {
                n nVar = this.b;
                if (nVar != null) {
                    nVar.a(aVar, this.f14628a);
                }
                k kVar = this.c;
                if (kVar != null) {
                    kVar.a(aVar, this.f14628a.c().toString());
                    u.a("reportNodeMonitorInfo() , report client NodeInfo！！！");
                    return;
                }
                u.a("onNodeError , mReporter is null， can not report");
            }
        }
    }
}
