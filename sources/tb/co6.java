package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class co6 implements igv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.igv
    public boolean a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b744395", new Object[]{this, thread, th})).booleanValue();
        }
        return thread.isDaemon();
    }
}
