package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.local.model.a;
import com.huawei.hms.framework.network.grs.local.model.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c extends a {
    public c(Context context, boolean z) {
        this.d = z;
        if (a("grs_sdk_global_route_config.json", context) == 0) {
            this.c = true;
        }
    }

    public List<b> a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : a(jSONObject);
    }

    private List<b> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b bVar = new b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString("name"));
                bVar.a(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (!(jSONArray == null || jSONArray.length() == 0)) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        hashSet.add((String) jSONArray.get(i));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        this.f5341a = new a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f5341a.b(string);
            this.f5341a.a(j);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int c(String str) {
        JSONObject jSONObject;
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() != 0) {
                this.b.addAll(a(jSONObject));
            }
            return 0;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0024, B:8:0x003a, B:10:0x0043, B:11:0x0059, B:13:0x005f, B:15:0x0070, B:18:0x0078, B:20:0x007e, B:22:0x0085, B:24:0x008e, B:25:0x00a4, B:27:0x00aa, B:29:0x00be, B:31:0x00c4, B:33:0x00d5, B:34:0x00e9, B:36:0x00f4, B:37:0x00f9, B:39:0x00ff, B:40:0x0103, B:41:0x0108, B:42:0x010e, B:44:0x0115, B:45:0x011c), top: B:50:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0024, B:8:0x003a, B:10:0x0043, B:11:0x0059, B:13:0x005f, B:15:0x0070, B:18:0x0078, B:20:0x007e, B:22:0x0085, B:24:0x008e, B:25:0x00a4, B:27:0x00aa, B:29:0x00be, B:31:0x00c4, B:33:0x00d5, B:34:0x00e9, B:36:0x00f4, B:37:0x00f9, B:39:0x00ff, B:40:0x0103, B:41:0x0108, B:42:0x010e, B:44:0x0115, B:45:0x011c), top: B:50:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.c.f(java.lang.String):int");
    }
}
