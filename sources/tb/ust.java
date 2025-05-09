package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ust {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Throwable a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("92eb67e0", new Object[]{th});
        }
        Throwable cause = th.getCause();
        while (true) {
            th = cause;
            if (th == null || th == th) {
                break;
            }
            cause = th.getCause();
        }
        return th;
    }
}
