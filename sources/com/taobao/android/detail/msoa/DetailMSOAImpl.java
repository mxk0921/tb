package com.taobao.android.detail.msoa;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.all;
import tb.kq0;
import tb.rd3;
import tb.rrh;
import tb.t2o;
import tb.wmc;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailMSOAImpl implements DetailMSOAInterface, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String _SKU_ACTSTACK_ = "_sku_actStack_";
    private static final String _SKU_CODESTACK_ = "_sku_codeStack_";
    private static final String _SKU_UNIQUE_MARKER_ = "_sku_unique_marker_";
    private static final String _SKU_WEBVIEWURL_ = "_sku_webviewUrl_";
    private static final String _SKU_WEEXURL_ = "_sku_weexUrl_";

    static {
        t2o.a(698351621);
        t2o.a(698351632);
    }

    private static boolean depressTBCartRefresh(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7fd0b02", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return Boolean.parseBoolean(jSONObject.getString("depressTBCartRefresh"));
        }
        return false;
    }

    private static String depressTBCartShowH5Sku(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4755789a", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String str = "&sku_forbidH5=" + jSONObject.getString("sku_forbidH5");
        String string = jSONObject.getString("sku_forbidH5_toast");
        if (TextUtils.isEmpty(string)) {
            return str;
        }
        return str + "&sku_forbidH5_toast=" + string;
    }

    private static String depressTBCartShowRedirectSku(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d766e2b", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String str = "&sku_forbid_redirect=" + jSONObject.getString("sku_forbid_redirect");
        String string = jSONObject.getString("sku_forbid_redirect_toast");
        if (TextUtils.isEmpty(string)) {
            return str;
        }
        return str + "&sku_forbid_redirect_toast=" + string;
    }

    private void exeShowFloatPage(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53420fc1", new Object[]{this, str, str2, str3});
        } else {
            rrh.e().g(str, "0", "params error!", null);
        }
    }

    private static Bundle generateParamsForSourceType11(Bundle bundle, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("e91233c0", new Object[]{bundle, str, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject == null) {
            bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
            return bundle;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("leftButton");
            JSONObject jSONObject3 = jSONObject.getJSONObject("rightButton");
            String str2 = wmc.CONFIRM;
            if (jSONObject2 != null && jSONObject3 == null) {
                bundle.putString("bottom_bar_style", "bottombar_style_buyonly");
                String string = jSONObject2.getString("title");
                if (!TextUtils.isEmpty(string)) {
                    str2 = string;
                }
                bundle.putString("buyText", str2);
            } else if (jSONObject2 != null && jSONObject3 != null) {
                bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
                String string2 = jSONObject2.getString("title");
                String string3 = jSONObject3.getString("title");
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("buyText", string2);
                }
                if (!TextUtils.isEmpty(string3)) {
                    bundle.putString("cartText", string3);
                }
            } else if (jSONObject2 == null && jSONObject3 == null) {
                bundle.putString("bottom_bar_style", "bottombar_style_buyonly");
                bundle.putString("buyText", str2);
            }
            bundle.putString("sourceType", str);
            return bundle;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
            } catch (Throwable unused) {
            }
            return bundle;
        }
    }

    private static String getTimeStamp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af39a6b7", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        long longValue = jSONObject.getLongValue("JSBRIDGE_START_UPTIME");
        long longValue2 = jSONObject.getLongValue("MSOA_START_UPTIME");
        if (longValue != 0) {
            jSONObject2.put("JSBRIDGE_START_UPTIME", (Object) Long.valueOf(longValue));
        }
        if (longValue2 != 0) {
            jSONObject2.put("MSOA_START_UPTIME", (Object) Long.valueOf(longValue2));
        }
        jSONObject2.put("MSOA_END_UPTIME", (Object) Long.valueOf(System.currentTimeMillis()));
        return jSONObject2.toJSONString();
    }

    private static void recordMSOAShowSku(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8556dc8", new Object[]{str, jSONObject});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        try {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_Detail", "Page_Detail_Button-MSOA_ShowSKU");
            uTHitBuilders$UTControlHitBuilder.setProperty("bizName", str);
            uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        } catch (Throwable unused) {
        }
    }

    private static void showNewSku2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, boolean z2, String str10, String str11, String str12) {
        String str13;
        String str14;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8314323", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, new Boolean(z), str9, new Boolean(z2), str10, str11, str12});
            return;
        }
        AliLoginInterface c = kq0.c();
        if (c == null || c.checkSessionValid()) {
            String str15 = "";
            if (!TextUtils.isEmpty(str9)) {
                String jSONString = new JSONObject(str9) { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.10
                    public final /* synthetic */ String val$bizName;

                    {
                        this.val$bizName = str9;
                        put("bizName", (Object) str9);
                    }
                }.toJSONString();
                str13 = "&skuUT=" + URLEncoder.encode(jSONString);
                str14 = "&skuInnerBizName=" + str9;
            } else {
                str14 = str15;
                str13 = str14;
            }
            StringBuilder sb = new StringBuilder("https://sku.taobao.com/index.htm?itemId=");
            sb.append(str2);
            sb.append("&uniqueId=");
            sb.append(URLEncoder.encode(str));
            sb.append("&skuId=");
            sb.append(str3);
            sb.append("&isFromMsoa=true&bottomMode=");
            sb.append(str4);
            sb.append("&isSourceType11=");
            sb.append(z ? "true" : "false");
            sb.append(!TextUtils.isEmpty(str5) ? str5 : str15);
            if (!TextUtils.isEmpty(str6)) {
                str15 = str6;
            }
            sb.append(str15);
            sb.append("&ignore_toast=true&downgradeStr=");
            sb.append(URLEncoder.encode(str7));
            sb.append(str8);
            sb.append(str13);
            sb.append(str14);
            sb.append("&depressTBCartRefresh=");
            sb.append(z2);
            sb.append(str10);
            sb.append(str11);
            sb.append("&perfStamp=");
            sb.append(str12);
            String sb2 = sb.toString();
            Application application = Globals.getApplication();
            if (all.INSTANCE.f(application)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("stdPopPanEnable", false);
                bundle.putBoolean("stdPopModal", true);
                bundle.putBoolean("stdPopHandleBack", false);
                xq0.c().a(application).d(bundle).c(sb2 + "&largescreenmask=true");
                return;
            }
            xq0.c().a(application).c(sb2);
            return;
        }
        c.login(true);
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void addSMCart(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b985aa", new Object[]{this, str, str2, str3, str4});
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            rrh.e().i(str, "msoa_error_invalid_param", "invalid parameter", null);
        } else {
            new NewDetailMSOAImpl().addSMCart(str, str2, str3, str4);
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showFloatPage(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95188a33", new Object[]{this, str, str2, str3});
        } else {
            exeShowFloatPage(str, str2, str3);
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showSku(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1349005", new Object[]{this, str, str2, str3});
        } else {
            showSkuProcess(str, str2, str3, null, false);
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showSku3(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657e6538", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            showSkuProcess(str, str2, str3, jSONObject, false);
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showSku(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ea7f8b", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            showSkuProcess(str, str2, str3, jSONObject, false);
        }
    }

    private static String getBottomMode(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46239528", new Object[]{new Integer(i), jSONObject});
        }
        if (i == 1) {
            return "ADDCART";
        }
        if (i == 2) {
            return "BUYNOW";
        }
        if (i == 3) {
            return "CONFIRM";
        }
        if (i == 5) {
            return "ADDCART";
        }
        if (i == 6) {
            return "BUYNOW";
        }
        if (i == 11) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("leftButton");
                JSONObject jSONObject3 = jSONObject.getJSONObject("rightButton");
                if (jSONObject2 != null && jSONObject3 == null) {
                    return "CONFIRM";
                }
                if ((jSONObject2 == null || jSONObject3 == null) && jSONObject2 == null && jSONObject3 == null) {
                    return "CONFIRM";
                }
            } catch (Throwable unused) {
            }
        }
        return "ADDCART_AND_BUYNOW";
    }

    private static String getHideComponent(String str, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f076d53d", new Object[]{str, new Integer(i), jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i == 1) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.1
                {
                    put("addCartText", "确认");
                }
            });
        } else if (i == 2) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.2
                {
                    put("buyNowText", "确认");
                }
            });
        } else if (i == 11 && jSONObject != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("leftButton");
            String str2 = wmc.CONFIRM;
            if (jSONObject3 != null) {
                String string = jSONObject3.getString("title");
                if (!TextUtils.isEmpty(string)) {
                    str2 = string;
                }
            }
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject(str2) { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.3
                public final /* synthetic */ String val$text;

                {
                    this.val$text = str2;
                    put("comfirText", (Object) str2);
                }
            });
        }
        if ("cart".equals(str)) {
            jSONObject2.put("id_biz_size_chart", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.4
                {
                    put("gone", (Object) Boolean.TRUE);
                }
            });
            jSONObject2.put("id_biz_relatedAuctions", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.5
                {
                    put("gone", (Object) Boolean.TRUE);
                }
            });
            jSONObject2.put("id_biz_area", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.6
                {
                    put("gone", (Object) Boolean.TRUE);
                }
            });
            jSONObject2.put("id_biz_quantity", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.7
                {
                    put("gone", (Object) Boolean.TRUE);
                }
            });
            jSONObject2.put("id_biz_component", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.8
                {
                    put("gone", (Object) Boolean.TRUE);
                }
            });
            jSONObject2.put("id_biz_maochao_cpu", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.9
                {
                    put("gone", (Object) Boolean.TRUE);
                }
            });
            if (!(jSONObject == null || jSONObject.getJSONObject("extInput") == null)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("extInput");
                JSONObject jSONObject5 = jSONObject4.getJSONObject("id_biz_installment");
                if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                    jSONObject2.put("id_biz_installment", (Object) jSONObject5);
                }
                JSONObject jSONObject6 = jSONObject4.getJSONObject(rd3.KEY_BUY_METHOD_IN_EVENT);
                if (jSONObject6 != null && !jSONObject6.isEmpty()) {
                    jSONObject2.put(rd3.KEY_BUY_METHOD_IN_EVENT, (Object) jSONObject6);
                }
                JSONObject jSONObject7 = jSONObject4.getJSONObject("id_biz_service");
                if (jSONObject7 != null && !jSONObject7.isEmpty()) {
                    jSONObject2.put("id_biz_service", (Object) jSONObject7);
                }
                JSONObject jSONObject8 = jSONObject4.getJSONObject("fliggy_sku_ext_params");
                if (jSONObject8 != null && !jSONObject8.isEmpty()) {
                    jSONObject2.put("fliggy_sku_ext_params", (Object) jSONObject8);
                }
            }
        }
        return "&extInput=" + jSONObject2.toJSONString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void showSkuProcess(java.lang.String r17, java.lang.String r18, java.lang.String r19, com.alibaba.fastjson.JSONObject r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.msoa.DetailMSOAImpl.showSkuProcess(java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, boolean):void");
    }
}
