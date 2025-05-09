package com.taobao.taolive.room.business.subscribe;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoCancelSubscribeResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private VideoCancelSubscribeResponseData data;

    static {
        t2o.a(806355696);
    }

    public static /* synthetic */ Object ipc$super(VideoCancelSubscribeResponse videoCancelSubscribeResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/subscribe/VideoCancelSubscribeResponse");
    }

    public void setData(VideoCancelSubscribeResponseData videoCancelSubscribeResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b1047a", new Object[]{this, videoCancelSubscribeResponseData});
        } else {
            this.data = videoCancelSubscribeResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public VideoCancelSubscribeResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoCancelSubscribeResponseData) ipChange.ipc$dispatch("a28fcd64", new Object[]{this}) : this.data;
    }
}
