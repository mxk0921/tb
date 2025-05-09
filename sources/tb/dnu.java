package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705659);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            b(runnable, null);
        }
    }

    public static void b(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c13778", new Object[]{runnable, runnable2});
            return;
        }
        try {
            try {
                runnable.run();
            } catch (Throwable unused) {
                runnable2.run();
            }
        } catch (Throwable unused2) {
        }
    }
}
