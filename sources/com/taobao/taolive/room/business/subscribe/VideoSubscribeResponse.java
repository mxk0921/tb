package com.taobao.taolive.room.business.subscribe;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoSubscribeResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private VideoSubscribeResponseData data;

    static {
        t2o.a(806355699);
    }

    public static /* synthetic */ Object ipc$super(VideoSubscribeResponse videoSubscribeResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/subscribe/VideoSubscribeResponse");
    }

    public void setData(VideoSubscribeResponseData videoSubscribeResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82dc25a0", new Object[]{this, videoSubscribeResponseData});
        } else {
            this.data = videoSubscribeResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public VideoSubscribeResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoSubscribeResponseData) ipChange.ipc$dispatch("af57454a", new Object[]{this}) : this.data;
    }
}
