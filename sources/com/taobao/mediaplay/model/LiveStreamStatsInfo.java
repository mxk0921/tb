package com.taobao.mediaplay.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveStreamStatsInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LiveStreamStatsNetwork network;

    static {
        t2o.a(774897769);
    }

    public void copy(LiveStreamStatsInfo liveStreamStatsInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3126661a", new Object[]{this, liveStreamStatsInfo});
        } else {
            this.network = liveStreamStatsInfo.network;
        }
    }
}
