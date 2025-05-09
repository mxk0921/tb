package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class tc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28630a;
    public g1a<? super cc9, xhv> b;
    public g1a<? super bi8, xhv> c;

    static {
        t2o.a(1022361695);
    }

    public final g1a<cc9, xhv> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("9e286f76", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<bi8, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.c;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68e03c07", new Object[]{this})).booleanValue();
        }
        return this.f28630a;
    }

    public final void d(g1a<? super cc9, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd83df8", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }

    public final void e(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e5f3d", new Object[]{this, new Boolean(z)});
        } else {
            this.f28630a = z;
        }
    }
}
