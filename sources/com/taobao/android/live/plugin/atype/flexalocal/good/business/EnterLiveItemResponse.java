package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EnterLiveItemResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public EnterGoodsData data;

    static {
        t2o.a(295698858);
    }

    public static /* synthetic */ Object ipc$super(EnterLiveItemResponse enterLiveItemResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/EnterLiveItemResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public EnterGoodsData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnterGoodsData) ipChange.ipc$dispatch("6239e70d", new Object[]{this}) : this.data;
    }
}
