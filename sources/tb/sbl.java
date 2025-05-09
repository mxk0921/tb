package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP = "UltronPageDowngrade";

    static {
        t2o.a(153092150);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7021bdd8", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig(ORANGE_GROUP, str, str2);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb6291a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(ORANGE_GROUP, str, String.valueOf(z)));
    }
}
