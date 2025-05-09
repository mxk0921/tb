package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ny8 implements igv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.igv
    public boolean a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b744395", new Object[]{this, thread, th})).booleanValue();
        }
        String name = thread.getName();
        return ("FinalizerDaemon".equals(name) || "FakeFinalizerDaemon".equals(name) || "FinalizerWatchdogDaemon".equals(name) || "FakeFinalizerWatchdogDaemon".equals(name)) && (th instanceof IllegalStateException) && ("not running".equals(th.getMessage()) || "already running".equals(th.getMessage()));
    }
}
