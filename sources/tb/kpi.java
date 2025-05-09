package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kpi implements htc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f22821a;
    public final Map<String, olk<htc>> b = new HashMap();

    static {
        t2o.a(468714336);
        t2o.a(468714335);
        t2o.a(468714334);
    }

    public kpi(FluidContext fluidContext) {
        this.f22821a = fluidContext;
    }

    @Override // tb.htc
    public void a(vrp vrpVar) {
        List<htc> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23678016", new Object[]{this, vrpVar});
            return;
        }
        olk olkVar = (olk) ((HashMap) this.b).get(vrpVar.c);
        if (!(olkVar == null || (b = olkVar.b()) == null || b.isEmpty())) {
            ir9.b("MessageListenerManager", "消息：" + vrpVar.c + " 监听器数量：" + b.size());
            for (htc htcVar : b) {
                try {
                    htcVar.a(vrpVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f22821a, htcVar, xpd.c.EVENT_ON_MESSAGE, e);
                }
            }
        }
    }

    public void b(String str, htc htcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e810ea44", new Object[]{this, str, htcVar});
        } else if (str != null && htcVar != null) {
            olk olkVar = (olk) ((HashMap) this.b).get(str);
            if (olkVar == null) {
                olkVar = new olk();
                ((HashMap) this.b).put(str, olkVar);
            }
            olkVar.a(htcVar);
        }
    }

    public void c(String str, htc htcVar) {
        olk olkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725e29e7", new Object[]{this, str, htcVar});
        } else if (str != null && htcVar != null && (olkVar = (olk) ((HashMap) this.b).get(str)) != null) {
            olkVar.e(htcVar);
        }
    }
}
