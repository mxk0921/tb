package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.e.c;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    private static final String e = "a";

    /* renamed from: a  reason: collision with root package name */
    private final GrsBaseInfo f5332a;
    private com.huawei.hms.framework.network.grs.e.a b;
    private g c;
    private c d;

    /* compiled from: Taobao */
    /* renamed from: com.huawei.hms.framework.network.grs.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0268a implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a  reason: collision with root package name */
        String f5333a;
        Map<String, String> b;
        IQueryUrlsCallBack c;
        Context d;
        GrsBaseInfo e;
        com.huawei.hms.framework.network.grs.e.a f;

        public C0268a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f5333a = str;
            this.b = map;
            this.c = iQueryUrlsCallBack;
            this.d = context;
            this.e = grsBaseInfo;
            this.f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f5333a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.c.onCallBackSuccess(this.b);
            } else if (this.b == null) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                Map<String, String> a2 = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.f5333a, true);
                if (a2 == null || a2.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f5333a);
                }
                if (a2 == null) {
                    a2 = new ConcurrentHashMap<>();
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f5333a, StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
                this.c.onCallBackSuccess(a2);
            } else {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f5333a);
                this.c.onCallBackFail(-3);
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(d dVar) {
            String j = dVar.j();
            Map<String, String> a2 = a.a(j, this.f5333a);
            if (!a2.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f5333a, StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
                this.c.onCallBackSuccess(a2);
                return;
            }
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f5333a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.c.onCallBackSuccess(this.b);
            } else if (this.b == null) {
                if (!TextUtils.isEmpty(j)) {
                    Logger.e(a.e, "The serviceName[%s] is not configured on the GRS server.", this.f5333a);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                Map<String, String> a3 = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.f5333a, true);
                if (a3 == null || a3.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f5333a);
                }
                if (a3 == null) {
                    a3 = new ConcurrentHashMap<>();
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f5333a, StringUtils.anonymizeMessage(new JSONObject(a3).toString()));
                this.c.onCallBackSuccess(a3);
            } else {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f5333a);
                this.c.onCallBackFail(-5);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a  reason: collision with root package name */
        String f5334a;
        String b;
        IQueryUrlCallBack c;
        String d;
        Context e;
        GrsBaseInfo f;
        com.huawei.hms.framework.network.grs.e.a g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f5334a = str;
            this.b = str2;
            this.c = iQueryUrlCallBack;
            this.d = str3;
            this.e = context;
            this.f = grsBaseInfo;
            this.g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f5334a, this.b, StringUtils.anonymizeMessage(this.d));
                this.c.onCallBackSuccess(this.d);
            } else if (TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                String a2 = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.f5334a, this.b, true);
                if (a2 == null || a2.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f5334a, this.b);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f5334a, this.b, StringUtils.anonymizeMessage(a2));
                this.c.onCallBackSuccess(a2);
            } else {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f5334a, this.b);
                this.c.onCallBackFail(-3);
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(d dVar) {
            IQueryUrlCallBack iQueryUrlCallBack;
            String str;
            String j = dVar.j();
            Map<String, String> a2 = a.a(j, this.f5334a);
            if (a2.containsKey(this.b)) {
                String str2 = a.e;
                String str3 = this.f5334a;
                String str4 = this.b;
                Logger.i(str2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(a2.get(str4)));
                iQueryUrlCallBack = this.c;
                str = a2.get(this.b);
            } else if (!TextUtils.isEmpty(this.d)) {
                String str5 = a.e;
                String str6 = this.f5334a;
                String str7 = this.b;
                Logger.i(str5, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str6, str7, StringUtils.anonymizeMessage(a2.get(str7)));
                iQueryUrlCallBack = this.c;
                str = this.d;
            } else if (TextUtils.isEmpty(this.d)) {
                if (!TextUtils.isEmpty(j)) {
                    Logger.e(a.e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f5334a, this.b);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                String a3 = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.f5334a, this.b, true);
                if (a3 == null || a3.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f5334a, this.b);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f5334a, this.b, StringUtils.anonymizeMessage(a3));
                this.c.onCallBackSuccess(a3);
                return;
            } else {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f5334a, this.b);
                this.c.onCallBackFail(-5);
                return;
            }
            iQueryUrlCallBack.onCallBackSuccess(str);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, c cVar) {
        this.f5332a = grsBaseInfo;
        this.b = aVar;
        this.c = gVar;
        this.d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    public String a(Context context, String str, int i) {
        d a2 = this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f5332a, context), str, this.d, i);
        return a2 == null ? "" : a2.m() ? this.b.a().a(this.f5332a.getGrsParasKey(true, true, context), "") : a2.j();
    }

    public String a(String str, String str2, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a() || TextUtils.isEmpty(str3)) {
            String a2 = a(context, str, i);
            String str4 = a(a2, str).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                Logger.i(e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str4));
                return str4;
            }
            if (TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(a2)) {
                    Logger.e(e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
                }
                String str5 = e;
                Logger.i(str5, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
                str3 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.f5332a, str, str2, true);
                if (str3 == null || str3.isEmpty()) {
                    Logger.e(str5, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
                }
            }
            Logger.i(e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            return str3;
        }
        Logger.i(e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
        return str3;
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public Map<String, String> a(String str, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a2 = a(str, bVar, context);
        if (!bVar.a() || a2.isEmpty()) {
            String a3 = a(context, str, i);
            Map<String, String> a4 = a(a3, str);
            if (!a4.isEmpty()) {
                Logger.i(e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a4).toString()));
                return a4;
            }
            if (a2.isEmpty()) {
                if (!TextUtils.isEmpty(a3)) {
                    Logger.e(e, "The serviceName[%s] is not configured on the GRS server.", str);
                }
                String str2 = e;
                Logger.i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
                a2 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.f5332a, str, true);
                if (a2 == null || a2.isEmpty()) {
                    Logger.e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
                }
            }
            Logger.i(e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(a2 != null ? new JSONObject(a2).toString() : ""));
            return a2;
        }
        Logger.i(e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
        return a2;
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> a2 = this.b.a(this.f5332a, str, bVar, context);
        if (a2 == null || a2.isEmpty()) {
            Map<String, String> a3 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.f5332a, str, false);
            Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
            return a3 != null ? a3 : new HashMap();
        }
        Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
        return a2;
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e2) {
            Logger.w(e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a2 = a(str, bVar, context);
        if (!bVar.a()) {
            this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f5332a, context), new C0268a(str, a2, iQueryUrlsCallBack, context, this.f5332a, this.b), str, this.d, i);
        } else if (a2.isEmpty()) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(a2);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f5332a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f5332a, this.b), str, this.d, i);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
