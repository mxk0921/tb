package com.taobao.calendar.synchro;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarAddOrCancelResponse extends BaseOutDo implements Serializable {
    private CalendarResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class CalendarResponseData {
        public String result;

        static {
            t2o.a(693108781);
        }
    }

    static {
        t2o.a(693108780);
    }

    public void setData(CalendarResponseData calendarResponseData) {
        this.data = calendarResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public CalendarResponseData getData() {
        return this.data;
    }
}
