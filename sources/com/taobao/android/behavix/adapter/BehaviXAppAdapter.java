package com.taobao.android.behavix.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.f82;
import tb.o0r;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BehaviXAppAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f6451a = new HashMap<String, Object>() { // from class: com.taobao.android.behavix.adapter.BehaviXAppAdapter.1
        {
            put(o0r.a.K_BEHAVIX_CONFIG, "{\"ut\":[{\"actionTypeIn\":[\"tap\",\"expose\"],\"actionNameIn\":[\"Page_Detail_Show_Detail_ShopItem\",\"Page_Detail_Button-ShopItem\"]}],\"task\":[{\"sceneIn\":[\"Page_Home\",\"Page_SearchItemList\",\"Page_ShoppingCart\",\"Page_OrderList\",\"Page_LogisticsDetail\"],\"actionTypeIn\":[\"tap\",\"expose\"],\"taskType\":[\"upload\"],\"taskArray\":[{\"taskType\":\"upload\"}]},{\"sceneIn\":[\"Page_Detail\"],\"actionTypeIn\":[\"leave\"],\"taskType\":[\"ipv\"],\"taskArray\":[{\"taskType\":\"ipv\"}]},{\"sceneIn\":[\"Page_Home\",\"Page_SearchItemList\",\"Page_ShoppingCart\",\"Page_OrderList\"],\"actionTypeIn\":[\"leave\"],\"taskType\":[\"batch\"],\"taskArray\":[{\"taskType\":\"batch\"}]}]}");
            put(v82.K_NEW_TABLE_WRITE, Boolean.TRUE);
            put(o0r.a.K_NODE_FILTERS, "{\"whitelist\":[{\"type\":\"ut\",\"eIdIn\":[\"19999\"],\"arg1In\":[\"tao_purchase_request_page_data\",\"tao_purchase_create_request_page_data\"]},{\"type\":\"bx\",\"actionTypeIn\":[\"expose\",\"tap\",\"custom\",\"scroll\",\"pv\",\"leave\",\"request\",\"appIn\",\"appOut\"]},{\"type\":\"ut\",\"eIdIn\":[\"2001\",\"2101\",\"2201\"]}],\"blacklist\":[{\"type\":\"ut\",\"pgIn\":[\"Page_Home\",\"Page_SearchItemList\",\"Page_New_SKU\",\"Page_TaobaoLiveWatch\",\"%/mengwa/%\",\"%/fai-mini-pop/%\"]},{\"type\":\"ut\",\"pgIn\":[\"Page_Detail\",\"Page_ShoppingCart\",\"Page_SearchItemList%\",\"Page_MarketCart\",\"Page_OrderList\",\"Page_ConfirmOrder\",\"Page_OrderDetail\",\"Page_Shop_Search_List\",\"Page_Shop_Category\",\"Page_SearchTmallList\",\"Page_DetailComments\",\"Page_Chat\",\"Page_FoldingComments\",\"Page_CouponUseSrp\",\"Page_MyTaobao\",\"%apps/market/tjb/task-purchase-rebate%\",\"%/wow/%\",\"%/wow/a/act/%\",\"%1111.tmall.com%\",\"%/order-search/pages/index%\",\"%618.tmall.com%\",\"%brandhub.m%\"],\"eIdIn\":[\"2001\"]},{\"type\":\"ut\",\"pgIn\":[\"Page_Detail\"],\"eIdIn\":[\"2101\",\"2201\"],\"arg1NIn\":[\"Page_Detail_Show_Detail_ShopItem\",\"Page_Detail_Button-ShopItem\"]},{\"type\":\"ut\",\"eIdIn\":[\"2101\",\"2201\"],\"arg1In\":[\"Search-ItemExposure\",\"Page_Shop_All_Item_Button-Item\",\"Page_MyTaobao_Show-icon\",\"Page_MarketCart_Show_Recomm\"]},{\"type\":\"ut\",\"pgIn\":[\"Page_ShoppingCart\",\"Page_OrderList\",\"Page_OrderDetail\",\"Page_PaySuccess\",\"Page_LogisticsDetail\",\"Page_ConfirmReceipt\"],\"eIdIn\":[\"2101\",\"2201\"],\"arg1In\":[\"%Show-guessitem%\",\"head\",\"content\",\"catapult-component\",\"item\",\"%Button-guessitem%\",\"%guessitem-item%\",\"%Button-delreason%\",\"%similar%\",\"%GuessSimilar%\"]},{\"type\":\"ut\",\"pgIn\":[\"Page_Chat\"],\"eIdIn\":[\"2101\"],\"arg1In\":[\"Page_Chat_Button-kefulive_senditem_wangwang_click_tokefu\"]}]}");
        }
    };
    public static final Map<String, Object> b = new HashMap<String, Object>() { // from class: com.taobao.android.behavix.adapter.BehaviXAppAdapter.2
        {
            put(v82.K_NEW_TABLE_WRITE, Boolean.TRUE);
        }
    };

    static {
        t2o.a(404750476);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13353862", new Object[]{str});
        }
        if (!"taobao".equals(f82.c())) {
            return "";
        }
        Object obj = ((HashMap) f6451a).get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22f6ca74", new Object[]{str})).booleanValue();
        }
        if ("taobao".equals(f82.c())) {
            Object obj = ((HashMap) f6451a).get(str);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        } else {
            Object obj2 = ((HashMap) b).get(str);
            if (obj2 instanceof Boolean) {
                return ((Boolean) obj2).booleanValue();
            }
        }
        return false;
    }

    public static boolean c(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b79e0387", new Object[]{hashMap})).booleanValue();
        }
        return hashMap != null && "com.taobao.taobao".equals((String) hashMap.get("packageName"));
    }
}
