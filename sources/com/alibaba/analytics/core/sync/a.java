package com.alibaba.analytics.core.sync;

import com.alibaba.analytics.core.model.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bmv;
import tb.n2v;
import tb.nhh;
import tb.o2w;
import tb.oe2;
import tb.ozt;
import tb.qe2;
import tb.qzt;
import tb.szt;
import tb.t2o;
import tb.vzt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile a g = null;
    public volatile boolean d = false;
    public final List<Log> e = new ArrayList();
    public final List<Log> f = new ArrayList();

    static {
        t2o.a(962592956);
    }

    public static a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4abca2f0", new Object[0]);
        }
        if (g == null) {
            synchronized (a.class) {
                try {
                    if (g == null) {
                        g = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/sync/UploadLogFromCache");
    }

    public void f(Log log) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273a5441", new Object[]{this, log});
            return;
        }
        synchronized (this) {
            try {
                if (((ArrayList) this.e).size() >= 300) {
                    for (int i = 99; i >= 0; i--) {
                        ((ArrayList) this.e).remove(i);
                    }
                }
                ((ArrayList) this.e).add(log);
            } catch (Throwable th) {
                throw th;
            }
        }
        bmv.b().a("r");
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f88bf3", new Object[]{this});
            return;
        }
        synchronized (this) {
            ((ArrayList) this.e).removeAll(this.f);
            ((ArrayList) this.f).clear();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
            return;
        }
        nhh.d();
        try {
            if (!n2v.g().j()) {
                l();
            }
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8dbc75", new Object[]{this});
        }
        if (((ArrayList) this.e).isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                ((ArrayList) this.f).clear();
                int f = n2v.g().f() * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < ((ArrayList) this.e).size(); i++) {
                    Log log = (Log) ((ArrayList) this.e).get(i);
                    if (currentTimeMillis - Long.parseLong(log.time) > f) {
                        arrayList.add(log);
                    } else {
                        ((ArrayList) this.f).add(log);
                        StringBuilder sb = (StringBuilder) hashMap.get(String.valueOf(log.getTopicId()));
                        if (sb == null) {
                            sb = new StringBuilder();
                            hashMap.put(String.valueOf(log.getTopicId()), sb);
                        } else {
                            sb.append((char) 1);
                        }
                        ((Log) ((ArrayList) this.e).get(i)).getContentForStringBuilder(sb);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((ArrayList) this.e).removeAll(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            StringBuilder sb2 = (StringBuilder) hashMap.get(str);
            if (sb2 != null) {
                hashMap2.put(str, sb2.toString());
            }
        }
        if (nhh.n()) {
            nhh.f("UploadLogFromCache", "count", Integer.valueOf(((ArrayList) this.f).size()), "timeoutLogs count", Integer.valueOf(arrayList.size()));
        }
        return hashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        r6.d = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.analytics.core.sync.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "551c3272"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            tb.nhh.d()
            tb.o2w r2 = tb.o2w.k()
            android.content.Context r2 = r2.g()
            boolean r2 = com.alibaba.analytics.core.network.NetworkUtil.i(r2)
            if (r2 != 0) goto L_0x0024
            return
        L_0x0024:
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r2 = com.alibaba.analytics.core.sync.UploadLog.NetworkStatus.ALL
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r3 = r6.c
            if (r2 == r3) goto L_0x004f
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r2 = r6.a()
            if (r3 == r2) goto L_0x004f
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r2 = r6.a()
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r3 = r6.c
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "current networkstatus"
            r4[r0] = r5
            r4[r1] = r2
            java.lang.String r0 = "mAllowedNetworkStatus"
            r1 = 2
            r4[r1] = r0
            r0 = 3
            r4[r0] = r3
            java.lang.String r0 = "network not match,return"
            tb.nhh.v(r0, r4)
            return
        L_0x004f:
            boolean r2 = r6.d
            if (r2 != 0) goto L_0x0081
            r6.d = r1
            r2 = 0
        L_0x0056:
            int r3 = r6.f2126a     // Catch: all -> 0x0067
            if (r2 >= r3) goto L_0x0072
            java.util.List<com.alibaba.analytics.core.model.Log> r3 = r6.e     // Catch: all -> 0x0067
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: all -> 0x0067
            int r3 = r3.size()     // Catch: all -> 0x0067
            if (r3 != 0) goto L_0x0069
            r6.d = r0     // Catch: all -> 0x0067
            goto L_0x0072
        L_0x0067:
            r1 = move-exception
            goto L_0x0075
        L_0x0069:
            boolean r3 = r6.k()     // Catch: all -> 0x0067
            if (r3 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            int r2 = r2 + r1
            goto L_0x0056
        L_0x0072:
            r6.d = r0
            goto L_0x007c
        L_0x0075:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: all -> 0x007d
            r3 = 0
            tb.nhh.h(r3, r1, r2)     // Catch: all -> 0x007d
            goto L_0x0072
        L_0x007c:
            return
        L_0x007d:
            r1 = move-exception
            r6.d = r0
            throw r1
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.analytics.core.sync.a.l():void");
    }

    public final boolean k() {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c298b30c", new Object[]{this})).booleanValue();
        }
        nhh.d();
        Map<String, String> g2 = g();
        if (g2 == null || g2.size() == 0) {
            this.d = false;
            return true;
        }
        try {
            bArr = oe2.g(g2);
        } catch (Exception e) {
            nhh.h(null, e, new Object[0]);
            bArr = null;
        }
        if (bArr == null) {
            nhh.f("", "packRequest is null");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (vzt.w()) {
            ozt e2 = qzt.b().e();
            nhh.m("UploadLogFromCache", "CreateSession tnet host", e2.a(), "port", Integer.valueOf(e2.b()), "type", Integer.valueOf(e2.d()));
            if (e2.d() == 1) {
                szt.d().i(true);
            } else {
                szt.d().i(false);
            }
        }
        qe2 v = vzt.v(bArr);
        boolean a2 = v.a();
        if (a2) {
            i();
            try {
                b(v.e);
            } catch (Exception e3) {
                nhh.f(null, e3);
            }
        } else if (o2w.k().H()) {
            return true;
        }
        if (nhh.n()) {
            nhh.m("", "isSendSuccess", Boolean.valueOf(a2), "cost time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        return false;
    }
}
