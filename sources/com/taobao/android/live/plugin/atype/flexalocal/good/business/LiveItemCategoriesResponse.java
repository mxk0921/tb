package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveItemCategoriesResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveItemCategoriesResponseData data;

    static {
        t2o.a(295698882);
    }

    public static /* synthetic */ Object ipc$super(LiveItemCategoriesResponse liveItemCategoriesResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/LiveItemCategoriesResponse");
    }

    public void setData(LiveItemCategoriesResponseData liveItemCategoriesResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f5b413", new Object[]{this, liveItemCategoriesResponseData});
        } else {
            this.data = liveItemCategoriesResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveItemCategoriesResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItemCategoriesResponseData) ipChange.ipc$dispatch("ae69ae2f", new Object[]{this}) : this.data;
    }
}
