package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopTemplateModel extends BasePopTemplateModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopTemplateModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopTemplateModel popTemplateModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopTemplateModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getColumnType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24061f13", new Object[]{this});
        }
        return getString("columnType");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return getString("name");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getNameV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a0269bc", new Object[]{this});
        }
        return getString("name_v2");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return getString("url");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getUrlV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fbeb784", new Object[]{this});
        }
        return getString("url_v2");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return getString("version");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel
    public String getVersionV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f2a2efb", new Object[]{this});
        }
        return getString("version_v2");
    }
}
