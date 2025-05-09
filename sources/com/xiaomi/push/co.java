package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.pod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class co {

    /* renamed from: a  reason: collision with other field name */
    private long f805a;

    /* renamed from: a  reason: collision with other field name */
    public String f806a;

    /* renamed from: b  reason: collision with other field name */
    public String f808b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    protected String h;
    private String i;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<cx> f807a = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private double f14807a = 0.1d;
    private String j = "s.mi1.cc";
    private long b = 86400000;

    public co(String str) {
        this.f806a = "";
        if (!TextUtils.isEmpty(str)) {
            this.f805a = System.currentTimeMillis();
            this.f807a.add(new cx(str, -1));
            this.f806a = cs.m562a();
            this.f808b = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    private synchronized void c(String str) {
        Iterator<cx> it = this.f807a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f824a, str)) {
                it.remove();
            }
        }
    }

    public synchronized co a(JSONObject jSONObject) {
        this.f806a = jSONObject.optString("net");
        this.b = jSONObject.getLong(RemoteMessageConst.TTL);
        this.f14807a = jSONObject.getDouble("pct");
        this.f805a = jSONObject.getLong("ts");
        this.d = jSONObject.optString("city");
        this.c = jSONObject.optString("prv");
        this.g = jSONObject.optString("cty");
        this.e = jSONObject.optString("isp");
        this.f = jSONObject.optString(pod.IP);
        this.f808b = jSONObject.optString("host");
        this.h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new cx().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public void b(String str) {
        this.j = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f806a);
        sb.append("\n");
        sb.append(a());
        Iterator<cx> it = this.f807a.iterator();
        while (it.hasNext()) {
            sb.append("\n");
            sb.append(it.next().toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        } else if (TextUtils.isEmpty(this.e)) {
            return "hardcode_isp";
        } else {
            String a2 = bm.a(new String[]{this.e, this.c, this.d, this.g, this.f}, "_");
            this.i = a2;
            return a2;
        }
    }

    public void b(String str, long j, long j2) {
        a(str, 0, j, j2, null);
    }

    public boolean c() {
        long j = this.b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f805a;
        return currentTimeMillis - j2 > j || (currentTimeMillis - j2 > this.b && this.f806a.startsWith("WIFI-"));
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized ArrayList<String> m553a() {
        return a(false);
    }

    public void b(String str, long j, long j2, Exception exc) {
        a(str, -1, j, j2, exc);
    }

    public ArrayList<String> a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (TextUtils.equals(url.getHost(), this.f808b)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<String> it = a(true).iterator();
                while (it.hasNext()) {
                    cq a2 = cq.a(it.next(), url.getPort());
                    arrayList.add(new URL(url.getProtocol(), a2.m561a(), a2.a(), url.getFile()).toString());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f805a < this.b;
    }

    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        try {
            int size = this.f807a.size();
            cx[] cxVarArr = new cx[size];
            this.f807a.toArray(cxVarArr);
            Arrays.sort(cxVarArr);
            arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                cx cxVar = cxVarArr[i];
                if (z) {
                    substring = cxVar.f824a;
                } else {
                    int indexOf = cxVar.f824a.indexOf(":");
                    substring = indexOf != -1 ? cxVar.f824a.substring(0, indexOf) : cxVar.f824a;
                }
                arrayList.add(substring);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized JSONObject m554a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("net", this.f806a);
            jSONObject.put(RemoteMessageConst.TTL, this.b);
            jSONObject.put("pct", this.f14807a);
            jSONObject.put("ts", this.f805a);
            jSONObject.put("city", this.d);
            jSONObject.put("prv", this.c);
            jSONObject.put("cty", this.g);
            jSONObject.put("isp", this.e);
            jSONObject.put(pod.IP, this.f);
            jSONObject.put("host", this.f808b);
            jSONObject.put("xf", this.h);
            JSONArray jSONArray = new JSONArray();
            Iterator<cx> it = this.f807a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().a());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public void a(double d) {
        this.f14807a = d;
    }

    public void a(long j) {
        if (j > 0) {
            this.b = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    public synchronized void a(cx cxVar) {
        c(cxVar.f824a);
        this.f807a.add(cxVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m555a(String str) {
        a(new cx(str));
    }

    public void a(String str, int i, long j, long j2, Exception exc) {
        a(str, new cn(i, j, j2, exc));
    }

    public void a(String str, long j, long j2) {
        try {
            b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j, long j2, Exception exc) {
        try {
            b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        r1.a(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(java.lang.String r4, com.xiaomi.push.cn r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<com.xiaomi.push.cx> r0 = r3.f807a     // Catch: all -> 0x001f
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x001f
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch: all -> 0x001f
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()     // Catch: all -> 0x001f
            com.xiaomi.push.cx r1 = (com.xiaomi.push.cx) r1     // Catch: all -> 0x001f
            java.lang.String r2 = r1.f824a     // Catch: all -> 0x001f
            boolean r2 = android.text.TextUtils.equals(r4, r2)     // Catch: all -> 0x001f
            if (r2 == 0) goto L_0x0007
            r1.a(r5)     // Catch: all -> 0x001f
            goto L_0x0021
        L_0x001f:
            r4 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            monitor-exit(r3)     // Catch: all -> 0x001f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.co.a(java.lang.String, com.xiaomi.push.cn):void");
    }

    public synchronized void a(String[] strArr) {
        int i;
        try {
            int size = this.f807a.size() - 1;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                int length = strArr.length;
                while (true) {
                    if (i < length) {
                        if (TextUtils.equals(this.f807a.get(size).f824a, strArr[i])) {
                            this.f807a.remove(size);
                            break;
                        }
                        i++;
                    }
                }
                size--;
            }
            Iterator<cx> it = this.f807a.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = it.next().f14814a;
                if (i3 > i2) {
                    i2 = i3;
                }
            }
            while (i < strArr.length) {
                a(new cx(strArr[i], (strArr.length + i2) - i));
                i++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m556a() {
        return TextUtils.equals(this.f806a, cs.m562a());
    }

    public boolean a(co coVar) {
        return TextUtils.equals(this.f806a, coVar.f806a);
    }
}
