package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel;
import tb.vaj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopSubItemModel extends BasePopSubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopSubItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopSubItemModel popSubItemModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopSubItemModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public JSONObject getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14011e6a", new Object[]{this});
        }
        return getJSONObject("content");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return getJSONObject("ext");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public String getItemBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb53d582", new Object[]{this});
        }
        return getString("itemBizCode");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public JSONObject getSmartContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a653bd8d", new Object[]{this});
        }
        return getJSONObject(vaj.KEY_SMART_CONTENT);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public String getTargetUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return getString("targetUrl");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public PopUtModel getClickParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopUtModel) ipChange.ipc$dispatch("ed9f726e", new Object[]{this}) : new PopUtModel(getJSONObject("clickParam"));
    }
}
