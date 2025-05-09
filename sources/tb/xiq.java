package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, du> f31414a = new HashMap();
    public Activity b;
    public final du c;
    public final du d;
    public final du e;
    public final du f;
    public final du g;

    static {
        t2o.a(736100403);
    }

    public xiq(mjb mjbVar, lh2 lh2Var, a29 a29Var) {
        qh2 qh2Var = new qh2(mjbVar);
        kh2 kh2Var = new kh2();
        this.c = new rhq(qh2Var, lh2Var, a29Var, this, kh2Var);
        this.d = new zx4(qh2Var, lh2Var, a29Var, this, kh2Var);
        this.e = new yfw(qh2Var, lh2Var, a29Var, this, kh2Var);
        this.f = new zjt(qh2Var, lh2Var, a29Var, this, kh2Var);
        this.g = new rt7(qh2Var, lh2Var, a29Var, this, kh2Var);
        d();
        a(mjbVar);
    }

    public final void a(mjb mjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f6c729", new Object[]{this, mjbVar});
            return;
        }
        mjbVar.j(this.c.getState(), this.c);
        mjbVar.j(this.d.getState(), this.d);
        mjbVar.j(this.e.getState(), this.e);
        mjbVar.j(this.f.getState(), this.f);
    }

    public Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.b;
    }

    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239c83b0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        tm1.a("2ARCH_StateContext", "handleState: " + i);
        du duVar = (du) ((HashMap) this.f31414a).get(Integer.valueOf(i));
        if (duVar != null) {
            duVar.e(i, i2);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c65135", new Object[]{this});
            return;
        }
        this.f31414a.put(Integer.valueOf(this.c.getState()), this.c);
        this.f31414a.put(Integer.valueOf(this.d.getState()), this.d);
        this.f31414a.put(Integer.valueOf(this.e.getState()), this.e);
        this.f31414a.put(Integer.valueOf(this.f.getState()), this.f);
        this.f31414a.put(Integer.valueOf(this.g.getState()), this.g);
    }

    public void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
        } else {
            this.b = activity;
        }
    }
}
