package com.taobao.taolive.movehighlight.bussiness.highlight.newModel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightRowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HighlightRowResponseData data;

    static {
        t2o.a(779092611);
    }

    public static /* synthetic */ Object ipc$super(HighlightRowResponse highlightRowResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/newModel/HighlightRowResponse");
    }

    public void setData(HighlightRowResponseData highlightRowResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbefc388", new Object[]{this, highlightRowResponseData});
        } else {
            this.data = highlightRowResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public HighlightRowResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HighlightRowResponseData) ipChange.ipc$dispatch("edabf9a4", new Object[]{this}) : this.data;
    }
}
