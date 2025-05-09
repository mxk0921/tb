package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.DXAtomicFTData;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import java.util.HashMap;
import java.util.Map;
import tb.qv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wc5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Byte AK = (byte) 1;
    public static final Byte MEGA = (byte) 2;

    /* renamed from: a  reason: collision with root package name */
    public final String f30603a;
    public final Long b;
    public String d;
    public JSONObject e;
    public String f;
    public JSONObject g;
    public JSONObject h;
    public Map<String, String> i;
    public DXAtomicFTData j;
    public String k;
    public String l;
    public String c = "";
    public byte m = AK.byteValue();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public sy8 f30604a = null;
        public final /* synthetic */ hv5 b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ iv5 d;
        public final /* synthetic */ m8 e;

        /* compiled from: Taobao */
        /* renamed from: tb.wc5$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1085a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30605a;
            public final /* synthetic */ c8 b;

            public RunnableC1085a(String str, c8 c8Var) {
                this.f30605a = str;
                this.b = c8Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((qv5.b) a.this.b).a(new n2k(this.f30605a, (String) wc5.b(wc5.this).get(this.f30605a)), rv5.e(this.b));
                }
            }
        }

        public a(hv5 hv5Var, boolean z, iv5 iv5Var, m8 m8Var) {
            this.b = hv5Var;
            this.c = z;
            this.d = iv5Var;
            this.e = m8Var;
        }

        public u8 a(sy8 sy8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u8) ipChange.ipc$dispatch("ada439c6", new Object[]{this, sy8Var});
            }
            this.f30604a = sy8Var;
            return this;
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            sy8 sy8Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (this.b == null || c8Var == null) {
                h36.g("DXAtomicEventNode", "eventchain callback is null or abilityExecuteResult is null [ " + wc5.a(wc5.this));
            } else {
                if (eb5.u()) {
                    h36.n("原子事件  ", wc5.this.o(), "  call back nextAbilityType", str, " ret ", JSON.toJSONString(c8Var));
                }
                if (wc5.b(wc5.this) != null) {
                    if (!this.c) {
                        this.d.L();
                        if (!(this.d.g() == null || this.d.h() == null || (sy8Var = this.f30604a) == null)) {
                            if (c8Var instanceof b8) {
                                t66.r(sy8Var, "DXEventChain_AbilityResult", JSON.toJSONString(c8Var));
                            }
                            m8 m8Var = this.e;
                            if (m8Var != null && m8Var.h()) {
                                t66.l(this.f30604a);
                            }
                        }
                        if (this.d.g() != null && this.d.h() != null && TextUtils.isEmpty(str) && this.d.t() <= 0) {
                            h36.g("DXFullTrace", "EvnetChian finish callback ", " ", wc5.a(wc5.this));
                            wc5.c(wc5.this, this.d);
                        }
                    }
                    if (this.d.u()) {
                        h36.b("DXAtomicEventNode", "eventchain callback: event cancle");
                    } else if (Looper.getMainLooper() == Looper.myLooper()) {
                        ((qv5.b) this.b).a(new n2k(str, (String) wc5.b(wc5.this).get(str)), rv5.e(c8Var));
                    } else {
                        jb6.n(new RunnableC1085a(str, c8Var));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hv5 f30606a;
        public final /* synthetic */ iv5 b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30607a;
            public final /* synthetic */ ExecuteResult b;

            public a(String str, ExecuteResult executeResult) {
                this.f30607a = str;
                this.b = executeResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((qv5.b) b.this.f30606a).a(new n2k("-999", this.f30607a), rv5.e(new aii(this.b)));
                }
            }
        }

        public b(hv5 hv5Var, iv5 iv5Var) {
            this.f30606a = hv5Var;
            this.b = iv5Var;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            if (eb5.u()) {
                h36.n(wc5.d(wc5.this), wc5.e(wc5.this), " onCallback result ", JSON.toJSONString(executeResult));
            }
            if (this.f30606a == null || executeResult == null) {
                h36.n("eventchain callback is null or abilityExecuteResult is null  ", wc5.a(wc5.this));
            } else if (wc5.b(wc5.this) != null) {
                if (this.b.u()) {
                    h36.n("eventchain callback: event cancle");
                } else if (executeResult.getStatusCode() != 2 && executeResult.getStatusCode() != 99) {
                    if (executeResult.getStatusCode() > 99) {
                        str = (String) wc5.b(wc5.this).get("onError");
                    } else {
                        str = (String) wc5.b(wc5.this).get(executeResult.getType());
                        if (str == null) {
                            str = (String) wc5.b(wc5.this).get(executeResult.getModType());
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        h36.n("eventChianName is null ", executeResult.getType());
                        return;
                    }
                    if (eb5.u()) {
                        h36.n(wc5.d(wc5.this), " ", wc5.e(wc5.this), "异步返回结果 ", JSON.toJSONString(executeResult));
                    }
                    if (!zg5.F2()) {
                        ((qv5.b) this.f30606a).a(new n2k("-999", str), rv5.e(new aii(executeResult)));
                    } else if (ii6.a()) {
                        ((qv5.b) this.f30606a).a(new n2k("-999", str), rv5.e(new aii(executeResult)));
                    } else {
                        jb6.n(new a(str, executeResult));
                    }
                }
            }
        }
    }

    static {
        t2o.a(444596665);
    }

    public wc5(String str, Long l) {
        this.f30603a = "";
        this.b = -1L;
        this.f30603a = str;
        this.b = l;
    }

    public static /* synthetic */ String a(wc5 wc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("626b2102", new Object[]{wc5Var});
        }
        return wc5Var.f30603a;
    }

    public static /* synthetic */ Map b(wc5 wc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c745f354", new Object[]{wc5Var});
        }
        return wc5Var.i;
    }

    public static /* synthetic */ void c(wc5 wc5Var, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624a1910", new Object[]{wc5Var, iv5Var});
        } else {
            wc5Var.m(iv5Var);
        }
    }

    public static /* synthetic */ String d(wc5 wc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee7f5f5f", new Object[]{wc5Var});
        }
        return wc5Var.k;
    }

    public static /* synthetic */ String e(wc5 wc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d30c97e", new Object[]{wc5Var});
        }
        return wc5Var.l;
    }

    public final void f(JSONArray jSONArray, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366a05b4", new Object[]{this, jSONArray, iv5Var});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                g((JSONObject) obj, iv5Var);
            } else if (obj instanceof JSONArray) {
                f((JSONArray) obj, iv5Var);
            } else {
                jSONArray.set(i, h(obj.toString(), iv5Var));
            }
        }
    }

    public final void g(JSONObject jSONObject, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e4f796", new Object[]{this, jSONObject, iv5Var});
        } else if (jSONObject != null && jSONObject.entrySet() != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    g((JSONObject) value, iv5Var);
                } else if (value instanceof JSONArray) {
                    f((JSONArray) value, iv5Var);
                } else {
                    Object h = h(value.toString(), iv5Var);
                    if (h == null) {
                        jSONObject.put(key, "");
                    } else {
                        jSONObject.put(key, h);
                    }
                }
            }
        }
    }

    public final Object h(String str, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d182e66a", new Object[]{this, str, iv5Var});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@") || !str.endsWith("}")) {
            return str;
        }
        if (iv5Var == null || iv5Var.n() == null || iv5Var.n().a(str) == null) {
            return null;
        }
        return iv5Var.n().a(str).b(null, iv5Var.l());
    }

    public rv5 i(iv5 iv5Var, hv5 hv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("19fc8944", new Object[]{this, iv5Var, hv5Var});
        }
        if (iv5Var == null) {
            return rv5.b(kv5.EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_CONTEXT_IS_NULL);
        }
        if (this.m != MEGA.byteValue()) {
            y7 d = iv5Var.d();
            if (d == null) {
                return rv5.b(kv5.EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_ABILITY_IS_NULL);
            }
            m8<k8> c = d.c(String.valueOf(this.b));
            if (c != null) {
                return j(iv5Var, hv5Var, c);
            }
            DXTraceUtil.d(2);
            return rv5.b(kv5.EVENT_CHAIN_ERROR_ABILITY_IS_NULL);
        } else if (iv5Var.l() == null) {
            return rv5.b(kv5.EVENT_CHAIN_ERROR_MEGAC_EXECUTE_CONTEXT_IS_NULL);
        } else {
            if (iv5Var.l().r() == null) {
                return rv5.b(kv5.EVENT_CHAIN_ERROR_MEGA_EXECUTE_ENGINE_IS_NULL);
            }
            w8 O = iv5Var.l().r().O(this.k, this.l);
            if (O == null) {
                return k(iv5Var, hv5Var);
            }
            m8 build = O.build(null);
            if (build == null) {
                return rv5.b(kv5.EVENT_CHAIN_ERROR_ABILITY_IS_NULL);
            }
            return j(iv5Var, hv5Var, build);
        }
    }

    public final JSONObject l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("183554b5", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof JSONObject) && !(value instanceof JSONArray)) {
                jSONObject2.put(key, value);
            }
        }
        return jSONObject2;
    }

    public final void m(iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce6d93f", new Object[]{this, iv5Var});
            return;
        }
        h36.g("DXFullTrace", "EventChain finish");
        if (iv5Var != null) {
            t66.h(iv5Var.q());
            if (iv5Var.g() != null) {
                t66.l(iv5Var.g());
            }
            if (iv5Var.h() != null) {
                t66.l(iv5Var.h());
            }
            iv5Var.y(null);
            iv5Var.z(null);
        }
        iv5Var.c();
    }

    public Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ed1a294", new Object[]{this});
        }
        return this.i;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f30603a;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e07a730", new Object[]{this});
        }
        return this.c;
    }

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.h;
    }

    public Long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eed7fffe", new Object[]{this});
        }
        return this.b;
    }

    public final void t() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b06258", new Object[]{this});
        } else if (TextUtils.isEmpty(this.d)) {
            h36.g("DXAtomicEventNode", "eventchain parse event info : atom event content is null");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            srf.a(this.e, jSONObject2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("callback");
            if (jSONObject3 != null) {
                this.i = new HashMap();
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    Map<String, String> map = this.i;
                    String key = entry.getKey();
                    ((HashMap) map).put(key, entry.getValue() + "");
                }
            }
            if (jSONObject2.containsKey("params")) {
                this.g = jSONObject2.getJSONObject("params");
                this.f = jSONObject2.getJSONObject("params").toJSONString();
            }
            if (!(t66.n() || !jSONObject2.containsKey("ftData") || (jSONObject = jSONObject2.getJSONObject("ftData")) == null)) {
                this.j = new DXAtomicFTData(jSONObject);
            }
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8621ea03", new Object[]{this, str});
            return;
        }
        this.d = str;
        if (!TextUtils.isEmpty(str)) {
            this.e = JSON.parseObject(this.d);
        }
        if (this.m == MEGA.byteValue()) {
            this.k = this.e.getString("name");
            this.l = this.e.getString("api");
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b63cce", new Object[]{this, str});
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76c7f46", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void x(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ec5a21", new Object[]{this, new Byte(b2)});
        } else {
            this.m = b2;
        }
    }

    public final sy8 s(iv5 iv5Var) {
        qz8 qz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy8) ipChange.ipc$dispatch("63ed814b", new Object[]{this, iv5Var});
        }
        h36.f("DXFullTrace", "Atomic ftData is not null ", this.j);
        if (iv5Var == null || iv5Var.l() == null) {
            return null;
        }
        if (this.j.b() == "start") {
            uy8 c = t66.c(iv5Var.l().c(), this.j.d());
            if (c == null) {
                return null;
            }
            iv5Var.y(c);
            t66.m(c);
            t66.r(c, "DXEventChain_ChainName", iv5Var.o());
            vy8 e = t66.e(c.a(), "DX", this.j.d());
            iv5Var.z(e);
            iv5Var.l().m0(e);
            t66.m(e);
            if (TextUtils.isEmpty(this.j.e())) {
                qz8Var = t66.f(e);
            } else {
                qz8Var = t66.g(e, this.j.c());
            }
            t66.s(qz8Var);
            iv5Var.G(qz8Var);
            sy8 b2 = t66.b(e.a(), "DX", "Atomic");
            t66.r(b2, "DXEventChain_AbilityName", this.f30603a);
            t66.q(b2, "DXEventChain_AbilityType", this.b.longValue());
            return b2;
        } else if (this.j.b() != "finish") {
            return null;
        } else {
            t66.h(iv5Var.q());
            m(iv5Var);
            return null;
        }
    }

    public rv5 k(iv5 iv5Var, hv5 hv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("6a3d21f3", new Object[]{this, iv5Var, hv5Var});
        }
        if (iv5Var.l() == null || iv5Var.l().r() == null || iv5Var.l().r().w() == null) {
            return rv5.d(-1, "executeForMega context null");
        }
        t();
        JSONObject jSONObject = this.g;
        g(jSONObject, iv5Var);
        DXRuntimeContext l = iv5Var.l();
        AbilityHubAdapter w = iv5Var.l().r().w();
        xq xqVar = new xq();
        this.h = jSONObject;
        d46.a(xqVar, l);
        iv5Var.v();
        b bVar = new b(hv5Var, iv5Var);
        if (eb5.u()) {
            h36.n("开始执行原子能力 ", this.k, " - ", this.l, " params ", JSON.toJSONString(this.h));
        }
        ExecuteResult b2 = d46.b(this.k, l, this.l, xqVar, this.h, bVar);
        if (b2 != null) {
            return rv5.e(new aii(b2));
        }
        w.j(this.k, this.l, xqVar, this.h, bVar);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msg", (Object) "asyncCall");
        return rv5.e(new aii(new FinishResult(jSONObject2)));
    }

    public final rv5 j(iv5 iv5Var, hv5 hv5Var, m8 m8Var) {
        s8 s8Var;
        DXRuntimeContext l;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        DXAtomicFTData dXAtomicFTData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("47b489bc", new Object[]{this, iv5Var, hv5Var, m8Var});
        }
        boolean n = t66.n();
        DXTraceUtil.a(2, "DX-AtomicEvent-Start", " : ", this.f30603a);
        h36.f("DXFullTrace", "execute ", this.f30603a, this.f, this.i);
        DXTraceUtil.a(2, "DX-AtomicEvent-构造Node");
        t();
        DXTraceUtil.d(2);
        JSONObject jSONObject3 = this.g;
        DXTraceUtil.a(2, "DX-AtomicEvent-执行表达式");
        g(jSONObject3, iv5Var);
        this.h = jSONObject3;
        DXTraceUtil.d(2);
        sy8 sy8Var = null;
        if (!n) {
            if (!(iv5Var.g() == null || iv5Var.h() == null || (dXAtomicFTData = this.j) == null || TextUtils.isEmpty(dXAtomicFTData.e()))) {
                t66.h(iv5Var.q());
                qz8 g = t66.g(iv5Var.h(), this.j.c());
                t66.s(g);
                iv5Var.G(g);
            }
            if (!(iv5Var.g() == null || iv5Var.h() == null)) {
                sy8Var = t66.a(t66.i(iv5Var.h()), "DX", "Atomic");
                t66.r(sy8Var, "DXEventChain_AbilityName", this.f30603a);
                DXAtomicFTData dXAtomicFTData2 = this.j;
                if (!(dXAtomicFTData2 == null || !dXAtomicFTData2.f() || (jSONObject2 = this.h) == null)) {
                    t66.o(sy8Var, JSON.toJSONString(jSONObject2));
                }
                DXAtomicFTData dXAtomicFTData3 = this.j;
                if (!(dXAtomicFTData3 == null || !dXAtomicFTData3.f() || (jSONObject = this.h) == null)) {
                    t66.o(sy8Var, JSON.toJSONString(jSONObject));
                }
            }
            DXAtomicFTData dXAtomicFTData4 = this.j;
            if (dXAtomicFTData4 != null && !TextUtils.isEmpty(dXAtomicFTData4.b()) && !"none".equals(this.j.b()) && zg5.O3() && (l = iv5Var.l()) != null && l.s().c() != null && l.s().c().A()) {
                sy8Var = s(iv5Var);
            }
            h36.f("DXFullTrace", "atomic ", this.f30603a, this.i);
            if (!(iv5Var.g() == null || iv5Var.h() == null || this.i == null)) {
                iv5Var.a();
            }
        }
        JSONObject parseObject = JSON.parseObject(this.d);
        parseObject.put("params", (Object) jSONObject3);
        if (sy8Var != null) {
            t66.r(sy8Var, "DXEventChain_AbilityParams", JSON.toJSONString(l(parseObject.getJSONObject("params"))));
        }
        if (m8Var == null) {
            DXTraceUtil.d(2);
            return rv5.b(kv5.EVENT_CHAIN_ERROR_ABILITY_IS_NULL);
        }
        if (!n) {
            m8Var.g(sy8Var);
            t66.r(sy8Var, "DXEventChain_AbilityType", m8Var.getClass().getSimpleName());
        }
        u8 a2 = new a(hv5Var, n, iv5Var, m8Var).a(sy8Var);
        if (!(n || iv5Var.g() == null || iv5Var.h() == null || sy8Var == null || !(iv5Var.e() instanceof s8) || (s8Var = (s8) iv5Var.e()) == null)) {
            s8Var.n(sy8Var);
        }
        if (eb5.u()) {
            h36.n("开始执行原子事件 type ", o());
        }
        c8 b2 = m8Var.b(parseObject, iv5Var.e(), a2);
        if (eb5.u()) {
            h36.n("执行完毕原子事件  ", o(), "  ret ", JSON.toJSONString(b2));
        }
        if (!n) {
            if (!(this.i != null || iv5Var.g() == null || iv5Var.h() == null || sy8Var == null)) {
                if (b2 instanceof b8) {
                    t66.r(sy8Var, "DXEventChain_AbilityResult", JSON.toJSONString(b2));
                }
                if (!(b2 instanceof d8)) {
                    t66.l(sy8Var);
                }
            }
            if (TextUtils.isEmpty(this.c) && iv5Var.t() <= 0 && iv5Var.g() != null && iv5Var.h() != null) {
                h36.g("DXFullTrace", "EvnetChian finish  ", this.f30603a);
                m(iv5Var);
            }
        }
        DXTraceUtil.d(2);
        return rv5.e(b2);
    }
}
