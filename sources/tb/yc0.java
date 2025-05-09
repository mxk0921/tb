package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809059);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f307ed", new Object[]{dinamicXEngine});
            return;
        }
        i1c a2 = wte.a("guess").a();
        f38.d(dinamicXEngine, a2.c());
        f38.b(dinamicXEngine, a2.b());
        f38.c(dinamicXEngine, a2.a());
        f38.a(dinamicXEngine, a2.getAbilities());
    }
}
