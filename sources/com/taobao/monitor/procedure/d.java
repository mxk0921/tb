package com.taobao.monitor.procedure;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.c;
import tb.mdd;
import tb.ndd;
import tb.uxm;
import tb.wxm;
import tb.xxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d implements ndd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ndd
    public mdd a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("e3523269", new Object[]{this, str, cVar});
        }
        if (cVar == null) {
            cVar = new c.b().o(false).j(true).m(true).l(ProcedureGlobal.PROCEDURE_MANAGER.s()).h();
        }
        return new wxm(b(str, cVar));
    }

    public ProcedureImpl b(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureImpl) ipChange.ipc$dispatch("b004b3f0", new Object[]{this, str, cVar});
        }
        mdd b = cVar.b();
        if (b == mdd.DEFAULT) {
            b = ProcedureGlobal.PROCEDURE_MANAGER.s();
        }
        ProcedureImpl procedureImpl = new ProcedureImpl(str, b, cVar.a(), cVar.d(), cVar.e());
        if (cVar.g()) {
            procedureImpl.x(new uxm(cVar.c()));
        }
        if (cVar.f()) {
            procedureImpl.x(new xxm());
        }
        return procedureImpl;
    }
}
