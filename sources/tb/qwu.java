package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qwu extends cz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustRules";

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends DXEvent>, t3e> f26978a = new HashMap();

    static {
        t2o.a(80740741);
    }

    public qwu() {
        i();
    }

    public static /* synthetic */ Object ipc$super(qwu qwuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/event/extension/UMFAdjustRulesEventExtension");
    }

    @Override // tb.cz
    public void e(bxu bxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b898517a", new Object[]{this, bxuVar});
        } else {
            j(bxuVar.g(), bxuVar.f(), bxuVar.a(), bxuVar.b());
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "adjustRules";
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab423337", new Object[]{this});
            return;
        }
        swu swuVar = new swu("umf.workflow.rules");
        this.f26978a.put(swuVar.d(), swuVar);
        twu twuVar = new twu("umf.workflow.adjustRuleInput");
        this.f26978a.put(twuVar.c(), twuVar);
        pwu pwuVar = new pwu("umf.workflow.rules");
        this.f26978a.put(pwuVar.d(), pwuVar);
    }

    public void j(txu txuVar, AURARenderComponent aURARenderComponent, Object[] objArr, DXEvent dXEvent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7233406", new Object[]{this, txuVar, aURARenderComponent, objArr, dXEvent});
        } else if (objArr.length < 2) {
            dxu.a().e("UMFAdjustRulesEventAbility", "testDeltaRenderService#args length is less than 3");
        } else {
            Object obj = objArr[1];
            if (!(obj instanceof String)) {
                dxu.a().e("UMFAdjustRulesEventAbility", "testDeltaRenderService#args[1] or args[2] is not string type");
                return;
            }
            rxu rxuVar = new rxu();
            rxuVar.f27667a = (String) obj;
            rxuVar.d.fields = aURARenderComponent.data.fields;
            HashMap hashMap = new HashMap();
            if (dXEvent == null) {
                str = "umf.workflow.rules";
            } else {
                t3e t3eVar = (t3e) ((HashMap) this.f26978a).get(dXEvent.getClass());
                if (t3eVar == null) {
                    t3eVar = (t3e) ((HashMap) this.f26978a).get(pwu.EventType);
                }
                String b = t3eVar.b();
                t3eVar.a(aURARenderComponent, dXEvent, objArr, hashMap);
                str = b;
            }
            rxuVar.c.fields = hashMap;
            rxuVar.b = aURARenderComponent.key;
            txuVar.d().a(str, new UMFRuleIO(Arrays.asList(rxuVar)), txuVar, null);
        }
    }
}
