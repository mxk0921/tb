package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class klm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f22744a;
    public ulm b;
    public g1a<? super jlm, xhv> c;
    public g1a<? super bi8, xhv> d;

    static {
        t2o.a(1022361880);
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("828c7dd8", new Object[]{this});
        }
        return this.f22744a;
    }

    public final ulm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ulm) ipChange.ipc$dispatch("eb81e640", new Object[]{this});
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
            return (g1a) ipChange.ipc$dispatch("7dd420ec", new Object[]{this});
        }
        return this.c;
    }

    public final void e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8961f2", new Object[]{this, num});
        } else {
            this.f22744a = num;
        }
    }

    public final void f(ulm ulmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc15a2c", new Object[]{this, ulmVar});
        } else {
            this.b = ulmVar;
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
            ipChange.ipc$dispatch("1c9f0242", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }
}
