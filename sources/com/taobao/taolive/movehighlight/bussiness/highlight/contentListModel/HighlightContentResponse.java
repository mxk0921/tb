package com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightContentResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HighlightContentResponseData data;

    static {
        t2o.a(779092607);
    }

    public static /* synthetic */ Object ipc$super(HighlightContentResponse highlightContentResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/contentListModel/HighlightContentResponse");
    }

    public void setData(HighlightContentResponseData highlightContentResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b4fcd2", new Object[]{this, highlightContentResponseData});
        } else {
            this.data = highlightContentResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public HighlightContentResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HighlightContentResponseData) ipChange.ipc$dispatch("5e0647ee", new Object[]{this}) : this.data;
    }
}
