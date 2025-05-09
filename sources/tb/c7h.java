package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.rule.AURALocalAdjustIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c7h extends l02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, qbb> c = new HashMap();

    static {
        t2o.a(80740645);
    }

    public static /* synthetic */ Object ipc$super(c7h c7hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/rule/impl/LocalAdjustRule");
    }

    @Override // tb.l02
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49e58cad", new Object[]{this});
        }
        return RuleType.LOCAL_ADJUST;
    }

    public final AURALocalAdjustIO g(rxu rxuVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURALocalAdjustIO) ipChange.ipc$dispatch("683f7d57", new Object[]{this, rxuVar, str, jSONObject, jSONObject2});
        }
        ak akVar = new ak();
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        if (jSONObject2 != null) {
            jSONObject3.putAll(jSONObject2);
        }
        akVar.f(jSONObject3);
        akVar.g(rxuVar.b);
        akVar.d(rxuVar.c);
        akVar.e(rxuVar.d);
        return new AURALocalAdjustIO(str, akVar);
    }

    public void j(String str, qbb qbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ac6436", new Object[]{this, str, qbbVar});
        } else if (((qbb) ((HashMap) this.c).get(str)) == null) {
            ((HashMap) this.c).put(str, qbbVar);
        } else {
            th.a("注册相同的事件");
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{this, str});
        } else {
            ((HashMap) this.c).remove(str);
        }
    }

    public final Component h(qbb qbbVar, AURALocalAdjustIO aURALocalAdjustIO, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("8089fa43", new Object[]{this, qbbVar, aURALocalAdjustIO, ptVar});
        }
        try {
            return qbbVar.D0(aURALocalAdjustIO, d());
        } catch (Throwable th) {
            String localAdjustType = aURALocalAdjustIO.getLocalAdjustType();
            HashMap hashMap = new HashMap();
            hashMap.put("ruleType", localAdjustType);
            mi miVar = new mi(1, "AURARuleServiceDomain", "-1001_EXECUTE_EXCEPTION", "执行localAdjust【" + localAdjustType + "】出错，errorMessage=" + th.getMessage());
            miVar.i(hashMap);
            ptVar.b(miVar);
            if (!th.c()) {
                return null;
            }
            th.printStackTrace(new PrintStream(new ByteArrayOutputStream()));
            th.d(th);
            return null;
        }
    }

    public final Component i(rxu rxuVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("973c4b64", new Object[]{this, rxuVar, jSONObject, jSONObject2});
        }
        String string = jSONObject.getString("type");
        if (TextUtils.isEmpty(string)) {
            b().b(new mi(1, "AURAEventServiceDomain", "-1000_EMPTY_TYPE", "执行事件失败, eventType 为空"));
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("params");
        qbb qbbVar = (qbb) ((HashMap) this.c).get(string);
        if (qbbVar != null) {
            return h(qbbVar, g(rxuVar, string, jSONObject2, jSONObject3), b());
        }
        return null;
    }

    @Override // tb.l02
    public Map<String, Component> f(rxu rxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49a1baac", new Object[]{this, rxuVar});
        }
        Map<String, Object> map = rxuVar.c.fields;
        JSONObject jSONObject = (JSONObject) fk.b(map, "params", JSONObject.class, null);
        JSONArray jSONArray = (JSONArray) fk.b(map, "collectors", JSONArray.class, null);
        if (bh.a(jSONArray)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.size(); i++) {
            Component i2 = i(rxuVar, jSONArray.getJSONObject(i), jSONObject);
            if (i2 != null) {
                hashMap.put(rxuVar.b, i2);
            }
        }
        return hashMap;
    }
}
