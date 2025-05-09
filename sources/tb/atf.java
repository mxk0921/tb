package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class atf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708469);
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1f31da", new Object[]{str, str2})).booleanValue();
        }
        try {
            return Pattern.compile(str).matcher(str2).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("251a62a0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("wopc_jae_rules");
            if (configs == null || configs.isEmpty()) {
                return b("^http[s]?://([^/\\?#]+\\.)*(?:jae\\.(?:m|wapa|waptest)\\.taobao\\.com|jaeapp\\.com|amap\\.com|autonavi\\.com|mapabc\\.com|jaecdn\\.com)([\\?|#|/].*)?$", str);
            }
            boolean z = false;
            for (String str2 : configs.keySet()) {
                z = b(configs.get(str2), str);
                if (z) {
                    return z;
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
