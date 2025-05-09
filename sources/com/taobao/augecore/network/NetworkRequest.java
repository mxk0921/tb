package com.taobao.augecore.network;

import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NetworkRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.crowd.neo.findAllMobilizeCrowd";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String params = null;
    private String token = null;

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getParams() {
        return this.params;
    }

    public String getToken() {
        return this.token;
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

    public void setParams(String str) {
        this.params = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
