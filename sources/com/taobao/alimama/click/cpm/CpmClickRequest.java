package com.taobao.alimama.click.cpm;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpmClickRequest implements IMTOPDataObject {
    public String accept;
    public String clickid;
    public String cna;
    public String e;
    public String ext;
    public String referer;
    public String useragent;
    public String utdid;
    public String API_NAME = "mtop.ali.ad.settle.cpm.click";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(1017118744);
        t2o.a(589299906);
    }
}
