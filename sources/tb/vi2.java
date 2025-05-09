package tb;

import android.graphics.Color;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.multitab.ITabStyleListener;
import com.taobao.tao.navigation.TBFragmentTabHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vi2 implements ITabStyleListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public float f30026a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final qpu e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455513);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455512);
        t2o.a(916455449);
    }

    public vi2(qpu qpuVar, boolean z) {
        ckf.g(qpuVar, "turboEngineContext");
        this.e = qpuVar;
        this.f = z;
    }

    public final int b(float f, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a5542cd", new Object[]{this, new Float(f), new Boolean(z), new Boolean(z2)})).intValue();
        }
        String str2 = "#ffffffff";
        if (z) {
            str = "#ff222222";
        } else {
            str = str2;
        }
        if (z2) {
            str2 = "#ff222222";
        }
        return r14.INSTANCE.a(Color.parseColor(str), Color.parseColor(str2), f);
    }

    public final int c(float f, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f388218", new Object[]{this, new Float(f), new Boolean(z), new Boolean(z2)})).intValue();
        }
        String str2 = "#ff111111";
        if (z) {
            str = "#ffeeeeee";
        } else {
            str = str2;
        }
        if (z2) {
            str2 = "#ffeeeeee";
        }
        return r14.INSTANCE.a(Color.parseColor(str), Color.parseColor(str2), f);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff47a18d", new Object[]{this});
        } else if (this.d) {
            g(this.f30026a, this.b, this.c);
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7ce916", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        if (this.d) {
            g(this.f30026a, this.b, this.c);
        }
    }

    public final void f(int i, int i2) {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1de8654", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null) {
            o.setUnSeletedNavigationTabsColorFilter(1, Integer.valueOf(i2), Integer.valueOf(i));
            Fragment currentFragment = o.getCurrentFragment();
            if (currentFragment != null) {
                fragmentActivity = currentFragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            rc0.Companion.a(fragmentActivity, i);
        }
    }

    public final void g(float f, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3871eff", new Object[]{this, new Float(f), new Boolean(z), new Boolean(z2)});
        } else if (this.f && !((t2c) this.e.getService(t2c.class)).t().a()) {
            f(b(f, z, z2), c(f, z, z2));
        }
    }

    @Override // com.taobao.android.turbo.base.service.multitab.ITabStyleListener
    public void a(int i, float f, boolean z, boolean z2, ITabStyleListener.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a0ff61", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2), triggerType});
            return;
        }
        ckf.g(triggerType, "triggerType");
        if (!(triggerType == ITabStyleListener.TriggerType.TAB_SCROLLED && f >= 0.001d && z == z2)) {
            g(f, z, z2);
        }
        this.f30026a = f;
        this.b = z;
        this.c = z2;
        this.d = true;
    }
}
