package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22086a;
    public UltronProtocol b;
    public final JSONObject c;
    public final MultiTreeNode d;
    public final MultiTreeNode e;
    public final Map<String, RenderComponent> f;
    public final Map<String, RenderComponent> g;
    public final List<Map<String, String>> h;
    public Map<String, AURARenderComponent> i;

    static {
        t2o.a(80740714);
    }

    public jn(String str, JSONObject jSONObject, UltronProtocol ultronProtocol, MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2, Map<String, RenderComponent> map, Map<String, RenderComponent> map2, List<Map<String, String>> list) throws IllegalArgumentException {
        this.f = new HashMap();
        this.g = new HashMap();
        this.f22086a = str;
        this.c = jSONObject;
        this.b = ultronProtocol;
        this.d = multiTreeNode;
        this.e = multiTreeNode2;
        this.h = list;
        if (map != null) {
            this.f = map;
        }
        if (map2 != null) {
            this.g = map2;
        }
    }

    public static jn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jn) ipChange.ipc$dispatch("2d40e5d3", new Object[0]);
        }
        return new jn(null, null, null, null, null, null, null, null);
    }

    public static jn c(String str, JSONObject jSONObject, UltronProtocol ultronProtocol, MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2, Map<String, RenderComponent> map, Map<String, RenderComponent> map2, List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jn) ipChange.ipc$dispatch("90451160", new Object[]{str, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode2, map, map2, list});
        }
        return new jn(str, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode2, map, map2, list);
    }

    public static jn p(jn jnVar, JSONObject jSONObject, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jn) ipChange.ipc$dispatch("2fc114f8", new Object[]{jnVar, jSONObject, ultronProtocol});
        }
        return new jn(jnVar.f22086a, jSONObject, ultronProtocol, jnVar.d, jnVar.e, jnVar.e(), jnVar.d(), jnVar.h);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1269b8", new Object[]{this});
            return;
        }
        Map<String, RenderComponent> map = this.g;
        if (map != null) {
            map.clear();
        }
    }

    public Map<String, RenderComponent> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b2edfcc7", new Object[]{this});
        }
        return this.g;
    }

    public Map<String, RenderComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18368d1", new Object[]{this});
        }
        return this.f;
    }

    @Deprecated
    public List<Map<String, String>> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("24ea5bc6", new Object[]{this});
        }
        return this.h;
    }

    public UltronProtocol g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronProtocol) ipChange.ipc$dispatch("aa1a758e", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new UltronProtocol();
        }
        return this.b;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fcf8f6bd", new Object[]{this});
        }
        return this.c;
    }

    public MultiTreeNode i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTreeNode) ipChange.ipc$dispatch("6192c6b4", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, AURARenderComponent> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e3861f2", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        return this.i;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cbb1772", new Object[]{this});
        }
        return this.f22086a;
    }

    public MultiTreeNode l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTreeNode) ipChange.ipc$dispatch("ac3a992a", new Object[]{this});
        }
        return this.d;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cead3a14", new Object[]{this});
            return;
        }
        for (Map.Entry<String, RenderComponent> entry : this.g.entrySet()) {
            RenderComponent renderComponent = this.f.get(entry.getKey());
            if (renderComponent != null) {
                RenderComponent value = entry.getValue();
                renderComponent.component.fields = value.component.getFields();
                renderComponent.component.events = value.component.getEvents();
            } else {
                return;
            }
        }
        this.g.clear();
    }

    public void n(Map<String, AURARenderComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b08bb74", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ab5fac", new Object[]{this, str});
        } else {
            this.f22086a = str;
        }
    }

    public void q(boolean z, String str) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4492b56f", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            this.g.remove(str);
        } else {
            RenderComponent renderComponent = this.f.get(str);
            if (renderComponent != null) {
                this.g.put(str, renderComponent.clone());
            }
        }
    }
}
