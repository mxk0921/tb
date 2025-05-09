package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.gy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xfn extends CommonBaseDatasource {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g1i i;
    public String j;
    public final HashMap<String, BaseCellBean> k = new HashMap<>();
    public JSONObject l;

    static {
        t2o.a(815792292);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfn(yko ykoVar, g1i g1iVar) {
        super(ykoVar);
        ckf.g(ykoVar, "core");
        ckf.g(g1iVar, "mScopeDatasource");
        this.i = g1iVar;
        g1iVar.subscribe(this);
    }

    public static /* synthetic */ Object ipc$super(xfn xfnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 169827238) {
            super.onPostSearch(((Boolean) objArr[0]).booleanValue(), (SearchResult) objArr[1], (SearchResult) objArr[2]);
            return null;
        } else if (hashCode == 1083699496) {
            return new Boolean(super.doNewSearch());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/jarvis/datasource/RankPoolDataSource");
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f76fb66", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void R(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e11544e", new Object[]{this, map});
        }
    }

    public final void W(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2069d61", new Object[]{this, map});
            return;
        }
        map.put("page", String.valueOf(getNextPage()));
        map.put("n", String.valueOf(getPageSize()));
    }

    public final void X(List<? extends BaseCellBean> list, Set<String> set, ArrayList<Map<?, ?>> arrayList) {
        Map<?, ?> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665241ac", new Object[]{this, list, set, arrayList});
            return;
        }
        for (BaseCellBean baseCellBean : list) {
            if (TextUtils.equals(baseCellBean.cardType, "item")) {
                if (baseCellBean instanceof SFAuctionBaseCellBean) {
                    map = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean.jarvisData;
                } else if (baseCellBean instanceof MuiseCellBean) {
                    JSONObject jSONObject = ((MuiseCellBean) baseCellBean).mMuiseBean.model;
                    ckf.f(jSONObject, "model");
                    map = h19.d(jSONObject, "jarvisData");
                } else if (baseCellBean instanceof M3CellBean) {
                    map = ((M3CellBean) baseCellBean).getAuctionBean().jarvisData;
                } else {
                    map = null;
                }
                if (map != null && !map.isEmpty()) {
                    set.addAll(map.keySet());
                    arrayList.add(map);
                }
            }
        }
    }

    public final void Y(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be0f955", new Object[]{this, commonSearchResult});
            return;
        }
        for (BaseCellBean baseCellBean : commonSearchResult.getCells()) {
            if (baseCellBean instanceof SFAuctionBaseCellBean) {
                this.k.put(((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean.itemId, baseCellBean);
            } else if (baseCellBean instanceof M3CellBean) {
                this.k.put(((M3CellBean) baseCellBean).itemId, baseCellBean);
            }
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b9c44f", new Object[]{this});
            return;
        }
        setTotalResult(null);
        setLastResult(null);
        this.k.clear();
    }

    /* renamed from: a0 */
    public void onPostSearch(boolean z, CommonSearchResult commonSearchResult, CommonSearchResult commonSearchResult2) {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea0d5a0", new Object[]{this, new Boolean(z), commonSearchResult, commonSearchResult2});
            return;
        }
        ckf.g(commonSearchResult, "totalResult");
        ckf.g(commonSearchResult2, "lastResult");
        super.onPostSearch(z, commonSearchResult, commonSearchResult2);
        d0(commonSearchResult2);
        if (this.i.isTaskRunning()) {
            Z();
            return;
        }
        CommonSearchResult commonSearchResult3 = (CommonSearchResult) this.i.getLastSearchResult();
        String str = (commonSearchResult3 == null || (mainInfo = commonSearchResult3.getMainInfo()) == null) ? null : mainInfo.rn;
        String str2 = this.j;
        if (str2 == null) {
            ckf.y("mScopeDataSrourceVersion");
            throw null;
        } else if (!TextUtils.equals(str, str2)) {
            c4p.n("SearchJarvisRerank", "扩召回结果被丢弃，因为请求中完成了翻页");
            Z();
        } else {
            Y(commonSearchResult2);
        }
    }

    public final void b0(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddca03c", new Object[]{this, hashMap});
            return;
        }
        hashMap.remove(r4p.KEY_GLOBAL_LBS);
        hashMap.remove("LBS");
        hashMap.remove(m7r.URL_REFERER_ORIGIN);
        hashMap.remove("_navigation_params");
        hashMap.remove("referrer");
        hashMap.remove("scm");
        hashMap.remove(yj4.PARAM_UT_PARAMS);
        hashMap.remove("imei");
        hashMap.remove("imsi");
        hashMap.remove(r4p.KEY_HOMEPAGE_VERSION);
        hashMap.remove("hasPreposeFilter");
        hashMap.remove(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
        hashMap.remove("brand");
        hashMap.remove("apptimestamp");
        hashMap.remove("latitude");
        hashMap.remove("longitude");
        hashMap.remove("utd_id");
        hashMap.remove("sugg");
        hashMap.remove("rainbow");
        hashMap.remove("schemaType");
        hashMap.remove("searchDoorFrom");
        hashMap.remove("search_action");
        hashMap.remove("ttid");
        hashMap.remove("network");
        hashMap.remove(r4p.KEY_COUNTRY_NUM);
        hashMap.remove(r4p.KEY_CITY_CODE);
        hashMap.remove("from");
    }

    public final void c0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981e852b", new Object[]{this, jSONObject});
        } else {
            this.l = jSONObject;
        }
    }

    public final void d0(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b89665", new Object[]{this, commonSearchResult});
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<Map<?, ?>> arrayList = new ArrayList<>();
        List<BaseCellBean> cells = commonSearchResult.getCells();
        ckf.f(cells, "getCells(...)");
        X(cells, hashSet, arrayList);
        List<BaseCellBean> bufferCells = commonSearchResult.getBufferCells();
        ckf.f(bufferCells, "getBufferCells(...)");
        X(bufferCells, hashSet, arrayList);
        List<BaseCellBean> replaceCells = commonSearchResult.getReplaceCells();
        ckf.f(replaceCells, "getReplaceCells(...)");
        X(replaceCells, hashSet, arrayList);
        htf.b().e("dc_mainse_item_feature", new ArrayList<>(hashSet), arrayList, null);
        if (t70.c().f()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "keys", (String) JSON.toJSON(hashSet));
            jSONObject.put((JSONObject) "data", (String) JSON.toJSON(arrayList));
            c4p.B("[XSearchJarvis]", "写JarvisItemFeature", jSONObject);
        }
        Map<String, String> map = commonSearchResult.jarvisFeature;
        if (map != null) {
            ckf.f(map, "jarvisFeature");
            if (!map.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(commonSearchResult.jarvisFeature.keySet());
                ArrayList<Map> arrayList3 = new ArrayList<>();
                arrayList3.add(commonSearchResult.jarvisFeature);
                htf.b().e("dc_mainse_query_feature", arrayList2, arrayList3, null);
                if (t70.c().f()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "keys", (String) JSON.toJSON(arrayList2));
                    jSONObject2.put((JSONObject) "data", (String) JSON.toJSON(arrayList3));
                    c4p.B("[XSearchJarvis]", "写JarvisQueryFeature", jSONObject2);
                }
            }
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a, tb.gy
    public boolean doNewSearch() {
        String str;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        this.k.clear();
        if (this.i.isTaskRunning()) {
            return false;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.i.getLastSearchResult();
        if (commonSearchResult == null || (mainInfo = commonSearchResult.getMainInfo()) == null || (str = mainInfo.rn) == null) {
            str = "";
        }
        this.j = str;
        return super.doNewSearch();
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public z4p<CommonSearchResult> onCreateRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4p) ipChange.ipc$dispatch("7178b05f", new Object[]{this});
        }
        yko ykoVar = yak.f31939a;
        ckf.f(ykoVar, "CORE");
        return new h6o(ykoVar);
    }

    public final void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
            return;
        }
        ckf.g(t2pVar, "after");
        Z();
    }

    @Override // com.taobao.android.meta.data.a
    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a47cd90", new Object[]{this, searchParamImpl, cVar});
        }
        ckf.g(searchParamImpl, "param");
        Map<String, String> v = this.i.v();
        ckf.d(v);
        W(v);
        JSONObject jSONObject = this.l;
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                ckf.f(entry, "next(...)");
                Map.Entry<String, Object> entry2 = entry;
                v.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        this.l = null;
        if (t70.c().f()) {
            HashMap<String, String> hashMap = new HashMap<>(v);
            b0(hashMap);
            c4p.n("SearchJarvisRerank", "fetch request:\n" + JSON.toJSONString((Object) hashMap, true));
        }
        return v;
    }
}
