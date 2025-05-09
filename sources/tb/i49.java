package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(377487398);
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eec2bef3", new Object[]{str, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("flexa", str, null);
        if (config == null) {
            return j;
        }
        try {
            return Long.parseLong(config);
        } catch (Exception unused) {
            return j;
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87eafed8", new Object[0])).longValue();
        }
        return a("remote_download_timeout", 25000L);
    }
}
