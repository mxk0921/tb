package com.alipay.mobile.common.amnet.api.monitor;

import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TrafficMonitorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int SCENE_APP_BACKTOFG = 2;
    public static int SCENE_APP_START = 1;
    public static int SCENE_DEFAULT = -1;
    public static long f;
    public static long g;
    public static long h;
    public static long i;
    public static long j;
    public static long k;
    public static TrafficMonitorService l;

    /* renamed from: a  reason: collision with root package name */
    public final long f3889a = 5000;
    public final byte d = 1;
    public final byte e = 2;
    public int b = SCENE_DEFAULT;
    public byte c = 1;

    public static /* synthetic */ void access$000(TrafficMonitorService trafficMonitorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0733044", new Object[]{trafficMonitorService});
        } else {
            trafficMonitorService.a();
        }
    }

    public static TrafficMonitorService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrafficMonitorService) ipChange.ipc$dispatch("b6fa6951", new Object[0]);
        }
        TrafficMonitorService trafficMonitorService = l;
        if (trafficMonitorService != null) {
            return trafficMonitorService;
        }
        synchronized (TrafficMonitorService.class) {
            try {
                if (l == null) {
                    l = new TrafficMonitorService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j2 = h + i;
        long j3 = j + k;
        b(this.b, j2, j3, j2 + j3);
        c();
    }

    public final void b(int i2, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d24b0c9", new Object[]{this, new Integer(i2), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        LogCatUtil.debug("TrafficMonitorService", "scene[" + i2 + "] rpcTotalTraffic[" + j2 + "] syncTotalTraffic[" + j3 + "] totalTraffic[" + j4 + "]");
        if (j4 < 1) {
            LogCatUtil.debug("TrafficMonitorService", "totalTraffic is very little,need't report");
            return;
        }
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType(Configuration.LOG_TYPE_TRAFFIC);
        monitorLoggerModel.getExtPramas().put("scene", String.valueOf(i2));
        monitorLoggerModel.getExtPramas().put("rpcTraffic", String.valueOf(j2));
        monitorLoggerModel.getExtPramas().put("syncTraffic", String.valueOf(j3));
        monitorLoggerModel.getExtPramas().put("totalTraffic", String.valueOf(j4));
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d();
        this.c = this.d;
        this.b = SCENE_DEFAULT;
        f = 0L;
        g = 0L;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h = 0L;
        i = 0L;
        j = 0L;
        k = 0L;
    }

    public synchronized void monitorDownTraffic(byte b, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89aafd4", new Object[]{this, new Byte(b), new Integer(i2), new Integer(i3)});
        } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            if (System.currentTimeMillis() < g) {
                if (b == 1) {
                    i += i3;
                } else if (b == 2 || b == 3) {
                    k += i3;
                }
            }
        }
    }

    public synchronized void monitorUpTraffic(byte b, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f17a88d", new Object[]{this, new Byte(b), new Integer(i2), new Integer(i3)});
        } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            if (System.currentTimeMillis() < g) {
                if (b == 1) {
                    h += i3;
                } else if (b == 2 || b == 3) {
                    j += i3;
                }
            }
        }
    }

    public synchronized void setScene(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9592e452", new Object[]{this, new Integer(i2)});
        } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            byte b = this.c;
            byte b2 = this.e;
            if (b == b2 || this.b != SCENE_DEFAULT) {
                LogCatUtil.debug("TrafficMonitorService", "current scene[" + this.b + "],trafficMonitor task is busy,ignore new scene[" + i2 + "]");
                return;
            }
            this.c = b2;
            this.b = i2;
            long currentTimeMillis = System.currentTimeMillis();
            f = currentTimeMillis;
            g = currentTimeMillis + this.f3889a;
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.monitor.TrafficMonitorService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrafficMonitorService.access$000(TrafficMonitorService.this);
                    }
                }
            }, 5L, TimeUnit.SECONDS);
            LogCatUtil.debug("TrafficMonitorService", "start traffic monitor,scene[" + i2 + "] startTime[" + f + "]");
        }
    }
}
