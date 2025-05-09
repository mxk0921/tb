package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.search.sf.widgets.list.listcell.inshopauction2020.InshopAuction2020CellBean;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kbf extends jlo<InshopAuction2020CellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793644);
    }

    public static /* synthetic */ Object ipc$super(kbf kbfVar, String str, Object... objArr) {
        if (str.hashCode() == -1011405390) {
            kbfVar.q((JSONObject) objArr[0], (SFAuctionBaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/inshopauction2020/InshopAuction2020CellParser");
    }

    @Override // tb.dx
    public Class<InshopAuction2020CellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return InshopAuction2020CellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_inshop_auction_2020";
    }

    @Override // tb.jlo
    public AuctionBaseBean u(JSONObject jSONObject, Map<String, SearchDomBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("4f6f98ae", new Object[]{this, jSONObject, map});
        }
        AuctionBaseBean a2 = lbf.a(jSONObject, map);
        ckf.f(a2, "parseBean(...)");
        return a2;
    }

    /* renamed from: v */
    public InshopAuction2020CellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InshopAuction2020CellBean) ipChange.ipc$dispatch("e9bd9d0d", new Object[]{this});
        }
        return new InshopAuction2020CellBean();
    }

    /* renamed from: w */
    public void o(JSONObject jSONObject, InshopAuction2020CellBean inshopAuction2020CellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22db8747", new Object[]{this, jSONObject, inshopAuction2020CellBean, baseSearchResult});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(inshopAuction2020CellBean, "bean");
        q(jSONObject, inshopAuction2020CellBean, baseSearchResult);
        x(jSONObject, inshopAuction2020CellBean);
        y(jSONObject, inshopAuction2020CellBean);
    }

    public final void y(JSONObject jSONObject, InshopAuction2020CellBean inshopAuction2020CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf22f5e6", new Object[]{this, jSONObject, inshopAuction2020CellBean});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("topIcon");
        if (optJSONObject != null) {
            inshopAuction2020CellBean.setTopIconUrl(optJSONObject.optString("url"));
            inshopAuction2020CellBean.setTopIconTop(optJSONObject.optInt("top", 0));
            inshopAuction2020CellBean.setTopIconLeft(optJSONObject.optInt("left", 0));
            inshopAuction2020CellBean.setTopIconWidth(optJSONObject.optInt("width"));
            inshopAuction2020CellBean.setTopIconHeight(optJSONObject.optInt("height"));
        }
    }

    public final void x(JSONObject jSONObject, InshopAuction2020CellBean inshopAuction2020CellBean) {
        ArrayList<String> skuPics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdd96e", new Object[]{this, jSONObject, inshopAuction2020CellBean});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("skuPics");
        if (optJSONArray != null && optJSONArray.length() >= 3) {
            inshopAuction2020CellBean.setSkuPics(new ArrayList<>());
            int min = Math.min(optJSONArray.length(), 5);
            for (int i = 0; i < min; i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && (skuPics = inshopAuction2020CellBean.getSkuPics()) != null) {
                    skuPics.add(optString);
                }
            }
        }
    }
}
