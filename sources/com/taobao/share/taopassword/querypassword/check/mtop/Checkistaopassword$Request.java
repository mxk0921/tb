package com.taobao.share.taopassword.querypassword.check.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class Checkistaopassword$Request implements IMTOPDataObject {
    public boolean openHash;
    public String passwordContent;
    public String passwordKeyList;
    public final String API_NAME = "mtop.taobao.sharepassword.checkistaopasswordHash";
    public final String VERSION = "1.0";
    public final boolean NEED_ECODE = false;
    public final boolean NEED_SESSION = true;

    static {
        t2o.a(665845935);
        t2o.a(589299906);
    }
}
