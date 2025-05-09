package tb;

import android.content.Context;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(507510811);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d6520", new Object[0])).booleanValue();
        }
        try {
            return Resources.getSystem().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
        }
        if (context == null || (context.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }
}
