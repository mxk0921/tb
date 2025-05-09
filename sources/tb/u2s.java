package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u2s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093713);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{str});
        }
        return z3s.h(str);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d747d", new Object[]{str, str2});
        } else {
            z3s.m(str, str2);
        }
    }
}
