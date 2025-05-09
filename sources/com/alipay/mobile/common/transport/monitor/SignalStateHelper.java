package com.alipay.mobile.common.transport.monitor;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.sys.telephone.NetTelephonyManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import tb.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SignalStateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static SignalStateHelper g;
    public static long h;

    /* renamed from: a  reason: collision with root package name */
    public final TelephonyManager f4122a;
    public PhoneStateListener b;
    public HandlerThread e;
    public int c = 0;
    public int d = 0;
    public final long f = m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InnerPhoneStateListener extends PhoneStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerPhoneStateListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerPhoneStateListener innerPhoneStateListener, String str, Object... objArr) {
            if (str.hashCode() == -2058329889) {
                super.onSignalStrengthsChanged((SignalStrength) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/monitor/SignalStateHelper$InnerPhoneStateListener");
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            try {
                Class<?> cls = Class.forName(SignalStrength.class.getName());
                Method declaredMethod = cls.getDeclaredMethod("getLevel", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getDbm", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod2.setAccessible(true);
                SignalStateHelper.access$202(SignalStateHelper.this, ((Integer) declaredMethod2.invoke(signalStrength, new Object[0])).intValue());
                SignalStateHelper.access$302(SignalStateHelper.this, ((Integer) declaredMethod.invoke(signalStrength, new Object[0])).intValue());
                LogCatUtil.debug("SSMonitor", "SS Updated: dbm=[" + SignalStateHelper.access$200(SignalStateHelper.this) + "] sLevel=[" + SignalStateHelper.access$300(SignalStateHelper.this) + "]");
            } catch (Throwable th) {
                LogCatUtil.error("SSMonitor", "Failed to invoke methods:" + th.getMessage());
            }
        }
    }

    public SignalStateHelper() {
        try {
            this.f4122a = (TelephonyManager) TransportEnvUtil.getContext().getSystemService("phone");
        } catch (Throwable th) {
            LogCatUtil.error("SSMonitor", "SignalStateHelper constructor exception", th);
        }
    }

    public static /* synthetic */ PhoneStateListener access$000(SignalStateHelper signalStateHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneStateListener) ipChange.ipc$dispatch("81876bbf", new Object[]{signalStateHelper});
        }
        return signalStateHelper.b;
    }

    public static /* synthetic */ PhoneStateListener access$002(SignalStateHelper signalStateHelper, PhoneStateListener phoneStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneStateListener) ipChange.ipc$dispatch("4b675f9c", new Object[]{signalStateHelper, phoneStateListener});
        }
        signalStateHelper.b = phoneStateListener;
        return phoneStateListener;
    }

    public static /* synthetic */ TelephonyManager access$100(SignalStateHelper signalStateHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TelephonyManager) ipChange.ipc$dispatch("f822ec40", new Object[]{signalStateHelper});
        }
        return signalStateHelper.f4122a;
    }

    public static /* synthetic */ int access$200(SignalStateHelper signalStateHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f140c54d", new Object[]{signalStateHelper})).intValue();
        }
        return signalStateHelper.d;
    }

    public static /* synthetic */ int access$202(SignalStateHelper signalStateHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fb4519a", new Object[]{signalStateHelper, new Integer(i)})).intValue();
        }
        signalStateHelper.d = i;
        return i;
    }

    public static /* synthetic */ int access$300(SignalStateHelper signalStateHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e29254ce", new Object[]{signalStateHelper})).intValue();
        }
        return signalStateHelper.c;
    }

    public static /* synthetic */ int access$302(SignalStateHelper signalStateHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a894b239", new Object[]{signalStateHelper, new Integer(i)})).intValue();
        }
        signalStateHelper.c = i;
        return i;
    }

    public static /* synthetic */ void access$400(SignalStateHelper signalStateHelper, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d4493a", new Object[]{signalStateHelper, str, str2, str3});
        } else {
            signalStateHelper.a(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$500(SignalStateHelper signalStateHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53573dd", new Object[]{signalStateHelper});
        } else {
            signalStateHelper.c();
        }
    }

    public static SignalStateHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignalStateHelper) ipChange.ipc$dispatch("d105b165", new Object[0]);
        }
        SignalStateHelper signalStateHelper = g;
        if (signalStateHelper != null) {
            return signalStateHelper;
        }
        synchronized (SignalStateHelper.class) {
            try {
                if (g == null) {
                    g = new SignalStateHelper();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g;
    }

    public final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType("SignalState");
        monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("SignalState"));
        monitorLoggerModel.setParam2("INFO");
        if (!TextUtils.isEmpty(str3)) {
            monitorLoggerModel.getExtPramas().put(RPCDataItems.CELLINFO, str3);
        }
        if (!TextUtils.isEmpty(str)) {
            monitorLoggerModel.getExtPramas().put(RPCDataItems.SIGNAL_STATE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            monitorLoggerModel.getExtPramas().put(RPCDataItems.SIGNAL_STATE, str2);
        }
        monitorLoggerModel.getExtPramas().put(RPCDataItems.QOS, String.valueOf(AlipayQosService.getInstance().getQosLevel()));
        LogCatUtil.debug("SSMonitor", monitorLoggerModel.toString());
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
    }

    public String getCellInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73cd413", new Object[]{this});
        }
        try {
            CellLocation cellLocation = NetTelephonyManagerFactory.getInstance().getCellLocation();
            if (cellLocation == null) {
                LogCatUtil.warn("SSMonitor", "getCellInfo. cellLocation is null.");
                return "";
            } else if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                LogCatUtil.debug("SSMonitor", "CDMA CELL info" + cdmaCellLocation.toString());
                return cdmaCellLocation.toString();
            } else {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                LogCatUtil.debug("SSMonitor", "GSM CELL info" + gsmCellLocation.toString());
                return gsmCellLocation.toString();
            }
        } catch (Throwable th) {
            LogCatUtil.error("SSMonitor", "getCellInfo exception:" + th.toString());
            return "";
        }
    }

    public String getMobileSignalInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43f1328b", new Object[]{this});
        }
        return "[Dbm=" + this.d + ",SignalLevel=" + this.c + "]";
    }

    public void reportNetStateInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a51689d", new Object[]{this});
            return;
        }
        try {
            if (!TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SINGAL_STATE_SWITCH), "T")) {
                LogCatUtil.debug("SSMonitor", "singal state is off");
            } else if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
                LogCatUtil.debug("SSMonitor", "Not in Alipay,return.");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - h < this.f) {
                    LogCatUtil.debug("SSMonitor", "lastReportTime: " + h + ",ignore this time");
                    return;
                }
                h = currentTimeMillis;
                final String cellInfo = getCellInfo();
                int networkType = NetworkUtils.getNetworkType(TransportEnvUtil.getContext());
                if (networkType == 3) {
                    a(getWifiSignalLevel(), "", cellInfo);
                } else if (networkType != 0 && b()) {
                    NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.SignalStateHelper.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            SignalStateHelper.access$400(SignalStateHelper.this, "", SignalStateHelper.this.getMobileSignalInfo(), cellInfo);
                            SignalStateHelper.access$500(SignalStateHelper.this);
                        }
                    }, 2L, TimeUnit.SECONDS);
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("SSMonitor", "reportNetStateInfo exception: " + th.toString());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            LogCatUtil.debug("SSMonitor", "stopMonitor");
            PhoneStateListener phoneStateListener = this.b;
            if (phoneStateListener != null) {
                this.f4122a.listen(phoneStateListener, 0);
            }
            HandlerThread handlerThread = this.e;
            if (handlerThread != null) {
                handlerThread.quit();
                this.e = null;
            }
        } catch (Throwable th) {
            LogCatUtil.error("SSMonitor", "stopMonitor,ex:" + th.toString());
        }
    }

    public String getWifiSignalLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d736668", new Object[]{this});
        }
        try {
            Context context = TransportEnvUtil.getContext();
            if (!MiscUtils.isAtFrontDesk(context)) {
                return String.valueOf(0);
            }
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                return String.valueOf(0);
            }
            int calculateSignalLevel = WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5);
            LogCatUtil.debug("SSMonitor", connectionInfo.toString() + ", level: " + calculateSignalLevel);
            return connectionInfo.getSSID() + "_" + connectionInfo.getBSSID() + "_" + calculateSignalLevel;
        } catch (Throwable th) {
            LogCatUtil.error("SSMonitor", th);
            return String.valueOf(0);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            LogCatUtil.debug("SSMonitor", "startMonitor");
            if (this.e != null) {
                LogCatUtil.debug("SSMonitor", "there is a task working still");
                return false;
            }
            synchronized (this) {
                if (this.e != null) {
                    LogCatUtil.debug("SSMonitor", "there is a task working still");
                    return false;
                }
                HandlerThread handlerThread = new HandlerThread("SignalThread");
                this.e = handlerThread;
                handlerThread.start();
                new Handler(this.e.getLooper()).post(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.SignalStateHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        SignalStateHelper.access$002(SignalStateHelper.this, new InnerPhoneStateListener());
                        SignalStateHelper.access$100(SignalStateHelper.this).listen(SignalStateHelper.access$000(SignalStateHelper.this), 256);
                    }
                });
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.error("SSMonitor", "startMonitor,ex:" + th.toString());
            return false;
        }
    }
}
