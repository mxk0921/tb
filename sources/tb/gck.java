package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa944ea3", new Object[]{str});
        }
        if (trq.c(str)) {
            return Collections.emptyMap();
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        if (configs == null || configs.isEmpty()) {
            return Collections.emptyMap();
        }
        return configs;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34502b5e", new Object[]{str, str2});
        }
        if (trq.c(str)) {
            return str2;
        }
        return OrangeConfig.getInstance().getCustomConfig(str, str2);
    }
}
