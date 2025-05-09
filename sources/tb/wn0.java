package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.render.scroll")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wn0 implements tcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_RULE_WORKFLOW = "aura.workflow.adjustRules";
    public static final String KEY_SHOW_QUANTITY = "showQuantity";

    /* renamed from: a  reason: collision with root package name */
    public nbb f30788a;
    public AURAGlobalData b;

    static {
        t2o.a(301990003);
        t2o.a(80740553);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f30788a = loVar.c();
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.tcb
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.tcb
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        AURAGlobalData aURAGlobalData;
        List list;
        AURARenderComponent aURARenderComponent;
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i == 1 && this.f30788a != null && (aURAGlobalData = this.b) != null && (list = (List) aURAGlobalData.get("render_view_item_models", List.class)) != null) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(!(next instanceof AURARenderComponent) || (aURARenderComponentData = (aURARenderComponent = (AURARenderComponent) next).data) == null || (map = aURARenderComponentData.fields) == null || map.get("showQuantity") == null || !map.get("showQuantity").equals("true"))) {
                    r(this.f30788a, aURARenderComponent);
                }
            }
        }
    }

    public final void r(nbb nbbVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521c696e", new Object[]{this, nbbVar, aURARenderComponent});
            return;
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        rxuVar.d.fields = new HashMap();
        rxuVar.d.f32185a = new HashMap();
        rxuVar.d.events = new HashMap();
        rxuVar.b = aURARenderComponent.key;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null) {
            Map<String, Object> map = aURARenderComponentData.fields;
            if (map != null) {
                rxuVar.d.fields.putAll(map);
            }
            Map<String, Object> map2 = aURARenderComponent.data.localFields;
            if (map2 != null) {
                rxuVar.d.f32185a.putAll(map2);
            }
            Map<String, List<Event>> map3 = aURARenderComponent.data.events;
            if (map3 != null) {
                rxuVar.d.events.putAll(map3);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showQuantity", "false");
        ym ymVar = rxuVar.c;
        ymVar.fields = hashMap;
        ymVar.f32185a = hashMap;
        ymVar.events = new HashMap();
        nbbVar.c("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(rxuVar)), null);
    }
}
