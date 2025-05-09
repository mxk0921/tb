package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237719);
    }

    public static boolean a() {
        EnvModeEnum envModeEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0d00bb", new Object[0])).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance(null).getMtopConfig();
        if (mtopConfig == null || (envModeEnum = mtopConfig.envMode) == null || envModeEnum != EnvModeEnum.ONLINE) {
            return false;
        }
        return true;
    }
}
