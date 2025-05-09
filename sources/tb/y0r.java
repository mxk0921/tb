package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y0r extends k02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740696);
    }

    public static /* synthetic */ Object ipc$super(y0r y0rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/data/rule/impl/SwitchSelectRule");
    }

    @Override // tb.k02
    public Map<String, Component> d(rxu rxuVar, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66f336e2", new Object[]{this, rxuVar, k4eVar});
        }
        ym ymVar = rxuVar.d;
        if (ymVar == null || ymVar.fields == null) {
            c(1, "-4000_EMPTY_ORIGIN_FIELD", "SwitchSelectRule规则originData.fields为空");
            return null;
        }
        Component component = new Component();
        component.fields = new HashMap(ymVar.fields);
        String str = (String) fk.b(component.getFields(), "state", String.class, null);
        if (TextUtils.isEmpty(str)) {
            c(1, "-4001_EMPTY_STATE", "SwitchSelectRule规则state为空");
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
