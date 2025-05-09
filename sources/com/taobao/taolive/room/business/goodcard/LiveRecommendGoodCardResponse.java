package com.taobao.taolive.room.business.goodcard;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveRecommendGoodCardResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveDetailMessinfoResponseData.RecommendCardInfo data;

    static {
        t2o.a(779092811);
    }

    public static /* synthetic */ Object ipc$super(LiveRecommendGoodCardResponse liveRecommendGoodCardResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/goodcard/LiveRecommendGoodCardResponse");
    }

    public void setData(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5febc36", new Object[]{this, recommendCardInfo});
        } else {
            this.data = recommendCardInfo;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveDetailMessinfoResponseData.RecommendCardInfo getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData.RecommendCardInfo) ipChange.ipc$dispatch("8edd45d2", new Object[]{this}) : this.data;
    }
}
