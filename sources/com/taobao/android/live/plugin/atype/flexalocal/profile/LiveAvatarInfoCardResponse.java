package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveAvatarInfoCardResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveAvatarInfoCardResponseData data;

    static {
        t2o.a(295699557);
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarInfoCardResponse liveAvatarInfoCardResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/profile/LiveAvatarInfoCardResponse");
    }

    public void setData(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a813ce2", new Object[]{this, liveAvatarInfoCardResponseData});
        } else {
            this.data = liveAvatarInfoCardResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveAvatarInfoCardResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveAvatarInfoCardResponseData) ipChange.ipc$dispatch("6920017e", new Object[]{this}) : this.data;
    }
}
