package com.alipay.mobile.common.transport.strategy;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExtTransportTunnelWatchdog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String DOWNGRADE_REASON_AMNETPOST = "AMNETPOST_FAILURE";
    public static String DOWNGRADE_REASON_BIND = "BIND_FAILURE";
    public static String DOWNGRADE_REASON_CRASH = "CRASH_FAILURE";
    public static String DOWNGRADE_REASON_RPC = "RPC_FAILURE";
    public static final String SP_KEY_PROC_CRASH_TICK = "proc_crash_tick";
    public static final String SP_SUB_KEY_MAX_CRASH_TIME_ALLOW = "maxCrashTimeAllow";
    public static final String SP_SUB_KEY_PROC_CRASH_COUNT = "procCrasheCount";
    public static ExtTransportTunnelWatchdog p;

    /* renamed from: a  reason: collision with root package name */
    public final int f4134a;
    public final long b;
    public final int c;
    public final long d;
    public volatile int h;
    public final Object l = new Object();
    public boolean o = false;
    public volatile int e = 0;
    public volatile long f = 0;
    public volatile int g = 0;
    public volatile long j = 0;
    public volatile long i = 0;
    public boolean k = false;
    public String m = "";
    public final AtomicBoolean n = new AtomicBoolean(true);

    public ExtTransportTunnelWatchdog() {
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        int intValue = instance.getIntValue(TransportConfigureItem.AMNET_DOWNGRADE_RPC_TRIGGER_COUNT);
        this.f4134a = intValue;
        long longValue = instance.getLongValue(TransportConfigureItem.AMNET_DOWNGRADE_RPC_TRIGGER_TIME) * 1000;
        this.b = longValue;
        if (Runtime.getRuntime().availableProcessors() <= 2 && longValue < 25000) {
            this.b = 25000L;
        }
        int intValue2 = instance.getIntValue(TransportConfigureItem.AMNET_DOWNGRADE_BIND_TRIGGER_COUNT);
        this.c = intValue2;
        long longValue2 = instance.getLongValue(TransportConfigureItem.AMNET_DOWNGRADE_BIND_TRIGGER_TIME) * 1000;
        this.d = longValue2;
        LogCatUtil.debug("EXT_Watchdog", "MMTP Triggers: RPCFailures - " + intValue + " RPCFailureTime - " + this.b + " BindFailure - " + intValue2 + " BindFailureTime - " + longValue2);
    }

    public static /* synthetic */ void access$000(ExtTransportTunnelWatchdog extTransportTunnelWatchdog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8caab3c1", new Object[]{extTransportTunnelWatchdog});
        } else {
            extTransportTunnelWatchdog.f();
        }
    }

    public static /* synthetic */ AtomicBoolean access$100(ExtTransportTunnelWatchdog extTransportTunnelWatchdog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4bb268c2", new Object[]{extTransportTunnelWatchdog});
        }
        return extTransportTunnelWatchdog.n;
    }

    public static final ExtTransportTunnelWatchdog getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportTunnelWatchdog) ipChange.ipc$dispatch("6ae54c8e", new Object[0]);
        }
        ExtTransportTunnelWatchdog extTransportTunnelWatchdog = p;
        if (extTransportTunnelWatchdog != null) {
            return extTransportTunnelWatchdog;
        }
        synchronized (ExtTransportTunnelWatchdog.class) {
            try {
                ExtTransportTunnelWatchdog extTransportTunnelWatchdog2 = p;
                if (extTransportTunnelWatchdog2 != null) {
                    return extTransportTunnelWatchdog2;
                }
                ExtTransportTunnelWatchdog extTransportTunnelWatchdog3 = new ExtTransportTunnelWatchdog();
                p = extTransportTunnelWatchdog3;
                return extTransportTunnelWatchdog3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g != 0) {
            this.g = 0;
            this.i = 0L;
            this.j = 0L;
            LogCatUtil.debug("EXT_Watchdog", "Bind failure reset to 0");
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.e > 0 && this.n.compareAndSet(true, false)) {
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ExtTransportTunnelWatchdog.access$000(ExtTransportTunnelWatchdog.this);
                    ExtTransportTunnelWatchdog.access$100(ExtTransportTunnelWatchdog.this).set(true);
                }
            }, this.b + 1000, TimeUnit.MILLISECONDS);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e > 0 && (this.e >= this.f4134a || currentTimeMillis - this.f > this.b)) {
            LogCatUtil.debug("EXT_Watchdog", "Will start downgrade due to RPC failure condition");
            startTunnelDowngrade(DOWNGRADE_REASON_RPC);
        } else if (this.g >= this.c) {
            LogCatUtil.debug("EXT_Watchdog", "Will start downgrade due to Bind failure condition");
            LogCatUtil.debug("EXT_Watchdog", String.format("bc = %d, bmc = %d, ts = %d, tms = %d", Integer.valueOf(this.g), Integer.valueOf(this.c), Long.valueOf(currentTimeMillis - this.i), Long.valueOf(this.d)));
            startTunnelDowngrade(DOWNGRADE_REASON_BIND);
        }
    }

    public final void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        LogCatUtil.debug("EXT_Watchdog", "Starting tunnel switch to downgrade to SPDY");
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        TransportConfigureManager instance2 = TransportConfigureManager.getInstance();
        TransportConfigureItem transportConfigureItem = TransportConfigureItem.AMNET_SWITCH;
        this.m = instance2.getStringValue(transportConfigureItem);
        LogCatUtil.verbose("EXT_Watchdog", "Original AMNET_SWTICH:" + this.m);
        instance.setValue(transportConfigureItem, "0,0,0");
        int latestVersion = instance.getLatestVersion() + 1;
        TransportConfigureItem transportConfigureItem2 = TransportConfigureItem.VERSION;
        instance.setValue(transportConfigureItem2, String.valueOf(latestVersion));
        HashMap hashMap = new HashMap();
        hashMap.put(transportConfigureItem.getConfigName(), "0,0,0");
        hashMap.put(transportConfigureItem2.getConfigName(), String.valueOf(latestVersion));
        instance.updateConfig(context, hashMap, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
        NwSharedSwitchUtil.notifySwitchUpdate();
    }

    public boolean isDowngradeInLocalAmnetMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fe81924", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean isDowngraded() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e22e0b64", new Object[]{this})).booleanValue();
        }
        synchronized (this.l) {
            z = this.k;
        }
        return z;
    }

    public synchronized void mrpcFailureRest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd9388d", new Object[]{this});
        } else if (this.e != 0) {
            this.e = 0;
            this.f = 0L;
            LogCatUtil.debug("EXT_Watchdog", "MMTP failure reset to 0");
        }
    }

    public synchronized void startTunnelDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d9107c", new Object[]{this, str});
        } else {
            c(str, TransportEnvUtil.getContext());
        }
    }

    public final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        String stringData = SharedPreUtils.getStringData(context, SP_KEY_PROC_CRASH_TICK);
        if (!TextUtils.isEmpty(stringData)) {
            return stringData;
        }
        e(context, System.currentTimeMillis() + this.d, 0);
        LogCatUtil.info("EXT_Watchdog", "SP_KEY_PROC_CRASH_TICK no exist, regenerate the model ! ");
        return "";
    }

    public final boolean e(Context context, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c64a123", new Object[]{this, context, new Long(j), new Integer(i)})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SP_SUB_KEY_MAX_CRASH_TIME_ALLOW, j);
            jSONObject.put(SP_SUB_KEY_PROC_CRASH_COUNT, i);
            String jSONObject2 = jSONObject.toString();
            boolean putData = SharedPreUtils.putData(context, SP_KEY_PROC_CRASH_TICK, jSONObject2);
            LogCatUtil.info("EXT_Watchdog", "SP_KEY_PROC_CRASH_TICK save finish, result:" + putData + ".  json: " + jSONObject2);
            return putData;
        } catch (JSONException e) {
            LogCatUtil.error("EXT_Watchdog", "Put json data exception", e);
            return false;
        }
    }

    public void resetDowngradeFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbac7f9", new Object[]{this});
            return;
        }
        synchronized (this.l) {
            LogCatUtil.debug("EXT_Watchdog", "resetting isDowngraded...");
            this.k = false;
            this.o = false;
        }
        d("upgrade", "swtich_update", TransportEnvUtil.getContext(), null);
    }

    public synchronized void bindFailureTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26331d51", new Object[]{this});
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            LogCatUtil.verbose("EXT_Watchdog", "AMNET is disabled already, no need to tick");
        } else {
            if (isDowngraded() && this.o && !TransportStrategy.isEnabledTransportByLocalAmnet()) {
                this.k = false;
            }
            if (isDowngraded()) {
                LogCatUtil.verbose("EXT_Watchdog", "Already downgraded, no need to tick");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.g == 0) {
                this.i = currentTimeMillis;
            }
            long j = currentTimeMillis - this.j;
            if (j <= 1000) {
                LogCatUtil.verbose("EXT_Watchdog", "Ignore - Bind failure happened too frequent. current ts = " + currentTimeMillis + ", mLastBindFailureTime = " + this.j + ", timeDiff = " + j);
            } else if (currentTimeMillis - this.i > this.d) {
                this.g = 1;
                this.j = currentTimeMillis;
                this.i = currentTimeMillis;
                LogCatUtil.verbose("EXT_Watchdog", "Bind failure does not exceed configure data, Reseting counters for bind...");
            } else {
                this.g++;
                this.j = currentTimeMillis;
                LogCatUtil.debug("EXT_Watchdog", "IPC Bind failure ticked, current failures:" + this.g + " failure duration:" + (currentTimeMillis - this.i) + "ms， mLastBindFailureTime = " + this.j);
                f();
            }
        }
    }

    public final void c(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{this, str, context});
            return;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.ALLOW_AMNET_DOWNGRADE);
        if (TextUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
            LogCatUtil.debug("EXT_Watchdog", "Config does not allow downgrade");
            return;
        }
        boolean isEnabledTransportByLocalAmnet = TransportStrategy.isEnabledTransportByLocalAmnet();
        synchronized (this.l) {
            try {
                if (this.k && this.o && !isEnabledTransportByLocalAmnet) {
                    this.k = false;
                    LogCatUtil.info("EXT_Watchdog", "[startTunnelDowngrade] Local amnet is disabled, reset isDowngraded state.");
                }
                if (this.k) {
                    LogCatUtil.debug("EXT_Watchdog", "Tunnel is already downgraded, not need to do it again");
                    mrpcFailureRest();
                    return;
                }
                this.k = true;
                if (!isEnabledTransportByLocalAmnet) {
                    h(context);
                } else {
                    this.o = true;
                }
                d("downgrade", str, context, Boolean.valueOf(isEnabledTransportByLocalAmnet));
                LogCatUtil.debug("EXT_Watchdog", "Tunnel Downgrade Done");
                mrpcFailureRest();
                b();
                if (DOWNGRADE_REASON_CRASH.equals(str)) {
                    SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void mrpcFailureTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56821d6", new Object[]{this});
            return;
        }
        if (isDowngraded() && this.o && !TransportStrategy.isEnabledTransportByLocalAmnet()) {
            this.k = false;
        }
        if (!isDowngraded()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.e == 0) {
                this.f = currentTimeMillis;
            }
            this.e++;
            LogCatUtil.debug("EXT_Watchdog", "MMTP failure ticked, current failures:" + this.e + " failure duration:" + (currentTimeMillis - this.f) + "ms");
            f();
        }
    }

    public boolean pushProcCrashTick(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e8c371", new Object[]{this, context})).booleanValue();
        }
        try {
            g(context);
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("EXT_Watchdog", "pushProcCrashTick exception", th);
            SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
            return false;
        }
    }

    public final void g(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.PROC_CRASH_HANDLE_SWITCH, "T")) {
            LogCatUtil.info("EXT_Watchdog", "pushProcCrashTick switch is off");
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            LogCatUtil.verbose("EXT_Watchdog", "AMNET is disabled already, no need to tick");
        } else if (isDowngraded()) {
            LogCatUtil.verbose("EXT_Watchdog", "Already downgraded, no need to tick");
        } else {
            String a2 = a(context);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONObject jSONObject = new JSONObject(a2);
                    try {
                        long j = jSONObject.getLong(SP_SUB_KEY_MAX_CRASH_TIME_ALLOW);
                        int i2 = jSONObject.getInt(SP_SUB_KEY_PROC_CRASH_COUNT);
                        if (System.currentTimeMillis() <= j) {
                            i = i2 + 1;
                            LogCatUtil.info("EXT_Watchdog", "increasing procCrashCount：" + i);
                        } else {
                            j = System.currentTimeMillis() + this.d;
                            i = 0;
                        }
                        e(context, j, i);
                        if (i >= this.c) {
                            this.h = i;
                            LogCatUtil.debug("EXT_Watchdog", String.format("Will start downgrade due to proc crash condition. procCrashCount = %d, maxCrashTimeAllow = %d, mMaxBindTickAllow = %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(this.c)));
                            c(DOWNGRADE_REASON_CRASH, context);
                        }
                        this.h = 0;
                    } catch (Throwable th) {
                        LogCatUtil.error("EXT_Watchdog", "Get data from json obj exception, procCrashTickJson: " + a2, th);
                        SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
                    }
                } catch (JSONException e) {
                    LogCatUtil.error("EXT_Watchdog", "New JSONObject exception, procCrashTickJson: " + a2, e);
                    SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
                }
            }
        }
    }

    public final void d(String str, String str2, Context context, Boolean bool) {
        boolean z;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3d2201", new Object[]{this, str, str2, context, bool});
            return;
        }
        try {
            int connType = ConnectionUtil.getConnType(context);
            int networkType = ConnectionUtil.getNetworkType(context);
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("MMTP");
            monitorLoggerModel.setParam1("1.0");
            monitorLoggerModel.setParam2(connType + "_" + networkType);
            monitorLoggerModel.setParam3(str);
            boolean isPushProcessRuning = MiscUtils.isPushProcessRuning(context);
            if (TextUtils.equals(str, "downgrade")) {
                monitorLoggerModel.getExtPramas().put(AmnetTunnelManager.LOG_KEY_RPC_FAILED_NUM, String.valueOf(this.e));
                monitorLoggerModel.getExtPramas().put("bind_fc", String.valueOf(this.g));
                monitorLoggerModel.getExtPramas().put("crash_fc", String.valueOf(this.h));
                monitorLoggerModel.getExtPramas().put("reason", str2);
                Map<String, String> extPramas = monitorLoggerModel.getExtPramas();
                if (isPushProcessRuning) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                extPramas.put("push_alive", str3);
                if (bool != null && bool.booleanValue()) {
                    monitorLoggerModel.getExtPramas().put("local_amnet", "T");
                }
            }
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            LogCatUtil.debug("EXT_Watchdog", "Dumping perfLog:" + monitorLoggerModel.toString());
            MonitorInfoUtil.recordUnavailable("BIZ_NETWORK", "LINK_DOWNGRADE", "0", monitorLoggerModel.getExtPramas());
            if (TextUtils.equals(str, "downgrade") && !isPushProcessRuning) {
                MonitorLoggerModel monitorLoggerModel2 = new MonitorLoggerModel();
                monitorLoggerModel2.setSubType("PROCESS");
                monitorLoggerModel2.setParam1(connType + "_" + networkType);
                monitorLoggerModel2.setParam2(str);
                monitorLoggerModel2.setParam3("dead_push_process");
                monitorLoggerModel2.getExtPramas().putAll(monitorLoggerModel.getExtPramas());
                MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel2);
            }
            if (!TextUtils.equals(str2, DOWNGRADE_REASON_BIND) && !TextUtils.equals(str2, DOWNGRADE_REASON_CRASH)) {
                z = false;
                MonitorInfoUtil.kickOnNetworkBindService("network", z, str2);
            }
            z = true;
            MonitorInfoUtil.kickOnNetworkBindService("network", z, str2);
        } catch (Throwable th) {
            LogCatUtil.error("EXT_Watchdog", th);
        }
    }
}
