package com.taobao.mediaplay.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveStreamStatsNetworkVatsb implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long avg;
    public long max;
    public long min;

    static {
        t2o.a(774897771);
    }

    public void copy(LiveStreamStatsNetworkVatsb liveStreamStatsNetworkVatsb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e0879e", new Object[]{this, liveStreamStatsNetworkVatsb});
            return;
        }
        this.min = liveStreamStatsNetworkVatsb.min;
        this.avg = liveStreamStatsNetworkVatsb.avg;
        this.max = liveStreamStatsNetworkVatsb.max;
    }
}
