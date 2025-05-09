package com.taobao.monitor.impl.data.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cll;
import tb.e81;
import tb.gll;
import tb.hx9;
import tb.hy9;
import tb.ic;
import tb.jhg;
import tb.m15;
import tb.nca;
import tb.o48;
import tb.out;
import tb.xol;
import tb.y9a;
import tb.yq7;
import tb.zq6;
import tb.zzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FragmentLifecycle extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<WeakReference<Fragment>, Long> f = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Fragment, IPage> f11085a = new HashMap();
    public final f b;
    public final Activity c;
    public final String d;
    public final IPage e;

    public FragmentLifecycle(Activity activity, IPage iPage, String str) {
        this.c = activity;
        this.d = str;
        this.e = iPage;
        zzb<?> a2 = ic.a(ic.FRAGMENT_LIFECYCLE_DISPATCHER);
        if (a2 instanceof f) {
            this.b = (f) a2;
        }
    }

    public static long a(Fragment fragment) {
        Fragment fragment2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69bfb9ce", new Object[]{fragment})).longValue();
        }
        for (Map.Entry entry : ((ConcurrentHashMap) f).entrySet()) {
            if (!(entry.getKey() == null || (fragment2 = (Fragment) ((WeakReference) entry.getKey()).get()) == null || fragment2 != fragment)) {
                return ((Long) entry.getValue()).longValue();
            }
        }
        return -1L;
    }

    public static /* synthetic */ Object ipc$super(FragmentLifecycle fragmentLifecycle, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2028521039:
                super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case -1819213449:
                super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1791925260:
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1704408514:
                super.onFragmentStopped((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -938247425:
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -701661701:
                super.onFragmentDetached((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -588941558:
                super.onFragmentViewCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (View) objArr[2], (Bundle) objArr[3]);
                return null;
            case -378518774:
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -228225358:
                super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case 734979916:
                super.onFragmentPreCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 1276074722:
                super.onFragmentActivityCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 1295531464:
                super.onFragmentSaveInstanceState((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 1773789023:
                super.onFragmentAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                return null;
            case 1774959972:
                super.onFragmentPreAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/data/lifecycle/FragmentLifecycle");
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f5ae2", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        e(fragment, "onFragmentActivityCreated");
        if (!yq7.c(this.b)) {
            this.b.e(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b9df5f", new Object[]{this, fragmentManager, fragment, context});
            return;
        }
        super.onFragmentAttached(fragmentManager, fragment, context);
        e(fragment, "onFragmentAttached");
        if (!yq7.c(this.b)) {
            this.b.f(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        e(fragment, "onFragmentCreated");
        if (!yq7.c(this.b)) {
            this.b.g(fragment, out.a());
        }
        IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
        if (iPage instanceof cll) {
            ((cll) iPage).d().a(jhg.RECOVERY_FROM_SAVED_INSTANCE, bundle == null ? null : bundle.getString("apmFragmentRecovery"));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDestroyed(fragmentManager, fragment);
        e(fragment, "onFragmentDestroyed");
        if (!yq7.c(this.b)) {
            this.b.h(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d7dfb", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDetached(fragmentManager, fragment);
        e(fragment, "onFragmentDetached");
        IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
        if (iPage != null) {
            iPage.e().onPageDestroy();
            ProcedureGlobal.PROCEDURE_MANAGER.E(iPage);
            ((HashMap) this.f11085a).remove(fragment);
        }
        if (!yq7.c(this.b)) {
            this.b.i(fragment, out.a());
        }
        Iterator it = ((ConcurrentHashMap) f).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null || ((WeakReference) entry.getKey()).get() == null || ((WeakReference) entry.getKey()).get() == fragment) {
                it.remove();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        IpChange ipChange2 = nca.$ipChange;
        IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
        if (o48.s) {
            if (iPage instanceof cll) {
                cll cllVar = (cll) iPage;
                if (cllVar.e() instanceof m15) {
                    cllVar.e().onPageDisappear();
                }
            }
        } else if (iPage instanceof cll) {
            cll cllVar2 = (cll) iPage;
            if (cllVar2.e() instanceof m15) {
                ((m15) cllVar2.e()).d();
            }
        }
        e(fragment, "onFragmentPaused");
        if (!yq7.c(this.b)) {
            this.b.j(fragment, out.a());
        }
        hy9.a().f(iPage);
        e81.b().i("currFragmentName");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
            return;
        }
        super.onFragmentPreAttached(fragmentManager, fragment, context);
        String c = c(this.c, fragment);
        IPage a2 = new gll().e(fragment).n(this.c.getWindow()).o(this.e).f(this.d).a();
        ((HashMap) this.f11085a).put(fragment, a2);
        ProcedureGlobal.PROCEDURE_MANAGER.C(fragment, a2);
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.containsKey(y9a.CLICK_STAGE)) {
            a2.c().K(arguments.getLong(y9a.CLICK_STAGE));
        }
        a2.e().a(xol.c(fragment), c, b(this.c, fragment));
        e(fragment, "onFragmentPreAttached");
        if (!yq7.c(this.b)) {
            this.b.k(fragment, out.a());
        }
        ((ConcurrentHashMap) f).put(new WeakReference(fragment), Long.valueOf(out.a()));
        if (d(fragment)) {
            String str = nca.q;
            e81.b().g("lastJumpPageSchemaUrl", str);
            nca.q = c(this.c, fragment);
            if (a2 instanceof cll) {
                ((cll) a2).U(str);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bcee74c", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentPreCreated(fragmentManager, fragment, bundle);
        e(fragment, "onFragmentPreCreated");
        if (!yq7.c(this.b)) {
            this.b.l(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        xol.a(fragment);
        IpChange ipChange2 = nca.$ipChange;
        IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
        if (iPage != null) {
            iPage.e().onPageAppear();
        }
        if (d(fragment)) {
            nca.q = c(this.c, fragment);
            if (iPage instanceof cll) {
                e81.b().g("lastJumpPageSchemaUrl", ((cll) iPage).s());
            }
        }
        e(fragment, "onFragmentResumed");
        if (!yq7.c(this.b)) {
            this.b.m(fragment, out.a());
        }
        hy9.a().c(iPage);
        e81.b().g("currFragmentName", xol.a(fragment));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d383dc8", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
        e(fragment, "onFragmentSaveInstanceState");
        if (!yq7.c(this.b)) {
            this.b.n(fragment, out.a());
        }
        IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
        if (iPage instanceof cll) {
            bundle.putString("apmFragmentRecovery", ((cll) iPage).b());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStarted(fragmentManager, fragment);
        e(fragment, "onFragmentStarted");
        if (!yq7.c(this.b)) {
            this.b.o(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStopped(fragmentManager, fragment);
        if (!o48.s) {
            IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
            if (iPage instanceof cll) {
                ((cll) iPage).e().onPageDisappear();
            }
        }
        e(fragment, "onFragmentStopped");
        if (!yq7.c(this.b)) {
            this.b.p(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
            return;
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        e(fragment, "onFragmentViewCreated");
        if (!yq7.c(this.b)) {
            this.b.q(fragment, out.a());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        e(fragment, "onFragmentViewDestroyed");
        if (!yq7.c(this.b)) {
            this.b.r(fragment, out.a());
        }
    }

    public final String c(Activity activity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d11b2d7", new Object[]{this, activity, fragment});
        }
        Bundle arguments = fragment.getArguments();
        if (arguments == null || !arguments.getBoolean(hx9.KEY_FRAGMENT_IS_FRAGMENT_MODEL, false)) {
            return xol.b(activity);
        }
        Object obj = arguments.get(hx9.KEY_FRAGMENT_URL);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public final Map<String, Object> b(Activity activity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67e9ea1e", new Object[]{this, activity, fragment});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityName", xol.c(activity));
        hashMap.put("fullPageName", xol.a(fragment));
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            if (arguments.getBoolean(hx9.KEY_FRAGMENT_IS_FRAGMENT_MODEL, false)) {
                hashMap.put(hx9.KEY_FRAGMENT_IS_FRAGMENT_MODEL, Boolean.TRUE);
                hashMap.put("navStartTime", Long.valueOf(out.b(arguments.getLong("NAV_TO_URL_START_TIME", -1L))));
                hashMap.put("navStartPageTime", Long.valueOf(out.b(arguments.getLong(hx9.KEY_FRAGMENT_START_TIME, -1L))));
            }
            hashMap.put("constructPageTime", Long.valueOf(arguments.getLong(y9a.CONSTRUCT_PAGE_STAGE)));
        }
        if (!hashMap.containsKey("navStartTime")) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    hashMap.put("navStartTime", Long.valueOf(out.b(intent.getLongExtra("NAV_TO_URL_START_TIME", -1L))));
                    hashMap.put("navStartPageTime", Long.valueOf(out.b(intent.getLongExtra("NAV_START_ACTIVITY_TIME", -1L))));
                }
            } catch (Exception e) {
                zq6.a("FragmentLifecycle", e);
            }
        }
        return hashMap;
    }

    public final boolean d(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0a8ed9", new Object[]{this, fragment})).booleanValue();
        }
        Bundle arguments = fragment.getArguments();
        return arguments != null && arguments.getBoolean(hx9.KEY_FRAGMENT_IS_FRAGMENT_MODEL, false);
    }

    public final void e(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b045d1f", new Object[]{this, fragment, str});
            return;
        }
        IPage iPage = (IPage) ((HashMap) this.f11085a).get(fragment);
        if (iPage == null) {
            zq6.b("PageLifeCycle", "nonFragmentPageSession", xol.a(fragment), str);
        } else {
            zq6.b("PageLifeCycle", iPage.b(), xol.a(fragment), str);
        }
    }
}
