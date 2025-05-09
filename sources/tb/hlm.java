package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f20731a;
    public dlm b;
    public g1a<? super jlm, xhv> c;
    public g1a<? super bi8, xhv> d;

    static {
        t2o.a(1022361878);
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("828c7dd8", new Object[]{this});
        }
        return this.f20731a;
    }

    public final dlm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dlm) ipChange.ipc$dispatch("ff987c3a", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<bi8, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.d;
    }

    public final g1a<jlm, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("bb2d9d19", new Object[]{this});
        }
        return this.c;
    }

    public final void e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8961f2", new Object[]{this, num});
        } else {
            this.f20731a = num;
        }
    }

    public final void f(dlm dlmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24a3048", new Object[]{this, dlmVar});
        } else {
            this.b = dlmVar;
        }
    }

    public final void g(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.d = g1aVar;
        }
    }

    public final void h(g1a<? super jlm, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a971b5", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }
}
