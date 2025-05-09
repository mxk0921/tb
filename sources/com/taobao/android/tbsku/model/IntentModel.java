package com.taobao.android.tbsku.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.hxj;
import tb.p2q;
import tb.q2q;
import tb.r4p;
import tb.t2o;
import tb.ybl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class IntentModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADDCART = "ADDCART";
    public static final String ADDCART_AND_BUYNOW = "ADDCART_AND_BUYNOW";
    public static final String BUYNOW = "BUYNOW";
    public static final String CONFIRM = "CONFIRM";
    public static final String KEY_OPEN_FROM = "openFrom";

    /* renamed from: a  reason: collision with root package name */
    public final String f9595a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map<String, String> g = new HashMap();
    public final Map<String, String> h = new HashMap();
    public final Map<String, String> i = new HashMap();
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final int n;
    public final String o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final String s;
    public final boolean t;
    public final String u;
    public final long v;
    public final String w;
    public final String x;
    public final String y;

    static {
        t2o.a(785383546);
    }

    public IntentModel(Intent intent) {
        String str;
        this.r = false;
        this.s = p2q.SKU_MSG_DEPRESS_SHOW_H5_SKU;
        this.t = false;
        this.u = p2q.SKU_MSG_DEPRESS_SHOW_REDIRECT_SKU;
        this.v = 0L;
        this.w = null;
        if (intent == null) {
            this.m = true;
            this.n = 9;
            this.o = p2q.SKU_MSG_INVALID_INPUT;
            return;
        }
        this.v = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        Uri data = intent.getData();
        if (data == null) {
            this.m = true;
            this.n = 9;
            this.o = p2q.SKU_MSG_INVALID_INPUT;
            return;
        }
        this.f = data.toString();
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.isEmpty()) {
            List<String> d = ybl.d();
            for (String str2 : extras.keySet()) {
                if (!d.contains(str2)) {
                    ((HashMap) this.g).put(str2, String.valueOf(extras.get(str2)));
                }
            }
        }
        HashSet hashSet = new HashSet();
        try {
            String queryParameter = data.getQueryParameter(r4p.KEY_MSOA_TRANS_KEY);
            if (!TextUtils.isEmpty(queryParameter)) {
                String[] split = queryParameter.split(",");
                if (split != null) {
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            hashSet.add(str3);
                        }
                    }
                }
                ((HashMap) this.g).put(r4p.KEY_MSOA_TRANS_KEY, queryParameter);
            }
            this.w = data.getQueryParameter("perfStamp");
        } catch (Throwable unused) {
        }
        Set<String> d2 = d(data, "request_key");
        Set<String> hashSet2 = new HashSet<>();
        try {
            hashSet2 = data.getQueryParameterNames();
        } catch (Throwable unused2) {
        }
        for (String str4 : hashSet2) {
            try {
                str = data.getQueryParameter(str4);
            } catch (Throwable unused3) {
                str = null;
            }
            if ("itemId".equalsIgnoreCase(str4)) {
                this.f9595a = str;
            }
            if ("openFrom".equalsIgnoreCase(str4)) {
                this.b = str;
            }
            if (q2q.KEY_SKU_ID.equalsIgnoreCase(str4)) {
                this.c = str;
            }
            if ("bottomMode".equalsIgnoreCase(str4)) {
                this.e = str;
            }
            if (hxj.UNIQID.equalsIgnoreCase(str4)) {
                this.d = str;
            }
            if ("extInput".equalsIgnoreCase(str4)) {
                this.j = str;
            }
            if ("skuUT".equalsIgnoreCase(str4)) {
                this.k = str;
            }
            if ("skuInnerBizName".equalsIgnoreCase(str4)) {
                this.l = str;
            }
            if ("isSourceType11".equalsIgnoreCase(str4)) {
                this.p = Boolean.parseBoolean(str);
            }
            if ("depressTBCartRefresh".equalsIgnoreCase(str4)) {
                this.q = str;
            }
            if ("sku_forbidH5".equalsIgnoreCase(str4)) {
                this.r = Boolean.parseBoolean(str);
            }
            if ("sku_forbidH5_toast".equalsIgnoreCase(str4) && !TextUtils.isEmpty(str)) {
                this.s = str;
            }
            if ("sku_forbid_redirect".equalsIgnoreCase(str4)) {
                this.t = Boolean.parseBoolean(str);
            }
            if ("sku_forbid_redirect_toast".equalsIgnoreCase(str4) && !TextUtils.isEmpty(str)) {
                this.u = str;
            }
            if ("lazyLoadSku2".equalsIgnoreCase(str4) && !TextUtils.isEmpty(str)) {
                this.x = str;
            }
            if ("behaviorUniqueId".equalsIgnoreCase(str4)) {
                this.y = str;
            }
            if (hashSet.contains(str4) && !TextUtils.isEmpty(str)) {
                ((HashMap) this.g).put(str4, str);
                ((HashMap) this.h).put(str4, str);
            }
            if (d2.contains(str4) && !TextUtils.isEmpty(str)) {
                ((HashMap) this.g).put(str4, str);
                ((HashMap) this.i).put(str4, str);
            }
        }
        if (TextUtils.isEmpty(this.f9595a)) {
            this.f9595a = intent.getStringExtra("itemId");
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = intent.getStringExtra(q2q.KEY_SKU_ID);
        }
        if (TextUtils.isEmpty(this.e)) {
            this.e = intent.getStringExtra("bottomMode");
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = intent.getStringExtra(hxj.UNIQID);
        }
        if (TextUtils.isEmpty(this.f9595a)) {
            this.m = true;
            this.n = 9;
            this.o = p2q.SKU_MSG_INVALID_INPUT;
        }
    }

    public final JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42d0286c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (TextUtils.isEmpty(this.j)) {
            return jSONObject;
        }
        JSONObject parseObject = JSON.parseObject(this.j);
        if (parseObject != null && !parseObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd053e36", new Object[]{this})).booleanValue();
        }
        return "true".equalsIgnoreCase(this.q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r3.equalsIgnoreCase(r6.e) != false) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject c() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbsku.model.IntentModel.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "158f1710"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
        L_0x0015:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            com.alibaba.fastjson.JSONObject r0 = r6.a(r0)
            java.lang.String r1 = r6.e
            java.lang.String r2 = "ADDCART_AND_BUYNOW"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0029
            goto L_0x004b
        L_0x0029:
            java.lang.String r1 = r6.e
            java.lang.String r3 = "ADDCART"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0035
        L_0x0033:
            r2 = r3
            goto L_0x004b
        L_0x0035:
            java.lang.String r1 = r6.e
            java.lang.String r3 = "BUYNOW"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0040
            goto L_0x0033
        L_0x0040:
            java.lang.String r1 = r6.e
            java.lang.String r3 = "CONFIRM"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x004b
            goto L_0x0033
        L_0x004b:
            java.lang.String r1 = "id_biz_property"
            com.alibaba.fastjson.JSONObject r3 = r0.getJSONObject(r1)
            java.lang.String r4 = "skuId"
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = r6.c
            r3.put(r4, r5)
            goto L_0x0066
        L_0x005c:
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>()
            java.lang.String r5 = r6.c
            r3.put(r4, r5)
        L_0x0066:
            r0.put(r1, r3)
            java.lang.String r1 = "id_biz_bottom"
            com.alibaba.fastjson.JSONObject r3 = r0.getJSONObject(r1)
            java.lang.String r4 = "bottomMode"
            if (r3 == 0) goto L_0x0077
            r3.put(r4, r2)
            goto L_0x007f
        L_0x0077:
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>()
            r3.put(r4, r2)
        L_0x007f:
            r0.put(r1, r3)
            java.lang.String r1 = "storedData"
            com.alibaba.fastjson.JSONObject r2 = r0.getJSONObject(r1)
            java.lang.String r3 = "transparent_map"
            if (r2 == 0) goto L_0x0097
            com.taobao.android.tbsku.model.IntentModel$1 r4 = new com.taobao.android.tbsku.model.IntentModel$1
            r4.<init>()
            r2.put(r3, r4)
            goto L_0x00a4
        L_0x0097:
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject
            r2.<init>()
            com.taobao.android.tbsku.model.IntentModel$2 r4 = new com.taobao.android.tbsku.model.IntentModel$2
            r4.<init>()
            r2.put(r3, r4)
        L_0x00a4:
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r6.g
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "enableFastSku"
            java.lang.Object r1 = r1.get(r2)
            r0.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.model.IntentModel.c():com.alibaba.fastjson.JSONObject");
    }

    public final Set<String> d(Uri uri, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5c9e5e2c", new Object[]{this, uri, str});
        }
        HashSet hashSet = new HashSet();
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        hashSet.add(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24eff89", new Object[]{this})).booleanValue();
        }
        return this.p;
    }
}
