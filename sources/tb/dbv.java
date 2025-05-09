package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dbv {
    public static final String BIZ_ASK_LIST = "askList";
    public static final String BIZ_CART_POP = "cartPop";
    public static final String BIZ_CONFIRM_GOOD = "confirmGood";
    public static final String BIZ_LIGHT_BUY = "Page_LightBuy";
    public static final String BIZ_LOGISTICS = "Page_Logistics";
    public static final String BIZ_ORDER_DETAIL = "Page_OrderDetail";
    public static final String BIZ_ORDER_LIST = "Page_OrderList";
    public static final String BIZ_PAY_SUCCESS = "Page_PaySuccess";
    public static final String BIZ_RATE_HOME = "rateHome";
    public static final String BIZ_RATE_LIST = "rateList";
    public static final String BIZ_REFUND_DETAIL = "Page_RefundDetail";
    public static final String BIZ_REFUND_LIST = "Page_RefundList";
    public static final String PRE_RENDER_URL_ASK_LIST;
    public static final String PRE_RENDER_URL_CONFIRM_GOOD;
    public static final String PRE_RENDER_URL_LIGHT_BUY = "https://meta.m.taobao.com/app/tb-trade/light-buy/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&preload=true";
    public static final String PRE_RENDER_URL_LOGISTICS;
    public static final String PRE_RENDER_URL_ORDER_DETAIL;
    public static final String PRE_RENDER_URL_PAY_SUCCESS;
    public static final String PRE_RENDER_URL_RATE_HOME;
    public static final String PRE_RENDER_URL_RATE_LIST;
    public static final String PRE_RENDER_URL_REFUND_DETAIL_POP;
    public static final String PRE_RENDER_URL_REFUND_LIST;
    public static final String PRE_RENDER_URL_REFUND_LOGISTICS;
    public static final String QUERY_ASYNC_CREATE_INSTANCE = "asyncCreateInstance";
    public static final String TMS_PRE_RENDER_URL_REFUND_DETAIL;
    public static final String TMS_PRE_RENDER_URL_REFUND_DETAIL_ASERVER;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        t2o.a(157286935);
        if (EnvironmentSwitcher.a() == 0) {
            str = "https://meta.m.taobao.com/app/tb-trade/odetail/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&disableNav=YES&status_bar_transparent=true&preload=true&openFrom=tradereceipt&wx_use_layoutng=true&wx_auto_back=true&tradeHybrid=true";
        } else {
            str = "https://meta.wapa.taobao.com/app/tb-trade/odetail/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&disableNav=YES&status_bar_transparent=true&preload=true&openFrom=tradereceipt&wx_use_layoutng=true&wx_auto_back=true&tradeHybrid=true";
        }
        PRE_RENDER_URL_ORDER_DETAIL = str;
        if (EnvironmentSwitcher.a() == 0) {
            str2 = "https://meta.m.taobao.com/app/mtb/pay-success-v3/simple-pay-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&degrade=0&asyncSceneSimplePage=sceneGo&preload=true&hitPreRenderOpt=true";
        } else {
            str2 = "https://meta.wapa.taobao.com/app/mtb/pay-success-v3/simple-pay-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&degrade=0&asyncSceneSimplePage=sceneGo&preload=true&hitPreRenderOpt=true";
        }
        PRE_RENDER_URL_PAY_SUCCESS = str2;
        if (EnvironmentSwitcher.a() == 0) {
            str3 = "https://meta.m.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom&isFromWoTaoRefund=true&preload=true&wx_opaque=0";
        } else {
            str3 = "https://meta.wapa.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom&isFromWoTaoRefund=true&preload=true&wx_opaque=0";
        }
        PRE_RENDER_URL_REFUND_LIST = str3;
        if (EnvironmentSwitcher.a() == 0) {
            str4 = "https://meta.m.taobao.com/app/mtb/pay-success-v2/confirm-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&status_bar_transparent=true&tradeHybrid=true&preload=true";
        } else {
            str4 = "https://meta.wapa.taobao.com/app/mtb/pay-success-v2/confirm-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&status_bar_transparent=true&tradeHybrid=true&preload=true";
        }
        PRE_RENDER_URL_CONFIRM_GOOD = str4;
        if (EnvironmentSwitcher.a() == 0) {
            str5 = "https://meta.m.taobao.com/app/mtb/logisticsV2/detail?wh_weex=true&renderMode=texture&tradeHybrid=true&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&viewLogisticDetail=true&preload=true";
        } else {
            str5 = "https://meta.wapa.taobao.com/app/mtb/logisticsV2/detail?wh_weex=true&renderMode=texture&tradeHybrid=true&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&viewLogisticDetail=true&preload=true";
        }
        PRE_RENDER_URL_LOGISTICS = str5;
        if (EnvironmentSwitcher.a() == 0) {
            str6 = "https://meta.m.taobao.com/app/mtb/logistics-detail/home?wh_weex=true&renderMode=texture&tradeHybrid=true&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true";
        } else {
            str6 = "https://meta.wapa.taobao.com/app/mtb/logistics-detail/home?wh_weex=true&renderMode=texture&tradeHybrid=true&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true";
        }
        PRE_RENDER_URL_REFUND_LOGISTICS = str6;
        if (EnvironmentSwitcher.a() == 0) {
            str7 = "https://am.m.taobao.com/wow/z/app/mtb/refund-project/detail?isPrerender=true&disputeId=isPrerender&x-ssr=true&disableProgress=true&x-preload=true&fcc_match_query=disputeId&disableNav=YES&forceThemis=true";
        } else {
            str7 = "https://pre-wh-ssr-base-trade1.taobao.com/wow/z/app/mtb/refund-project/detail?isPrerender=true&disputeId=isPrerender&x-ssr=true&disableProgress=true&x-preload=true&fcc_match_query=disputeId&disableNav=YES&forceThemis=true";
        }
        TMS_PRE_RENDER_URL_REFUND_DETAIL = str7;
        if (EnvironmentSwitcher.a() == 0) {
            str8 = "https://am.m.taobao.com/wow/z/app/mtb/refund-project/detail";
        } else {
            str8 = "https://pre-wh-ssr-base-trade1.taobao.com/wow/z/app/mtb/refund-project/detail";
        }
        TMS_PRE_RENDER_URL_REFUND_DETAIL_ASERVER = str8;
        if (EnvironmentSwitcher.a() == 0) {
            str9 = "https://meta.m.taobao.com/app/taobao-ugc-community/rate-list/?wh_weex=true&weex_mode=dom&preload=true";
        } else {
            str9 = "https://meta.wapa.taobao.com/app/taobao-ugc-community/rate-list/?wh_weex=true&weex_mode=dom&preload=true";
        }
        PRE_RENDER_URL_RATE_LIST = str9;
        if (EnvironmentSwitcher.a() == 0) {
            str10 = "https://meta.m.taobao.com/app/mtb/taobao-ugc/ask/list?wh_weex=true&weex_mode=dom&preload=true";
        } else {
            str10 = "https://meta.wapa.taobao.com/app/mtb/taobao-ugc/ask/list?wh_weex=true&weex_mode=dom&preload=true";
        }
        PRE_RENDER_URL_ASK_LIST = str10;
        if (EnvironmentSwitcher.a() == 0) {
            str11 = "https://meta.m.taobao.com/app/mtb/taobao-ugc/rate/home?wh_weex=true&weex_mode=dom&preload=true";
        } else {
            str11 = "https://meta.wapa.taobao.com/app/mtb/taobao-ugc/rate/home?wh_weex=true&weex_mode=dom&preload=true";
        }
        PRE_RENDER_URL_RATE_HOME = str11;
        if (EnvironmentSwitcher.a() == 0) {
            str12 = "https://meta.m.taobao.com/app/mtb/refund4-weex-project/zeroDispute?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
        } else {
            str12 = "https://meta.wapa.taobao.com/app/mtb/refund4-weex-project/zeroDispute?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
        }
        PRE_RENDER_URL_REFUND_DETAIL_POP = str12;
    }
}
