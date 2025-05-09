package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class z94 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bdt f32625a;
    private final aa4 b;

    static {
        t2o.a(677380269);
    }

    public z94(aa4 aa4Var, bdt bdtVar) {
        this.b = aa4Var;
        this.f32625a = bdtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (aa4.b(this.b)) {
            try {
                if (aa4.c(this.b) != null) {
                    aa4.c(this.b).a(this.f32625a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
