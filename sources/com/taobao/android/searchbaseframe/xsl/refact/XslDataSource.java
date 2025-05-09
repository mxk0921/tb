package com.taobao.android.searchbaseframe.xsl.refact;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.ckf;
import tb.cox;
import tb.pg1;
import tb.psi;
import tb.t2o;
import tb.y64;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslDataSource extends XslDatasource {
    private cox controller;

    static {
        t2o.a(993002081);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslDataSource(yko ykoVar) {
        super(ykoVar);
        ckf.g(ykoVar, "core");
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslDatasource
    public void addTppPageParam(Map<String, String> map) {
        String str;
        y64 combo;
        if (isMetaMode()) {
            XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
            if (xslSearchResult == null || (combo = xslSearchResult.getCombo(0)) == null || (str = String.valueOf(combo.U())) == null) {
                str = String.valueOf(getNextPage());
            }
            ckf.d(map);
            map.put("page", str);
            map.put("sversion", c().g().a());
            map.put("ttid", c().g().getTtid());
            map.put("utd_id", c().g().getUtdid());
            Map<String, String> map2 = this.mTppParams;
            if (map2 != null) {
                map.putAll(map2);
                return;
            }
            return;
        }
        super.addTppPageParam(map);
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public boolean doNewSearch(JSONObject jSONObject) {
        XslSearchResult xslSearchResult;
        y64 combo;
        if (!isMetaMode() || (xslSearchResult = (XslSearchResult) getTotalSearchResult()) == null || (combo = xslSearchResult.getCombo(0)) == null) {
            return super.doNewSearch(jSONObject);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("searchType", "allSearch");
        doNewSearch(combo, false, jSONObject, hashMap);
        return true;
    }

    @Override // tb.gy
    public boolean doNextPageSearch(JSONObject jSONObject) {
        y64 y64Var;
        if (!isMetaMode()) {
            return super.doNextPageSearch(jSONObject);
        }
        XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
        if (xslSearchResult != null) {
            y64Var = xslSearchResult.getCombo(0);
        } else {
            y64Var = null;
        }
        return searchInternal(createConfig(false, y64Var, false, false, false, null, jSONObject));
    }

    @Override // tb.gy
    public boolean doPartialSearch(Set<String> set, JSONObject jSONObject) {
        if (!isMetaMode()) {
            return super.doPartialSearch(set, jSONObject);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("searchType", "partialSearch");
        if (set != null) {
            hashMap.put("updateConfig", JSON.toJSONString(set));
        }
        XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
        return searchInternal(createConfig(false, xslSearchResult != null ? xslSearchResult.getCombo(0) : null, true, false, false, hashMap, jSONObject));
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslDatasource
    public void doUpdateSearch(JSONObject jSONObject, int i, int i2, boolean z, boolean z2) {
        if (!isMetaMode()) {
            super.doUpdateSearch(jSONObject, i, i2, z, z2);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("searchType", "updateSearch");
        hashMap.put("from", String.valueOf(i));
        hashMap.put(pg1.ATOM_length, String.valueOf(i2));
        hashMap.put("reserveCell", String.valueOf(z));
        hashMap.put("addFromPosition", String.valueOf(z2));
        XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
        searchInternal(createConfig(false, xslSearchResult != null ? xslSearchResult.getCombo(0) : null, true, false, false, hashMap, jSONObject, false));
    }

    public final cox getController() {
        return this.controller;
    }

    public final void setController(cox coxVar) {
        this.controller = coxVar;
        Object obj = this.mAdapter;
        ckf.e(obj, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchResultAdapter<com.taobao.android.meta.common.CommonSearchCombo, com.taobao.android.searchbaseframe.xsl.module.XslSearchResult>");
        ((psi) obj).E(this.controller);
        ckf.e(coxVar, "null cannot be cast to non-null type com.taobao.android.meta.logic.BaseMetaPageController<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.common.CommonSearchCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.common.CommonSearchCombo>>, com.taobao.android.meta.common.CommonSearchCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.common.CommonSearchCombo>>");
        setController((BaseMetaPageController) coxVar);
    }
}
