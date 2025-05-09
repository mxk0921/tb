package com.vivo.push.restructure.request.a.a;

import com.vivo.push.restructure.request.a.a.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f14638a;
    private int b;
    private JSONArray c;

    public a() {
        this.f14638a = 0;
        this.c = new JSONArray();
    }

    public final void a(int i) {
        this.c.put(i);
    }

    public final long b() throws JSONException {
        int i = this.f14638a;
        if (i >= this.b) {
            return 0L;
        }
        JSONArray jSONArray = this.c;
        this.f14638a = i + 1;
        return jSONArray.getLong(i);
    }

    public final String c() throws JSONException {
        int i = this.f14638a;
        if (i >= this.b) {
            return null;
        }
        JSONArray jSONArray = this.c;
        this.f14638a = i + 1;
        return jSONArray.getString(i);
    }

    public final String d() {
        JSONArray jSONArray = this.c;
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return "";
    }

    public final void a(long j) {
        this.c.put(j);
    }

    public final void a(String str) {
        this.c.put(str);
    }

    public a(String str) throws JSONException {
        this.f14638a = 0;
        JSONArray jSONArray = new JSONArray(str);
        this.c = jSONArray;
        this.f14638a = 0;
        this.b = jSONArray.length();
    }

    public final <T extends c> void a(List<T> list) {
        if (list != null) {
            this.c.put(list.size());
            for (T t : list) {
                this.c.put(t.a());
            }
            return;
        }
        this.c.put((Object) null);
    }

    public final int a() throws JSONException {
        int i = this.f14638a;
        if (i >= this.b) {
            return 0;
        }
        JSONArray jSONArray = this.c;
        this.f14638a = i + 1;
        return jSONArray.getInt(i);
    }

    public final <T extends c> void a(c.a<T> aVar, List<T> list) throws JSONException {
        T t;
        int i = this.f14638a;
        if (i < this.b ? this.c.isNull(i) : true) {
            this.f14638a++;
            return;
        }
        JSONArray jSONArray = this.c;
        int i2 = this.f14638a;
        this.f14638a = i2 + 1;
        int i3 = jSONArray.getInt(i2);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f14638a;
            if (i5 < this.b) {
                JSONArray jSONArray2 = this.c;
                this.f14638a = i5 + 1;
                t = aVar.a(jSONArray2.getString(i5));
            } else {
                t = null;
            }
            list.add(t);
        }
    }
}
