package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopUtModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopUtModel extends BasePopUtModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopUtModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopUtModel popUtModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopUtModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
        }
        return getString("arg1");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return getJSONObject("args");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this});
        }
        return getString("eventId");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return getString("itemId");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return getString("page");
    }
}
