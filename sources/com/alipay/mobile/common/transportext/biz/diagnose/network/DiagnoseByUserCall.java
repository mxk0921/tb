package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.amnet.api.AmnetStorageListener;
import com.alipay.mobile.common.transport.ext.diagnose.eastereggs.DiagnoseResult;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DiagnoseByUserCall implements AmnetNetworkDiagnoseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DiagnoseByUserCall g;

    /* renamed from: a  reason: collision with root package name */
    public ScheduledFuture<?> f4181a;
    public Future<?> b;
    public DiagnoseResult c;
    public final List<String> d = new ArrayList(5);
    public boolean e = false;
    public DeviceTrafficStateInfo f = null;

    public static /* synthetic */ void access$000(DiagnoseByUserCall diagnoseByUserCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883b3fbf", new Object[]{diagnoseByUserCall});
        } else {
            diagnoseByUserCall.g();
        }
    }

    public static void launch(DiagnoseResult diagnoseResult) {
        DiagnoseByUserCall diagnoseByUserCall;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f166bec4", new Object[]{diagnoseResult});
            return;
        }
        synchronized (DiagnoseByUserCall.class) {
            try {
                DiagnoseByUserCall diagnoseByUserCall2 = g;
                if (diagnoseByUserCall2 != null) {
                    diagnoseByUserCall2.d();
                }
                diagnoseByUserCall = new DiagnoseByUserCall();
                g = diagnoseByUserCall;
            } catch (Throwable th) {
                throw th;
            }
        }
        diagnoseByUserCall.b(diagnoseResult);
        g.f();
    }

    public final String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("traceroute:");
        if (indexOf != -1) {
            String replace = str.substring(indexOf + 11).replace('|', '\n');
            return "Traceroute result is " + z + ".\n" + replace;
        }
        int indexOf2 = str.indexOf("out_diago:");
        if (indexOf2 != -1) {
            String substring = str.substring(indexOf2 + 10);
            return "Tcp result is " + z + ".\n" + substring;
        }
        int indexOf3 = str.indexOf("traffic:");
        if (indexOf3 != -1) {
            String substring2 = str.substring(indexOf3 + 8);
            return "Traffic result:\n" + substring2;
        }
        return "The result is " + z + ".\n" + str;
    }

    public final void b(DiagnoseResult diagnoseResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957ba056", new Object[]{this, diagnoseResult});
        } else {
            this.c = diagnoseResult;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        DiagnoseResult diagnoseResult = this.c;
        if (diagnoseResult != null) {
            diagnoseResult.report(str);
        }
    }

    public String getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this});
        }
        List<String> list = this.d;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return "There is no diagnose log.";
        }
        Iterator it = ((ArrayList) this.d).iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append("\n");
            str = sb.toString();
        }
        return str;
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
        LogCatUtil.info("DIAGNOSE-USR", sb.toString());
        if (!TextUtils.isEmpty(str)) {
            ((ArrayList) this.d).add(str);
            c(a(str, z2));
        }
        if (z3) {
            e();
            g();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LogCatUtil.info("DIAGNOSE-USR", "New diagnose task by user, cannel old task.");
        e();
        try {
            Future<?> future = this.b;
            if (future != null) {
                future.cancel(true);
                this.b = null;
            }
        } catch (Throwable th) {
            LogCatUtil.error("DIAGNOSE-USR", "networkDiagnoseFuture cancel", th);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            ScheduledFuture<?> scheduledFuture = this.f4181a;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f4181a = null;
            }
        } catch (Throwable th) {
            LogCatUtil.error("DIAGNOSE-USR", "scheduledFuture cancel", th);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (!this.e) {
                    this.e = true;
                    try {
                        String trafficLog = TrafficLogHelper.getTrafficLog(this.f);
                        if (trafficLog != null) {
                            ((ArrayList) this.d).add(trafficLog);
                            c(a(trafficLog, true));
                        }
                        UploadManager.writeLog(this.d, "0.2", 1);
                    } catch (Throwable th) {
                        LogCatUtil.warn("DIAGNOSE-USR", "writeLog error. " + th.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ((ArrayList) this.d).clear();
        this.e = false;
        final NetworkDiagnose networkDiagnose = new NetworkDiagnose();
        networkDiagnose.register(AmnetStorageListener.getInstance());
        networkDiagnose.register(this);
        networkDiagnose.register(System.nanoTime(), 1);
        this.f4181a = NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseByUserCall.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("DIAGNOSE-USR", "200 seconds timeout, set currentState idle.");
                DiagnoseByUserCall.access$000(DiagnoseByUserCall.this);
            }
        }, 200L, TimeUnit.SECONDS);
        this.f = AlipayQosService.getInstance().startTrafficMonitor();
        LogCatUtil.info("DIAGNOSE-USR", "user networkDiagnose launch");
        this.b = NetworkAsyncTaskExecutor.submitLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseByUserCall.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("DIAGNOSE-USR", "user start networkDiagnose launch");
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
}
