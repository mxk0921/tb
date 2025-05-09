package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseUpdateRuleModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(488636501);
    }

    public BaseUpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject == null ? new JSONObject() : jSONObject);
    }

    public static /* synthetic */ Object ipc$super(BaseUpdateRuleModel baseUpdateRuleModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/protocol/model/datamodel/card/BaseUpdateRuleModel");
    }

    public abstract String getUpdatePosition();

    public abstract String getUpdateTarget();

    public abstract String getUpdateType();
}
