package com.alipay.mobile.common.transport.monitor.networkqos;

import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceTrafficManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DeviceTrafficManager c;

    /* renamed from: a  reason: collision with root package name */
    public double f4125a = vu3.b.GEO_NOT_SUPPORT;
    public double b = vu3.b.GEO_NOT_SUPPORT;

    public static DeviceTrafficManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficManager) ipChange.ipc$dispatch("2638e74e", new Object[0]);
        }
        DeviceTrafficManager deviceTrafficManager = c;
        if (deviceTrafficManager != null) {
            return deviceTrafficManager;
        }
        synchronized (DeviceTrafficManager.class) {
            try {
                if (c == null) {
                    c = new DeviceTrafficManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public double getBandwidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59a840f0", new Object[]{this})).doubleValue();
        }
        return this.b;
    }

    public double getSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d747a86", new Object[]{this})).doubleValue();
        }
        return this.f4125a;
    }

    public void setBandwidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a356a788", new Object[]{this, new Double(d)});
        } else {
            this.b = d;
        }
    }

    public void setSpeed(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3f86b2", new Object[]{this, new Double(d)});
        } else {
            this.f4125a = d;
        }
    }

    public DeviceTrafficStateInfo startTrafficMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo) ipChange.ipc$dispatch("a3d6cc76", new Object[]{this});
        }
        return new DeviceTrafficStateInfo();
    }

    public DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta stopTrafficMonitor(DeviceTrafficStateInfo deviceTrafficStateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta) ipChange.ipc$dispatch("c312902e", new Object[]{this, deviceTrafficStateInfo});
        }
        if (deviceTrafficStateInfo == null) {
            return null;
        }
        return deviceTrafficStateInfo.getDiff(new DeviceTrafficStateInfo());
    }

    public void calcSpeedAndBandwidth(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e1d46d", new Object[]{this, new Long(j), new Double(d)});
        } else if (d != vu3.b.GEO_NOT_SUPPORT) {
            this.f4125a = (8 * j) / ((d * 1024.0d) * 1024.0d);
            this.b = WestWoodManager.getInstance().calBw(j, d);
            LogCatUtil.debug("DTrafficManager", "input: traffic=[" + j + " byte] delta=[" + d + " s] speed=[" + String.format("%.4f", Double.valueOf(this.f4125a)) + "] bandwidth=[" + String.format("%.4f", Double.valueOf(this.b)) + "]");
        }
    }
}
