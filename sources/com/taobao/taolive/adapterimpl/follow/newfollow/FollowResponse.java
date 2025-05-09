package com.taobao.taolive.adapterimpl.follow.newfollow;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FollowResponseData data;

    static {
        t2o.a(779092296);
    }

    public static /* synthetic */ Object ipc$super(FollowResponse followResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/follow/newfollow/FollowResponse");
    }

    public void setData(FollowResponseData followResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9391ffe", new Object[]{this, followResponseData});
        } else {
            this.data = followResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public FollowResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FollowResponseData) ipChange.ipc$dispatch("e3e02a1a", new Object[]{this}) : this.data;
    }
}
