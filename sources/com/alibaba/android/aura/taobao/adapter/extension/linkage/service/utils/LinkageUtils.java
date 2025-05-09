package com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import tb.fxu;
import tb.t2o;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LinkageUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface PolicyType {
        public static final String ALL = "all";
        public static final String CHILDREN = "children";
        public static final String RULE = "rule";
        public static final String SELF = "self";
    }

    static {
        t2o.a(81789145);
    }

    public static void a(TreeNode<RenderComponent> treeNode, Component component, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c47a71", new Object[]{treeNode, component, new Boolean(z)});
        } else if (component != null) {
            Object features = component.getFeatures();
            if ((features instanceof JSONObject) && (jSONObject = ((JSONObject) features).getJSONObject("linkage")) != null) {
                b(treeNode, component, jSONObject, z);
            }
        }
    }

    public static JSONObject d(TreeNode<RenderComponent> treeNode, boolean z, boolean z2) {
        RenderComponent data;
        Component component;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80bd87b4", new Object[]{treeNode, new Boolean(z), new Boolean(z2)});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (treeNode == null) {
            return jSONObject2;
        }
        for (TreeNode<RenderComponent> treeNode2 : treeNode.preOrdered()) {
            if (!(treeNode2 == null || (data = treeNode2.data()) == null || (component = data.getComponent()) == null)) {
                String key = data.getKey();
                if (!TextUtils.isEmpty(key)) {
                    if (z2) {
                        Object features = component.getFeatures();
                        if (!(!(features instanceof JSONObject) || (jSONObject = ((JSONObject) features).getJSONObject("linkage")) == null || jSONObject.getString("ref") == null)) {
                        }
                    }
                    if (z || treeNode.data() == null || !key.equals(treeNode.data().getKey())) {
                        jSONObject2.put(key, (Object) component);
                    }
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject e(Collection<TreeNode<RenderComponent>> collection, String str) throws CloneNotSupportedException {
        Component component;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8286935f", new Object[]{collection, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (TreeNode<RenderComponent> treeNode : collection) {
            RenderComponent data = treeNode.data();
            if (!(data == null || (component = data.getComponent()) == null)) {
                Component clone = component.clone();
                Object features = clone.getFeatures();
                if ((features instanceof JSONObject) && (jSONObject = ((JSONObject) features).getJSONObject("linkage")) != null && jSONObject.getBooleanValue(str) && !TextUtils.isEmpty(data.getKey())) {
                    jSONObject2.put(data.getKey(), (Object) clone);
                }
            }
        }
        return jSONObject2;
    }

    public static void b(TreeNode<RenderComponent> treeNode, Component component, JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab8ba36", new Object[]{treeNode, component, jSONObject, new Boolean(z)});
            return;
        }
        if (z) {
            str = "adjustPolicy";
        } else {
            str = "submitPolicy";
        }
        String string = jSONObject.getString(str);
        if (!TextUtils.isEmpty(string)) {
            string.hashCode();
            if (string.equals("all") || string.equals("children")) {
                component.setChildren(d(treeNode, false, false));
            }
        }
    }

    public static JSONObject c(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, UMFLinkageTrigger uMFLinkageTrigger, boolean z) throws CloneNotSupportedException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("30fdb850", new Object[]{multiTreeNode, ultronProtocol, uMFLinkageTrigger, new Boolean(z)});
        }
        if (multiTreeNode == null || ultronProtocol == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkage", ultronProtocol.getLinkage());
        jSONObject.put("hierarchy", ultronProtocol.getHierarchy());
        jSONObject.put(AURASubmitEvent.RPC_ENDPOINT, ultronProtocol.getEndpoint());
        Collection<TreeNode<RenderComponent>> postOrdered = multiTreeNode.postOrdered();
        if (z) {
            str = "input";
        } else {
            str = "submit";
        }
        JSONObject e = e(postOrdered, str);
        if (uMFLinkageTrigger != null) {
            String triggerComponentKey = uMFLinkageTrigger.getTriggerComponentKey();
            String eventKey = uMFLinkageTrigger.getEventKey();
            String action = uMFLinkageTrigger.getAction();
            TreeNode<RenderComponent> h = fxu.h(multiTreeNode, triggerComponentKey);
            if (!(h == null || h.data() == null || h.data().getComponent() == null)) {
                Component component = h.data().getComponent();
                e.put(h.data().getKey(), (Object) component);
                a(h, component, z);
            }
            MultiTreeNode stateTree = uMFLinkageTrigger.getStateTree();
            if (fxu.h(stateTree, triggerComponentKey) != null) {
                e.putAll(d(stateTree, true, true));
            }
            if (!TextUtils.isEmpty(triggerComponentKey)) {
                jSONObject.put(x96.PATH_OPERATOR, (Object) triggerComponentKey);
            }
            if (!TextUtils.isEmpty(eventKey)) {
                jSONObject.put("operatorEvent", (Object) eventKey);
            }
            if (!TextUtils.isEmpty(action)) {
                jSONObject.put("operatorAction", (Object) action);
            }
        }
        jSONObject.put("data", (Object) e);
        jSONObject.put("operatorTime", Long.valueOf(System.currentTimeMillis()));
        return jSONObject;
    }
}
