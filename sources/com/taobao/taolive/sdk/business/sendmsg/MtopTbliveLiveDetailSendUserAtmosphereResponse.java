package com.taobao.taolive.sdk.business.sendmsg;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTbliveLiveDetailSendUserAtmosphereResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String data;

    static {
        t2o.a(806356043);
    }

    public static /* synthetic */ Object ipc$super(MtopTbliveLiveDetailSendUserAtmosphereResponse mtopTbliveLiveDetailSendUserAtmosphereResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/sendmsg/MtopTbliveLiveDetailSendUserAtmosphereResponse");
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }
}
