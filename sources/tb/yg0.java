package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.model.AfcConfigBean;
import com.taobao.flowcustoms.afc.model.RouterStrategyOrangeData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ROUTER_STRATEGY_ASYNC_MTOP = 1;
    public static final int ROUTER_STRATEGY_LOCAL = 0;
    public static final int ROUTER_STRATEGY_SYNC_MTOP = 2;

    /* renamed from: a  reason: collision with root package name */
    public RouterStrategyOrangeData f32064a;
    public qg0 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements sjd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f32065a;
        public final /* synthetic */ dwc b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(yg0 yg0Var, long j, dwc dwcVar, int i, String str, String str2) {
            this.f32065a = j;
            this.b = dwcVar;
            this.c = i;
            this.d = str;
            this.e = str2;
        }

        @Override // tb.sjd
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            long g = AfcUtils.g();
            vp9.b(AfcCustomSdk.LOG_TIME, "海关网络请求成功节点耗时：" + (g - this.f32065a) + "");
            ah0.d(ah0.AFC_REQUEST_TIME, (g - this.f32065a) + "", "success", null);
            StringBuilder sb = new StringBuilder("AfcCustomSdk === executeRemote === 请求接口成功：");
            sb.append(jSONObject);
            vp9.b("linkx", sb.toString());
            Map<String, Object> a2 = lxf.a(jSONObject);
            dwc dwcVar = this.b;
            if (dwcVar != null) {
                dwcVar.a(true, this.c, this.d, this.e, a2);
            }
        }

        @Override // tb.sjd
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fe84e", new Object[]{this, jSONObject});
                return;
            }
            long g = AfcUtils.g();
            vp9.b(AfcCustomSdk.LOG_TIME, "海关网络请求失败节点耗时：" + (g - this.f32065a) + "");
            ah0.d(ah0.AFC_REQUEST_TIME, (g - this.f32065a) + "", "fail", null);
            StringBuilder sb = new StringBuilder("AfcCustomSdk === executeRemote === 请求接口失败：");
            sb.append(jSONObject);
            vp9.b("linkx", sb.toString());
            dwc dwcVar = this.b;
            if (dwcVar != null) {
                dwcVar.a(false, this.c, this.d, this.e, new HashMap());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements sjd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f32066a;

        public b(yg0 yg0Var, long j) {
            this.f32066a = j;
        }

        @Override // tb.sjd
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            long g = AfcUtils.g();
            vp9.b(AfcCustomSdk.LOG_TIME, "海关网络请求成功节点耗时：" + (g - this.f32066a) + "");
            StringBuilder sb = new StringBuilder("AfcCustomSdk === executeRefineInfoMTOP === 请求接口成功：");
            sb.append(jSONObject);
            vp9.b("linkx", sb.toString());
            try {
                pg0.i().B(jSONObject.getString("afcBackUrl"));
            } catch (JSONException e) {
                e.printStackTrace();
                pg0.i().B("");
            }
        }

        @Override // tb.sjd
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fe84e", new Object[]{this, jSONObject});
                return;
            }
            long g = AfcUtils.g();
            vp9.b(AfcCustomSdk.LOG_TIME, "海关网络请求失败节点耗时：" + (g - this.f32066a) + "");
            StringBuilder sb = new StringBuilder("AfcCustomSdk === executeRefineInfoMTOP === 请求接口失败：");
            sb.append(jSONObject);
            vp9.b("linkx", sb.toString());
            pg0.i().B("");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends TypeReference<Map<String, String>> {
        public c(yg0 yg0Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yg0 f32067a = new yg0(null);

        static {
            t2o.a(467664954);
        }

        public static /* synthetic */ yg0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yg0) ipChange.ipc$dispatch("a9c5e922", new Object[0]);
            }
            return f32067a;
        }
    }

    static {
        t2o.a(467664950);
    }

    public /* synthetic */ yg0(a aVar) {
        this();
    }

    public static yg0 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yg0) ipChange.ipc$dispatch("e29a0306", new Object[0]);
        }
        return d.a();
    }

    public void d(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34470332", new Object[]{this, qg0Var});
            return;
        }
        long g = AfcUtils.g();
        HashMap<String, String> c2 = c(qg0Var);
        vp9.b("linkx", "AfcCustomSdk === executeRefineInfoMTOP === 请求接口参数：" + c2);
        pg0.i().t(i4j.BACK_OPERATION_API, "1.0", c2, new b(this, g));
    }

    public int g(qg0 qg0Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8814a7eb", new Object[]{this, qg0Var})).intValue();
        }
        if (s(qg0Var) && "1".equals(qg0Var.o)) {
            return 0;
        }
        if (!q(qg0Var)) {
            z = f(qg0Var);
        } else if (!k(qg0Var)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        if (j(qg0Var)) {
            return 1;
        }
        return 2;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e355ed00", new Object[]{this})).booleanValue();
        }
        List<String> bizCode = this.f32064a.getBizCode();
        if (!(TextUtils.isEmpty(this.b.q) || bizCode == null || bizCode.size() == 0)) {
            for (String str : bizCode) {
                if (this.b.q.startsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m() {
        boolean z;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74410102", new Object[]{this})).booleanValue();
        }
        List<RouterStrategyOrangeData.H5urlBean> h5url = this.f32064a.getH5url();
        if (!(TextUtils.isEmpty(this.b.f) || h5url == null || h5url.size() == 0)) {
            Uri parse = Uri.parse(this.b.f);
            String host = parse.getHost();
            String path = parse.getPath();
            for (RouterStrategyOrangeData.H5urlBean h5urlBean : h5url) {
                if (TextUtils.isEmpty(h5urlBean.getHost()) || !h5urlBean.getHost().equals(host)) {
                    z = false;
                } else {
                    z = true;
                }
                if (TextUtils.isEmpty(h5urlBean.getPath()) || (!TextUtils.isEmpty(h5urlBean.getPath()) && h5urlBean.getPath().equals(path))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (h5urlBean.getQuery() == null || (h5urlBean.getQuery() != null && n(h5urlBean.getQuery()))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && z2 && z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72ae4a59", new Object[]{this, list})).booleanValue();
        }
        if (!(TextUtils.isEmpty(this.b.f) || list == null || list.size() == 0)) {
            Uri parse = Uri.parse(this.b.f);
            boolean z = false;
            for (Object obj : list) {
                for (Map.Entry entry : ((Map) JSON.parseObject(obj.toString(), new c(this), new Feature[0])).entrySet()) {
                    if (TextUtils.isEmpty(parse.getQueryParameter((String) entry.getKey())) || (!((String) entry.getValue()).equals("*") && !((String) entry.getValue()).equals(parse.getQueryParameter((String) entry.getKey())))) {
                        z = false;
                        continue;
                        break;
                    }
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(qg0 qg0Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a760241d", new Object[]{this, qg0Var});
        } else if (!ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "disable_link_tbrest_report")) {
            if (zap.b().f32654a == null || zap.b().c == null) {
                vp9.b("linkx", "you need init rest send service");
                return;
            }
            HashMap hashMap = new HashMap();
            if ("cold".equalsIgnoreCase(pg0.i().b())) {
                str = "0";
            } else {
                str = "1";
            }
            hashMap.put("_is_hl", str);
            hashMap.put("_afc_id", AfcCustomSdk.h().e);
            zap.b().e(null, System.currentTimeMillis(), BHRTaskConfigBase.TYPE_CONFIG_UT, 61004, "flow_start", "", "", hashMap);
            vp9.b("linkx", "report by TBRest, params=" + hashMap);
        }
    }

    public boolean p(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd4ab785", new Object[]{this, qg0Var})).booleanValue();
        }
        return pg0.i().x(qg0Var);
    }

    public boolean q(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cabc193", new Object[]{this, qg0Var})).booleanValue();
        }
        return pg0.i().v(qg0Var);
    }

    public final boolean r(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("770c3566", new Object[]{this, qg0Var})).booleanValue();
        }
        return pg0.i().y(qg0Var);
    }

    public boolean s(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bed8a361", new Object[]{this, qg0Var})).booleanValue();
        }
        return pg0.i().u(qg0Var);
    }

    public yg0() {
    }

    public final HashMap<String, String> c(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e6c9536c", new Object[]{this, qg0Var});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (qg0Var == null) {
            vp9.a("linkx", "buildParamsRefine === requestApi === afcContext为空，不请求网络");
            return hashMap;
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        String str = qg0.D;
        if (str == null) {
            str = "";
        }
        jSONObject.put("packageName", (Object) str);
        jSONObject.put("imei", (Object) AfcUtils.j(AfcCustomSdk.h().f10563a, false));
        jSONObject.put("oaid", (Object) pg0.i().l(""));
        jSONObject.put("hasLoginToken", (Object) (pg0.i().o() + ""));
        jSONObject.put("launchType", (Object) pg0.i().k("COLD"));
        jSONObject.put("deviceLevel", (Object) (pg0.i().h(-1) + ""));
        hashMap.put("afcId", AfcCustomSdk.h().e);
        hashMap.put("url", qg0Var.w);
        hashMap.put("extraInfo", jSONObject.toJSONString());
        return hashMap;
    }

    public boolean j(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc9e960b", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            vp9.b("linkx", "AfcCustomSdk === isAsyncMTOPRouter === error：" + th);
        }
        if (!Boolean.parseBoolean(pg0.i().c("useAsyncRouter", "true")) || TextUtils.isEmpty(qg0Var.f)) {
            return false;
        }
        Uri parse = Uri.parse(qg0Var.f);
        String path = parse.getPath();
        String str = parse.getHost() + path;
        AfcConfigBean.RouterRulesBean routerRulesBean = (AfcConfigBean.RouterRulesBean) vg0.c().a("afc_config_inner", AfcConfigBean.RouterRulesBean.class);
        if (routerRulesBean == null) {
            return false;
        }
        List<String> asyncRequestPathWhiteList = routerRulesBean.getAsyncRequestPathWhiteList();
        List<String> asyncRequestBlackList = routerRulesBean.getAsyncRequestBlackList();
        if (asyncRequestBlackList != null && asyncRequestBlackList.size() > 0) {
            for (String str2 : asyncRequestBlackList) {
                if (str2.equalsIgnoreCase(str)) {
                    return false;
                }
            }
        }
        if (asyncRequestPathWhiteList != null && asyncRequestPathWhiteList.size() > 0) {
            for (String str3 : asyncRequestPathWhiteList) {
                if (str3.equalsIgnoreCase(str)) {
                    return pg0.i().w(qg0Var);
                }
            }
        }
        return false;
    }

    public final HashMap<String, String> a(qg0 qg0Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ba7ff9f0", new Object[]{this, qg0Var, new Integer(i)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (qg0Var == null) {
            vp9.a("linkx", "NetRequestImp === requestApi === afcContext为空，不请求网络");
            return hashMap;
        }
        Uri uri = qg0Var.m;
        String str = "";
        if (uri != null) {
            ((HashMap) qg0Var.l).put("scheme", uri.getScheme() == null ? str : qg0Var.m.getScheme());
        }
        Map<String, String> map = qg0Var.l;
        ((HashMap) map).put("deviceLevel", pg0.i().h(-1) + str);
        ((HashMap) qg0Var.l).put("launchType", pg0.i().k("COLD"));
        ((HashMap) qg0Var.l).put(ah0.AFC_ID, AfcCustomSdk.h().e);
        Map<String, String> map2 = qg0Var.l;
        ((HashMap) map2).put("hasLoginToken", pg0.i().o() + str);
        ((HashMap) qg0Var.l).put("surge_ssr", String.valueOf(r(qg0Var)));
        hashMap.put("imei", AfcUtils.j(AfcCustomSdk.h().f10563a, false));
        hashMap.put("oaid", pg0.i().l(str));
        String str2 = qg0Var.f26733a;
        if (str2 == null) {
            str2 = str;
        }
        hashMap.put("appKey", str2);
        String str3 = qg0.D;
        if (str3 == null) {
            str3 = str;
        }
        hashMap.put("packageName", str3);
        hashMap.put("action", AfcUtils.d(qg0Var.d, qg0Var.e) == null ? str : AfcUtils.d(qg0Var.d, qg0Var.e));
        String str4 = qg0Var.g;
        if (str4 == null) {
            str4 = str;
        }
        hashMap.put("backUrl", str4);
        String str5 = qg0Var.c;
        if (str5 == null) {
            str5 = str;
        }
        hashMap.put("sdkVersion", str5);
        String str6 = qg0Var.f;
        if (str6 == null) {
            str6 = str;
        }
        hashMap.put("h5Url", str6);
        Uri uri2 = qg0Var.m;
        if (uri2 != null) {
            str = uri2.toString();
        }
        hashMap.put("origUrl", str);
        hashMap.put("extra", JSON.toJSONString(qg0Var.l));
        hashMap.put(rle.MODULES, "all");
        if (i == 1) {
            hashMap.put("async", "true");
        }
        return hashMap;
    }

    public final HashMap<String, String> b(qg0 qg0Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5fec65c8", new Object[]{this, qg0Var, new Integer(i)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (qg0Var == null) {
            vp9.a("linkx", "buildParamsNew === requestApi === afcContext为空，不请求网络");
            return hashMap;
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        String str = qg0.D;
        if (str == null) {
            str = "";
        }
        jSONObject.put("packageName", (Object) str);
        jSONObject.put("imei", (Object) AfcUtils.j(AfcCustomSdk.h().f10563a, false));
        jSONObject.put("oaid", (Object) pg0.i().l(""));
        jSONObject.put("hasLoginToken", (Object) (pg0.i().o() + ""));
        jSONObject.put("launchType", (Object) pg0.i().k("COLD"));
        jSONObject.put("deviceLevel", (Object) (pg0.i().h(-1) + ""));
        jSONObject.put("surge_ssr", (Object) String.valueOf(r(qg0Var)));
        if (i == 1) {
            jSONObject.put("async", (Object) "true");
        }
        hashMap.put("afcId", AfcCustomSdk.h().e);
        hashMap.put("targetUrl", qg0Var.n);
        hashMap.put("extraInfo", jSONObject.toJSONString());
        hashMap.put("appKeys", qg0Var.A);
        if (i == 0) {
            hashMap.put("onlyQueryBackAppInfo", "true");
        }
        return hashMap;
    }

    public final boolean f(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f467e3a", new Object[]{this, qg0Var})).booleanValue();
        }
        boolean z = pg0.i().k;
        boolean z2 = !z;
        vp9.a("linkx", "AfcCustomSdk === routerUrl === 是否服务端分流：" + z2);
        if (TextUtils.isEmpty(qg0Var.f)) {
            return false;
        }
        if (z) {
            Uri parse = Uri.parse(qg0Var.f);
            String path = parse.getPath();
            String str = parse.getHost() + path;
            AfcConfigBean d2 = pg0.i().d("afc_config_inner");
            if (!(d2 == null || d2.getRouterRules() == null)) {
                List<String> routerWhiteList = d2.getRouterRules().getRouterWhiteList();
                if (routerWhiteList != null && routerWhiteList.size() > 0 && routerWhiteList.contains(str)) {
                    return true;
                }
                String str2 = qg0Var.q;
                if (str2 != null && str2.length() > 0) {
                    List<String> bcFlsrc = d2.getRouterRules().getBcFlsrc();
                    if (!(bcFlsrc == null || bcFlsrc.size() == 0)) {
                        for (String str3 : bcFlsrc) {
                            if (!TextUtils.isEmpty(str3) && qg0Var.q.startsWith(str3)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z2;
    }

    public String h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c5be07", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "local";
        }
        if (i == 1) {
            return "asyncRemote";
        }
        if (i == 2) {
            return "syncRemote";
        }
        return "";
    }

    public boolean k(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb32cd98", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
            this.b = qg0Var;
            this.f32064a = (RouterStrategyOrangeData) vg0.c().a("routerStrategy", RouterStrategyOrangeData.class);
            if (!TextUtils.isEmpty(qg0Var.e)) {
                if ("h5".equals(qg0Var.e)) {
                }
                return true;
            }
        } catch (Exception e) {
            vp9.b("linkx", "AfcCustomSdk === 本地分流异常：" + e.getMessage());
            ah0.d(ah0.AFC_LINK_CRASH_MESSAGE, ah0.AFC_LINK_CRASH_ROUTER_LOCAL, e.getMessage(), null);
        }
        if (this.f32064a != null && !l() && !n(this.f32064a.getQuery())) {
            if (!m()) {
                return false;
            }
        }
        return true;
    }

    public void e(qg0 qg0Var, int i, dwc dwcVar) {
        HashMap<String, String> a2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eec88c9", new Object[]{this, qg0Var, new Integer(i), dwcVar});
            return;
        }
        long g = AfcUtils.g();
        String str2 = "1.0";
        if (p(qg0Var)) {
            if (q(qg0Var) || s(qg0Var)) {
                str2 = "2.0";
            }
            a2 = b(qg0Var, i);
            str = i4j.LINK_INFO_API_NEW;
        } else {
            a2 = a(qg0Var, i);
            str = i4j.LINK_INFO_API;
        }
        vp9.b("linkx", String.format("AfcCustomSdk === executeRemote === 请求API:%s, 请求接口参数：%s", str, a2));
        pg0.i().t(str, str2, a2, new a(this, g, dwcVar, i, str, str2));
        try {
            o(qg0Var);
        } catch (Exception e) {
            vp9.b("linkx", "reportByTBRest error, " + e.getMessage());
        }
    }
}
