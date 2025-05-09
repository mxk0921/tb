package com.taobao.taolive.room.business.commission.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OuterTraceResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OuterTraceInfo data;

    static {
        t2o.a(779092800);
    }

    public static /* synthetic */ Object ipc$super(OuterTraceResponse outerTraceResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/commission/request/OuterTraceResponse");
    }

    public void setData(OuterTraceInfo outerTraceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7146a95", new Object[]{this, outerTraceInfo});
        } else {
            this.data = outerTraceInfo;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public OuterTraceInfo getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OuterTraceInfo) ipChange.ipc$dispatch("86b2e71", new Object[]{this}) : this.data;
    }
}
