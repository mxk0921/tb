package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ksw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856466);
    }

    public static boolean b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937e4904", new Object[0])).booleanValue();
        }
        String str2 = Build.MODEL;
        if (!(str2 == null || !str2.contains("GT-I95") || (str = Build.MANUFACTURER) == null)) {
            str.equals("samsung");
        }
        return false;
    }

    public static void a(Context context) {
    }
}
