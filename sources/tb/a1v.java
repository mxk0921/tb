package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.v2;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a1v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CUSTOM_ADVANCE = "customAdvance";
    public static final String GET_PAGE_ALL_PROPERTIES = "getPageAllProperties";
    public static final String GET_PAGE_SPM_PRE = "getPageSpmPre";
    public static final String GET_PAGE_SPM_URL = "getPageSpmUrl";
    public static final String PAGE_APPEAR = "pageAppear";
    public static final String PAGE_DISAPPEAR = "pageDisappear";
    public static final String SKIP_PAGE = "skipPage";
    public static final String UPDATE_NEXT_PAGE_PROPERTIES = "updateNextPageProperties";
    public static final String UPDATE_NEXT_PAGE_UTPARAM = "updateNextPageUtparam";
    public static final String UPDATE_PAGEURL = "updatePageUrl";
    public static final String UPDATE_PAGE_NAME = "updatePageName";
    public static final String UPDATE_PAGE_PROPERTIES = "updatePageProperties";
    public static final String UPDATE_PAGE_UTPARAM = "updatePageUtparam";
    public static final String UPDATE_SESSION_PROPERTY = "updateSessionProperties";

    static {
        t2o.a(766509558);
    }

    public static final HashMap<String, String> a(ShopDataParser shopDataParser, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("51900ffa", new Object[]{shopDataParser, map});
        }
        ckf.g(shopDataParser, "<this>");
        HashMap<String, String> l1 = shopDataParser.l1();
        l1.put("shop_id", shopDataParser.W0());
        l1.put("seller_id", shopDataParser.N0());
        l1.put("identityCode", shopDataParser.s0());
        l1.put("identityType", shopDataParser.f3());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                l1.put(entry.getKey(), entry.getValue());
            }
        }
        return l1;
    }

    public static final void b(ShopDataParser shopDataParser, String str, Map<String, String> map, String str2) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30dcd323", new Object[]{shopDataParser, str, map, str2});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        if (shopDataParser.g1().h()) {
            hashMap = new HashMap<>();
        } else {
            hashMap = shopDataParser.l1();
        }
        hashMap.put("dx_shop", "1");
        hashMap.put("shop_id", shopDataParser.W0());
        hashMap.put("seller_id", shopDataParser.N0());
        hashMap.put("miniapp_shop", "1");
        if (shopDataParser.G1()) {
            hashMap.put("is2022Style", "1");
            hashMap.put("uiType", v2.d);
        }
        hashMap.put("identityCode", shopDataParser.s0());
        if (map != null) {
            hashMap.putAll(map);
        }
        if (shopDataParser.g1().g()) {
            hashMap.remove("spm");
        }
        hashMap.put("identityCode", shopDataParser.s0());
        hashMap.put("identityType", shopDataParser.f3());
        if (str2 == null) {
            str2 = ShopConstants.PAGE_SHOP;
        }
        m(str2, str, hashMap);
    }

    public static /* synthetic */ void c(ShopDataParser shopDataParser, String str, Map map, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd98f0f9", new Object[]{shopDataParser, str, map, str2, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        b(shopDataParser, str, map, str2);
    }

    public static final void d(ShopDataParser shopDataParser, String str, Map<String, String> map) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d723d0ed", new Object[]{shopDataParser, str, map});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        if (shopDataParser.g1().h()) {
            hashMap = new HashMap<>();
        } else {
            hashMap = shopDataParser.l1();
        }
        hashMap.put("dx_shop", "1");
        hashMap.put("shop_id", shopDataParser.W0());
        hashMap.put("seller_id", shopDataParser.N0());
        hashMap.put("miniapp_shop", "1");
        if (shopDataParser.G1()) {
            hashMap.put("is2022Style", "1");
            hashMap.put("uiType", v2.d);
        }
        hashMap.put("identityCode", shopDataParser.s0());
        if (map != null) {
            hashMap.putAll(map);
        }
        if (shopDataParser.g1().g()) {
            hashMap.remove("spm");
        }
        hashMap.put("identityCode", shopDataParser.s0());
        hashMap.put("identityType", shopDataParser.f3());
        n(ShopConstants.PAGE_SHOP, str, hashMap);
    }

    public static final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d01021", new Object[]{context});
            return;
        }
        ckf.g(context, "<this>");
        h(context, "a2141.7631671");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, "Page_Shop_All_Item");
    }

    public static final void g(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64270e21", new Object[]{context, str, str2});
            return;
        }
        ckf.g(context, "<this>");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, a.i(jpu.a(str, str2)));
    }

    public static final void i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2058dc", new Object[]{context, str, str2});
            return;
        }
        ckf.g(context, "<this>");
        h(context, str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str2);
    }

    public static final void k(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772940d0", new Object[]{context, map});
            return;
        }
        ckf.g(context, "<this>");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
    }

    public static final void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af844de6", new Object[]{context});
            return;
        }
        ckf.g(context, "<this>");
        h(context, "a2141.7631565");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, ShopConstants.PAGE_SHOP);
    }

    public static final void m(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4442f9", new Object[]{str, str2, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str2, null, null, map).build());
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }

    public static final void n(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb75913", new Object[]{str, str2, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, map).build());
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }

    public static /* synthetic */ void o(String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acd8e89", new Object[]{str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        n(str, str2, map);
    }

    public static final void p(ShopDataParser shopDataParser, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d9282c", new Object[]{shopDataParser, str, map});
            return;
        }
        ckf.g(shopDataParser, "<this>");
        if (str != null && str.length() != 0) {
            m(ShopConstants.PAGE_SHOP, str, a(shopDataParser, map));
        }
    }

    public static /* synthetic */ void q(ShopDataParser shopDataParser, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53db9590", new Object[]{shopDataParser, str, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        p(shopDataParser, str, map);
    }

    public static final void r(ShopDataParser shopDataParser, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a921d58", new Object[]{shopDataParser, str, map});
            return;
        }
        ckf.g(shopDataParser, "<this>");
        if (str != null && str.length() != 0) {
            n(ShopConstants.PAGE_SHOP, str, a(shopDataParser, map));
        }
    }

    public static /* synthetic */ void s(ShopDataParser shopDataParser, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1ec4e4", new Object[]{shopDataParser, str, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        r(shopDataParser, str, map);
    }

    public static /* synthetic */ void t(ShopDataParser shopDataParser, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acbe7c2f", new Object[]{shopDataParser, str, map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        d(shopDataParser, str, map);
    }

    public static final void e(Context context, String str, Map<String, ? extends Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f457", new Object[]{context, str, map, str2});
        } else if ((context == null || !r54.r(context)) && !TextUtils.isEmpty(str)) {
            if (ckf.b(PAGE_APPEAR, str)) {
                npp.Companion.b(ckf.p("behavior appear : ", str2));
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context);
            } else if (ckf.b(PAGE_DISAPPEAR, str)) {
                npp.Companion.b(ckf.p("behavior disAppear : ", str2));
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
            } else if (ckf.b(SKIP_PAGE, str)) {
                UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
            } else {
                Object obj = null;
                Integer num = null;
                Object obj2 = null;
                if (ckf.b(CUSTOM_ADVANCE, str)) {
                    if (map != null) {
                        String str3 = (String) map.get("eventId");
                        if (str3 != null) {
                            num = ssq.m(str3);
                        }
                        if (num != null) {
                            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder((String) map.get("pageName"), num.intValue(), (String) map.get("arg1"), (String) map.get("arg2"), (String) map.get("arg3"), JSONUtils.jsonToMap((JSONObject) map.get("args"), new HashMap())).build());
                        }
                    }
                } else if (ckf.b("updatePageName", str)) {
                    UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                    if (map != null) {
                        obj2 = map.get("pageName");
                    }
                    defaultTracker.updatePageName(context, (String) obj2);
                } else if (ckf.b(UPDATE_PAGEURL, str)) {
                    UTTracker defaultTracker2 = UTAnalytics.getInstance().getDefaultTracker();
                    if (map != null) {
                        obj = map.get("pageUrl");
                    }
                    defaultTracker2.updatePageUrl(context, Uri.parse((String) obj));
                } else if (ckf.b(UPDATE_PAGE_PROPERTIES, str)) {
                    UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, r54.T(map));
                } else if (ckf.b(UPDATE_NEXT_PAGE_PROPERTIES, str)) {
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(r54.T(map));
                } else if (ckf.b(UPDATE_PAGE_UTPARAM, str)) {
                    UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(context, JSON.toJSONString(map));
                } else if (ckf.b("updateNextPageUtparam", str)) {
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(map));
                }
            }
        }
    }

    public static final void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8e013", new Object[]{context, str});
            return;
        }
        ckf.g(context, "<this>");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, a.i(jpu.a("spm-cnt", str)));
    }

    public static final void j(Context context, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196e1c36", new Object[]{context, shopDataParser});
            return;
        }
        ckf.g(context, "<this>");
        ckf.g(shopDataParser, "shopDataParser");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, a.i(jpu.a("industryShop", shopDataParser.u0())));
    }
}
