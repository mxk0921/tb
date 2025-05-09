package com.alipay.mobile.common.transport.monitor.networkqos;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class QosInterfereHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double QOE_NET_INTERFERENCE = 100.0d;
    public static final double e = (1.0d - 0.68d) - 0.27d;
    public static QosInterfereHelper f;
    public double b = -1.0d;
    public double c = -1.0d;
    public int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public long f4127a = 0;

    public static double a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d)})).doubleValue();
        }
        return Math.round(d * 100.0d) / 100.0d;
    }

    public static QosInterfereHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QosInterfereHelper) ipChange.ipc$dispatch("ba1f440d", new Object[0]);
        }
        QosInterfereHelper qosInterfereHelper = f;
        if (qosInterfereHelper != null) {
            return qosInterfereHelper;
        }
        synchronized (QosInterfereHelper.class) {
            try {
                if (f == null) {
                    f = new QosInterfereHelper();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (TextUtils.equals("T", TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NET_QOS_INTERFER))) {
            return true;
        }
        return false;
    }

    public double interferInputRtt(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96753346", new Object[]{this, new Double(d)})).doubleValue();
        }
        try {
            if (!b()) {
                return d;
            }
            long j = this.f4127a;
            if (j == 0) {
                this.c = d;
                this.b = d;
            }
            double d2 = this.c;
            double d3 = this.b;
            this.c = d3;
            this.b = d;
            this.f4127a = j + 1;
            double a2 = a((0.68d * d) + (0.27d * d3) + (e * d2));
            LogCatUtil.debug("QosInterfereHelper", "input:" + d + ",result=" + a2);
            return a2;
        } catch (Throwable th) {
            LogCatUtil.error("QosInterfereHelper", "interferInputRtt ex:" + th.toString());
            return d;
        }
    }

    public void interferOutputRtt(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f005541", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        try {
            if (b()) {
                if (AlipayQosService.getInstance().getRtoLevel(d2) != 4) {
                    this.d = 0;
                } else if (d >= 200.0d) {
                    this.d = 0;
                } else {
                    int i = this.d + 1;
                    this.d = i;
                    if (i >= 5) {
                        LogCatUtil.debug("QosInterfereHelper", "it's time to interfereQos");
                        AlipayQosService.getInstance().estimate(100.0d, (byte) 6);
                        LogCatUtil.debug("QosInterfereHelper", "after interferOutputRtt:" + AlipayQosService.getInstance().getRto());
                        this.d = 0;
                    }
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("QosInterfereHelper", "interferOutputRtt ex:" + th.toString());
        }
    }
}
