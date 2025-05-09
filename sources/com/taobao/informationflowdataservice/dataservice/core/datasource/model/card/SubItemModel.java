package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import tb.t2o;
import tb.vaj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SubItemModel extends BaseSubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587871);
    }

    public SubItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(SubItemModel subItemModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/SubItemModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public JSONObject getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14011e6a", new Object[]{this});
        }
        return getJSONObject("content");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return getJSONObject("ext");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public String getItemBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb53d582", new Object[]{this});
        }
        return getString("itemBizCode");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public JSONObject getSmartContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a653bd8d", new Object[]{this});
        }
        return getJSONObject(vaj.KEY_SMART_CONTENT);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public String getTargetUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return getString("targetUrl");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public UtModel getClickParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtModel) ipChange.ipc$dispatch("9046d4a9", new Object[]{this});
        }
        JSONObject jSONObject = getJSONObject("clickParam");
        if (jSONObject == null) {
            return new UtModel(new JSONObject());
        }
        return new UtModel(jSONObject);
    }
}
