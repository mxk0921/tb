package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262471);
    }

    public static List<String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("63da883", new Object[]{map});
        }
        if (!ar3.d(map)) {
            return new ArrayList(map.values());
        }
        return new ArrayList();
    }

    public static String b(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea63ffb6", new Object[]{list, str});
        }
        return c(list, str, "");
    }

    public static String c(List<String> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaea09ac", new Object[]{list, str, str2});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : list) {
            if (!TextUtils.isEmpty(str3)) {
                sb.append(str);
                sb.append(str2);
                sb.append(str3);
                sb.append(str2);
            }
        }
        if (sb.length() > str.length()) {
            return sb.substring(str.length());
        }
        return "";
    }
}
