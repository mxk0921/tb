package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uf1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809128);
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            b(str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265a9e14", new Object[]{str});
            return;
        }
        try {
            a.a(str, null);
        } catch (Throwable th) {
            y9n.d("Atlas exception:", th);
        }
    }
}
