package tb;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.Welcome;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g61 implements t11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19746a;
    public boolean b = false;
    public int c = 0;
    public boolean d;

    static {
        t2o.a(573571139);
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5871259", new Object[]{this})).booleanValue();
        }
        String str = this.f19746a;
        if (str == null || (TextUtils.equals(str, Welcome.class.getSimpleName()) && !this.b)) {
            return true;
        }
        return false;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9ed6d8", new Object[]{this, str});
            return;
        }
        this.f19746a = str;
        jgh.a("launchCnt", "PageStateService isFromWelcome frontActivityName：" + this.f19746a);
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
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
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
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            b(activity);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8533965", new Object[]{this});
            return;
        }
        hj7.d(true);
        int b = hj7.b();
        new StringBuilder("coldStart: launchCntVal ").append(b);
        jgh.a("launchCnt", "launchCnt coldStart count. count=" + b);
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722b9d7d", new Object[]{this, activity});
            return;
        }
        try {
            e(activity.getClass().getSimpleName());
            if (!lol.b()) {
                jgh.a("launchCnt", "enableOnStop not isInBackground ");
            } else {
                this.d = true;
            }
        } catch (Throwable th) {
            jgh.a("launchCnt", "enableOnStop error " + th);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59115a1c", new Object[]{this});
            return;
        }
        hj7.d(false);
        int b = hj7.b();
        new StringBuilder("hotStart: launchCntVal ").append(b);
        jgh.a("launchCnt", "launchCnt enter hotStart count.count=" + b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            if (lol.c(activity)) {
                return;
            }
        } catch (Throwable th) {
            jgh.a("launchCnt", "onActivityResumed: start cold start PageStateUtils.isWelCome meet exception" + th);
        }
        try {
            if (d() && (i = this.c) < 1) {
                this.c = i + 1;
                this.b = true;
                jgh.a("launchCnt", "onActivityResumed: start cold start");
                a();
            } else if (!this.d) {
                jgh.a("launchCnt", "onActivityResumed, pageInErrorState  fromBackground " + this.d);
            } else {
                c();
                jgh.a("launchCnt", "onActivityResumed: resume activity val is ".concat(activity.getClass().getName()));
            }
        } finally {
            this.d = false;
        }
    }
}
