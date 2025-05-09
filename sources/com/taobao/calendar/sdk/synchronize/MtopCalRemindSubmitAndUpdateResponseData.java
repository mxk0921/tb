package com.taobao.calendar.sdk.synchronize;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopCalRemindSubmitAndUpdateResponseData implements IMTOPDataObject, Serializable {
    private Long lut;
    private boolean needUpdate;
    private List<ScheduleModel> updateData;

    static {
        t2o.a(414187593);
        t2o.a(589299906);
    }

    public Long getLut() {
        return this.lut;
    }

    public List<ScheduleModel> getUpdateData() {
        return this.updateData;
    }

    public boolean isNeedUpdate() {
        return this.needUpdate;
    }

    public void setLut(Long l) {
        this.lut = l;
    }

    public void setNeedUpdate(boolean z) {
        this.needUpdate = z;
    }

    public void setUpdateData(List<ScheduleModel> list) {
        this.updateData = list;
    }
}
