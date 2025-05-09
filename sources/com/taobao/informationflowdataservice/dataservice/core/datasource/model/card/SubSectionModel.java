package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SubSectionModel extends BaseSubSectionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SectionModel mGuide;
    private SectionModel mOverlay;
    private BaseSectionModel mWindVaneOverlay;

    static {
        t2o.a(487587873);
    }

    public SubSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(SubSectionModel subSectionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/SubSectionModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public BaseSectionModel getGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("48be6ef1", new Object[]{this});
        }
        if (this.mGuide == null) {
            this.mGuide = new SectionModel(getJSONObject("guide"));
        }
        return this.mGuide;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public BaseSectionModel getWindvaneOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("6f1b57e7", new Object[]{this});
        }
        return this.mWindVaneOverlay;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public void setWindVaneOverlay(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ed74b3", new Object[]{this, baseSectionModel});
        } else {
            this.mWindVaneOverlay = baseSectionModel;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public SectionModel getOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("d09a4d7e", new Object[]{this});
        }
        if (this.mOverlay == null) {
            this.mOverlay = new SectionModel(getJSONObject("overlay"));
        }
        return this.mOverlay;
    }
}
