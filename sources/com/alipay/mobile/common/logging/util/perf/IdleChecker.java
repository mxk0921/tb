package com.alipay.mobile.common.logging.util.perf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IdleChecker implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IdleChecker h;

    /* renamed from: a  reason: collision with root package name */
    private Context f4006a;
    private Handler b;
    private boolean c;
    private boolean d;
    private long e;
    private int f = 0;
    private final List<CPUInfo> g = new ArrayList();

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class CPUInfo {
        public long appCpuTime;
        public long elapsedRealTime;
        public long idle;
        public long ioWait;
        public long nice;
        public long system;
        public long total;
        public long user;

        public CPUInfo() {
            this.user = -1L;
            this.nice = -1L;
            this.system = -1L;
            this.idle = -1L;
            this.ioWait = -1L;
            this.total = -1L;
            this.appCpuTime = -1L;
            this.elapsedRealTime = SystemClock.elapsedRealtime();
        }
    }

    private IdleChecker(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4006a = applicationContext;
        if (applicationContext == null) {
            this.f4006a = context;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.c = false;
        this.d = false;
        this.e = 0L;
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        SystemClock.elapsedRealtime();
        this.b.removeCallbacks(this);
        EventTrigger.getInstance(this.f4006a).event(Constants.EVENT_ENTER_IDLE, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0174, code lost:
        if (r4 >= 5) goto L_0x0184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
        if (com.alipay.mobile.common.logging.util.perf.EventTrigger.getInstance(r20.f4006a).isInImpZone() != false) goto L_0x0184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0182, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ab, code lost:
        if (com.alipay.mobile.common.logging.util.perf.EventTrigger.getInstance(r20.f4006a).isInImpZone() == false) goto L_0x0182;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.perf.IdleChecker.b(java.lang.String, java.lang.String):boolean");
    }

    public static IdleChecker getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IdleChecker) ipChange.ipc$dispatch("d6b4e725", new Object[]{context});
        }
        if (h == null) {
            synchronized (IdleChecker.class) {
                try {
                    if (h == null) {
                        h = new IdleChecker(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4 != null) goto L_0x007a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void run() {
        /*
            r10 = this;
            r0 = 1
            monitor-enter(r10)
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.logging.util.perf.IdleChecker.$ipChange     // Catch: all -> 0x0014
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0014
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "5c510192"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0014
            r3 = 0
            r0[r3] = r10     // Catch: all -> 0x0014
            r1.ipc$dispatch(r2, r0)     // Catch: all -> 0x0014
            monitor-exit(r10)
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x00a3
        L_0x0017:
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            r3 = 0
            int r4 = r10.f     // Catch: all -> 0x0027
            if (r4 != 0) goto L_0x0029
            int r4 = android.os.Process.myPid()     // Catch: all -> 0x0027
            r10.f = r4     // Catch: all -> 0x0027
            goto L_0x0029
        L_0x0027:
            goto L_0x007e
        L_0x0029:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: all -> 0x0027
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: all -> 0x0027
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: all -> 0x0027
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x0027
            java.lang.String r8 = "/proc/"
            r7.<init>(r8)     // Catch: all -> 0x0027
            int r8 = r10.f     // Catch: all -> 0x0027
            r7.append(r8)     // Catch: all -> 0x0027
            java.lang.String r8 = "/stat"
            r7.append(r8)     // Catch: all -> 0x0027
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x0027
            r6.<init>(r7)     // Catch: all -> 0x0027
            r5.<init>(r6)     // Catch: all -> 0x0027
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.<init>(r5, r6)     // Catch: all -> 0x0027
            java.lang.String r2 = r4.readLine()     // Catch: all -> 0x0058
            if (r2 != 0) goto L_0x005a
            java.lang.String r2 = ""
            goto L_0x005a
        L_0x0058:
            goto L_0x007f
        L_0x005a:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: all -> 0x0058
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: all -> 0x0058
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: all -> 0x0058
            java.lang.String r9 = "/proc/stat"
            r8.<init>(r9)     // Catch: all -> 0x0058
            r7.<init>(r8)     // Catch: all -> 0x0058
            r5.<init>(r7, r6)     // Catch: all -> 0x0058
            java.lang.String r1 = r5.readLine()     // Catch: all -> 0x0074
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = ""
            goto L_0x0077
        L_0x0074:
            r3 = r5
            goto L_0x007f
        L_0x0077:
            r5.close()     // Catch: all -> 0x0087
        L_0x007a:
            r4.close()     // Catch: all -> 0x0087
            goto L_0x0087
        L_0x007e:
            r4 = r3
        L_0x007f:
            if (r3 == 0) goto L_0x0084
            r3.close()     // Catch: all -> 0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0087
            goto L_0x007a
        L_0x0087:
            boolean r0 = r10.b(r1, r2)     // Catch: all -> 0x008c
            goto L_0x008d
        L_0x008c:
        L_0x008d:
            if (r0 == 0) goto L_0x0094
            r10.a()     // Catch: all -> 0x0014
            monitor-exit(r10)
            return
        L_0x0094:
            android.os.Handler r0 = r10.b     // Catch: all -> 0x0014
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: all -> 0x0014
            r2 = 1
            long r1 = r1.toMillis(r2)     // Catch: all -> 0x0014
            r0.postDelayed(r10, r1)     // Catch: all -> 0x0014
            monitor-exit(r10)
            return
        L_0x00a3:
            monitor-exit(r10)     // Catch: all -> 0x0014
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.perf.IdleChecker.run():void");
    }

    public synchronized void triggerTimeout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266e7c44", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.c) {
            this.c = true;
            this.e = SystemClock.elapsedRealtime();
            this.b.post(this);
        }
        if (z && !this.d) {
            this.d = true;
            this.e = SystemClock.elapsedRealtime();
        }
    }
}
