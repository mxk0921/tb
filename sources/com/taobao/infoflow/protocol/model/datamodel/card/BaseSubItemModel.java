package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseSubItemModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(488636497);
    }

    public BaseSubItemModel(JSONObject jSONObject) {
        super(jSONObject == null ? new JSONObject() : jSONObject);
    }

    public static /* synthetic */ Object ipc$super(BaseSubItemModel baseSubItemModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/protocol/model/datamodel/card/BaseSubItemModel");
    }

    public abstract BaseUtModel getClickParam();

    public abstract JSONObject getContent();

    public abstract JSONObject getExt();

    public abstract String getItemBizCode();

    public abstract JSONObject getSmartContent();

    public abstract String getTargetUrl();
}
