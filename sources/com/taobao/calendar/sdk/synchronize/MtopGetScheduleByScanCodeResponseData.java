package com.taobao.calendar.sdk.synchronize;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopGetScheduleByScanCodeResponseData implements IMTOPDataObject, Serializable {
    private List<ScheduleModel> resultData;

    static {
        t2o.a(414187599);
        t2o.a(589299906);
    }

    public List<ScheduleModel> getResultData() {
        return this.resultData;
    }

    public void setResultData(List<ScheduleModel> list) {
        this.resultData = list;
    }
}
