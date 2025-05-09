package com.taobao.share.copy.process;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class StorebackFlowData$StoreRedirectUrlRequest implements IMTOPDataObject {
    public List<String> redirectUrlList;
    public String targetUrl;
    public final String API_NAME = "mtop.taobao.sharepassword.storeRedirectUrl";
    public final String VERSION = "1.0";
    public final boolean NEED_ECODE = false;
    public final boolean NEED_SESSION = true;

    static {
        t2o.a(664797213);
        t2o.a(589299906);
    }
}
