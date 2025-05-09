package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.android.order.constants.OrderBizCode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32522a;
    public final String b;
    public final String c;
    public static final Map<String, z4a> d = new HashMap();
    public static final z4a HOME_MAIN = new z4a("entrance_home_main", "home_main", "Page_Home");
    public static final z4a HOME_INTL = new z4a("entrance_home_intl", "home_intl", "Page_Home");
    public static final z4a HOME_CUN = new z4a("entrance_home_cun", "home_cun", "Page_Home");
    public static final z4a HOME_OLD = new z4a("entrance_home_old", "home_old", "Page_Home");
    public static final z4a REC_MAIN = new z4a("recommend_home_main", "recommend_home_main", "Page_Home");
    public static final z4a REC_INTL = new z4a("recommend_home_intl", "recommend_home_intl", "Page_Home");
    public static final z4a REC_CUN = new z4a("recommend_home_cun", "recommend_home_cun", "Page_Home");
    public static final z4a REC_OLD = new z4a("recommend_home_old", "recommend_home_old", "Page_Home");
    public static final z4a REC_TAB_LIST = new z4a("recommend_home_main_tab", "recommend_home_main_tab", "Page_Home");
    public static final z4a REC_DETAIL = new z4a("recommend_itemdetail_main", "itemdetail", "Page_Detail");
    public static final z4a REC_DETAIL_EXPIRE = new z4a("recommend_itemdetail_main", "itemdetail", "Page_Detail");
    public static final z4a REC_FAVORITE = new z4a("recommend_collection_main", "favorite", "Page_Collection");
    public static final z4a REC_CART = new z4a("recommend_cart_main", "cart", AddBagRequester.sUTPageShoppingCart);
    public static final z4a REC_MC_CART = new z4a("recommend_tmallcart_main", "tmallcart", "Page_TmMarket");
    public static final z4a REC_ORDER_LIST = new z4a("recommend_orderlist_main", OrderBizCode.orderList, dbv.BIZ_ORDER_LIST);
    public static final z4a REC_ORDER_LIST_CATAPULT = new z4a("recommend_orderlist_catapult_main", "orderlist_catapult", dbv.BIZ_ORDER_LIST);
    public static final z4a REC_MY_TAOBAO = new z4a("recommend_my_taobao", "my_taobao", u3j.b);
    public static final z4a REC_DAILY_OUTFIT = new z4a("recommend_daily_outfit", "daily_outfit", "Page_DailyOutfit");
    public static final z4a REC_OUTFIT_TREND = new z4a("recommend_outfit_trend_outbound", "daily_trend", "Page_DailyTrend");
    public static final z4a REC_ORDER_SEARCH_RESULTS = new z4a("recommend_orderlist_main", "orderlist_search", dbv.BIZ_ORDER_LIST);
    public static final z4a REC_ORDER_DETAIL = new z4a("recommend_orderdetail_main", OrderBizCode.orderDetail, dbv.BIZ_ORDER_DETAIL);
    public static final z4a REC_MY_TAO = new z4a("recommend_my_taobao", "mytao", "Page_MyTao");
    public static final z4a REC_LOGISTICS = new z4a("recommend_logistics_main", "logistics", "Page_Logistic");
    public static final z4a REC_DIRECT_SALE_CART = new z4a("recommend_intlcart_main", "directcart", AddBagRequester.sUTPageShoppingCart);
    public static final z4a REC_PAY_SUCCESS = new z4a("recommend_pay_success", ae2.BizKeyPaysuccess, dbv.BIZ_PAY_SUCCESS);
    public static final z4a REC_CONFIRM_RECEIPT = new z4a("recommend_confirm_receipt", "confirmreceipt", "Page_ConfirmReceipt");
    public static final z4a NEW_FACE_PARENT = new z4a(i2b.HOMEPAGE_NEWFACE, i2b.HOMEPAGE_NEWFACE, "Page_Home");
    public static final z4a NEW_FACE_CHILD = new z4a("newface_home_sub", "newface_home_sub", "Page_Home");
    public static final z4a NEW_FACE_PARENT_INTL = new z4a("newface_home_main_intl", "newface_home_main_intl", "Page_Home");
    public static final z4a NEW_FACE_CHILD_INTL = new z4a("newface_home_sub_intl", "newface_home_sub_intl", "Page_Home");
    public static final z4a NEW_FACE_CHILD_INTL_LITE = new z4a("taote_sub_intl", "taote_sub_intl", "Page_TMGTaote");
    public static final z4a NEW_FACE_CHILD_CAMPAIGN = new z4a("newface_campaign_sub", "newface_campaign_sub", "Page_HomeSale");
    public static final z4a IMAGE_CONTENT_DETAIL = new z4a("recommend_ugc_image_detail", "recommend_ugc_image_detail", "Page_GuangGuangSoloDetail");

    public z4a(String str, String str2, String str3) {
        this.f32522a = str;
        this.b = str2;
        this.c = str3;
        a(str, d);
    }

    public static z4a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("12d03a70", new Object[]{str});
        }
        return (z4a) ((HashMap) d).get(str);
    }

    public static z4a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("626764d6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (z4a z4aVar : ((HashMap) d).values()) {
            if (z4aVar.b.equals(str)) {
                return z4aVar;
            }
        }
        return null;
    }

    public static z4a[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a[]) ipChange.ipc$dispatch("d8e0c862", new Object[0]);
        }
        Collection values = ((HashMap) d).values();
        return (z4a[]) values.toArray(new z4a[values.size()]);
    }

    public final void a(String str, Map<String, z4a> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4135cda", new Object[]{this, str, map});
            return;
        }
        if (map.containsKey(str) && rj7.b()) {
            fve.e("GatewayContainerType", "containerId 已被声明注册 : containerId : " + str);
        }
        map.put(str, this);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.f32522a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return this.b;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
        }
        return this.c;
    }

    static {
        t2o.a(729808918);
    }
}
