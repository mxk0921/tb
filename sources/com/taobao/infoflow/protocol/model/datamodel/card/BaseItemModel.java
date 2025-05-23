package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseItemModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(488636494);
    }

    public BaseItemModel(JSONObject jSONObject) {
        super(jSONObject == null ? new JSONObject() : jSONObject);
    }

    public static /* synthetic */ Object ipc$super(BaseItemModel baseItemModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/protocol/model/datamodel/card/BaseItemModel");
    }

    public abstract BaseSubItemModel getBaseItemModel(int i);

    public abstract int getItemCount();
}
