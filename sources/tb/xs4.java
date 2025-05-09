package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xs4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EMPTY = "";

    static {
        t2o.a(912262433);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87996388", new Object[]{str, new Integer(i)})).intValue();
        }
        if (c(str)) {
            return i;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception unused) {
            return i;
        }
    }

    public static String b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ac35a1a", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        return String.valueOf(obj);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fe2299d", new Object[]{str})).booleanValue();
        }
        if (ar3.b(str)) {
            return true;
        }
        return false;
    }
}
