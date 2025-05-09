package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886301);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df13b61", new Object[]{str, str2, map});
        } else {
            b(str, 2101, str2, null, map);
        }
    }

    public static void b(String str, int i, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0c9802", new Object[]{str, new Integer(i), str2, str3, map});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = c2v.getInstance().getCurrentPageName();
            if (TextUtils.isEmpty(str)) {
                return;
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, "", map).build());
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc21ca8", new Object[]{context, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
        }
    }

    public static void d(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e60a0f", new Object[]{context, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }
    }
}
