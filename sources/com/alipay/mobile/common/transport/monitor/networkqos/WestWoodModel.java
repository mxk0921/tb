package com.alipay.mobile.common.transport.monitor.networkqos;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WestWoodModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Double ERROR = Double.valueOf(-100.0d);

    /* renamed from: a  reason: collision with root package name */
    public static int f4129a;
    public static double b;
    public static double c;

    public final double a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa16", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        if (f4129a == 0) {
            double d3 = (d / d2) * 7.62939453125E-6d;
            b = d3;
            return d3;
        }
        double d4 = (b * 0.75d) + (((d * 0.25d) / d2) * 7.62939453125E-6d);
        b = d4;
        return d4;
    }

    public synchronized double calBw(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("610974f8", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        } else if (Math.abs(d2) < 5.0E-5d) {
            LogCatUtil.debug("WestWoodModel", "calBw error,ts can't small than 0.5ms");
            return ERROR.doubleValue();
        } else {
            double a2 = a(d, d2);
            b = a2;
            int i = f4129a;
            if (i == 0) {
                f4129a = i + 1;
                double d3 = (d / d2) * 7.62939453125E-6d;
                c = d3;
                return d3;
            }
            f4129a = i + 1;
            double d4 = (c * 0.75d) + (a2 * 0.25d);
            c = d4;
            return d4;
        }
    }
}
