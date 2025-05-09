package com.taobao.search.jarvis;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.login4android.api.Login;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.acx;
import tb.b64;
import tb.ckf;
import tb.h1p;
import tb.jp8;
import tb.otf;
import tb.r4p;
import tb.t2o;
import tb.t70;
import tb.w3p;
import tb.yj4;
import tb.z2e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchJarvisInputProvider implements z2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792279);
        t2o.a(995098643);
    }

    @Override // tb.z2e
    public Map<String, Object> getInput(String str, otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a8481797", new Object[]{this, str, otfVar});
        }
        ckf.g(str, "trigger");
        ckf.g(otfVar, "jarvisKitWidget");
        HashMap hashMap = new HashMap();
        acx B2 = otfVar.B2();
        ckf.e(B2, "null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        CommonBaseDatasource e = ((b64) B2).e();
        ckf.f(e, "getScopeDatasource(...)");
        CommonBaseDatasource commonBaseDatasource = e;
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getLastSearchResult();
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        boolean z = otfVar.getActivity() instanceof BaseResultActivity;
        hashMap.put("user_id", Login.getUserId());
        hashMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        hashMap.put("tab", commonBaseDatasource.getTab());
        hashMap.put("sort", commonBaseDatasource.w());
        hashMap.put("os", "android");
        hashMap.put("se_keyword", commonBaseDatasource.getKeyword());
        hashMap.put(Constants.SEARCH_FROM, commonBaseDatasource.getParamValue("from"));
        hashMap.put("style", commonBaseDatasource.getUIListStyle().getValue());
        w3p w3pVar = w3p.INSTANCE;
        hashMap.put("buffer_data", w3pVar.b(otfVar));
        hashMap.put("trigger_type", str);
        hashMap.put("current_offset", String.valueOf(otfVar.u2()));
        hashMap.put("context_feature", otfVar.t2());
        jp8 d = w3pVar.d(otfVar);
        hashMap.put("expose_ids", d.b());
        hashMap.put("expose_ts", d.c());
        hashMap.put("unexpose_ids", d.f());
        hashMap.put("unexpose_ts", d.g());
        hashMap.put("last_expose_ids", d.d());
        hashMap.put("last_expose_ts", d.e());
        if (commonSearchResult != null) {
            hashMap.put("max_page", String.valueOf(commonSearchResult.getMainInfo().page));
        }
        if (commonSearchResult2 != null) {
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult2.getMainInfo().rn);
            hashMap.put("wlsort", commonSearchResult2.getMainInfo().abtest);
            hashMap.put("sp_client_session", commonSearchResult2.spClientSession);
            Map<String, String> map = commonSearchResult2.jarvisFeature;
            if (map != null) {
                ckf.f(map, "jarvisFeature");
                if (!map.isEmpty()) {
                    hashMap.put("query_feature", JSON.toJSONString(commonSearchResult2.jarvisFeature));
                }
            }
            int u2 = otfVar.u2();
            if (u2 >= 0 && u2 < commonSearchResult2.getCellsCount()) {
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(otfVar.u2()));
                BaseCellBean baseCellBean = commonSearchResult2.getCells().get(otfVar.u2());
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, baseCellBean.rn);
                hashMap.put("pv_pos", String.valueOf(baseCellBean.pagePos));
                hashMap.put("pv_size", Integer.valueOf(baseCellBean.pageSize));
                hashMap.put("page", String.valueOf(baseCellBean.pageNo));
                if (!TextUtils.isEmpty(baseCellBean.itemId)) {
                    hashMap.put("trigger_item_id", baseCellBean.itemId);
                }
            }
        }
        hashMap.put("jarvis_dynamic_card", "false");
        if (t70.c().f()) {
            hashMap.put("is_debug", "true");
        }
        return hashMap;
    }
}
