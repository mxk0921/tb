package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QueryTrafficCardResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public QueryTrafficCardRealResponse data;

    static {
        t2o.a(295700070);
    }

    public static /* synthetic */ Object ipc$super(QueryTrafficCardResponse queryTrafficCardResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/traffic/request/QueryTrafficCardResponse");
    }

    public void setData(QueryTrafficCardRealResponse queryTrafficCardRealResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f9a720", new Object[]{this, queryTrafficCardRealResponse});
        } else {
            this.data = queryTrafficCardRealResponse;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public QueryTrafficCardRealResponse getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryTrafficCardRealResponse) ipChange.ipc$dispatch("5bf9007c", new Object[]{this}) : this.data;
    }
}
