package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.tao.util.NavUrls;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dpj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_LIST_URI = "http://taobao.com/order_search_result.htm";

    static {
        t2o.a(713031796);
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324991ec", new Object[]{activity, str, str2});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("bizOrderId", str);
            bundle.putString("downgradeType", str2);
            bundle.putString("from", activity.getClass().getSimpleName());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizOrderId", (Object) str);
            Nav.from(activity).withExtras(bundle).toUri(c2u.b(dbl.y(), jSONObject));
        }
    }

    public static void c(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37dfc755", new Object[]{activity, str, str2, str3});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("bizOrderId", str);
            bundle.putString("downgradeType", str3);
            if (activity.getIntent() != null) {
                bundle.putBoolean(CoreConstants.FROM_ORDER_LIST, "OrderListActivity".equals(jql.e(activity.getIntent())));
            }
            bundle.putString("from", activity.getClass().getSimpleName());
            Nav.from(activity).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_DETAIL);
        }
    }

    public static void e(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237f962", new Object[]{activity, str, str2});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("searchKey", str);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("downgradeType", str2);
            }
            bundle.putString("from", activity.getClass().getSimpleName());
            if (!Nav.from(activity).withExtras(bundle).toUri("http://taobao.com/order_search_result.htm")) {
                idl.d(OrderBizCode.orderSearch, "NavToSearchResultFailed", "searchKey=" + str);
            }
            lor.c("NavigateHelper", "navigate2OrderSearch", "searchKey:" + str);
        }
    }

    public static void g(Context context, Intent intent) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1c96d1", new Object[]{context, intent});
        } else if (intent != null && intent.getData() != null && (queryParameter = (data = intent.getData()).getQueryParameter("jumpParams")) != null) {
            intent.setData(Uri.parse(data.toString().replaceAll("&jumpParams=[^&]*$", "")));
            try {
                JSONObject parseObject = JSON.parseObject(queryParameter);
                String string = parseObject.getString("url");
                parseObject.remove("url");
                Nav.from(context).toUri(f2u.b(string, parseObject));
            } catch (Exception unused) {
            }
        }
    }

    public static void b(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a65e79", new Object[]{activity, str, str2});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("tabCode", str);
            bundle.putString("downgradeType", str2);
            bundle.putString("from", activity.getClass().getSimpleName());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabCode", (Object) str);
            idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(1.0f).message("onLoadError：downgradeToH5").success(false));
            Nav.from(activity).withExtras(bundle).toUri(c2u.b(dbl.A(), jSONObject));
        }
    }

    public static void d(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4c9918", new Object[]{activity, str, str2});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("tabCode", str);
            bundle.putString("downgradeType", str2);
            bundle.putString("from", activity.getClass().getSimpleName());
            Nav.from(activity).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_LIST[0]);
        }
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b5384c", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str) && context != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shop_id", (Object) str);
            String b = c2u.b(NavUrls.nav_urls_shop[0], jSONObject);
            Nav.from(context).toUri(b);
            lor.c("NavigateHelper", "navigate2ShopByShopId", b);
        }
    }
}
