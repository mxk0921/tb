package com.taobao.search.filter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.filter.SearchResultNavProcessor;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.bqg;
import tb.ckf;
import tb.cql;
import tb.cvr;
import tb.gu6;
import tb.h1p;
import tb.jrh;
import tb.le1;
import tb.n1p;
import tb.o4p;
import tb.p02;
import tb.q5j;
import tb.q7b;
import tb.r4p;
import tb.srl;
import tb.t2o;
import tb.xvr;
import tb.y4p;
import tb.yak;
import tb.yko;
import tb.zko;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchResultNavProcessor extends p02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792264);
    }

    private final void createProxyCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fd3598", new Object[]{this});
        } else if (yak.b == null) {
            zko zkoVar = new zko();
            zkoVar.q(new xvr());
            zkoVar.o().e(new q5j(zkoVar));
            zkoVar.o().f(new q7b(zkoVar));
            zkoVar.o().g(new q7b(zkoVar));
            yak.b = zkoVar;
        }
    }

    public static /* synthetic */ Object ipc$super(SearchResultNavProcessor searchResultNavProcessor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/filter/SearchResultNavProcessor");
    }

    private final boolean isPreRequest(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dcb817e", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null && !TextUtils.isEmpty(data.getQueryParameter(h1p.KEY_DATASOURCE_TOKEN))) {
            return true;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || TextUtils.isEmpty(extras.getString(h1p.KEY_DATASOURCE_TOKEN))) {
            return false;
        }
        return true;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "SearchResultNavProcessor";
    }

    private final jrh fireFirstSearch(Map<String, String> map, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("6511d506", new Object[]{this, map, intent});
        }
        CommonSearchContext fromMap = CommonSearchContext.fromMap(map);
        String param = fromMap.getParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);
        ckf.f(param, "getParam(...)");
        if (TextUtils.isEmpty(param)) {
            cvr cvrVar = cvr.INSTANCE;
            fromMap.setParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(cvrVar.f()));
            fromMap.setParam(r4p.KEY_GRAY_HAIR, String.valueOf(cvrVar.f()));
        }
        fromMap.init();
        yko ykoVar = yak.f31939a;
        if (ykoVar == null) {
            ykoVar = yak.b;
        }
        jrh b = gu6.b(true, fromMap, ykoVar);
        boolean b2 = bqg.b(intent);
        boolean g = y4p.g();
        if (b2) {
            b.setParam("isPassiveLaunch", "true");
            b.setParam("isPreloadRequest", String.valueOf(g));
        }
        if (!b2 || g) {
            b.a();
            int e = srl.e(fromMap.getParam(h1p.a.PARAM_KEY_COMBO_PAGE), -1);
            if (e > 0) {
                b.doNewSearchWithAssignPage(e);
            } else {
                b.doNewSearch();
            }
        }
        ckf.d(b);
        return b;
    }

    private final jrh initSearchContext(Intent intent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("a842148", new Object[]{this, intent});
        }
        Map<String, String> b = cql.b(intent);
        ckf.d(b);
        initTagsFromUrl(b);
        if (!b.containsKey(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE) && y4p.q()) {
            b.put(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE, "true");
        }
        if (!SearchDoorActivity.y3(intent) && Localization.n()) {
            z = y4p.t();
        }
        b.put(r4p.KEY_TB_2024, String.valueOf(z));
        return fireFirstSearch(b, intent);
    }

    @Override // tb.p02
    public void onHitOldActivity(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ab31f0", new Object[]{this, intent, zmjVar});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(zmjVar, "navContext");
        if (o4p.n2() && !isPreRequest(intent) && !ckf.b(intent.getAction(), AgooConstants.MESSAGE_POPUP) && o4p.p2()) {
            Handler b = le1.b();
            le1.e();
            final String valueOf = String.valueOf(System.currentTimeMillis());
            final Intent intent2 = new Intent();
            intent2.setData(intent.getData());
            intent2.putExtras(intent);
            intent.putExtra(h1p.KEY_DATASOURCE_TOKEN, valueOf);
            intent.putExtra(h1p.KEY_NAV_PRE_REQUEST, true);
            b.post(new Runnable() { // from class: tb.enz
                @Override // java.lang.Runnable
                public final void run() {
                    SearchResultNavProcessor.onHitOldActivity$lambda$0(SearchResultNavProcessor.this, intent2, valueOf);
                }
            });
        }
    }

    private final void initTagsFromUrl(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce656c2", new Object[]{this, map});
            return;
        }
        String remove = map.remove(h1p.KEY_SEARCH_BAR_TAG);
        if (!TextUtils.isEmpty(remove)) {
            try {
                JSONArray parseArray = JSON.parseArray(remove);
                if (parseArray != null) {
                    String str = map.get("q");
                    if (str == null) {
                        str = "";
                    }
                    StringBuilder sb = new StringBuilder(str);
                    int size = parseArray.size();
                    for (int i = 0; i < size; i++) {
                        SearchBarTagBean fromJson = SearchBarTagBean.fromJson(parseArray.getJSONObject(i));
                        if (fromJson != null) {
                            Map<String, String> params = fromJson.getParams();
                            if (params != null) {
                                map.putAll(params);
                            }
                            String q = fromJson.getQ();
                            if (!TextUtils.isEmpty(q)) {
                                sb.append(" ");
                                sb.append(q);
                            }
                            map.put("onTag", fromJson.getDescription());
                            map.put("tagAction", ThemisConfig.SCENE_SELECT);
                        }
                    }
                    map.put(r4p.KEY_TAG_SEARCH_KEYWORD, sb.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHitOldActivity$lambda$0(SearchResultNavProcessor searchResultNavProcessor, Intent intent, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1930ad55", new Object[]{searchResultNavProcessor, intent, str});
            return;
        }
        ckf.g(searchResultNavProcessor, "this$0");
        ckf.g(intent, "$copyIntent");
        ckf.g(str, "$token");
        if (yak.f31939a != null) {
            z = false;
        }
        if (z) {
            searchResultNavProcessor.createProxyCore();
        }
        n1p.b().d(str, searchResultNavProcessor.initSearchContext(intent));
        SearchSdk.Companion.b();
        if (z) {
            yak.b.u(yak.f31939a);
        }
    }
}
