package tb;

import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.Template;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.model.TemplateHierarchy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Template f24017a;
    public final Map<String, knm> b = new HashMap();
    public final Map<String, List<Block>> c = new HashMap();
    public knm d;

    static {
        t2o.a(157286482);
    }

    public mfl(Template template) {
        this.f24017a = template;
    }

    public knm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knm) ipChange.ipc$dispatch("9bdb3024", new Object[]{this});
        }
        return this.d;
    }

    public Template b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("e70fdb3b", new Object[]{this});
        }
        return this.f24017a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819dfe16", new Object[]{this});
            return;
        }
        for (Block block : this.f24017a.blocks) {
            List list = (List) ((HashMap) this.c).get(block.position);
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.c).put(block.position, list);
            }
            list.add(block);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4294ea20", new Object[]{this});
            return;
        }
        c();
        e();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fffaa3", new Object[]{this});
            return;
        }
        TemplateHierarchy templateHierarchy = this.f24017a.hierarchy;
        String str = templateHierarchy.root;
        knm knmVar = new knm();
        TemplateHierarchy.Node node = templateHierarchy.nodes.get(str);
        if (node == null) {
            node = new TemplateHierarchy.Node();
            node.position = str;
            node.tag = str;
        }
        knmVar.q(node, str);
        this.d = knmVar;
        ((HashMap) this.b).put(str, knmVar);
        Iterator<Object> it = templateHierarchy.structure.getJSONArray(str).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                f(templateHierarchy, (String) next, knmVar);
            } else {
                return;
            }
        }
    }

    public final void f(TemplateHierarchy templateHierarchy, String str, knm knmVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76839e95", new Object[]{this, templateHierarchy, str, knmVar});
            return;
        }
        JSONObject jSONObject = templateHierarchy.structure;
        Map<String, TemplateHierarchy.Node> map = templateHierarchy.nodes;
        if (map.containsKey(str)) {
            knm knmVar2 = new knm();
            knmVar2.q(map.get(str), str);
            knmVar2.r(knmVar);
            knmVar.a(knmVar2);
            ((HashMap) this.b).put(str, knmVar2);
            if (((HashMap) this.c).containsKey(str)) {
                for (Block block : (List) ((HashMap) this.c).get(str)) {
                    if (block != null) {
                        String str2 = block.name;
                        knm knmVar3 = new knm();
                        knmVar3.o(block, str2);
                        knmVar3.r(knmVar);
                        knmVar2.a(knmVar3);
                        ((HashMap) this.b).put(str2, knmVar3);
                        for (TemplateComponent templateComponent : block.components) {
                            if (templateComponent != null) {
                                knm knmVar4 = new knm();
                                knmVar4.p(templateComponent);
                                knmVar4.r(knmVar3);
                                knmVar3.a(knmVar4);
                                ((HashMap) this.b).put(qcv.a(templateComponent), knmVar4);
                                List<TemplateComponent> list = templateComponent.children;
                                if (list != null && !list.isEmpty()) {
                                    for (TemplateComponent templateComponent2 : templateComponent.children) {
                                        knm knmVar5 = new knm();
                                        knmVar5.p(templateComponent2);
                                        knmVar5.r(knmVar4);
                                        knmVar4.a(knmVar5);
                                        ((HashMap) this.b).put(qcv.a(templateComponent2), knmVar5);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (jSONObject.containsKey(str) && (jSONArray = jSONObject.getJSONArray(str)) != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        f(templateHierarchy, (String) next, knmVar2);
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
