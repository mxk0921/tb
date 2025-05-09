package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ItemModel extends BaseItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587866);
    }

    public ItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(ItemModel itemModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/ItemModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return size();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel
    public SubItemModel getBaseItemModel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubItemModel) ipChange.ipc$dispatch("f8e7af58", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = getJSONObject(String.valueOf(i));
        if (jSONObject == null) {
            return null;
        }
        return new SubItemModel(jSONObject);
    }
}
