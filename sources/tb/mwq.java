package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mwq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bdt f24350a;
    private final nwq b;

    static {
        t2o.a(677380275);
    }

    public mwq(nwq nwqVar, bdt bdtVar) {
        this.b = nwqVar;
        this.f24350a = bdtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (nwq.b(this.b)) {
            try {
                if (nwq.c(this.b) != null) {
                    nwq.c(this.b).onSuccess(this.f24350a.e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
