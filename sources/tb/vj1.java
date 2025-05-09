package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(367001630);
    }

    public static Boolean a(Context context, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("84ebd906", new Object[]{context, str, strArr});
        }
        return Boolean.TRUE;
    }

    public static boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7fe6f97", new Object[]{context, str, str2})).booleanValue();
        }
        return true;
    }
}
