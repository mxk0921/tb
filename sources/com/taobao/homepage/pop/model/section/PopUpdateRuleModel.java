package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopUpdateRuleModel extends BasePopUpdateRuleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopUpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopUpdateRuleModel popUpdateRuleModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopUpdateRuleModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel
    public String getUpdatePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20f19f1", new Object[]{this});
        }
        return getString("updatePosition");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel
    public String getUpdateTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a63ec9", new Object[]{this});
        }
        return getString("updateTarget");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel
    public String getUpdateType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d0b100", new Object[]{this});
        }
        return getString(StWindow.UPDATE_TYPE);
    }
}
