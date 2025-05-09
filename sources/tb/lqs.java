package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.multitab.ITabStyleListener;
import com.taobao.android.turbo.service.multitab.adapter.MultiTabAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class lqs implements r2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MultiTabAdapter f23520a;
    public int b;
    public float c;
    public boolean d;
    public final qpu e;
    public final bbj f;

    static {
        t2o.a(916455557);
        t2o.a(919601280);
    }

    public lqs(qpu qpuVar, bbj bbjVar) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(bbjVar, "multiTabRegistry");
        this.e = qpuVar;
        this.f = bbjVar;
    }

    public final boolean a(int i, boolean z) {
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb5f1abc", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        MultiTabAdapter multiTabAdapter = this.f23520a;
        if (multiTabAdapter != null) {
            z2 = multiTabAdapter.l(i);
        } else {
            z2 = false;
        }
        MultiTabAdapter multiTabAdapter2 = this.f23520a;
        if (multiTabAdapter2 != null) {
            z3 = multiTabAdapter2.m(i);
        } else {
            z3 = false;
        }
        if (z2) {
            return true;
        }
        if (!z || !z3) {
            return false;
        }
        return true;
    }

    public final void b(int i, float f, ITabStyleListener.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a42218", new Object[]{this, new Integer(i), new Float(f), triggerType});
            return;
        }
        boolean h1 = ((t2c) this.e.getService(t2c.class)).h1();
        this.f.c(i, f, a(i, h1), a(1 + i, h1), triggerType);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b609d9", new Object[]{this});
        } else if (this.d) {
            b(this.b, this.c, ITabStyleListener.TriggerType.DATA_UPDATED);
        }
    }

    public final void d(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde65e6", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        b(i, f, ITabStyleListener.TriggerType.TAB_SCROLLED);
        this.b = i;
        this.c = f;
        this.d = true;
    }

    public final void e(MultiTabAdapter multiTabAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d8ac0b", new Object[]{this, multiTabAdapter});
        } else {
            this.f23520a = multiTabAdapter;
        }
    }

    @Override // tb.r2c
    public void onEditionVersionInfoChanged(z78 z78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58f2b33", new Object[]{this, z78Var});
        } else {
            ckf.g(z78Var, "editionVersionInfo");
        }
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
            return;
        }
        ckf.g(r69Var, "festivalInfo");
        if (this.d) {
            b(this.b, this.c, ITabStyleListener.TriggerType.FESTIVAL_CHANGED);
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
