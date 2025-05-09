package com.taobao.android.tbsku.container;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.Map;
import tb.q2q;
import tb.r4p;
import tb.t2o;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MsoaDataConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(785383485);
    }

    public static Intent a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ee72e474", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("itemId");
        String string2 = jSONObject.getString(q2q.KEY_SKU_ID);
        String string3 = jSONObject.getString("sourceType");
        String string4 = jSONObject.getString("bizName");
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        return j(string, string2, h(string3, jSONObject2), f(jSONObject2), e(jSONObject2), i(string3, jSONObject2), string4, b(jSONObject2), c(jSONObject2), d(jSONObject2), g(jSONObject2));
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7fd0b02", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return Boolean.parseBoolean(jSONObject.getString("depressTBCartRefresh"));
        }
        return false;
    }

    public static String c(JSONObject jSONObject) {
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

    public static String d(JSONObject jSONObject) {
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

    public static String g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("899a0e2b", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.getString("behaviorUniqueId");
    }

    public static String h(String str, JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e7ba65", new Object[]{str, jSONObject});
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
        }
        if (i == 1) {
            return "ADDCART";
        }
        if (i == 2) {
            return "BUYNOW";
        }
        if (i != 3) {
            if (i == 5) {
                return "ADDCART";
            }
            if (i == 6) {
                return "BUYNOW";
            }
            if (i != 11 || jSONObject == null) {
                return "ADDCART_AND_BUYNOW";
            }
        }
        return "CONFIRM";
    }

    public static Intent j(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10) {
        String str11;
        String str12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("490e6c9f", new Object[]{str, str2, str3, str4, str5, str6, str7, new Boolean(z), str8, str9, str10});
        }
        String str13 = "";
        if (!TextUtils.isEmpty(str7)) {
            String jSONString = new JSONObject(str7) { // from class: com.taobao.android.tbsku.container.MsoaDataConverter.4
                public final /* synthetic */ String val$bizName;

                {
                    this.val$bizName = str7;
                    put("bizName", (Object) str7);
                }
            }.toJSONString();
            str12 = "&skuUT=" + URLEncoder.encode(jSONString);
            str11 = "&skuInnerBizName=" + str7;
        } else {
            str11 = str13;
            str12 = str11;
        }
        StringBuilder sb = new StringBuilder("https://sku.taobao.com/index.htm?itemId=");
        sb.append(str);
        sb.append("&skuId=");
        sb.append(str2);
        sb.append("&bottomMode=");
        sb.append(str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = str13;
        }
        sb.append(str4);
        if (TextUtils.isEmpty(str5)) {
            str5 = str13;
        }
        sb.append(str5);
        sb.append("&ignore_toast=true");
        sb.append(str6);
        sb.append(str12);
        sb.append(str11);
        sb.append("&depressTBCartRefresh=");
        sb.append(z);
        sb.append(str8);
        sb.append(str9);
        sb.append("&behaviorUniqueId=");
        if (!TextUtils.isEmpty(str10)) {
            str13 = URLEncoder.encode(str10);
        }
        sb.append(str13);
        return new Intent().setData(Uri.parse(sb.toString()));
    }

    public static String e(Map<String, Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("598a1cdd", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get("request_key")) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!(TextUtils.isEmpty(valueOf) || (split = valueOf.split(",")) == null || split.length == 0)) {
            String str = "";
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str + "&request_key=" + valueOf;
        }
        return null;
    }

    public static String f(Map<String, Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6174f3a", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get(r4p.KEY_MSOA_TRANS_KEY)) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!(TextUtils.isEmpty(valueOf) || (split = valueOf.split(",")) == null || split.length == 0)) {
            String str = "";
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str + "&transparent_key=" + valueOf;
        }
        return null;
    }

    public static String i(String str, JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f9d526", new Object[]{str, jSONObject});
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i == 1) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.container.MsoaDataConverter.1
                {
                    put("addCartText", "确认");
                }
            });
        } else if (i == 2) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.container.MsoaDataConverter.2
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
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject(str2) { // from class: com.taobao.android.tbsku.container.MsoaDataConverter.3
                public final /* synthetic */ String val$text;

                {
                    this.val$text = str2;
                    put("comfirText", (Object) str2);
                }
            });
        }
        return "&extInput=" + jSONObject2.toJSONString();
    }
}
