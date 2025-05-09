package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class fll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public z2a f19389a;

    static {
        t2o.a(689963214);
    }

    public final void a(kxd kxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73bfb952", new Object[]{this, kxdVar});
            return;
        }
        ckf.g(kxdVar, "serviceDelegate");
        this.f19389a = new z2a(kxdVar);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d213f46f", new Object[]{this});
        } else {
            this.f19389a = null;
        }
    }

    public final kxd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxd) ipChange.ipc$dispatch("ae7ce69b", new Object[]{this});
        }
        z2a z2aVar = this.f19389a;
        if (z2aVar != null) {
            return z2aVar.a();
        }
        return null;
    }
}
