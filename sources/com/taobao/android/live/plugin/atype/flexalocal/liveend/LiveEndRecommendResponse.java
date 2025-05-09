package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveEndRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveEndRecommendDataBean data;

    static {
        t2o.a(295699511);
    }

    public static /* synthetic */ Object ipc$super(LiveEndRecommendResponse liveEndRecommendResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/liveend/LiveEndRecommendResponse");
    }

    public void setData(LiveEndRecommendDataBean liveEndRecommendDataBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8fbbcf", new Object[]{this, liveEndRecommendDataBean});
        } else {
            this.data = liveEndRecommendDataBean;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveEndRecommendDataBean getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveEndRecommendDataBean) ipChange.ipc$dispatch("64d4a6b", new Object[]{this}) : this.data;
    }
}
