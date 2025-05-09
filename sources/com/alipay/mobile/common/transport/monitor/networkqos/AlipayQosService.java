package com.alipay.mobile.common.transport.monitor.networkqos;

import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayQosService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte QOE_FROM_DIAG = 3;
    public static final byte QOE_FROM_INTERFERENCE = 6;
    public static final byte QOE_FROM_MMTP = 1;
    public static final byte QOE_FROM_NBET = 4;
    public static final byte QOE_FROM_READING = 5;
    public static final byte QOE_FROM_TCP = 2;
    public static final double QOE_NET_BAD = 5000.0d;
    public static final byte QOS_LEVEL_A = 1;
    public static final byte QOS_LEVEL_B = 2;
    public static final byte QOS_LEVEL_C = 3;
    public static final byte QOS_LEVEL_D = 4;
    public static AlipayQosService j;

    /* renamed from: a  reason: collision with root package name */
    public final QoeManager f4124a;
    public final DeviceTrafficManager b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public int i;

    public AlipayQosService() {
        this.f4124a = null;
        this.b = null;
        try {
            c();
            this.f4124a = QoeManager.getInstance();
            this.b = DeviceTrafficManager.getInstance();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void access$000(AlipayQosService alipayQosService, double d, double d2, double d3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed1f662", new Object[]{alipayQosService, new Double(d), new Double(d2), new Double(d3), new Integer(i)});
        } else {
            alipayQosService.d(d, d2, d3, i);
        }
    }

    public static /* synthetic */ QoeManager access$100(AlipayQosService alipayQosService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QoeManager) ipChange.ipc$dispatch("2c50e782", new Object[]{alipayQosService});
        }
        return alipayQosService.f4124a;
    }

    public static AlipayQosService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayQosService) ipChange.ipc$dispatch("9a63fa6a", new Object[0]);
        }
        AlipayQosService alipayQosService = j;
        if (alipayQosService != null) {
            return alipayQosService;
        }
        synchronized (AlipayQosService.class) {
            try {
                if (j == null) {
                    j = new AlipayQosService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public final int a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a82180c9", new Object[]{this, new Double(d)})).intValue();
        }
        double d2 = this.f;
        if (d >= d2) {
            return 1;
        }
        double d3 = this.g;
        if (d3 <= d && d < d2) {
            return 2;
        }
        if (this.h > d || d >= d3) {
            return 4;
        }
        return 3;
    }

    public final int b(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa1b", new Object[]{this, new Double(d), new Double(d2)})).intValue();
        }
        int rtoLevel = getRtoLevel(d);
        if (rtoLevel == 1) {
            return 1;
        }
        if (a(d2) < rtoLevel) {
            return rtoLevel - 1;
        }
        return rtoLevel;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        this.c = instance.getDoubleValue(TransportConfigureItem.RTO_BOUND_A);
        this.d = instance.getDoubleValue(TransportConfigureItem.RTO_BOUND_B);
        this.e = instance.getDoubleValue(TransportConfigureItem.RTO_BOUND_C);
        this.f = instance.getDoubleValue(TransportConfigureItem.SPEED_BOUND_A);
        this.g = instance.getDoubleValue(TransportConfigureItem.SPEED_BOUND_B);
        this.h = instance.getDoubleValue(TransportConfigureItem.SPEED_BOUND_C);
        this.i = -1;
    }

    public final void d(double d, double d2, double d3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94452aad", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Integer(i)});
            return;
        }
        if (i == 4) {
            LogCatUtil.warn("AlipayQosService", "========here level is D==========");
        }
        if (this.i != i) {
            this.i = i;
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("NETQOS");
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("NETQOS"));
            monitorLoggerModel.setParam2("INFO");
            monitorLoggerModel.setParam3(String.valueOf(i));
            monitorLoggerModel.getExtPramas().put("RTO", String.format("%.4f", Double.valueOf(d)));
            monitorLoggerModel.getExtPramas().put(RPCDataItems.SPEED, String.format("%.4f", Double.valueOf(d2)));
            monitorLoggerModel.getExtPramas().put("BANDWIDTH", String.format("%.4f", Double.valueOf(d3)));
            monitorLoggerModel.getExtPramas().put("LEVEL", String.valueOf(i));
            monitorLoggerModel.getExtPramas().put(RPCDataItems.NETTYPE, String.valueOf(NetworkUtils.getNetType(TransportEnvUtil.getContext())));
            LogCatUtil.debug("AlipayQosService", monitorLoggerModel.toString());
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        }
    }

    public void estimate(final double d, final byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428c262d", new Object[]{this, new Double(d), new Byte(b)});
            return;
        }
        try {
            if (NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext()) && d >= vu3.b.GEO_NOT_SUPPORT) {
                if (d > 5000.0d) {
                    d = 5000.0d;
                }
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AlipayQosService.access$100(AlipayQosService.this).estimate(QosInterfereHelper.getInstance().interferInputRtt(d), b);
                        QosInterfereHelper.getInstance().interferOutputRtt(d, AlipayQosService.this.getRto());
                    }
                });
            }
        } catch (Throwable th) {
            LogCatUtil.error("AlipayQosService", "estimate exception", th);
        }
    }

    public void estimateByStartTime(long j2, byte b) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c12eaf", new Object[]{this, new Long(j2), new Byte(b)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > j2 && (i = (int) (currentTimeMillis - j2)) > 60) {
                AlipayQosService instance = getInstance();
                double d = i;
                if (d > 5000.0d) {
                    d = 5000.0d;
                }
                instance.estimate(d, b);
            }
        } catch (Throwable unused) {
        }
    }

    public double getBandwidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59a840f0", new Object[]{this})).doubleValue();
        }
        return this.b.getBandwidth();
    }

    public double getRto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98777c2c", new Object[]{this})).doubleValue();
        }
        try {
            return this.f4124a.getRto();
        } catch (Throwable unused) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public int getRtoLevel(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fb5521d", new Object[]{this, new Double(d)})).intValue();
        }
        double d2 = this.c;
        if (d <= d2) {
            return 1;
        }
        if (d2 < d && d <= this.d) {
            return 2;
        }
        if (d <= this.d || d > this.e) {
            return 4;
        }
        return 3;
    }

    public double getSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d747a86", new Object[]{this})).doubleValue();
        }
        return this.b.getSpeed();
    }

    public void resetRtoWhenNetchange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401dfd7c", new Object[]{this});
            return;
        }
        try {
            this.f4124a.resetRtoWhenNetchange();
        } catch (Throwable unused) {
        }
    }

    public void setSpeed(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3f86b2", new Object[]{this, new Double(d)});
        } else {
            this.b.setSpeed(d);
        }
    }

    public DeviceTrafficStateInfo startTrafficMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo) ipChange.ipc$dispatch("a3d6cc76", new Object[]{this});
        }
        try {
            return this.b.startTrafficMonitor();
        } catch (Throwable unused) {
            return null;
        }
    }

    public DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta stopTrafficMonitor(DeviceTrafficStateInfo deviceTrafficStateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta) ipChange.ipc$dispatch("c312902e", new Object[]{this, deviceTrafficStateInfo});
        }
        try {
            return this.b.stopTrafficMonitor(deviceTrafficStateInfo);
        } catch (Throwable th) {
            LogCatUtil.error("AlipayQosService", th);
            return null;
        }
    }

    public int getQosLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("272bc1df", new Object[]{this})).intValue();
        }
        try {
            if (!TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NET_QOS_SWITCH), "T")) {
                LogCatUtil.debug("AlipayQosService", "qosSwitch is off,always return A level");
                return 1;
            } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                return 4;
            } else {
                final double rto = getRto();
                final double speed = getSpeed();
                final double bandwidth = getBandwidth();
                final int b = b(rto, speed > bandwidth ? speed : bandwidth);
                if (this.i - b > 2) {
                    b++;
                }
                NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AlipayQosService.access$000(AlipayQosService.this, rto, speed, bandwidth, b);
                        }
                    }
                });
                if (b != 4 || NetworkUtils.getNetworkType(TransportEnvUtil.getContext()) != 4) {
                    return b;
                }
                LogCatUtil.warn("AlipayQosService", "Though result is D,but it's 4G now,return C instead");
                return 3;
            }
        } catch (Throwable th) {
            LogCatUtil.error("AlipayQosService", th);
            return 3;
        }
    }
}
