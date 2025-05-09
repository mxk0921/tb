package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemPersonalityGetResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveItemPersonalityGetResponseData data;

    static {
        t2o.a(295698887);
    }

    public static /* synthetic */ Object ipc$super(LiveItemPersonalityGetResponse liveItemPersonalityGetResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/LiveItemPersonalityGetResponse");
    }

    public void setData(LiveItemPersonalityGetResponseData liveItemPersonalityGetResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1c0da7", new Object[]{this, liveItemPersonalityGetResponseData});
        } else {
            this.data = liveItemPersonalityGetResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveItemPersonalityGetResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItemPersonalityGetResponseData) ipChange.ipc$dispatch("ed8a4043", new Object[]{this}) : this.data;
    }
}
