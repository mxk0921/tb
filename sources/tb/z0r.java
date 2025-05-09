package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z0r extends l02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740647);
    }

    public static /* synthetic */ Object ipc$super(z0r z0rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/rule/impl/SwitchSelectRule");
    }

    @Override // tb.l02
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49e58cad", new Object[]{this});
        }
        return RuleType.SWITCH_SELECT;
    }

    @Override // tb.l02
    public Map<String, Component> f(rxu rxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49a1baac", new Object[]{this, rxuVar});
        }
        ym ymVar = rxuVar.d;
        if (ymVar == null || ymVar.fields == null) {
            ck.b b = ck.b.b();
            b.l("SwitchSelectRule").i("AURARulesServiceDomain").g("errorCode", "-4000_EMPTY_ORIGIN_FIELD");
            ck.g().f("SwitchSelectRule规则originData.fields为空", b.a());
            return null;
        }
        Component component = new Component();
        component.fields = new HashMap(ymVar.fields);
        String str = (String) fk.b(component.getFields(), "state", String.class, null);
        if (TextUtils.isEmpty(str)) {
            ck.b b2 = ck.b.b();
            b2.l("SwitchSelectRule").i("AURARulesServiceDomain").g("errorCode", "-4001_EMPTY_STATE");
            ck.g().f("SwitchSelectRule规则state为空", b2.a());
            return null;
        }
        Map<String, Object> fields = component.getFields();
        String str2 = "sel";
        if (str2.equals(str)) {
            str2 = "unsel";
        }
        fields.put("state", str2);
        HashMap hashMap = new HashMap();
        hashMap.put(rxuVar.b, component);
        return hashMap;
    }
}
