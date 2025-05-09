package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopAmpAmpserviceGetbatchampuserinfoforimRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.amp.ampservice.getbatchampuserinfoforim";
    private String VERSION = "4.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long role = 0;
    private String targetUserIdMapJson = null;
    private long channel = 0;
    private String targetUserNickMapJson = null;

    static {
        t2o.a(552599682);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public long getChannel() {
        return this.channel;
    }

    public long getRole() {
        return this.role;
    }

    public String getTargetUserIdMapJson() {
        return this.targetUserIdMapJson;
    }

    public String getTargetUserNickMapJson() {
        return this.targetUserNickMapJson;
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

    public void setChannel(long j) {
        this.channel = j;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setRole(long j) {
        this.role = j;
    }

    public void setTargetUserIdMapJson(String str) {
        this.targetUserIdMapJson = str;
    }

    public void setTargetUserNickMapJson(String str) {
        this.targetUserNickMapJson = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
