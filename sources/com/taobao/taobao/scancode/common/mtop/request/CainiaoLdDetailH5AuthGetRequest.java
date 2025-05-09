package com.taobao.taobao.scancode.common.mtop.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CainiaoLdDetailH5AuthGetRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.cainiao.ld.detail.h5.auth.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String mailNo = null;
    private String receiverAddress = null;
    private String senderAddress = null;
    private String receiverMobile = null;
    private String extParams = null;
    private String resCode = null;
    private String senderMobile = null;
    private String appKey = null;
    private String tradeId = null;

    static {
        t2o.a(760217645);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getExtParams() {
        return this.extParams;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public String getResCode() {
        return this.resCode;
    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public String getSenderMobile() {
        return this.senderMobile;
    }

    public String getTradeId() {
        return this.tradeId;
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

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setExtParams(String str) {
        this.extParams = str;
    }

    public void setMailNo(String str) {
        this.mailNo = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setReceiverAddress(String str) {
        this.receiverAddress = str;
    }

    public void setReceiverMobile(String str) {
        this.receiverMobile = str;
    }

    public void setResCode(String str) {
        this.resCode = str;
    }

    public void setSenderAddress(String str) {
        this.senderAddress = str;
    }

    public void setSenderMobile(String str) {
        this.senderMobile = str;
    }

    public void setTradeId(String str) {
        this.tradeId = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
