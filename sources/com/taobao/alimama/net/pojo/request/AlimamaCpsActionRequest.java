package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaCpsActionRequest implements IMTOPDataObject {
    public String actionObjectId;
    public String actionObjectType;
    public String extraParams;
    public String initiativeActionType;
    public String API_NAME = "mtop.alimama.cps.initiativeaction.save";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(1018167347);
        t2o.a(589299906);
    }
}
