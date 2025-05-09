package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kn8 implements Executor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380271);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            runnable.run();
        }
    }
}
