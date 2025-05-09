package com.taobao.live.home.dinamic;

import com.taobao.live.home.dinamic.business.TemplateRequest;
import tb.t2o;
import tb.zzg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TemplateListRequest implements TemplateRequest {
    private String API_NAME = "mtop.mediaplatform.live.videolist.template.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String appVersion = zzg.a();

    static {
        t2o.a(806355361);
        t2o.a(806355409);
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateRequest
    public String toString() {
        return this.API_NAME + this.VERSION + this.appVersion;
    }
}
