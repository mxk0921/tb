package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class jlo<BEAN extends SFAuctionBaseCellBean> extends lg3<BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793627);
    }

    public static /* synthetic */ Object ipc$super(jlo jloVar, String str, Object... objArr) {
        if (str.hashCode() == 433644561) {
            super.i((JSONObject) objArr[0], (BaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/baseauction/SFAuctionBaseCellParser");
    }

    public void q(org.json.JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b72db2", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        AuctionBaseBean u = u(jSONObject, baseSearchResult instanceof CommonSearchResult ? ((CommonSearchResult) baseSearchResult).domIcons : null);
        bean.auctionBaseBean = u;
        if (u != null) {
            u.mOutterBean = bean;
            u.utLogMap.put("srp_seq", String.valueOf(bean.pageNo));
            bean.auctionBaseBean.utLogMap.put("srp_pos", String.valueOf(bean.pagePos));
        }
        m(bean.auctionBaseBean, baseSearchResult);
    }

    /* renamed from: r */
    public void l(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3224e4", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        super.i(jSONObject, bean, baseSearchResult);
        s(jSONObject, bean, baseSearchResult);
        t(jSONObject, bean, baseSearchResult);
    }

    public final void s(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c7fddc", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(r4p.VALUE_MODULE_DYNAMIC_CARD);
        if (jSONObject2 != null) {
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = jSONObject2;
            dynamicCardBean.mDynamicCellBean = yak.f31939a.b().a(jSONObject2, null);
            bean.dynamicCardBean = dynamicCardBean;
        }
    }

    public final void t(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ecbf8", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feedback");
        if (jSONObject2 != null) {
            BaseTypedBean c = yak.f31939a.n().c(jSONObject2, baseSearchResult);
            if (c instanceof MuiseBean) {
                MuiseBean muiseBean = (MuiseBean) c;
                muiseBean.model = jSONObject;
                bean.feedbackBean = muiseBean;
            }
        }
    }

    public abstract AuctionBaseBean u(org.json.JSONObject jSONObject, Map<String, SearchDomBean> map);
}
