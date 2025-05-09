package com.taobao.android.litecreator.modules.template;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserAvatarRequestParams implements IMTOPDataObject {
    private String VERSION = "1.0";
    private boolean NEED_SESSION = true;
    private String API_NAME = "mtop.media.guang.activity.userinfo";

    static {
        t2o.a(511705300);
        t2o.a(589299906);
    }

    public String getAPI() {
        return this.API_NAME;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
