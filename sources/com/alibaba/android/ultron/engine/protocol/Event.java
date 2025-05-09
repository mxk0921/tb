package com.alibaba.android.ultron.engine.protocol;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Event extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject fields;
    public int option;
    public String type;

    static {
        t2o.a(157286456);
    }

    public static /* synthetic */ Object ipc$super(Event event, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/protocol/Event");
    }

    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.fields;
    }

    public void setFields(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f811566e", new Object[]{this, jSONObject});
        } else {
            this.fields = jSONObject;
        }
    }
}
