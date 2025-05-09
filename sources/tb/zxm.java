package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.statistics.sec.UMIDToken;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zxm implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "next_launch_app_info";
    private static final String e = "app_exit";
    private static final String f = "ProcessExitReporter";

    /* renamed from: a  reason: collision with root package name */
    private final Context f33075a;
    private final String b;
    private final List<Runnable> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f33076a;
        public final /* synthetic */ HashMap b;

        public a(Application application, HashMap hashMap) {
            this.f33076a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x41.d(this.f33076a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f33077a;

        public b(Application application) {
            this.f33077a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m1s.a().b(this.f33077a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f33078a;

        public c(Application application) {
            this.f33078a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x0r.a(this.f33078a, LauncherRuntime.c);
            }
        }
    }

    private zxm(Context context, String str) {
        this.f33075a = context;
        this.b = str;
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        UMIDToken.d(application);
        new zxm(application, LauncherRuntime.c).c(new c(application)).c(new b(application)).c(new a(application, hashMap)).a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(5L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.schedule(this, 100L, TimeUnit.MILLISECONDS);
    }

    public zxm c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxm) ipChange.ipc$dispatch("aeef93b0", new Object[]{this, runnable});
        }
        this.c.add(runnable);
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object systemService;
        List historicalProcessExitReasons;
        String applicationExitInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (!this.c.isEmpty()) {
            for (Runnable runnable : this.c) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    whh.b(f, "action.run failed due to", th);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                String packageName = this.f33075a.getPackageName();
                SharedPreferences sharedPreferences = this.f33075a.getSharedPreferences(d, 0);
                int i = sharedPreferences.getInt(this.b, 0);
                int myPid = Process.myPid();
                sharedPreferences.edit().putInt(this.b, myPid).commit();
                systemService = this.f33075a.getSystemService(ActivityManager.class);
                historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(packageName, i, 1);
                if (historicalProcessExitReasons != null) {
                    applicationExitInfo = p01.a(historicalProcessExitReasons.get(0)).toString();
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(d, 19999, e, "proc=" + this.b + ",lastPid=" + i + ",curPid=" + myPid, applicationExitInfo, null).build());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
