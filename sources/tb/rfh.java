package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class rfh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int D = 2;
    public static final int E = 16;
    public static final int I = 4;
    public static final int N = 32;
    public static final int V = 1;
    public static final int W = 8;

    public static int a(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f8cb565", new Object[]{new Integer(i), str, str2, th})).intValue();
        }
        try {
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (i == 1) {
            AdapterForTLog.logv(str, str2);
            return 0;
        } else if (i == 2) {
            AdapterForTLog.logd(str, str2);
            return 0;
        } else if (i == 4) {
            AdapterForTLog.logi(str, str2);
            return 0;
        } else if (i != 8) {
            if (i == 16) {
                AdapterForTLog.loge(str, str2, th);
                return 0;
            }
            return 0;
        } else {
            AdapterForTLog.logw(str, str2, th);
            return 0;
        }
    }
}
