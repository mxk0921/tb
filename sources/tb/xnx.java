package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.jarvis.rcmd.cell.XslDegradeCellBean;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xnx extends es1<XslDegradeCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792311);
    }

    public static /* synthetic */ Object ipc$super(xnx xnxVar, String str, Object... objArr) {
        if (str.hashCode() == 433644561) {
            super.l((JSONObject) objArr[0], (BaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/cell/XslAuctionCellParser");
    }

    @Override // tb.dx
    public Class<XslDegradeCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return XslDegradeCellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_xsl_degrade_auction";
    }

    /* renamed from: m */
    public XslDegradeCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDegradeCellBean) ipChange.ipc$dispatch("44d32651", new Object[]{this});
        }
        return new XslDegradeCellBean();
    }

    /* renamed from: n */
    public void i(JSONObject jSONObject, XslDegradeCellBean xslDegradeCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa4ca1f", new Object[]{this, jSONObject, xslDegradeCellBean, baseSearchResult});
            return;
        }
        super.l(jSONObject, xslDegradeCellBean, baseSearchResult);
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        if (jSONObject2 != null) {
            xslDegradeCellBean.itemUrl = jSONObject2.getString("itemUrl");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("itemPic");
            if (jSONObject3 != null) {
                xslDegradeCellBean.imageUrl = jSONObject3.getString("src");
                xslDegradeCellBean.width = srl.e(jSONObject3.getString("w"), 1);
                xslDegradeCellBean.height = srl.e(jSONObject3.getString("h"), 1);
            }
            xslDegradeCellBean.soldCount = jSONObject2.getString("itemTotalSales") + Localization.q(R.string.taobao_app_1005_1_16693);
            xslDegradeCellBean.title = jSONObject2.getString("itemTitle");
            xslDegradeCellBean.price = jSONObject2.getString("itemPrice");
        }
    }
}
