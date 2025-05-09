package com.taobao.wireless.trade.mcart.sdk.co.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTradeAddBagRequest implements IMTOPDataObject {
    protected String cartFrom;
    private String exParams;
    private String feature;
    private String itemId;
    private long quantity;
    private String skuId;
    private String API_NAME = "mtop.trade.addBag";
    private String VERSION = "3.1";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(697303059);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getCartFrom() {
        return this.cartFrom;
    }

    public String getExParams() {
        return this.exParams;
    }

    public String getFeature() {
        return this.feature;
    }

    public String getItemId() {
        return this.itemId;
    }

    public long getQuantity() {
        return this.quantity;
    }

    public String getSkuId() {
        return this.skuId;
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

    public void setCartFrom(String str) {
        this.cartFrom = str;
    }

    public void setExParams(String str) {
        this.exParams = str;
    }

    public void setFeature(String str) {
        this.feature = str;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setQuantity(long j) {
        this.quantity = j;
    }

    public void setSkuId(String str) {
        this.skuId = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public String toString() {
        return "MtopTradeAddBagRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', NEED_ECODE=" + this.NEED_ECODE + ", NEED_SESSION=" + this.NEED_SESSION + ", feature='" + this.feature + "', itemId='" + this.itemId + "', skuId='" + this.skuId + "', quantity=" + this.quantity + ", exParams='" + this.exParams + "', cartFrom='" + this.cartFrom + "'}";
    }
}
