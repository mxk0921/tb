package com.taobao.search.jarvis.action;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.collections.a;
import tb.acx;
import tb.b64;
import tb.c4p;
import tb.ckf;
import tb.g1i;
import tb.h19;
import tb.jpu;
import tb.lw1;
import tb.o02;
import tb.otf;
import tb.r4p;
import tb.sen;
import tb.t2o;
import tb.t2p;
import tb.t70;
import tb.xfn;
import tb.xgd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchFetchAction extends lw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792284);
    }

    private final JSONObject buildActionParams(JSONObject jSONObject, otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("45f94648", new Object[]{this, jSONObject, otfVar});
        }
        JSONObject jSONObject2 = new JSONObject();
        o02 e = otfVar.B2().e();
        g1i g1iVar = e instanceof g1i ? (g1i) e : null;
        if (g1iVar == null) {
            return jSONObject2;
        }
        jSONObject2.put((JSONObject) "appId", r4p.VALUE_TPP_ROUTER_APP_ID);
        jSONObject2.put((JSONObject) "m", r4p.VALUE_MODULE_RANK_POOL);
        jSONObject2.put((JSONObject) r4p.KEY_P4P_S, String.valueOf(g1iVar.f0()));
        jSONObject2.put((JSONObject) r4p.KEY_ITEM_S, String.valueOf(g1iVar.e0()));
        HashMap hashMap = new HashMap();
        g1iVar.Z(hashMap, null);
        jSONObject2.put((JSONObject) "recedItems", buildRecedItems((String) hashMap.remove("itemIds"), (String) hashMap.remove(r4p.KEY_P4P_IDS)));
        jSONObject2.put((JSONObject) "itemIds", "");
        jSONObject2.put((JSONObject) r4p.KEY_P4P_IDS, "");
        JSONObject d = h19.d(jSONObject, "params");
        if (d != null) {
            jSONObject2.putAll(d);
        }
        return jSONObject2;
    }

    private final String buildRecedItems(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28da03e6", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str2);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ Object ipc$super(SearchFetchAction searchFetchAction, String str, Object... objArr) {
        if (str.hashCode() == -440851457) {
            super.processAction((otf) objArr[0], (JSONObject) objArr[1], (String) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/action/SearchFetchAction");
    }

    @Override // tb.lw1, tb.chc
    public void processAction(otf otfVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b923ff", new Object[]{this, otfVar, jSONObject, str});
            return;
        }
        ckf.g(otfVar, "jarvis");
        ckf.g(jSONObject, "actionResult");
        super.processAction(otfVar, jSONObject, str);
        acx B2 = otfVar.B2();
        ckf.e(B2, "null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        b64 b64Var = (b64) B2;
        CommonBaseDatasource e = b64Var.e();
        ckf.f(e, "getScopeDatasource(...)");
        if (e.isTaskRunning()) {
            c4p.n("SearchJarvisRerank", "fetch被丢弃，因为当前正在翻页");
            return;
        }
        xfn l = b64Var.l();
        if (l != null) {
            if (!l.isSubscribed(this)) {
                l.subscribe(this);
            }
            l.c0(buildActionParams(jSONObject, otfVar));
            l.doNewSearch();
        }
    }

    public final void onEvent(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5953ff6a", new Object[]{this, t2pVar});
            return;
        }
        ckf.g(t2pVar, "after");
        acx B2 = getMJarvisKit().B2();
        ckf.e(B2, "null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        b64 b64Var = (b64) B2;
        xfn l = b64Var.l();
        if (l != null) {
            CommonBaseDatasource e = b64Var.e();
            ckf.f(e, "getScopeDatasource(...)");
            CommonBaseDatasource commonBaseDatasource = e;
            l.unsubscribe(this);
            xgd x2 = getMJarvisKit().x2();
            if (x2 != null) {
                SearchResult lastSearchResult = t2pVar.b().getLastSearchResult();
                BaseSearchResult baseSearchResult = lastSearchResult instanceof BaseSearchResult ? (BaseSearchResult) lastSearchResult : null;
                if (baseSearchResult != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    StringBuilder sb = new StringBuilder();
                    for (int cellsCount = baseSearchResult.getCellsCount() - 1; -1 < cellsCount; cellsCount--) {
                        BaseCellBean baseCellBean = baseSearchResult.getCells().get(cellsCount);
                        if (ckf.b(baseCellBean.cardType, "item")) {
                            if (baseCellBean.isP4p) {
                                arrayList.add(baseCellBean);
                                linkedList.addFirst(baseCellBean.itemId);
                            } else {
                                arrayList2.add(baseCellBean);
                                linkedList2.addFirst(baseCellBean.itemId);
                            }
                            if (t70.c().f()) {
                                sb.append(baseCellBean.itemId);
                                sb.append(',');
                            }
                        }
                    }
                    if (t70.c().f() && sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                        c4p.D("[XSearchJarvis]", "fetch result:" + ((Object) sb), new Object[0]);
                    }
                    x2.g(linkedList2);
                    x2.d(linkedList);
                    if (!arrayList.isEmpty()) {
                        if (t70.c().f()) {
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = arrayList.iterator();
                            ckf.f(it, "iterator(...)");
                            while (it.hasNext()) {
                                Object next = it.next();
                                ckf.f(next, "next(...)");
                                BaseCellBean baseCellBean2 = (BaseCellBean) next;
                                if (sb2.length() > 0) {
                                    sb2.append(',');
                                }
                                sb2.append(baseCellBean2.itemId);
                            }
                            c4p.D("[XSearchJarvis]", "fetch追加广告buffer：" + ((Object) sb2), new Object[0]);
                        }
                        x2.a(arrayList);
                    }
                    if (!arrayList2.isEmpty()) {
                        if (t70.c().f()) {
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it2 = arrayList2.iterator();
                            ckf.f(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                ckf.f(next2, "next(...)");
                                BaseCellBean baseCellBean3 = (BaseCellBean) next2;
                                if (sb3.length() > 0) {
                                    sb3.append(',');
                                }
                                sb3.append(baseCellBean3.itemId);
                            }
                            c4p.D("[XSearchJarvis]", "fetch追加buffer：" + ((Object) sb3), new Object[0]);
                        }
                        x2.h(arrayList2);
                    }
                    Map<String, TemplateBean> templates = baseSearchResult.getTemplates();
                    if (templates != null) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, TemplateBean> entry : templates.entrySet()) {
                            String key = entry.getKey();
                            if (commonBaseDatasource.getTemplate(key) == null) {
                                hashMap.put(key, templates.get(key));
                                sen.a("SearchEdgeCompute", "MergeMissedTemplate", a.i(jpu.a("tItemType", key)));
                            }
                        }
                        commonBaseDatasource.mergeTemplates(hashMap);
                    }
                    triggerSubActions();
                }
            }
        }
    }
}
