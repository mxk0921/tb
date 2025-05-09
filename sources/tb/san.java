package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class san {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7919809c", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        tmc g = van.f().g();
        String c = g.c("abtest_" + str, "");
        if (trq.c(c)) {
            RSoLog.d("RSoABTest, isFeatureOn = [" + str + " = " + z + "], use default");
            return z;
        }
        boolean parseBoolean = Boolean.parseBoolean(c);
        RSoLog.d("RSoABTest, isFeatureOn = [" + str + " = " + parseBoolean + "], default = " + z);
        return parseBoolean;
    }
}
