package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438818);
    }

    public static final String a(uhc uhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55a3dfba", new Object[]{uhcVar});
        }
        ckf.g(uhcVar, "<this>");
        return "KMPInside";
    }

    public static final String b(uhc uhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46cfcc21", new Object[]{uhcVar});
        }
        ckf.g(uhcVar, "<this>");
        return "tblive";
    }
}
