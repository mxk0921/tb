package com.taobao.taolive.room.afccoldlunch.simple;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTbliveRecommendVideoSimpleQueryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveRecommendVideoSimpleQueryResponseData data;

    static {
        t2o.a(779092787);
    }

    public static /* synthetic */ Object ipc$super(MtopTbliveRecommendVideoSimpleQueryResponse mtopTbliveRecommendVideoSimpleQueryResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/afccoldlunch/simple/MtopTbliveRecommendVideoSimpleQueryResponse");
    }

    public void setData(MtopTbliveRecommendVideoSimpleQueryResponseData mtopTbliveRecommendVideoSimpleQueryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0769764", new Object[]{this, mtopTbliveRecommendVideoSimpleQueryResponseData});
        } else {
            this.data = mtopTbliveRecommendVideoSimpleQueryResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopTbliveRecommendVideoSimpleQueryResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveRecommendVideoSimpleQueryResponseData) ipChange.ipc$dispatch("2fea44ce", new Object[]{this}) : this.data;
    }
}
