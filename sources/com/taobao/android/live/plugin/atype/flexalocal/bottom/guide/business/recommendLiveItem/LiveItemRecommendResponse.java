package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.recommendLiveItem;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveItemRecommendResponseData data;

    static {
        t2o.a(295698547);
    }

    public static /* synthetic */ Object ipc$super(LiveItemRecommendResponse liveItemRecommendResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/business/recommendLiveItem/LiveItemRecommendResponse");
    }

    public void setData(LiveItemRecommendResponseData liveItemRecommendResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc841fe", new Object[]{this, liveItemRecommendResponseData});
        } else {
            this.data = liveItemRecommendResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveItemRecommendResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItemRecommendResponseData) ipChange.ipc$dispatch("a9c2f728", new Object[]{this}) : this.data;
    }
}
