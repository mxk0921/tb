package com.alibaba.android.aura.datamodel.render;

import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fj;
import tb.fk;
import tb.t2o;
import tb.yn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARenderComponent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    private static final long serialVersionUID = 3021285964321808330L;
    public List<AURARenderComponent> children;
    public AURARenderComponentData data;
    public String key;
    @JSONField(serialize = false)
    public TreeNode<RenderComponent> mirror;
    @JSONField(serialize = false)
    public AURARenderComponent parent;
    public JSONObject protocol;

    static {
        t2o.a(80740394);
    }

    private boolean isContainerTypeValid() {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b21e336", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || yn.a(aURARenderComponentContainer.containerType)) {
            return false;
        }
        return true;
    }

    @JSONField(serialize = false)
    public void addChildComponent(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585b7652", new Object[]{this, aURARenderComponent});
            return;
        }
        if (this.children == null) {
            this.children = new ArrayList();
        }
        aURARenderComponent.parent = this;
        this.children.add(aURARenderComponent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r5.equals("success") == false) goto L_0x0040;
     */
    @com.alibaba.fastjson.annotation.JSONField(serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String asyncStatus() {
        /*
            r9 = this;
            java.lang.String r0 = "init"
            java.lang.String r1 = "failed"
            java.lang.String r2 = "success"
            r3 = 0
            r4 = 1
            com.android.alibaba.ip.runtime.IpChange r5 = com.alibaba.android.aura.datamodel.render.AURARenderComponent.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001c
            java.lang.String r0 = "f26e622b"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r9
            java.lang.Object r0 = r5.ipc$dispatch(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x001c:
            com.alibaba.android.aura.datamodel.render.AURARenderComponentData r5 = r9.data
            java.lang.String r6 = "none"
            if (r5 == 0) goto L_0x0062
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.fields
            if (r5 != 0) goto L_0x0028
            goto L_0x0062
        L_0x0028:
            java.lang.String r7 = "asyncStatus"
            java.lang.Object r5 = r5.get(r7)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 != 0) goto L_0x0033
            return r6
        L_0x0033:
            java.lang.String r5 = (java.lang.String) r5
            r5.hashCode()
            r7 = -1
            int r8 = r5.hashCode()
            switch(r8) {
                case -1867169789: goto L_0x0054;
                case -1281977283: goto L_0x004b;
                case 3237136: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r3 = -1
            goto L_0x005b
        L_0x0042:
            boolean r3 = r5.equals(r0)
            if (r3 != 0) goto L_0x0049
            goto L_0x0040
        L_0x0049:
            r3 = 2
            goto L_0x005b
        L_0x004b:
            boolean r3 = r5.equals(r1)
            if (r3 != 0) goto L_0x0052
            goto L_0x0040
        L_0x0052:
            r3 = 1
            goto L_0x005b
        L_0x0054:
            boolean r4 = r5.equals(r2)
            if (r4 != 0) goto L_0x005b
            goto L_0x0040
        L_0x005b:
            switch(r3) {
                case 0: goto L_0x0061;
                case 1: goto L_0x0060;
                case 2: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            return r6
        L_0x005f:
            return r0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.aura.datamodel.render.AURARenderComponent.asyncStatus():java.lang.String");
    }

    @JSONField(serialize = false)
    public String getContainerType() {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
            return null;
        }
        return aURARenderComponentContainer.containerType;
    }

    @JSONField(serialize = false)
    public TreeNode<RenderComponent> getMirror() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("df319c77", new Object[]{this});
        }
        return this.mirror;
    }

    @JSONField(serialize = false)
    public boolean isAsync() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0622afd", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return false;
        }
        return map.get("asyncStatus") instanceof String;
    }

    @JSONField(serialize = false)
    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue();
        }
        List<AURARenderComponent> list = this.children;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @JSONField(serialize = false)
    public boolean isRenderAbleLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a70bbe3", new Object[]{this})).booleanValue();
        }
        if (isValidLayout()) {
            return false;
        }
        if (isAURALeafNode()) {
            return true;
        }
        if (!isContainerTypeValid() || !isLeaf()) {
            return false;
        }
        return true;
    }

    @JSONField(serialize = false)
    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        if (this.parent == null) {
            return true;
        }
        return false;
    }

    @JSONField(serialize = false)
    public boolean isValidLayout() {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa87ed47", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || yn.a(aURARenderComponentLayout.type)) {
            return false;
        }
        return true;
    }

    @JSONField(serialize = false)
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURARenderComponent{, key='" + this.key + "', data=" + this.data + '}';
    }

    private boolean isAURALeafNode() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d11fcd38", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return false;
        }
        return "true".equalsIgnoreCase((String) fk.b(map, "isAURALeafNode", String.class, "false"));
    }

    @JSONField(serialize = false)
    public boolean isInvisible() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab07fcae", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return false;
        }
        boolean z = map.containsKey("ignoreWhenNoData") && Boolean.parseBoolean((String) fk.b(this.data.fields, "ignoreWhenNoData", String.class, "false"));
        int size = this.data.fields.size();
        if (1 != size) {
            z = 2 == size && z && this.data.fields.containsKey("cornerType");
        }
        if (z) {
            return true;
        }
        return fj.d("enableFilterInvisibleNode", true) && "false".equalsIgnoreCase((String) fk.b(this.data.fields, "visible", String.class, "true"));
    }
}
