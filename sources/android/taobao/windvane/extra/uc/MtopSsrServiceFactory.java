package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.nnf;
import tb.t2o;
import tb.vpw;
import tb.zeq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopSsrServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856071);
    }

    public static nnf createSsrService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnf) ipChange.ipc$dispatch("de5680df", new Object[0]);
        }
        if (vpw.commonConfig.P1) {
            return new FirstTruckCacheSSRService();
        }
        return zeq.a();
    }
}
