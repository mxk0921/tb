package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class es1<BEAN extends BaseCellBean> extends n22<BEAN, BaseSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001784);
    }

    public static /* synthetic */ Object ipc$super(es1 es1Var, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            es1Var.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/impl/cell/BaseCellParser");
    }

    public void l(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d8e411", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        JSONObject d = h19.d(jSONObject, "info");
        String string = jSONObject.getString(q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        bean.cardType = string;
        if (TextUtils.isEmpty(string) && d != null) {
            bean.cardType = d.getString(q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        }
        String string2 = jSONObject.getString("bizItemId");
        bean.bizItemId = string2;
        if (TextUtils.isEmpty(string2) && d != null) {
            bean.bizItemId = d.getString("bizItemId");
        }
        bean.isP4p = jSONObject.getBooleanValue(mh1.PRD_IS_P4P);
        bean.isDynamicLandP4p = jSONObject.getBooleanValue(mh1.PRD_IS_DYNAMIC_LAND_P4P);
        bean.itemId = jSONObject.getString("item_id");
        String string3 = jSONObject.getString("curItemIds");
        if (!TextUtils.isEmpty(string3)) {
            bean.curItemIds = string3.split(",");
        }
        String string4 = jSONObject.getString("curP4pIds");
        if (!TextUtils.isEmpty(string4)) {
            bean.curP4pIds = string4.split(",");
        }
        k(jSONObject, bean, baseSearchResult);
        String string5 = jSONObject.getString(r4p.KEY_EXPOSE_INFO);
        bean.exposeInfo = string5;
        if (TextUtils.isEmpty(string5)) {
            String str = bean.itemId;
            if (TextUtils.isEmpty(str)) {
                str = bean.bizItemId;
            }
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            bean.exposeInfo = str + "#" + bean.type + "#0";
        }
        if (baseSearchResult != null) {
            bean.pageNo = baseSearchResult.getPageNo();
            bean.pagePos = baseSearchResult.getCellsCount();
            bean.setOriginPageNo(bean.pageNo);
            bean.setOriginPagePos(bean.pagePos);
        }
    }
}
