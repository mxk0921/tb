package tb;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellBean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class h67 extends lg3<DefaultShopCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793636);
    }

    public static /* synthetic */ Object ipc$super(h67 h67Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultshop/DefaultShopCellParser");
    }

    @Override // tb.dx
    public Class<DefaultShopCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return DefaultShopCellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_shop_2022";
    }

    /* renamed from: q */
    public DefaultShopCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultShopCellBean) ipChange.ipc$dispatch("fbc5f0e7", new Object[]{this});
        }
        return new DefaultShopCellBean(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: r */
    public void o(JSONObject jSONObject, DefaultShopCellBean defaultShopCellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae64fad", new Object[]{this, jSONObject, defaultShopCellBean, baseSearchResult});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(defaultShopCellBean, "bean");
        defaultShopCellBean.setTitle(jSONObject.optString("title"));
        defaultShopCellBean.setLogo(kme.a(mqq.c(jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO))));
        defaultShopCellBean.setShopId(jSONObject.optString("shopId"));
        defaultShopCellBean.setSellerId(jSONObject.optString("sellerId"));
        defaultShopCellBean.setOriginTItemType(jSONObject.optString("originTItemType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("auctions");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            defaultShopCellBean.getAuctions().clear();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    jSONObject2.put("RN", defaultShopCellBean.rn);
                    jSONObject2.put("abTest", defaultShopCellBean.abtest);
                    defaultShopCellBean.getAuctions().add(jSONObject2);
                }
            }
        }
        defaultShopCellBean.setUtLogMap(jSONObject.optJSONObject("utLogMap"));
        defaultShopCellBean.setDetailTrace(jSONObject.optJSONArray("detailTrace"));
    }
}
