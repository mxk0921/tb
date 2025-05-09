package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.fq;
import com.xiaomi.push.fr;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bq {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, c> f15080a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a extends XMPushService.j {
        public a() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "RecordTimeManager clear";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            bq.a().m1059a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final bq f15081a = new bq();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        long f15082a;
        long b;
        long c;
        long d;

        private c() {
        }

        public long a() {
            long j = this.c;
            long j2 = this.b;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }

        public long b() {
            long j = this.d;
            long j2 = this.c;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }
    }

    public static bq a() {
        return b.f15081a;
    }

    public void b(String str, long j) {
        c remove = this.f15080a.remove(str);
        if (remove != null) {
            remove.d = j;
            a(str, remove);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1059a() {
        if (!this.f15080a.isEmpty()) {
            Iterator<Map.Entry<String, c>> it = this.f15080a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, c> next = it.next();
                if (!(next == null || next.getValue() == null)) {
                    c value = next.getValue();
                    if (Math.abs(SystemClock.elapsedRealtime() - value.b) > 10000) {
                        a(next.getKey(), value);
                    }
                }
                it.remove();
            }
        }
    }

    public void a(String str, long j) {
        c cVar = this.f15080a.get(str);
        if (cVar != null) {
            cVar.c = j;
        }
    }

    public void a(String str, long j, long j2) {
        c cVar = new c();
        cVar.f15082a = j2;
        cVar.b = j;
        this.f15080a.put(str, cVar);
    }

    private void a(String str, c cVar) {
        if (!TextUtils.isEmpty(str) && cVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("xmsfVC", Long.valueOf(cVar.f15082a));
            hashMap.put("packetId", str);
            hashMap.put("pTime", Long.valueOf(cVar.a()));
            hashMap.put("bTime", Long.valueOf(cVar.b()));
            fr.a().a(new fq("msg_process_time", hashMap));
        }
    }
}
