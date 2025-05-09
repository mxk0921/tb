package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class QoeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double rtt_s = vu3.b.GEO_NOT_SUPPORT;
    public double rtt_d = vu3.b.GEO_NOT_SUPPORT;
    public double rtt_o = 500.0d;

    public void estimate(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfc406f", new Object[]{this, new Double(d)});
            return;
        }
        double d2 = this.rtt_s;
        if (d2 == vu3.b.GEO_NOT_SUPPORT) {
            this.rtt_s = d;
            double d3 = d * 0.25d;
            this.rtt_d = d3;
            if (d3 <= 500.0d) {
                d3 = 500.0d;
            }
            this.rtt_d = d3;
        } else {
            double d4 = d2 + ((d - d2) * 0.1d);
            this.rtt_s = d4;
            double d5 = d - d4;
            if (d5 < vu3.b.GEO_NOT_SUPPORT) {
                d5 = -d5;
            }
            this.rtt_d = (this.rtt_d * 0.75d) + (d5 * 0.25d);
        }
        this.rtt_o = (this.rtt_s * 1.0d) + (this.rtt_d * 4.0d);
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.rtt_o = vu3.b.GEO_NOT_SUPPORT;
        this.rtt_d = vu3.b.GEO_NOT_SUPPORT;
        this.rtt_s = vu3.b.GEO_NOT_SUPPORT;
    }
}
