package com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.homePageDetail;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomePageDetailResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HomePageDetailResponseData data;

    static {
        t2o.a(779092490);
    }

    public static /* synthetic */ Object ipc$super(HomePageDetailResponse homePageDetailResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/tbliveFllowContent/mtop/homePageDetail/HomePageDetailResponse");
    }

    public void setData(HomePageDetailResponseData homePageDetailResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff940446", new Object[]{this, homePageDetailResponseData});
        } else {
            this.data = homePageDetailResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public HomePageDetailResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomePageDetailResponseData) ipChange.ipc$dispatch("69287622", new Object[]{this}) : this.data;
    }
}
