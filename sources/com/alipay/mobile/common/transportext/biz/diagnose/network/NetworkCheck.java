package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Link;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_IDLE = 1;
    public static final int STATE_RUNNING = 2;
    public static int currentState = 1;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g;
    public static int h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4184a = false;
    public boolean b = false;
    public int c = 10;
    public boolean d = false;

    public static int getNetType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f8f4e3b", new Object[0])).intValue();
        }
        Context appContext = ExtTransportEnv.getAppContext();
        if (appContext == null) {
            return 0;
        }
        int networkType = NetworkUtils.getNetworkType(appContext);
        h = networkType;
        return networkType;
    }

    public static void initNetworkCheck(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40eecb7", new Object[]{context});
        } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "[initNetworkCheck] begin.");
            if (!NetworkConnectListener.hasInstance()) {
                try {
                    NetworkConnectListener.instance(context).register();
                    h = getNetType();
                } catch (Throwable th) {
                    LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "[initNetworkCheck] " + th);
                }
            }
        }
    }

    public static boolean isFakeWifi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ba0a9df", new Object[0])).booleanValue();
        }
        if (e) {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "first time to call isFakeWifi");
            networkStateNotify(false);
        }
        return g;
    }

    public static boolean isNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f701db90", new Object[0])).booleanValue();
        }
        if (e) {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "first time to call isNetworkAvailable");
            networkStateNotify(false);
        }
        return f;
    }

    public static void networkStateNotify(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465ede81", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (NetworkCheck.class) {
            try {
                LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "networkStateNotify. begin to check network by Link. old:" + f + ". new:" + z + ". first:" + e + ". netType:" + h);
                if (e || (f != z && currentState == 1)) {
                    e = false;
                    if (z) {
                        f = z;
                    }
                    currentState = 2;
                    NetworkCheck networkCheck = new NetworkCheck();
                    networkCheck.d = true;
                    NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkCheck.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "[networkStateNotify]Begin to detect the network.");
                                NetworkCheck.this.checkNetwork();
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.d && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("out_diago:" + str);
            UploadManager.writeLog(arrayList, "0.4", 2);
        }
    }

    public void checkNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca3e58d", new Object[]{this});
        } else if (MiscUtils.isInAlipayClient(ExtTransportEnv.getAppContext())) {
            SpeedTestManager.firstTime = false;
            e = false;
            try {
                int netType = getNetType();
                h = netType;
                if (netType == 0) {
                    SpeedTestManager.netErrCode = -2;
                    f = false;
                    g = false;
                    LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "It is no net now.");
                    return;
                }
                Configuration.DetectInf detectInf = new Configuration.DetectInf();
                detectInf.domain = "www.taobao.com";
                detectInf.protocol = 0;
                detectInf.request = "HEAD / HTTP/1.1\r\nHost: www.taobao.com\r\nContent-Length: 0\r\n\r\n";
                detectInf.response = "HTTP/1.1 200 ";
                detectInf.waiting = 30;
                detectInf.trying = 1;
                SpeedTestManager speedTestManager = new SpeedTestManager();
                Link.DftNetTest dftNetTest = new Link.DftNetTest();
                speedTestManager.register(dftNetTest);
                speedTestManager.diagnose(detectInf);
                String report = dftNetTest.getReport();
                if (report == null) {
                    SpeedTestManager.netErrCode = 10;
                    f = false;
                    g = false;
                    LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "network change. network is unavailable. the diagnose result is null.");
                    return;
                }
                List<SpeedTestLinkData> convertLinkData = SpeedTestManager.convertLinkData(report);
                if (!(convertLinkData == null || convertLinkData.size() == 0)) {
                    boolean z = false;
                    for (SpeedTestLinkData speedTestLinkData : convertLinkData) {
                        String str = speedTestLinkData.result;
                        if (str == null || !str.equals("y")) {
                            this.c = speedTestLinkData.errCode;
                            String str2 = speedTestLinkData.describe;
                            if (str2 == null || !str2.contains("302 redirect")) {
                                int i = speedTestLinkData.errCode;
                                if (2 == i || 3 == i) {
                                    this.b = true;
                                }
                            } else {
                                this.f4184a = true;
                            }
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        SpeedTestManager.netErrCode = 0;
                        f = true;
                        g = false;
                    } else {
                        if (3 != h || (!this.f4184a && !this.b)) {
                            SpeedTestManager.netErrCode = this.c;
                            g = false;
                        } else {
                            SpeedTestManager.netErrCode = -1;
                            g = true;
                        }
                        f = false;
                    }
                    LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "network change and the errCode is " + SpeedTestManager.netErrCode);
                    a(report);
                    return;
                }
                SpeedTestManager.netErrCode = 10;
                f = false;
                g = false;
                LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "network change. network is unavailable. the return list is null.");
            } catch (Throwable th) {
                LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "[checkNetwork] " + th);
            }
        }
    }
}
