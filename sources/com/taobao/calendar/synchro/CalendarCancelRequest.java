package com.taobao.calendar.synchro;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarCancelRequest implements IMTOPDataObject {
    public String bizId;
    public String outIds;
    public String API_NAME = "mtop.taobao.cal.event.cancel";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(693108783);
        t2o.a(589299906);
    }
}
