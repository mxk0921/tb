package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fr3;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d1p implements fr3.b, r2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final qpu f17507a;
    public final z0p b;
    public final fr3 c;
    public final mr3 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455701);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455700);
        t2o.a(916455672);
        t2o.a(919601280);
    }

    public d1p(qpu qpuVar, z0p z0pVar, fr3 fr3Var, mr3 mr3Var) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(z0pVar, "searchButtonComponent");
        ckf.g(fr3Var, "childButtonComponent");
        ckf.g(mr3Var, "childTipBarComponent");
        this.f17507a = qpuVar;
        this.b = z0pVar;
        this.c = fr3Var;
        this.d = mr3Var;
    }

    @Override // tb.fr3.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491aaecc", new Object[]{this});
        } else {
            d();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa08dbe0", new Object[]{this});
        } else {
            c(((t2c) this.f17507a.getService(t2c.class)).v());
        }
    }

    public final void c(z78 z78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97feb55", new Object[]{this, z78Var});
            return;
        }
        boolean a2 = z78Var.a();
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "ChildShowHideHelper", "显示或隐藏未成年人模式按钮，isChildVersion=" + a2, null, 4, null);
        if (a2) {
            this.b.hide();
            this.c.show();
            return;
        }
        this.b.show();
        this.c.hide();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5248d85c", new Object[]{this});
            return;
        }
        boolean isShowing = this.d.isShowing();
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "ChildShowHideHelper", "显示或隐藏未成年人模式提示条，isShowing=" + isShowing, null, 4, null);
        if (isShowing) {
            this.d.hide();
        } else {
            this.d.show();
        }
    }

    @Override // tb.r2c
    public void onEditionVersionInfoChanged(z78 z78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58f2b33", new Object[]{this, z78Var});
            return;
        }
        ckf.g(z78Var, "editionVersionInfo");
        c(z78Var);
        this.d.hide();
    }

    @Override // tb.r2c
    public void onElderVersionChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b92486", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.r2c
    public void onFestivalChanged(r69 r69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87102e45", new Object[]{this, r69Var});
        } else {
            ckf.g(r69Var, "festivalInfo");
        }
    }

    @Override // tb.r2c
    public void onTabHostStatusChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc05d8b", new Object[]{this});
        }
    }
}
