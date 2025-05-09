package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ct2 implements z5d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLOR_TAG_HIT_HTTP304 = "3";
    public static final String COLOR_TAG_HIT_HTTPCACHE = "4";
    public static final String COLOR_TAG_HIT_ZCACHE = "14";
    public static final String COLOR_TAG_NOT_HIT_CACHE = "1";
    public static final String COLOR_TAG_NOT_HIT_ZCACHE = "99";
    public static final String COLOR_TAG_NOT_ZCACHE_RESOURCE = "20";
    public static final int ZCACHE_ERROR_CODE_MAX = 3100;
    public static final int ZCACHE_ERROR_CODE_MIN = 3000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17297a;
    public final ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();
    public static final a Companion = new a(null);
    public static final HashMap<String, String> c = kotlin.collections.a.i(jpu.a("https://gw.alicdn.com", "gw"), jpu.a("https://g.alicdn.com", at.f), jpu.a("https://img.alicdn.com", "img"));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(850395147);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1aeae021", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "curPageUrl");
            for (String str2 : wsq.z0(q9s.c(), new String[]{","}, false, 0, 6, null)) {
                if (tsq.I(str, str2, false, 2, null)) {
                    TMSLogger.f("HDCache", "命中白名单");
                    return true;
                }
            }
            TMSLogger.f("HDCache", ckf.p("未命中白名单，当前页面: ", str));
            return false;
        }
    }

    static {
        t2o.a(850395146);
        t2o.a(839909634);
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.f17297a = q9s.F();
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            z5d.a.c(this);
        }
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("436906e2", new Object[]{this, str});
        }
        if (str == null || str.length() == 0) {
            return str;
        }
        for (Map.Entry<String, String> entry : c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (tsq.I(str, key, false, 2, null)) {
                return tsq.E(str, key, value, false, 4, null);
            }
        }
        return str;
    }

    public final void h(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e50218a", new Object[]{this, webView, str});
            return;
        }
        ckf.g(webView, "view");
        ckf.g(str, "url");
        if (this.f17297a && Companion.a(str)) {
            webView.evaluateJavascript("window.addEventListener(\"load\",function(){if(!window.__tms_frontend_report_cache&&typeof window.__megability_bridge__!==\"undefined\"&&window.__megability_bridge__.asyncCall){var domains=[\"gw.alicdn.com\",\"g.alicdn.com\",\"img.alicdn.com\"];window.__megability_bridge__.asyncCall(\"CacheTracker\",\"report\",{resources:performance.getEntriesByType(\"resource\").filter(function(entry){const url=new URL(entry.name);return url.protocol===\"https:\"&&domains.includes(url.host)}).slice(0,150).map(function(entry){var cacheTag;var name=entry.name;var transferSize=entry.transferSize;var encodedBodySize=entry.encodedBodySize;var workerStart=entry.workerStart;if(transferSize===300)cacheTag=\"http304\";else if(transferSize===0&&(encodedBodySize>0||workerStart>0))cacheTag=\"httpcache\";else if(transferSize===0&&encodedBodySize===0)cacheTag=\"zcache\";else if(transferSize>0&&transferSize-encodedBodySize===300)cacheTag=\"miss\";return{name:name,cacheTag:cacheTag,transferSize:transferSize,encodedBodySize:encodedBodySize,workerStart:workerStart}})});}});", null);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            z5d.a.a(this);
        }
    }

    public final Integer g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("8c51c684", new Object[]{this, str});
        }
        String substring = str.substring(wsq.e0(str, ",", 0, false, 6, null) + 1);
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        return ssq.m(substring);
    }

    public final void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c348bf", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str2, "zcacheInfo");
        if (this.f17297a && str != null) {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = this.b;
            List<String> list = concurrentHashMap.get(str);
            if (list == null) {
                List<String> synchronizedList = Collections.synchronizedList(new ArrayList(1));
                List<String> putIfAbsent = concurrentHashMap.putIfAbsent(str, synchronizedList);
                list = putIfAbsent == null ? synchronizedList : putIfAbsent;
            }
            list.add(str2);
        }
    }

    public final void a(List<nt2> list, String str) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a810500b", new Object[]{this, list, str});
            return;
        }
        ckf.g(str, "pageUrl");
        if (this.f17297a && Companion.a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) wsq.z0(tsq.E(str, h1p.HTTPS_PREFIX, "", false, 4, null), new String[]{"?"}, false, 0, 6, null).get(0));
            sb.append("#");
            if (list != null) {
                int i = 0;
                for (Object obj : list) {
                    i++;
                    if (i >= 0) {
                        nt2 nt2Var = (nt2) obj;
                        String str5 = nt2Var.f24937a;
                        List<String> list2 = this.b.get(str5);
                        List<String> list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            TMSLogger.b("HDCache", "无ZCacheInfo, url=" + str5 + ", map=" + this.b);
                            str2 = "-";
                        } else {
                            str2 = list2.remove(0);
                        }
                        Integer g = g(str2);
                        if (ckf.b(nt2Var.b, "zcache")) {
                            str4 = "";
                            str3 = "14";
                        } else {
                            if (g == null || !hfn.n(3000, ZCACHE_ERROR_CODE_MAX).h(g.intValue())) {
                                str3 = COLOR_TAG_NOT_HIT_ZCACHE;
                            } else {
                                str3 = COLOR_TAG_NOT_ZCACHE_RESOURCE;
                            }
                            String str6 = nt2Var.b;
                            if (ckf.b(str6, "httpcache")) {
                                str4 = ",4";
                            } else if (ckf.b(str6, "http304")) {
                                str4 = ",3";
                            } else {
                                str4 = ",1";
                            }
                        }
                        sb.append("#");
                        sb.append(f(str5));
                        sb.append("|");
                        sb.append(str2);
                        sb.append("|");
                        sb.append(str3);
                        sb.append(str4);
                        sb.append("|");
                        sb.append(nt2Var.c);
                        sb.append(",");
                        sb.append(nt2Var.d);
                        sb.append("|-|-|-");
                    } else {
                        yz3.p();
                        throw null;
                    }
                }
            }
            IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter != null) {
                iUserTrackerAdapter.customAdvance("19999", "Page_Themis_cache", "report", "", null, kotlin.collections.a.i(jpu.a("v", sb.toString())));
            }
        }
    }
}
