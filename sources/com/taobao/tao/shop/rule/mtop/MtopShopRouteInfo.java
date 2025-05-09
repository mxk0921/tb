package com.taobao.tao.shop.rule.mtop;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopShopRouteInfo implements IMTOPDataObject, Serializable {
    private static final String RENDER_STYLE_DX = "DX";
    private static final String RENDER_STYLE_MINIAPP = "MINIAPP_STYLE";
    private static final String RENDER_STYLE_NATIVE = "NATIVE_STYLE";
    private static final String RENDER_STYLE_WEEX = "WEEX_STYLE";
    private String industryShop;
    private String isTmall;
    private String renderStyle;
    private JSONObject routeConfig;
    private String sellerId;
    private String shopId;
    private String shopTargetUrl;
    private JSONArray templateLists;

    static {
        t2o.a(668991564);
        t2o.a(589299906);
    }

    public String getIndustryShop() {
        return this.industryShop;
    }

    public String getIsTmall() {
        return this.isTmall;
    }

    public String getRenderStyle() {
        return this.renderStyle;
    }

    public JSONObject getRouteConfig() {
        return this.routeConfig;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public String getShopTargetUrl() {
        return this.shopTargetUrl;
    }

    public JSONArray getTemplateLists() {
        return this.templateLists;
    }

    public boolean isDXRenderStyle() {
        return RENDER_STYLE_DX.equals(this.renderStyle);
    }

    public boolean isMiniAppRenderStyle() {
        String str = this.shopTargetUrl;
        return RENDER_STYLE_MINIAPP.equals(this.renderStyle) || (str != null ? str.contains("_ariver_appid") : false);
    }

    public boolean isNativeRenderStyle() {
        return RENDER_STYLE_NATIVE.equals(this.renderStyle);
    }

    public boolean isWeexRenderStyle() {
        return RENDER_STYLE_WEEX.equals(this.renderStyle);
    }

    public void setIndustryShop(String str) {
        this.industryShop = str;
    }

    public void setIsTmall(String str) {
        this.isTmall = str;
    }

    public void setRenderStyle(String str) {
        this.renderStyle = str;
    }

    public void setRouteConfig(JSONObject jSONObject) {
        this.routeConfig = jSONObject;
    }

    public void setSellerId(String str) {
        this.sellerId = str;
    }

    public void setShopId(String str) {
        this.shopId = str;
    }

    public void setShopTargetUrl(String str) {
        this.shopTargetUrl = str;
    }

    public void setTemplateLists(JSONArray jSONArray) {
        this.templateLists = jSONArray;
    }

    public static boolean isMiniAppRenderStyle(String str) {
        return RENDER_STYLE_MINIAPP.equals(str);
    }
}
