package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f19337a;
    public final String b;
    public final n c;
    public final JSONObject d;
    public final JSONObject e;
    public final JSONObject f;
    public final n.f g;
    public final d.j h;
    public final boolean i;
    public final boolean j;

    static {
        t2o.a(503317322);
    }

    public fj8(n nVar, String str, n nVar2, d.j jVar) {
        this.i = false;
        this.j = akt.u1();
        this.b = str;
        this.c = nVar2;
        this.h = jVar;
        this.i = true;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }

    public n.f b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n.f) ipChange.ipc$dispatch("c0a07c9d", new Object[]{this});
        }
        return this.g;
    }

    public n c(n nVar, Map map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("c0f65e80", new Object[]{this, nVar, map});
        }
        if (this.i) {
            d.j jVar = this.h;
            if (jVar != null) {
                jVar.c.a(jVar, map);
            }
            return null;
        }
        a aVar = new a(map, nVar);
        Object obj2 = this.f19337a;
        if (!(obj2 == null || nwv.o(eq8.e("if", obj2, aVar), false))) {
            return null;
        }
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                this.c.g1(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = this.e;
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                String key = entry2.getKey();
                Object e = eq8.e(key, entry2.getValue(), aVar);
                if (this.j) {
                    obj = this.c.i1(key, e);
                } else {
                    obj = this.c.H(key);
                    this.c.g1(key, e);
                }
                if (!nwv.i(obj, e)) {
                    hashMap.put(key, e);
                }
            }
        }
        d.j jVar2 = this.h;
        if (!(jVar2 == null || jVar2.c == null || hashMap.isEmpty())) {
            d.j jVar3 = this.h;
            jVar3.c.a(jVar3, hashMap);
        }
        if (this.j) {
            return this.c.l1(hashMap, null, false);
        }
        if (this.c.F0() && !this.c.D0()) {
            this.c.K().parseViewParams(this.c.I());
        }
        return this.c.L();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca14568", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                this.c.g1(entry.getKey(), entry.getValue());
            }
            n L = this.c.L();
            L.K0();
            L.d1(this.c.N(), this.g);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fj8)) {
            return false;
        }
        fj8 fj8Var = (fj8) obj;
        if (this.c == fj8Var.c && this.b.equals(fj8Var.b) && this.i == fj8Var.i) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements iuo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19338a;
        public final /* synthetic */ n b;

        public a(Map map, n nVar) {
            this.f19338a = map;
            this.b = nVar;
        }

        @Override // tb.iuo
        public Object c(String str, String str2, List list) {
            Class H;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("902f32e", new Object[]{this, str, str2, list});
            }
            List<String> H2 = nwv.H(str2.substring(2), '.');
            if (H2 == null || H2.size() != 2 || (H = fj8.this.c.P().H(H2.get(0))) == null) {
                return null;
            }
            return zh9.b(this, str, fj8.this.c.P(), H2.get(0), H, H2.get(1), list);
        }

        @Override // tb.iuo
        public Object d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("746ce3c7", new Object[]{this, str});
            }
            if (str.equals(".")) {
                return this.f19338a;
            }
            if (!str.startsWith("$")) {
                return r.n(null, this.f19338a, str);
            }
            if (str.charAt(1) != '.') {
                return null;
            }
            String substring = str.substring(2);
            if (substring.startsWith("vm.")) {
                return r.n(null, fj8.this.c.g0().W(), substring.substring(3));
            }
            if (substring.equals("props")) {
                return this.b.b0();
            }
            if (substring.startsWith("props.")) {
                return r.n(null, this.b.b0(), substring.substring(6));
            }
            if (substring.startsWith("attrs.")) {
                return this.b.H(substring.substring(6));
            }
            if (substring.equals(Constants.Weex.INSTANCEID)) {
                return Integer.valueOf(this.b.g0().U());
            }
            return r.n(null, fj8.this.c.P().T(), substring);
        }
    }

    public fj8(d.j jVar, n nVar, JSONObject jSONObject, n nVar2, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.i = false;
        this.j = akt.u1();
        this.h = jVar;
        this.b = jSONObject.getString("name");
        this.f19337a = jSONObject.get("if");
        this.c = nVar2;
        this.d = jSONObject2;
        this.e = jSONObject3;
        this.f = jSONObject4;
        if (jSONObject5 != null) {
            this.g = new n.f(null, jSONObject5);
        }
        d();
    }
}
