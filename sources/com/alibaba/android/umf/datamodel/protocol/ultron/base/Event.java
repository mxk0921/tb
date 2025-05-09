package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import com.alibaba.android.umf.datamodel.protocol.ultron.BaseProtocol;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.ah;
import tb.ck;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Event extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Event";
    @Deprecated
    public JSONObject fields;
    @Deprecated
    public String id;
    private JSONObject mOriginData;
    @Deprecated
    public String tag;
    @Deprecated
    public String type;

    static {
        t2o.a(80740673);
    }

    public Event() {
    }

    public static /* synthetic */ Object ipc$super(Event event, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/protocol/ultron/base/Event");
    }

    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        if (this.fields == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.fields = jSONObject.getJSONObject("fields");
        }
        return this.fields;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        if (this.id == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.id = jSONObject.getString("id");
        }
        return this.id;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        if (this.tag == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
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
        if (this.type == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.type = jSONObject.getString("type");
        }
        return this.type;
    }

    public void setFields(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f811566e", new Object[]{this, jSONObject});
        } else {
            this.fields = jSONObject;
        }
    }

    public Event(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
        this.id = getId();
        this.tag = getTag();
        this.type = getType();
        this.fields = getFields();
    }

    public Event clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("790fc8af", new Object[]{this});
        }
        Event event = (Event) super.clone();
        try {
            event.fields = (JSONObject) ah.a(getFields());
        } catch (IOException e) {
            ck.g().b("Event", "clone.IOException", e.getMessage());
        } catch (ClassNotFoundException e2) {
            ck.g().b("Event", "clone.ClassNotFoundException", e2.getMessage());
        }
        return event;
    }
}
