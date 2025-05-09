package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.protocol.ComponentView;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.y6v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31767a;
    public final mfl b;
    public final y0o c;
    public knm d;
    public JSONObject e;
    public final String f;
    public final UltronInstanceConfig i;
    public final s j;
    public final boolean l;
    public final Map<String, knm> g = new HashMap();
    public final Map<String, knm> h = new HashMap();
    public final Map<String, ol7> k = new HashMap();
    public int m = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements n5e<Map.Entry<String, Object>, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public Boolean apply(Map.Entry<String, Object> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("c8ac937f", new Object[]{this, entry});
            }
            if (y6v.e(y0o.this.f, y6v.b.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                return Boolean.valueOf(y0o.a(y0o.this, entry));
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements n5e<Map.Entry<String, Object>, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public Boolean apply(Map.Entry<String, Object> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("c8ac937f", new Object[]{this, entry});
            }
            if (y6v.e(y0o.this.f, y6v.b.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                return Boolean.valueOf(y0o.a(y0o.this, entry));
            }
            return Boolean.FALSE;
        }
    }

    static {
        t2o.a(157286485);
    }

    public y0o(Context context, mfl mflVar, y0o y0oVar, String str) {
        this.l = false;
        this.b = mflVar;
        this.f31767a = context;
        this.c = y0oVar;
        this.f = str;
        this.l = mjt.a();
    }

    public static /* synthetic */ boolean a(y0o y0oVar, Map.Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d722a70", new Object[]{y0oVar, entry})).booleanValue();
        }
        return y0oVar.E(entry);
    }

    public final void A(knm knmVar, List<knm> list, JSONObject jSONObject) {
        knm knmVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70323e81", new Object[]{this, knmVar, list, jSONObject});
        } else if (list != null && !list.isEmpty()) {
            boolean i = knmVar.i();
            boolean l = knmVar.l();
            String c = knmVar.c();
            for (knm knmVar3 : list) {
                if (i && "MUTEX".equals(c) && knmVar.d().size() > 0) {
                    break;
                }
                if (this.l) {
                    knmVar2 = r(knmVar3, jSONObject);
                } else {
                    knmVar2 = g(knmVar3, jSONObject);
                }
                if (knmVar2 != null) {
                    knmVar.a(knmVar2);
                    knmVar2.r(knmVar);
                    y(knmVar2);
                    if (knmVar2.j()) {
                        knmVar.d().remove(knmVar2);
                        knmVar2.r(null);
                    } else {
                        A(knmVar2, knmVar3.d(), jSONObject);
                    }
                }
            }
            if (!(l || i)) {
                return;
            }
            if (knmVar.d() == null || knmVar.d().isEmpty()) {
                if (knmVar.h() != null) {
                    knmVar.h().d().remove(knmVar);
                }
                ((HashMap) this.h).remove(knmVar.e());
                if (((HashMap) this.k).containsKey(knmVar.e()) && "insert".equals(((ol7) ((HashMap) this.k).get(knmVar.e())).f25456a)) {
                    ((HashMap) this.k).remove(knmVar.e());
                }
            }
        }
    }

    public cit B(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("72523095", new Object[]{this, jSONObject});
        }
        this.e = jSONObject;
        knm a2 = this.b.a();
        if (this.l) {
            this.d = r(a2, jSONObject);
        } else {
            this.d = g(a2, jSONObject);
        }
        knm knmVar = this.d;
        if (knmVar == null) {
            return cit.b(100002, "root component is null");
        }
        y(knmVar);
        A(this.d, a2.d(), jSONObject);
        return cit.d(null);
    }

    public void C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a1cf8e", new Object[]{this, jSONObject});
        }
    }

    public void D(IDMComponent iDMComponent, JSONObject jSONObject) {
        knm knmVar;
        knm knmVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533fe67f", new Object[]{this, iDMComponent, jSONObject});
        } else if (iDMComponent != null && (knmVar = (knm) ((HashMap) this.g).get(iDMComponent.getKey())) != null) {
            if (this.l) {
                knmVar2 = r(knmVar, jSONObject);
            } else {
                knmVar2 = g(knmVar, jSONObject);
            }
            JSONObject data = iDMComponent.getData();
            x6v g = knmVar2.g();
            data.put("fields", (Object) g.d);
            data.put("events", (Object) fs6.a(g));
            iDMComponent.writeBackDataAndReloadEvent(data, true);
        }
    }

    public final boolean E(Map.Entry<String, Object> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622f514", new Object[]{this, entry})).booleanValue();
        }
        return j(entry);
    }

    public final boolean b(knm knmVar, knm knmVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe97fc", new Object[]{this, knmVar, knmVar2})).booleanValue();
        }
        if (knmVar == null || knmVar2 == null) {
            return false;
        }
        return d(knmVar.g().e, knmVar2.g().e);
    }

    public final boolean c(knm knmVar, knm knmVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ddd9c", new Object[]{this, knmVar, knmVar2})).booleanValue();
        }
        if (knmVar == null || knmVar2 == null) {
            return false;
        }
        return d(knmVar.g().d, knmVar2.g().d);
    }

    public final boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae889a78", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return jSONObject.toJSONString().equals(jSONObject2.toJSONString());
    }

    public final DXTemplateItem e(ComponentView componentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("dfcb98b8", new Object[]{this, componentView});
        }
        DXTemplateItem dXTemplateItem = null;
        if (componentView == null) {
            return null;
        }
        if (!TextUtils.isEmpty(componentView.containerType) && componentView.containerType.startsWith("dinamic")) {
            dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = componentView.name;
            try {
                dXTemplateItem.b = Long.valueOf(componentView.version).longValue();
            } catch (Throwable unused) {
                dXTemplateItem.b = -1L;
            }
            dXTemplateItem.c = componentView.url;
        }
        return dXTemplateItem;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf252f4", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = (JSONObject) JSON.parse(JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect));
        }
    }

    public final boolean h(knm knmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3bd582b", new Object[]{this, knmVar, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = knmVar.g().d;
        if (jSONObject2 == null) {
            return false;
        }
        String string = jSONObject2.getString("filter");
        if (TextUtils.isEmpty(string) || !qcv.c(this.f31767a, string, jSONObject)) {
            return false;
        }
        String str = this.f;
        UnifyLog.m(str, "RenderState", "filter过滤掉了组件: " + knmVar.e(), new String[0]);
        return true;
    }

    public final Block k(List<Block> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Block) ipChange.ipc$dispatch("a21064d5", new Object[]{this, list, str});
        }
        if (!(list == null || str == null)) {
            for (Block block : list) {
                if (block != null && str.equals(block.name)) {
                    return block;
                }
            }
        }
        return null;
    }

    public final TemplateComponent l(List<TemplateComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateComponent) ipChange.ipc$dispatch("2ce148ef", new Object[]{this, list, str});
        }
        if (!(list == null || str == null)) {
            for (TemplateComponent templateComponent : list) {
                if (templateComponent != null && str.equals(templateComponent.name)) {
                    return templateComponent;
                }
            }
        }
        return null;
    }

    public Map<String, knm> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18368d1", new Object[]{this});
        }
        return this.h;
    }

    public Map<String, ol7> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4ebc48f", new Object[]{this});
        }
        return this.k;
    }

    public knm o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knm) ipChange.ipc$dispatch("9bdb3024", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ad59b2", new Object[]{this});
        }
        return this.e;
    }

    public final void q(knm knmVar, knm knmVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d9cabf", new Object[]{this, knmVar, knmVar2});
            return;
        }
        this.g.put(knmVar.e(), knmVar);
        this.h.put(knmVar2.e(), knmVar2);
    }

    public final Object s(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("773ec4e6", new Object[]{this, jSONObject, obj});
        }
        String str = (String) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentsVO");
        if (jSONObject2 != null) {
            z(jSONObject2);
        }
        return e19.f(jSONObject2, jSONObject, str);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2054876f", new Object[]{this})).booleanValue();
        }
        if (this.c == null || !this.k.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Object u(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("88dad731", new Object[]{this, jSONObject, obj, new Boolean(z)});
        }
        if (!z) {
            return qq8.e(jSONObject, (String) obj, false);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentsVO");
        if (jSONObject2 == null) {
            return qq8.e(jSONObject, (String) obj, false);
        }
        z(jSONObject2);
        return qq8.f(jSONObject2, jSONObject, (String) obj, false);
    }

    public final void v(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z, boolean z2, n5e<Map.Entry<String, Object>, Boolean> n5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65162cd", new Object[]{this, jSONObject, jSONObject2, str, new Boolean(z), new Boolean(z2), n5eVar});
        } else if (jSONObject != null && !jSONObject.isEmpty() && jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (n5eVar == null || !n5eVar.apply(entry).booleanValue()) {
                    entry.setValue(w(jSONObject2, entry.getValue(), str, z, z2));
                }
            }
        }
    }

    public final Object w(JSONObject jSONObject, Object obj, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab68d42f", new Object[]{this, jSONObject, obj, str, new Boolean(z), new Boolean(z2)});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            if (z2 || !e19.d(this.f31767a) || !e19.a((String) obj)) {
                return u(jSONObject, obj, z);
            }
            return s(jSONObject, obj);
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(w(jSONObject, entry.getValue(), str, z, z2));
            }
            return jSONObject2;
        } else {
            boolean z3 = obj instanceof JSONArray;
            JSONArray jSONArray = obj;
            if (z3) {
                JSONArray jSONArray2 = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray2.iterator();
                while (it.hasNext()) {
                    Object w = w(jSONObject, it.next(), str, z, z2);
                    if (w != null) {
                        arrayList.add(w);
                    }
                }
                jSONArray2.clear();
                jSONArray2.addAll(arrayList);
                jSONArray = jSONArray2;
            }
            return jSONArray;
        }
    }

    public final void x(JSONObject jSONObject, ComponentView componentView) {
        DXTemplateItem e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447774c9", new Object[]{this, jSONObject, componentView});
        } else if (jSONObject != null && !jSONObject.isEmpty() && componentView != null && !jSONObject.getBooleanValue("isPreRender") && (e = e(componentView)) != null && e.b > 0) {
            jSONObject.put("isPreRender", (Object) Boolean.TRUE);
            this.j.p(this.f31767a, e, jSONObject, -1, null);
        }
    }

    public final void y(knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bbe30c", new Object[]{this, knmVar});
            return;
        }
        y0o y0oVar = this.c;
        if (y0oVar != null) {
            knm knmVar2 = y0oVar.m().get(knmVar.e());
            if (knmVar.j()) {
                if (knmVar2 != null && !knmVar2.j()) {
                    ((HashMap) this.k).put(knmVar.e(), ol7.a(knmVar));
                }
            } else if (knmVar2 == null) {
                ((HashMap) this.k).put(knmVar.e(), ol7.b(knmVar));
            } else if (!c(knmVar2, knmVar)) {
                ((HashMap) this.k).put(knmVar.e(), ol7.d(knmVar2));
            } else if (!b(knmVar2, knmVar)) {
                ((HashMap) this.k).put(knmVar.e(), ol7.c(knmVar2));
            }
        }
    }

    public final boolean i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c55694a", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.contains("${") || str.equalsIgnoreCase("null")) {
                return true;
            }
        } else if (obj instanceof JSONObject) {
            return ((JSONObject) obj).isEmpty();
        } else {
            if ((obj instanceof JSONArray) && ((JSONArray) obj).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Map.Entry<String, Object> entry) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8082c2b8", new Object[]{this, entry})).booleanValue();
        }
        if (entry == null) {
            return false;
        }
        Object value = entry.getValue();
        if (!(value instanceof JSONArray)) {
            return false;
        }
        JSONArray jSONArray = (JSONArray) value;
        if (jSONArray.isEmpty()) {
            return false;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next;
                if (t9v.a(1, jSONObject2.getIntValue("option"))) {
                    return true;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
                if (!(jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("next")) == null)) {
                    Iterator<Map.Entry<String, Object>> it2 = jSONObject.entrySet().iterator();
                    if (it2.hasNext()) {
                        return j(it2.next());
                    }
                }
            }
        }
        return false;
    }

    public final void z(JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4af007", new Object[]{this, jSONObject});
        } else if (this.b.f24017a != null && jSONObject != null && (i = this.m) != 0) {
            if (i != 1 || !jSONObject.containsKey("globalStyle")) {
                JSONObject jSONObject2 = this.b.f24017a.globalStyle;
                if (jSONObject2 == null || !jSONObject2.containsKey("androidStyle")) {
                    Map<String, List<Block>> map = this.b.c;
                    if (map != null) {
                        HashMap hashMap = (HashMap) map;
                        if (hashMap.containsKey("test字段名")) {
                            Block k = k((List) hashMap.get("test字段名"), "StyleSection");
                            if (k == null) {
                                this.m = 0;
                                return;
                            }
                            TemplateComponent l = l(k.components, "AndroidTaobaoStyle");
                            if (l == null) {
                                this.m = 0;
                                return;
                            }
                            jSONObject.put("globalStyle", (Object) l.data);
                            UnifyLog.m(this.f, "RenderState", "使用了模板文件StyleSection节点的AndroidTaobaoStyle", new String[0]);
                            this.m = 1;
                            return;
                        }
                    }
                    this.m = 0;
                    return;
                }
                UnifyLog.m(this.f, "RenderState", "使用了模板文件style节点作为全局style", new String[0]);
                jSONObject.put("globalStyle", (Object) this.b.f24017a.globalStyle.getJSONObject("androidStyle"));
                this.m = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.knm g(tb.knm r20, com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y0o.g(tb.knm, com.alibaba.fastjson.JSONObject):tb.knm");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.knm r(tb.knm r22, com.alibaba.fastjson.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y0o.r(tb.knm, com.alibaba.fastjson.JSONObject):tb.knm");
    }

    public y0o(Context context, mfl mflVar, y0o y0oVar, String str, UltronInstanceConfig ultronInstanceConfig, s sVar) {
        this.l = false;
        this.b = mflVar;
        this.f31767a = context;
        this.c = y0oVar;
        this.f = str;
        this.i = ultronInstanceConfig;
        this.j = sVar;
        this.l = mjt.a();
    }
}
