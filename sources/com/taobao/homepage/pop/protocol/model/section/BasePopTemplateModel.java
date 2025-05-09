package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BasePopTemplateModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(477102127);
    }

    public BasePopTemplateModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(BasePopTemplateModel basePopTemplateModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/protocol/model/section/BasePopTemplateModel");
    }

    public abstract String getColumnType();

    public abstract String getName();

    public abstract String getNameV2();

    public abstract String getUrl();

    public abstract String getUrlV2();

    public abstract String getVersion();

    public abstract String getVersionV2();
}
