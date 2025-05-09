package tb;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_AP_FULL_SIZE = 375;
    public static final int DEFAULT_AP_FULL_SIZE_NATIVE = 360;
    public static final i6v INSTANCE = new i6v();
    public static final int STANDARD_AP_FULL_SIZE = 750;

    public final float a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aae4733a", new Object[]{this, new Integer(i)})).floatValue();
        }
        Application application = Globals.getApplication();
        ckf.f(application, "Globals.getApplication()");
        Resources resources = application.getResources();
        ckf.f(resources, "Globals.getApplication().resources");
        return (((i * 360) / 750) * resources.getDisplayMetrics().density) + 0.5f;
    }

    public final RateFeedsFragment b(FragmentManager fragmentManager, y7 y7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateFeedsFragment) ipChange.ipc$dispatch("783687a9", new Object[]{this, fragmentManager, y7Var});
        }
        ArrayList arrayList = new ArrayList();
        List<Fragment> fragments = fragmentManager.getFragments();
        ckf.f(fragments, "parentManage.fragments");
        for (Fragment fragment : fragments) {
            if (fragment != null) {
                if (fragment instanceof RateFeedsFragment) {
                    arrayList.add(fragment);
                }
                f(fragment, arrayList);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RateFeedsFragment rateFeedsFragment = (RateFeedsFragment) it.next();
            if (ckf.b(rateFeedsFragment.C2(), y7Var)) {
                return rateFeedsFragment;
            }
        }
        return null;
    }

    public final int c(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("699f52a7", new Object[]{this, new Boolean(z), str, str2})).intValue();
        }
        ckf.g(str, "checkedColorStr");
        ckf.g(str2, "uncheckedColorStr");
        if (!z) {
            str = str2;
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return Color.parseColor("#FFFFFF");
        }
    }

    public final RateFeedsFragment d(FragmentActivity fragmentActivity, y7 y7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateFeedsFragment) ipChange.ipc$dispatch("4ce3b3d4", new Object[]{this, fragmentActivity, y7Var});
        }
        ckf.g(fragmentActivity, "activity");
        if (y7Var == null) {
            return null;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        ckf.f(supportFragmentManager, "activity.supportFragmentManager");
        if (supportFragmentManager.getFragments().size() <= 0) {
            return null;
        }
        FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
        ckf.f(supportFragmentManager2, "activity.supportFragmentManager");
        Fragment fragment = supportFragmentManager2.getFragments().get(0);
        if (fragment instanceof RateFeedsFragment) {
            return (RateFeedsFragment) fragment;
        }
        FragmentManager supportFragmentManager3 = fragmentActivity.getSupportFragmentManager();
        ckf.f(supportFragmentManager3, "activity.supportFragmentManager");
        return b(supportFragmentManager3, y7Var);
    }

    public final boolean e(Context context) {
        Integer num;
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f50167c", new Object[]{this, context})).booleanValue();
        }
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(configuration.uiMode & 48);
        }
        if (num != null && num.intValue() == 32) {
            return true;
        }
        return false;
    }

    public final void f(Fragment fragment, List<RateFeedsFragment> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303d83c5", new Object[]{this, fragment, list});
            return;
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        ckf.f(childFragmentManager, "fragment.childFragmentManager");
        List<Fragment> fragments = childFragmentManager.getFragments();
        ckf.f(fragments, "fragment.childFragmentManager.fragments");
        for (Fragment fragment2 : fragments) {
            if (fragment2 != null) {
                if (fragment2 instanceof RateFeedsFragment) {
                    list.add(fragment2);
                }
                f(fragment2, list);
            }
        }
    }

    public final int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6105ee1", new Object[]{this, new Integer(i)})).intValue();
        }
        Application application = Globals.getApplication();
        ckf.f(application, "Globals.getApplication()");
        Resources resources = application.getResources();
        ckf.f(resources, "Globals.getApplication().resources");
        return (i * 375) / resources.getDisplayMetrics().widthPixels;
    }
}
