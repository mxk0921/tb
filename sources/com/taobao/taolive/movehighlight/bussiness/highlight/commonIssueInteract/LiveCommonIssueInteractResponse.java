package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LiveCommonIssueInteractResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveCommonIssueInteractResponseData data;

    static {
        t2o.a(779092602);
    }

    public static /* synthetic */ Object ipc$super(LiveCommonIssueInteractResponse liveCommonIssueInteractResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/commonIssueInteract/LiveCommonIssueInteractResponse");
    }

    public void setData(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b305af67", new Object[]{this, liveCommonIssueInteractResponseData});
        } else {
            this.data = liveCommonIssueInteractResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveCommonIssueInteractResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveCommonIssueInteractResponseData) ipChange.ipc$dispatch("42197c83", new Object[]{this}) : this.data;
    }
}
