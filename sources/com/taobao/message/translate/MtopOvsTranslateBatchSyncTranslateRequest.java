package com.taobao.message.translate;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopOvsTranslateBatchSyncTranslateRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.ovs.translate.batchSyncTranslate";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String sourceTextFormatType = null;
    private String sourceTextList = null;
    private String targetLanguage = null;
    private String extraMap = null;
    private String appName = null;
    private String bizScene = null;
    private String bizEchoMap = null;
    private String glossaryIdList = null;
    private boolean mock = false;
    private String bizCustomId = null;
    private String sourceTextContentType = null;
    private String sourceLanguage = null;
    private String translateAbility = null;

    static {
        t2o.a(530579497);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBizCustomId() {
        return this.bizCustomId;
    }

    public String getBizEchoMap() {
        return this.bizEchoMap;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public String getExtraMap() {
        return this.extraMap;
    }

    public String getGlossaryIdList() {
        return this.glossaryIdList;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public String getSourceTextContentType() {
        return this.sourceTextContentType;
    }

    public String getSourceTextFormatType() {
        return this.sourceTextFormatType;
    }

    public String getSourceTextList() {
        return this.sourceTextList;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public String getTranslateAbility() {
        return this.translateAbility;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public boolean isMock() {
        return this.mock;
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

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setBizCustomId(String str) {
        this.bizCustomId = str;
    }

    public void setBizEchoMap(String str) {
        this.bizEchoMap = str;
    }

    public void setBizScene(String str) {
        this.bizScene = str;
    }

    public void setExtraMap(String str) {
        this.extraMap = str;
    }

    public void setGlossaryIdList(String str) {
        this.glossaryIdList = str;
    }

    public void setMock(boolean z) {
        this.mock = z;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setSourceLanguage(String str) {
        this.sourceLanguage = str;
    }

    public void setSourceTextContentType(String str) {
        this.sourceTextContentType = str;
    }

    public void setSourceTextFormatType(String str) {
        this.sourceTextFormatType = str;
    }

    public void setSourceTextList(String str) {
        this.sourceTextList = str;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }

    public void setTranslateAbility(String str) {
        this.translateAbility = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
