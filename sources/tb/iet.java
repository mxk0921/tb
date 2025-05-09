package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class iet {
    public static final Executor MAIN_THREAD = new a();
    public static final Executor sExecutor = new kn8();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f21279a = new Handler(Looper.getMainLooper());

        static {
            t2o.a(677380281);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                this.f21279a.post(runnable);
            }
        }
    }

    static {
        t2o.a(677380280);
    }
}
