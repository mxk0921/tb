package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o2q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499271);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return b.getConfig(str, str2, str3);
        }
        return str3;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("788f87fc", new Object[]{str, str2});
        }
        return a("android_sku", str, str2);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c22ab4", new Object[]{str})).booleanValue();
        }
        return d(str, true);
    }

    public static boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d583de28", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.parseBoolean(b(str, String.valueOf(z)));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9944c95d", new Object[0])).booleanValue();
        }
        return false;
    }
}
