package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import java.util.List;
import tb.rj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20632a = false;

    static {
        t2o.a(81788932);
    }

    public static void a(Context context, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c5a7e3", new Object[]{context, fragmentManager});
            return;
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            b("ERROR_FROM_(dismissFragments)_BY_".concat(context.getClass().getSimpleName()), "getIntent empty");
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof bbb) {
                ((bbb) fragment).dismiss();
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da7dd04", new Object[]{str, str2});
        } else {
            rj.c(rj.a.a("AURAContainerWrapperTracker").message(str2).tag(str).sampling(0.01f));
        }
    }

    public static Fragment c(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("3af60562", new Object[]{fragmentManager});
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            b("ERROR_FRAGMENT_EMPTY_FROM_(findFragmentContainer)", "findFragmentContainer exception");
            return null;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof bbb) {
                return fragment;
            }
        }
        return null;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248dd6e", new Object[]{context});
        } else {
            e(context, null);
        }
    }

    public static void e(Context context, x3e<String> x3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fce8edd", new Object[]{context, x3eVar});
        } else if (!f20632a || !(context instanceof Activity)) {
            try {
            } catch (Throwable th) {
                if (x3eVar != null) {
                    x3eVar.a(th.getMessage());
                }
                b("ERROR_FROM_(finish)_BY_".concat(context.getClass().getSimpleName()), th.getMessage());
            }
            if (context instanceof bbb) {
                ((bbb) context).dismiss();
                return;
            }
            if ((context instanceof FragmentActivity) && TBMainHost.b().getContext() == context) {
                a(context, ((FragmentActivity) context).getSupportFragmentManager());
                return;
            }
            if (context instanceof Activity) {
                b("WARNING_FROM_(finish)_BY_".concat(context.getClass().getSimpleName()), "finish exception");
                ((Activity) context).finish();
            }
        } else if (context instanceof bbb) {
            ((bbb) context).dismiss();
        } else {
            ((Activity) context).finish();
        }
    }

    public static Object f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9242d2bc", new Object[]{context});
        }
        return g(context, null);
    }

    public static Object g(Context context, x3e<String> x3eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("455c6b2d", new Object[]{context, x3eVar});
        }
        if (f20632a && (context instanceof Activity)) {
            return context;
        }
        try {
        } catch (Throwable th) {
            if (x3eVar != null) {
                x3eVar.a("getIntent empty");
            }
            b("ERROR_FROM_(getIntent)_BY_".concat(context.getClass().getSimpleName()), th.getMessage());
        }
        if (context instanceof bbb) {
            return context;
        }
        if ((context instanceof FragmentActivity) && TBMainHost.b().getContext() == context) {
            return c(((FragmentActivity) context).getSupportFragmentManager());
        }
        if (context != null) {
            str = context.getClass().getSimpleName();
        } else {
            str = "";
        }
        b("WARNING_FROM_(getContainer)_BY_".concat(str), "getContainer exception");
        return context;
    }

    public static Intent h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("1bde3f64", new Object[]{context});
        }
        return i(context, null);
    }

    public static Intent i(Context context, x3e<String> x3eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b1b01ad5", new Object[]{context, x3eVar});
        }
        if (f20632a && (context instanceof Activity)) {
            return ((Activity) context).getIntent();
        }
        try {
        } catch (Throwable th) {
            if (x3eVar != null) {
                x3eVar.a(th.getMessage());
            }
            b("ERROR_FROM_(getIntent)_BY_".concat(context.getClass().getSimpleName()), th.getMessage());
        }
        if (context instanceof bbb) {
            return ((bbb) context).A0();
        }
        if ((context instanceof FragmentActivity) && TBMainHost.b().getContext() == context) {
            return j(context, ((FragmentActivity) context).getSupportFragmentManager());
        }
        if (context instanceof Activity) {
            b("WARNING_FROM_(getIntent)_BY_".concat(context.getClass().getSimpleName()), "getIntent exception");
            return ((Activity) context).getIntent();
        }
        if (x3eVar != null) {
            x3eVar.a("getIntent empty");
        }
        if (context != null) {
            str = context.getClass().getSimpleName();
        } else {
            str = "null";
        }
        b("ERROR_INTENT_EMPTY_FROM_(getIntent)_BY_".concat(str), "getIntent empty");
        return null;
    }

    public static Intent j(Context context, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3a4b6ea2", new Object[]{context, fragmentManager});
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            b("ERROR_INTENT_EMPTY_FROM_(getIntentFromFragments)_BY_".concat(context.getClass().getSimpleName()), "dismissFragments exception");
            return null;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof bbb) {
                return ((bbb) fragment).A0();
            }
        }
        return null;
    }
}
