package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class m6v extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_KEY = "type";
    public static final String FIELD_KEY = "fields";
    public static final String KEY_EVENT_CHAIN_DATA = "key$event_data";
    public static final String KEY_NEXT_EVENT_FLAG = "native$next";

    static {
        t2o.a(156237848);
    }

    public static /* synthetic */ Object ipc$super(m6v m6vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/UltronBaseV2Subscriber");
    }

    public void A(b8v b8vVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        f8v eventHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b08b4e", new Object[]{this, b8vVar, str, jSONObject, jSONObject2});
        } else if (b8vVar.n() != null && (eventHandler = b8vVar.n().getEventHandler()) != null) {
            b8v e = eventHandler.e();
            e.p(b8vVar.d());
            b8v b8vVar2 = this.f23143a;
            if (b8vVar2 != null) {
                e.o(b8vVar2.j());
            }
            e.x(KEY_EVENT_CHAIN_DATA, jSONObject2);
            gsb a2 = nml.a(new DMEvent(str, jSONObject, null), b8vVar.n());
            e.r(a2);
            e.t(a2.getType());
            eventHandler.k(e);
        }
    }

    public void B(b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4eacd09", new Object[]{this, b8vVar, str});
        } else {
            C(b8vVar, str, null);
        }
    }

    public void C(b8v b8vVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152ef307", new Object[]{this, b8vVar, str, jSONObject});
            return;
        }
        if (E()) {
            tj8.e(getClass().getSimpleName(), "commonEventEnd", "事件结束");
        }
        tj8.e(getClass().getSimpleName(), "eventChainNext", "准备执行下一个事件");
        JSONObject D = D(b8vVar);
        if (D == null || !(D.get("native$next") instanceof JSONObject) || !(D.getJSONObject("native$next").get(str) instanceof JSONArray)) {
            tj8.e(getClass().getSimpleName(), "eventChainOver", "事件链结束");
        } else {
            x(b8vVar, D.getJSONObject("native$next").getJSONArray(str), jSONObject);
        }
    }

    public JSONObject D(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91965a42", new Object[]{this, b8vVar});
        }
        Object f = b8vVar.f();
        if (f instanceof DMEvent) {
            return ((DMEvent) f).getFields();
        }
        return null;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef72cad3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void F(b8v b8vVar);

    @Override // tb.l6v
    public final void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        tj8.e(getClass().getSimpleName(), "commonEventStart", "事件开始");
        JSONObject k = b8vVar.k(KEY_EVENT_CHAIN_DATA);
        if (!(k == null || D(b8vVar) == null)) {
            twf.f(D(b8vVar), k, "native$next");
        }
        F(b8vVar);
        if (!E()) {
            tj8.e(getClass().getSimpleName(), "commonEventEnd", "事件结束");
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
