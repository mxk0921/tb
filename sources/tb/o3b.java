package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539775);
    }

    public static Context a(cfc cfcVar) {
        IHostService iHostService;
        u5d j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("40696327", new Object[]{cfcVar});
        }
        if (cfcVar == null || (iHostService = (IHostService) cfcVar.a(IHostService.class)) == null || (j = iHostService.getInvokeCallback().j()) == null) {
            return null;
        }
        return j.f();
    }
}
