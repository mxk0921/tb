package com.taobao.search.searchdoor.sf.widgets;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import tb.amo;
import tb.c2v;
import tb.c4p;
import tb.cvr;
import tb.ej4;
import tb.h1p;
import tb.h3p;
import tb.hrs;
import tb.k1p;
import tb.o0p;
import tb.oen;
import tb.p1p;
import tb.r4p;
import tb.t2o;
import tb.wnl;
import tb.xrl;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchDoorContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTIVATE_PAGE = 10001;
    public static final int SUGGEST_PAGE = 10002;
    public String e;
    public String m;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f11643a = new HashMap();
    public final Map<String, String> b = new HashMap();
    public long c = 0;
    public final o0p d = new o0p();
    public String f = "homepage";
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public int j = 10001;
    public boolean k = false;
    public boolean l = false;

    /* compiled from: Taobao */
    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface SearchDoorStatus {
    }

    static {
        t2o.a(815793107);
    }

    public void A(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938441a8", new Object[]{this, map});
            return;
        }
        ((HashMap) this.f11643a).clear();
        if (map != null) {
            ((HashMap) this.f11643a).putAll(map);
        }
        ((HashMap) this.f11643a).put("q", m());
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c10f394", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", k());
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47255bff", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb469910", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eea60be", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2171012d", new Object[]{this})).booleanValue();
        }
        String q = q(r4p.KEY_POP_UP);
        if (TextUtils.isEmpty(q)) {
            q = q(r4p.KEY_G_POP_UP);
        }
        return "true".equals(q);
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cfc1f92", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void H(Activity activity, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e52f1e", new Object[]{this, activity, new Boolean(z)});
        } else if (z != this.l) {
            if (z) {
                str = "onKeyboardShow";
            } else {
                str = "onKeyboardHide";
            }
            c4p.D("SearchDoorEnv", str, new Object[0]);
            this.l = z;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isShow", (Object) String.valueOf(this.l));
            wnl.INSTANCE.b(activity, "SearchDoorEnv", "keyboardStatus", jSONObject);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4dc60", new Object[]{this});
        } else {
            ((HashMap) this.f11643a).remove("aiSearch");
        }
    }

    public String K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f363b7a6", new Object[]{this, str});
        }
        return (String) ((HashMap) this.f11643a).remove(str);
    }

    public void L(hrs hrsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa56d6af", new Object[]{this, hrsVar});
        }
    }

    public void M(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc2a240", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f731571", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d5fa78", new Object[]{this, str});
        } else {
            S("q", str);
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532b1b0a", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c840710", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504ea892", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void S(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.f11643a).put(str, str2);
        }
    }

    public void T(String str, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b4aa1a", new Object[]{this, str, searchBarHintBean});
        } else {
            this.d.a(str, searchBarHintBean);
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b36dd31", new Object[]{this, str});
        }
    }

    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533d7c53", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f = str;
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ab412", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61d63e", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void Y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d893609", new Object[]{this, map});
        } else if (map != null) {
            ((HashMap) this.b).putAll(map);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad54f9e3", new Object[]{this});
        } else {
            ((HashMap) this.f11643a).put("aiSearch", "true");
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c64859", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((HashMap) this.b).put(str, str2);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7be18421", new Object[]{this});
        }
        String r = r("g_channelHistoryKey", "");
        if (TextUtils.isEmpty(r)) {
            return r(r4p.KEY_CHANNEL_HISTORY_KEY, "");
        }
        return r;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73bc9f39", new Object[]{this});
        }
        String r = r(xrl.G_CHANNELSRP, "");
        if (TextUtils.isEmpty(r)) {
            return r("channelSrp", "");
        }
        return r;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2aac2c8c", new Object[]{this});
        }
        String q = q("g_csearchdoor_spm");
        if (TextUtils.isEmpty(q)) {
            return q("csearchdoor_spm");
        }
        return q;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (currentPageName == null || currentPageName.startsWith("Page_")) {
            return currentPageName;
        }
        return "Page_".concat(currentPageName);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b04cb2e7", new Object[]{this});
        }
        return t("all");
    }

    public Map<String, String> h() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7454292c", new Object[]{this});
        }
        String r = r("SearchTraceParams", "");
        if (TextUtils.isEmpty(r)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(r);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                hashMap.put(str, string);
            }
        }
        return hashMap;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e41998", new Object[]{this});
        }
        return r("placeholder", "");
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9db9c284", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5397aa3e", new Object[]{this});
        }
        String r = r("g_historyOn", "");
        if (TextUtils.isEmpty(r)) {
            return q("historyOn");
        }
        return r;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74abf326", new Object[]{this});
        }
        return r("q", "");
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e202f6", new Object[]{this});
        }
        String r = r("query", "");
        return !TextUtils.isEmpty(r) ? r : r("q", "");
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f22554", new Object[]{this});
        }
        return this.e;
    }

    public HashMap<String, Object> o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("95d32d8d", new Object[]{this, str, str2, str3});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        boolean equals = "true".equals(q(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        float c = p1p.c(ej4.f18611a);
        String f = f();
        hashMap.put("pageName", f);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("suggestRN", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("tab", str2);
        }
        hashMap.put("spm", w());
        hashMap.put("rainbow", oen.j());
        hashMap.put("width", Float.valueOf(c));
        hashMap.put("containerWidth", Float.valueOf(c));
        hashMap.put("channelSrp", d());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) f);
        hashMap.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject);
        hashMap.put("fontSizeLevel", Integer.valueOf(h3p.a(equals)));
        hashMap.put(r4p.KEY_EDITION_CODE, k1p.c());
        hashMap.put(r4p.KEY_GRAY_HAIR, Boolean.valueOf(equals));
        hashMap.put("elderHome", Boolean.valueOf(cvr.INSTANCE.c()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(amo.DIMENSION_BUSINESS_NAME, (Object) zvr.BIZ_TBSEARCH);
        jSONObject2.put("tItemType", (Object) str3);
        jSONObject2.put("sversion", (Object) r4p.SERVER_VERSION_VALUE);
        try {
            jSONObject2.put("rainbow", (Object) oen.n("tbAndroid" + str3 + "EnableLT"));
        } catch (Exception unused) {
        }
        hashMap.put("hubbleInfo", jSONObject2);
        return hashMap;
    }

    public Map<String, String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f86e8326", new Object[]{this});
        }
        return this.b;
    }

    public String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf0db78", new Object[]{this, str});
        }
        return r(str, "");
    }

    public String r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce3438ee", new Object[]{this, str, str2});
        }
        String str3 = (String) ((HashMap) this.f11643a).get(str);
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    public String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("302b157e", new Object[]{this, str});
        }
        String q = q(str);
        if (!TextUtils.isEmpty(q)) {
            return q;
        }
        return q(r4p.GLOBAL_PARAM_PREFIX + str);
    }

    public String t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c010b9f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(null)) {
            return str;
        }
        return null;
    }

    public SearchBarHintBean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintBean) ipChange.ipc$dispatch("2a1af3b8", new Object[]{this, str});
        }
        return this.d.b(str);
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54b95583", new Object[]{this});
        }
        return this.f;
    }

    public String w() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711e20d5", new Object[]{this});
        }
        Map<String, String> h = h();
        String e = e();
        if (TextUtils.isEmpty(e)) {
            e = (h == null || h.isEmpty()) ? null : h.get("spm-cnt");
        }
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        if ("true".equals(r(r4p.KEY_SEARCH_ELDER_HOME_OPEN, "false"))) {
            str = h1p.SEARCH_DOOR_SPM_ELDER_HOME;
        } else {
            str = h1p.SEARCH_DOOR_SPM;
        }
        return str;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("964eb1f8", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public String y(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("debcbb4", new Object[]{this, str});
        }
        SearchBarHintBean u = u(str);
        if (u == null || (str2 = u.suggestRn) == null) {
            return "";
        }
        return str2;
    }

    public Map<String, String> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("673f2bdc", new Object[]{this});
        }
        return new HashMap(this.f11643a);
    }

    public void I(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c158f", new Object[]{this, activity, str});
        } else if (!TextUtils.equals(this.m, str)) {
            c4p.D("SearchDoorStatus", str, new Object[0]);
            this.m = str;
            wnl.INSTANCE.b(activity, "SearchDoorEnv", "searchDoorStatus", str);
        }
    }
}
