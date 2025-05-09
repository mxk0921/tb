package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f32978a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601436);
        }

        public a() {
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
            }
            return ckf.b(Looper.getMainLooper(), Looper.myLooper());
        }

        public final void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87b65512", new Object[]{this, runnable});
            } else {
                zrt.a().post(runnable);
            }
        }

        public final void c(Runnable runnable, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f150002", new Object[]{this, runnable, new Boolean(z)});
                return;
            }
            ckf.g(runnable, "runnable");
            if (!z || !a()) {
                zrt.a().post(runnable);
            } else {
                runnable.run();
            }
        }

        public final void d(Runnable runnable, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8ac8fa9", new Object[]{this, runnable, new Long(j)});
            } else {
                zrt.a().postDelayed(runnable, j);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601435);
    }

    public static final /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("574c2982", new Object[0]);
        }
        return f32978a;
    }
}
