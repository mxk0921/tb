package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hm6 implements bxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bxb f20740a;
    public final DXVideoControlConfig<iew> b;
    public final String c;

    static {
        t2o.a(444597080);
        t2o.a(444597081);
    }

    public hm6(DXVideoControlConfig<iew> dXVideoControlConfig, String str) {
        this.b = dXVideoControlConfig;
        this.c = str;
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4639c7ad", new Object[]{this, recyclerView});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).a(recyclerView);
        }
    }

    public void b(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7adf4037", new Object[]{this, recyclerView, str});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).b(recyclerView, str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).c();
        }
    }

    public void d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f95e656", new Object[]{this, recyclerView});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).d(recyclerView);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c7f8c", new Object[]{this});
        } else if (this.f20740a == null) {
            DXVideoControlConfig<iew> dXVideoControlConfig = this.b;
            if (dXVideoControlConfig == null) {
                dXVideoControlConfig = DXVideoControlConfig.n();
            }
            this.f20740a = new gm6(dXVideoControlConfig, this.c);
        }
    }

    public void f(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e9e914", new Object[]{this, recyclerView});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).e(recyclerView);
        }
    }

    public void g(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b675de", new Object[]{this, recyclerView, str});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).f(recyclerView, str);
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6409d5a", new Object[]{this})).booleanValue();
        }
        if (this.f20740a == null || !zg5.I4()) {
            return false;
        }
        return true;
    }

    public void i(RecyclerView recyclerView, DXVideoControlConfig<iew> dXVideoControlConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd995eff", new Object[]{this, recyclerView, dXVideoControlConfig, str});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).j(recyclerView, dXVideoControlConfig, str);
        }
    }

    public void j(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c70f38", new Object[]{this, recyclerView, str});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).k(recyclerView, str);
        }
    }

    public void k(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad94867a", new Object[]{this, recyclerView});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).l(recyclerView);
        }
    }

    public void l(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7873ebf", new Object[]{this, recyclerView});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).n(recyclerView);
        }
    }

    public void m(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac57d6c9", new Object[]{this, recyclerView, str});
        } else if (this.f20740a != null && zg5.I4()) {
            ((gm6) this.f20740a).o(recyclerView, str);
        }
    }
}
