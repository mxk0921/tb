package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.q2q;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "delivery")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Delivery extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String addressWeexUrl;
    private final String areaId;
    private final String completedTo;
    private final String to;

    static {
        t2o.a(912261666);
    }

    public Delivery(JSONObject jSONObject) {
        super(jSONObject);
        this.areaId = jSONObject.getString(q2q.KEY_AREA_ID);
        this.completedTo = jSONObject.getString("completedTo");
        this.to = jSONObject.getString("to");
        this.addressWeexUrl = jSONObject.getString("addressWeexUrl");
    }

    public static /* synthetic */ Object ipc$super(Delivery delivery, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Delivery");
    }

    public String getAddressWeexUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d14f88e9", new Object[]{this});
        }
        return this.addressWeexUrl;
    }

    public String getAreaId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20641c3b", new Object[]{this});
        }
        return this.areaId;
    }

    public String getCompletedTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d634409", new Object[]{this});
        }
        return this.completedTo;
    }

    public String getTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c0f328", new Object[]{this});
        }
        return this.to;
    }
}
