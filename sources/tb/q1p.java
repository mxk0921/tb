package tb;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q1p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_KEY = "all_icon";
    public static final String CUN_ICON_ORANGE_GROUP = "cun_search_icon";
    public static final String DARK_MODE_DOM_PREFIX = "tbsearch_dark_prefix_";
    public static final String ICON_ORANGE_GROUP = "search_icon";
    public static final String INSHOP_KEY = "inshop_icon";
    public static final String NX_KEY = "nx_icon";
    public static final String PAGE_NAME_INSHOP = "InShopSrp";
    public static final String PAGE_NAME_MAIN = "MainSrp";
    public static final String PAGE_NAME_MAIN_SPU = "SpuSrp";
    public static final String PAGE_NAME_NX = "Nx";
    public static final String PAGE_NAME_SAME_SRP = "SameStyleSrp";
    public static final String PAGE_NAME_SHOP = "ShopSearchSrp";
    public static final String PAGE_NAME_SIMILIAR_SHOP = "SimilarShopSrp";
    public static final String PAGE_NAME_TMALL = "TmallSrp";
    public static final String PAGE_NAME_TMALL_SPU = "TmallSpuSrp";
    public static final String SHOP_KEY = "shop_icon";
    public static final String SPU_KEY = "spu_icon";
    public static final String TMALL_KEY = "tmall_icon";

    static {
        t2o.a(815792169);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8367a36c", new Object[]{str});
        }
        return b(d(str), c(str));
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c8c6be2", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return OrangeConfig.getInstance().getConfig(str, str2, "");
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da23c7ea", new Object[]{str});
        }
        if (!o4p.C0() && s2p.INSTANCE.a() && !PAGE_NAME_SHOP.equals(str) && !PAGE_NAME_INSHOP.equals(str) && !PAGE_NAME_NX.equals(str)) {
            return CUN_ICON_ORANGE_GROUP;
        }
        return ICON_ORANGE_GROUP;
    }

    public static HashMap<String, SearchDomBean> e(String str) {
        SearchDomBean h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30145a78", new Object[]{str});
        }
        HashMap<String, SearchDomBean> hashMap = new HashMap<>();
        String c = c(str);
        String d = d(str);
        String b = b(d, c);
        if (TextUtils.isEmpty(b)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(b);
            if (jSONObject.length() == 0) {
                b4p.b("SearchDomParser", "dom json is invalid");
                return hashMap;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (h = h(jSONObject.optJSONObject(next))) != null) {
                    hashMap.put(next, h);
                }
            }
            b4p.a("SearchDomParser", "parseDomIcons: " + d + " " + c + " " + b);
            return hashMap;
        } catch (JSONException unused) {
            b4p.b("SearchDomParser", "generate dom json error");
            return hashMap;
        }
    }

    public static HashMap<String, SearchDomBean> f(com.alibaba.fastjson.JSONObject jSONObject) {
        com.alibaba.fastjson.JSONObject d;
        SearchDomBean g;
        SearchDomBean g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e2ddcadb", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap<String, SearchDomBean> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str) && (d = h19.d(jSONObject, str)) != null && !d.isEmpty()) {
                com.alibaba.fastjson.JSONObject d2 = h19.d(d, ThemeUtils.COLOR_SCHEME_DARK);
                if (!(d2 == null || (g2 = g(d2)) == null)) {
                    hashMap.put(DARK_MODE_DOM_PREFIX + str, g2);
                }
                com.alibaba.fastjson.JSONObject d3 = h19.d(d, "light");
                if (!(d3 == null || (g = g(d3)) == null)) {
                    hashMap.put(str, g);
                }
            }
        }
        return hashMap;
    }

    public static SearchDomBean g(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDomBean) ipChange.ipc$dispatch("a3bca2c8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        SearchDomBean searchDomBean = new SearchDomBean();
        searchDomBean.width = jSONObject.getIntValue("width");
        searchDomBean.height = jSONObject.getIntValue("height");
        searchDomBean.textColor = jSONObject.getString("color");
        searchDomBean.backgroundColor = jSONObject.getString(vaj.KEY_BG_COLOR);
        searchDomBean.backgroundGradientStart = jSONObject.getString("startColor");
        searchDomBean.backgroundGradientEnd = jSONObject.getString("endColor");
        searchDomBean.borderColor = jSONObject.getString("borderColor");
        searchDomBean.image = jSONObject.getString("img");
        searchDomBean.prefixColor = jSONObject.getString("prefixColor");
        searchDomBean.prefixBgColor = jSONObject.getString("prefixBgColor");
        searchDomBean.borderRadius = jSONObject.getIntValue("borderRadius");
        searchDomBean.separatorImg = jSONObject.getString("separatorImg");
        searchDomBean.separatorHeight = jSONObject.getIntValue("separatorHeight");
        searchDomBean.separatorWidth = jSONObject.getIntValue("separatorWidth");
        String string = jSONObject.getString(pg1.ATOM_EXT_UDL_font_size);
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("fontSize");
        }
        try {
            searchDomBean.textSize = Float.parseFloat(string);
        } catch (Exception unused) {
            searchDomBean.textSize = 0.0f;
        }
        return searchDomBean;
    }

    public static SearchDomBean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDomBean) ipChange.ipc$dispatch("b9bd5996", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        SearchDomBean searchDomBean = new SearchDomBean();
        searchDomBean.width = jSONObject.optInt("width");
        searchDomBean.height = jSONObject.optInt("height");
        searchDomBean.textColor = jSONObject.optString("color");
        searchDomBean.backgroundColor = jSONObject.optString(vaj.KEY_BG_COLOR);
        searchDomBean.backgroundGradientStart = jSONObject.optString("startColor");
        searchDomBean.backgroundGradientEnd = jSONObject.optString("endColor");
        searchDomBean.borderColor = jSONObject.optString("borderColor");
        searchDomBean.image = jSONObject.optString("img");
        searchDomBean.prefixColor = jSONObject.optString("prefixColor");
        searchDomBean.prefixBgColor = jSONObject.optString("prefixBgColor");
        searchDomBean.borderRadius = jSONObject.optInt("borderRadius", 0);
        searchDomBean.separatorImg = jSONObject.optString("separatorImg");
        searchDomBean.separatorHeight = jSONObject.optInt("separatorHeight");
        searchDomBean.separatorWidth = jSONObject.optInt("separatorWidth");
        try {
            searchDomBean.textSize = Float.parseFloat(jSONObject.optString(pg1.ATOM_EXT_UDL_font_size));
        } catch (Exception unused) {
            searchDomBean.textSize = 0.0f;
        }
        return searchDomBean;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r5.equals(tb.q1p.PAGE_NAME_MAIN_SPU) == false) goto L_0x0022;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.q1p.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "da3372e6"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0015:
            java.lang.String r2 = "all_icon"
            if (r5 != 0) goto L_0x001a
            return r2
        L_0x001a:
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1811744455: goto L_0x0066;
                case -1000290399: goto L_0x005b;
                case -994828592: goto L_0x0050;
                case -983529293: goto L_0x0045;
                case -927824362: goto L_0x003a;
                case 2538: goto L_0x002f;
                case 1200902249: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            r0 = -1
            goto L_0x006f
        L_0x0024:
            java.lang.String r0 = "TmallSrp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002d
            goto L_0x0022
        L_0x002d:
            r0 = 6
            goto L_0x006f
        L_0x002f:
            java.lang.String r0 = "Nx"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0038
            goto L_0x0022
        L_0x0038:
            r0 = 5
            goto L_0x006f
        L_0x003a:
            java.lang.String r0 = "InShopSrp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0043
            goto L_0x0022
        L_0x0043:
            r0 = 4
            goto L_0x006f
        L_0x0045:
            java.lang.String r0 = "ShopSearchSrp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x004e
            goto L_0x0022
        L_0x004e:
            r0 = 3
            goto L_0x006f
        L_0x0050:
            java.lang.String r0 = "SimilarShopSrp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0059
            goto L_0x0022
        L_0x0059:
            r0 = 2
            goto L_0x006f
        L_0x005b:
            java.lang.String r0 = "TmallSpuSrp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0064
            goto L_0x0022
        L_0x0064:
            r0 = 1
            goto L_0x006f
        L_0x0066:
            java.lang.String r1 = "SpuSrp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x006f
            goto L_0x0022
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007f;
                case 2: goto L_0x007b;
                case 3: goto L_0x007b;
                case 4: goto L_0x0077;
                case 5: goto L_0x0073;
                case 6: goto L_0x007f;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0086
        L_0x0073:
            java.lang.String r2 = "nx_icon"
            goto L_0x0086
        L_0x0077:
            java.lang.String r2 = "inshop_icon"
            goto L_0x0086
        L_0x007b:
            java.lang.String r2 = "shop_icon"
            goto L_0x0086
        L_0x007f:
            java.lang.String r2 = "tmall_icon"
            goto L_0x0086
        L_0x0083:
            java.lang.String r2 = "spu_icon"
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q1p.c(java.lang.String):java.lang.String");
    }
}
