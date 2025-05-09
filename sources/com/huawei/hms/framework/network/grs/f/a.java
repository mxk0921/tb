package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.c;
import com.huawei.hms.framework.network.grs.local.model.b;
import com.huawei.hms.framework.network.grs.local.model.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected com.huawei.hms.framework.network.grs.local.model.a f5341a;
    protected List<b> b;
    protected boolean c = false;
    protected boolean d = false;
    protected Set<String> e = new HashSet(16);

    private int b(String str, Context context) {
        if (g(c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private int g(String str) {
        int c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.d && (c = c(str)) != 0) {
            return c;
        }
        int b = b(str);
        if (b != 0) {
            return b;
        }
        return f(str);
    }

    private int h(String str) {
        List<b> list;
        int d;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.d || (((list = this.b) != null && !list.isEmpty()) || (d = d(str)) == 0)) {
            return e(str);
        }
        return d;
    }

    public int a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return b(sb.toString(), context) != 0 ? -1 : 0;
    }

    public abstract int b(String str);

    public abstract int c(String str);

    public boolean c() {
        return this.c;
    }

    public abstract int f(String str);

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f5341a;
    }

    public Set<String> b() {
        return this.e;
    }

    public int d(String str) {
        JSONArray jSONArray;
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public int e(String str) {
        try {
            b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> a2 = a(context, aVar, grsBaseInfo, str, z);
        if (a2 != null) {
            return a2.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(org.json.JSONArray r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00fe
            int r4 = r18.length()
            if (r4 != 0) goto L_0x0010
            goto L_0x00fe
        L_0x0010:
            r4 = 0
        L_0x0011:
            int r5 = r18.length()
            if (r4 >= r5) goto L_0x00fe
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            com.huawei.hms.framework.network.grs.local.model.c r6 = new com.huawei.hms.framework.network.grs.local.model.c
            r6.<init>()
            java.lang.String r7 = "name"
            java.lang.String r7 = r5.getString(r7)
            r6.b(r7)
            java.util.Set<java.lang.String> r8 = r0.e
            boolean r8 = r8.contains(r7)
            if (r8 != 0) goto L_0x00fb
            java.util.Set<java.lang.String> r8 = r0.e
            r8.add(r7)
            boolean r8 = r0.d
            if (r8 == 0) goto L_0x00fb
            java.lang.String r8 = "routeBy"
            java.lang.String r8 = r5.getString(r8)
            r6.c(r8)
            java.lang.String r8 = "servings"
            org.json.JSONArray r8 = r5.getJSONArray(r8)
            r9 = 0
        L_0x004d:
            int r10 = r8.length()
            java.lang.String r11 = "AbstractLocalManager"
            if (r9 >= r10) goto L_0x00c7
            java.lang.Object r10 = r8.get(r9)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            com.huawei.hms.framework.network.grs.local.model.d r12 = new com.huawei.hms.framework.network.grs.local.model.d
            r12.<init>()
            java.lang.String r13 = "countryOrAreaGroup"
            boolean r14 = r10.has(r13)
            if (r14 == 0) goto L_0x006d
        L_0x0068:
            java.lang.String r11 = r10.getString(r13)
            goto L_0x0083
        L_0x006d:
            java.lang.String r13 = "countryGroup"
            boolean r14 = r10.has(r13)
            if (r14 == 0) goto L_0x0076
            goto L_0x0068
        L_0x0076:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r2] = r7
            java.lang.String r14 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r11, r14, r13)
            java.lang.String r11 = "no-country"
        L_0x0083:
            r12.a(r11)
            java.lang.String r11 = "addresses"
            org.json.JSONObject r10 = r10.getJSONObject(r11)
            java.util.concurrent.ConcurrentHashMap r11 = new java.util.concurrent.ConcurrentHashMap
            r13 = 16
            r11.<init>(r13)
            java.util.Iterator r13 = r10.keys()
        L_0x0097:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00bb
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r10.getString(r14)
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 != 0) goto L_0x0097
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x0097
            java.lang.String r15 = r10.getString(r14)
            r11.put(r14, r15)
            goto L_0x0097
        L_0x00bb:
            r12.a(r11)
            java.lang.String r10 = r12.b()
            r6.a(r10, r12)
            int r9 = r9 + r3
            goto L_0x004d
        L_0x00c7:
            java.lang.String r8 = "countryOrAreaGroups"
            boolean r9 = r5.has(r8)
            if (r9 == 0) goto L_0x00d8
        L_0x00cf:
            org.json.JSONArray r5 = r5.getJSONArray(r8)
            java.util.List r5 = r0.a(r5)
            goto L_0x00e8
        L_0x00d8:
            java.lang.String r8 = "countryGroups"
            boolean r9 = r5.has(r8)
            if (r9 == 0) goto L_0x00e1
            goto L_0x00cf
        L_0x00e1:
            java.lang.String r5 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r11, r5)
            r5 = 0
        L_0x00e8:
            r6.a(r5)
            com.huawei.hms.framework.network.grs.local.model.a r5 = r0.f5341a
            if (r5 != 0) goto L_0x00f6
            com.huawei.hms.framework.network.grs.local.model.a r5 = new com.huawei.hms.framework.network.grs.local.model.a
            r5.<init>()
            r0.f5341a = r5
        L_0x00f6:
            com.huawei.hms.framework.network.grs.local.model.a r5 = r0.f5341a
            r5.a(r7, r6)
        L_0x00fb:
            int r4 = r4 + r3
            goto L_0x0011
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.a.b(org.json.JSONArray):void");
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<b> list = this.b;
        if (list != null && !list.isEmpty()) {
            for (b bVar : this.b) {
                if (bVar.a().contains(str)) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    public List<b> a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                b bVar = new b();
                bVar.b(jSONObject.getString("id"));
                bVar.c(jSONObject.getString("name"));
                bVar.a(jSONObject.getString("description"));
                if (jSONObject.has("countriesOrAreas")) {
                    jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                } else if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray("countries");
                } else {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                }
                HashSet hashSet = new HashSet(16);
                if (!(jSONArray2 == null || jSONArray2.length() == 0)) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.f5341a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c a2 = aVar2.a(str);
        if (a2 == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String b = e.b(context, aVar, a2.b(), grsBaseInfo, z);
        if (b == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a2.b());
            return null;
        }
        List<b> a3 = a2.a();
        d a4 = a2.a((a3 == null || a3.size() == 0) ? a(b) : a(a3, grsBaseInfo, b).get(b));
        if (a4 == null) {
            return null;
        }
        return a4.a();
    }

    private Map<String, String> a(List<b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    public void a(Context context, List<String> list) {
        if (list != null && list.size() > 0) {
            for (String str : list) {
                Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
                if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                    Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
                } else {
                    if (h(c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                        Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", str);
                    } else {
                        Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", str);
                    }
                }
            }
        }
    }
}
