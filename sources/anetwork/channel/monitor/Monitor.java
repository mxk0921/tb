package anetwork.channel.monitor;

import android.content.Context;
import anet.channel.monitor.BandWidthListenerHelper;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.monitor.QualityChangeFilter;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.Monitor";
    public static AtomicBoolean isInit = new AtomicBoolean(false);

    static {
        t2o.a(607126070);
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812d53e1", new Object[]{iNetworkQualityChangeListener});
        } else {
            addListener(iNetworkQualityChangeListener, null);
        }
    }

    public static NetworkSpeed getNetSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkSpeed) ipChange.ipc$dispatch("7ae02ab", new Object[0]);
        }
        NetworkSpeed networkSpeed = NetworkSpeed.Fast;
        try {
            return NetworkSpeed.valueOfCode(BandWidthSampler.getInstance().getNetworkSpeed());
        } catch (Throwable th) {
            ALog.e(TAG, "getNetworkSpeed failed", null, th, new Object[0]);
            return networkSpeed;
        }
    }

    public static double getNetSpeedValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c422db26", new Object[0])).doubleValue();
        }
        return BandWidthSampler.getInstance().getNetSpeedValue();
    }

    @Deprecated
    public static anetwork.channel.monitor.speed.NetworkSpeed getNetworkSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anetwork.channel.monitor.speed.NetworkSpeed) ipChange.ipc$dispatch("25be743", new Object[0]);
        }
        return anetwork.channel.monitor.speed.NetworkSpeed.valueOfCode(getNetSpeed().getCode());
    }

    public static synchronized void init() {
        synchronized (Monitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (isInit.compareAndSet(false, true)) {
                BandWidthSampler.getInstance().startNetworkMeter();
            }
        }
    }

    public static void removeListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec63bc4", new Object[]{iNetworkQualityChangeListener});
        } else {
            BandWidthListenerHelper.getInstance().removeQualityChangeListener(iNetworkQualityChangeListener);
        }
    }

    public static void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
            return;
        }
        try {
            BandWidthSampler.getInstance().startNetworkMeter();
        } catch (Throwable th) {
            ALog.e(TAG, "start failed", null, th, new Object[0]);
        }
    }

    public static void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
            return;
        }
        try {
            BandWidthSampler.getInstance().stopNetworkMeter();
        } catch (Throwable th) {
            ALog.e(TAG, "stop failed", null, th, new Object[0]);
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener, QualityChangeFilter qualityChangeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfe6c1d", new Object[]{iNetworkQualityChangeListener, qualityChangeFilter});
        } else {
            BandWidthListenerHelper.getInstance().addQualityChangeListener(iNetworkQualityChangeListener, qualityChangeFilter);
        }
    }

    @Deprecated
    public static synchronized void init(Context context) {
        synchronized (Monitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else {
                init();
            }
        }
    }
}
