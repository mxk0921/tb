package tb;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.tao.tbmainfragment.anim.DefaultHorizontalAnimator;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import com.taobao.tao.util.TBMainLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mxq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ADD = 0;
    public static final int TYPE_ADD_RESULT = 1;
    public static final int TYPE_ADD_RESULT_WITHOUT_HIDE = 3;
    public static final int TYPE_ADD_WITHOUT_HIDE = 2;
    public static final int TYPE_REPLACE = 10;
    public static final int TYPE_REPLACE_DONT_BACK = 11;

    /* renamed from: a  reason: collision with root package name */
    public final wtd f24374a;
    public final FragmentActivity b;
    public boolean c = false;
    public sdu d;
    public FragmentAnimator e;

    static {
        t2o.a(775946371);
    }

    public mxq(wtd wtdVar) {
        if (wtdVar instanceof FragmentActivity) {
            this.f24374a = wtdVar;
            this.b = (FragmentActivity) wtdVar;
            return;
        }
        throw new RuntimeException("Must extends FragmentActivity/AppCompatActivity");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44908f9e", new Object[]{this})).booleanValue();
        }
        Fragment fragment = (Fragment) qxq.h(this.b.getSupportFragmentManager());
        if (fragment instanceof TBMainFragment) {
            ActivityCompat.finishAffinity(this.b);
            return true;
        } else if (!(fragment instanceof TBMainBaseFragment)) {
            return false;
        } else {
            l();
            return true;
        }
    }

    public FragmentAnimator b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this});
        }
        return this.e.copy();
    }

    public final FragmentManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("55fc71c6", new Object[]{this});
        }
        return this.b.getSupportFragmentManager();
    }

    public final ISupportFragment d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("6040d21", new Object[]{this});
        }
        return qxq.h(c());
    }

    public sdu e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdu) ipChange.ipc$dispatch("8985861a", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new sdu(this.f24374a);
        }
        return this.d;
    }

    public void f(int i, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c0c625", new Object[]{this, new Integer(i), iSupportFragment});
        } else {
            g(i, iSupportFragment, true, false);
        }
    }

    public void g(int i, ISupportFragment iSupportFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbe2b65", new Object[]{this, new Integer(i), iSupportFragment, new Boolean(z), new Boolean(z2)});
        } else {
            this.d.l(c(), i, iSupportFragment, z, z2);
        }
    }

    public void h(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.d = e();
        this.e = this.f24374a.onCreateFragmentAnimator();
    }

    public FragmentAnimator i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this});
        }
        return new DefaultHorizontalAnimator();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public boolean k(int i, KeyEvent keyEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ba32f5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        Fragment fragment = (Fragment) qxq.h(this.b.getSupportFragmentManager());
        if (fragment instanceof TBMainBaseFragment) {
            z = ((TBMainBaseFragment) fragment).onKeyDown(i, keyEvent);
        } else if ((fragment instanceof SupportFragment) && i == 4) {
            z = ((SupportFragment) fragment).onBackPressedSupport();
        }
        if (z || i != 4) {
            return z;
        }
        TBMainLog.tlog("SupportActivityDelegate", "onBackPressedSupport pop");
        l();
        return true;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e863a658", new Object[]{this});
            return;
        }
        TBMainLog.tlog("SupportActivityDelegate", "pop");
        this.d.n(c(), this.b);
    }

    public void m(Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735cb7aa", new Object[]{this, cls, new Boolean(z)});
        } else {
            n(cls, z, Integer.MAX_VALUE);
        }
    }

    public void n(Class<?> cls, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83ab099", new Object[]{this, cls, new Boolean(z), new Integer(i)});
        } else {
            this.d.o(cls.getName(), z, c(), i);
        }
    }

    public void o(ISupportFragment iSupportFragment, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5cd988", new Object[]{this, iSupportFragment, new Boolean(z)});
            return;
        }
        sdu sduVar = this.d;
        FragmentManager c = c();
        ISupportFragment d = d();
        if (z) {
            i = 10;
        } else {
            i = 11;
        }
        sduVar.d(c, d, iSupportFragment, 0, 0, i);
    }

    public void p(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a7c6a4", new Object[]{this, fragmentAnimator});
            return;
        }
        this.e = fragmentAnimator;
        for (Fragment fragment : qxq.e(c())) {
            if (fragment instanceof ISupportFragment) {
                pxq supportDelegate = ((ISupportFragment) fragment).getSupportDelegate();
                if (supportDelegate.m) {
                    FragmentAnimator copy = fragmentAnimator.copy();
                    supportDelegate.f26383a = copy;
                    sz0 sz0Var = supportDelegate.b;
                    if (sz0Var != null) {
                        sz0Var.l(copy);
                    }
                }
            }
        }
    }

    public void q(ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e146f0a", new Object[]{this, iSupportFragment});
        } else {
            r(iSupportFragment, 0);
        }
    }

    public void r(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4479e539", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.d.d(c(), d(), iSupportFragment, 0, i, 0);
        }
    }

    public void s(ISupportFragment iSupportFragment, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac334ea", new Object[]{this, iSupportFragment, new Integer(i), new Integer(i2)});
        } else {
            this.d.d(c(), d(), iSupportFragment, 0, i, i2);
        }
    }

    public void t(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36ebad7", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.d.d(c(), d(), iSupportFragment, i, 0, 1);
        }
    }
}
