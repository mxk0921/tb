package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopItemModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopItemModel extends BasePopItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopItemModel popItemModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopItemModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopItemModel
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return size();
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopItemModel
    public PopSubItemModel getBaseItemModel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSubItemModel) ipChange.ipc$dispatch("f37c6e33", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = getJSONObject(String.valueOf(i));
        if (jSONObject == null) {
            return null;
        }
        return new PopSubItemModel(jSONObject);
    }
}
