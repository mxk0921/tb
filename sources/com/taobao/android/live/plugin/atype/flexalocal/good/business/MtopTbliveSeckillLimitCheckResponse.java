package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopTbliveSeckillLimitCheckResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveSeckillLimitCheckResponseData data;

    static {
        t2o.a(295698896);
    }

    public static /* synthetic */ Object ipc$super(MtopTbliveSeckillLimitCheckResponse mtopTbliveSeckillLimitCheckResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/MtopTbliveSeckillLimitCheckResponse");
    }

    public void setData(MtopTbliveSeckillLimitCheckResponseData mtopTbliveSeckillLimitCheckResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94f94d2", new Object[]{this, mtopTbliveSeckillLimitCheckResponseData});
        } else {
            this.data = mtopTbliveSeckillLimitCheckResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopTbliveSeckillLimitCheckResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveSeckillLimitCheckResponseData) ipChange.ipc$dispatch("fb8a3cfc", new Object[]{this}) : this.data;
    }
}
