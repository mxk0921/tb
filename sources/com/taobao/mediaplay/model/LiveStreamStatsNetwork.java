package com.taobao.mediaplay.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveStreamStatsNetwork implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LiveStreamStatsNetworkVatsb vatsb;

    static {
        t2o.a(774897770);
    }

    public void copy(LiveStreamStatsNetwork liveStreamStatsNetwork) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d86b1a", new Object[]{this, liveStreamStatsNetwork});
        } else {
            this.vatsb = liveStreamStatsNetwork.vatsb;
        }
    }
}
