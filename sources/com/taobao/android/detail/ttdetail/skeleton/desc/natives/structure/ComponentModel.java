package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.aed;
import tb.t2o;
import tb.uf7;
import tb.zf8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ComponentModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ID;
    public List<ActionModel> actionModelList;
    public List<ComponentModel> children;
    public String filter;
    public String key;
    public String locatorId;
    private aed mProtocolManager;
    public JSONObject mapping;
    public JSONObject otherMapping;
    public String ruleId;
    public String style;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<ComponentModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aed f6912a;

        public a(aed aedVar) {
            this.f6912a = aedVar;
        }

        /* renamed from: b */
        public ComponentModel a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ComponentModel) ipChange.ipc$dispatch("a4d33a5d", new Object[]{this, obj});
            }
            if (obj == null) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("ruleId");
            if (!ComponentModel.this.key.equals(jSONObject.getString("key")) || !ComponentModel.this.ruleId.equals(string)) {
                return new ComponentModel(jSONObject, this.f6912a);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements zf8<ComponentModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6913a;

        public b(JSONObject jSONObject) {
            this.f6913a = jSONObject;
        }

        /* renamed from: b */
        public ComponentModel a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ComponentModel) ipChange.ipc$dispatch("a4d33a5d", new Object[]{this, obj});
            }
            if (obj == null) {
                return null;
            }
            return new ComponentModel((String) obj, ComponentModel.access$000(ComponentModel.this), this.f6913a);
        }
    }

    static {
        t2o.a(912262468);
    }

    public ComponentModel(JSONObject jSONObject, aed aedVar) {
        if (jSONObject == null || aedVar == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = aedVar;
        this.ID = jSONObject.getString("ID");
        this.key = jSONObject.getString("key");
        this.ruleId = jSONObject.getString(this.mProtocolManager.c());
        this.children = initChildren(jSONObject.getJSONArray("children"), aedVar);
        parseRule(this.ruleId);
        parseOtherMapping(this.ruleId);
    }

    public static /* synthetic */ aed access$000(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aed) ipChange.ipc$dispatch("6effc2c2", new Object[]{componentModel});
        }
        return componentModel.mProtocolManager;
    }

    public aed getProtocolManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aed) ipChange.ipc$dispatch("2736cffc", new Object[]{this});
        }
        return this.mProtocolManager;
    }

    public List<ComponentModel> initChildren(JSONArray jSONArray, aed aedVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5be69dfd", new Object[]{this, jSONArray, aedVar});
        }
        return uf7.a(jSONArray, new a(aedVar));
    }

    public List<ActionModel> initEvents(RuleModel ruleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("713d6eb7", new Object[]{this, ruleModel});
        }
        List<String> list = ruleModel.actions;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(this.mProtocolManager.a(str));
        }
        return arrayList;
    }

    public List<ComponentModel> parseChildren(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1c9a923a", new Object[]{this, str, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            return uf7.a(jSONArray, new b(jSONObject));
        }
        return null;
    }

    public void parseOtherMapping(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e055d9c2", new Object[]{this, str});
            return;
        }
        RuleModel b2 = this.mProtocolManager.b(this.key, str);
        if (b2 != null && (jSONObject = b2.root) != null && jSONObject.containsKey("styles")) {
            this.otherMapping = b2.root.getJSONObject("styles");
        }
    }

    public void parseRule(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f19a0", new Object[]{this, str});
            return;
        }
        RuleModel b2 = this.mProtocolManager.b(this.key, str);
        if (b2 != null) {
            if (TextUtils.isEmpty(b2.mapping)) {
                jSONObject = null;
            } else {
                jSONObject = JSON.parseObject(b2.mapping);
            }
            this.mapping = jSONObject;
            if (jSONObject != null) {
                jSONObject.put("componentId", (Object) str);
            }
            this.filter = b2.filter;
            this.type = b2.type;
            this.locatorId = b2.locatorId;
            this.actionModelList = initEvents(b2);
            this.style = b2.style;
            this.children = initChildren(b2.children, this.mProtocolManager);
        }
    }

    public void refreshRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de2fc8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            parseRule(str);
        }
    }

    public ComponentModel() {
    }

    public ComponentModel(String str, aed aedVar, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || aedVar == null || jSONObject == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = aedVar;
        this.ruleId = str;
        parseRule(str);
        this.children = parseChildren(str, jSONObject);
    }
}
