package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "commonDialog")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CommonDialog extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject bizData;

    static {
        t2o.a(912261662);
    }

    public CommonDialog(JSONObject jSONObject) {
        super(jSONObject);
        this.bizData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(CommonDialog commonDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/CommonDialog");
    }

    public JSONObject getBizData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this});
        }
        return this.bizData;
    }
}
