package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class huv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809632);
    }

    public static String a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41381ec9", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void b(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8638ba2", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        try {
            y9n.b(av6.USER_TRACK_TAG);
            y9n.a(av6.USER_TRACK_TAG, str + "\nEvent id: " + i + "\narg1: " + str2 + "\nargs: " + str3);
            y9n.b(av6.USER_TRACK_TAG);
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
        } catch (Exception e) {
            y9n.d("track", e);
        }
    }

    public static void c(String str, int i, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a88ad", new Object[]{str, new Integer(i), str2, map});
        } else {
            b(str, i, str2, a(map));
        }
    }
}
