package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.android.order.constants.OrderBizCode;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xn4 implements arb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31484a;
    public final String b;
    public final String c;
    public static final HashMap<String, xn4> d = new HashMap<>();
    public static final xn4 REC_DETAIL = new xn4("recommend_itemdetail_main", "itemdetail", "Page_Detail");
    public static final xn4 REC_DETAIL_EXPIRE = new xn4("recommend_itemdetail_main", "itemdetail", "Page_Detail");
    public static final xn4 REC_FAVORITE = new xn4("recommend_collection_main", "favorite", "Page_Collection");
    public static final xn4 REC_CART = new xn4("recommend_cart_main", "cart", AddBagRequester.sUTPageShoppingCart);
    public static final xn4 REC_MC_CART = new xn4("recommend_tmallcart_main", "tmallcart", "Page_TmMarket");
    public static final xn4 REC_ORDER_LIST = new xn4("recommend_orderlist_main", OrderBizCode.orderList, dbv.BIZ_ORDER_LIST);
    public static final xn4 REC_ORDER_LIST_CATAPULT = new xn4("recommend_orderlist_catapult_main", "orderlist_catapult", dbv.BIZ_ORDER_LIST);
    public static final xn4 REC_ORDER_SEARCH_RESULTS = new xn4("recommend_orderlist_main", "orderlist_search", dbv.BIZ_ORDER_LIST);
    public static final xn4 REC_ORDER_DETAIL = new xn4("recommend_orderdetail_main", OrderBizCode.orderDetail, dbv.BIZ_ORDER_DETAIL);
    public static final xn4 REC_MY_TAO = new xn4("recommend_my_taobao", "mytao", "Page_MyTao");
    public static final xn4 REC_DAILY_OUTFIT = new xn4("recommend_daily_outfit", "daily_outfit", "Page_DailyOutfit");
    public static final xn4 REC_OUTFIT_TREND = new xn4("recommend_outfit_trend_outbound", "daily_trend", "Page_DailyTrend");
    public static final xn4 REC_LOGISTICS = new xn4("recommend_logistics_main", "logistics", "Page_Logistic");
    public static final xn4 REC_DIRECT_SALE_CART = new xn4("recommend_intlcart_main", "directcart", AddBagRequester.sUTPageShoppingCart);
    public static final xn4 REC_PAY_SUCCESS = new xn4("recommend_pay_success", ae2.BizKeyPaysuccess, dbv.BIZ_PAY_SUCCESS);
    public static final xn4 REC_CONFIRM_RECEIPT = new xn4("recommend_confirm_receipt", "confirmreceipt", "Page_ConfirmReceipt");
    public static final xn4 NEW_FACE_PARENT = new xn4(i2b.HOMEPAGE_NEWFACE, i2b.HOMEPAGE_NEWFACE, "Page_Home");
    public static final xn4 NEW_FACE_CHILD = new xn4("newface_home_sub", "newface_home_sub", "Page_Home");
    public static final xn4 NEW_FACE_PARENT_INTL = new xn4("newface_home_main_intl", "newface_home_main_intl", "Page_Home");
    public static final xn4 NEW_FACE_CHILD_INTL = new xn4("newface_home_sub_intl", "newface_home_sub_intl", "Page_Home");
    public static final xn4 NEW_FACE_CHILD_INTL_LITE = new xn4("taote_sub_intl", "taote_sub_intl", "Page_TMGTaote");
    public static final xn4 NEW_FACE_CHILD_CAMPAIGN = new xn4("newface_campaign_sub", "newface_campaign_sub", "Page_HomeSale");

    public xn4(String str, String str2, String str3) {
        this.f31484a = str;
        this.b = str2;
        this.c = str3;
        b(str, d);
    }

    public static xn4 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xn4) ipChange.ipc$dispatch("95cc4d06", new Object[]{str});
        }
        return d.get(str);
    }

    @Override // tb.arb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
        }
        return this.c;
    }

    public final void b(String str, HashMap<String, xn4> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbef6088", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap.containsKey(str) && rj7.b()) {
            Log.e("ContainerType", "containerId 已被注册 : containerId : " + str);
        }
        hashMap.put(str, this);
    }

    @Override // tb.arb
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.f31484a;
    }

    @Override // tb.arb
    public String getPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return this.b;
    }

    static {
        t2o.a(487587851);
        t2o.a(488636418);
    }
}
