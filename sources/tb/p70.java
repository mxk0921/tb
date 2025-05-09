package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097168);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c72d022", new Object[0])).longValue();
        }
        try {
            if (AccsClientConfig.getConfigByTag(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG) != null) {
                return ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).getServerTime();
            }
            return ACCSClient.getAccsClient().getServerTime();
        } catch (AccsException unused) {
            return 0L;
        }
    }
}
