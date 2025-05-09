package tb;

import androidx.core.app.FrameMetricsAggregator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sx6 extends lg3<DefaultAuctionCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793633);
    }

    public static /* synthetic */ Object ipc$super(sx6 sx6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultauction/DefaultAuctionCellParser");
    }

    @Override // tb.dx
    public Class<DefaultAuctionCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return DefaultAuctionCellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_auction_2022";
    }

    /* renamed from: q */
    public DefaultAuctionCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultAuctionCellBean) ipChange.ipc$dispatch("168212d7", new Object[]{this});
        }
        return new DefaultAuctionCellBean(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* renamed from: r */
    public void o(JSONObject jSONObject, DefaultAuctionCellBean defaultAuctionCellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25dcfd", new Object[]{this, jSONObject, defaultAuctionCellBean, baseSearchResult});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(defaultAuctionCellBean, "bean");
        JSONObject optJSONObject = jSONObject.optJSONObject(mh1.PRICE_BLOCK);
        if (optJSONObject != null) {
            defaultAuctionCellBean.setPrice(optJSONObject.optString("price", ""));
            defaultAuctionCellBean.setPriceUnit(optJSONObject.optString(mh1.PRICE_UNIT, "￥"));
        }
        defaultAuctionCellBean.setTitle(jSONObject.optString("title", ""));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("itemPic");
        if (optJSONObject2 != null) {
            defaultAuctionCellBean.setImg(kme.a(mqq.c(optJSONObject2.optString("src", ""))));
        }
        String img = defaultAuctionCellBean.getImg();
        if (img == null || img.length() == 0) {
            defaultAuctionCellBean.setImg(kme.a(mqq.c(jSONObject.optString(mh1.PRD_PICURL, ""))));
        }
        defaultAuctionCellBean.setUprightImg(kme.a(mqq.c(jSONObject.optString(mh1.PRD_WF_PICURL, ""))));
        defaultAuctionCellBean.setUprightImgAspectRatio(jSONObject.optString("uprightImgAspectRatio", ""));
        defaultAuctionCellBean.setAuctionUrl(jSONObject.optString("auctionURL", ""));
        String auctionUrl = defaultAuctionCellBean.getAuctionUrl();
        if (auctionUrl == null || auctionUrl.length() == 0) {
            defaultAuctionCellBean.setAuctionUrl(jSONObject.optString("auctionUrl", ""));
        }
        defaultAuctionCellBean.setUtLogMap(jSONObject.optJSONObject("utLogMap"));
        if (defaultAuctionCellBean.getUtLogMap() != null) {
            JSONObject utLogMap = defaultAuctionCellBean.getUtLogMap();
            ckf.d(utLogMap);
            if (utLogMap.length() > 0) {
                return;
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("trace");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            defaultAuctionCellBean.setUtLogMap(optJSONObject3.optJSONObject(yj4.PARAM_UT_PARAMS));
        }
    }
}
