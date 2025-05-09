package com.taobao.android.weex.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.dwh;
import tb.f9x;
import tb.hxh;
import tb.t2o;
import tb.vvh;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexInstanceChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Activity, b> f9927a;
    public final List<d> b;
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum LifecycleStatus {
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LifecycleStatus lifecycleStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexInstanceChecker$LifecycleStatus");
        }

        public static LifecycleStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LifecycleStatus) ipChange.ipc$dispatch("59915807", new Object[]{str});
            }
            return (LifecycleStatus) Enum.valueOf(LifecycleStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.weex.util.WeexInstanceChecker$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0515a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Activity d;

            public C0515a(Activity activity) {
                this.d = activity;
            }

            public static /* synthetic */ Object ipc$super(C0515a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexInstanceChecker$1$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                } else {
                    WeexInstanceChecker.b(WeexInstanceChecker.this, this.d);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Activity d;

            public b(Activity activity) {
                this.d = activity;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/util/WeexInstanceChecker$1$2");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                WeexInstanceChecker.c(WeexInstanceChecker.this, this.d);
                WeexInstanceChecker.d(WeexInstanceChecker.this).remove(this.d);
            }
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                hxh.e(new b(activity), 2000);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f9929a = LifecycleStatus.PAUSED;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f9929a = LifecycleStatus.RESUMED;
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
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f9929a = LifecycleStatus.STARTED;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f9929a = LifecycleStatus.STOPPED;
            hxh.d(new C0515a(activity));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public LifecycleStatus f9929a = LifecycleStatus.RESUMED;
        public final Map<WeexInstanceImpl, LifecycleStatus> b = new HashMap();

        static {
            t2o.a(982515962);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static final WeexInstanceChecker INST = new WeexInstanceChecker(null);

        static {
            t2o.a(982515963);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final WeexInstanceInternalMode f9930a;
        public int b;
        public final Set<WeexInstanceImpl> c = new HashSet();

        static {
            t2o.a(982515964);
        }

        public d(WeexInstanceInternalMode weexInstanceInternalMode) {
            this.f9930a = weexInstanceInternalMode;
        }
    }

    static {
        t2o.a(982515958);
    }

    public /* synthetic */ WeexInstanceChecker(a aVar) {
        this();
    }

    public static /* synthetic */ b a(WeexInstanceChecker weexInstanceChecker, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6709a986", new Object[]{weexInstanceChecker, activity});
        }
        return weexInstanceChecker.g(activity);
    }

    public static /* synthetic */ void b(WeexInstanceChecker weexInstanceChecker, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c3fccd", new Object[]{weexInstanceChecker, activity});
        } else {
            weexInstanceChecker.l(activity);
        }
    }

    public static /* synthetic */ void c(WeexInstanceChecker weexInstanceChecker, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ecdf0e", new Object[]{weexInstanceChecker, activity});
        } else {
            weexInstanceChecker.k(activity);
        }
    }

    public static /* synthetic */ WeakHashMap d(WeexInstanceChecker weexInstanceChecker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakHashMap) ipChange.ipc$dispatch("8e272ff8", new Object[]{weexInstanceChecker});
        }
        return weexInstanceChecker.f9927a;
    }

    public static WeexInstanceChecker h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceChecker) ipChange.ipc$dispatch("fc884806", new Object[0]);
        }
        return c.INST;
    }

    public Activity e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("812715d0", new Object[]{this});
        }
        if (!this.c) {
            return null;
        }
        if (!hxh.a()) {
            f9x.b(false, "WeexDebug包检测, anyActivity必须在主线程");
        }
        for (Activity activity : this.f9927a.keySet()) {
            if (activity != null && activity.hasWindowFocus() && !activity.isFinishing() && activity.getWindow() != null) {
                return activity;
            }
        }
        return null;
    }

    public final void f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80249f5", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f9930a == WeexInstanceInternalMode.MUS) {
                if (dVar.b >= 100) {
                    z = true;
                }
            } else if (dVar.b >= 20) {
                z = true;
            }
        }
        if (z) {
            dwh.s("Weex存活实例数量过多, 检查log查看数量");
            dwh.f("CHECKER", "All Weex Instance:");
            Iterator it2 = ((ArrayList) this.b).iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                dwh.f("CHECKER", "  Type " + dVar2.f9930a + " count: " + dVar2.b);
                Iterator it3 = ((HashSet) dVar2.c).iterator();
                while (it3.hasNext()) {
                    dwh.f("CHECKER", "    " + ((WeexInstanceImpl) it3.next()));
                }
            }
        }
    }

    public final b g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("31c942c0", new Object[]{this, activity});
        }
        b bVar = this.f9927a.get(activity);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f9927a.put(activity, bVar2);
        return bVar2;
    }

    public final void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        for (WeexInstanceInternalMode weexInstanceInternalMode : WeexInstanceInternalMode.values()) {
            ((ArrayList) this.b).add(new d(weexInstanceInternalMode));
        }
        application.registerActivityLifecycleCallbacks(new a());
    }

    public final void j(WeexInstanceImpl weexInstanceImpl, LifecycleStatus lifecycleStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23452789", new Object[]{this, weexInstanceImpl, lifecycleStatus});
        } else if (this.c) {
            synchronized (this) {
                try {
                    Context context = weexInstanceImpl.getContext();
                    if (context instanceof Activity) {
                        b bVar = this.f9927a.get((Activity) context);
                        if (bVar != null) {
                            ((HashMap) bVar.b).put(weexInstanceImpl, lifecycleStatus);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void k(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        b bVar = this.f9927a.get(activity);
        if (bVar != null && !((HashMap) bVar.b).isEmpty()) {
            dwh.s("Leak: Weex实例泄露, Activity销毁后没有析构实例, 看log详细信息");
            Iterator it = ((HashMap) bVar.b).keySet().iterator();
            while (it.hasNext()) {
                dwh.f("CHECKER", "Instance leak内存泄露, Activity Destroy以后Instance没有Destroy, Activity: " + activity.toString() + ", 实例: " + ((WeexInstanceImpl) it.next()));
            }
        }
    }

    public final synchronized void l(Activity activity) {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            b bVar = this.f9927a.get(activity);
            if (bVar != null && !((HashMap) bVar.b).isEmpty()) {
                if (bVar.f9929a == LifecycleStatus.STOPPED) {
                    for (Map.Entry entry : ((HashMap) bVar.b).entrySet()) {
                        if (entry.getValue() == LifecycleStatus.STOPPED || entry.getValue() == LifecycleStatus.PAUSED) {
                            break;
                        }
                        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) entry.getKey();
                        if (!weexInstanceImpl.getRootView().isAttachedToWindow()) {
                            break;
                        }
                        if (!z) {
                            dwh.s("Weex实例没有调用ActivityPause/Stop, vsync未停止");
                            z = true;
                        }
                        weexInstanceImpl.reportTaskLog("Weex实例没有调用ActivityPause/Stop, vsync未停止");
                        dwh.f("CHECKER", "Weex实例没有调用ActivityPause/Stop, Activity: " + activity.toString() + ", 实例: " + weexInstanceImpl);
                    }
                }
            }
        }
    }

    public void m(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d780c558", new Object[]{this, weexInstanceImpl});
        } else {
            j(weexInstanceImpl, LifecycleStatus.PAUSED);
        }
    }

    public void n(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51eede75", new Object[]{this, weexInstanceImpl});
        } else {
            j(weexInstanceImpl, LifecycleStatus.RESUMED);
        }
    }

    public void o(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435706c4", new Object[]{this, weexInstanceImpl});
        } else {
            j(weexInstanceImpl, LifecycleStatus.STARTED);
        }
    }

    public void p(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8a2e4a", new Object[]{this, weexInstanceImpl});
        } else {
            j(weexInstanceImpl, LifecycleStatus.STOPPED);
        }
    }

    public void q(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56e0e9b", new Object[]{this, weexInstanceImpl, new Boolean(z)});
        } else if (this.c) {
            synchronized (this) {
                if (!z) {
                    try {
                        if (!hxh.a()) {
                            f9x.b(false, "WeexDebug包检测, Instance创建必须在主线程");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                d dVar = (d) ((ArrayList) this.b).get(weexInstanceImpl.getMode().ordinal());
                dVar.b++;
                ((HashSet) dVar.c).add(weexInstanceImpl);
                f();
                Context context = weexInstanceImpl.getContext();
                if (context instanceof Activity) {
                    ((HashMap) g((Activity) context).b).put(weexInstanceImpl, LifecycleStatus.RESUMED);
                }
            }
        }
    }

    public void r(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6ea0eb", new Object[]{this, weexInstanceImpl});
        } else if (this.c) {
            if (!hxh.a()) {
                f9x.b(false, "WeexDebug包检测, Instance.Destroy必须在主线程");
            }
            synchronized (this) {
                try {
                    d dVar = (d) ((ArrayList) this.b).get(weexInstanceImpl.getMode().ordinal());
                    dVar.b--;
                    ((HashSet) dVar.c).remove(weexInstanceImpl);
                    Context context = weexInstanceImpl.getContext();
                    if (context instanceof Activity) {
                        b bVar = this.f9927a.get((Activity) context);
                        if (bVar != null) {
                            ((HashMap) bVar.b).remove(weexInstanceImpl);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void s(Context context, Context context2, WeexInstanceImpl weexInstanceImpl) {
        LifecycleStatus lifecycleStatus;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713ff1f9", new Object[]{this, context, context2, weexInstanceImpl});
        } else if (this.c) {
            synchronized (this) {
                try {
                    LifecycleStatus lifecycleStatus2 = LifecycleStatus.RESUMED;
                    if (!(context instanceof Activity) || (bVar = this.f9927a.get((Activity) context)) == null) {
                        lifecycleStatus = lifecycleStatus2;
                    } else {
                        lifecycleStatus = (LifecycleStatus) ((HashMap) bVar.b).remove(weexInstanceImpl);
                    }
                    if (lifecycleStatus != null) {
                        lifecycleStatus2 = lifecycleStatus;
                    }
                    if (context2 instanceof Activity) {
                        ((HashMap) g((Activity) context2).b).put(weexInstanceImpl, lifecycleStatus2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public WeexInstanceChecker() {
        this.f9927a = new WeakHashMap<>();
        this.b = new ArrayList();
        if (vvh.m()) {
            this.c = true;
            i(vvh.c());
            return;
        }
        this.c = false;
    }
}
