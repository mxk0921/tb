package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UpdateRuleModel extends BaseUpdateRuleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587877);
    }

    public UpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(UpdateRuleModel updateRuleModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/UpdateRuleModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel
    public String getUpdatePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20f19f1", new Object[]{this});
        }
        return getString("updatePosition");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel
    public String getUpdateTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a63ec9", new Object[]{this});
        }
        return getString("updateTarget");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel
    public String getUpdateType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d0b100", new Object[]{this});
        }
        return getString(StWindow.UPDATE_TYPE);
    }
}
