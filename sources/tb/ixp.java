package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ixp implements qob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k0n f21634a;

    static {
        t2o.a(511705508);
        t2o.a(511705498);
    }

    public ixp(k0n k0nVar) {
        this.f21634a = k0nVar;
    }

    @Override // tb.qob
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8012bb8a", new Object[]{this});
            return;
        }
        k0n k0nVar = this.f21634a;
        if (k0nVar != null) {
            k0nVar.g(0);
        }
    }

    @Override // tb.qob
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aefda2b", new Object[]{this});
        }
    }

    @Override // tb.qob
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a109b", new Object[]{this});
        }
    }

    @Override // tb.qob
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a87968", new Object[]{this});
            return;
        }
        k0n k0nVar = this.f21634a;
        if (k0nVar != null) {
            k0nVar.dismiss();
        }
    }

    public ixp() {
    }
}
