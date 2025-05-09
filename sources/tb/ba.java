package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(396361786);
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700bdc08", new Object[]{str, th, str2, objArr});
            return;
        }
        try {
            Log.e(str, " throwable is : " + th);
        } catch (Throwable unused) {
        }
    }
}
