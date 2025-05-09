package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TemplateListRequest implements TemplateRequest {
    private String appVersion;
    private String API_NAME = "mtop.mediaplatform.live.videolist.template.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(310378627);
        t2o.a(806355409);
    }

    public TemplateListRequest(String str) {
        this.appVersion = TaoLiveHomePageX.getAppVersion(str);
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateRequest
    public String toString() {
        return this.API_NAME + this.VERSION + this.appVersion;
    }
}
