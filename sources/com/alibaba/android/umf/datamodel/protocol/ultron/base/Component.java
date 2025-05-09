package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.BaseProtocol;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ah;
import tb.ck;
import tb.fk;
import tb.s1n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Component extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Component";
    @JSONField(name = "children")
    private JSONObject children;
    @JSONField(serialize = false)
    private Map<String, Object> codePopupWindowMap;
    @JSONField(name = "events")
    @Deprecated
    public Map<String, List<Event>> events;
    @JSONField(name = "features")
    @Deprecated
    public Object features;
    @JSONField(name = "fields")
    @Deprecated
    public Map<String, Object> fields;
    @JSONField(name = "id")
    @Deprecated
    public String id;
    @JSONField(name = "localFields")
    @Deprecated
    public Map<String, Object> localFields;
    private JSONObject mOriginData;
    @JSONField(name = "validate")
    @Deprecated
    public JSONObject mValidate;
    @JSONField(name = "position")
    @Deprecated
    public String position;
    @JSONField(name = "ref")
    @Deprecated
    public String ref;
    @JSONField(name = "status")
    @Deprecated
    public String status;
    @JSONField(name = "submit")
    @Deprecated
    public String submit;
    @JSONField(name = "tag")
    @Deprecated
    public String tag;
    @JSONField(name = "type")
    @Deprecated
    public String type;

    static {
        t2o.a(80740670);
    }

    public Component() {
        this.fields = new HashMap();
        this.events = new HashMap();
    }

    private Map<String, List<Event>> eventsDeepClone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3880ef34", new Object[]{this});
        }
        getEvents();
        HashMap hashMap = new HashMap();
        for (String str : this.events.keySet()) {
            ArrayList arrayList = new ArrayList();
            for (Event event : this.events.get(str)) {
                arrayList.add(event.clone());
            }
            hashMap.put(str, arrayList);
        }
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(Component component, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/protocol/ultron/base/Component");
    }

    public void addCodePopupWindow(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c06db", new Object[]{this, str, obj});
            return;
        }
        if (this.codePopupWindowMap == null) {
            this.codePopupWindowMap = new HashMap();
        }
        this.codePopupWindowMap.put(str, obj);
    }

    public JSONObject getChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("638f189c", new Object[]{this});
        }
        return this.children;
    }

    public Map<String, Object> getCodePopupWindowMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49b4a8ff", new Object[]{this});
        }
        return this.codePopupWindowMap;
    }

    public Map<String, List<Event>> getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57675ccb", new Object[]{this});
        }
        Map<String, List<Event>> map = this.events;
        if (map == null || map.size() == 0) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return this.events;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null) {
                return this.events;
            }
            this.events = s1n.b(jSONObject2);
        }
        return this.events;
    }

    public Object getFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50f14db8", new Object[]{this});
        }
        if (this.features == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.features = jSONObject.getJSONObject("features");
        }
        return this.features;
    }

    public Map<String, Object> getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fb94d26b", new Object[]{this});
        }
        Map<String, Object> map = this.fields;
        if (map == null || map.size() == 0) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return this.fields;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 == null) {
                return this.fields;
            }
            this.fields = jSONObject2;
        }
        return this.fields;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        String str = this.id;
        if (str == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return str;
            }
            this.id = jSONObject.getString("id");
        }
        return this.id;
    }

    public Map<String, Object> getLocalFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5415bca", new Object[]{this});
        }
        if (this.localFields == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.localFields = jSONObject.getJSONObject("localFields");
        }
        return this.localFields;
    }

    public String getPosition() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        getFields();
        if (TextUtils.isEmpty(this.position) && (map = this.fields) != null) {
            Object obj = map.get("position");
            this.position = obj instanceof String ? (String) obj : null;
        }
        return this.position;
    }

    public String getRef() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this});
        }
        if (this.ref == null && (jSONObject = this.mOriginData) != null) {
            this.ref = jSONObject.getString("ref");
        }
        return this.ref;
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        if (this.status == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.status = jSONObject.getString("status");
        }
        return this.status;
    }

    public String getSubmit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fb3e0ab", new Object[]{this});
        }
        if (this.submit == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.submit = jSONObject.getString("submit");
        }
        return this.submit;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        String str = this.tag;
        if (str == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return str;
            }
            this.tag = jSONObject.getString("tag");
        }
        return this.tag;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        String str = this.type;
        if (str == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return str;
            }
            this.type = jSONObject.getString("type");
        }
        return this.type;
    }

    public JSONObject getValidate() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0805433", new Object[]{this});
        }
        getFeatures();
        Object obj = this.features;
        if (!(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("linkage")) == null) {
            return this.mValidate;
        }
        return jSONObject.getJSONObject("validate");
    }

    @JSONField(serialize = false)
    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        getStatus();
        if (TextUtils.isEmpty(this.status) || !"disable".equals(this.status.toLowerCase())) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        getFields();
        Map<String, Object> map = this.fields;
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    @JSONField(serialize = false)
    public boolean isHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fb439ff", new Object[]{this})).booleanValue();
        }
        getStatus();
        if (TextUtils.isEmpty(this.status) || !"hidden".equals(this.status.toLowerCase())) {
            return false;
        }
        return true;
    }

    public boolean isIndependentNode() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb50e99d", new Object[]{this})).booleanValue();
        }
        getFields();
        Map<String, Object> map = this.fields;
        if (map == null || (obj = map.get("independentAURANode")) == null) {
            return false;
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    @JSONField(serialize = false)
    public boolean isInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab07fcae", new Object[]{this})).booleanValue();
        }
        getFields();
        return "false".equalsIgnoreCase((String) fk.b(this.fields, "visible", String.class, "true"));
    }

    public void setChildren(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22eb1368", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.children = jSONObject;
        }
    }

    public void setEvents(Map<String, List<Event>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7123c23", new Object[]{this, map});
        } else {
            this.events = map;
        }
    }

    public void setFeatures(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d5a22", new Object[]{this, obj});
        } else {
            this.features = obj;
        }
    }

    public void setFields(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8937a83", new Object[]{this, map});
        } else {
            this.fields = map;
        }
    }

    public void setLocalFields(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c8949c", new Object[]{this, map});
        } else {
            this.localFields = map;
        }
    }

    public Component clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("1267d3ac", new Object[]{this});
        }
        Component component = (Component) super.clone();
        try {
            if (getFields() != null) {
                component.fields = ah.b(getFields());
            }
            if (!(getFeatures() instanceof Serializable)) {
                component.features = ah.a((Serializable) getFeatures());
            }
            if (getEvents() != null) {
                component.events = eventsDeepClone();
            }
        } catch (IOException e) {
            ck.g().b(TAG, "clone.IOException", e.getMessage());
        } catch (ClassNotFoundException e2) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e2.getMessage());
        }
        return component;
    }

    public Component(JSONObject jSONObject) {
        this();
        this.mOriginData = jSONObject;
    }
}
