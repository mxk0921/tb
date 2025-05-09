package com.taobao.taolive.room.business.recommendLives;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopMediaplatformAliveRecommendLivesResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopMediaplatformAliveRecommendLivesResponseData data;

    static {
        t2o.a(779092828);
    }

    public static /* synthetic */ Object ipc$super(MtopMediaplatformAliveRecommendLivesResponse mtopMediaplatformAliveRecommendLivesResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/recommendLives/MtopMediaplatformAliveRecommendLivesResponse");
    }

    public void setData(MtopMediaplatformAliveRecommendLivesResponseData mtopMediaplatformAliveRecommendLivesResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9c53d9", new Object[]{this, mtopMediaplatformAliveRecommendLivesResponseData});
        } else {
            this.data = mtopMediaplatformAliveRecommendLivesResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopMediaplatformAliveRecommendLivesResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopMediaplatformAliveRecommendLivesResponseData) ipChange.ipc$dispatch("686a6af5", new Object[]{this}) : this.data;
    }
}
