package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b4l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        t2o.a(779093062);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("782afed1", new Object[]{str, str2});
        }
        blc p = v2s.o().p();
        return p.b("tblive", str + "mixLiveAndTabOrange", str2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3ebaef", new Object[]{str, str2});
        }
        blc p = v2s.o().p();
        return p.b("tblive", str + "mixLiveOrange", str2);
    }
}
