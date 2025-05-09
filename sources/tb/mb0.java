package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.data.lifecycle.FragmentLifecycle;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mb0 implements Application.ActivityLifecycleCallbacks, Observer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ActivityLifeCycle";
    public static volatile boolean l;
    public static final List<String> m;
    public final Context f;
    public final lb0 g;
    public final zn1 j;
    public final ya0 k;

    /* renamed from: a  reason: collision with root package name */
    public int f23907a = 0;
    public int b = 0;
    public final Map<Activity, vex> c = new HashMap();
    public final Map<Activity, IPage> d = new HashMap();
    public WeakReference<Activity> e = new WeakReference<>(null);
    public final Application.ActivityLifecycleCallbacks h = b21.s().r();
    public final Application.ActivityLifecycleCallbacks i = b21.s().l();

    static {
        ArrayList arrayList = new ArrayList();
        m = arrayList;
        arrayList.add("com.taobao.tao.welcome.Welcome");
        arrayList.add("com.taobao.browser.BrowserActivity");
        arrayList.add(obq.BIZ_NAME);
    }

    public mb0(Application application) {
        this.g = null;
        zn1 zn1Var = new zn1();
        this.j = zn1Var;
        ya0 ya0Var = new ya0();
        this.k = ya0Var;
        ya0Var.a(this.f23907a);
        this.f = application;
        zzb<?> a2 = ic.a(ic.ACTIVITY_LIFECYCLE_DISPATCHER);
        if (a2 instanceof lb0) {
            this.g = (lb0) a2;
        }
        zn1Var.f();
    }

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedd8a81", new Object[]{this, activity});
            return;
        }
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView();
        }
    }

    public boolean c(String str) {
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2af1b70c", new Object[]{this, str})).booleanValue();
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f.getSystemService("activity")).getRunningTasks(10);
            if (runningTasks != null && runningTasks.size() > 0) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(this.f.getPackageName())) {
                        componentName2 = runningTaskInfo.topActivity;
                        if (componentName2.getClassName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        d(activity, "onActivityPaused");
        IpChange ipChange2 = nca.$ipChange;
        if (!yq7.c(this.g)) {
            this.g.g(activity, out.a());
        }
        IPage iPage = (IPage) ((HashMap) this.d).get(activity);
        hy9.a().e(iPage);
        e81 b = e81.b();
        b.i("currActivityName");
        b.i("currActivitySimpleName");
        b.i("schemaUrl");
        this.h.onActivityPaused(activity);
        this.i.onActivityPaused(activity);
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        this.h.onActivitySaveInstanceState(activity, bundle);
        this.i.onActivitySaveInstanceState(activity, bundle);
        d(activity, "onActivitySaveInstanceState");
        IPage iPage = (IPage) ((HashMap) this.d).get(activity);
        if (iPage instanceof cll) {
            bundle.putString("apmActivityRecovery", ((cll) iPage).b());
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
        } else if (obj != null && (obj instanceof IllegalArgumentException) && ((IllegalArgumentException) obj).getMessage().contains("ActivityRecord not found")) {
            l = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        Map<String, Object> b = b(activity);
        String str = nca.q;
        e81.b().g("lastJumpPageSchemaUrl", str);
        nca.q = xol.b(activity);
        ya0 ya0Var = this.k;
        int i = this.f23907a + 1;
        this.f23907a = i;
        ya0Var.a(i);
        nca.f++;
        String valueOf = String.valueOf(out.a());
        b.put("groupRelatedId", valueOf);
        String string = bundle == null ? null : bundle.getString("apmActivityRecovery");
        IPage a2 = new gll().p(true).d(activity).n(activity.getWindow()).f(valueOf).g(str).a();
        ((HashMap) this.d).put(activity, a2);
        ProcedureGlobal.PROCEDURE_MANAGER.A(activity, a2);
        a2.e().a(xol.c(activity), xol.b(activity), b);
        a2.d().a(jhg.RECOVERY_FROM_SAVED_INSTANCE, string);
        b.put(jhg.RECOVERY_FROM_SAVED_INSTANCE, Boolean.valueOf(!TextUtils.isEmpty(string)));
        if (!yq7.c(this.g)) {
            this.g.e(activity, b, out.a());
        }
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentLifecycle(activity, a2, valueOf), true);
        }
        d(activity, "onActivityCreated");
        b21.s().A(activity);
        e81.b().i("currFragmentName");
        this.h.onActivityCreated(activity, bundle);
        this.i.onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        d(activity, "onActivityDestroyed");
        IPage iPage = (IPage) ((HashMap) this.d).get(activity);
        if (iPage != null) {
            iPage.e().onPageDestroy();
            ((HashMap) this.d).remove(activity);
            ProcedureGlobal.PROCEDURE_MANAGER.E(iPage);
        }
        if (!yq7.c(this.g)) {
            this.g.f(activity, out.a());
        }
        if (this.b == 0) {
            b21.s().A(null);
        }
        ((HashMap) this.c).remove(activity);
        this.h.onActivityDestroyed(activity);
        this.i.onActivityDestroyed(activity);
        ya0 ya0Var = this.k;
        int i = this.f23907a - 1;
        this.f23907a = i;
        ya0Var.a(i);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        d(activity, "onActivityResumed");
        xol.a(activity);
        IpChange ipChange2 = nca.$ipChange;
        String name = activity.getClass().getName();
        if (((ArrayList) m).contains(name) && l && this.e.get() == null) {
            l = false;
            if (!c(name)) {
                this.e = new WeakReference<>(activity);
                activity.finish();
                return;
            }
        }
        nca.q = xol.b(activity);
        IPage iPage = (IPage) ((HashMap) this.d).get(activity);
        if (iPage != null) {
            iPage.e().onPageAppear();
            if (iPage instanceof cll) {
                e81.b().g("lastJumpPageSchemaUrl", ((cll) iPage).s());
            }
        }
        if (!yq7.c(this.g)) {
            this.g.h(activity, out.a());
        }
        if (((HashMap) this.c).containsKey(activity)) {
            hy9.a().b(activity, (vex) ((HashMap) this.c).get(activity), iPage);
        }
        new gfx().b((vex) ((HashMap) this.c).get(activity), iPage);
        b21.s().A(activity);
        e81.b().g("currActivityName", xol.a(activity));
        e81.b().g("currActivitySimpleName", xol.c(activity));
        try {
            e81.b().g("currActivitySchemaUrl", activity.getIntent().getDataString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.h.onActivityResumed(activity);
        this.i.onActivityResumed(activity);
    }

    public final Map<String, Object> b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65eaf4f", new Object[]{this, activity});
        }
        HashMap hashMap = new HashMap();
        try {
            Intent intent = activity.getIntent();
            if (intent != null) {
                hashMap.put("lastJumpPageSchemaUrl", nca.q);
                hashMap.put("schemaUrl", intent.getDataString());
                hashMap.put("navStartTime", Long.valueOf(out.b(intent.getLongExtra("NAV_TO_URL_START_TIME", -1L))));
                hashMap.put("navStartActivityTime", Long.valueOf(out.b(intent.getLongExtra("NAV_START_ACTIVITY_TIME", -1L))));
                hashMap.put("navStartPageTime", Long.valueOf(out.b(intent.getLongExtra("NAV_START_ACTIVITY_TIME", -1L))));
                Bundle bundleExtra = intent.getBundleExtra("afc_bundle");
                if (bundleExtra != null) {
                    hashMap.put("blackPage", bundleExtra.getString("black_page"));
                    hashMap.put("outLink", bundleExtra.getString("out_link"));
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    hashMap.put("isAfcColdContext", Boolean.valueOf(extras.getBoolean("cold_startup_h5", false)));
                }
            }
            hashMap.put("fullPageName", xol.a(activity));
            hashMap.put("jumpTime", Long.valueOf(nca.o));
        } catch (Exception e) {
            zq6.a(TAG, e);
        }
        return hashMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        d(activity, "onActivityStarted");
        a(activity);
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            zzb<?> b = yq7.b(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
            if (b instanceof ApplicationBackgroundChangedDispatcher) {
                ((ApplicationBackgroundChangedDispatcher) b).e(0, out.a());
            }
            zq6.b("AppLifeCycle", "background2Foreground");
            this.j.d();
        }
        nca.f24637a = false;
        if (!yq7.c(this.g)) {
            this.g.i(activity, out.a());
        }
        if (!((HashMap) this.c).containsKey(activity)) {
            ((HashMap) this.c).put(activity, new vex(activity));
        }
        ((vex) ((HashMap) this.c).get(activity)).d();
        b21.s().A(activity);
        this.h.onActivityStarted(activity);
        this.i.onActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        d(activity, "onActivityStopped");
        if (!yq7.c(this.g)) {
            this.g.j(activity, out.a());
        }
        if (((HashMap) this.c).containsKey(activity)) {
            ((vex) ((HashMap) this.c).get(activity)).e();
        }
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            nca.f24637a = true;
            ProcedureGlobal.PROCEDURE_MANAGER.n();
            zzb<?> b = yq7.b(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
            if (b instanceof ApplicationBackgroundChangedDispatcher) {
                ((ApplicationBackgroundChangedDispatcher) b).e(1, out.a());
            }
            zq6.b("AppLifeCycle", "foreground2Background");
            nca.r = "background";
            nca.p = -1L;
            this.j.e();
            new x51().e(jhg.W);
        }
        this.h.onActivityStopped(activity);
        this.i.onActivityStopped(activity);
        if (!o48.s && (iPage = (IPage) ((HashMap) this.d).get(activity)) != null) {
            iPage.e().onPageDisappear();
        }
    }

    public final void d(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7d4dda", new Object[]{this, activity, str});
            return;
        }
        IPage iPage = (IPage) ((HashMap) this.d).get(activity);
        if (iPage == null) {
            zq6.b("PageLifeCycle", "nonActivityPageSession", xol.a(activity), str);
        } else {
            zq6.b("PageLifeCycle", iPage.b(), xol.a(activity), str);
        }
    }
}
