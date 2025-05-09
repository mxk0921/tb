package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GoodRecommendDO data;

    static {
        t2o.a(295698709);
    }

    public static /* synthetic */ Object ipc$super(GoodRecommendResponse goodRecommendResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/goodrecommend/GoodRecommendResponse");
    }

    public void setData(GoodRecommendDO goodRecommendDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4dedf7", new Object[]{this, goodRecommendDO});
        } else {
            this.data = goodRecommendDO;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public GoodRecommendDO getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GoodRecommendDO) ipChange.ipc$dispatch("b1ff3d3", new Object[]{this}) : this.data;
    }
}
