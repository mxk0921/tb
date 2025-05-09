package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AndroidH2Watchdog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AndroidH2Watchdog c;

    /* renamed from: a  reason: collision with root package name */
    public int f4070a = 0;
    public int b = 0;

    public static AndroidH2Watchdog getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidH2Watchdog) ipChange.ipc$dispatch("aa9c0590", new Object[0]);
        }
        AndroidH2Watchdog androidH2Watchdog = c;
        if (androidH2Watchdog != null) {
            return androidH2Watchdog;
        }
        synchronized (AndroidH2Watchdog.class) {
            try {
                if (c == null) {
                    c = new AndroidH2Watchdog();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f4070a = 0;
        }
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType("H2");
        monitorLoggerModel.setParam1(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
        monitorLoggerModel.setParam2("downgrade");
        monitorLoggerModel.getExtPramas().put("bizType", str);
        monitorLoggerModel.getExtPramas().put("errmsg", str2);
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        LogCatUtil.debug("AndroidH2Watchdog", "Dumping perfLog:" + monitorLoggerModel.toString());
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = 0;
        }
    }

    public final synchronized void b(byte b, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8d0076", new Object[]{this, new Byte(b), str, new Boolean(z)});
            return;
        }
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        if (!TextUtils.equals(instance.getStringValue(TransportConfigureItem.H2_DOWNGRADE_SWITCH), "T")) {
            LogCatUtil.debug("AndroidH2Watchdog", "h2DownSwitch off");
            return;
        }
        if (b == 1) {
            g(str, instance, z);
        } else {
            c(str, instance, z);
        }
    }

    public void resetFailCount(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a13e53", new Object[]{this, new Byte(b)});
            return;
        }
        LogCatUtil.printInfo("AndroidH2Watchdog", "resetFailCount,bizType:" + String.valueOf((int) b));
        if (1 == b) {
            a();
        } else {
            f();
        }
    }

    public final boolean e(Throwable th) {
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb9ad891", new Object[]{this, th})).booleanValue();
        }
        try {
            rootCause = MiscUtils.getRootCause(th);
        } catch (Throwable th2) {
            LogCatUtil.error("AndroidH2Watchdog", "isFatalError ex:" + th2);
        }
        if (rootCause == null) {
            return false;
        }
        String th3 = rootCause.toString();
        if (TextUtils.isEmpty(th3)) {
            return false;
        }
        return th3.contains("stream was reset");
    }

    public synchronized void reportH2Error(byte b, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037a1f6", new Object[]{this, new Byte(b), str, str2, th});
        } else if (e(th)) {
            b(b, str2, true);
        } else if (NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
            if (b == 1) {
                this.f4070a++;
            } else {
                this.b++;
            }
            LogCatUtil.debug("AndroidH2Watchdog", "reportH2Error bizType:" + ((int) b) + ",errcode:" + str + ",errmsg:" + str2 + ",rpcFailureCount:" + this.f4070a + ",rsrcFailureCount:" + this.b);
            b(b, str2, false);
        }
    }

    public final void c(String str, TransportConfigureManager transportConfigureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f4799c", new Object[]{this, str, transportConfigureManager, new Boolean(z)});
            return;
        }
        TransportConfigureItem transportConfigureItem = TransportConfigureItem.GO_URLCONNECTION_SWITCH;
        if (!MiscUtils.grayscaleUtdidForABTest(transportConfigureItem)) {
            LogCatUtil.debug("AndroidH2Watchdog", "rsrcGoH2Switch is off");
            return;
        }
        if (z) {
            LogCatUtil.debug("AndroidH2Watchdog", "rsrc fatal error,downgrade right now");
            this.b = 4;
        }
        if (this.b > 3) {
            synchronized (AndroidH2Watchdog.class) {
                String stringValue = transportConfigureManager.getStringValue(transportConfigureItem);
                LogCatUtil.debug("AndroidH2Watchdog", "RSRC tunnel downgrade to http1.1,original RSRC H2 SWTICH:" + stringValue);
                transportConfigureManager.setValue(transportConfigureItem, "0");
                transportConfigureManager.setValue(TransportConfigureItem.VERSION, String.valueOf(transportConfigureManager.getLatestVersion() + 1));
                f();
                d(NetworkServiceTracer.REPORT_SUB_NAME_RSRC, str);
            }
        }
    }

    public final void g(String str, TransportConfigureManager transportConfigureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9fd61d", new Object[]{this, str, transportConfigureManager, new Boolean(z)});
            return;
        }
        TransportConfigureItem transportConfigureItem = TransportConfigureItem.RPC_GO_H2_SWITCH;
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), transportConfigureManager.getStringValue(transportConfigureItem))) {
            LogCatUtil.debug("AndroidH2Watchdog", "rpcGoH2Switch is off");
            return;
        }
        if (z) {
            LogCatUtil.debug("AndroidH2Watchdog", "rpc fatal error,downgrade right now");
            this.f4070a = 4;
        }
        if (this.f4070a > 3) {
            synchronized (AndroidH2Watchdog.class) {
                String stringValue = transportConfigureManager.getStringValue(transportConfigureItem);
                LogCatUtil.debug("AndroidH2Watchdog", "RPC tunnel downgrade to http1.1, original RPC H2 SWTICH:" + stringValue);
                transportConfigureManager.setValue(transportConfigureItem, "0");
                transportConfigureManager.setValue(TransportConfigureItem.VERSION, String.valueOf(transportConfigureManager.getLatestVersion() + 1));
                a();
                d(NetworkServiceTracer.REPORT_SUB_NAME_RPC, str);
            }
        }
    }
}
