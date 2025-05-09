package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.concurrent.ConcurrentHashMap;
import tb.kr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, sud> f19955a = new ConcurrentHashMap<>();

    static {
        t2o.a(803209239);
    }

    public final void a(String str, JSONObject jSONObject, lr lrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c347dc", new Object[]{this, str, jSONObject, lrVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(jSONObject, "data");
        if (this.f19955a.get(str) != null) {
            sud sudVar = this.f19955a.get(str);
            ckf.d(sudVar);
            sudVar.a(str, jSONObject, lrVar);
        } else if (lrVar != null) {
            lrVar.a(new kr.a(1002, "ability " + str + " not found"));
        }
    }

    public final void b(String str, sud sudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8d4419", new Object[]{this, str, sudVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(sudVar, MUSMonitor.MODULE_DIM_ABILITY);
        if (this.f19955a.contains(str)) {
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b("TBIAbilityCenter", "type " + str + " has been registered");
            return;
        }
        this.f19955a.put(str, sudVar);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f19955a.clear();
        }
    }
}
