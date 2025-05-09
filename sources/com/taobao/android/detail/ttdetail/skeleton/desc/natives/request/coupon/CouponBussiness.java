package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.Unit;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CouponBussiness extends AsynApiTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class CouponResponse extends BaseOutDo {
        private ApiResponse data;

        static {
            t2o.a(912262459);
        }

        public void setData(ApiResponse apiResponse) {
            this.data = apiResponse;
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        public ApiResponse getData() {
            return this.data;
        }
    }

    static {
        t2o.a(912262458);
    }

    public CouponBussiness(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CouponBussiness couponBussiness, String str, Object... objArr) {
        if (str.hashCode() == -1454990703) {
            return couponBussiness.e((ApiRequest) objArr[0], (Map) objArr[1], (ApiRequestListener) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/request/coupon/CouponBussiness");
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.AsynApiTask
    public Class<? extends BaseOutDo> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b98d41cb", new Object[]{this});
        }
        return CouponResponse.class;
    }

    public CouponBussiness g(Unit unit, Map<String, String> map, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CouponBussiness) ipChange.ipc$dispatch("face192c", new Object[]{this, unit, map, apiRequestListener});
        }
        if (unit == null) {
            return this;
        }
        ApiRequest apiRequest = new ApiRequest(unit, map);
        apiRequest.setNeedEcode(true);
        e(apiRequest, map, apiRequestListener);
        return this;
    }
}
