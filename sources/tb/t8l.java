package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPACE_NAME = "open_cart";

    public static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb42c733", new Object[0])).floatValue();
        }
        try {
            return Float.parseFloat(OrangeConfig.getInstance().getConfig(SPACE_NAME, "vlViewDelayWaitTimeAfterAnimation", "0"));
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b84f6d20", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(SPACE_NAME, "joinGroupPopWeex2", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a957bda3", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(SPACE_NAME, "isPrefetchCartVEngine", "true"));
    }
}
