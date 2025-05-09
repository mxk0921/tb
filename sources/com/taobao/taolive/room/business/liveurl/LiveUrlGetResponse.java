package com.taobao.taolive.room.business.liveurl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveUrlGetResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveUrlGetResponseData data;

    static {
        t2o.a(779092818);
    }

    public static /* synthetic */ Object ipc$super(LiveUrlGetResponse liveUrlGetResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/liveurl/LiveUrlGetResponse");
    }

    public void setData(LiveUrlGetResponseData liveUrlGetResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb055f5", new Object[]{this, liveUrlGetResponseData});
        } else {
            this.data = liveUrlGetResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveUrlGetResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveUrlGetResponseData) ipChange.ipc$dispatch("7c3cbc1f", new Object[]{this}) : this.data;
    }
}
