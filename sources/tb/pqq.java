package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286734);
    }

    public static String a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b5025b2", new Object[]{list, str});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (str2 != null) {
                sb.append(str2);
                sb.append(str);
            }
        }
        if (sb.length() > 0 && sb.lastIndexOf(str) > 0) {
            sb.deleteCharAt(sb.lastIndexOf(str));
        }
        return sb.toString();
    }
}
