package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(956301313);
    }

    public static String getAppDispName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc0fe6a1", new Object[0]);
        }
        return "淘宝";
    }

    public static String getGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46a71146", new Object[]{str});
        }
        if (str == null || !"10000603".equals(str.substring(0, str.indexOf(64)))) {
            return "taobao4android";
        }
        return "taobao4androiddata";
    }
}
