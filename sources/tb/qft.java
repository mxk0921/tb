package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qft<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kdt<TResult> f26731a = new kdt<>();

    static {
        t2o.a(677380282);
    }

    public final bdt<TResult> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("4d1c9153", new Object[]{this});
        }
        return this.f26731a;
    }

    public final boolean b(TResult tresult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1f08ec9", new Object[]{this, tresult})).booleanValue();
        }
        return this.f26731a.k(tresult);
    }

    public final boolean c(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d91b4dc1", new Object[]{this, exc})).booleanValue();
        }
        return this.f26731a.l(exc);
    }
}
