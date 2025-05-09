package com.taobao.taolive.sdk.business.media.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UrlListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UrlListInfo data;

    static {
        t2o.a(806356030);
    }

    public static /* synthetic */ Object ipc$super(UrlListResponse urlListResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/media/request/UrlListResponse");
    }

    public void setData(UrlListInfo urlListInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f85f04", new Object[]{this, urlListInfo});
        } else {
            this.data = urlListInfo;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public UrlListInfo getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UrlListInfo) ipChange.ipc$dispatch("a229e22e", new Object[]{this}) : this.data;
    }
}
