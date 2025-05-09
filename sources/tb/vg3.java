package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vg3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qqu<BaseCellBean, BaseSearchResult> f29999a;

    static {
        t2o.a(993001785);
    }

    public vg3(yko ykoVar) {
        this.f29999a = new qqu<>(ykoVar, new o4x(), new i8j());
    }

    public BaseCellBean a(JSONObject jSONObject, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("7266b9a6", new Object[]{this, jSONObject, baseSearchResult});
        }
        return b(jSONObject, baseSearchResult, null);
    }

    public void c(String str, es1<? extends BaseCellBean> es1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f76d877", new Object[]{this, str, es1Var});
        } else {
            this.f29999a.e(str, es1Var);
        }
    }

    public void d(es1<? extends BaseCellBean> es1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ef3f2d", new Object[]{this, es1Var});
        } else {
            this.f29999a.f(es1Var);
        }
    }

    public BaseCellBean b(JSONObject jSONObject, BaseSearchResult baseSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("533cbd7a", new Object[]{this, jSONObject, baseSearchResult, jSONObject2});
        }
        BaseCellBean baseCellBean = (BaseCellBean) this.f29999a.d(jSONObject, baseSearchResult);
        boolean z = baseCellBean instanceof WeexCellBean;
        if (z || (baseCellBean instanceof MuiseCellBean)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(XslMUSComponent.KEY_EXTRA_STATUS);
            if (jSONObject3 != null) {
                baseCellBean.extraStatus = jSONObject3;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("extraStorage");
            if (jSONObject4 != null && !jSONObject4.isEmpty() && (baseCellBean instanceof MuiseCellBean)) {
                ((MuiseCellBean) baseCellBean).mStorage.putAll(jSONObject4);
            }
            baseCellBean.barrier = jSONObject.getBooleanValue("xsearchBarrier");
            boolean booleanValue = jSONObject.getBooleanValue("xsearchSection");
            baseCellBean.isSection = booleanValue;
            if (!booleanValue && (jSONObject.get("info") instanceof JSONObject)) {
                baseCellBean.isSection = jSONObject.getJSONObject("info").getBooleanValue("xsearchSection");
            }
            boolean booleanValue2 = jSONObject.getBooleanValue("xsearchFullspan");
            baseCellBean.isFullspan = booleanValue2;
            if (!booleanValue2 && (jSONObject.get("info") instanceof JSONObject)) {
                baseCellBean.isFullspan = jSONObject.getJSONObject("info").getBooleanValue("xsearchFullspan");
            }
            if (jSONObject.getBooleanValue("fullSpan")) {
                baseCellBean.isFullspan = true;
            }
            if (baseCellBean.isSection) {
                baseSearchResult.setHasSections(true);
            }
            if (baseCellBean.barrier) {
                baseSearchResult.setHasBarrier(true);
            }
        }
        if (baseCellBean != null && baseCellBean.isSection) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("xsearchSectionStyle");
            if (jSONObject5 == null && (jSONObject.get("info") instanceof JSONObject)) {
                jSONObject5 = jSONObject.getJSONObject("info").getJSONObject("xsearchSectionStyle");
            }
            if (jSONObject5 != null) {
                baseCellBean.ownedSectionStyle = new w7p(jSONObject5);
            }
            w7p w7pVar = baseCellBean.ownedSectionStyle;
            if (w7pVar != null && w7pVar.h()) {
                baseSearchResult.setHasSectionClip(true);
            }
        }
        if (jSONObject2 != null) {
            jSONObject2 = (JSONObject) jSONObject2.clone();
        }
        if (z) {
            ((WeexCellBean) baseCellBean).mWeexBean.pageInfoExtraStatus = jSONObject2;
        } else if (baseCellBean instanceof MuiseCellBean) {
            ((MuiseCellBean) baseCellBean).mMuiseBean.pageInfoExtraStatus = jSONObject2;
        }
        return baseCellBean;
    }
}
