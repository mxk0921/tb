package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17892a;
    public boolean b;
    public g1a<? super ml2, xhv> c;
    public g1a<? super fl2, xhv> d;
    public g1a<? super bi8, xhv> e;

    static {
        t2o.a(1022361621);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.f17892a;
    }

    public final g1a<fl2, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("453a44e9", new Object[]{this});
        }
        return this.d;
    }

    public final g1a<bi8, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.e;
    }

    public final g1a<ml2, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("b2094710", new Object[]{this});
        }
        return this.c;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("effeb802", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.f17892a = str;
        }
    }

    public final void g(g1a<? super fl2, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8ce94d", new Object[]{this, g1aVar});
        } else {
            this.d = g1aVar;
        }
    }

    public final void h(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.e = g1aVar;
        }
    }

    public final void i(g1a<? super ml2, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f623df06", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2cbb0a", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
