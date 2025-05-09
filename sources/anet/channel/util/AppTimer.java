package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AppTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;
    private double startTime = vu3.b.GEO_NOT_SUPPORT;
    private double endTime = vu3.b.GEO_NOT_SUPPORT;
    private double sumTime = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(607125933);
    }

    public AppTimer(String str) {
        this.name = str;
    }

    public synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.startTime = vu3.b.GEO_NOT_SUPPORT;
        this.endTime = vu3.b.GEO_NOT_SUPPORT;
    }

    public double getTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("295ea05", new Object[]{this})).doubleValue();
        }
        return this.sumTime;
    }

    public synchronized void start(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f662bfb", new Object[]{this, new Long(j)});
        } else {
            this.startTime = j;
        }
    }

    public synchronized void stop(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e542c5b", new Object[]{this, new Long(j)});
            return;
        }
        double d = j;
        this.endTime = d;
        double d2 = this.startTime;
        if (d2 > vu3.b.GEO_NOT_SUPPORT && d > d2) {
            this.sumTime += ((d - d2) * 1.0d) / 60000.0d;
        }
    }
}
