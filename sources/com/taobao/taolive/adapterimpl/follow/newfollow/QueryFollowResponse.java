package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class QueryFollowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private QueryFollowResponseData data;

    static {
        t2o.a(779092303);
    }

    public static /* synthetic */ Object ipc$super(QueryFollowResponse queryFollowResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/follow/newfollow/QueryFollowResponse");
    }

    public void setData(QueryFollowResponseData queryFollowResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a139fe32", new Object[]{this, queryFollowResponseData});
        } else {
            this.data = queryFollowResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public QueryFollowResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryFollowResponseData) ipChange.ipc$dispatch("907be89c", new Object[]{this}) : this.data;
    }
}
