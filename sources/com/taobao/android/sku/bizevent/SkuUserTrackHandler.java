package com.taobao.android.sku.bizevent;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cjz;
import tb.jr8;
import tb.lfb;
import tb.pr0;
import tb.t2o;
import tb.v2q;
import tb.wl0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuUserTrackHandler implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "skuUserTrack";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9435a = new ArrayList<String>() { // from class: com.taobao.android.sku.bizevent.SkuUserTrackHandler.1
        {
            add("buyNowWithCoupon");
            add("buyNowNormal");
            add("addCartWithJHSClicked");
            add("addCartClicked");
        }
    };

    static {
        t2o.a(442499146);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        JSONObject jSONObject;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuUserTrackHandler.handleEvent");
        }
        ArrayList arrayList = new ArrayList();
        List d = v2qVar.d();
        if (d != null && d.size() > 0) {
            for (int i3 = 0; i3 < d.size(); i3++) {
                Object obj = d.get(i3);
                if (obj instanceof JSONObject) {
                    arrayList.add((JSONObject) obj);
                }
            }
        }
        JSONObject c = v2qVar.c();
        if (c != null && !c.isEmpty() && (jSONObject = c.getJSONObject("fields")) != null && !jSONObject.isEmpty()) {
            JSONObject a2 = v2qVar.a();
            if (a2 == null) {
                a2 = new JSONObject();
            }
            jr8.a(a2, arrayList, jSONObject);
            try {
                i = jSONObject.getInteger("eventId").intValue();
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                String string = jSONObject.getString("page");
                String string2 = jSONObject.getString("arg1");
                String string3 = jSONObject.getString("arg2");
                String string4 = jSONObject.getString("arg3");
                if (TextUtils.isEmpty(string3)) {
                    string3 = "";
                }
                String str = TextUtils.isEmpty(string4) ? "" : string4;
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                HashMap hashMap = new HashMap();
                if (jSONObject2 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key)) {
                            hashMap.put(key, String.valueOf(value));
                        }
                    }
                }
                String g = pr0Var.g();
                if (!TextUtils.isEmpty(g)) {
                    hashMap.put("skuUT", g);
                }
                String d2 = pr0Var.d();
                if (!TextUtils.isEmpty(d2)) {
                    hashMap.put("skuParams", d2);
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, string3, str, hashMap).build());
                } catch (Throwable unused2) {
                }
                try {
                    if (((ArrayList) f9435a).contains(string2)) {
                        String[] strArr = new String[hashMap.size()];
                        for (String str2 : hashMap.keySet()) {
                            strArr[i2] = str2 + "=" + ((String) hashMap.get(str2));
                            i2++;
                        }
                        wl0.a().commitTap(SkuLogUtils.PAGE_NAME, string2, null, pr0Var.c().B(), strArr);
                    }
                } catch (Throwable unused3) {
                }
            }
        }
    }
}
