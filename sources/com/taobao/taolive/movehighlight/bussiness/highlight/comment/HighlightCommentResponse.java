package com.taobao.taolive.movehighlight.bussiness.highlight.comment;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightCommentResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HighlightCommentResponseData data;

    static {
        t2o.a(779092596);
    }

    public static /* synthetic */ Object ipc$super(HighlightCommentResponse highlightCommentResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/comment/HighlightCommentResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public HighlightCommentResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HighlightCommentResponseData) ipChange.ipc$dispatch("7f9c2d35", new Object[]{this}) : this.data;
    }
}
