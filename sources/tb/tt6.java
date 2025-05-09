package tb;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.evo.internal.downloader.ExperimentIndexMtopRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tt6 implements tzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (n.j().a().w()) {
                try {
                    if (System.currentTimeMillis() - n.j().e().i() < (n.j().q() ? 10000L : n.j().a().J())) {
                        ogh.g("DataUpdateService", "不满足数据更新检查条件，取消本次检查。");
                    } else {
                        n.j().e().syncExperiments(false, "trigger");
                    }
                } catch (Exception e) {
                    ku0.j("DataUpdateService.updateData", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
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
            ogh.i("DataUpdateService", "checkIndex start on switchForeground.");
            ExperimentIndexMtopRequest.a(n.j().b());
        }
    }

    static {
        t2o.a(961544260);
        t2o.a(962593305);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            wzu.registerAppStatusCallbacks(new tt6());
        } catch (Throwable th) {
            ku0.j("DataUpdateService.register", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e531a", new Object[]{this});
        } else if (n.j().a().a()) {
            ydt.b(new a());
            ydt.b(new b());
        }
    }

    @Override // tb.tzu
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
            return;
        }
        ogh.e("DataUpdateService", "onSwitchBackground");
        try {
            n.j().m().cancelSyncCrowd();
            if (n.j().a().h()) {
                n.j().e().k();
            }
        } catch (Throwable th) {
            ku0.j("DataUpdateService.updateData", th);
        }
    }

    @Override // tb.tzu
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        ogh.e("DataUpdateService", "onSwitchForeground");
        b();
    }
}
