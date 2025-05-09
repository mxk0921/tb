package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import java.util.Map;
import tb.b5m;
import tb.bq6;
import tb.hjh;
import tb.hr0;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UtUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLICK_UT_TYPE = 2101;
    public static final int CUSTOM_UT_TYPE = 19999;
    public static final int EXPOSE_UT_TYPE = 2201;
    public static final String PAGE_NAME = "Page_Detail";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.utils.UtUtils$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class AnonymousClass2 extends JSONObject {
        public final /* synthetic */ Map val$args;

        public AnonymousClass2(Map map) {
            this.val$args = map;
            putAll(map);
        }
    }

    static {
        t2o.a(912262868);
    }

    public static String a(JSONObject jSONObject) {
        String key;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45642501", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || (key = entry.getKey()) == null)) {
                Object value = entry.getValue();
                if (value != null) {
                    str = String.valueOf(value);
                } else {
                    str = "";
                }
                sb.append(",");
                sb.append(key);
                sb.append("=");
                sb.append(str);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public static String b(JSONObject jSONObject, JSONObject jSONObject2, int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2735c569", new Object[]{jSONObject, jSONObject2, new Integer(i), str});
        }
        if (i == 2101) {
            str2 = "Page_Detail_Button-";
        } else {
            str2 = "Page_Detail_Show-";
        }
        String concat = str2.concat(str);
        StringBuilder sb = new StringBuilder(b5m.K().b());
        String string = jSONObject.getString("spmC");
        String string2 = jSONObject.getString("spmD");
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (isEmpty && isEmpty2) {
            return concat;
        }
        if (!isEmpty) {
            sb.append(".");
            sb.append(string);
        }
        if (!isEmpty2) {
            sb.append(".");
            sb.append(string2);
        }
        jSONObject2.put("spm", (Object) sb.toString());
        return concat;
    }

    public static JSONObject c(bq6 bq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7dc43436", new Object[]{bq6Var});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("detailVersion", (Object) "detailV3");
        if (bq6Var != null) {
            Params params = (Params) bq6Var.f(Params.class);
            if (params != null) {
                JSONObject trackEventParams = params.getTrackEventParams();
                if (trackEventParams != null) {
                    jSONObject.putAll(trackEventParams);
                }
                JSONObject umbParams = params.getUmbParams();
                if (umbParams != null) {
                    jSONObject.putAll(umbParams);
                    jSONObject.put("bizIdentifyParams", (Object) umbParams.getString("aliBizCode"));
                }
            }
            Item item = (Item) bq6Var.f(Item.class);
            if (item != null) {
                jSONObject.put("item_id", (Object) item.getItemId());
            }
            Seller seller = (Seller) bq6Var.f(Seller.class);
            if (seller != null) {
                jSONObject.put("seller_id", (Object) seller.getUserId());
                jSONObject.put("shop_id", (Object) seller.getShopId());
            }
            jSONObject.put("new_arch_unique_id", bq6Var.k("new_arch_unique_id"));
        }
        jSONObject.put("user_id", (Object) hjh.b());
        jSONObject.put("container_type", (Object) "xdetail");
        jSONObject.put("native_detail_v", (Object) "newArch");
        return jSONObject;
    }

    public static JSONObject d(Context context) {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3add3c6", new Object[]{context});
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || (data = intent.getData()) == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("fromtorelation");
        if (!TextUtils.isEmpty(queryParameter)) {
            return new JSONObject(queryParameter) { // from class: com.taobao.android.detail.ttdetail.utils.UtUtils.1
                public final /* synthetic */ String val$fromtorelation;

                {
                    this.val$fromtorelation = queryParameter;
                    put("fromtorelation", (Object) queryParameter);
                }
            };
        }
        return null;
    }

    public static void e(String str, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6760729e", new Object[]{str, ze7Var});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", (Object) str);
        if (ze7Var != null) {
            jSONObject.put("itemId", (Object) DataUtils.w((Item) ze7Var.e().f(Item.class), ""));
        }
        f(19999, "old_code_track_2", jSONObject);
    }

    public static boolean f(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fde3721", new Object[]{new Integer(i), str, jSONObject})).booleanValue();
        }
        return g(i, str, null, null, jSONObject);
    }

    public static boolean g(int i, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f23220d", new Object[]{new Integer(i), str, str2, str3, jSONObject})).booleanValue();
        }
        AliUserTrackerInterface c = hr0.c();
        if (c == null) {
            return false;
        }
        c.a("Page_Detail", i, str, str2, str3, a(jSONObject));
        if (i == 2101) {
            b5m.A().b("Page_Detail", str, null, i(jSONObject));
        } else {
            if (i == 2201) {
                b5m.A().c("Page_Detail", str, null, null, i(jSONObject));
            }
            return true;
        }
        return true;
    }

    public static boolean h(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82aa5503", new Object[]{new Integer(i), str, jSONObject})).booleanValue();
        }
        if (i == 2101) {
            str = "Page_Detail_Button_" + str;
        } else if (i == 2201) {
            str = "Page_Detail_Show_" + str;
        }
        return f(i, str, jSONObject);
    }

    public static String[] i(Map<String, ? extends Object> map) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e2c5a455", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        String[] strArr = new String[map.size()];
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = "";
            } else {
                str = obj.toString();
            }
            strArr[i] = str2 + "=" + str;
            i++;
        }
        return strArr;
    }
}
