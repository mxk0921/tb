package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseSectionModel<UPDATE_RULE extends BaseUpdateRuleModel> extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(488636495);
    }

    public BaseSectionModel() {
    }

    public static /* synthetic */ Object ipc$super(BaseSectionModel baseSectionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/protocol/model/datamodel/card/BaseSectionModel");
    }

    public abstract BaseSectionModel createBaseSectionModel(JSONObject jSONObject);

    public abstract BaseSubItemModel createBaseSubItemModel(JSONObject jSONObject);

    public abstract JSONObject getArgs();

    public abstract JSONObject getContent();

    public abstract BaseUtModel getExposureParam();

    public abstract JSONObject getExt();

    public abstract int getIndex();

    public abstract BaseItemModel getItem();

    public abstract int getRealExposeIndex();

    public abstract String getSectionBizCode();

    public abstract BaseStyleModel getStyle();

    public abstract BaseSubSectionModel getSubSection();

    public abstract BaseTemplateModel getTemplate();

    public abstract JSONObject getTrack();

    public abstract List<UPDATE_RULE> getUpdateRules();

    public abstract boolean isRemote();

    public abstract void setCustomSubSection(BaseSubSectionModel baseSubSectionModel);

    public abstract void setRealExposeIndex(int i);

    public abstract boolean slimSection();

    public abstract JSONObject toJsonObject();

    public BaseSectionModel(JSONObject jSONObject) {
        super(jSONObject == null ? new JSONObject() : jSONObject);
    }
}
