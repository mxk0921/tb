package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.InshopAuctionRadiusBean;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792527);
    }

    public static AuctionBaseBean a(JSONObject jSONObject, Map<String, SearchDomBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("9325e132", new Object[]{jSONObject, map});
        }
        if (jSONObject == null) {
            return null;
        }
        InshopAuctionRadiusBean inshopAuctionRadiusBean = new InshopAuctionRadiusBean();
        mh1.a(jSONObject, inshopAuctionRadiusBean, map);
        inshopAuctionRadiusBean.recommendReason = jSONObject.optString("recommendReason");
        return inshopAuctionRadiusBean;
    }
}
