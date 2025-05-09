package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.ExtendBlock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u55 implements fsb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "ultron-sdk";
    public static final int MERGE_MODE = 0;
    public static final int REPLACE_MODE = 1;
    public String A;
    public int B;
    public boolean C;
    public Map<String, DMComponent> D;
    public Map<String, String> E;
    public y55 F;
    public boolean G;
    public final Set<String> H;

    /* renamed from: a  reason: collision with root package name */
    public v55 f29149a;
    public JSONObject b;
    public JSONObject c;
    public JSONObject d;
    public JSONObject e;
    public JSONObject f;
    public JSONObject g;
    public JSONObject h;
    public JSONObject i;
    public JSONObject j;
    public JSONObject k;
    public String l;
    public List<IDMComponent> m;
    public List<o58> n;
    @Deprecated
    public final Map<String, DMComponent> o;
    public final Map<String, DMComponent> p;
    public final Map<String, ExtendBlock> q;
    public final ConcurrentHashMap<String, JSONObject> r;
    public final List<rb4> s;
    public boolean t;
    public boolean u;
    public String v;
    public String w;
    public Context x;
    public Context y;
    public String z;

    static {
        t2o.a(83886154);
        t2o.a(83886122);
    }

    public u55(boolean z) {
        this(z, null);
    }

    public JSONObject A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7344c3a6", new Object[]{this});
        }
        return this.d;
    }

    public void A0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f5f2c8", new Object[]{this, str});
        } else {
            this.z = str;
        }
    }

    public JSONArray B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("23716e43", new Object[]{this});
        }
        JSONObject jSONObject = this.i;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("input");
    }

    public void B0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e7766f", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public JSONObject C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2c5c2b6", new Object[]{this});
        }
        return this.i;
    }

    public void C0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342d5019", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public String D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6cb101a", new Object[]{this, str});
        }
        Map<String, String> map = this.E;
        if (map == null) {
            return null;
        }
        return (String) ((HashMap) map).get(str);
    }

    public void D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995634b7", new Object[]{this, str});
        } else {
            this.A = str;
        }
    }

    public Context E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("afe5de69", new Object[]{this});
        }
        return this.y;
    }

    public void E0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a9eb8", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2605c96e", new Object[]{this});
        }
        return this.z;
    }

    public void F0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7cfd2", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.B = 1;
        } else {
            this.B = 0;
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73ed684f", new Object[]{this});
        }
        return this.l;
    }

    public void G0(List<o58> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537bb432", new Object[]{this, list});
        } else {
            this.n = list;
        }
    }

    public JSONObject H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("65c92963", new Object[]{this});
        }
        return this.b;
    }

    public void H0(Map<String, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbbc43b", new Object[]{this, map});
        } else if (map != null) {
            this.r.clear();
            this.r.putAll(map);
        }
    }

    public Map<String, DMComponent> I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e9bbb87", new Object[]{this});
        }
        return this.p;
    }

    public void I0(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796f53db", new Object[]{this, strArr});
        } else if (strArr != null) {
            this.H.addAll(Arrays.asList(strArr));
        } else {
            ((HashSet) this.H).clear();
        }
    }

    public JSONArray J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e1aa6fde", new Object[]{this});
        }
        JSONObject jSONObject = this.i;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("request");
    }

    public void J0(String str, ExtendBlock extendBlock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e33c12e", new Object[]{this, str, extendBlock});
        } else if (str != null && extendBlock != null) {
            ((HashMap) this.q).put(str, extendBlock);
        }
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ae0d9f", new Object[]{this});
        }
        return this.A;
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993c0da8", new Object[]{this});
        } else {
            this.C = true;
        }
    }

    public y55 L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y55) ipChange.ipc$dispatch("7dfaf0fe", new Object[]{this});
        }
        if (this.F == null) {
            this.F = new y55();
        }
        return this.F;
    }

    public JSONObject M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("608317e4", new Object[]{this});
        }
        return this.e;
    }

    public ConcurrentHashMap<String, JSONObject> N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("a514c990", new Object[]{this});
        }
        return this.r;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("808a733", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.E;
        if (map == null || ((HashMap) map).isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f794e03", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e6bc0f", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10bf66f6", new Object[]{this})).booleanValue();
        }
        if (u() == null) {
            return false;
        }
        return u().getBooleanValue("degrade");
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73dec91d", new Object[]{this})).booleanValue();
        }
        if (G() == null || G().compareTo("4.0") < 0) {
            return false;
        }
        return true;
    }

    public boolean T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a59165a", new Object[]{this, str})).booleanValue();
        }
        return ((HashSet) this.H).contains(str);
    }

    public final void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f732a43", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject2.remove("global");
        } else {
            jSONObject2.put("global", (Object) jSONObject);
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffc2cfc", new Object[]{this});
        } else {
            this.G = true;
        }
    }

    public JSONObject W(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed9ffa7", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.f;
        }
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 == null) {
            this.f = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.f;
    }

    public JSONObject X(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97507356", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.e;
        }
        JSONObject jSONObject2 = this.e;
        if (jSONObject2 == null) {
            this.e = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.e;
    }

    public JSONObject Y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ca9109c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.j;
        }
        JSONObject jSONObject2 = this.j;
        if (jSONObject2 == null) {
            this.j = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.j;
    }

    public final Object Z(Object obj, Object obj2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("67182d78", new Object[]{this, obj, obj2});
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= jSONArray.size()) {
                    break;
                }
                Object obj3 = jSONArray.get(i);
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (!jSONArray2.contains(obj3)) {
                    jSONArray2.add(obj3);
                }
                i++;
            }
        }
        return obj2;
    }

    @Override // tb.fsb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
            return;
        }
        this.v = str;
        v55 v55Var = this.f29149a;
        if (v55Var != null) {
            v55Var.l(str);
        }
    }

    public JSONObject a0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5015bd4e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.h;
        }
        JSONObject jSONObject2 = this.h;
        if (jSONObject2 == null) {
            this.h = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        U(this.h);
        return this.h;
    }

    @Override // tb.fsb
    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6023090", new Object[]{this, list});
        } else {
            this.m = list;
        }
    }

    public JSONObject b0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31f587ac", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.d;
        }
        JSONObject jSONObject2 = this.d;
        if (jSONObject2 == null) {
            this.d = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.d;
    }

    @Override // tb.fsb
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec203201", new Object[]{this});
        }
        return this.w;
    }

    public JSONObject c0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b59b1c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.i;
        }
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 == null) {
            this.i = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.i;
    }

    @Override // tb.fsb
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67ec57cd", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    @Override // tb.fsb
    public List<IDMComponent> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("34aee6b1", new Object[]{this, str});
        }
        return this.f29149a.e(this, str);
    }

    @Override // tb.fsb
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28848295", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public void f0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ec9420", new Object[]{this, str, str2});
            return;
        }
        if (this.E == null) {
            this.E = new HashMap();
        }
        if (str2 == null) {
            this.E.remove(str);
        } else {
            this.E.put(str, str2);
        }
    }

    @Override // tb.fsb
    public void g(ptd ptdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616284df", new Object[]{this, ptdVar});
        } else {
            this.f29149a.r(ptdVar);
        }
    }

    public void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64f98ea", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = this.e.getJSONArray(str);
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    Iterator it = new ArrayList(jSONArray).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            g0((String) next);
                        }
                    }
                    i0(str);
                    return;
                }
                i0(str);
            }
        } catch (Throwable th) {
            hav.b("DMContext", "recursionRemoveComponentFromProtocol", th.getMessage());
        }
    }

    @Override // tb.fsb
    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.v;
    }

    @Override // tb.fsb
    public IDMComponent getComponentByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("f00b97e", new Object[]{this, str});
        }
        return (IDMComponent) ((ConcurrentHashMap) this.o).get(str);
    }

    @Override // tb.fsb
    public List<IDMComponent> getComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this});
        }
        return this.m;
    }

    @Override // tb.fsb
    public IDMComponent getRootComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("17ba7e90", new Object[]{this});
        }
        return this.f29149a.h();
    }

    @Override // tb.fsb
    public List<o58> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1cb32a5f", new Object[]{this});
        }
        return this.n;
    }

    public boolean h0(String str, String str2) {
        ExtendBlock extendBlock;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13539d88", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 != null && jSONObject2.containsKey(str)) {
            this.f.remove(str);
        }
        if (!TextUtils.isEmpty(str2) && (jSONObject = this.e) != null && jSONObject.containsKey(str2) && (jSONArray = this.e.getJSONArray(str2)) != null) {
            jSONArray.remove(str);
        }
        Map<String, ExtendBlock> map = this.q;
        if (map != null) {
            if (((HashMap) map).containsKey(str)) {
                ((HashMap) this.q).remove(str);
            }
            if (((HashMap) this.q).containsKey(str2) && (extendBlock = (ExtendBlock) ((HashMap) this.q).get(str2)) != null) {
                extendBlock.removeBlockComponentList(str);
                extendBlock.removeBlockHierarchy(str);
            }
        }
        return true;
    }

    @Override // tb.fsb
    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41bae1c0", new Object[]{this});
        }
        return this.h;
    }

    public final void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf96825", new Object[]{this, str});
        } else if (str != null) {
            JSONObject jSONObject = this.f;
            if (jSONObject != null) {
                jSONObject.remove(str);
            }
            JSONObject jSONObject2 = this.e;
            if (jSONObject2 != null) {
                jSONObject2.remove(str);
            }
        }
    }

    public void j(String str, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7023c5ce", new Object[]{this, str, dMComponent});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.D == null) {
                this.D = new HashMap();
            }
            this.D.put(str, dMComponent);
        }
    }

    public void j0(String str, String str2) {
        Map<String, ExtendBlock> map;
        ExtendBlock extendBlock;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d065d780", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map = this.q) != null) {
            ((HashMap) map).remove(str);
            if (((HashMap) this.q).containsKey(str2) && (extendBlock = (ExtendBlock) ((HashMap) this.q).get(str2)) != null) {
                extendBlock.removeBlockComponentList(str);
                extendBlock.removeBlockHierarchy(str);
            }
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a372e51b", new Object[]{this})).booleanValue();
        }
        List<IDMComponent> components = getComponents();
        if (components == null) {
            return false;
        }
        for (IDMComponent iDMComponent : components) {
            iDMComponent.clearOnceExtMap();
        }
        return true;
    }

    public boolean k0(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c4fbbe4", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (jSONObject = this.e) == null || !jSONObject.containsKey(str2)) {
            return false;
        }
        JSONArray jSONArray = this.e.getJSONArray(str2);
        if (jSONArray == null) {
            this.e.remove(str);
            return false;
        }
        jSONArray.remove(str);
        return true;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ff9e4a", new Object[]{this});
            return;
        }
        Map<String, String> map = this.E;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public JSONObject l0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cafd58aa", new Object[]{this, jSONObject});
        }
        Set keySet = ((HashMap) this.q).keySet();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (keySet.contains(key)) {
                    keySet.remove(key);
                }
                this.e.put(entry.getKey(), entry.getValue());
            }
        }
        return this.e;
    }

    public boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f1c3574", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return ((HashMap) this.q).containsKey(str);
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.j = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.i = null;
        this.k = null;
        this.c = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.f = null;
        this.g = null;
        if (!T("data")) {
            ((ConcurrentHashMap) this.o).clear();
        }
        this.r.clear();
        ((ConcurrentHashMap) this.p).clear();
        ((HashMap) this.q).clear();
        Map<String, String> map = this.E;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public List<IDMComponent> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2ba195f", new Object[]{this});
        }
        Map<String, DMComponent> map = this.o;
        if (map == null || ((ConcurrentHashMap) map).values() == null) {
            return null;
        }
        return new ArrayList(((ConcurrentHashMap) this.o).values());
    }

    public void n0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5820163", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("38a98408", new Object[]{this});
        }
        return this.k;
    }

    public void o0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed39227c", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject;
        }
    }

    @Deprecated
    public Map<String, DMComponent> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18368d1", new Object[]{this});
        }
        return this.o;
    }

    public void p0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24f0af1", new Object[]{this, list});
        } else {
            this.m = list;
        }
    }

    public Context q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.x;
    }

    public void q0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else if (context != null) {
            this.y = context;
            this.x = context.getApplicationContext();
        }
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.f;
    }

    public void r0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf64d273", new Object[]{this});
        }
        return this.g;
    }

    public void s0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c03609", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }

    public List<rb4> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c0caf4d6", new Object[]{this});
        }
        return this.s;
    }

    public void t0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d17992", new Object[]{this, jSONObject});
        } else {
            this.j = jSONObject;
        }
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e58e4532", new Object[]{this});
        }
        return this.j;
    }

    public void u0(v55 v55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2346c54", new Object[]{this, v55Var});
        } else {
            this.f29149a = v55Var;
        }
    }

    public v55 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v55) ipChange.ipc$dispatch("9dcba000", new Object[]{this});
        }
        return this.f29149a;
    }

    public void v0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabc2816", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public ExtendBlock w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendBlock) ipChange.ipc$dispatch("e1235c87", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (ExtendBlock) ((HashMap) this.q).get(str);
    }

    public void w0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6537bc4", new Object[]{this, jSONObject});
            return;
        }
        this.h = jSONObject;
        U(jSONObject);
    }

    public final void x(JSONObject jSONObject, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca4ecc7", new Object[]{this, jSONObject, str, list});
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                list.add(jSONArray.getString(i));
                x(jSONObject, jSONArray.getString(i), list);
            }
        }
    }

    public void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c20fd1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = z;
        this.f29149a.c = z;
    }

    @Deprecated
    public Map<String, ExtendBlock> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5cd04f98", new Object[]{this});
        }
        return this.q;
    }

    public void y0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ede6b36", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public JSONObject z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7dd7822e", new Object[]{this});
        }
        return this.c;
    }

    public void z0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3e126", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public u55(boolean z, Context context) {
        this.l = "";
        this.o = new ConcurrentHashMap();
        this.p = new ConcurrentHashMap();
        this.q = new HashMap();
        this.r = new ConcurrentHashMap<>();
        this.s = new ArrayList();
        this.u = false;
        this.B = 0;
        this.C = false;
        this.G = false;
        this.H = new HashSet();
        this.f29149a = new v55(this.v, z);
        this.t = z;
        q0(context);
    }

    public JSONObject d0(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e83332e", new Object[]{this, jSONObject});
        }
        if (this.B == 1) {
            return l0(jSONObject);
        }
        Set<String> keySet = ((HashMap) this.q).keySet();
        if (keySet == null || keySet.isEmpty()) {
            this.e = jSONObject;
            return jSONObject;
        }
        for (String str2 : keySet) {
            JSONObject jSONObject3 = this.f.getJSONObject(str2);
            if (jSONObject3 != null && jSONObject3.getBooleanValue("extendBlock") && DMComponent.RESET.equals(jSONObject3.getString(DMComponent.EXTEND_TYPE))) {
                ArrayList arrayList = new ArrayList();
                x(this.e, str2, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.e.remove((String) it.next());
                }
                if (jSONObject.get(str2) == null) {
                    Object obj = this.e.get(str2);
                    if (obj instanceof JSONArray) {
                        ((JSONArray) obj).clear();
                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (keySet.contains(key)) {
                    Object value = entry.getValue();
                    Object obj2 = this.e.get(key);
                    if (obj2 == null) {
                        this.e.put(key, value);
                    }
                    JSONObject jSONObject4 = this.f;
                    if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject(key)) == null || !jSONObject2.containsKey(DMComponent.EXTEND_TYPE)) {
                        str = "append";
                    } else {
                        str = jSONObject2.getString(DMComponent.EXTEND_TYPE);
                    }
                    if (DMComponent.PREPEND.equals(str)) {
                        this.e.put(key, Z(obj2, value));
                    } else if (DMComponent.RESET.equals(str)) {
                        this.e.put(key, value);
                    } else {
                        Z(value, obj2);
                    }
                } else {
                    this.e.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return this.e;
    }

    public void e0(String str, String str2, String str3) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b680dcf", new Object[]{this, str, str2, str3});
        } else if (str != null && str2 != null && (jSONObject = this.d.getJSONObject("structure")) != null && (jSONArray = jSONObject.getJSONArray(str2)) != null && !jSONArray.contains(str)) {
            if (TextUtils.isEmpty(str3)) {
                jSONArray.add(0, str);
                return;
            }
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                Object obj = jSONArray.get(i);
                if ((obj instanceof String) && obj.equals(str3)) {
                    jSONArray.add(i + 1, str);
                    return;
                }
            }
            jSONArray.add(0, str);
        }
    }
}
