package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class af7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262774);
    }

    public static void a(ze7 ze7Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15dfef0", new Object[]{ze7Var, runnable});
        } else if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                ze7Var.h().g(runnable);
            }
        }
    }
}
