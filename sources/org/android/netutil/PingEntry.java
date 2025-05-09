package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PingEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int seq = 0;
    public int hop = 0;
    public double rtt = -2.0d;

    public void initWith(int i, int i2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a3e341", new Object[]{this, new Integer(i), new Integer(i2), new Double(d)});
            return;
        }
        this.seq = i;
        this.hop = i2;
        this.rtt = d;
    }
}
