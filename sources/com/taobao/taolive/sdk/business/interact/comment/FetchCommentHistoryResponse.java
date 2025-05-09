package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FetchCommentHistoryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FetchCommentHistoryResponseData data;

    static {
        t2o.a(806356004);
    }

    public static /* synthetic */ Object ipc$super(FetchCommentHistoryResponse fetchCommentHistoryResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/comment/FetchCommentHistoryResponse");
    }

    public void setData(FetchCommentHistoryResponseData fetchCommentHistoryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9a75ab", new Object[]{this, fetchCommentHistoryResponseData});
        } else {
            this.data = fetchCommentHistoryResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public FetchCommentHistoryResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FetchCommentHistoryResponseData) ipChange.ipc$dispatch("34cb47", new Object[]{this}) : this.data;
    }
}
