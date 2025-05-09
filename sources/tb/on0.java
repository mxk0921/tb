package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class on0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990111);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec600f48", new Object[]{str, str2, str3});
            return;
        }
        String b = b(str);
        m9v d = m9v.d(str);
        d.s(b + "requestParams", str2);
        m9v d2 = m9v.d(str);
        d2.s(b + "responseParams", str3);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1314ad2a", new Object[]{str});
        }
        return str + "_";
    }
}
