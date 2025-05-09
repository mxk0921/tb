package com.taobao.alimama.click.cpc;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpcClickRequest implements IMTOPDataObject {
    public String accept;
    public String clickid;
    public String cna;
    public String e;
    public String ext;
    public String host;
    public String referer;
    public String utdid;
    public String utkey;
    public String utsid;
    public String API_NAME = "mtop.ali.ad.settle.cpc.click";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(1017118736);
        t2o.a(589299906);
    }
}
