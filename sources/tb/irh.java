package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class irh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792874);
    }

    public static final /* synthetic */ void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f57284", new Object[]{str, th});
        } else {
            h(str, th);
        }
    }

    public static final void e(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e97a5b", new Object[]{mSearchResult, jSONObject});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "data");
        JSONObject jSONObject2 = jSONObject.getJSONObject(u3b.UI_MODULE_SEARCH_BAR);
        if (jSONObject2 != null) {
            SearchBarBean fromJson = SearchBarBean.fromJson(jSONObject2);
            ckf.d(fromJson);
            i(mSearchResult, fromJson, jSONObject2, jSONObject);
            mSearchResult.setSearchBarInfo(fromJson);
            return;
        }
        mSearchResult.setSearchBarInfo(SearchBarBean.createDefault());
    }

    public static final void f(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3add46", new Object[]{mSearchResult, jSONObject});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "data");
        mSearchResult.templatesParseTraceDigest = new a9u();
        Map<String, TemplateBean> c = qit.c(jSONObject.getJSONArray("templates"), mSearchResult.templatesParseTraceDigest, mSearchResult.c());
        if (c != null) {
            if (mSearchResult.getTemplates() == null) {
                mSearchResult.setTemplates(c);
                return;
            }
            Map<String, TemplateBean> templates = mSearchResult.getTemplates();
            ckf.d(templates);
            templates.putAll(c);
        }
    }

    public static final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6ce761", new Object[]{str});
            return;
        }
        Intent intent = new Intent("afc_page_open_broadcast");
        intent.putExtra("pageName", "share");
        intent.putExtra("pageUrl", str);
        intent.putExtra("openTimestamp", System.currentTimeMillis());
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
    }

    public static final void h(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea60b44", new Object[]{str, th});
            return;
        }
        AppMonitor.Counter.commit("tbsearch", "parseError", str, 1.0d);
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        TLog.loge("search", p6j.MTOP_STAGE_DATAPARSE, str + " parse error:" + stringWriter);
    }

    public static final void i(MSearchResult mSearchResult, SearchBarBean searchBarBean, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fbf03e", new Object[]{mSearchResult, searchBarBean, jSONObject, jSONObject2});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(searchBarBean, "searchBarBean");
        ckf.g(jSONObject, "searchBarJson");
        ckf.g(jSONObject2, "data");
        if (jSONObject.containsKey("tItemType") && ckf.b(searchBarBean.type, "dynamic")) {
            BaseTypedBean d = mSearchResult.c().n().d(jSONObject, mSearchResult, jSONObject2.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
            MuiseBean muiseBean = d instanceof MuiseBean ? (MuiseBean) d : null;
            if (muiseBean != null) {
                searchBarBean.dynamicBean = muiseBean;
            }
        }
    }

    public static final void c(MSearchResult mSearchResult, JSONObject jSONObject, boolean z) {
        String str;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bac043c", new Object[]{mSearchResult, jSONObject, new Boolean(z)});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "dataObject");
        try {
            if (z) {
                str = jSONObject.getString(f1i.KEY_GUIDE_SEARCH_URL);
                if (TextUtils.isEmpty(str)) {
                    str = jSONObject.getString(slo.KEY_BOX_SEARCH);
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (z2) {
                        mSearchResult.guideSearch = true ^ TextUtils.isEmpty(jSONObject.getString(f1i.KEY_GUIDE_SEARCH_URL));
                    }
                } else {
                    return;
                }
            } else {
                str = jSONObject.getString(slo.KEY_BOX_SEARCH);
                if (!TextUtils.isEmpty(str)) {
                    z2 = false;
                } else {
                    return;
                }
            }
            if (jSONObject.getBooleanValue("isTaoCommand")) {
                ckf.d(str);
                g(str);
            }
            jSONObject.remove(slo.KEY_BOX_SEARCH);
            ckf.d(str);
            Map<String, String> f = g6p.f(str);
            ckf.f(f, "getParamsFromUrl(...)");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "tItemType", slo.TYPE_NAME);
            jSONObject2.put((JSONObject) "url", str);
            JSONObject jSONObject3 = new JSONObject();
            f1i.a(jSONObject3, slo.KEY_IMMERSE_STYLE, f.get(slo.KEY_X_IMMERSE_STYLE));
            f1i.a(jSONObject3, slo.KEY_NAVI_STYLE, f.get(slo.KEY_X_NAVI_STYLE));
            f1i.a(jSONObject3, "redirect", f.get(slo.KEY_X_REDIRECT));
            f1i.a(jSONObject3, slo.KEY_HIDE_NAVIBAR, f.get(slo.KEY_X_HIDE_NAVIBAR));
            f1i.a(jSONObject3, slo.KEY_SIZE_RATION, f.get(slo.KEY_X_RATION));
            f1i.a(jSONObject3, slo.KEY_DISABLE_HEADER_SCROLL, f.get(slo.KEY_DISABLE_HEADER_SCROLL));
            f1i.a(jSONObject3, "tabTextNormalColor", f.get("_xsearchTabTextNormalColor"));
            f1i.a(jSONObject3, "tabTextSelectedColor", f.get("_xsearchTabTextSelectedColor"));
            if (z2) {
                jSONObject3.put((JSONObject) "bizType", r4p.VALUE_BIZ_TYPE_NEW_SEARCH);
            } else if (jSONObject.getBooleanValue(slo.KEY_IS_FULL)) {
                jSONObject3.put((JSONObject) "bizType", r4p.VALUE_BIZ_TYPE_QD);
            } else {
                jSONObject3.put((JSONObject) "bizType", r4p.VALUE_BIZ_TYPE_ONESEARCH);
                int intValue = jSONObject.getIntValue("height") - qrl.e(f.get(slo.KEY_X_CUT_HEIGHT), 0);
                jSONObject3.put((JSONObject) "width", jSONObject.getString("width"));
                jSONObject3.put((JSONObject) "height", String.valueOf(intValue));
            }
            jSONObject2.put((JSONObject) "style", (String) jSONObject3);
            jSONObject.put((JSONObject) "sceneHeader", (String) jSONObject2);
        } catch (Throwable th) {
            h(r4p.VALUE_BIZ_TYPE_ONESEARCH, th);
        }
    }

    public static final void d(MSearchResult mSearchResult, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d508d383", new Object[]{mSearchResult, jSONObject});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "data");
        try {
            JSONObject d = h19.d(jSONObject, HorizontalXslComponent.ATTR_PAGE_INFO);
            mSearchResult.pageInfo = d;
            Object clone = d != null ? d.clone() : null;
            mSearchResult.copyPageInfo = clone instanceof JSONObject ? (JSONObject) clone : null;
            if (d != null) {
                String string = d.getString("for_bts");
                if (TextUtils.isEmpty(string)) {
                    str = ju3.a();
                } else {
                    ckf.d(string);
                    if (!tsq.w(string, ";", false, 2, null)) {
                        string = string.concat(";");
                    }
                    str = string + ju3.a();
                }
                d.put((JSONObject) "for_bts", str);
                if (o4p.B0()) {
                    x0p x0pVar = x0p.INSTANCE;
                    x0pVar.c(str);
                    x0pVar.d(str);
                }
            }
        } catch (Throwable th) {
            h(HorizontalXslComponent.ATTR_PAGE_INFO, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00db A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:7:0x003a, B:10:0x0045, B:13:0x0053, B:16:0x0062, B:18:0x00ac, B:25:0x00c9, B:27:0x00db, B:28:0x00de, B:30:0x00ec, B:31:0x00f9, B:32:0x0106), top: B:35:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:7:0x003a, B:10:0x0045, B:13:0x0053, B:16:0x0062, B:18:0x00ac, B:25:0x00c9, B:27:0x00db, B:28:0x00de, B:30:0x00ec, B:31:0x00f9, B:32:0x0106), top: B:35:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9 A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:7:0x003a, B:10:0x0045, B:13:0x0053, B:16:0x0062, B:18:0x00ac, B:25:0x00c9, B:27:0x00db, B:28:0x00de, B:30:0x00ec, B:31:0x00f9, B:32:0x0106), top: B:35:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.taobao.search.refactor.MSearchResult r20, com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.irh.b(com.taobao.search.refactor.MSearchResult, com.alibaba.fastjson.JSONObject):void");
    }
}
