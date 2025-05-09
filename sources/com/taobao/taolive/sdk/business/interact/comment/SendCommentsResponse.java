package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.model.common.SendComments;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SendCommentsResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SendComments data;

    static {
        t2o.a(806356012);
    }

    public static /* synthetic */ Object ipc$super(SendCommentsResponse sendCommentsResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/comment/SendCommentsResponse");
    }

    public void setData(SendComments sendComments) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6626771", new Object[]{this, sendComments});
        } else {
            this.data = sendComments;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public SendComments getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SendComments) ipChange.ipc$dispatch("24fa5a8d", new Object[]{this}) : this.data;
    }
}
