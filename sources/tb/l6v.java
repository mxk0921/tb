package tb;

import android.content.Context;
import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.y6v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class l6v implements rtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_EVENT_DATA = "extraData";

    /* renamed from: a  reason: collision with root package name */
    public b8v f23143a;
    public Context b;
    public o5e c;
    public fsb d;
    public IDMComponent e;
    public boolean f = false;
    public int g = 200;
    public long h = 0;
    public String i = "";

    static {
        t2o.a(157286525);
        t2o.a(157286534);
    }

    public b8v a(JSONObject jSONObject, Object obj, String str, JSONObject jSONObject2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("8bd32a25", new Object[]{this, jSONObject, obj, str, jSONObject2, mtopResponse});
        }
        return b(jSONObject, obj, str, jSONObject2, mtopResponse, null);
    }

    public b8v b(JSONObject jSONObject, Object obj, String str, JSONObject jSONObject2, MtopResponse mtopResponse, JSONObject jSONObject3) {
        f8v eventHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("4d2b99f", new Object[]{this, jSONObject, obj, str, jSONObject2, mtopResponse, jSONObject3});
        }
        o5e o5eVar = this.c;
        if (o5eVar == null || (eventHandler = o5eVar.getEventHandler()) == null) {
            return null;
        }
        b8v e = eventHandler.e();
        e.p(this.e);
        String string = jSONObject.getString("type");
        e.t(string);
        if (obj != null) {
            e.u("extraData", obj);
        }
        b8v b8vVar = this.f23143a;
        if (b8vVar != null) {
            e.o(b8vVar.j());
        }
        e.x(str, jSONObject2);
        e.y(this.f23143a.h(), jSONObject3);
        e.z(str, mtopResponse);
        e.r(new DMEvent(string, jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option")));
        return e;
    }

    @Override // tb.rtd
    public final void c(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797ded1", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.h >= this.g || !this.f || !this.i.equals(b8vVar.h())) {
                this.h = currentTimeMillis;
                this.i = b8vVar.h();
                this.f23143a = b8vVar;
                this.b = b8vVar.e();
                o5e n = b8vVar.n();
                this.c = n;
                if (this.b != null && n != null) {
                    this.d = n.b();
                    IDMComponent d = b8vVar.d();
                    this.e = d;
                    if (d != null) {
                        d.updateModifiedCount();
                    }
                    t(b8vVar);
                }
            }
        }
    }

    public void d(b8v b8vVar) {
        o5e o5eVar;
        f8v eventHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81539b6", new Object[]{this, b8vVar});
        } else if (b8vVar != null && (o5eVar = this.c) != null && (eventHandler = o5eVar.getEventHandler()) != null) {
            eventHandler.k(b8vVar);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b09fa9", new Object[]{this});
        } else {
            this.f = true;
        }
    }

    public JSONObject f() {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd54c1e4", new Object[]{this});
        }
        gsb j = j();
        if (j == null || (fields = j.getFields()) == null) {
            return null;
        }
        return fields;
    }

    public <T> T g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("37f60f1d", new Object[]{this, str});
        }
        b8v b8vVar = this.f23143a;
        if (b8vVar == null) {
            return null;
        }
        return (T) b8vVar.i(str);
    }

    public final <T> T h(String str, int i) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("741df2c2", new Object[]{this, str, new Integer(i)});
        }
        b8v b8vVar = this.f23143a;
        if (b8vVar == null) {
            return null;
        }
        Object i2 = b8vVar.i(str);
        if (i2 instanceof Object[]) {
            list = Arrays.asList((Object[]) i2);
        } else if (i2 instanceof List) {
            list = (List) i2;
        } else {
            list = null;
        }
        if (list == null || i >= list.size()) {
            return null;
        }
        return (T) list.get(i);
    }

    public <T> T i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3ea6cfd6", new Object[]{this, new Integer(i)});
        }
        return (T) h("extraParams", i);
    }

    public gsb j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("4b3e610c", new Object[]{this});
        }
        b8v b8vVar = this.f23143a;
        if (b8vVar == null) {
            return null;
        }
        Object f = b8vVar.f();
        if (f instanceof gsb) {
            return (gsb) f;
        }
        return null;
    }

    public Object k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("833f88d3", new Object[]{this});
        }
        b8v b8vVar = this.f23143a;
        if (b8vVar == null) {
            return null;
        }
        return b8vVar.i("extraData");
    }

    public void l(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437c144e", new Object[]{this, jSONArray});
        } else {
            m(jSONArray, null);
        }
    }

    public void m(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4cccaa", new Object[]{this, jSONArray, obj});
        } else {
            n(jSONArray, obj, null, null);
        }
    }

    public void n(JSONArray jSONArray, Object obj, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6011297c", new Object[]{this, jSONArray, obj, str, jSONObject});
        } else {
            o(jSONArray, obj, str, jSONObject, null);
        }
    }

    public void o(JSONArray jSONArray, Object obj, String str, JSONObject jSONObject, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b604641", new Object[]{this, jSONArray, obj, str, jSONObject, mtopResponse});
        } else {
            p(jSONArray, obj, str, jSONObject, mtopResponse, null);
        }
    }

    public void p(JSONArray jSONArray, Object obj, String str, JSONObject jSONObject, MtopResponse mtopResponse, JSONObject jSONObject2) {
        b8v b8vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ff80cf", new Object[]{this, jSONArray, obj, str, jSONObject, mtopResponse, jSONObject2});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    if (y6v.e(this.c.getBizName(), y6v.b.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                        b8vVar = b((JSONObject) next, obj, str, jSONObject, mtopResponse, jSONObject2);
                    } else {
                        b8vVar = a((JSONObject) next, obj, str, jSONObject, mtopResponse);
                    }
                    d(b8vVar);
                }
            }
        }
    }

    public void q(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0e7fb2", new Object[]{this, jSONArray, jSONObject});
        } else {
            p(jSONArray, null, null, null, null, jSONObject);
        }
    }

    public final void r(b8v b8vVar, JSONObject jSONObject) {
        a B;
        a.C0075a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94c9350", new Object[]{this, b8vVar, jSONObject});
            return;
        }
        o5e n = b8vVar.n();
        if ((n instanceof com.alibaba.android.ultron.vfw.instance.a) && (B = ((com.alibaba.android.ultron.vfw.instance.a) n).B()) != null && (d = B.d()) != null) {
            JSONObject jSONObject2 = d.c;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put(b8vVar.h(), (Object) jSONObject);
        }
    }

    public void s(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2e7890", new Object[]{this, list, obj});
        }
    }

    public abstract void t(b8v b8vVar);

    public boolean u(IDMComponent iDMComponent, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3881a6ae", new Object[]{this, iDMComponent, map})).booleanValue();
        }
        if (!(map == null || map.isEmpty() || iDMComponent == null)) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    iDMComponent.getFields().put(entry.getKey(), entry.getValue());
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean v(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae22cf0", new Object[]{this, map})).booleanValue();
        }
        return u(this.e, map);
    }

    public boolean w(gsb gsbVar, Map<String, ? extends Object> map) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489620a8", new Object[]{this, gsbVar, map})).booleanValue();
        }
        if (map == null || map.isEmpty() || gsbVar == null || (fields = gsbVar.getFields()) == null) {
            return false;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            fields.put(entry.getKey(), entry.getValue());
        }
        return true;
    }
}
