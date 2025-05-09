package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "fatigue")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Fatigue extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject mData;

    static {
        t2o.a(912261669);
    }

    public Fatigue(JSONObject jSONObject) {
        super(jSONObject);
        this.mData = jSONObject.getJSONObject("data");
    }

    public static /* synthetic */ Object ipc$super(Fatigue fatigue, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Fatigue");
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.mData;
    }
}
