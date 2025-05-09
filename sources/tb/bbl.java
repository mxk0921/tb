package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990112);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("new_purchase", str, String.valueOf(z)));
    }
}
