package tb;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, fld> f20027a;

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d01fda14", new Object[0]);
        }
        return new ArrayList(f20027a.keySet());
    }

    public UltronDeltaProtocol a(rxu rxuVar, pt<AURAParseIO> ptVar, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("cdf63d95", new Object[]{this, rxuVar, ptVar, k4eVar});
        }
        fld fldVar = f20027a.get(rxuVar.f27667a);
        if (fldVar != null) {
            return fldVar.a(rxuVar, ptVar, k4eVar);
        }
        if (ptVar == null) {
            return null;
        }
        mi miVar = new mi(1, "AURARulesServiceDomain", "-2000_UNRECOGNIZED_NAME", "不识别的规则name");
        HashMap hashMap = new HashMap();
        hashMap.put("name", rxuVar.f27667a);
        miVar.i(hashMap);
        ptVar.b(miVar);
        return null;
    }

    static {
        t2o.a(80740684);
        HashMap<String, fld> hashMap = new HashMap<>();
        f20027a = hashMap;
        hashMap.put(RuleType.GROUP_SELECT, new cla());
        hashMap.put(RuleType.PROPS_WRITE_BACK, new i1n());
        hashMap.put(RuleType.SWITCH_SELECT, new y0r());
        hashMap.put("kvmap", new g1g());
    }
}
