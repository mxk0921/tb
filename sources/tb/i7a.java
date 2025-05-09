package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon.GetCouponRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon.GetCouponResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i7a extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698909);
    }

    public i7a(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(i7a i7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/getCoupon/GetCouponBusiness");
    }

    public void K(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f9a9ad", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("detailInfo")) != null) {
            GetCouponRequest getCouponRequest = new GetCouponRequest();
            getCouponRequest.supplierId = jSONObject2.getString("supplierId");
            getCouponRequest.uuid = jSONObject2.getString("uuid");
            getCouponRequest.couponInstanceSource = jSONObject2.getString("couponInstanceSource");
            getCouponRequest.querySource = jSONObject2.getString(jql.QUERY_SOURCE);
            C(1, getCouponRequest, GetCouponResponse.class);
        }
    }
}
