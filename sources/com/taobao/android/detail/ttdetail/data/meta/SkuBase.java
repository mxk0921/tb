package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "skuBase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SkuBase extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject data;

    static {
        t2o.a(912261706);
    }

    public SkuBase(JSONObject jSONObject) {
        super(jSONObject);
        this.data = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(SkuBase skuBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/SkuBase");
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.data;
    }
}
