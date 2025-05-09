package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.desktop.channel.userprefer.PreferBizData;
import com.taobao.desktop.common.request.CommonMtopRequest;
import com.taobao.login4android.api.Login;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ekz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ekz c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18652a;
    public final AtomicBoolean b = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ekz.a(ekz.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18654a;

        public b(String str) {
            this.f18654a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ekz.this.p(this.f18654a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends TypeReference<HashMap<String, String>> {
        public c(ekz ekzVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements nwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f18655a;

        public d(Map map) {
            this.f18655a = map;
        }

        @Override // tb.nwc
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            ggh.d("[PreferControl] uploadPrefer onError: " + str + " retMsg" + str2);
        }

        @Override // tb.nwc
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            ggh.d("[PreferControl] uploadPrefer onSuccess: " + str);
            ekz.b(ekz.this, str, this.f18655a);
        }
    }

    static {
        t2o.a(435159128);
    }

    public ekz(Context context) {
        if (context.getApplicationContext() != null) {
            this.f18652a = context.getApplicationContext();
        } else {
            this.f18652a = context;
        }
    }

    public static /* synthetic */ void a(ekz ekzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9fe45f", new Object[]{ekzVar});
        } else {
            ekzVar.i();
        }
    }

    public static /* synthetic */ void b(ekz ekzVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf0647d", new Object[]{ekzVar, str, map});
        } else {
            ekzVar.j(str, map);
        }
    }

    public static ekz d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ekz) ipChange.ipc$dispatch("806a849c", new Object[]{context});
        }
        if (c == null) {
            synchronized (ekz.class) {
                try {
                    if (c == null) {
                        c = new ekz(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7d3ea52", new Object[]{this})).longValue();
        }
        try {
            String f = q8l.f();
            if (!TextUtils.isEmpty(f)) {
                return JSON.parseObject(f).getLongValue("installInterval");
            }
            return 604800L;
        } catch (Throwable th) {
            ggh.d("[PreferControl] getPreferInstallConfig onError: " + th);
            return 604800L;
        }
    }

    public final Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73de8e9b", new Object[]{this});
        }
        Map<String, String> d2 = gno.b(this.f18652a).d("preferWriteList");
        ggh.d("[PreferControl] loadLocalPreferData: " + JSON.toJSONString(d2));
        return d2;
    }

    public final void j(String str, Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09015b6", new Object[]{this, str, map});
            return;
        }
        try {
            JSONObject jSONObject3 = JSON.parseObject(str).getJSONObject("content");
            if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("UserPreference")) != null && (jSONObject2 = jSONObject.getJSONObject("customSetting")) != null && jSONObject2.getBoolean("success").booleanValue()) {
                l(map);
            }
        } catch (Throwable th) {
            ggh.d("[PreferControl] parseResponseData onError: " + th);
        }
    }

    public final void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede29454", new Object[]{this, map});
            return;
        }
        gno.b(this.f18652a).f("preferWriteList", map);
        fkz.a("loadPreference", Boolean.TRUE, map);
        ggh.d("[PreferControl] syncLocalPreferData: " + JSON.toJSONString(map));
    }

    public final void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ddeb10d", new Object[]{this, map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("settings", (Object) map);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "UserPreference");
        jSONObject2.put("id", (Object) "customSetting");
        jSONObject2.put("content", (Object) jSONObject);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        HashMap hashMap = new HashMap();
        hashMap.put("bizInfoList", jSONArray.toString());
        new CommonMtopRequest().a("mtop.alibaba.mobile.bridge.connect", "1.0", hashMap, false, new d(map), null);
    }

    public void n(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a6569f", new Object[]{this, map});
        } else if (!this.b.get()) {
            mn8.c().execute(new a());
            this.b.set(true);
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa687b90", new Object[]{this, str});
        } else {
            mn8.c().execute(new b(str));
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58b8241", new Object[]{this});
            return;
        }
        try {
            if (c21.g().getBoolean("isFullNewInstall", false)) {
                gno.b(this.f18652a).e("sp_preferInstallInterval", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            ggh.d("[PreferControl] setFirstInstallTime onError: " + th);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80273d79", new Object[]{this})).booleanValue();
        }
        return System.currentTimeMillis() - ((Long) gno.b(this.f18652a).a("sp_preferInstallInterval", 0L)).longValue() < f() * 1000;
    }

    public final List<PreferBizData> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cbdccdf8", new Object[]{this});
        }
        try {
            String f = q8l.f();
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            JSONObject parseObject = JSON.parseObject(f);
            if (!parseObject.getBoolean("preferenceEnable").booleanValue()) {
                return null;
            }
            if (c()) {
                ggh.d("[PreferControl] getPreferConfig install interval reject");
                return null;
            }
            if (System.currentTimeMillis() - ((Long) gno.b(this.f18652a).a("sp_preferInterval", 0L)).longValue() < parseObject.getLongValue("preferenceInterval") * 1000) {
                ggh.d("[PreferControl] getPreferConfig interval reject");
                return null;
            }
            JSONArray jSONArray = parseObject.getJSONArray("preferenceWhiteList");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    PreferBizData preferBizData = new PreferBizData();
                    preferBizData.setBizName(jSONObject.getString("bizName"));
                    preferBizData.setBizClassName(jSONObject.getString("bizClassName"));
                    preferBizData.setDefaultValue(jSONObject.getString(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE));
                    arrayList.add(preferBizData);
                }
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            ggh.d("[PreferControl] getPreferConfig error: " + th);
            return null;
        }
    }

    public final Map<String, String> g(List<PreferBizData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f920fdf4", new Object[]{this, list});
        }
        try {
            HashMap hashMap = new HashMap();
            for (PreferBizData preferBizData : list) {
                if (!TextUtils.isEmpty(preferBizData.getBizClassName()) && !TextUtils.isEmpty(preferBizData.getBizName())) {
                    if (!hashMap.containsKey(preferBizData.getBizClassName())) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(preferBizData.getBizName());
                        hashMap.put(preferBizData.getBizClassName(), arrayList);
                    } else {
                        ((List) hashMap.get(preferBizData.getBizClassName())).add(preferBizData.getBizName());
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : hashMap.keySet()) {
                hashMap2.putAll((HashMap) alz.a(str, "loadUserPreference", List.class, hashMap.get(str)));
            }
            fkz.a("loadPreference", Boolean.FALSE, hashMap2);
            ggh.d("[PreferControl] loadBizPreferData: " + JSON.toJSONString(hashMap2));
            return hashMap2;
        } catch (Throwable unused) {
            ggh.d("[PreferControl] loadBizPreferData error: ");
            return null;
        }
    }

    public final void i() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bae81d", new Object[]{this});
            return;
        }
        try {
            if (TextUtils.isEmpty(Login.getUserId())) {
                ggh.d("[PreferControl] loadPrefer not login");
                return;
            }
            List<PreferBizData> e = e();
            if (e != null && !e.isEmpty()) {
                Map<String, String> g = g(e);
                Map<String, String> h = h();
                gno.b(this.f18652a).e("sp_preferInterval", Long.valueOf(System.currentTimeMillis()));
                if (g != null && !g.isEmpty()) {
                    if (h != null && !h.isEmpty()) {
                        for (String str : g.keySet()) {
                            if (!Objects.equals(g.get(str), h.get(str))) {
                                m(g);
                                return;
                            }
                        }
                        return;
                    }
                    ggh.d("[PreferControl] localPreferData isEmpty");
                    for (PreferBizData preferBizData : e) {
                        if (!Objects.equals(preferBizData.getDefaultValue(), g.get(preferBizData.getBizName()))) {
                            z = false;
                        }
                    }
                    if (!z) {
                        m(g);
                        return;
                    }
                    return;
                }
                ggh.d("[PreferControl] bizPreferData isEmpty");
                return;
            }
            ggh.d("[PreferControl] loadPrefer isEmpty");
        } catch (Throwable th) {
            ggh.d("[PreferControl] loadPrefer error: " + th);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf8f820", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = JSON.parseObject(str).getString("content");
                if (!TextUtils.isEmpty(string)) {
                    List<PreferBizData> e = e();
                    if (e != null && !e.isEmpty()) {
                        Map map = (Map) JSON.parseObject(string, new c(this), new Feature[0]);
                        HashMap hashMap = new HashMap();
                        for (PreferBizData preferBizData : e) {
                            if (map.containsKey(preferBizData.getBizName())) {
                                if (!hashMap.containsKey(preferBizData.getBizClassName())) {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put(preferBizData.getBizName(), map.get(preferBizData.getBizName()));
                                    hashMap.put(preferBizData.getBizClassName(), hashMap2);
                                } else {
                                    ((Map) hashMap.get(preferBizData.getBizClassName())).put(preferBizData.getBizName(), map.get(preferBizData.getBizName()));
                                }
                            }
                        }
                        HashMap hashMap3 = new HashMap();
                        for (String str2 : hashMap.keySet()) {
                            HashMap hashMap4 = (HashMap) alz.a(str2, "writeUserPreference", Map.class, hashMap.get(str2));
                            hashMap3.putAll(hashMap4);
                            ggh.d("[PreferControl] writePrefer loadData: " + JSON.toJSONString(hashMap4));
                        }
                        fkz.a("writePreference", null, hashMap3);
                        return;
                    }
                    ggh.d("[PreferControl] writePrefer isEmpty");
                }
            }
        } catch (Throwable th) {
            ggh.d("[PreferControl] writePrefer error:  " + th);
        }
    }
}
