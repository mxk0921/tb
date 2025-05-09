package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701661);
    }

    public static final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cc548a", new Object[]{str, str2});
        }
    }

    public static final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e707f73f", new Object[]{str, str2});
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        Log.e(str, str2);
    }

    public static final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e1822d", new Object[]{str, str2});
        }
    }
}
