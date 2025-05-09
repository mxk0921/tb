package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class n6v extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_EVENT_PARAM = "defaultEventParamEventModel";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EXTRA_KEY_ABILITY_CALLBACK = "ext_key_ability_callback";
    public static final String FIELD_KEY = "fields";
    public static final String KEY_NEXT_EVENT_FLAG = "native$next";

    static {
        t2o.a(614465562);
    }

    public static /* synthetic */ Object ipc$super(n6v n6vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UltronBaseV2Subscriber");
    }

    public void A(b8v b8vVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        f8v eventHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b08b4e", new Object[]{this, b8vVar, str, jSONObject, jSONObject2});
        } else if (b8vVar.n() != null && (eventHandler = b8vVar.n().getEventHandler()) != null) {
            b8v e = eventHandler.e();
            e.u("bizParams", b8vVar.i("bizParams"));
            e.u("triggerView", b8vVar.i("triggerView"));
            e.p(b8vVar.d());
            b8v b8vVar2 = this.f23143a;
            if (b8vVar2 != null) {
                e.o(b8vVar2.j());
            }
            e.x(m6v.KEY_EVENT_CHAIN_DATA, jSONObject2);
            gsb d = oml.d(new DMEvent(str, axf.b(jSONObject), null), b8vVar.n());
            e.r(d);
            e.t(d.getType());
            eventHandler.k(e);
        }
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "";
    }

    public void C(b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4eacd09", new Object[]{this, b8vVar, str});
        } else {
            D(b8vVar, str, null);
        }
    }

    public void D(b8v b8vVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152ef307", new Object[]{this, b8vVar, str, jSONObject});
        } else if (b8vVar.i(EXTRA_KEY_ABILITY_CALLBACK) instanceof u8) {
            ((u8) b8vVar.i(EXTRA_KEY_ABILITY_CALLBACK)).callback(str, new f8(jSONObject));
        } else {
            if (G()) {
                uj8.f(getClass().getSimpleName(), "commonEventEnd", "事件结束");
            }
            uj8.f(getClass().getSimpleName(), "eventChainNext", "准备执行下一个事件");
            JSONObject E = E(b8vVar);
            if (E == null || !(E.get("native$next") instanceof JSONObject)) {
                uj8.f(getClass().getSimpleName(), "eventChainOver", "事件链结束");
            } else if (E.getJSONObject("native$next").get(str) instanceof JSONArray) {
                x(b8vVar, E.getJSONObject("native$next").getJSONArray(str), jSONObject);
            } else if (E.getJSONObject("native$next").get(str) instanceof String) {
                F(b8vVar, E.getJSONObject("native$next").getString(str), jSONObject);
            } else {
                uj8.f(getClass().getSimpleName(), "eventChainOver", "事件链结束");
            }
        }
    }

    public JSONObject E(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91965a42", new Object[]{this, b8vVar});
        }
        return c2u.d(b8vVar);
    }

    public void F(b8v b8vVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b92abebd", new Object[]{this, b8vVar, str, jSONObject});
            return;
        }
        JSONArray a2 = oml.a((DXRootView) b8vVar.i("triggerView"), str);
        if (a2 == null) {
            a2 = (JSONArray) b8vVar.d().getEvents().get(str);
        }
        x(b8vVar, a2, jSONObject);
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef72cad3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fa005df", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract void I(b8v b8vVar);

    @Override // tb.l6v
    public final void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        uj8.f(getClass().getSimpleName(), "commonEventStart", "事件开始");
        if (b8vVar == null) {
            uj8.a("UltronBaseV2Subscriber", "onHandleEvent", "ultronEvent is null");
            return;
        }
        if (H() && E(b8vVar) != null && b8vVar.i(EXTRA_KEY_ABILITY_CALLBACK) == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) b8vVar.k(m6v.KEY_EVENT_CHAIN_DATA));
            if (b8vVar.d() != null) {
                jSONObject.put(ksl.PARSER_KEY_COMP, (Object) b8vVar.d().getFields());
            }
            if (!(b8vVar.n() == null || b8vVar.n().b() == null)) {
                jSONObject.put(ksl.PARSER_KEY_ULTRON_GLOBAL, (Object) b8vVar.n().b().i());
            }
            HashMap hashMap = (HashMap) b8vVar.i("bizParams");
            if (hashMap != null) {
                jSONObject.put(ksl.PARSER_KEY_DX_SUBDATA, hashMap.get(ksl.PARSER_KEY_DX_SUBDATA));
                jSONObject.put(ksl.PARSER_KEY_DX_DATA, hashMap.get(ksl.PARSER_KEY_DX_DATA));
            }
            jSONObject.put(ksl.PARSER_KEY_DX_PARENT_DATA, (Object) b8vVar.d());
            jSONObject.put(ksl.PARSER_KEY_PARENT_KEY, (Object) b8vVar.d());
            axf.e(E(b8vVar), jSONObject, "native$next");
        }
        I(b8vVar);
        if (!G()) {
            uj8.f(getClass().getSimpleName(), "commonEventEnd", "事件结束");
        }
    }

    public void x(b8v b8vVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1b93be", new Object[]{this, b8vVar, jSONArray, jSONObject});
        } else if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    A(b8vVar, jSONObject2.getString("type"), jSONObject2.getJSONObject("fields"), jSONObject);
                }
            }
        }
    }

    public void y(b8v b8vVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb2b884", new Object[]{this, b8vVar, jSONObject});
        } else if (jSONObject != null) {
            A(b8vVar, jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null);
        }
    }

    public void z(b8v b8vVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7b33e2", new Object[]{this, b8vVar, str, jSONObject});
        } else {
            A(b8vVar, str, jSONObject, null);
        }
    }
}
