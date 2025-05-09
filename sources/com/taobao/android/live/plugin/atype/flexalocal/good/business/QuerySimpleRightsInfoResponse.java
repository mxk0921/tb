package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QuerySimpleRightsInfoResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private QuerySimpleRightsInfoResponseData data;

    static {
        t2o.a(295698903);
    }

    public static /* synthetic */ Object ipc$super(QuerySimpleRightsInfoResponse querySimpleRightsInfoResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/QuerySimpleRightsInfoResponse");
    }

    public void setData(QuerySimpleRightsInfoResponseData querySimpleRightsInfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe53848d", new Object[]{this, querySimpleRightsInfoResponseData});
        } else {
            this.data = querySimpleRightsInfoResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public QuerySimpleRightsInfoResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QuerySimpleRightsInfoResponseData) ipChange.ipc$dispatch("b70f14b7", new Object[]{this}) : this.data;
    }
}
