package com.taobao.taolive.adapterimpl.favorite.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FavoriteResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FavoriteResponseData data;

    static {
        t2o.a(779092290);
    }

    public static /* synthetic */ Object ipc$super(FavoriteResponse favoriteResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/favorite/business/FavoriteResponse");
    }

    public void setData(FavoriteResponseData favoriteResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103b22b7", new Object[]{this, favoriteResponseData});
        } else {
            this.data = favoriteResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public FavoriteResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FavoriteResponseData) ipChange.ipc$dispatch("6db09c21", new Object[]{this}) : this.data;
    }
}
