package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750451);
    }

    public static String a() {
        ly1 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ec5ee7e", new Object[0]);
        }
        if (!v82.q() || (a2 = i5k.a(i5k.LAST_ENTER_NODE)) == null) {
            return "";
        }
        return a2.b();
    }

    public static String b() {
        ly1 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17123445", new Object[0]);
        }
        if (!v82.q() || (a2 = i5k.a(i5k.LAST_ENTER_NODE)) == null) {
            return "";
        }
        return a2.d;
    }
}
