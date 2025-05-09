package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.adjustRules")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class uf extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustRules";
    public final Map<Class<? extends DXEvent>, t3e> e = new HashMap();

    static {
        t2o.a(80740437);
    }

    public static /* synthetic */ Object ipc$super(uf ufVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/event/extension/impl/AURAAdjustRulesEvent");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
        } else {
            O0(aURAEventIO.getEventModel());
        }
    }

    public final Object P0(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7a2f357", new Object[]{this, objArr});
        }
        List<String> b = gio.b();
        for (Object obj : objArr) {
            if (b.contains(obj)) {
                return obj;
            }
        }
        return null;
    }

    public final String Q0(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc2f3e3e", new Object[]{this, qiVar});
        }
        String S0 = S0(qiVar.c());
        if (TextUtils.isEmpty(S0)) {
            return R0(qiVar.a());
        }
        return S0;
    }

    public final String R0(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d68c9929", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length < 2) {
            ck.g().b(uf.class.getSimpleName(), "executeAdjustRulesWorkFlow", "args length is less than 2");
            return null;
        }
        Object P0 = P0(objArr);
        if (P0 instanceof String) {
            return (String) P0;
        }
        ck.g().b(uf.class.getSimpleName(), "executeAdjustRulesWorkFlow", "args[1] is not string type");
        return null;
    }

    public final String S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec503d34", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("actionType");
    }

    public final void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab423337", new Object[]{this});
            return;
        }
        swu swuVar = new swu("aura.workflow.adjustRules");
        ((HashMap) this.e).put(swuVar.d(), swuVar);
        twu twuVar = new twu("aura.workflow.syncState");
        ((HashMap) this.e).put(twuVar.c(), twuVar);
        pwu pwuVar = new pwu("aura.workflow.adjustRules");
        ((HashMap) this.e).put(pwuVar.d(), pwuVar);
        rwu rwuVar = new rwu(J0().f(), "aura.workflow.syncState");
        ((HashMap) this.e).put(rwuVar.c(), rwuVar);
    }

    public final void U0(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d286b6f0", new Object[]{this, map, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("actionParams");
            if (jSONObject2 != null) {
                map.putAll(jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("params");
            if (jSONObject3 != null) {
                map.put("params", jSONObject3);
            }
        }
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        T0();
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "adjustRules";
    }

    public final void O0(qi qiVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a563bc", new Object[]{this, qiVar});
            return;
        }
        AURARenderComponent j = qiVar.j();
        DXEvent b = qiVar.b();
        if (j == null) {
            ck.g().b(uf.class.getSimpleName(), "executeAdjustRulesWorkFlow", "renderComponent is null");
            return;
        }
        AURARenderComponentData aURARenderComponentData = j.data;
        String Q0 = Q0(qiVar);
        if (Q0 != null) {
            HashMap hashMap = new HashMap();
            U0(hashMap, qiVar.c());
            if (b == null) {
                str = "aura.workflow.adjustRules";
            } else {
                t3e t3eVar = (t3e) ((HashMap) this.e).get(b.getClass());
                if (t3eVar == null) {
                    t3eVar = (t3e) ((HashMap) this.e).get(pwu.EventType);
                }
                String b2 = t3eVar.b();
                t3eVar.a(j, b, qiVar.a(), hashMap);
                str = b2;
            }
            rxu rxuVar = new rxu();
            rxuVar.f27667a = Q0;
            if (aURARenderComponentData != null) {
                ym ymVar = rxuVar.d;
                ymVar.fields = aURARenderComponentData.fields;
                ymVar.events = aURARenderComponentData.events;
            }
            if ("true".equals(hashMap.get("newActionParams"))) {
                Object obj = hashMap.get("events");
                if (obj instanceof JSONObject) {
                    rxuVar.c.events = s1n.b((JSONObject) obj);
                }
                Object obj2 = hashMap.get("fields");
                if (obj2 instanceof JSONObject) {
                    rxuVar.c.fields = (JSONObject) obj2;
                }
                Object obj3 = hashMap.get("localFields");
                if (obj3 instanceof JSONObject) {
                    rxuVar.c.f32185a = (JSONObject) obj3;
                }
            } else {
                rxuVar.c.fields = hashMap;
            }
            rxuVar.b = j.key;
            J0().c().c(str, new UMFRuleIO(Arrays.asList(rxuVar)), null);
        }
    }
}
