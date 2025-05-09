package com.taobao.taobao.scancode.barcode.object.recommend;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetMedicineUrlRequest implements IMTOPDataObject {
    public String code;
    public String API_NAME = "mtop.alijk.code.search.getshowurl";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(760217620);
        t2o.a(589299906);
    }
}
