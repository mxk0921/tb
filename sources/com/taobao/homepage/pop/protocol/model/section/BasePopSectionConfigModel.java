package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BasePopSectionConfigModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(477102123);
    }

    public BasePopSectionConfigModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(BasePopSectionConfigModel basePopSectionConfigModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/protocol/model/section/BasePopSectionConfigModel");
    }

    public abstract String getUpdateCardSectionBizCode();
}
