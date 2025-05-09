package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MemberCheckResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MemberCheckResponseData data;

    static {
        t2o.a(295698892);
    }

    public static /* synthetic */ Object ipc$super(MemberCheckResponse memberCheckResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/MemberCheckResponse");
    }

    public void setData(MemberCheckResponseData memberCheckResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a3f83e", new Object[]{this, memberCheckResponseData});
        } else {
            this.data = memberCheckResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MemberCheckResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MemberCheckResponseData) ipChange.ipc$dispatch("a135d968", new Object[]{this}) : this.data;
    }
}
