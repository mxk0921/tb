package com.meizu.cloud.pushsdk.f.f;

import android.content.Context;
import com.meizu.cloud.pushsdk.f.g.a;
import com.meizu.cloud.pushsdk.f.g.c;
import com.meizu.cloud.pushsdk.f.g.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5875a = "b";
    private String b;
    private String c;
    private String d;
    private int e;
    private final String f = "SQLITE";
    private final AtomicBoolean g = new AtomicBoolean(false);
    private long h;
    private final long i;
    private final long j;
    private final Context k;

    public b(long j, long j2, TimeUnit timeUnit, Context context) {
        this.c = null;
        this.e = 0;
        this.i = timeUnit.toMillis(j);
        this.j = timeUnit.toMillis(j2);
        this.k = context;
        Map c = c();
        if (c != null) {
            try {
                String obj = c.get("userId").toString();
                String obj2 = c.get("sessionId").toString();
                int intValue = ((Integer) c.get("sessionIndex")).intValue();
                this.b = obj;
                this.e = intValue;
                this.c = obj2;
            } catch (Exception e) {
                c.b(f5875a, "Exception occurred retrieving session info from file: %s", e.getMessage());
            }
            g();
            f();
            c.c(f5875a, "Tracker Session Object created.", new Object[0]);
        }
        this.b = e.a();
        g();
        f();
        c.c(f5875a, "Tracker Session Object created.", new Object[0]);
    }

    private Map c() {
        return a.a("snowplow_session_vars", this.k);
    }

    private boolean e() {
        return a.a("snowplow_session_vars", d(), this.k);
    }

    private void f() {
        this.h = System.currentTimeMillis();
    }

    private void g() {
        this.d = this.c;
        this.c = e.a();
        this.e++;
        String str = f5875a;
        c.a(str, "Session information is updated:", new Object[0]);
        c.a(str, " + Session ID: %s", this.c);
        c.a(str, " + Previous Session ID: %s", this.d);
        c.a(str, " + Session Index: %s", Integer.valueOf(this.e));
        e();
    }

    public void a() {
        long j;
        c.a(f5875a, "Checking and updating session information.", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.g.get()) {
            j = this.j;
        } else {
            j = this.i;
        }
        if (!e.a(this.h, currentTimeMillis, j)) {
            g();
            f();
        }
    }

    public com.meizu.cloud.pushsdk.f.b.b b() {
        c.c(f5875a, "Getting session context...", new Object[0]);
        f();
        return new com.meizu.cloud.pushsdk.f.b.b("client_session", d());
    }

    public Map d() {
        HashMap hashMap = new HashMap(8);
        hashMap.put("userId", this.b);
        hashMap.put("sessionId", this.c);
        hashMap.put("previousSessionId", this.d);
        hashMap.put("sessionIndex", Integer.valueOf(this.e));
        hashMap.put("storageMechanism", "SQLITE");
        return hashMap;
    }
}
