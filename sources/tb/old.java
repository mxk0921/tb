package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class old {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297695);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de8b232", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && str.indexOf("?") > 0) {
            String substring = str.substring(str.indexOf("?") + 1);
            if (TextUtils.isEmpty(substring)) {
                return hashMap;
            }
            for (String str2 : substring.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }
}
