package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g8n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HALF_SCREEN_GUIDE_COUNT = "halfScreenGuideCount";
    public static final String KEY_FORBID_302_NAV = "forbid302Nav";
    public static final String NAV_ACTIVITY_START_TIME = "NAV_START_ACTIVITY_TIME";
    public static final String NAV_TO_URL_START_TIME = "NAV_TO_URL_START_TIME";
    public static final int T_FROM_SCAN = 1;
    public static final int T_FROM_SEARCH = 2;
    public long D;
    public String b;
    public String c;
    public String d;
    public boolean h;
    public JSONObject k;
    public String l;
    public String m;
    public boolean n;
    public int o;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public String w;
    public static final String z = "longitude";
    public static final String A = "latitude";
    public static final String B = r4p.KEY_CITY_CODE;
    public static final String[] C = {"ref_wp_pk", "ref_wp_m", "ref_wp_p", "collocation_id", "action_id", "album", "mmtag", "scm", yj4.PARAM_PVID, "spm-cnt", "spm", "pre_item_id", "pre_seller_id", "weitao_user_id", "fromtorelation", "afcflow"};

    /* renamed from: a  reason: collision with root package name */
    public final fbh f19786a = new fbh();
    public final Map<String, String> e = new HashMap();
    public final Map<String, String> f = new HashMap();
    public long g = 0;
    public boolean i = false;
    public boolean j = false;
    public String x = "";
    public String y = "";
    public boolean E = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ag8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(g8n g8nVar) {
        }

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return String.valueOf(obj);
        }
    }

    public static Map<String, String> g(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e614324c", new Object[]{map, str, str2});
        }
        if (map == null) {
            return new HashMap();
        }
        map.remove("referrer");
        map.remove("title");
        map.remove(wxi.KEY_PIC_URL);
        map.remove("reservePrice");
        map.remove("p4p_url");
        return i(map, str, str2);
    }

    public static Map<String, String> i(Map<String, String> map, String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62fc93a4", new Object[]{map, str, str2});
        }
        HashMap hashMap = new HashMap(map);
        String config = OrangeConfig.getInstance().getConfig(byj.DETAIL_TAOBAO_GROUP_NAME, str, str2);
        if (!TextUtils.isEmpty(config)) {
            for (String str3 : config.split(",")) {
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.remove(str3);
                }
            }
        }
        return hashMap;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c26227", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile(new String[]{"[?|&]liveId=(\\d+)"}[0]).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c726af72", new Object[]{this, str});
        }
        return null;
    }

    public final int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b080767e", new Object[]{this, str})).intValue();
        }
        if ("isFromScan".equals(str)) {
            return 1;
        }
        if ("isFromWorkSearch".equals(str)) {
            return 2;
        }
        return 0;
    }

    public final int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9925584c", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("all".equals(str)) {
            return Integer.MAX_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            txj.e(txj.TAG_HALF_SCREEN, "非全屏个数解析失败，halfScreenGuideCount = " + str);
            return -1;
        }
    }

    public final int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ae17be6", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            txj.e(txj.TAG_HALF_SCREEN, "非全屏次数解析失败，halfGuideTime = " + str);
            return -1;
        }
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5107e6df", new Object[]{this});
        }
        return i(this.e, "trade_detail_request_params_black_list", "list_param,%22list_param,search_keyword,eurl,targetParams");
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19e6653f", new Object[]{this})).booleanValue();
        }
        return "Y".equals(this.y);
    }

    public final void l(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3434acca", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString(fnm.KEY_TARGET_PARAMS);
            if (!TextUtils.isEmpty(string)) {
                try {
                    o2r.a("parseTargetParams");
                    this.k = JSON.parseObject(string);
                    o2r.b();
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_PARSE_ERROR, "itemid: " + this.b + ", targetParams: " + string + ", stackTrace: " + stringWriter2, null);
                    e.printStackTrace();
                }
            }
        }
    }

    public void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2970da0", new Object[]{this, map});
        } else if (this.e != null && map != null && !map.isEmpty()) {
            ((HashMap) this.e).putAll(map);
        }
    }

    public void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6eca0", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            ((HashMap) this.e).putAll(map);
        }
    }

    public g8n a(Intent intent) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g8n) ipChange.ipc$dispatch("361b9b7c", new Object[]{this, intent});
        }
        o2r.a("QueryParamsBuild");
        if (intent == null) {
            o2r.b();
            return this;
        }
        Uri data = intent.getData();
        kff.a(intent, "title");
        kff.a(intent, "reservePrice");
        kff.a(intent, wxi.KEY_PIC_URL);
        this.g = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        kff.a(intent, "ju_id");
        kff.a(intent, "ad_word_show");
        kff.a(intent, Constants.KEY_SEARCH_KEYWORD);
        d(kff.a(intent, "from"));
        tn1.KEY_SHARE_CONFIG_WANGXIN.equals(kff.a(intent, pg1.ATOM_caller));
        this.D = kff.c(intent, kxj.KEY_NAV_LONG_TOKEN);
        this.b = o8n.g(intent);
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            if (dataString.contains("liveId")) {
                b(dataString);
            }
            if (dataString.contains("videoAutoPlay")) {
                c(dataString);
            }
        }
        if (data == null) {
            o2r.b();
            return this;
        }
        String queryParameter = data.getQueryParameter("clickid");
        this.c = queryParameter;
        if (TextUtils.isEmpty(queryParameter)) {
            this.c = kff.a(intent, "clickid");
        }
        data.getQueryParameter(q2q.KEY_SKU_ID);
        data.getQueryParameter("action");
        "true".equals(data.getQueryParameter("fav_status"));
        "true".equals(data.getQueryParameter("seckill"));
        data.getQueryParameter("fromtorelation");
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    if (!"referrer".equals(str)) {
                        ((HashMap) this.e).put(str, String.valueOf(extras.get(str)));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        o2r.a("uriParam2KVS");
        if (!TextUtils.isEmpty(data.getQuery()) && (queryParameterNames = data.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                if (!"referrer".equals(str2)) {
                    ((HashMap) this.e).put(str2, data.getQueryParameter(str2));
                }
            }
        }
        o2r.b();
        try {
            AliLoginInterface c = kq0.c();
            if (c != null) {
                String nick = c.getNick();
                if (!TextUtils.isEmpty(nick)) {
                    ((HashMap) this.e).put("nick", nick);
                }
            }
        } catch (Exception e) {
            txj.d(null, "QueryParams", "put kv exception: " + e);
        }
        ((HashMap) this.e).remove("title");
        ((HashMap) this.e).remove(wxi.KEY_PIC_URL);
        ((HashMap) this.e).remove("reservePrice");
        ((HashMap) this.e).remove("p4p_url");
        ((HashMap) this.e).put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Build.MODEL);
        Map<String, String> map = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        String str3 = "";
        sb.append(str3);
        ((HashMap) map).put("osVersion", sb.toString());
        ((HashMap) this.e).put("soVersion", "2.0");
        ((HashMap) this.e).put("appReqFrom", "detail");
        ((HashMap) this.e).put("spm-cnt", "a2141.7631564");
        this.d = (String) ((HashMap) this.e).get(yj4.PARAM_PVID);
        try {
            PositionInfo i = o78.i(null);
            if (i != null) {
                ((HashMap) this.e).put("countryCode", i.countryCode);
            }
            ((HashMap) this.e).put("networkQuality", inx.c("nq"));
        } catch (Throwable unused2) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put(z, this.f19786a.g(null).f19168a);
        hashMap.put(A, this.f19786a.g(null).b);
        String str4 = this.f19786a.g(null).c;
        if (!TextUtils.isEmpty(str4) && !"0".equals(str4)) {
            hashMap.put(B, str4);
        }
        n(hashMap);
        data.getQueryParameter("rerankType");
        "true".equals(data.getQueryParameter("forceBackFinishInstance"));
        this.h = "true".equals(data.getQueryParameter("openPullToBack"));
        intent.getBooleanExtra("forceOpenPreloadMainPic", false);
        this.i = intent.getBooleanExtra("forceOpenPreloadWeex", false);
        this.j = intent.getBooleanExtra(KEY_FORBID_302_NAV, false);
        intent.getBooleanExtra("enableTppUpdate", false);
        data.getQueryParameter("guideExp");
        this.l = data.getQueryParameter("ndExp");
        this.m = data.getQueryParameter(xmo.SP_KEY_ENTRY_EXP);
        this.n = "true".equals(data.getQueryParameter("disableHalfScreenGuide"));
        this.q = data.getQueryParameter("entryNDNid");
        this.o = e(data.getQueryParameter(HALF_SCREEN_GUIDE_COUNT));
        this.p = f(data.getQueryParameter("halfScreenTime"));
        this.r = data.getQueryParameter(wll.ALI_TRACK_ID);
        if (vv6.a()) {
            this.s = data.getQueryParameter("autoTestInfo");
        }
        this.t = data.getQueryParameter("newType");
        this.u = data.getQueryParameter("spm");
        this.v = "true".equals(data.getQueryParameter("enhanceHalfScreenGuide"));
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            this.w = extras2.getString("passParam");
        }
        if (data.getQueryParameter("newDetailChannel") != null) {
            str3 = data.getQueryParameter("newDetailChannel");
        }
        this.x = str3;
        this.y = data.getQueryParameter("cutPreload");
        this.E = true ^ "N".equals(data.getQueryParameter("isSjjsd"));
        l(intent);
        o2r.b();
        return this;
    }

    public Map<String, String> j() {
        String[] strArr;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("147f0f37", new Object[]{this});
        }
        if (((HashMap) this.f).isEmpty()) {
            for (String str : C) {
                String str2 = (String) ((HashMap) this.e).get(str);
                if (str2 != null) {
                    ((HashMap) this.f).put(str, str2);
                }
            }
            String str3 = (String) ((HashMap) this.e).get("track_params");
            if (!TextUtils.isEmpty(str3)) {
                try {
                    jSONObject = JSON.parseObject(str3);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                ((HashMap) this.f).putAll(xxj.a(jSONObject, new a(this)));
            }
        }
        return new HashMap(this.f);
    }

    static {
        t2o.a(352321788);
    }
}
