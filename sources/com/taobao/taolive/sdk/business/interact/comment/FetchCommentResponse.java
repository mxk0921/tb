package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FetchCommentResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FetchCommentResponseData data;

    static {
        t2o.a(806356007);
    }

    public static /* synthetic */ Object ipc$super(FetchCommentResponse fetchCommentResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/comment/FetchCommentResponse");
    }

    public void setData(FetchCommentResponseData fetchCommentResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28d781b", new Object[]{this, fetchCommentResponseData});
        } else {
            this.data = fetchCommentResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public FetchCommentResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FetchCommentResponseData) ipChange.ipc$dispatch("a5320705", new Object[]{this}) : this.data;
    }
}
