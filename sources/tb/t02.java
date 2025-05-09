package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t02 implements ncc, cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String k = t02.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public xlr f28382a;
    public w4q b;
    public Context c;
    public tjl d;
    public View.OnClickListener e;
    public so9 f;
    public htn g;
    public String h;
    public String i;
    public l6t j;

    static {
        t2o.a(779092058);
        t2o.a(806355920);
        t2o.a(806356196);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6e00968", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59589e92", new Object[]{this, str});
        }
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return null;
    }

    public void f(htn htnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f836655", new Object[]{this, htnVar});
        } else {
            this.g = htnVar;
        }
    }

    public void g(so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d153b76", new Object[]{this, so9Var});
        } else {
            this.f = so9Var;
        }
    }

    @Override // tb.ncc
    public Map<String, String> getHeartParams() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
        }
        tjl tjlVar = this.d;
        if (tjlVar == null || (map = tjlVar.e) == null) {
            return null;
        }
        map.put(yj4.PARAM_IGNORE_PV, "true");
        return this.d.e;
    }

    public void h(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a0aed6", new Object[]{this, onClickListener});
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76382da8", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5877e90c", new Object[]{this});
        } else if (hjr.y() && this.d != null) {
            efs.a(k, "startSubscribePM");
            if (hjr.i()) {
                n(this.d);
                return;
            }
            tjl tjlVar = this.d;
            xlr xlrVar = new xlr(1, tjlVar.c, null, tjlVar.f28751a, false, true, false, false, tjlVar.b, false, false, this);
            this.f28382a = xlrVar;
            xlrVar.d0(this.d.d);
            this.f28382a.a0(this);
            this.f28382a.i0();
            this.f28382a.y();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8f16c", new Object[]{this});
        } else if (hjr.y() && this.d != null) {
            efs.a(k, "stopSubscribePM");
            if (hjr.i()) {
                m();
                return;
            }
            xlr xlrVar = this.f28382a;
            if (xlrVar != null) {
                xlrVar.z();
                this.f28382a.l0();
                this.f28382a = null;
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d7d8e8", new Object[]{this});
            return;
        }
        l6t l6tVar = this.j;
        if (l6tVar != null) {
            l6tVar.B();
            this.j = null;
        }
    }

    public final void n(tjl tjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2731edd1", new Object[]{this, tjlVar});
            return;
        }
        m6t m6tVar = new m6t(tjlVar.f28751a, tjlVar.b, tjlVar.c, tjlVar.d, this);
        m6tVar.p(true);
        m6tVar.o(false);
        m6tVar.s(false);
        l6t l6tVar = new l6t();
        this.j = l6tVar;
        l6tVar.v(this);
        this.j.y(m6tVar);
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        }
    }
}
