package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.f.b;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final GrsBaseInfo f5354a;
    private final Context b;
    private final Set<String> c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f5354a = grsBaseInfo;
        this.b = context;
    }

    private String e() {
        Set<String> b = b.a(this.b.getPackageName()).b();
        if (b.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : b) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : this.c) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.b;
    }

    public GrsBaseInfo b() {
        return this.f5354a;
    }

    public String c() {
        if (this.c.size() == 0) {
            return e();
        }
        return f();
    }

    public Set<String> d() {
        return this.c;
    }

    public void a(String str) {
        this.c.add(str);
    }
}
