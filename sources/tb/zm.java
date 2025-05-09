package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zm implements sab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yi f32857a;
    public xm b;

    static {
        t2o.a(80740637);
        t2o.a(80740639);
    }

    public zm(AURAInputData<UMFRuleIO> aURAInputData, yi yiVar) {
        this.f32857a = yiVar;
        f(aURAInputData.getGlobalData());
        i();
    }

    public final void a(UltronDeltaProtocol ultronDeltaProtocol, UltronDeltaProtocol ultronDeltaProtocol2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badb918", new Object[]{this, ultronDeltaProtocol, ultronDeltaProtocol2});
        } else if (ultronDeltaProtocol2 != null && ultronDeltaProtocol2.getHierarchy() != null && ultronDeltaProtocol2.getHierarchy().getDelta() != null) {
            c(ultronDeltaProtocol);
            for (Delta delta : ultronDeltaProtocol2.getHierarchy().getDelta()) {
                if (!g(ultronDeltaProtocol, delta.getTarget())) {
                    ultronDeltaProtocol.getHierarchy().getDelta().add(delta);
                }
            }
            if (ultronDeltaProtocol2.getData() != null) {
                if (ultronDeltaProtocol.getData() == null) {
                    ultronDeltaProtocol.data = new HashMap();
                }
                ultronDeltaProtocol.getData().putAll(ultronDeltaProtocol2.getData());
            }
        }
    }

    public UltronDeltaProtocol b(List<rxu> list, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("d95d18b2", new Object[]{this, list, ptVar});
        }
        HashMap hashMap = new HashMap();
        UltronDeltaProtocol ultronDeltaProtocol = null;
        for (rxu rxuVar : list) {
            if (!TextUtils.isEmpty(rxuVar.b)) {
                ym ymVar = (ym) hashMap.get(rxuVar.b);
                if (ymVar != null) {
                    rxuVar.d = ymVar;
                }
                UltronDeltaProtocol a2 = this.b.a(rxuVar, ptVar);
                j(hashMap, a2);
                if (ultronDeltaProtocol == null) {
                    ultronDeltaProtocol = a2;
                } else {
                    a(ultronDeltaProtocol, a2);
                }
            }
        }
        return ultronDeltaProtocol;
    }

    public final void c(UltronDeltaProtocol ultronDeltaProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fada85d", new Object[]{this, ultronDeltaProtocol});
        } else if (ultronDeltaProtocol.getHierarchy() == null) {
            ultronDeltaProtocol.hierarchy = new Hierarchy();
            ultronDeltaProtocol.getHierarchy().delta = new ArrayList();
        }
    }

    public final Map d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ff2ec254", new Object[]{this, map});
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public final JSONObject e(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("977533e2", new Object[]{this, aURAGlobalData});
        }
        return (JSONObject) aURAGlobalData.get("aura_share_context", JSONObject.class);
    }

    public final void f(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de68141", new Object[]{this, aURAGlobalData});
        } else {
            this.b = new xm(e(aURAGlobalData));
        }
    }

    public final boolean g(UltronDeltaProtocol ultronDeltaProtocol, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2051055", new Object[]{this, ultronDeltaProtocol, str})).booleanValue();
        }
        for (Delta delta : ultronDeltaProtocol.getHierarchy().getDelta()) {
            if (TextUtils.equals(str, delta.getTarget())) {
                return true;
            }
        }
        return false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            k();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7510216", new Object[]{this});
            return;
        }
        for (qbb qbbVar : this.f32857a.f(qbb.class)) {
            this.b.c(qbbVar.D(), qbbVar);
        }
    }

    public final void j(Map<String, ym> map, UltronDeltaProtocol ultronDeltaProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406eab49", new Object[]{this, map, ultronDeltaProtocol});
        } else if (ultronDeltaProtocol != null && ultronDeltaProtocol.getData() != null) {
            for (Map.Entry<String, Component> entry : ultronDeltaProtocol.getData().entrySet()) {
                ym a2 = ym.a();
                Component value = entry.getValue();
                a2.fields = d(value.getFields());
                a2.f32185a = d(value.getLocalFields());
                a2.events = d(value.getEvents());
                map.put(entry.getKey(), a2);
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa5605d", new Object[]{this});
            return;
        }
        for (qbb qbbVar : this.f32857a.f(qbb.class)) {
            this.b.d(qbbVar.D());
        }
    }
}
