package com.taobao.ugc.fragment.request;

import com.alibaba.fastjson.JSONObject;
import com.ut.share.utils.Constants;
import kotlin.Metadata;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ckf;
import tb.eel;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/taobao/ugc/fragment/request/OrderRateInfoData;", "Lmtopsdk/mtop/domain/IMTOPDataObject;", "()V", "directRender", "", "getDirectRender", "()Ljava/lang/String;", "setDirectRender", "(Ljava/lang/String;)V", "isTmall", "", "()Z", eel.ORDER_TYPE, "getOrderType", "setOrderType", Constants.WEIBO_REDIRECTURL_KEY, "getRedirectUrl", "setRedirectUrl", "sellerId", "getSellerId", "setSellerId", "ultronPageOutput", "Lcom/alibaba/fastjson/JSONObject;", "getUltronPageOutput", "()Lcom/alibaba/fastjson/JSONObject;", "setUltronPageOutput", "(Lcom/alibaba/fastjson/JSONObject;)V", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OrderRateInfoData implements IMTOPDataObject {
    private String directRender;
    private String orderType;
    private String redirectUrl;
    private String sellerId;
    private JSONObject ultronPageOutput;

    static {
        t2o.a(758120554);
        t2o.a(589299906);
    }

    public final String getDirectRender() {
        return this.directRender;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final JSONObject getUltronPageOutput() {
        return this.ultronPageOutput;
    }

    public final boolean isTmall() {
        return ckf.b("2", this.orderType);
    }

    public final void setDirectRender(String str) {
        this.directRender = str;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public final void setSellerId(String str) {
        this.sellerId = str;
    }

    public final void setUltronPageOutput(JSONObject jSONObject) {
        this.ultronPageOutput = jSONObject;
    }
}
