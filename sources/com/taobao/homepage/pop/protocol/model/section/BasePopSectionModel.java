package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BasePopSectionModel<UPDATE_RULE extends BasePopUpdateRuleModel> extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(477102124);
    }

    public BasePopSectionModel() {
    }

    public static /* synthetic */ Object ipc$super(BasePopSectionModel basePopSectionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/protocol/model/section/BasePopSectionModel");
    }

    public abstract BasePopSectionModel createBaseSectionModel(JSONObject jSONObject);

    public abstract BasePopSubItemModel createBaseSubItemModel(JSONObject jSONObject);

    public abstract JSONObject getArgs();

    public abstract BasePopUtModel getExposureParam();

    public abstract JSONObject getExt();

    public abstract int getIndex();

    public abstract BasePopItemModel getItem();

    public abstract int getRealExposeIndex();

    public abstract String getSectionBizCode();

    public abstract BasePopSectionConfigModel getSectionConfig();

    public abstract BasePopSubSectionModel getSubSection();

    public abstract BasePopTemplateModel getTemplate();

    public abstract List<UPDATE_RULE> getUpdateRules();

    public abstract boolean isRemote();

    public abstract void setRealExposeIndex(int i);

    public abstract JSONObject toJsonObject();

    public BasePopSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
