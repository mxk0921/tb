package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionListTipBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ih1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TIP_TITLE = "title";

    static {
        t2o.a(815792524);
    }

    public static AuctionListTipBean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionListTipBean) ipChange.ipc$dispatch("9f7009f3", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        AuctionListTipBean auctionListTipBean = new AuctionListTipBean();
        String optString = jSONObject.optString("title");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        auctionListTipBean.title = optString;
        return auctionListTipBean;
    }
}
