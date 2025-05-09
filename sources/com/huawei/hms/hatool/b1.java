package com.huawei.hms.hatool;

import android.text.TextUtils;
import org.json.JSONObject;
import tb.wua;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b1 implements o1 {

    /* renamed from: a  reason: collision with root package name */
    private String f5372a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f5372a);
        jSONObject.put("eventtime", this.d);
        jSONObject.put("event", this.b);
        jSONObject.put("event_session_name", this.e);
        jSONObject.put("first_session_event", this.f);
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        jSONObject.put(wua.KEY_PROPERTIES, new JSONObject(this.c));
        return jSONObject;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f5372a;
    }

    public JSONObject d() {
        JSONObject a2 = a();
        a2.put(wua.KEY_PROPERTIES, n.b(this.c, o0.d().a()));
        return a2;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f5372a = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.b = jSONObject.optString("event");
            this.c = n.a(jSONObject.optString(wua.KEY_PROPERTIES), o0.d().a());
            this.f5372a = jSONObject.optString("type");
            this.d = jSONObject.optString("eventtime");
            this.e = jSONObject.optString("event_session_name");
            this.f = jSONObject.optString("first_session_event");
        }
    }
}
