package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionConfigModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopSectionConfigModel extends BasePopSectionConfigModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String updateCardSectionBizCode;

    public PopSectionConfigModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopSectionConfigModel popSectionConfigModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopSectionConfigModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionConfigModel
    public String getUpdateCardSectionBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb3554ef", new Object[]{this});
        }
        return getString("updateCardSectionBizCode");
    }
}
