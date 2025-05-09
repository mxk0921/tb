package com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GetCouponResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GetCouponResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class GetCouponResponseData implements INetDataObject {
        public boolean error;

        static {
            t2o.a(295698914);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295698913);
    }

    public static /* synthetic */ Object ipc$super(GetCouponResponse getCouponResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/getCoupon/GetCouponResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public GetCouponResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GetCouponResponseData) ipChange.ipc$dispatch("2eaecad4", new Object[]{this}) : this.data;
    }
}
