package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u8l extends h0r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sNamespace = "cart_switch";

    static {
        t2o.a(478150881);
    }

    public static /* synthetic */ Object ipc$super(u8l u8lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/toggle/OrangeConfig");
    }

    public static float m(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{str, new Float(f)})).floatValue();
        }
        return v9v.d("cart_switch", str, f);
    }

    public static int n(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{str, new Integer(i)})).intValue();
        }
        return v9v.e("cart_switch", str, i);
    }

    public static long o(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2df331c8", new Object[]{str, new Long(j)})).longValue();
        }
        return v9v.f("cart_switch", str, j);
    }

    public static String p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{str, str2});
        }
        return v9v.g("cart_switch", str, str2);
    }

    public static boolean q(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd8cc7a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return v9v.i("cart_switch", str, z);
    }
}
