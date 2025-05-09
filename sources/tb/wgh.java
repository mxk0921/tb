package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class wgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855822);
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb83973", new Object[]{str, str2})).intValue();
        }
        return b(str, str2);
    }

    public static int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1486b28f", new Object[]{str, str2})).intValue();
        }
        v7t.d(str, str2);
        return 0;
    }
}
