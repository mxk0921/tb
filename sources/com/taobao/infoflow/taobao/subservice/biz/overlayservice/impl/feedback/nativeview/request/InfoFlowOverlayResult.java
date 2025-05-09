package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InfoFlowOverlayResult implements IMTOPDataObject, Serializable {
    public SectionModel overlay;
    public JSONObject popData;
    public JSONObject recbotSection;

    static {
        t2o.a(491782495);
        t2o.a(589299906);
    }

    public SectionModel getOverlay() {
        if (this.overlay.containsKey("recbotSection")) {
            return this.overlay;
        }
        this.overlay.put("recbotSection", (Object) this.recbotSection);
        return this.overlay;
    }

    public boolean isValid() {
        SectionModel sectionModel = this.overlay;
        if (sectionModel == null || sectionModel.isEmpty()) {
            return false;
        }
        return true;
    }
}
