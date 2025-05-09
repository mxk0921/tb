package com.taobao.falco;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.c21;
import tb.t11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoNativePageLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks implements t11, ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FalcoNativePageLifecycleCallbacks e = new FalcoNativePageLifecycleCallbacks();
    public WeakReference<Activity> d;
    public Context o;
    public int p;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f10451a = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<b> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ComponentCallbacks2> c = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<c> n = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivitySaveInstanceState(Activity activity, Bundle bundle);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle);

        void b(FragmentManager fragmentManager, Fragment fragment);

        void c(FragmentManager fragmentManager, Fragment fragment);

        void d(FragmentManager fragmentManager, Fragment fragment);

        void e(FragmentManager fragmentManager, Fragment fragment);

        void f(FragmentManager fragmentManager, Fragment fragment);

        void g(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        void h(FragmentManager fragmentManager, Fragment fragment);

        void i(FragmentManager fragmentManager, Fragment fragment, Context context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void onChanged(boolean z);
    }

    public static FalcoNativePageLifecycleCallbacks a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoNativePageLifecycleCallbacks) ipChange.ipc$dispatch("5d98fe31", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(FalcoNativePageLifecycleCallbacks falcoNativePageLifecycleCallbacks, String str, Object... objArr) {
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
            case -588941558:
                super.onFragmentViewCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (View) objArr[2], (Bundle) objArr[3]);
                return null;
            case -378518774:
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -228225358:
                super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case 1774959972:
                super.onFragmentPreAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoNativePageLifecycleCallbacks");
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            this.o = context;
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(this);
            } else {
                c21.a(this, true);
            }
            Activity i = c21.i();
            if (i != null) {
                d(i);
                this.d = new WeakReference<>(i);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[init] init error", null, th, new Object[0]);
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cc2955", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f10451a.add(aVar);
        }
    }

    public final void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5ab050", new Object[]{this, activity});
        } else if (activity instanceof FragmentActivity) {
            WeakReference<Activity> weakReference = this.d;
            if (weakReference == null || weakReference.get() != activity) {
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this, true);
            }
        }
    }

    public void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b7735", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.b.add(bVar);
        }
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.o;
    }

    public void g(c cVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c980c9", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.n.add(cVar);
            if (this.p <= 0) {
                z = false;
            }
            cVar.onChanged(z);
        }
    }

    public void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3204c50", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.n.remove(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        try {
            d(activity);
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivityCreated(activity, bundle);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityCreated] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivityDestroyed(activity);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityDestroyed] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivityPaused(activity);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityPaused] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivityResumed(activity);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityResumed] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        try {
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivitySaveInstanceState(activity, bundle);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivitySaveInstanceState] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        try {
            this.p++;
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivityStarted(activity);
            }
            if (this.p == 1) {
                Iterator<c> it2 = this.n.iterator();
                while (it2.hasNext()) {
                    it2.next().onChanged(true);
                }
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityStarted] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        try {
            int i = this.p - 1;
            this.p = i;
            if (i < 0) {
                this.p = 0;
            }
            Iterator<a> it = this.f10451a.iterator();
            while (it.hasNext()) {
                it.next().onActivityStopped(activity);
            }
            if (this.p == 0) {
                Iterator<c> it2 = this.n.iterator();
                while (it2.hasNext()) {
                    it2.next().onChanged(false);
                }
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityStopped] error", null, th, new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().g(fragmentManager, fragment, bundle);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentCreated] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().f(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentDestroyed] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().c(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentPaused] error", null, th, new Object[0]);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
            return;
        }
        super.onFragmentPreAttached(fragmentManager, fragment, context);
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().i(fragmentManager, fragment, context);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentCreated] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().h(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentResumed] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().e(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentStarted] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().b(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentStopped] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(fragmentManager, fragment, view, bundle);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentViewCreated] error", null, th, new Object[0]);
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
        try {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().d(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentViewDestroyed] error", null, th, new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        try {
            Iterator<ComponentCallbacks2> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().onLowMemory();
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onTrimMemory] error", null, th, new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            Iterator<ComponentCallbacks2> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onTrimMemory] error", null, th, new Object[0]);
        }
    }
}
