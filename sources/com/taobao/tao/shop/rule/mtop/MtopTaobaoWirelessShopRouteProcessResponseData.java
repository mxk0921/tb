package com.taobao.tao.shop.rule.mtop;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessResponseData implements IMTOPDataObject, Serializable {
    private static final String RENDER_STYLE_DX = "DX";
    private static final String RENDER_STYLE_MINIAPP = "MINIAPP_STYLE";
    private static final String RENDER_STYLE_NATIVE = "NATIVE_STYLE";
    private static final String RENDER_STYLE_WEEX = "WEEX_STYLE";
    private String isTmall;
    private String renderStyle;
    private String sellerId;
    private String shopId;
    private MtopShopRouteInfo shopRouteInfo;
    private JSONObject shopStructure;
    private String shopTargetUrl;

    static {
        t2o.a(668991571);
        t2o.a(589299906);
    }

    public String getIsTmall() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.isTmall != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return this.isTmall;
        }
        return shopRouteInfo.getIsTmall();
    }

    public String getRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return this.renderStyle;
        }
        return shopRouteInfo.getRenderStyle();
    }

    public String getSellerId() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.sellerId != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return this.sellerId;
        }
        return shopRouteInfo.getSellerId();
    }

    public String getShopId() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.shopId != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return this.shopId;
        }
        return shopRouteInfo.getShopId();
    }

    public MtopShopRouteInfo getShopRouteInfo() {
        return this.shopRouteInfo;
    }

    public JSONObject getShopStructure() {
        return this.shopStructure;
    }

    public String getShopTargetUrl() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.shopTargetUrl != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return this.shopTargetUrl;
        }
        return shopRouteInfo.getShopTargetUrl();
    }

    public boolean isDXRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return RENDER_STYLE_DX.equals(this.renderStyle);
        }
        return shopRouteInfo.isDXRenderStyle();
    }

    public boolean isMiniAppRenderStyle() {
        boolean z;
        String shopTargetUrl;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        String str = this.shopTargetUrl;
        if (str != null) {
            z = str.contains("_ariver_appid");
        } else {
            z = (shopRouteInfo == null || (shopTargetUrl = shopRouteInfo.getShopTargetUrl()) == null) ? false : shopTargetUrl.contains("_ariver_appid");
        }
        String str2 = this.renderStyle;
        return (str2 != null || shopRouteInfo == null) ? RENDER_STYLE_MINIAPP.equals(str2) || z : RENDER_STYLE_MINIAPP.equals(shopRouteInfo.getRenderStyle()) || z;
    }

    public boolean isNativeRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return RENDER_STYLE_NATIVE.equals(this.renderStyle);
        }
        return RENDER_STYLE_NATIVE.equals(shopRouteInfo.getRenderStyle());
    }

    public boolean isWeexRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle != null || (shopRouteInfo = getShopRouteInfo()) == null) {
            return RENDER_STYLE_WEEX.equals(this.renderStyle);
        }
        return RENDER_STYLE_WEEX.equals(shopRouteInfo.getRenderStyle());
    }

    public void setIsTmall(String str) {
        this.isTmall = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setIsTmall(str);
        }
    }

    public void setRenderStyle(String str) {
        this.renderStyle = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setRenderStyle(str);
        }
    }

    public void setSellerId(String str) {
        this.sellerId = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setSellerId(str);
        }
    }

    public void setShopId(String str) {
        this.shopId = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setShopId(str);
        }
    }

    public void setShopRouteInfo(MtopShopRouteInfo mtopShopRouteInfo) {
        this.shopRouteInfo = mtopShopRouteInfo;
    }

    public void setShopStructure(JSONObject jSONObject) {
        this.shopStructure = jSONObject;
    }

    public void setShopTargetUrl(String str) {
        this.shopTargetUrl = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setShopTargetUrl(str);
        }
    }

    public static boolean isDXRenderStyle(String str) {
        return RENDER_STYLE_DX.equals(str);
    }

    public static boolean isMiniAppRenderStyle(String str) {
        return RENDER_STYLE_MINIAPP.equals(str);
    }
}
