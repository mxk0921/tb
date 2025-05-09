package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class cx implements Comparable<cx> {

    /* renamed from: a  reason: collision with root package name */
    protected int f14814a;

    /* renamed from: a  reason: collision with other field name */
    private long f823a;

    /* renamed from: a  reason: collision with other field name */
    String f824a;

    /* renamed from: a  reason: collision with other field name */
    private final LinkedList<cn> f825a;

    public cx() {
        this(null, 0);
    }

    /* renamed from: a */
    public int compareTo(cx cxVar) {
        if (cxVar == null) {
            return 1;
        }
        return cxVar.f14814a - this.f14814a;
    }

    public String toString() {
        return this.f824a + ":" + this.f14814a;
    }

    public cx(String str) {
        this(str, 0);
    }

    public synchronized cx a(JSONObject jSONObject) {
        this.f823a = jSONObject.getLong(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
        this.f14814a = jSONObject.getInt("wt");
        this.f824a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f825a.add(new cn().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public cx(String str, int i) {
        this.f825a = new LinkedList<>();
        this.f823a = 0L;
        this.f824a = str;
        this.f14814a = i;
    }

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.f823a);
            jSONObject.put("wt", this.f14814a);
            jSONObject.put("host", this.f824a);
            JSONArray jSONArray = new JSONArray();
            Iterator<cn> it = this.f825a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m552a());
            }
            jSONObject.put("ah", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public synchronized void a(cn cnVar) {
        if (cnVar != null) {
            try {
                this.f825a.add(cnVar);
                int a2 = cnVar.a();
                if (a2 > 0) {
                    this.f14814a += cnVar.a();
                } else {
                    int i = 0;
                    for (int size = this.f825a.size() - 1; size >= 0 && this.f825a.get(size).a() < 0; size--) {
                        i++;
                    }
                    this.f14814a += a2 * i;
                }
                if (this.f825a.size() > 30) {
                    this.f14814a -= this.f825a.remove().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
