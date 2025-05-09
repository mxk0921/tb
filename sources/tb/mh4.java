package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(335544326);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44c55930", new Object[0])).booleanValue();
        }
        Boolean bool = Boolean.TRUE;
        return bool.toString().equals(OrangeConfig.getInstance().getConfig("AccessibilityTools", "ocrAllowBatch", bool.toString()));
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e81269fe", new Object[0])).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("AccessibilityTools", "ocrBatchDelayMilliSeconds", ""));
        } catch (Exception e) {
            Log.e("A11yAbility_ConfigUtils", "getOCRBatchDelayMilliSeconds exception " + e.getMessage());
            return 0L;
        }
    }
}
