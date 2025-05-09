package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class alq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public h7d f15829a;
    public h7d b;
    public h7d c;
    public g7d d;
    public f7d e;
    public final Context f;

    static {
        t2o.a(301990063);
    }

    public alq(Context context) {
        this.f = context;
        e();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108a387e", new Object[]{this});
        } else if (this.b != null && !d(this.f)) {
            ((g27) this.b).a(this.f);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (this.f15829a != null && !d(this.f)) {
            this.f15829a.a(this.f);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140915fe", new Object[]{this});
            return;
        }
        h7d h7dVar = this.c;
        if (h7dVar != null) {
            h7dVar.a(this.f);
        }
    }

    public final boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e41772e0", new Object[]{this, context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        return ((Activity) context).isFinishing();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc31e988", new Object[]{this});
            return;
        }
        this.f15829a = new g27();
        this.b = new g27();
        if (this.f instanceof Activity) {
            this.c = new i67((Activity) this.f);
        }
    }

    @Deprecated
    public void f(f7d f7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69c3d6", new Object[]{this, f7dVar});
        } else if (f7dVar != null) {
            this.e = f7dVar;
        }
    }

    @Deprecated
    public void g(g7d g7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ae35b6", new Object[]{this, g7dVar});
        } else if (g7dVar != null) {
            this.d = g7dVar;
        }
    }

    public void h(h7d h7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a10836", new Object[]{this, h7dVar});
        } else if (h7dVar != null) {
            this.f15829a = h7dVar;
        }
    }

    public void i(h7d h7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1368e78b", new Object[]{this, h7dVar});
        } else if (h7dVar != null) {
            this.c = h7dVar;
        }
    }

    public void j(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1f9382", new Object[]{this, bool});
        } else if (this.b != null && !d(this.f)) {
            ((g27) this.b).b(this.f, bool);
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed99f3d", new Object[]{this, new Integer(i)});
        } else if (this.f15829a != null && !d(this.f)) {
            this.f15829a.c(this.f, i);
        }
    }

    public void l(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b202107", new Object[]{this, bool});
        } else if (this.f15829a != null && !d(this.f)) {
            this.f15829a.b(this.f, bool);
        }
    }

    public void m(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2674d5bc", new Object[]{this, bool});
            return;
        }
        h7d h7dVar = this.c;
        if (h7dVar != null) {
            h7dVar.b(this.f, bool);
        }
    }
}
