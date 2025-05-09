package com.taobao.tao.recommend2;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.tao.favorite.FavoriteConstants;
import tb.dbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum RecommendChannelType {
    HOMEPAGE_R4U("homePage", "首页", false, false, "Page_Home", "recommend_home_main", "tb_recmd_homePage"),
    HTAO_R4U("hTaoHomePage", "海淘首页", false, false, "Page_Home_H", "recommend_home_intl"),
    COUNTRYSIDE_TAO_R4U("cunHomePage", "村淘首页", false, false, "Page_Home_C", "recommend_home_cun"),
    OLD_TAO_R4U("oldHomePage", "亲情版首页", false, false, "Page_Home_O", "recommend_home_old"),
    SHOPPING_CART("TRADE_CART", "购物车", true, true, AddBagRequester.sUTPageShoppingCart, "recommend_cart_main", "tb_recmd_CART"),
    SHOPPING_CART_NEW("CART", "购物车", true, true, AddBagRequester.sUTPageShoppingCart, "recommend_cart_main", "tb_recmd_CART"),
    SHOPPING_DIRECT_SALE_CART("CART", "购物车", true, true, AddBagRequester.sUTPageShoppingCart, "recommend_intlcart_main", "tb_recmd_CART"),
    REC_ONLINE_MC_CAR("MAO_CHAO", "猫超购物车", true, true, "Page_ShoppingCartMC", "recommend_tmallcart_main", "tb_recmd_MAO_CHAO"),
    ORDER_LIST("ORDER_DETAIL", "订单列表", true, true, dbv.BIZ_ORDER_LIST, "recommend_orderlist_main", "tb_recmd_ORDER_LIST"),
    ORDER_SEARCH_RESULTS("ORDER_DETAIL", "订单搜索结果", true, true, dbv.BIZ_ORDER_LIST, "recommend_orderlist_main", "tb_recmd_ORDER_LIST"),
    ORDER_LIST_CATAPULT("ORDER_DETAIL_CATAPULT", "订单列表", true, true, dbv.BIZ_ORDER_LIST, "recommend_orderlist_catapult_main", "tb_recmd_ORDER_DETAIL_CATAPULT"),
    ORDER_DETAIL("ORDER_DETAIL", "订单详情", true, true, dbv.BIZ_ORDER_DETAIL, "recommend_orderdetail_main", "tb_recmd_ORDER_DETAIL"),
    FAVORITE("COLLECTION", "收藏夹", true, true, FavoriteConstants.UT_FAV_PAGE_NAME, "recommend_collection_main", "tb_recmd_COLLECTION"),
    LOGISTICS("WULIU", "物流详情", true, true, "Page_LogisticDetail", "recommend_logistics_main", "tb_recmd_WULIU"),
    PAY_SUCCESS("PAYSUCCESS", "支付成功", true, true, dbv.BIZ_PAY_SUCCESS, "recommend_pay_success", "tb_recmd_PAYSUCCESS"),
    CONFIRM_RECEIPT("CONFIRMRECEIPT", "确认收货", true, true, "Page_ConfirmReceipt", "recommend_confirm_receipt", "tb_recmd_CONFIRM_RECEIPT"),
    DEFAULT("homePage", "默认", false, false, "Unknown_page", "recommend_home_main", "tb_recmd_homePage");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String adNamespace;
    public final String awesomeChannel;
    private final String description;
    private final boolean isAfterPurchaseChannel;
    private final boolean isAutoTrack;
    public final String pageName;
    private final String requestStr;

    RecommendChannelType(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this.adNamespace = "tb_recmd_homePage";
        this.requestStr = str;
        this.description = str2;
        this.isAfterPurchaseChannel = z;
        this.isAutoTrack = z2;
        this.pageName = str3;
        this.awesomeChannel = str4;
    }

    public static RecommendChannelType getChannelType(String str) {
        RecommendChannelType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendChannelType) ipChange.ipc$dispatch("69425033", new Object[]{str});
        }
        for (RecommendChannelType recommendChannelType : values()) {
            if (TextUtils.equals(str, recommendChannelType.awesomeChannel)) {
                return recommendChannelType;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(RecommendChannelType recommendChannelType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend2/RecommendChannelType");
    }

    public static RecommendChannelType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendChannelType) ipChange.ipc$dispatch("bedbab52", new Object[]{str});
        }
        return (RecommendChannelType) Enum.valueOf(RecommendChannelType.class, str);
    }

    public String getRequestStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f9000e1", new Object[]{this});
        }
        return this.requestStr;
    }

    public boolean isAfterPurchase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bd7cfe", new Object[]{this})).booleanValue();
        }
        return this.isAfterPurchaseChannel;
    }

    public boolean isAutoTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6e665d", new Object[]{this})).booleanValue();
        }
        return this.isAutoTrack;
    }

    public boolean isUsingHomepageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e716a458", new Object[]{this})).booleanValue();
        }
        if (!isAfterPurchase() || this == ORDER_LIST || this == ORDER_SEARCH_RESULTS || this == ORDER_DETAIL || this == FAVORITE || this == LOGISTICS) {
            return true;
        }
        return false;
    }

    RecommendChannelType(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        this.requestStr = str;
        this.description = str2;
        this.isAfterPurchaseChannel = z;
        this.isAutoTrack = z2;
        this.pageName = str3;
        this.awesomeChannel = str4;
        this.adNamespace = str5;
    }
}
