package com.taobao.android.sku.weex;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.d3q;
import tb.l8x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexModuleHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499352);
    }

    public static void a(d3q d3qVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa21dbe", new Object[]{d3qVar, str, str2});
        } else if (str != null && d3qVar != null) {
            d3qVar.b(new HashMap<String, Object>(str, str2) { // from class: com.taobao.android.sku.weex.WeexModuleHelper.1
                public final /* synthetic */ String val$key;
                public final /* synthetic */ String val$msg;

                {
                    this.val$key = str;
                    this.val$msg = str2;
                    put(str, str2);
                }
            });
        }
    }

    public static void b(int i, Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7492876", new Object[]{new Integer(i), map, d3qVar, d3qVar2});
        } else if (map == null || !map.containsKey("eventData")) {
            a(d3qVar2, "errorMsg", "eventData is empty");
        } else {
            JSONObject parseObject = JSON.parseObject(String.valueOf(map.get("eventData")));
            if (parseObject == null || parseObject.isEmpty()) {
                a(d3qVar2, "errorMsg", "eventData is empty");
            } else if (!parseObject.containsKey("_sku_token_")) {
                a(d3qVar2, "errorMsg", "_sku_token_ is empty");
            } else {
                String valueOf = String.valueOf(parseObject.get("_sku_token_"));
                WeexMessageHandler a2 = l8x.a(valueOf + i);
                if (a2 == null) {
                    a(d3qVar2, "errorMsg", "not found _sku_token_ value( " + valueOf + " )'s handler");
                    return;
                }
                a2.B(String.valueOf(map.get("eventName")), parseObject, d3qVar, d3qVar2);
            }
        }
    }

    public static Object[] c(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("13bcd9ed", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return objArr;
        }
        Object[] objArr2 = new Object[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Map) {
                objArr2[i] = new JSONObject((Map) obj);
            } else if (obj instanceof List) {
                objArr2[i] = new JSONArray((List) obj);
            } else {
                objArr2[i] = obj;
            }
        }
        return objArr2;
    }
}
