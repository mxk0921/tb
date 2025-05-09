package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355506);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("40a3ee56", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!orq.a(str)) {
            try {
                for (String str2 : str.split(",")) {
                    String[] split = str2.split("=");
                    if (2 == split.length) {
                        hashMap.put(split[0], split[1]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
