package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseStyleModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class StyleModel extends BaseStyleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mStyleData;
    private TemplateModel mTemplateModel;

    static {
        t2o.a(487587869);
    }

    public StyleModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(StyleModel styleModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/StyleModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseStyleModel
    public JSONObject getStyleData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e654076c", new Object[]{this});
        }
        if (this.mStyleData == null) {
            JSONObject jSONObject = getJSONObject("styleData");
            if (jSONObject == null) {
                return null;
            }
            this.mStyleData = jSONObject;
        }
        return this.mStyleData;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseStyleModel
    public TemplateModel getTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateModel) ipChange.ipc$dispatch("c83bd38f", new Object[]{this});
        }
        if (this.mTemplateModel == null) {
            JSONObject jSONObject = getJSONObject("template");
            if (jSONObject == null) {
                return null;
            }
            this.mTemplateModel = new TemplateModel(jSONObject);
        }
        return this.mTemplateModel;
    }
}
