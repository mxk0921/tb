package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "detailAdjustModel")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailAdjustModel extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONArray adjustModel;

    static {
        t2o.a(912261667);
    }

    public DetailAdjustModel(JSONObject jSONObject) {
        super(jSONObject);
        this.adjustModel = jSONObject.getJSONArray("adjustModel");
    }

    public static /* synthetic */ Object ipc$super(DetailAdjustModel detailAdjustModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/DetailAdjustModel");
    }

    public JSONArray getAdjustModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("da6386b3", new Object[]{this});
        }
        return this.adjustModel;
    }
}
