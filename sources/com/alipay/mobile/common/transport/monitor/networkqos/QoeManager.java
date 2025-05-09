package com.alipay.mobile.common.transport.monitor.networkqos;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.QoeModel;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class QoeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static QoeManager c;
    public final int b = 6;

    /* renamed from: a  reason: collision with root package name */
    public final QoeModel[] f4126a = new QoeModel[6];

    public QoeManager() {
        for (int i = 0; i < this.b; i++) {
            this.f4126a[i] = new QoeModel();
        }
    }

    public static QoeManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QoeManager) ipChange.ipc$dispatch("bb91f1ce", new Object[0]);
        }
        QoeManager qoeManager = c;
        if (qoeManager != null) {
            return qoeManager;
        }
        synchronized (QoeManager.class) {
            try {
                if (c == null) {
                    c = new QoeManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public void estimate(double d, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428c262d", new Object[]{this, new Double(d), new Byte(b)});
            return;
        }
        try {
            int networkType = NetworkUtils.getNetworkType(TransportEnvUtil.getContext());
            this.f4126a[networkType].estimate(d);
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                LogCatUtil.printInfo("QoeManager", "from=" + ((int) b) + ",netType=" + networkType + ",input: rtt=" + d + ",output: rtt_o=" + this.f4126a[networkType].rtt_o + ",rtt_s=" + this.f4126a[networkType].rtt_s + ",rtt_d=" + this.f4126a[networkType].rtt_d);
            }
        } catch (Throwable th) {
            LogCatUtil.error("QoeManager", "estimate ex= " + th.toString());
        }
    }

    public double getRto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98777c2c", new Object[]{this})).doubleValue();
        }
        try {
            return this.f4126a[NetworkUtils.getNetworkType(TransportEnvUtil.getContext())].rtt_o;
        } catch (Throwable th) {
            LogCatUtil.error("QoeManager", "getRto ex= " + th.toString());
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public void resetRtoWhenNetchange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401dfd7c", new Object[]{this});
            return;
        }
        try {
            int networkType = NetworkUtils.getNetworkType(TransportEnvUtil.getContext());
            if (networkType == 3) {
                this.f4126a[networkType].reset();
            }
        } catch (Throwable th) {
            LogCatUtil.error("QoeManager", "resetRtoWhenNetchange ex= " + th.toString());
        }
    }
}
