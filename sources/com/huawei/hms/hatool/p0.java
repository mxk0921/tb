package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;
import tb.xg4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private long f5399a = xg4.DEFAULT_SMALL_MAX_AGE;
    private volatile boolean b = false;
    private a c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f5400a = UUID.randomUUID().toString().replace("-", "");
        boolean b = true;
        private long c;

        public a(long j) {
            this.f5400a += "_" + j;
            this.c = j;
            p0.this.b = false;
        }

        private void b(long j) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f5400a = uuid;
            this.f5400a = uuid.replace("-", "");
            this.f5400a += "_" + j;
            this.c = j;
            this.b = true;
        }

        public void a(long j) {
            if (p0.this.b) {
                p0.this.b = false;
                b(j);
            } else if (b(this.c, j) || a(this.c, j)) {
                b(j);
            } else {
                this.c = j;
                this.b = false;
            }
        }

        private boolean a(long j, long j2) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            return (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) ? false : true;
        }

        private boolean b(long j, long j2) {
            return j2 - j >= p0.this.f5399a;
        }
    }

    public String a() {
        a aVar = this.c;
        if (aVar != null) {
            return aVar.f5400a;
        }
        v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    public void a(long j) {
        a aVar = this.c;
        if (aVar == null) {
            v.c("hmsSdk", "Session is first flush");
            this.c = new a(j);
            return;
        }
        aVar.a(j);
    }

    public boolean b() {
        a aVar = this.c;
        if (aVar != null) {
            return aVar.b;
        }
        v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
