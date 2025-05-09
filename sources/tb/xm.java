package tb;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final JSONObject b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, l02> f31467a = new HashMap();
    public final c7h c = new c7h();

    static {
        t2o.a(80740636);
    }

    public xm(JSONObject jSONObject) {
        this.b = jSONObject;
        b();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e2213c", new Object[]{this});
            return;
        }
        ((HashMap) this.f31467a).put(RuleType.LOCAL_ADJUST, this.c);
        ((HashMap) this.f31467a).put(RuleType.GROUP_SELECT, new dla());
        ((HashMap) this.f31467a).put(RuleType.PROPS_WRITE_BACK, new j1n());
        ((HashMap) this.f31467a).put(RuleType.SWITCH_SELECT, new z0r());
        ((HashMap) this.f31467a).put("kvmap", new h1g());
    }

    public void c(String str, qbb qbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ac6436", new Object[]{this, str, qbbVar});
        } else {
            this.c.j(str, qbbVar);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{this, str});
        } else {
            this.c.k(str);
        }
    }

    public UltronDeltaProtocol a(rxu rxuVar, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("e91e5a7e", new Object[]{this, rxuVar, ptVar});
        }
        l02 l02Var = (l02) ((HashMap) this.f31467a).get(rxuVar.f27667a);
        if (l02Var != null) {
            return l02Var.e(rxuVar, this.b, ptVar);
        }
        if (ptVar == null) {
            return null;
        }
        mi miVar = new mi(1, "AURARulesServiceDomain", "-2000_UNRECOGNIZED_NAME", "不识别的规则" + l02Var.c());
        HashMap hashMap = new HashMap();
        hashMap.put("name", rxuVar.f27667a);
        miVar.i(hashMap);
        ptVar.b(miVar);
        return null;
    }
}
