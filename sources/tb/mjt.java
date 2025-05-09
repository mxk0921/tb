package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.Template;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.model.TemplateHierarchy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286498);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ff6f40", new Object[0])).booleanValue();
        }
        return false;
    }

    public static TemplateComponent b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateComponent) ipChange.ipc$dispatch("83dcc0f3", new Object[]{jSONObject});
        }
        TemplateComponent templateComponent = new TemplateComponent();
        templateComponent.id = jSONObject.getLong("id");
        templateComponent.type = jSONObject.getString("type");
        templateComponent.name = jSONObject.getString("name");
        templateComponent.templateId = jSONObject.getLong("templateId");
        templateComponent.ruleId = jSONObject.getLong("ruleId");
        templateComponent.rule = jSONObject.getString(LinkageUtils.PolicyType.RULE);
        templateComponent.filter = jSONObject.getString("filter");
        templateComponent.frontComponentId = jSONObject.getLong("frontComponentId");
        templateComponent.frontComponentName = jSONObject.getString("frontComponentName");
        templateComponent.frontComponentVersion = jSONObject.getString("frontComponentVersion");
        templateComponent.frontComponentVersion = jSONObject.getString("frontComponentVersion");
        JSONObject jSONObject2 = jSONObject.getJSONObject("frontComponentAddress");
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        templateComponent.frontComponentAddress = hashMap;
        JSONObject jSONObject3 = jSONObject.getJSONObject("frontComponentAddress");
        HashMap hashMap2 = new HashMap();
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                hashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        }
        templateComponent.frontComponentMD5 = hashMap2;
        templateComponent.tag = jSONObject.getString("tag");
        templateComponent.data = jSONObject.getJSONObject("data");
        templateComponent.event = jSONObject.getJSONObject("event");
        templateComponent.supportEvent = jSONObject.getJSONObject("supportEvent");
        templateComponent.style = jSONObject.getString("style");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    arrayList.add(b((JSONObject) next));
                }
            }
        }
        templateComponent.children = arrayList;
        return templateComponent;
    }

    public static Template c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("f21d2d36", new Object[]{jSONObject});
        }
        Template template = new Template();
        JSONArray jSONArray = jSONObject.getJSONArray("blocks");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    Block block = new Block();
                    JSONObject jSONObject2 = (JSONObject) next;
                    block.blockTypeEnum = jSONObject2.getString("blockTypeEnum");
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("components");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Object> it2 = jSONArray2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 instanceof JSONObject) {
                            arrayList2.add(b((JSONObject) next2));
                        }
                    }
                    block.components = arrayList2;
                    block.description = jSONObject2.getString("description");
                    block.name = jSONObject2.getString("name");
                    block.position = jSONObject2.getString("position");
                    arrayList.add(block);
                }
            }
        }
        template.blocks = arrayList;
        JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
        TemplateHierarchy templateHierarchy = new TemplateHierarchy();
        templateHierarchy.root = jSONObject3.getString("root");
        templateHierarchy.structure = jSONObject3.getJSONObject("structure");
        HashMap hashMap = new HashMap();
        JSONObject jSONObject4 = jSONObject3.getJSONObject("nodes");
        if (jSONObject4 != null) {
            for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    hashMap.put(entry.getKey(), (TemplateHierarchy.Node) JSON.toJavaObject((JSONObject) value, TemplateHierarchy.Node.class));
                }
            }
        }
        templateHierarchy.nodes = hashMap;
        template.hierarchy = templateHierarchy;
        template.name = jSONObject.getString("name");
        template.templateId = jSONObject.getLong("templateId");
        template.version = jSONObject.getInteger("version");
        template.globalStyle = jSONObject.getJSONObject("globalStyle");
        return template;
    }
}
