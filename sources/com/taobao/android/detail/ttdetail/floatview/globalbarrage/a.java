package com.taobao.android.detail.ttdetail.floatview.globalbarrage;

import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import java.util.ArrayList;
import java.util.List;
import tb.k7c;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<k7c> b;
    public final ze7 c;
    public final FrameLayout d;
    public BarrageFloatingView e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6787a = false;
    public BarrageFloatingView.BARRAGE_TYPE f = null;

    static {
        t2o.a(912261800);
    }

    public a(ze7 ze7Var, FrameLayout frameLayout) {
        this.c = ze7Var;
        this.d = frameLayout;
        c();
        b();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf57e8aa", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.d != null) {
            List<k7c> e = e(jSONObject);
            this.b = e;
            for (k7c k7cVar : e) {
                k7cVar.b(this.d, jSONObject);
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae43371f", new Object[]{this});
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ccca28", new Object[]{this});
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (f()) {
            for (k7c k7cVar : this.b) {
                k7cVar.onDestroy();
            }
        }
    }

    public final List<k7c> e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c371dd45", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        if (c.a(jSONObject)) {
            BarrageFloatingView barrageFloatingView = new BarrageFloatingView(this.c);
            this.e = barrageFloatingView;
            barrageFloatingView.q(this.f);
            arrayList.add(this.e);
        }
        return arrayList;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17a4cb6", new Object[]{this})).booleanValue();
        }
        List<k7c> list = this.b;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ce69f8", new Object[]{this, new Integer(i)});
        } else if (this.e != null && BarrageFloatingView.BARRAGE_TYPE.INSIDE.equals(this.f)) {
            this.e.n(i);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            d();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        JSONObject j = this.c.e().j();
        d();
        c();
        b();
        a(j);
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b936922c", new Object[]{this, new Boolean(z)});
        } else if (this.f6787a != z && f()) {
            this.f6787a = z;
            for (k7c k7cVar : this.b) {
                k7cVar.a(this.f6787a);
            }
        }
    }

    public void k(BarrageFloatingView.BARRAGE_TYPE barrage_type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44cc2efd", new Object[]{this, barrage_type});
        } else {
            this.f = barrage_type;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5001cca5", new Object[]{this});
        } else if (f()) {
            for (k7c k7cVar : this.b) {
                k7cVar.onStart();
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac60505", new Object[]{this});
        } else if (f()) {
            for (k7c k7cVar : this.b) {
                k7cVar.onStop();
            }
        }
    }
}
