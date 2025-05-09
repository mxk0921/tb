package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTaobaoSocialFollowGuangAddRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.social.follow.guang.add";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String targetUserIdStr = null;
    private String originBiz = null;
    private String keyName = null;
    private String originFlag = null;
    private String originPage = null;

    static {
        t2o.a(779093633);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public String getOriginBiz() {
        return this.originBiz;
    }

    public String getOriginFlag() {
        return this.originFlag;
    }

    public String getOriginPage() {
        return this.originPage;
    }

    public String getTargetUserIdStr() {
        return this.targetUserIdStr;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setKeyName(String str) {
        this.keyName = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setOriginBiz(String str) {
        this.originBiz = str;
    }

    public void setOriginFlag(String str) {
        this.originFlag = str;
    }

    public void setOriginPage(String str) {
        this.originPage = str;
    }

    public void setTargetUserIdStr(String str) {
        this.targetUserIdStr = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
