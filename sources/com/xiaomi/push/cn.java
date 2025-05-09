package com.xiaomi.push;

import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cn {

    /* renamed from: a  reason: collision with root package name */
    private int f14806a;

    /* renamed from: a  reason: collision with other field name */
    private long f803a;

    /* renamed from: a  reason: collision with other field name */
    private String f804a;
    private long b;
    private long c;

    public cn() {
        this(0, 0L, 0L, null);
    }

    public int a() {
        return this.f14806a;
    }

    public cn(int i, long j, long j2, Exception exc) {
        this.f14806a = i;
        this.f803a = j;
        this.c = j2;
        this.b = System.currentTimeMillis();
        if (exc != null) {
            this.f804a = exc.getClass().getSimpleName();
        }
    }

    public cn a(JSONObject jSONObject) {
        this.f803a = jSONObject.getLong("cost");
        this.c = jSONObject.getLong("size");
        this.b = jSONObject.getLong("ts");
        this.f14806a = jSONObject.getInt("wt");
        this.f804a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m552a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f803a);
        jSONObject.put("size", this.c);
        jSONObject.put("ts", this.b);
        jSONObject.put("wt", this.f14806a);
        jSONObject.put("expt", this.f804a);
        return jSONObject;
    }
}
