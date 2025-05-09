package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.u55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ExtendBlock implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, List<IDMComponent>> blockComponents = new LinkedHashMap();
    public Map<String, JSONObject> blockHierarchy = new HashMap();
    private IDMComponent mExtendBlock;

    static {
        t2o.a(83886172);
    }

    public ExtendBlock(IDMComponent iDMComponent) {
        this.mExtendBlock = iDMComponent;
    }

    private void handleSubKeyArray(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5b44a3", new Object[]{this, str, jSONObject, jSONObject2});
        } else if (str != null && jSONObject.containsKey(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            jSONObject2.put(str, (Object) jSONArray);
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    handleSubKeyArray((String) obj, jSONObject, jSONObject2);
                }
            }
        }
    }

    public void addBlock(String str, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bd6cee", new Object[]{this, str, list});
        } else {
            this.blockComponents.put(str, list);
        }
    }

    public void addHierarchy(String str, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f20d1", new Object[]{this, str, u55Var});
        } else if (u55Var != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject = this.blockHierarchy.get(str);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject M = u55Var.M();
            if (M.containsKey(str)) {
                JSONArray jSONArray = M.getJSONArray(str);
                jSONObject.put(str, (Object) jSONArray);
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        handleSubKeyArray((String) obj, M, jSONObject);
                    }
                }
                this.blockHierarchy.put(str, jSONObject);
                return;
            }
            this.blockHierarchy.remove(str);
        }
    }

    public JSONObject getBlockHierarchy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24d9284f", new Object[]{this, str});
        }
        if (this.blockHierarchy.containsKey(str)) {
            return this.blockHierarchy.get(str);
        }
        return null;
    }

    public IDMComponent getExtendBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("20bb7c68", new Object[]{this});
        }
        return this.mExtendBlock;
    }

    public List<IDMComponent> getblockComponentList() {
        List<IDMComponent> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1eac9edc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<IDMComponent>> entry : this.blockComponents.entrySet()) {
            if (!(entry == null || (value = entry.getValue()) == null || value.isEmpty())) {
                arrayList.addAll(value);
            }
        }
        return arrayList;
    }

    public void removeBlockComponentList(String str) {
        Map<String, List<IDMComponent>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d4a063", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (map = this.blockComponents) != null && map.containsKey(str)) {
            this.blockComponents.remove(str);
        }
    }

    public void removeBlockHierarchy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d3e35d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && this.blockHierarchy.containsKey(str)) {
            this.blockHierarchy.remove(str);
        }
    }

    public void updateExtendBlock(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ec6f63", new Object[]{this, iDMComponent});
        } else {
            this.mExtendBlock = iDMComponent;
        }
    }

    public boolean isExtendTypePrepend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc48fbfb", new Object[]{this})).booleanValue();
        }
        IDMComponent iDMComponent = this.mExtendBlock;
        return iDMComponent != null && DMComponent.PREPEND.equals(iDMComponent.getExtendType());
    }

    public boolean isExtendTypeReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("892b85bc", new Object[]{this})).booleanValue();
        }
        IDMComponent iDMComponent = this.mExtendBlock;
        return iDMComponent != null && DMComponent.RESET.equals(iDMComponent.getExtendType());
    }
}
