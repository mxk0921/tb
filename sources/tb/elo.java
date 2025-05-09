package tb;

import android.app.Activity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.DecorationProvider;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class elo implements ild, pnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f18663a;
    public boolean b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public boolean g;

    static {
        t2o.a(815792835);
        t2o.a(815792814);
        t2o.a(815792831);
    }

    public elo(Activity activity) {
        ckf.g(activity, "activity");
        this.f18663a = activity;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        onh.d().b();
        jjt.INSTANCE.m(this);
    }

    @Override // tb.pnh
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8268196", new Object[]{this, str});
            return;
        }
        ckf.g(str, "type");
        if (!this.f18663a.isFinishing() && !this.b && ckf.b(str, this.d)) {
            j();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6378cbc3", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc58df7c", new Object[]{this});
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.g) {
            this.g = true;
            String a2 = flo.a(this.f18663a.getIntent());
            this.c = a2;
            a83 a83Var = a83.INSTANCE;
            this.d = a83Var.a(a2);
            this.e = a83Var.c(this.c);
            Localization.n();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797b837", new Object[]{this});
        } else {
            jjt.INSTANCE.j(this.d);
        }
    }

    public void g(abx abxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722e6e5a", new Object[]{this, abxVar});
        } else if (!this.f) {
            this.f = true;
            j();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.b = true;
        jjt.INSTANCE.m(this);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142bc345", new Object[]{this});
        } else if (!this.f18663a.isFinishing()) {
            e();
            jjt jjtVar = jjt.INSTANCE;
            if (!jjtVar.i(this.e)) {
                k();
            }
            if (!jjtVar.i(this.d)) {
                jjtVar.l(this);
                f();
                return;
            }
            i();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d96b88", new Object[]{this});
        } else if (a83.INSTANCE.d(this.c)) {
            jjt.INSTANCE.j(this.e);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.d = a83.INSTANCE.a(this.c);
        if (this.b) {
            j();
        }
        this.b = false;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb64fdf5", new Object[]{this});
        } else if (yak.f31939a != null) {
            String valueOf = String.valueOf(p1p.d(DecorationProvider.Tb2021Decoration.d(ListStyle.WATERFALL, this.f18663a.getWindow().getDecorView().getMeasuredWidth())));
            onh d = onh.d();
            int b = a83.INSTANCE.b();
            if (d.c() < b) {
                int c = b - d.c();
                MuiseCellBean j = b83.INSTANCE.j(this.d);
                if (j != null) {
                    c4p.m("tbsearch_preload", "加载卡片 " + this.d);
                    HashMap hashMap = new HashMap();
                    hashMap.put("containerWidth", valueOf);
                    hashMap.put("layoutStyle", 1);
                    hashMap.put("preload", "true");
                    for (int i = 0; i < c; i++) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("model", j.mMuiseBean.model);
                        hashMap2.put("status", hashMap);
                        krm krmVar = new krm(this.d, this.f18663a, yak.f31939a, null, null, null);
                        krmVar.V(Globals.getApplication());
                        krmVar.L(j.mMuiseBean, hashMap2);
                        d.a(krmVar.x());
                    }
                }
            }
        }
    }
}
