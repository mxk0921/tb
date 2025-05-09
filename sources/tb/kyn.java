package tb;

import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kyn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(377487404);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7090f3", new Object[]{str, str2});
        } else {
            f(str, true, g4.b.i, str2, 0L, 0, "");
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3752eadd", new Object[]{str, str2, str3});
        } else {
            f(str, false, "loading", str2, 0L, -1, str3);
        }
    }

    public static void c(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869b6f19", new Object[]{str, str2, new Long(j)});
        } else {
            f(str, true, "loading", str2, j, 0, "");
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f296edf6", new Object[]{str, str2});
        } else {
            f(str, true, "loading_Leave", str2, 0L, 0, "");
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a8bcdf", new Object[]{str, str2});
        } else {
            f(str, true, WeexPopContainer.PARAMS_SHOW_LOADING, str2, 0L, 0, "");
        }
    }

    public static void f(String str, boolean z, String str2, String str3, long j, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e89535", new Object[]{str, new Boolean(z), str2, str3, new Long(j), new Integer(i), str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", String.valueOf(z));
        hashMap.put("cost", String.valueOf(j));
        hashMap.put("errorCode", String.valueOf(i));
        hashMap.put("errorMsg", str4);
        if (str3 == null) {
            str3 = "";
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("REMOTE_FEATURE", 19999, str, str2, str3, hashMap).build());
    }
}
