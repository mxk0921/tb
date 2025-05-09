package com.taobao.taolive.movehighlight.bussiness.detail;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTbliveSeckillBusinessThresholdGetResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveSeckillBusinessThresholdGetResponseData data;

    static {
        t2o.a(779092586);
    }

    public static /* synthetic */ Object ipc$super(MtopTbliveSeckillBusinessThresholdGetResponse mtopTbliveSeckillBusinessThresholdGetResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/detail/MtopTbliveSeckillBusinessThresholdGetResponse");
    }

    public void setData(MtopTbliveSeckillBusinessThresholdGetResponseData mtopTbliveSeckillBusinessThresholdGetResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cace2507", new Object[]{this, mtopTbliveSeckillBusinessThresholdGetResponseData});
        } else {
            this.data = mtopTbliveSeckillBusinessThresholdGetResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopTbliveSeckillBusinessThresholdGetResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveSeckillBusinessThresholdGetResponseData) ipChange.ipc$dispatch("8d6df831", new Object[]{this}) : this.data;
    }
}
