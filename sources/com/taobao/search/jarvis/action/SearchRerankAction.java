package com.taobao.search.jarvis.action;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.login4android.api.Login;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.acx;
import tb.b64;
import tb.c4p;
import tb.chc;
import tb.ckf;
import tb.fo6;
import tb.frh;
import tb.g6o;
import tb.gtf;
import tb.h19;
import tb.h1p;
import tb.i04;
import tb.i6o;
import tb.jp8;
import tb.jrh;
import tb.o02;
import tb.otf;
import tb.r4p;
import tb.sen;
import tb.t2o;
import tb.t70;
import tb.w3p;
import tb.xfn;
import tb.xgd;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchRerankAction implements chc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String INPUT_EXTEND_SPLIT = "_#_";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792286);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(otf otfVar, String str, String str2) {
            String str3;
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("743de47d", new Object[]{this, otfVar, str, str2});
                return;
            }
            ckf.g(otfVar, "jarvis");
            o02 e = otfVar.B2().e();
            ckf.f(e, "getScopeDatasource(...)");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
            String str4 = null;
            hashMap.put("wlsort", (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.abtest);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) e.getTotalSearchResult();
            if (!(baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null)) {
                str4 = mainInfo.rn;
            }
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, str4);
            if (TextUtils.equals(e.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                str3 = "inshop";
            } else {
                str3 = "mainse";
            }
            hashMap.put("src", str3);
            hashMap.put("errorCode", str);
            hashMap.put("errorMessage", str2);
            sen.a("SearchEdgeCompute", "DropRerankByError", hashMap);
        }

        public final void b(otf otfVar, JSONObject jSONObject) {
            String str;
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            ResultMainInfoBean mainInfo3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d877c6e", new Object[]{this, otfVar, jSONObject});
                return;
            }
            ckf.g(otfVar, "jarvis");
            o02 e = otfVar.B2().e();
            ckf.f(e, "getScopeDatasource(...)");
            HashMap hashMap = new HashMap();
            if (TextUtils.equals(e.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                str = "inshop";
            } else {
                str = "mainse";
            }
            hashMap.put("src", str);
            BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
            String str2 = null;
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo3 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo3.rn);
            hashMap.put("uniq_id", jSONObject != null ? jSONObject.getString("uniq_id") : null);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) e.getTotalSearchResult();
            hashMap.put("wlsort", (baseSearchResult2 == null || (mainInfo2 = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo2.abtest);
            BaseSearchResult baseSearchResult3 = (BaseSearchResult) e.getLastSearchResult();
            if (!(baseSearchResult3 == null || (mainInfo = baseSearchResult3.getMainInfo()) == null)) {
                str2 = Integer.valueOf(mainInfo.page).toString();
            }
            hashMap.put("page", str2);
            sen.a("SearchEdgeCompute", "DropRerankByNewPage", hashMap);
        }

        public final void c(otf otfVar, JSONObject jSONObject) {
            String str;
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            ResultMainInfoBean mainInfo3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed2075ad", new Object[]{this, otfVar, jSONObject});
                return;
            }
            ckf.g(otfVar, "jarvis");
            o02 e = otfVar.B2().e();
            ckf.f(e, "getScopeDatasource(...)");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
            String str2 = null;
            hashMap.put("wlsort", (baseSearchResult == null || (mainInfo3 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo3.abtest);
            if (TextUtils.equals(e.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                str = "inshop";
            } else {
                str = "mainse";
            }
            hashMap.put("src", str);
            hashMap.put("uniq_id", jSONObject != null ? jSONObject.getString("uniq_id") : null);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) e.getTotalSearchResult();
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, (baseSearchResult2 == null || (mainInfo2 = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo2.rn);
            BaseSearchResult baseSearchResult3 = (BaseSearchResult) e.getLastSearchResult();
            if (!(baseSearchResult3 == null || (mainInfo = baseSearchResult3.getMainInfo()) == null)) {
                str2 = Integer.valueOf(mainInfo.page).toString();
            }
            hashMap.put("page", str2);
            sen.a("SearchEdgeCompute", "DropRerankByPaging", hashMap);
        }

        public final void d(otf otfVar, int i, int i2, int i3, JSONObject jSONObject) {
            String str;
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f0f3bb3", new Object[]{this, otfVar, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
                return;
            }
            ckf.g(otfVar, "jarvis");
            o02 e = otfVar.B2().e();
            ckf.f(e, "getScopeDatasource(...)");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
            String str2 = null;
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.rn);
            if (TextUtils.equals(e.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                str = "inshop";
            } else {
                str = "mainse";
            }
            hashMap.put("src", str);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) e.getTotalSearchResult();
            hashMap.put("wlsort", (baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo.abtest);
            if (jSONObject != null) {
                str2 = jSONObject.getString("uniq_id");
            }
            hashMap.put("uniq_id", str2);
            hashMap.put("toRerankCount", String.valueOf(i));
            hashMap.put("rerankCount", String.valueOf(i2));
            hashMap.put("originCount", String.valueOf(i3));
            sen.a("SearchEdgeCompute", "DropItemRerankByLessResult", hashMap);
        }

        public final void e(otf otfVar, int i, int i2, int i3, JSONObject jSONObject) {
            String str;
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2e266ee", new Object[]{this, otfVar, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
                return;
            }
            ckf.g(otfVar, "jarvis");
            o02 e = otfVar.B2().e();
            ckf.f(e, "getScopeDatasource(...)");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
            String str2 = null;
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.rn);
            if (TextUtils.equals(e.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                str = "inshop";
            } else {
                str = "mainse";
            }
            hashMap.put("src", str);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) e.getTotalSearchResult();
            hashMap.put("wlsort", (baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo.abtest);
            if (jSONObject != null) {
                str2 = jSONObject.getString("uniq_id");
            }
            hashMap.put("uniq_id", str2);
            hashMap.put("toRerankCount", String.valueOf(i));
            hashMap.put("rerankCount", String.valueOf(i2));
            hashMap.put("originCount", String.valueOf(i3));
            sen.a("SearchEdgeCompute", "DropP4pRerankByLessResult", hashMap);
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements fo6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jrh f11536a;
        public final /* synthetic */ frh b;
        public final /* synthetic */ otf c;
        public final /* synthetic */ String d;
        public final /* synthetic */ SearchRerankAction e;

        public b(jrh jrhVar, frh frhVar, otf otfVar, String str, SearchRerankAction searchRerankAction) {
            this.f11536a = jrhVar;
            this.b = frhVar;
            this.c = otfVar;
            this.d = str;
            this.e = searchRerankAction;
        }

        @Override // tb.fo6
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
                return;
            }
            SearchRerankAction.Companion.a(this.c, str2, str3);
            c4p.C("[XSearchJarvis]", "rerank模型执行失败， " + str2 + " : " + str3, new Object[0]);
        }

        @Override // tb.fo6
        public void notify(String str, String str2) {
            String str3;
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            } else if (!TextUtils.isEmpty(str2)) {
                JSONObject parseObject = JSON.parseObject(str2);
                JSONObject d = h19.d(parseObject, "results");
                if (t70.c().f()) {
                    c4p.B("[XSearchJarvis]", "rerank callback result:\n", parseObject);
                }
                JSONObject d2 = h19.d(d, "rerank_data");
                ArrayMap arrayMap = new ArrayMap();
                String str4 = null;
                arrayMap.put("uniq_id", d != null ? d.getString("uniq_id") : null);
                if (TextUtils.equals(this.f11536a.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                    str3 = "inshop";
                } else {
                    str3 = "mainse";
                }
                arrayMap.put("src", str3);
                CommonSearchResult commonSearchResult = (CommonSearchResult) this.f11536a.getTotalSearchResult();
                arrayMap.put("wlsort", (commonSearchResult == null || (mainInfo2 = commonSearchResult.getMainInfo()) == null) ? null : mainInfo2.abtest);
                if (d2 == null || d2.isEmpty()) {
                    arrayMap.put("rerank_data_v", "0");
                    sen.a("SearchEdgeCompute", "SearchRerankSuccessCallback", arrayMap);
                    return;
                }
                arrayMap.put("rerank_data_v", "1");
                sen.a("SearchEdgeCompute", "SearchRerankSuccessCallback", arrayMap);
                CommonSearchResult commonSearchResult2 = (CommonSearchResult) this.f11536a.getTotalSearchResult();
                if (!(commonSearchResult2 == null || (mainInfo = commonSearchResult2.getMainInfo()) == null)) {
                    str4 = mainInfo.rn;
                }
                if (this.b.s() == MetaState.LOADING_MORE) {
                    SearchRerankAction.Companion.c(this.c, d);
                } else if (!TextUtils.equals(str4, this.d)) {
                    SearchRerankAction.Companion.b(this.c, d);
                } else {
                    ArrayList access$getItemIdList = SearchRerankAction.access$getItemIdList(this.e, d2, "m");
                    ArrayList access$getItemIdList2 = SearchRerankAction.access$getItemIdList(this.e, d2, "p");
                    xgd x2 = this.c.x2();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    SearchRerankAction.access$fillUnexposedMap(this.e, hashMap, hashMap2, this.c);
                    SearchRerankAction searchRerankAction = this.e;
                    Map<String, BaseCellBean> b = x2.b();
                    ckf.f(b, "getItemBuffer(...)");
                    ArrayList access$getRerankList = SearchRerankAction.access$getRerankList(searchRerankAction, access$getItemIdList, b, hashMap);
                    SearchRerankAction searchRerankAction2 = this.e;
                    Map<String, BaseCellBean> c = x2.c();
                    ckf.f(c, "getP4pBuffer(...)");
                    ArrayList access$getRerankList2 = SearchRerankAction.access$getRerankList(searchRerankAction2, access$getItemIdList2, c, hashMap2);
                    JSONObject d3 = h19.d(d, "clear_buffer");
                    if (d3 != null) {
                        if (d3.getBooleanValue("m")) {
                            c4p.D("[XSearchJarvis]", "清空自然结果buffer", new Object[0]);
                            x2.i();
                        }
                        if (d3.getBooleanValue("p")) {
                            c4p.D("[XSearchJarvis]", "清空广告buffer", new Object[0]);
                            x2.f();
                        }
                        if (d3.getBooleanValue("c")) {
                            c4p.D("[XSearchJarvis]", "清空内容buffer", new Object[0]);
                            x2.e();
                        }
                    }
                    if (!access$getRerankList.isEmpty() || !access$getRerankList2.isEmpty()) {
                        new Handler(Looper.getMainLooper()).post(new i6o(new g6o(d, this.d, access$getRerankList, access$getRerankList2, this.c)));
                    }
                }
            }
        }
    }

    static {
        t2o.a(815792285);
        t2o.a(995098633);
    }

    public static final /* synthetic */ void access$fillUnexposedMap(SearchRerankAction searchRerankAction, HashMap hashMap, HashMap hashMap2, otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fdad9", new Object[]{searchRerankAction, hashMap, hashMap2, otfVar});
        } else {
            searchRerankAction.fillUnexposedMap(hashMap, hashMap2, otfVar);
        }
    }

    public static final /* synthetic */ ArrayList access$getItemIdList(SearchRerankAction searchRerankAction, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e5ad373c", new Object[]{searchRerankAction, jSONObject, str});
        }
        return searchRerankAction.getItemIdList(jSONObject, str);
    }

    public static final /* synthetic */ ArrayList access$getRerankList(SearchRerankAction searchRerankAction, ArrayList arrayList, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("87c8a51b", new Object[]{searchRerankAction, arrayList, map, map2});
        }
        return searchRerankAction.getRerankList(arrayList, map, map2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r5 != null) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r5 != null) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r5 != null) goto L_0x0045;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void appendClickTraceAndJarvisData(com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean r5, java.lang.StringBuilder r6, java.lang.StringBuilder r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.jarvis.action.SearchRerankAction.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "c115c648"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r5 = 3
            r2[r5] = r7
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = r5.cardType
            java.lang.String r1 = "item"
            boolean r0 = tb.ckf.b(r1, r0)
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r0 = r5 instanceof com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean
            java.lang.String r1 = "extend"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0049
            com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean r5 = (com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean) r5
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r5 = r5.auctionBaseBean
            java.lang.String r0 = r5.clickTrace
            if (r0 != 0) goto L_0x0038
            r0 = r2
        L_0x0038:
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.jarvisData
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = r5
        L_0x0046:
            r5 = r2
            r2 = r0
            goto L_0x0091
        L_0x0049:
            boolean r0 = r5 instanceof com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean
            if (r0 == 0) goto L_0x0070
            com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean r5 = (com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean) r5
            com.taobao.android.searchbaseframe.nx3.bean.MuiseBean r0 = r5.mMuiseBean
            com.alibaba.fastjson.JSONObject r0 = r0.model
            java.lang.String r3 = "clickTrace"
            java.lang.String r0 = r0.getString(r3)
            if (r0 != 0) goto L_0x005c
            r0 = r2
        L_0x005c:
            com.taobao.android.searchbaseframe.nx3.bean.MuiseBean r5 = r5.mMuiseBean
            com.alibaba.fastjson.JSONObject r5 = r5.model
            java.lang.String r3 = "jarvisData"
            com.alibaba.fastjson.JSONObject r5 = tb.h19.d(r5, r3)
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = r5.getString(r1)
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0070:
            boolean r0 = r5 instanceof com.taobao.search.m3.M3CellBean
            if (r0 == 0) goto L_0x0090
            com.taobao.search.m3.M3CellBean r5 = (com.taobao.search.m3.M3CellBean) r5
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r0 = r5.getAuctionBean()
            java.lang.String r0 = r0.clickTrace
            if (r0 != 0) goto L_0x007f
            r0 = r2
        L_0x007f:
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r5 = r5.getAuctionBean()
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.jarvisData
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0090:
            r5 = r2
        L_0x0091:
            r6.append(r2)
            java.lang.String r0 = "_#_"
            r6.append(r0)
            r7.append(r5)
            r7.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.jarvis.action.SearchRerankAction.appendClickTraceAndJarvisData(com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean, java.lang.StringBuilder, java.lang.StringBuilder):void");
    }

    private final void appendWsData(BaseCellBean baseCellBean, JSONArray jSONArray) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb0d5a1", new Object[]{this, baseCellBean, jSONArray});
        } else if (ckf.b("item", baseCellBean.cardType)) {
            if (baseCellBean instanceof SFAuctionBaseCellBean) {
                jSONObject = ((SFAuctionBaseCellBean) baseCellBean).wsData;
            } else {
                boolean z = baseCellBean instanceof MuiseCellBean;
                jSONObject = null;
                if (z) {
                    Object obj = ((MuiseCellBean) baseCellBean).mExtraObj.get("wsData");
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    }
                } else if (baseCellBean instanceof M3CellBean) {
                    jSONObject = ((M3CellBean) baseCellBean).getWsData();
                }
            }
            if (jSONObject != null) {
                jSONArray.add(jSONObject);
            }
        }
    }

    private final void fillUnexposedMap(HashMap<String, BaseCellBean> hashMap, HashMap<String, BaseCellBean> hashMap2, otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec88c8", new Object[]{this, hashMap, hashMap2, otfVar});
            return;
        }
        hashMap.clear();
        hashMap2.clear();
        int u2 = otfVar.u2();
        BaseSearchResult baseSearchResult = (BaseSearchResult) otfVar.B2().e().getTotalSearchResult();
        if (baseSearchResult != null) {
            int cellsCount = baseSearchResult.getCellsCount();
            for (int i = u2 + 1; i < cellsCount; i++) {
                BaseCellBean cell = baseSearchResult.getCell(i);
                if (TextUtils.equals(cell.cardType, "item") && !cell.isExposed) {
                    if (cell.isP4p) {
                        hashMap2.put(cell.itemId, cell);
                    } else {
                        hashMap.put(cell.itemId, cell);
                    }
                }
            }
        }
    }

    private final ArrayList<String> getItemIdList(JSONObject jSONObject, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab6acaab", new Object[]{this, jSONObject, str});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray c = h19.c(jSONObject, str);
        if (c != null && !c.isEmpty()) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                Object obj = c.get(i);
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    private final BaseCellBean getLastVisibleItem(otf otfVar, CommonSearchResult commonSearchResult) {
        int u2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("a350ce24", new Object[]{this, otfVar, commonSearchResult});
        }
        if (commonSearchResult != null && (u2 = otfVar.u2()) > 0 && u2 < commonSearchResult.getCellsCount()) {
            return commonSearchResult.getCell(u2);
        }
        return null;
    }

    private final ArrayList<BaseCellBean> getRerankList(ArrayList<String> arrayList, Map<String, ? extends BaseCellBean> map, Map<String, ? extends BaseCellBean> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("dbb0120a", new Object[]{this, arrayList, map, map2});
        }
        ArrayList<BaseCellBean> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            String next = it.next();
            ckf.f(next, "next(...)");
            String str = next;
            BaseCellBean baseCellBean = (BaseCellBean) map.get(str);
            if (baseCellBean == null) {
                baseCellBean = (BaseCellBean) map2.get(str);
            }
            if (baseCellBean != null) {
                arrayList2.add(baseCellBean);
            }
        }
        return arrayList2;
    }

    @Override // tb.chc
    public void processAction(otf otfVar, JSONObject jSONObject, String str) {
        frh combo;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b923ff", new Object[]{this, otfVar, jSONObject, str});
            return;
        }
        ckf.g(otfVar, "jarvis");
        ckf.g(jSONObject, "actionObject");
        JSONObject d = h19.d(jSONObject, "params");
        Map<String, Object> input = getInput(otfVar, d);
        if (t70.c().f()) {
            c4p.B("[XSearchJarvis]", "rerank input data:", new JSONObject(input));
        }
        o02 e = otfVar.B2().e();
        ckf.e(e, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
        jrh jrhVar = (jrh) e;
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null) {
            String str3 = null;
            if (combo.s() == MetaState.LOADING_MORE) {
                Companion.c(otfVar, null);
                return;
            }
            String str4 = commonSearchResult.getMainInfo().rn;
            if (str4 == null) {
                str4 = "";
            }
            String string = d != null ? d.getString("modelPage") : null;
            if (TextUtils.isEmpty(string)) {
                string = "tb_search_srp";
            }
            if (d != null) {
                str3 = d.getString("modelEvent");
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "srp_rerank";
            }
            gtf.i().o(string, str3, input, new b(jrhVar, combo, otfVar, str4, this));
            HashMap hashMap = new HashMap();
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
            hashMap.put("wlsort", commonSearchResult.getMainInfo().abtest);
            if (TextUtils.equals(jrhVar.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
                str2 = "inshop";
            } else {
                str2 = "mainse";
            }
            hashMap.put("src", str2);
            sen.a("SearchEdgeCompute", "SearchRerankCall", hashMap);
        }
    }

    private final Map<String, Object> getInput(otf otfVar, JSONObject jSONObject) {
        CommonSearchResult commonSearchResult;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("838e60f9", new Object[]{this, otfVar, jSONObject});
        }
        acx B2 = otfVar.B2();
        ckf.e(B2, "null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        b64 b64Var = (b64) B2;
        CommonBaseDatasource e = b64Var.e();
        ckf.f(e, "getScopeDatasource(...)");
        CommonBaseDatasource commonBaseDatasource = e;
        xfn l = b64Var.l();
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) commonBaseDatasource.getLastSearchResult();
        CommonSearchResult commonSearchResult3 = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        BaseCellBean lastVisibleItem = getLastVisibleItem(otfVar, commonSearchResult3);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", Login.getUserId());
        hashMap.put("tab", commonBaseDatasource.getTab());
        hashMap.put("sort", commonBaseDatasource.w());
        hashMap.put("os", "android");
        hashMap.put("se_keyword", commonBaseDatasource.getKeyword());
        hashMap.put(Constants.SEARCH_FROM, commonBaseDatasource.getParamValue("from"));
        w3p w3pVar = w3p.INSTANCE;
        hashMap.put("buffer_data", w3pVar.b(otfVar));
        hashMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        hashMap.put("style", commonBaseDatasource.getUIListStyle().getValue());
        hashMap.put("context_feature", otfVar.t2());
        hashMap.put("fetch_rn", (l == null || (commonSearchResult = (CommonSearchResult) l.getTotalSearchResult()) == null || (mainInfo = commonSearchResult.getMainInfo()) == null) ? null : mainInfo.rn);
        jp8 d = w3pVar.d(otfVar);
        hashMap.put("expose_ids", d.b());
        hashMap.put("expose_ts", d.c());
        hashMap.put("unexpose_ids", d.f());
        hashMap.put("unexpose_ts", d.g());
        hashMap.put("last_expose_ids", d.d());
        hashMap.put("last_expose_ts", d.e());
        if (commonSearchResult2 != null) {
            hashMap.put("max_page", String.valueOf(commonSearchResult2.getMainInfo().page));
        }
        if (commonSearchResult3 != null) {
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult3.getMainInfo().rn);
            hashMap.put("wlsort", commonSearchResult3.getMainInfo().abtest);
            Map<String, String> map = commonSearchResult3.jarvisFeature;
            if (map != null && !map.isEmpty()) {
                hashMap.put("query_feature", JSON.toJSONString(commonSearchResult3.jarvisFeature));
            }
            if (commonSearchResult3.isJarvisDataCache) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                JSONArray jSONArray = new JSONArray();
                int min = Math.min(otfVar.v2(), commonSearchResult3.getCellsCount() - 1);
                int max = Math.max(min - 15, 0);
                if (max <= min) {
                    while (true) {
                        BaseCellBean baseCellBean = commonSearchResult3.getCells().get(min);
                        ckf.d(baseCellBean);
                        appendClickTraceAndJarvisData(baseCellBean, sb, sb2);
                        appendWsData(baseCellBean, jSONArray);
                        if (min == max) {
                            break;
                        }
                        min--;
                    }
                }
                xgd x2 = otfVar.x2();
                for (BaseCellBean baseCellBean2 : x2.b().values()) {
                    if (!otfVar.E2(baseCellBean2.itemId)) {
                        appendClickTraceAndJarvisData(baseCellBean2, sb, sb2);
                        appendWsData(baseCellBean2, jSONArray);
                    }
                }
                for (BaseCellBean baseCellBean3 : x2.c().values()) {
                    if (!otfVar.E2(baseCellBean3.itemId)) {
                        appendClickTraceAndJarvisData(baseCellBean3, sb, sb2);
                        appendWsData(baseCellBean3, jSONArray);
                    }
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 3, sb.length());
                    hashMap.put("clickTraces", sb.toString());
                }
                if (sb2.length() > 0) {
                    sb2.delete(sb2.length() - 3, sb2.length());
                    hashMap.put("jarvisDatas", sb2.toString());
                }
                hashMap.put("ws_data", jSONArray.toString());
            }
        }
        xgd x22 = otfVar.x2();
        JSONObject jSONObject2 = new JSONObject();
        List<String> j = x22.j();
        ckf.f(j, "getP4pItemFetchResult(...)");
        jSONObject2.put((JSONObject) "p", i04.j0(j, ",", null, null, 0, null, null, 62, null));
        List<String> k = x22.k();
        ckf.f(k, "getItemFetchResult(...)");
        jSONObject2.put((JSONObject) "m", i04.j0(k, ",", null, null, 0, null, null, 62, null));
        hashMap.put("last_fetch_list", jSONObject2.toString());
        Map<String, Object> s2 = otfVar.s2();
        if (s2 != null) {
            hashMap.putAll(s2);
        } else if (lastVisibleItem != null) {
            hashMap.put("page", Integer.valueOf(lastVisibleItem.pageNo));
            hashMap.put("pv_pos", Integer.valueOf(lastVisibleItem.pagePos));
            hashMap.put("pv_size", Integer.valueOf(lastVisibleItem.pageSize));
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, lastVisibleItem.rn);
        }
        if (t70.c().f()) {
            hashMap.put("is_debug", "true");
        }
        if (jSONObject != null) {
            hashMap.putAll(jSONObject);
        }
        return hashMap;
    }
}
