package com.taobao.detail.rate.mtop;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateTranslateRequest implements IMTOPDataObject {
    public String bizScene;
    public boolean parallel;
    public String sourceLanguage;
    public String sourceTextContentType;
    public String sourceTextFormatType;
    public List<String> sourceTextList;
    public String targetLanguage;
    public String API_NAME = "mtop.ovs.translate.batchSyncTranslate";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    public String getAPI_NAME() {
        return this.API_NAME;
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

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
