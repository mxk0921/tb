package tb;

import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class v1i implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f29735a;
    public final /* synthetic */ Runnable b;

    public v1i(long j, Runnable runnable) {
        this.f29735a = j;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "main_thread_waiting_time", String.valueOf(SystemClock.uptimeMillis() - this.f29735a));
        this.b.run();
    }
}
