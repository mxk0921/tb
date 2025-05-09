package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356500);
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7880e689", new Object[]{str, str2, str3})).booleanValue();
        }
        return b(str, str2, str3, false);
    }

    public static boolean b(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("979c9cf3", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        return zqq.d(e(str, str2, str3, String.valueOf(z)), z);
    }

    public static String e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d811292a", new Object[]{str, str2, str3, str4});
        }
        if (v2s.o().c() == null) {
            return str4;
        }
        return v2s.o().c().b(str, str2, str3, str4);
    }
}
