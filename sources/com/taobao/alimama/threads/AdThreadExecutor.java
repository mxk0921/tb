package com.taobao.alimama.threads;

import android.os.Handler;
import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import tb.t2o;
import tb.zc0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AdThreadExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f6190a;
        public final /* synthetic */ Runnable b;

        public a(long j, Runnable runnable) {
            this.f6190a = j;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "ad_thread_waiting_time", String.valueOf(SystemClock.uptimeMillis() - this.f6190a));
            this.b.run();
        }
    }

    static {
        t2o.a(1018167400);
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            execute(runnable, 0L);
        }
    }

    public static void execute(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467280a", new Object[]{runnable, new Long(j)});
        } else {
            new Handler(zc0.b()).postDelayed(new a(SystemClock.uptimeMillis(), runnable), j);
        }
    }
}
