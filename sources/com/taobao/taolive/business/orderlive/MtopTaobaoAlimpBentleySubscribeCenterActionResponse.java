package com.taobao.taolive.business.orderlive;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTaobaoAlimpBentleySubscribeCenterActionResponseData data;

    static {
        t2o.a(779092414);
    }

    public static /* synthetic */ Object ipc$super(MtopTaobaoAlimpBentleySubscribeCenterActionResponse mtopTaobaoAlimpBentleySubscribeCenterActionResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/business/orderlive/MtopTaobaoAlimpBentleySubscribeCenterActionResponse");
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionResponseData mtopTaobaoAlimpBentleySubscribeCenterActionResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48259ea", new Object[]{this, mtopTaobaoAlimpBentleySubscribeCenterActionResponseData});
        } else {
            this.data = mtopTaobaoAlimpBentleySubscribeCenterActionResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopTaobaoAlimpBentleySubscribeCenterActionResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTaobaoAlimpBentleySubscribeCenterActionResponseData) ipChange.ipc$dispatch("654e8f14", new Object[]{this}) : this.data;
    }
}
