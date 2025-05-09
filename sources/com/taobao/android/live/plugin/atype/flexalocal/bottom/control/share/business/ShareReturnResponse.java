package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShareReturnResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ShareReturnResponseData data;

    static {
        t2o.a(295698533);
    }

    public static /* synthetic */ Object ipc$super(ShareReturnResponse shareReturnResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/share/business/ShareReturnResponse");
    }

    public void setData(ShareReturnResponseData shareReturnResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c730bc9", new Object[]{this, shareReturnResponseData});
        } else {
            this.data = shareReturnResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public ShareReturnResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareReturnResponseData) ipChange.ipc$dispatch("3d05b3", new Object[]{this}) : this.data;
    }
}
