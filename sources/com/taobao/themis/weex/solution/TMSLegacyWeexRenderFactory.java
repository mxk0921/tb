package com.taobao.themis.weex.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.weex.runtime.TMSWeexRender;
import java.io.Serializable;
import tb.bbs;
import tb.e9s;
import tb.ocs;
import tb.qcs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSLegacyWeexRenderFactory extends e9s implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(851443744);
    }

    public TMSLegacyWeexRenderFactory(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ Object ipc$super(TMSLegacyWeexRenderFactory tMSLegacyWeexRenderFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/weex/solution/TMSLegacyWeexRenderFactory");
    }

    @Override // tb.twd
    public qcs createRender(ITMSPage iTMSPage, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qcs) ipChange.ipc$dispatch("2e8fbe8e", new Object[]{this, iTMSPage, ocsVar});
        }
        return new TMSWeexRender(iTMSPage, ocsVar);
    }
}
