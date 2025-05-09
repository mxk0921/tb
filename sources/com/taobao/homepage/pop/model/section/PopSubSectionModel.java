package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSubSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopSubSectionModel extends BasePopSubSectionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PopSectionModel mGuide;
    private PopSectionModel mOverlay;

    public PopSubSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(PopSubSectionModel popSubSectionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/model/section/PopSubSectionModel");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubSectionModel
    public BasePopSectionModel getGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopSectionModel) ipChange.ipc$dispatch("e6f254f", new Object[]{this});
        }
        if (this.mGuide == null) {
            this.mGuide = new PopSectionModel(getJSONObject("guide"));
        }
        return this.mGuide;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubSectionModel
    public PopSectionModel getOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSectionModel) ipChange.ipc$dispatch("ba921659", new Object[]{this});
        }
        if (this.mOverlay == null) {
            this.mOverlay = new PopSectionModel(getJSONObject("overlay"));
        }
        return this.mOverlay;
    }
}
