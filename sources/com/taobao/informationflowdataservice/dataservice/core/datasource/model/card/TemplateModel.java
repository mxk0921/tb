package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TemplateModel extends BaseTemplateModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587875);
    }

    public TemplateModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(TemplateModel templateModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/TemplateModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getColumnType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24061f13", new Object[]{this});
        }
        return getString("columnType");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return getString("name");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getNameV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a0269bc", new Object[]{this});
        }
        return getString("name_v2");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return getString("url");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getUrlV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fbeb784", new Object[]{this});
        }
        return getString("url_v2");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return getString("version");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getVersionV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f2a2efb", new Object[]{this});
        }
        return getString("version_v2");
    }
}
