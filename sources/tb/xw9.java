package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xw9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946360);
    }

    public static void a(Fragment fragment, Fragment fragment2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36d5bac", new Object[]{fragment, fragment2});
            return;
        }
        FragmentTransaction beginTransaction = fragment.getChildFragmentManager().beginTransaction();
        int i = R.anim.no_anim;
        beginTransaction.setCustomAnimations(i, i).attach(fragment2).commitNowAllowingStateLoss();
    }

    public static void b(Fragment fragment, Fragment fragment2, Context context) {
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e766c065", new Object[]{fragment, fragment2, context});
        } else if (fragment != null && fragment.isAdded()) {
            if (fragment instanceof TBMainFragment) {
                TBFragmentTabHost o = a.o();
                if (o != null && (currentFragment = o.getCurrentFragment()) != null) {
                    if (currentFragment instanceof SupportFragment) {
                        ((SupportFragment) currentFragment).onSupportPreInVisible();
                    }
                    if (nx9.s() && TextUtils.equals("mytaobao", currentFragment.getTag()) && currentFragment.isAdded()) {
                        TBMainLog.tlog("FragmentLifeCycleHelper", "doOnPauseAndOnStop, detach current fragment: " + currentFragment.getClass());
                        int i = R.anim.h_fragment_detach_enter;
                        int i2 = R.anim.h_fragment_detach_exit;
                        if (nx9.t()) {
                            i = R.anim.no_anim;
                            i2 = i;
                        }
                        fragment.getChildFragmentManager().beginTransaction().setCustomAnimations(i, i2).detach(currentFragment).commitNowAllowingStateLoss();
                        return;
                    } else if (TextUtils.equals("homePage", currentFragment.getTag())) {
                        fragment = currentFragment;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            TBMainLog.tlog("FragmentLifeCycleHelper", "into fromF: " + fragment.getClass() + ".onPause(), homeFragment.onStop()");
            e(fragment, context);
            h(fragment, context);
        }
    }

    public static void d(Fragment fragment, Fragment fragment2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881acb59", new Object[]{fragment, fragment2, context});
            return;
        }
        TBMainLog.tlog("FragmentLifeCycleHelper", "doOnStartAndOnResume, attach current fragment: " + fragment2.getClass());
        try {
            a(fragment, fragment2);
        } catch (Throwable th) {
            TLog.loge("FragmentLifeCycleHelper", "doOnStartAndOnResume, attach current fragment error: " + th);
            har.a("doOnStartAndOnResume_attach_error", "fragment" + fragment2.getClass());
            try {
                if (!nx9.t()) {
                    View view = fragment2.getView();
                    if (view == null) {
                        Nav.from(context).toUri("http://m.taobao.com/index.htm");
                        return;
                    }
                    view.clearAnimation();
                    ((ViewGroup) view.getParent()).endViewTransition(view);
                    a(fragment, fragment2);
                    return;
                }
                Nav.from(context).toUri("http://m.taobao.com/index.htm");
            } catch (Throwable th2) {
                TLog.loge("FragmentLifeCycleHelper", "doOnStartAndOnResume, remove current fragment error: " + th2);
                har.a("doOnStartAndOnResume_attach_error_again", "fragment" + fragment2.getClass());
                Nav.from(context).toUri("http://m.taobao.com/index.htm");
            }
        }
    }

    public static void e(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2887d834", new Object[]{fragment, context});
        } else {
            fragment.onPause();
        }
    }

    public static void f(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347a4afb", new Object[]{fragment, context});
        } else {
            fragment.onResume();
        }
    }

    public static void g(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d11148", new Object[]{fragment, context});
        } else {
            fragment.onStart();
        }
    }

    public static void h(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06df706", new Object[]{fragment, context});
        } else {
            fragment.onStop();
        }
    }

    public static void c(Fragment fragment, Context context) {
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135266fe", new Object[]{fragment, context});
        } else if (fragment != null && fragment.isAdded()) {
            qxq.n(true);
            if (fragment instanceof TBMainFragment) {
                TBFragmentTabHost o = a.o();
                if (o != null && (currentFragment = o.getCurrentFragment()) != null) {
                    if (nx9.s() && TextUtils.equals("mytaobao", currentFragment.getTag()) && !currentFragment.isAdded()) {
                        d(fragment, currentFragment, context);
                    }
                    if (TextUtils.equals("homePage", currentFragment.getTag())) {
                        fragment = currentFragment;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            TBMainLog.tlog("FragmentLifeCycleHelper", "into toF: " + fragment.getClass() + "onStart(), homeFragment.onResume()");
            g(fragment, context);
            f(fragment, context);
        }
    }
}
