package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ov3 extends ApplicationCompat.AbstractActivityLifecycleCallbacks implements PanguApplication.CrossActivityLifecycleCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static WeakReference<Activity> g;
    public static int h = 0;
    public static long i = 0;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f25671a;
    public Context d;
    public Handler f;
    public mvo b = null;
    public boolean c = false;
    public final Handler e = new Handler(Looper.getMainLooper());

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
            TLog.loge("ClipUrlWatcherLifeCycleObserver", "onActivityResumed  showDialogByCase");
            ClipUrlWatcherControl.z().T();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fwr.a("ClipUrlWatcherLifeCycleObserver", "fixPrimaryClipNullIssue, post run");
            ov3.a(ov3.this, false);
        }
    }

    static {
        t2o.a(664797288);
        t2o.a(670040081);
    }

    public ov3() {
        ShareBizAdapter.getInstance().initShareMenu();
    }

    public static /* synthetic */ void a(ov3 ov3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86d4781", new Object[]{ov3Var, new Boolean(z)});
        } else {
            ov3Var.i(z);
        }
    }

    public static /* synthetic */ HashMap b(ov3 ov3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3ffe4eb5", new Object[]{ov3Var});
        }
        return ov3Var.f25671a;
    }

    public static /* synthetic */ HashMap c(ov3 ov3Var, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("83dd68c6", new Object[]{ov3Var, hashMap});
        }
        ov3Var.f25671a = hashMap;
        return hashMap;
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return h;
    }

    public static /* synthetic */ int e(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117655b", new Object[]{new Integer(i2)})).intValue();
        }
        h = i2;
        return i2;
    }

    public static /* synthetic */ Object ipc$super(ov3 ov3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/launcher/ClipUrlWatcherLifeCycleObserver");
    }

    public final Handler f() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        if (this.f == null) {
            try {
                if (OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useSubHandler", "true").equals("true")) {
                    handler = new Handler(Coordinator.getWorkerLooper());
                } else {
                    handler = this.e;
                }
                this.f = handler;
            } catch (Throwable th) {
                th.printStackTrace();
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "getHandler err: " + th.toString());
                this.f = this.e;
            }
        }
        return this.f;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e195c6e", new Object[]{this});
        } else if (!this.c) {
            tn1.e(hjp.a().getApplicationContext());
            this.c = true;
        }
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81a5713", new Object[]{this, new Boolean(z)});
            return;
        }
        kkp e = kkp.e();
        e.b();
        e.a(kkp.KEY_SHARELIFECYCLEOBSERVERONSTARTED);
        f().postDelayed(new c(), z ? 0L : 300L);
    }

    public void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f3b3ff", new Object[]{this, context, str});
            return;
        }
        this.d = context;
        ClipUrlWatcherControl.z().F(context);
        ClipUrlWatcherControl.z().Q(str);
        ClipUrlWatcherControl.z().D(this.d);
    }

    public void k(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2399684", new Object[]{this, hashMap});
        } else {
            this.f25671a = hashMap;
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            mkp.c().g(activity.getIntent());
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityPaused(Activity activity) {
        mvo mvoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else if (!h()) {
            if (mip.u(activity) && (mvoVar = this.b) != null) {
                mvoVar.p();
                this.b = null;
            }
            TBShareContent e = bwr.h().e();
            if (e != null && tn1.m(e.businessId)) {
                LocalBroadcastManager.getInstance(this.d.getApplicationContext()).sendBroadcast(new Intent(TBWeexShare.ACTION_CLOSE_SHARE_PANEL));
            }
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityResumed(Activity activity) {
        long j;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (!h()) {
            g = null;
            g = new WeakReference<>(activity);
            if (activity == null) {
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onActivityResumed activity is null");
                return;
            }
            h++;
            ClipUrlWatcherControl.z().G(g);
            if (Build.VERSION.SDK_INT >= 28) {
                z = false;
            }
            Handler handler = this.e;
            a aVar = new a();
            if (z) {
                j = 0;
            } else {
                j = 300;
            }
            handler.postDelayed(aVar, j);
            kz9.h().j(g);
            if (mip.u(activity)) {
                mvo.q();
                if (this.b == null) {
                    mvo mvoVar = new mvo();
                    this.b = mvoVar;
                    mvoVar.j();
                }
            }
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            return;
        }
        this.d = activity.getApplicationContext();
        g();
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
        } else if (!h()) {
            if (activity == null) {
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStopped activity is null");
            } else {
                TLog.logd("ClipUrlWatcherLifeCycleObserver", "onStopped:".concat(activity.getClass().getSimpleName()));
            }
            g = null;
            ClipUrlWatcherControl.z().G(null);
            ClipUrlWatcherControl.z().n();
            kz9.h().j(null);
            kz9.h().a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStarted  prepareData");
            if (ov3.b(ov3.this) == null) {
                ov3.c(ov3.this, new HashMap());
            }
            if (ov3.d() <= 1) {
                z = true;
            }
            if (ov3.d() > 5) {
                ov3.e(2);
            }
            ov3.b(ov3.this).put("isColdStart", Boolean.valueOf(z));
            ClipUrlWatcherControl.z().C(ov3.b(ov3.this));
        }
    }

    public final boolean h() {
        HashMap<String, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8099dce4", new Object[]{this})).booleanValue();
        }
        return tn1.d() && (hashMap = this.f25671a) != null && !"true".equals(hashMap.get("optReflow")) && this.f25671a.get("process") != null;
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
        } else if (!h()) {
            if (activity == null) {
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStarted activity is null");
                return;
            }
            i = System.currentTimeMillis();
            h++;
            g = null;
            g = new WeakReference<>(activity);
            TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStarted:".concat(activity.getClass().getSimpleName()));
            ClipUrlWatcherControl.z().G(g);
            kz9.h().j(g);
            boolean z = Build.VERSION.SDK_INT < 28;
            if (!kip.r() || z) {
                fwr.a("ClipUrlWatcherLifeCycleObserver", "fixPrimaryClipNullIssue=false, run");
                if (kip.t()) {
                    i(true);
                } else {
                    i(z);
                }
            } else if (activity.getWindow() == null) {
                i(false);
                fwr.b("ClipUrlWatcherLifeCycleObserver", "fixPrimaryClipNullIssue, window is null");
            } else {
                activity.getWindow().getDecorView().post(new b());
            }
        }
    }
}
