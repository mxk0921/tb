package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.amnet.api.AmnetStorageListener;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DiagnoseBySystemCall implements AmnetNetworkDiagnoseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int i = 1;
    public static long j;

    /* renamed from: a  reason: collision with root package name */
    public ScheduledFuture<?> f4180a;
    public final List<String> b = new ArrayList(5);
    public boolean c = false;
    public DeviceTrafficStateInfo d = null;
    public DiagnoseResultState e = null;
    public boolean f = false;
    public boolean g = false;
    public String h = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface DiagnoseResultState {
        void stateNotify(boolean z);
    }

    public static /* synthetic */ void access$000(DiagnoseBySystemCall diagnoseBySystemCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7368db", new Object[]{diagnoseBySystemCall});
        } else {
            diagnoseBySystemCall.e();
        }
    }

    public static void diagnoseNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa9a3ae", new Object[0]);
        } else {
            diagnoseNotify(null);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        final NetworkDiagnose networkDiagnose = new NetworkDiagnose();
        networkDiagnose.register(AmnetStorageListener.getInstance());
        networkDiagnose.register(this);
        networkDiagnose.register(System.nanoTime(), 2);
        this.f4180a = NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("DIAGNOSE-SYS", "200 seconds timeout, set currentState idle.");
                DiagnoseBySystemCall.access$000(DiagnoseBySystemCall.this);
            }
        }, 200L, TimeUnit.SECONDS);
        this.d = AlipayQosService.getInstance().startTrafficMonitor();
        LogCatUtil.info("DIAGNOSE-SYS", "system networkDiagnose launch");
        NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("DIAGNOSE-SYS", "system start networkDiagnose launch");
                try {
                    networkDiagnose.launch();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
    }

    public final void b(DiagnoseResultState diagnoseResultState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c868cab8", new Object[]{this, diagnoseResultState});
        } else {
            this.e = diagnoseResultState;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = null;
        }
    }

    public static void diagnoseNotify(DiagnoseResultState diagnoseResultState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e7f732", new Object[]{diagnoseResultState});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < 300000) {
            LogCatUtil.info("DIAGNOSE-SYS", "curTime: " + currentTimeMillis + ",lastDiagnoseTime: " + j + ",ignore this diagnose");
            return;
        }
        synchronized (DiagnoseBySystemCall.class) {
            try {
                if (i != 1) {
                    if (diagnoseResultState != null) {
                        diagnoseResultState.stateNotify(false);
                    }
                    LogCatUtil.debug("DIAGNOSE-SYS", "diagnoseNotify,currentState is busy");
                    return;
                }
                i = 2;
                j = currentTimeMillis;
                DiagnoseBySystemCall diagnoseBySystemCall = new DiagnoseBySystemCall();
                diagnoseBySystemCall.b(diagnoseResultState);
                diagnoseBySystemCall.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "writeLog error. "
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r1 = "5889b6a"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r5
            r2.ipc$dispatch(r1, r0)
            return
        L_0x0015:
            monitor-enter(r5)
            boolean r2 = r5.c     // Catch: all -> 0x001c
            if (r2 == 0) goto L_0x001e
            monitor-exit(r5)     // Catch: all -> 0x001c
            return
        L_0x001c:
            r0 = move-exception
            goto L_0x0074
        L_0x001e:
            r5.c = r0     // Catch: all -> 0x001c
            monitor-exit(r5)     // Catch: all -> 0x001c
            r5.f()
            com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo r2 = r5.d     // Catch: all -> 0x0034
            java.lang.String r2 = com.alipay.mobile.common.transportext.biz.diagnose.network.TrafficLogHelper.getTrafficLog(r2)     // Catch: all -> 0x0034
            if (r2 == 0) goto L_0x0036
            java.util.List<java.lang.String> r3 = r5.b     // Catch: all -> 0x0034
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: all -> 0x0034
            r3.add(r2)     // Catch: all -> 0x0034
            goto L_0x0036
        L_0x0034:
            r2 = move-exception
            goto L_0x004b
        L_0x0036:
            java.util.List<java.lang.String> r2 = r5.b     // Catch: all -> 0x0034
            java.lang.String r3 = "0.3"
            r4 = 2
            com.alipay.mobile.common.transportext.biz.diagnose.network.UploadManager.writeLog(r2, r3, r4)     // Catch: all -> 0x0034
            com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall$DiagnoseResultState r1 = r5.e
            if (r1 == 0) goto L_0x0048
        L_0x0042:
            r1.stateNotify(r0)
            r5.d()
        L_0x0048:
            com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.i = r0
            goto L_0x0065
        L_0x004b:
            java.lang.String r3 = "DIAGNOSE-SYS"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0066
            r4.<init>(r1)     // Catch: all -> 0x0066
            java.lang.String r1 = r2.toString()     // Catch: all -> 0x0066
            r4.append(r1)     // Catch: all -> 0x0066
            java.lang.String r1 = r4.toString()     // Catch: all -> 0x0066
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r3, r1)     // Catch: all -> 0x0066
            com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall$DiagnoseResultState r1 = r5.e
            if (r1 == 0) goto L_0x0048
            goto L_0x0042
        L_0x0065:
            return
        L_0x0066:
            r1 = move-exception
            com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall$DiagnoseResultState r2 = r5.e
            if (r2 == 0) goto L_0x0071
            r2.stateNotify(r0)
            r5.d()
        L_0x0071:
            com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.i = r0
            throw r1
        L_0x0074:
            monitor-exit(r5)     // Catch: all -> 0x001c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.e():void");
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.g && !this.f) {
            LogCatUtil.warn("DIAGNOSE-SYS", "notifyOutDiagResult, the describe is " + this.h);
            try {
                MonitorInfoUtil.kickOnNetworkDiagnose(true, this.h);
            } catch (Throwable th) {
                LogCatUtil.error("DIAGNOSE-SYS", th);
            }
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener, com.alipay.mobile.common.transportext.amnet.NetTest
    public void report(boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
            return;
        }
        String str2 = "";
        StringBuilder sb = new StringBuilder(str2);
        sb.append(z);
        sb.append(";");
        sb.append(z2);
        sb.append(";");
        sb.append(z3);
        sb.append(";");
        if (str != null) {
            str2 = str;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        if (1 == i) {
            LogCatUtil.warn("DIAGNOSE-SYS", "the diagnose already stop. this result ignore. " + sb2);
            return;
        }
        LogCatUtil.info("DIAGNOSE-SYS", sb2);
        if (!TextUtils.isEmpty(str)) {
            ((ArrayList) this.b).add(str);
            if (str.contains(Configuration.LOG_TYPE_OUT_DIAGO)) {
                c(z2, str);
            }
        }
        if (z3) {
            this.f4180a.cancel(true);
            e();
        }
    }

    public final void c(boolean z, String str) {
        List<SpeedTestLinkData> convertLinkData;
        SpeedTestLinkData speedTestLinkData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f |= z;
            this.g = true;
            try {
                int indexOf = str.indexOf("out_diago:");
                if (indexOf >= 0) {
                    String substring = str.substring(indexOf + 10);
                    if (!TextUtils.isEmpty(substring) && !z && (convertLinkData = SpeedTestManager.convertLinkData(substring)) != null && !convertLinkData.isEmpty() && (speedTestLinkData = convertLinkData.get(0)) != null) {
                        this.h += speedTestLinkData.describe + ";" + speedTestLinkData.errCode + ";";
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.warn("DIAGNOSE-SYS", "outDiag " + th.toString());
            }
        }
    }
}
