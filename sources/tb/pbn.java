package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class pbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c2f5e0e", new Object[]{str, new Long(j), new Long(j2)})).longValue();
        }
        RSoLog.d("TaobaoStorageCleaner-clean, path = " + str + ", targetSize=" + j + ", realSize=" + j2);
        return 0L;
    }
}
