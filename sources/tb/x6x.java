package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x6x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LEVEL_ERROR = 1;
    public static final int LEVEL_INFO = 3;

    static {
        t2o.a(982516273);
    }

    public static icn a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("6244b5e3", new Object[]{new Integer(i), str, str2});
        }
        return e(RVLLevel.Error, i, str, str2, null);
    }

    public static icn b(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("85207e6d", new Object[]{new Integer(i), str, str2, str3});
        }
        return e(RVLLevel.Error, i, str, str2, str3);
    }

    public static icn c(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("82422f5f", new Object[]{new Integer(i), str, str2});
        }
        return e(RVLLevel.Info, i, str, str2, null);
    }

    public static icn d(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("a69910e9", new Object[]{new Integer(i), str, str2, str3});
        }
        return e(RVLLevel.Info, i, str, str2, str3);
    }

    public static icn e(RVLLevel rVLLevel, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("47d98705", new Object[]{rVLLevel, new Integer(i), str, str2, str3});
        }
        icn a2 = lcn.a(rVLLevel, "Weex/" + str);
        if ("Page".contentEquals(str)) {
            a2.k(str2, r5x.b(i));
        } else {
            a2.k(str2, str3);
            a2.m(r5x.b(i));
        }
        return a2;
    }

    public static icn f(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("2a39fa32", new Object[]{new Integer(i), str, str2});
        }
        return e(RVLLevel.Verbose, i, str, str2, null);
    }
}
