package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.e;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jj9 implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<cll> f22027a;
    public final e b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cll cllVar = (cll) jj9.a(jj9.this).get();
            if (cllVar != null) {
                jj9.b(jj9.this, null);
                long a2 = out.a();
                cllVar.P(a2);
                if (jj9.c(jj9.this) != null) {
                    jj9.c(jj9.this).e(cllVar, a2);
                }
            }
        }
    }

    public jj9(cll cllVar) {
        this.f22027a = new WeakReference<>(cllVar);
        zzb<?> b = yq7.b(ic.PAGE_FIRST_FRAME_DISPATCHER);
        if (b instanceof e) {
            this.b = (e) b;
        }
    }

    public static /* synthetic */ WeakReference a(jj9 jj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("9cdb029c", new Object[]{jj9Var});
        }
        return jj9Var.f22027a;
    }

    public static /* synthetic */ WeakReference b(jj9 jj9Var, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("2f99a4e0", new Object[]{jj9Var, weakReference});
        }
        jj9Var.f22027a = weakReference;
        return weakReference;
    }

    public static /* synthetic */ e c(jj9 jj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6ee95e03", new Object[]{jj9Var});
        }
        return jj9Var.b;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36429e74", new Object[]{this});
        } else {
            w9a.g().i().postAtFrontOfQueue(new a());
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        cll cllVar = this.f22027a.get();
        if (cllVar != null) {
            d();
            zq6.b("doFrame", cllVar.b(), cllVar.getPageName());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b194b4c", new Object[]{this});
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
