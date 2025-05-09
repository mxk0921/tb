package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GetLiveShareConfigResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GetLiveShareConfigResponseData data;

    static {
        t2o.a(295698536);
    }

    public static /* synthetic */ Object ipc$super(GetLiveShareConfigResponse getLiveShareConfigResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/share/config/GetLiveShareConfigResponse");
    }

    public void setData(GetLiveShareConfigResponseData getLiveShareConfigResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea3d65", new Object[]{this, getLiveShareConfigResponseData});
        } else {
            this.data = getLiveShareConfigResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public GetLiveShareConfigResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GetLiveShareConfigResponseData) ipChange.ipc$dispatch("9cbb5841", new Object[]{this}) : this.data;
    }
}
