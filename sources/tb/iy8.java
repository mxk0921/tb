package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class iy8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bdt f21644a;
    private final ky8 b;

    static {
        t2o.a(677380272);
    }

    public iy8(ky8 ky8Var, bdt bdtVar) {
        this.b = ky8Var;
        this.f21644a = bdtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (ky8.c(this.b)) {
            try {
                if (ky8.b(this.b) != null) {
                    ky8.b(this.b).onFailure(this.f21644a.d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
