package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19347a;
    public boolean c;
    public Runnable g;
    public Handler h;
    public final ISupportFragment i;
    public final Fragment j;
    public boolean b = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fjw.a(fjw.this, null);
            fjw.b(fjw.this, true);
        }
    }

    static {
        t2o.a(775946398);
    }

    public fjw(ISupportFragment iSupportFragment) {
        this.i = iSupportFragment;
        this.j = (Fragment) iSupportFragment;
    }

    public static /* synthetic */ Runnable a(fjw fjwVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("cb64a0d", new Object[]{fjwVar, runnable});
        }
        fjwVar.g = runnable;
        return runnable;
    }

    public static /* synthetic */ void b(fjw fjwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4905620a", new Object[]{fjwVar, new Boolean(z)});
        } else {
            fjwVar.e(z);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7395223", new Object[]{this})).booleanValue();
        }
        if (this.j.isAdded()) {
            return false;
        }
        this.f19347a = !this.f19347a;
        return true;
    }

    public final void d(boolean z) {
        List<Fragment> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f3ebab", new Object[]{this, new Boolean(z)});
        } else if (!this.b) {
            this.b = true;
        } else if (!c() && (e = qxq.e(this.j.getChildFragmentManager())) != null) {
            for (Fragment fragment : e) {
                if ((fragment instanceof ISupportFragment) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                    ((ISupportFragment) fragment).getSupportDelegate().f().e(z);
                }
            }
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89e0890", new Object[]{this, new Boolean(z)});
        } else if (z && j()) {
        } else {
            if (this.f19347a == z) {
                this.b = true;
                return;
            }
            this.f19347a = z;
            if (!z) {
                d(false);
                this.i.onSupportInvisible();
            } else if (!c()) {
                this.i.onSupportVisible();
                if (this.d) {
                    this.d = false;
                }
                d(true);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2ecbf7", new Object[]{this});
            return;
        }
        this.g = new a();
        g().post(this.g);
    }

    public final Handler g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new Handler(Looper.getMainLooper());
        }
        return this.h;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a764c9", new Object[]{this});
        } else if (!this.c && !this.j.isHidden() && this.j.getUserVisibleHint()) {
            if (this.j.getParentFragment() == null || i(this.j.getParentFragment())) {
                this.b = false;
                s(true);
            }
        }
    }

    public final boolean i(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55e656fb", new Object[]{this, fragment})).booleanValue();
        }
        if (fragment.isHidden() || !fragment.getUserVisibleHint()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315577a4", new Object[]{this})).booleanValue();
        }
        Fragment parentFragment = this.j.getParentFragment();
        if (parentFragment instanceof ISupportFragment) {
            return !((ISupportFragment) parentFragment).isSupportVisible();
        }
        if (parentFragment == null || parentFragment.isVisible()) {
            return false;
        }
        return true;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acaff78", new Object[]{this})).booleanValue();
        }
        return this.f19347a;
    }

    public void l(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
        } else if (this.e || this.j.getTag() == null || !this.j.getTag().startsWith("android:switcher:")) {
            if (this.e) {
                this.e = false;
            }
            h();
        }
    }

    public void m(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else if (bundle != null) {
            this.c = bundle.getBoolean("fragmentation_invisible_when_leave");
            this.e = bundle.getBoolean("fragmentation_compat_replace");
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
        } else if (z) {
            s(false);
        } else {
            f();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.g != null) {
            g().removeCallbacks(this.g);
            this.f = true;
        } else if (!this.f19347a || !i(this.j)) {
            this.c = true;
        } else {
            this.b = false;
            this.c = false;
            e(false);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.d) {
            if (!this.f19347a && !this.c && i(this.j)) {
                this.b = false;
                e(true);
            }
        } else if (this.f) {
            this.f = false;
            h();
        }
    }

    public void r(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        bundle.putBoolean("fragmentation_invisible_when_leave", this.c);
        bundle.putBoolean("fragmentation_compat_replace", this.e);
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5094c66", new Object[]{this, new Boolean(z)});
        } else if (!this.d) {
            e(z);
        } else if (z) {
            f();
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
        } else if (this.j.isResumed() || (!this.j.isAdded() && z)) {
            boolean z2 = this.f19347a;
            if (!z2 && z) {
                s(true);
            } else if (z2 && !z) {
                e(false);
            }
        }
    }
}
