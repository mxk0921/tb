package com.taobao.android.detail.alittdetail.supermarket;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.TTDetailActivity;
import com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.q2q;
import tb.rrh;
import tb.t2o;
import tb.tgh;
import tb.wcu;
import tb.xns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.alittdetail.supermarket.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0348a implements SuperMarketAddCartHandler.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6573a;

        public C0348a(String str) {
            this.f6573a = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("resultCode", "0");
            rrh.e().l(this.f6573a, hashMap);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("resultCode", "1");
            rrh.e().l(this.f6573a, hashMap);
        }
    }

    static {
        t2o.a(354418787);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103c9e09", new Object[]{str});
        } else {
            rrh.e().i(str, "msoa_error_business_fail", "provider business fail", null);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        String str5;
        int i = 1;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b985aa", new Object[]{str, str2, str3, str4});
            return;
        }
        Vertical.d dVar = null;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            rrh.e().i(str, "msoa_error_invalid_param", "invalid parameter", null);
            return;
        }
        try {
            str3 = URLDecoder.decode(str3, "utf-8");
        } catch (Throwable th) {
            tgh.c("AddCartUtils", "URLDecode token error with: " + str3, th);
        }
        Activity b = xns.b(str3);
        if (!(b instanceof TTDetailActivity)) {
            tgh.b("AddCartUtils", "not found TTDetailActivity with token: " + str3 + " in addSMCart");
            rrh.e().i(str, "msoa_error_business_fail", "provider business fail", null);
            return;
        }
        TTDetailActivity tTDetailActivity = (TTDetailActivity) b;
        JSONObject parseObject = JSON.parseObject(str4);
        HashMap hashMap = new HashMap();
        if (parseObject != null) {
            i2 = parseObject.getIntValue("quantity");
            JSONObject jSONObject = parseObject.getJSONObject("exParams");
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
            str5 = parseObject.getString(q2q.KEY_SKU_ID);
        } else {
            str5 = null;
        }
        if (i2 > 0) {
            i = i2;
        }
        Vertical vertical = (Vertical) tTDetailActivity.q3().e().f(Vertical.class);
        if (vertical != null) {
            dVar = vertical.getSupermarket();
        }
        if (dVar != null && !TextUtils.isEmpty(dVar.b())) {
            hashMap.put("tpId", dVar.b());
        }
        try {
            if (!SuperMarketAddCartHandler.d(tTDetailActivity.q3(), new wcu().e(i).g(str2).h(str5).f(hashMap), new C0348a(str))) {
                b(str);
            }
        } catch (Throwable th2) {
            tgh.c("AddCartUtils", "addSMCart error", th2);
            b(str);
        }
    }
}
