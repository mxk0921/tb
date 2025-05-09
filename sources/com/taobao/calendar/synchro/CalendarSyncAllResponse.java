package com.taobao.calendar.synchro;

import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarSyncAllResponse extends BaseOutDo implements Serializable {
    private ResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ResponseData {
        public List<ScheduleDTOModule> result;

        static {
            t2o.a(693108786);
        }
    }

    static {
        t2o.a(693108785);
    }

    public void setData(ResponseData responseData) {
        this.data = responseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ResponseData getData() {
        return this.data;
    }
}
