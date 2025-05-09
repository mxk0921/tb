package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kbq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SpeedEditionPositionSwitcher";

    static {
        t2o.a(456130590);
    }

    public static PositionInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("6c4ec6fb", new Object[]{context});
        }
        return o78.f(context);
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f009f419", new Object[]{context});
        }
        return o78.g(context);
    }

    public static PositionInfo c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("2d90511e", new Object[]{context});
        }
        return o78.i(context);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f9e41b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(o78.CHINA_MAINLAND, str) || TextUtils.equals("CUN", str) || TextUtils.equals("OLD", str)) {
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e8d7e04", new Object[]{context})).booleanValue();
        }
        if (h(context) || k(context) || i(context)) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdaeaa3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(o78.CHINA_MAINLAND, str)) {
            return true;
        }
        return false;
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("911dd7c2", new Object[]{context})).booleanValue();
        }
        return f(a(context).editionCode);
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c942f69c", new Object[]{context})).booleanValue();
        }
        return f(b(context));
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4fa11cd", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("OLD", b(context));
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25c101d", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("OLD", a(context).editionCode);
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2b38568", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("CUN", b(context));
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec99054", new Object[]{context});
        }
    }
}
