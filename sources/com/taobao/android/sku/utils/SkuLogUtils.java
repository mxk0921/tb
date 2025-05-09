package com.taobao.android.sku.utils;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.sku.AliXSkuCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hdv;
import tb.hr0;
import tb.jq0;
import tb.nbq;
import tb.o2q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuLogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASS_NAME = "com.taobao.android.sku.utils.SkuLogUtils";
    public static final int CLICK_UT_TYPE = 2101;
    public static final String DEFAULT_BIZ_NAME = "taobao_sku";
    public static final int EXPOSE_UT_TYPE = 2201;
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String KEY_COST_TIME = "costTime";
    public static final String KEY_INSTANCE_ID = "instanceId";
    public static final String LOG_TRACE_MODULE = "new_buy";
    public static final String LOG_TRACE_MODULE_SKU_V3 = "sku3";
    public static final String PAGE_NAME = "Page_New_SKU";
    public static final String P_BUY_BTN_CLICK = "buyBtnClick";
    public static final String P_CART_BTN_CLICK = "cartBtnClick";
    public static final String P_SKUBAR_BTN_CLICK = "skuBarBtnClick";
    public static final String P_SKU_INIT = "skuInit";
    public static final String P_WEEX_NEW = "weexNew";
    public static final String P_WEEX_RENDER = "weexRender";
    public static final String SPM = "a2141.7631564.newsku";
    public static final String TYPE_SKU_H5 = "web";
    public static final String TYPE_SKU_NATIVE = "native";
    public static final String TYPE_SKU_NEWBUY = "newbuy";
    public static final String TYPE_SKU_UNKNOWN = "unknown";
    public static final String TYPE_SKU_V3 = "v3";
    public static final String UM_DOWNGRADE_E = "UME_SKU_001";
    public static final String UM_HEAD_GALLERY_E = "UME_HEAD_GALLERY";
    public static final String UM_NEWBUY_E_PREFIX = "UME_NEWBUY_E_";
    public static final String UM_PATCH_BASE_E = "UME_PATCH_BASE";
    public static final String UM_PATCH_EXCEPTION_E = "UME_PATCH_EXCEPTION";
    public static final String UM_PATCH_FAILED_E = "UME_PATCH_FAILED";
    public static final String UM_PATCH_LOAD_TIME_E = "UME_PATCH_LOAD_TIME";
    public static final String UM_PATCH_NOT_USE_E = "UME_PATCH_NOT_USE";
    public static final String UM_PATCH_SUCCESS_E = "UME_PATCH_SUCCESS";
    public static final String UM_PATCH_USE_E = "UME_PATCH_USE";
    public static final String UM_PERFORMANCE_M = "UPM_SKU_000";
    public static final String UM_SHOW_PRESENTER_E = "UME_SKU_SHOW_PRESENTER";
    public static final String UM_SKU2_DOWNGRADEH5URL_EMPTY = "UM_SKU2_DOWNGRADEH5URL_EMPTY";
    public static final String UM_SKU2_ERROR = "UM_SKU2_ERROR";
    public static final String UM_SKU2_FINAL_H5URL_EMPTY = "UM_SKU2_FINAL_H5URL_EMPTY";
    public static final String UM_SKU2_H52NATIVE = "UM_SKU2_H52NATIVE";
    public static final String UM_SKU2_H5_BROKEN = "UM_SKU2_H5_BROKEN";
    public static final String UM_SKU2_ITEM_ID_EMPTY = "UM_SKU2_ITEM_ID_EMPTY";
    public static final String UM_SKU2_SERVICE_ID = "UM_SKU2";
    public static final String UM_SKU_SILENT = "UM_SKU_SILENT";
    public static final String UM_SKU_SILENT_CALL = "silentActionCall";
    public static final String UM_SKU_SILENT_TIMEOUT = "silentActionTimeOut";
    public static final String UM_SKU_SILENT_WEEX_RESET = "silentActionWeexCallVisible";
    public static final String UM_SKU_V3_E_PREFIX = "UME_SKU_V3_E_";
    public static final String UM_URL_DOWNGRADE_INIT_E = "UME_SKU_URL_001";
    public static final String UM_URL_DOWNGRADE_JSI_E = "UME_SKU_URL_003";
    public static final String UM_URL_DOWNGRADE_MTOP_E = "UME_SKU_URL_002";
    public static final String UM_URL_DOWNGRADE_REDIRECT_URL_E = "UME_SKU_URL_004";
    public static final String UM_WEEX2_E_PREFIX = "UME_WEEX2_E_";
    public static final String UM_WEEX2_E_SKU_V3_PREFIX = "UME_SKU_V3_WEEX2_E_";
    public static final String UM_WEEX_E_PREFIX = "UME_WEEX_E_";
    public static final String UM_WEEX_E_SERVICE_ID = "WEEX_Errors_Dimension";
    public static final String UM_WEEX_E_SKU_V3_PREFIX = "UME_SKU_V3_WEEX_E_";
    public static final String UM_WEEX_SKU_PRELOAD = "UME_WEEX_SKU_PRELOAD";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9461a = new ArrayList<String>() { // from class: com.taobao.android.sku.utils.SkuLogUtils.1
        {
            add(SkuLogUtils.UM_PERFORMANCE_M);
            add(SkuLogUtils.UM_PATCH_LOAD_TIME_E);
            add(SkuLogUtils.UM_PATCH_USE_E);
            add(SkuLogUtils.UM_PATCH_BASE_E);
            add(SkuLogUtils.UM_PATCH_SUCCESS_E);
        }
    };

    static {
        t2o.a(442499272);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831afe36", new Object[]{str, str2, str3});
        } else {
            b(str, str2, str3, "");
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        UMLinkLogInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24d4680", new Object[]{str, str2, str3, str4});
            return;
        }
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge(AliXSkuCore.LOG_TAG, str3);
        }
        if (!f(str2) && (a2 = hdv.a()) != null) {
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            a2.commitFailure("Main", str4, "", "New_Sku", str, new HashMap<String, String>(str3) { // from class: com.taobao.android.sku.utils.SkuLogUtils.3
                public final /* synthetic */ String val$msg;

                {
                    this.val$msg = str3;
                    put("errorMsg", str3);
                }
            }, str2, str3);
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e32be97", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge(AliXSkuCore.LOG_TAG, "msg: " + str3 + " itemId: " + str4 + " url: " + str5);
        }
        UMLinkLogInterface a2 = hdv.a();
        if (a2 != null) {
            a2.commitFailure("Main", str4, "", "New_Sku", str, new HashMap<String, String>(str3, str4, str5) { // from class: com.taobao.android.sku.utils.SkuLogUtils.2
                public final /* synthetic */ String val$itemId;
                public final /* synthetic */ String val$msg;
                public final /* synthetic */ String val$url;

                {
                    this.val$msg = str3;
                    this.val$itemId = str4;
                    this.val$url = str5;
                    put("errorMsg", str3);
                    put("itemId", str4);
                    put("url", str5);
                }
            }, str2, str3);
        }
    }

    public static void d(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d70896", new Object[]{new Integer(i), str, map});
            return;
        }
        AliUserTrackerInterface c = hr0.c();
        if (c != null) {
            c.a(PAGE_NAME, i, "Page_New_SKU_" + str, null, null, h(null, null, null, null, map));
        }
    }

    public static void e(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7445c32", new Object[]{str, str2, str3, str4, map});
            return;
        }
        AliUserTrackerInterface c = hr0.c();
        if (c != null) {
            c.a(PAGE_NAME, 2201, "showSKU", null, null, h(str, str2, str3, str4, map));
            if (o2q.c("enable_ut_present_sku")) {
                c.a(PAGE_NAME, 2101, "presentSKU", null, null, h(str, str2, str3, str4, map));
            }
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a99c0d", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((ArrayList) f9461a).contains(str);
    }

    public static String g(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed067b4", new Object[]{str, str2, str3, str4});
        }
        return h(str, str2, str3, str4, null);
    }

    public static String h(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1afe7627", new Object[]{str, str2, str3, str4, map});
        }
        String str5 = "";
        String str6 = TextUtils.isEmpty(str3) ? str5 : ",skuUT=" + str3;
        String str7 = TextUtils.isEmpty(str4) ? str5 : ",skuParams=" + str4;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    str5 = str5 + "," + key + "=" + value;
                }
            }
        }
        return "itemId=" + str + ",sellerId=" + str2 + str6 + str7 + str5 + ",spm=a2141.7631564.newsku";
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{str});
            return;
        }
        k(str);
        UMLinkLogInterface a2 = hdv.a();
        if (a2 != null) {
            a2.logError("New_Sku", "Main", "Main", null, "UME_SKU_LOG_E", str, null, null);
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
            return;
        }
        i("[" + str + "] " + str2);
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1935de3e", new Object[]{str});
            return;
        }
        Log.e(AliXSkuCore.LOG_TAG, str);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge(AliXSkuCore.LOG_TAG, str);
        }
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c33488", new Object[]{str, str2});
            return;
        }
        k("[" + str + "] " + str2);
    }

    public static void m(String str, String str2, long j, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8510cb9", new Object[]{str, str2, new Long(j), str3, str4});
            return;
        }
        AliUserTrackerInterface c = hr0.c();
        if (c != null) {
            c.a(PAGE_NAME, 2201, "closeSKU", null, null, g(str, str2, str3, str4) + (",userViewTime=" + j));
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce068725", new Object[0]);
            return;
        }
        try {
            nbq.c("new_buy_sku", "sku", "E_SKU_BUY", "back");
        } catch (Throwable unused) {
        }
    }

    public static void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ed29a7", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (z) {
                nbq.c("sku_v3", "sku", "E_SKU_V3", "default");
            } else {
                nbq.c("sku_v3", "sku", "E_N_SKU_V3", "default");
            }
        } catch (Throwable unused) {
        }
    }

    public static void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709a38ff", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (z) {
                nbq.c("new_buy_sku", "sku", "E_SKU_BUY", "default");
            } else {
                nbq.c("new_buy_sku", "sku", "E_N_SKU_BUY", "default");
            }
        } catch (Throwable unused) {
        }
    }

    public static void q(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335ddd1a", new Object[]{str, str2, str3, str4});
            return;
        }
        AliUserTrackerInterface c = hr0.c();
        if (c != null) {
            c.a(PAGE_NAME, 2101, "Page_New_SKU_Slide_updown", null, null, g(str, str2, str3, str4));
        }
    }

    public static void r(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be2fd35", new Object[]{str, str2, str3, str4});
            return;
        }
        AliLogInterface c = jq0.c();
        if (c != null) {
            try {
                c.loge(AliXSkuCore.LOG_TAG, "module: " + str + " step: " + str2 + " stepMsg: " + str3 + " content: " + str4);
            } catch (Throwable unused) {
            }
        }
        UMLinkLogInterface a2 = hdv.a();
        if (a2 != null) {
            try {
                a2.trace("New_Sku", str, CLASS_NAME, str2, "0", str3, TraceLogEventType.COMMON, str4);
            } catch (Throwable unused2) {
            }
        }
    }

    public static void s(String str, Map<String, String> map) {
        AliUserTrackerInterface c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9255d57", new Object[]{str, map});
        } else if (!TextUtils.isEmpty(str) && (c = hr0.c()) != null) {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                jSONObject.putAll(map);
            }
            c.a(PAGE_NAME, 2101, str, null, null, String.valueOf(jSONObject));
        }
    }

    public static void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec96de7", new Object[]{str});
        } else {
            b(DEFAULT_BIZ_NAME, str, "", UM_SKU_SILENT);
        }
    }

    public static void u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1511c09", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", str);
        hashMap.put("bundleUrl", str2);
        s("sku_weex_preload_begin_fetch", hashMap);
    }

    public static void v(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777ebad1", new Object[]{str, str2, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", str);
        hashMap.put("bundleUrl", str2);
        hashMap.put("costTime", String.valueOf(j));
        s("sku_weex_preload_execute", hashMap);
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455b85f1", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", str);
        hashMap.put("bundleUrl", str2);
        s("sku_weex_preload_hit", hashMap);
    }

    public static void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60114c86", new Object[]{str});
        } else {
            b(DEFAULT_BIZ_NAME, UM_SKU2_ERROR, str, UM_SKU2_SERVICE_ID);
        }
    }

    public static void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccaa0d0", new Object[]{str, str2});
        } else {
            b(DEFAULT_BIZ_NAME, str, str2, UM_SKU2_SERVICE_ID);
        }
    }
}
