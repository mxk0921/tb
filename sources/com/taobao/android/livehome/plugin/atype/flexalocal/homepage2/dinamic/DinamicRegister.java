package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.dinamic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2;
import java.io.Serializable;
import tb.bg6;
import tb.e26;
import tb.hir;
import tb.mg6;
import tb.mht;
import tb.rh6;
import tb.t2o;
import tb.wr5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DinamicRegister implements DinamicSdkManager2.IDinamicRegister, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378650);
        t2o.a(310378614);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.IDinamicRegister
    public void onRegister(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af908da", new Object[]{this, dinamicXEngine});
        } else if (dinamicXEngine != null) {
            dinamicXEngine.W0(e26.DX_EVENT_LOPENCHANNEL, new e26());
            dinamicXEngine.W0(mg6.DX_EVENT_TBLCARDDATAEXPO, new mg6());
            dinamicXEngine.W0(rh6.DX_EVENT_TBLVNATIVECALLCHAIN, new rh6());
            dinamicXEngine.e1(bg6.DXTAOLIVEJELLYMARQUEE_TAOLIVEJELLYMARQUEE, new bg6.b());
            dinamicXEngine.J0(mht.TBLMTOP, new mht.a());
            dinamicXEngine.V0(wr5.DX_PARSER_TBLGETEXPOSE, new wr5());
            dinamicXEngine.J0(hir.TBLSTABLETRACKER, new hir.a());
            dinamicXEngine.M0("TBLStableTracker", new hir.a());
        }
    }
}
