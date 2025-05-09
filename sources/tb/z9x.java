package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516278);
    }

    public static WeexValue a(String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("43ce3f78", new Object[]{str, str2, weexValueArr});
        }
        return null;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3b10e1a", new Object[]{str})).booleanValue();
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e22a6e7b", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void d(int i, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8561204", new Object[]{new Integer(i), str, objArr});
        }
    }

    public static WeexValue e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("8a1075fe", new Object[]{str});
        }
        return null;
    }
}
