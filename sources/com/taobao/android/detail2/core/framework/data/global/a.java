package com.taobao.android.detail2.core.framework.data.global;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.tao.Globals;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.utils.Global;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.avn;
import tb.bn1;
import tb.byj;
import tb.cxj;
import tb.fc;
import tb.g8n;
import tb.hyj;
import tb.ixj;
import tb.j9t;
import tb.o2r;
import tb.p7l;
import tb.q0j;
import tb.r19;
import tb.t2o;
import tb.txj;
import tb.url;
import tb.wgj;
import tb.x3w;
import tb.xmo;
import tb.xwj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NO_ID_DEFAULT = "emptyId";
    public static final String SIMPLE_DELIVER_MAIN_PIC_TYPE_IMAGE = "img";
    public static final String SIMPLE_DELIVER_MAIN_PIC_TYPE_VIDEO = "video";
    public static final String VALUE_FALSE = "false";
    public static final String VALUE_TRUE = "true";
    public AtmosParams A;
    public NewDetailScreenConfig B;
    public final b C;
    public final hyj D;
    public boolean E;
    public x3w F;
    public boolean G;
    public boolean H;
    public boolean I;
    public String J;
    public boolean M;
    public JSONObject N;
    public final bn1 O;
    public final String V;
    public final boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final byj f7121a;
    public boolean a0;
    public p7l b;
    public final g8n c;
    public String d;
    public String e;
    public Context f;
    public cxj g;
    public JSONObject j;
    public avn k;
    public String l;
    public boolean m;
    public JSONObject n;
    public boolean o;
    public float p;
    public final String q;
    public JSONObject r;
    public JSONObject s;
    public JSONObject t;
    public String u;
    public String v;
    public String w;
    public String x;
    public JSONObject z;
    public long h = -1;
    public Map<String, Object> i = new HashMap();
    public long y = 512;
    public int K = -1;
    public final Map<String, String> L = new HashMap();
    public boolean P = false;
    public int Q = 50;
    public int R = -1;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;

    static {
        t2o.a(352321780);
    }

    public a(cxj cxjVar, Intent intent) {
        g8n g8nVar = new g8n();
        this.c = g8nVar;
        this.O = new bn1();
        if (intent != null) {
            this.V = intent.getStringExtra(cxj.NAV_TOKEN);
        }
        this.g = cxjVar;
        if (cxjVar != null) {
            this.f = cxjVar.i();
        }
        if (this.g.h() instanceof Fragment) {
            boolean z = this.g.i() instanceof SupportActivity;
        }
        g8nVar.a(intent);
        String str = "NewDetail" + hashCode();
        this.q = str;
        this.f7121a = new byj();
        new xwj(this.g, g8nVar, str);
        this.b = xmo.m(Global.getApplication());
        this.B = new NewDetailScreenConfig(this.g);
        b bVar = new b();
        this.C = bVar;
        bVar.b(this.B.a());
        n0();
        this.D = new hyj(g8nVar);
        o0();
        this.O = xmo.c(this.f, g8nVar.t);
        this.Y = j9t.e(Globals.getApplication(), "nd").b().h("tbGlobalMuteSetting");
    }

    public static String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2130daa", new Object[0]);
        }
        return "newdetail_android_optimize_keepliveweex_4";
    }

    public static String g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8f73f35", new Object[0]);
        }
        return byj.a0();
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4f23eb3", new Object[0])).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Global.getApplication(), "newdetail_android_optimize_home_idle_preload_weex");
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8c13d0", new Object[]{this});
        }
        return this.D.d();
    }

    public boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d5a6c53", new Object[]{this})).booleanValue();
        }
        if (this.T || this.U) {
            return false;
        }
        return true;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("518ff4f2", new Object[]{this});
        }
        return this.q;
    }

    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cec25b", new Object[]{this})).booleanValue();
        }
        if (!this.S || this.T || this.U) {
            return false;
        }
        return true;
    }

    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d84f6140", new Object[]{this})).booleanValue();
        }
        if (I0() || u0()) {
            return true;
        }
        return false;
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4602a712", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.l)) {
            this.l = ixj.a().b();
        }
        return this.l;
    }

    public boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b500cc98", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public String E(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5634284", new Object[]{this, str});
        }
        HashMap<String, String> e = this.D.e();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(this.c.m)) {
            str2 = "";
        } else {
            str2 = this.c.m;
        }
        sb.append(str2);
        return e.get(sb.toString());
    }

    public boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dab7966", new Object[]{this})).booleanValue();
        }
        g8n g8nVar = this.c;
        if (g8nVar != null) {
            return g8nVar.h;
        }
        return false;
    }

    public long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78326e5d", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fd0ae", new Object[]{this})).booleanValue();
        }
        avn avnVar = this.k;
        if (avnVar == null || !avnVar.c()) {
            return false;
        }
        return true;
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5a1d26d", new Object[]{this});
        }
        return this.V;
    }

    public boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3509274", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.u) || TextUtils.isEmpty(this.v)) {
            return false;
        }
        return true;
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31f21073", new Object[]{this});
        }
        if (this.J == null) {
            this.J = r19.b0();
        }
        return this.J;
    }

    public boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5d5ce8e", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(w())) {
            return false;
        }
        for (String str : this.f7121a.P()) {
            if (!TextUtils.isEmpty(str) && w().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public b I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("542c7849", new Object[]{this});
        }
        return this.C;
    }

    public hyj J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyj) ipChange.ipc$dispatch("a93e2409", new Object[]{this});
        }
        return this.D;
    }

    public NewDetailScreenConfig K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig) ipChange.ipc$dispatch("660f67e9", new Object[]{this});
        }
        return this.B;
    }

    public boolean K0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8fbce50", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (I0()) {
            return true;
        }
        return J0(i, str);
    }

    public JSONObject L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2e82228f", new Object[]{this});
        }
        return this.r;
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89706dd6", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = this.c.k.getJSONObject(AtmosParams.KEY_ATMOS_PARAMS);
            if (jSONObject != null) {
                AtmosParams atmosParams = new AtmosParams();
                this.A = atmosParams;
                atmosParams.parseRootData(jSONObject);
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            q0j.p(q0j.SCENE_ENTRANCE_ATMOS, q0j.ERROR_CODE_ATMOS_PARAMS_PARSE_ERROR, "stackTrace: " + stringWriter2, T());
            e.printStackTrace();
        }
    }

    public p7l M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p7l) ipChange.ipc$dispatch("3ee40fab", new Object[]{this});
        }
        return this.b;
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de243ec", new Object[]{this});
        } else {
            this.r = this.c.k.getJSONObject(x3w.KEY_OPEN_IMMEDIATELY_DATA);
        }
    }

    public byj N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return this.f7121a;
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42f9035", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.c.k.getJSONObject("simpleDeliverData");
        this.s = jSONObject;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mainPicNative");
            this.t = jSONObject2;
            if (jSONObject2 != null) {
                this.w = jSONObject2.getString("type");
                this.v = this.t.getString("dimension");
                this.u = this.t.getString("url");
                this.x = this.t.getString("videoId");
                this.y = url.a(this.t.getString("videoPreloadSize"), 512L);
                JSONObject jSONObject3 = this.s.getJSONObject("feature");
                this.z = jSONObject3;
                if (jSONObject3 != null) {
                    this.a0 = "true".equals(jSONObject3.getString("enableImageHeightScale"));
                }
            }
        }
    }

    public int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6282927c", new Object[]{this})).intValue();
        }
        int i = this.R;
        if (i >= 0) {
            return i - 1;
        }
        return N().R();
    }

    public void O0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ef25a0", new Object[]{this, jSONObject});
            return;
        }
        if (this.A == null) {
            this.A = new AtmosParams();
        }
        this.A.refreshData(jSONObject);
        avn avnVar = this.k;
        if (avnVar != null && avnVar.a() && (jSONObject2 = this.A.mRootData.getJSONObject(AtmosParams.KEY_ATMOS_FEED_PARAMS)) != null) {
            jSONObject2.put(avn.KEY_REFRESH_TRANS_STATE, (Object) this.k.d);
        }
    }

    public JSONObject P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("447a59d1", new Object[]{this});
        }
        return this.N;
    }

    public void P0(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f13d8", new Object[]{this, cxjVar});
            return;
        }
        this.g = cxjVar;
        if (cxjVar != null) {
            this.f = cxjVar.i();
        }
        if (this.g.h() instanceof Fragment) {
            boolean z = this.g.i() instanceof SupportActivity;
        }
        new xwj(this.g, this.c, this.q);
        NewDetailScreenConfig newDetailScreenConfig = this.B;
        if (newDetailScreenConfig == null) {
            this.B = new NewDetailScreenConfig(this.g);
        } else {
            newDetailScreenConfig.o(this.g);
        }
        this.C.b(this.B.a());
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("813f1942", new Object[]{this});
        }
        return this.c.d;
    }

    public void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b880568", new Object[]{this});
        } else {
            this.k = null;
        }
    }

    public g8n R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g8n) ipChange.ipc$dispatch("5603f49", new Object[]{this});
        }
        return this.c;
    }

    public final void R0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e0181f", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("realtime");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("invokeId");
            String string2 = jSONObject2.getString("bizIdentifier");
            String string3 = jSONObject2.getString("currentScene");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(this.c.t)) {
                this.O.f(string);
                this.O.d(string2);
                this.O.e(string3);
                xmo.t(this.f, this.c.t, this.O);
            }
        }
    }

    public Map<String, String> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de031880", new Object[]{this});
        }
        if (F0()) {
            this.c.m(this.k.b());
        }
        return this.c.h();
    }

    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa78f68", new Object[]{this});
        } else {
            this.m = true;
        }
    }

    public Map<String, String> T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8bf1078f", new Object[]{this});
        }
        return this.L;
    }

    public void T0(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7627e607", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        if (jSONObject2 != null) {
            try {
                jSONObject2.getBooleanValue("enableRealTimeRequest");
                this.p = jSONObject2.getFloatValue("scrollPercent");
            } catch (Exception e) {
                txj.f("new_detail异常", "saveFeatureAndConfig异常", e);
                return;
            }
        }
        if (jSONObject != null) {
            this.E = jSONObject.getBooleanValue("enablePreventBack");
            this.M = jSONObject.getBooleanValue("enableUpRecommend");
            this.P = jSONObject.getBooleanValue("enableExposeComplexId");
            this.Q = jSONObject.getIntValue("exposeComplexIdNum");
            if (!this.m) {
                this.m = jSONObject.getBooleanValue("realtimeRequest");
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("realtimeControl");
            if (jSONObject3 != null) {
                this.n = jSONObject3;
            }
            R0(jSONObject);
            if (jSONObject.containsKey("scrollRecPreloadCount")) {
                this.R = jSONObject.getIntValue("scrollRecPreloadCount");
            }
            wgj.g(this.f, jSONObject.getJSONArray("entryParamWhiteList"));
        }
    }

    public JSONObject U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5311a8e3", new Object[]{this});
        }
        return this.n;
    }

    public void U0(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd7b949", new Object[]{this, x3wVar});
        } else {
            this.F = x3wVar;
        }
    }

    public avn V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (avn) ipChange.ipc$dispatch("84ae761d", new Object[]{this});
        }
        return this.k;
    }

    public void V0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b63ea9", new Object[]{this, jSONObject});
            return;
        }
        this.A = new AtmosParams();
        O0(jSONObject);
    }

    public float W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58063479", new Object[]{this})).floatValue();
        }
        return this.p;
    }

    public void W0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f4f336", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public x3w X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("93f071c4", new Object[]{this});
        }
        return this.F;
    }

    public void X0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e27cc1", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public JSONObject Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec18f8ce", new Object[]{this});
        }
        return this.s;
    }

    public void Y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcff20f", new Object[]{this, str});
            return;
        }
        if (!this.f7121a.k0()) {
            String str2 = this.d;
            if (str2 != null && str2.equals(str)) {
                return;
            }
        } else if (this.d != null) {
            return;
        }
        this.d = str;
        try {
            this.e = URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
        }
    }

    public JSONObject Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c5e9dc00", new Object[]{this});
        }
        if (this.z == null) {
            this.z = new JSONObject();
        }
        return this.z;
    }

    public void Z0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cefc6f", new Object[]{this, str, obj});
            return;
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.i.put(str, obj);
    }

    public void a(int i, boolean z) {
        int i2 = 1;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85261879", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        g8n g8nVar = this.c;
        int i4 = g8nVar.o;
        if (i4 < 0) {
            List<String> c = this.D.c();
            if (!c.isEmpty() && c.size() >= i) {
                int i5 = i - 1;
                if (!z || i5 >= 1) {
                    i2 = i5;
                }
                if (i2 >= 0) {
                    i3 = i2;
                }
                if (i3 < c.size()) {
                    c.subList(i3, c.size()).clear();
                }
            }
        } else if (i4 != Integer.MAX_VALUE && i4 != 0 && i4 >= i) {
            int i6 = i - 1;
            g8nVar.o = i6;
            if (z && i6 < 1) {
                g8nVar.o = 1;
            }
        }
    }

    public String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ece91967", new Object[]{this});
        }
        return this.v;
    }

    public void a1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c84a9e", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25570fed", new Object[]{this, new Integer(i)});
            return;
        }
        g8n g8nVar = this.c;
        int i2 = g8nVar.o;
        if (i2 >= 0 && i2 == Integer.MAX_VALUE && i2 != 0 && i2 >= i) {
            g8nVar.o = i - 1;
        }
    }

    public JSONObject b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9040252", new Object[]{this});
        }
        return this.t;
    }

    public void b1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f6ee73", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758268ea", new Object[]{this, str});
            return;
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            map.remove(str);
        }
    }

    public long c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9dd20722", new Object[]{this})).longValue();
        }
        return this.y;
    }

    public void c1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a75f82a", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            this.U = z;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145ec312", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            g8n g8nVar = this.c;
            int i2 = g8nVar.o;
            if (i2 < 0) {
                List<String> c = this.D.c();
                if (!c.isEmpty() && c.size() > i) {
                    c.remove(String.valueOf(i));
                }
            } else if (i2 != Integer.MAX_VALUE && i2 != 0 && i2 > i) {
                g8nVar.o = i;
            }
        }
    }

    public String d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7692f6b", new Object[]{this});
        }
        return this.w;
    }

    public void d1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a063ac2", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a79c0398", new Object[]{this})).booleanValue();
        }
        return this.f7121a.m();
    }

    public String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b248effe", new Object[]{this});
        }
        return this.u;
    }

    public void e1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b1e1ef", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52bcbeac", new Object[]{this})).booleanValue();
        }
        if (r0() || u0() || I0()) {
            return true;
        }
        return false;
    }

    public String f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a10aad7", new Object[]{this});
        }
        return this.x;
    }

    public void f1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb859b25", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871de598", new Object[]{this})).booleanValue();
        }
        if (this.o) {
            return true;
        }
        if (this.f7121a.p()) {
            this.o = true;
            return true;
        } else if (!this.m || !this.f7121a.u() || !this.f7121a.q()) {
            return false;
        } else {
            this.o = true;
            return true;
        }
    }

    public void g1(p7l p7lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6be9ab7", new Object[]{this, p7lVar});
        } else {
            this.b = p7lVar;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41cdeef8", new Object[]{this})).booleanValue();
        }
        return this.M;
    }

    public int h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("388f8c83", new Object[]{this})).intValue();
        }
        return this.K;
    }

    public void h1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd8ce6b", new Object[]{this, jSONObject});
        } else {
            this.N = jSONObject;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69681be7", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public JSONObject i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d2f4778", new Object[]{this});
        }
        JSONObject jSONObject = this.j;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public void i1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8752d376", new Object[]{this, jSONObject});
        }
    }

    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6640747", new Object[]{this})).booleanValue();
        }
        return this.Z;
    }

    public void j1(avn avnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851b43d1", new Object[]{this, avnVar});
        } else {
            this.k = avnVar;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f501f46", new Object[]{this})).booleanValue();
        }
        if (!N().t() || !this.Y) {
            return false;
        }
        return true;
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75714200", new Object[]{this})).booleanValue();
        }
        AtmosParams atmosParams = this.A;
        if (atmosParams == null || atmosParams.layoutInfo == null) {
            return false;
        }
        if (!atmosParams.mNeedClearLayoutInfo || !atmosParams.mHasRefresh) {
            return true;
        }
        return false;
    }

    public void k1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b109d6f", new Object[]{this, str});
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ffa211", new Object[]{this})).booleanValue();
        }
        if (this.H || ABGlobal.isFeatureOpened(Global.getApplication(), "newdetail_android_optimize_keep_live_with_activity")) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43145d4b", new Object[]{this})).booleanValue();
        }
        g8n g8nVar = this.c;
        if (g8nVar.p < 0 || g8nVar.o < 0) {
            return false;
        }
        return true;
    }

    public void l1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7f487f", new Object[]{this, new Integer(i)});
        } else {
            this.K = i;
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e933caa", new Object[]{this})).booleanValue();
        }
        return this.c.n;
    }

    public void m0(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6396e8e", new Object[]{this, x3wVar});
        } else if (!R().E) {
            ((HashMap) R().e).put("entryNDNid", x3wVar.y0);
            R().q = x3wVar.y0;
            ((HashMap) R().e).remove("isSjjsd");
        }
    }

    public void m1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e580385", new Object[]{this, jSONObject});
        } else {
            this.j = jSONObject;
        }
    }

    public Object n() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("611a2797", new Object[]{this});
        }
        AtmosParams atmosParams = this.A;
        if (atmosParams == null || (obj = atmosParams.entranceCardParams) == null) {
            return null;
        }
        return obj;
    }

    public final void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae5d5c1", new Object[]{this});
            return;
        }
        for (String str : this.f7121a.X()) {
            if (!TextUtils.isEmpty(str)) {
                Map<String, String> map = this.L;
                ((HashMap) map).put("nd_" + str, ((HashMap) this.c.e).get(str));
            }
        }
        ((HashMap) this.L).put("nd_appVersion", fc.a(Global.getApplication()));
    }

    public boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("378f3f6b", new Object[]{this})).booleanValue();
        }
        return this.a0;
    }

    public AtmosParams o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtmosParams) ipChange.ipc$dispatch("59af85b7", new Object[]{this});
        }
        return this.A;
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6620ae", new Object[]{this});
            return;
        }
        o2r.a("initTargetParams");
        if (this.c.k == null) {
            o2r.b();
            return;
        }
        L0();
        M0();
        N0();
        o2r.b();
    }

    public bn1 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bn1) ipChange.ipc$dispatch("8f8f40a9", new Object[]{this});
        }
        return this.O;
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("947abf05", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c08308c", new Object[]{this});
        }
        return this.c.c;
    }

    public void q0() {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07638e0", new Object[]{this});
        } else if (!R().E && (intent = this.g.i().getIntent()) != null && (data = intent.getData()) != null) {
            R().q = data.getQueryParameter("entryNDNid");
            ((HashMap) R().e).put("entryNDNid", R().q);
            String queryParameter = data.getQueryParameter("isSjjsd");
            if (TextUtils.isEmpty(queryParameter)) {
                ((HashMap) R().e).remove("isSjjsd");
            } else {
                ((HashMap) R().e).put("isSjjsd", queryParameter);
            }
        }
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9db7fb63", new Object[]{this});
        }
        return this.e;
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de52fa", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d854973", new Object[]{this});
        }
        return SuperItemViewHolder.VIEWHOLDER_KEY;
    }

    public boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ffabcd7", new Object[]{this})).booleanValue();
        }
        g8n g8nVar = this.c;
        if (g8nVar == null || !g8nVar.j) {
            return false;
        }
        return true;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca206bcf", new Object[]{this});
        }
        return this.c.b;
    }

    public boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d4cd80a", new Object[]{this})).booleanValue();
        }
        g8n g8nVar = this.c;
        if (g8nVar == null) {
            return false;
        }
        return g8nVar.i;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b688b36c", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.c.q)) {
            return this.c.q;
        }
        String t = t();
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        return NO_ID_DEFAULT;
    }

    public boolean u0() {
        g8n g8nVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd687717", new Object[]{this})).booleanValue();
        }
        if (m() || (i = (g8nVar = this.c).o) == 0 || g8nVar.p == 0) {
            return false;
        }
        if (l0()) {
            return v0();
        }
        if (i > 0) {
            return true;
        }
        if (!this.D.i() || !this.D.h() || this.D.c().isEmpty()) {
            return false;
        }
        return true;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a01a75d8", new Object[]{this});
        }
        return this.c.j().get("scm");
    }

    public boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c2ab484", new Object[]{this})).booleanValue();
        }
        if (this.c.p > 0) {
            int b = this.D.b();
            g8n g8nVar = this.c;
            if (b < g8nVar.p && g8nVar.o > 0 && !this.D.j()) {
                return true;
            }
        }
        return false;
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649f3e25", new Object[]{this});
        }
        return this.c.j().get("spm");
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3866b6f", new Object[]{this})).intValue();
        }
        return this.Q;
    }

    public boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("783f121b", new Object[]{this})).booleanValue();
        }
        if (this.G || ABGlobal.isFeatureOpened(Global.getApplication(), C())) {
            return true;
        }
        return false;
    }

    public Object y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5b594733", new Object[]{this, str});
        }
        Map<String, Object> map = this.i;
        if (map == null) {
            return "";
        }
        return map.get(str);
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8088d714", new Object[]{this})).intValue();
        }
        if (!u0()) {
            return 0;
        }
        int i = this.c.o;
        if (i > 0) {
            return i;
        }
        if (i == -1) {
            return this.D.c().size();
        }
        return 0;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edf48a9", new Object[]{this})).booleanValue();
        }
        if (this.m) {
            return this.f7121a.u();
        }
        txj.e(txj.TAG_REALTIME, "服务端实时插卡开关暂未注入Config。");
        return false;
    }

    public boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b140ea", new Object[]{this})).booleanValue();
        }
        return "vertical".equals(this.c.m);
    }

    public boolean J0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e48fdd", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (!u0()) {
            return false;
        }
        if ((!"item".equals(str) && !SuperItemViewHolder.VIEWHOLDER_KEY.equals(str)) || i < 0) {
            return false;
        }
        int i2 = this.c.o;
        if (i2 > i) {
            return true;
        }
        return i2 == -1 && this.D.c().contains(String.valueOf(i));
    }

    public a(Intent intent) {
        g8n g8nVar = new g8n();
        this.c = g8nVar;
        this.O = new bn1();
        if (intent != null) {
            this.V = intent.getStringExtra(cxj.NAV_TOKEN);
        }
        g8nVar.a(intent);
        this.q = "NewDetail" + hashCode();
        this.f7121a = new byj();
        this.b = xmo.m(Global.getApplication());
        this.B = new NewDetailScreenConfig();
        this.C = new b();
        n0();
        this.D = new hyj(g8nVar);
        o0();
        this.O = xmo.c(Global.getApplication(), g8nVar.t);
        this.Y = j9t.e(Globals.getApplication(), "nd").b().h("tbGlobalMuteSetting");
    }
}
