package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.mtop.RateListDetailRequest;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class sgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final JSONObject a(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1b650eb1", new Object[]{this, rateListDetailRequest});
        }
        ckf.g(rateListDetailRequest, "request");
        return rgn.INSTANCE.b(b(rateListDetailRequest));
    }

    public final String b(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0eb4956", new Object[]{this, rateListDetailRequest});
        }
        StringBuilder sb = new StringBuilder("rateType=");
        String userId = Login.getUserId();
        sb.append(rateListDetailRequest.rateType);
        sb.append(", searchImpr=");
        sb.append(rateListDetailRequest.searchImpr);
        sb.append(", expression=");
        sb.append(rateListDetailRequest.expression);
        sb.append(", fromImpr=");
        sb.append(rateListDetailRequest.fromImpr);
        sb.append(", rateSrc=");
        sb.append(rateListDetailRequest.rateSrc);
        sb.append(", storeId=");
        sb.append(rateListDetailRequest.storeId);
        sb.append(", invokeSource=");
        sb.append(rateListDetailRequest.invokeSource);
        sb.append(", feedId=");
        sb.append(rateListDetailRequest.feedId);
        sb.append(", skuVids=");
        sb.append(rateListDetailRequest.skuVids);
        sb.append(", auctionNumId=");
        sb.append(rateListDetailRequest.auctionNumId);
        sb.append(", feature=");
        sb.append(rateListDetailRequest.feature);
        sb.append(", foldFlag=");
        sb.append(rateListDetailRequest.foldFlag);
        sb.append("userId=");
        sb.append(userId);
        String sb2 = sb.toString();
        ckf.f(sb2, "result.toString()");
        return sb2;
    }

    public final String c(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a19096a", new Object[]{this, rateListDetailRequest});
        }
        ckf.g(rateListDetailRequest, "request");
        return rgn.INSTANCE.c(b(rateListDetailRequest));
    }

    public final void d(RateListDetailRequest rateListDetailRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3669a7f3", new Object[]{this, rateListDetailRequest, jSONObject});
            return;
        }
        ckf.g(rateListDetailRequest, "request");
        ckf.g(jSONObject, "data");
        rgn.INSTANCE.d(b(rateListDetailRequest), jSONObject);
    }

    public final void e(RateListDetailRequest rateListDetailRequest, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6ddafd", new Object[]{this, rateListDetailRequest, jSONObject, str});
            return;
        }
        ckf.g(rateListDetailRequest, "request");
        ckf.g(jSONObject, "data");
        ckf.g(str, "cacheSource");
        rgn.INSTANCE.e(b(rateListDetailRequest), jSONObject, str);
    }
}
