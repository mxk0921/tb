package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cp {

    /* renamed from: a  reason: collision with root package name */
    private String f14808a;

    /* renamed from: a  reason: collision with other field name */
    private final ArrayList<co> f809a = new ArrayList<>();

    public cp() {
    }

    public synchronized co a() {
        for (int size = this.f809a.size() - 1; size >= 0; size--) {
            co coVar = this.f809a.get(size);
            if (coVar.m556a()) {
                cs.a().m567a(coVar.a());
                return coVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14808a);
        sb.append("\n");
        Iterator<co> it = this.f809a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public cp(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f14808a = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    public synchronized cp a(JSONObject jSONObject) {
        this.f14808a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f809a.add(new co(this.f14808a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m557a() {
        return this.f14808a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ArrayList<co> m558a() {
        return this.f809a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized JSONObject m559a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("host", this.f14808a);
            JSONArray jSONArray = new JSONArray();
            Iterator<co> it = this.f809a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m554a());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public synchronized void a(co coVar) {
        int i = 0;
        while (true) {
            try {
                if (i >= this.f809a.size()) {
                    break;
                } else if (this.f809a.get(i).a(coVar)) {
                    this.f809a.set(i, coVar);
                    break;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i >= this.f809a.size()) {
            this.f809a.add(coVar);
        }
    }

    public synchronized void a(boolean z) {
        ArrayList<co> arrayList;
        try {
            for (int size = this.f809a.size() - 1; size >= 0; size--) {
                co coVar = this.f809a.get(size);
                if (z) {
                    if (coVar.c()) {
                        arrayList = this.f809a;
                        arrayList.remove(size);
                    }
                } else if (!coVar.b()) {
                    arrayList = this.f809a;
                    arrayList.remove(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
