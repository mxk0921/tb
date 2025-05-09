package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gio f26771a = new gio();

    static {
        t2o.a(80740686);
    }

    public final void a(UltronDeltaProtocol ultronDeltaProtocol, UltronDeltaProtocol ultronDeltaProtocol2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badb918", new Object[]{this, ultronDeltaProtocol, ultronDeltaProtocol2});
        } else if (ultronDeltaProtocol2 != null && ultronDeltaProtocol2.getHierarchy() != null && ultronDeltaProtocol2.getHierarchy().getDelta() != null) {
            if (ultronDeltaProtocol.getHierarchy() == null) {
                ultronDeltaProtocol.hierarchy = new Hierarchy();
                ultronDeltaProtocol.getHierarchy().delta = new ArrayList();
            }
            for (Delta delta : ultronDeltaProtocol2.getHierarchy().getDelta()) {
                Iterator<Delta> it = ultronDeltaProtocol.getHierarchy().getDelta().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (TextUtils.equals(delta.getTarget(), it.next().getTarget())) {
                            break;
                        }
                    } else {
                        ultronDeltaProtocol.getHierarchy().getDelta().add(delta);
                        break;
                    }
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

    public UltronDeltaProtocol b(List<rxu> list, pt<AURAParseIO> ptVar, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("a7f366fb", new Object[]{this, list, ptVar, k4eVar});
        }
        HashMap hashMap = new HashMap();
        UltronDeltaProtocol ultronDeltaProtocol = null;
        for (rxu rxuVar : list) {
            if (!TextUtils.isEmpty(rxuVar.b)) {
                if (hashMap.containsKey(rxuVar.b)) {
                    rxuVar.d = (ym) hashMap.get(rxuVar.b);
                }
                UltronDeltaProtocol a2 = this.f26771a.a(rxuVar, ptVar, k4eVar);
                d(hashMap, a2);
                if (ultronDeltaProtocol == null) {
                    ultronDeltaProtocol = a2;
                } else {
                    a(ultronDeltaProtocol, a2);
                }
            }
        }
        return ultronDeltaProtocol;
    }

    public final Map c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1039d80b", new Object[]{this, map});
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public final void d(Map<String, ym> map, UltronDeltaProtocol ultronDeltaProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406eab49", new Object[]{this, map, ultronDeltaProtocol});
        } else if (ultronDeltaProtocol != null && ultronDeltaProtocol.getData() != null) {
            for (Map.Entry<String, Component> entry : ultronDeltaProtocol.getData().entrySet()) {
                ym a2 = ym.a();
                Component value = entry.getValue();
                a2.fields = c(value.getFields());
                a2.f32185a = c(value.getLocalFields());
                a2.events = c(value.getEvents());
                map.put(entry.getKey(), a2);
            }
        }
    }
}
