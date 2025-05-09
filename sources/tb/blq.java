package tb;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class blq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TTPY_ERROR_DISMISS = 3;
    public static final int TYPE_ADD_CART_REQUEST = 4;
    public static final int TYPE_ADJUST_REQUEST = 2;
    public static final int TYPE_DESTROY = 5;
    public static final int TYPE_QUERY_REQUEST = 1;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f16471a;
    public LinearLayout b;
    public omc c;
    public w2c d;

    static {
        t2o.a(479199612);
    }

    public blq() {
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678b4a", new Object[]{this, new Integer(i)});
            return;
        }
        omc omcVar = this.c;
        if (omcVar != null) {
            kmb kmbVar = this.f16471a;
            ((wii) omcVar).l(kmbVar, kmbVar.getContext(), i);
        }
    }

    public final w2c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2c) ipChange.ipc$dispatch("ae29a82d", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new ci8(this.b, this.f16471a);
        }
        return this.d;
    }

    public final omc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omc) ipChange.ipc$dispatch("4940822d", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new wii();
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        omc omcVar = this.c;
        if (omcVar == null || !((wii) omcVar).k()) {
            return false;
        }
        return true;
    }

    public void e(int i, MtopResponse mtopResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4846b3", new Object[]{this, new Integer(i), mtopResponse, new Boolean(z)});
            return;
        }
        w2c b = b();
        kmb kmbVar = this.f16471a;
        b.a(kmbVar, kmbVar.getContext(), i, mtopResponse, z);
    }

    public void f(int i, MtopResponse mtopResponse, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec14281", new Object[]{this, new Integer(i), mtopResponse, new Boolean(z), new Boolean(z2)});
            return;
        }
        w2c b = b();
        kmb kmbVar = this.f16471a;
        b.c(kmbVar, kmbVar.getContext(), i, mtopResponse, z, z2);
    }

    public void g(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fa4e27", new Object[]{this, mtopResponse});
            return;
        }
        w2c b = b();
        kmb kmbVar = this.f16471a;
        b.b(kmbVar, kmbVar.getContext(), 3, mtopResponse);
    }

    public void h(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922adc0e", new Object[]{this, linearLayout});
        } else {
            this.b = linearLayout;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed99f3d", new Object[]{this, new Integer(i)});
        } else {
            j(i, null);
        }
    }

    public void j(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ae53c7", new Object[]{this, new Integer(i), str});
            return;
        }
        omc c = c();
        kmb kmbVar = this.f16471a;
        c.a(kmbVar, kmbVar.getContext(), i, str);
    }

    public blq(kmb kmbVar) {
        this.f16471a = kmbVar;
    }
}
