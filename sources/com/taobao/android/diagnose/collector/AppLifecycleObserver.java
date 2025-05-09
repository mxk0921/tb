package com.taobao.android.diagnose.collector;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.AppLifecycleObserver;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.tao.log.logger.EventLogger;
import com.taobao.tao.log.logger.PageLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import tb.bjo;
import tb.fjo;
import tb.idh;
import tb.mk7;
import tb.qk7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppLifecycleObserver implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final qk7 b;
    public final Executor c;
    public final fjo d;

    /* renamed from: a  reason: collision with root package name */
    public int f7242a = 0;
    public boolean e = false;
    public long f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class FragmentLifecycle extends FragmentManager.FragmentLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f7243a;

        static {
            t2o.a(615514129);
        }

        public FragmentLifecycle(Activity activity) {
            this.f7243a = activity;
        }

        public static /* synthetic */ Object ipc$super(FragmentLifecycle fragmentLifecycle, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1791925260) {
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            } else if (hashCode == -938247425) {
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            } else if (hashCode == -378518774) {
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/diagnose/collector/AppLifecycleObserver$FragmentLifecycle");
            }
        }

        public final /* synthetic */ void b(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d21df196", new Object[]{this, fragment});
            } else {
                PageLogger.builder(2, PageInfo.getPageID(this.f7243a)).setPageName(fragment.getClass().getName()).setPageType(2).setData(AppLifecycleObserver.d(AppLifecycleObserver.this)).log();
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            } else {
                super.onFragmentPaused(fragmentManager, fragment);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fragmentManager, final Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                return;
            }
            super.onFragmentResumed(fragmentManager, fragment);
            AppLifecycleObserver.c(AppLifecycleObserver.this).execute(new Runnable() { // from class: tb.i61
                @Override // java.lang.Runnable
                public final void run() {
                    AppLifecycleObserver.FragmentLifecycle.this.b(fragment);
                }
            });
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
                return;
            }
            super.onFragmentStarted(fragmentManager, fragment);
            AppLifecycleObserver.b(AppLifecycleObserver.this).t(fragment);
        }
    }

    static {
        t2o.a(615514128);
    }

    public AppLifecycleObserver(qk7 qk7Var, Executor executor, fjo fjoVar) {
        this.b = qk7Var;
        this.c = executor;
        this.d = fjoVar;
    }

    public static /* synthetic */ qk7 b(AppLifecycleObserver appLifecycleObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qk7) ipChange.ipc$dispatch("7abfeeae", new Object[]{appLifecycleObserver});
        }
        return appLifecycleObserver.b;
    }

    public static /* synthetic */ Executor c(AppLifecycleObserver appLifecycleObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("f4cd7cae", new Object[]{appLifecycleObserver});
        }
        return appLifecycleObserver.c;
    }

    public static /* synthetic */ Map d(AppLifecycleObserver appLifecycleObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ec2d55de", new Object[]{appLifecycleObserver});
        }
        return appLifecycleObserver.e();
    }

    public final /* synthetic */ void f(PageInfo pageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abebbfb5", new Object[]{this, pageInfo});
            return;
        }
        PageLogger data = PageLogger.builder(2, pageInfo.getPageID()).setPageType(1).setPageName(pageInfo.getPageName()).setData(e());
        if (pageInfo.isUrlChanged()) {
            data.setPageUrl(pageInfo.getPageUrl());
            pageInfo.setUrlChanged(false);
        }
        data.log();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        try {
            this.b.n(activity);
        } catch (Exception e) {
            idh.c("AppLifecycleObserver", "onActivityDestroyed", e);
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
            final PageInfo h = this.b.h(activity);
            if (h == null) {
                h = this.b.b(activity);
            } else {
                this.b.v(h);
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                h.setPageUrl(intent.getDataString());
            }
            this.c.execute(new Runnable() { // from class: tb.h61
                @Override // java.lang.Runnable
                public final void run() {
                    AppLifecycleObserver.this.f(h);
                }
            });
        } catch (Exception e) {
            idh.c("AppLifecycleObserver", "onActivityResumed", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (bundle == null) {
            try {
                this.b.b(activity);
                if (activity instanceof FragmentActivity) {
                    ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentLifecycle(activity), true);
                }
            } catch (Exception e) {
                idh.c("AppLifecycleObserver", "onActivityCreated", e);
            }
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
            this.b.o();
            PageLogger.builder(3, PageInfo.getPageID(activity)).setPageType(1).setPageName(activity.getClass().getName()).log(this.c);
        } catch (Exception e) {
            idh.c("AppLifecycleObserver", "onActivityPaused", e);
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
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.e = isChangingConfigurations;
            int i = this.f7242a - 1;
            this.f7242a = i;
            if (i == 0 && !isChangingConfigurations) {
                this.b.p(true);
                EventLogger.builder(3).setPageID(PageInfo.getPageID(activity)).log(this.c);
            }
        } catch (Exception e) {
            idh.c("AppLifecycleObserver", "onActivityStopped", e);
        }
    }

    public final Map<String, String> e() {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5b4e5ec", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f < mk7.n.checkInterval) {
            return null;
        }
        this.f = currentTimeMillis;
        try {
            bjo j = this.d.j();
            String b = j.b(bjo.DALVIK_USED);
            String b2 = j.b(bjo.DALVIK_USED_RATIO);
            String b3 = j.b(bjo.NATIVE_HEAP_USED);
            String b4 = j.b(bjo.GC_ALLOC_SIZE);
            String b5 = j.b(bjo.GC_FREE_SIZE);
            String b6 = j.b(bjo.GC_COUNT);
            try {
                String b7 = j.b(bjo.GC_TIME);
                String b8 = j.b(bjo.GC_BLOCK_COUNT);
                String b9 = j.b(bjo.GC_BLOCK_TIME);
                String b10 = j.b(bjo.GL_DEV_MEM);
                String b11 = j.b(bjo.GL_MEM);
                String b12 = j.b(bjo.GRAPHICS_MEM);
                HashMap hashMap = new HashMap();
                hashMap.put(bjo.DALVIK_USED, b);
                hashMap.put(bjo.DALVIK_USED_RATIO, b2);
                hashMap.put(bjo.GC_ALLOC_SIZE, b4);
                hashMap.put(bjo.GC_FREE_SIZE, b5);
                hashMap.put(bjo.GC_COUNT, b6);
                hashMap.put(bjo.GC_TIME, b7);
                hashMap.put(bjo.GC_BLOCK_COUNT, b8);
                hashMap.put(bjo.GC_BLOCK_TIME, b9);
                hashMap.put(bjo.GL_DEV_MEM, b10);
                hashMap.put(bjo.GL_MEM, b11);
                hashMap.put(bjo.GRAPHICS_MEM, b12);
                hashMap.put(bjo.NATIVE_HEAP_USED, b3);
                PageInfo k = this.b.k();
                if (k != null) {
                    k.addPageFlags(hashMap);
                }
                return hashMap;
            } catch (Exception e2) {
                e = e2;
                idh.c("AppLifecycleObserver", "getRuntimeInfo", e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
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
            int i = this.f7242a + 1;
            this.f7242a = i;
            if (i == 1 && !this.e) {
                this.b.p(false);
                EventLogger.builder(2).setPageID(PageInfo.getPageID(activity)).log(this.c);
            }
        } catch (Exception e) {
            idh.c("AppLifecycleObserver", "onActivityStarted", e);
        }
    }
}
