package com.alibaba.analytics.core.sync;

import android.os.SystemClock;
import anet.channel.Constants;
import com.alibaba.analytics.core.model.Log;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.sync.UploadLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bmv;
import tb.fpv;
import tb.nhh;
import tb.o2w;
import tb.oe2;
import tb.ofh;
import tb.ozt;
import tb.pfj;
import tb.q6e;
import tb.qe2;
import tb.qzt;
import tb.szt;
import tb.t2o;
import tb.uzt;
import tb.vzt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b extends UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile b m = null;
    public volatile boolean d = false;
    public int e = -1;
    public int f = 0;
    public float g = 200.0f;
    public int h = 0;
    public long i = 0;
    public int j = -1;
    public boolean k = true;
    public boolean l = true;

    static {
        t2o.a(962592957);
    }

    public static b i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d0633906", new Object[0]);
        }
        if (m == null) {
            synchronized (b.class) {
                try {
                    if (m == null) {
                        m = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/sync/UploadLogFromDB");
    }

    public final List<Log> f(List<Log> list, Log log) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e92e2b93", new Object[]{this, list, log});
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(log);
        return list;
    }

    public final void h(Boolean bool, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9fb4ce", new Object[]{this, bool, new Long(j)});
        } else if (j >= 0) {
            float f = this.h / ((float) j);
            if (!bool.booleanValue()) {
                this.e /= 2;
                this.f++;
            } else if (j <= Constants.MAX_SESSION_IDLE_TIME) {
                this.e = (int) (((f * 45000.0f) / this.g) - this.f);
            } else {
                return;
            }
            int i = this.e;
            if (i < 1) {
                this.e = 1;
                this.f = 0;
            } else if (i > 350) {
                this.e = 350;
            }
            nhh.f("UploadLogFromDB", "WinSize", Integer.valueOf(this.e));
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("408c319b", new Object[]{this})).intValue();
        }
        if (this.e == -1) {
            k();
        }
        return this.e;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00b88d4", new Object[]{this});
            return;
        }
        String h = NetworkUtil.h();
        if ("Wi-Fi".equalsIgnoreCase(h)) {
            this.e = 50;
        } else if ("4G".equalsIgnoreCase(h)) {
            this.e = 40;
        } else if ("3G".equalsIgnoreCase(h)) {
            this.e = 30;
        } else {
            this.e = 40;
        }
        this.f = 0;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
            return;
        }
        try {
            if (!o2w.k().D()) {
                n();
            } else {
                nhh.v("UploadLogFromDB", "isAllServiceClosed");
            }
        } catch (Throwable th) {
            nhh.h("UploadLogFromDB", th, new Object[0]);
        }
        try {
            q6e q6eVar = this.b;
            if (q6eVar != null) {
                q6eVar.a(this.i);
            }
        } catch (Throwable th2) {
            nhh.h("UploadLogFromDB", th2, new Object[0]);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb96231e", new Object[]{this});
            return;
        }
        int i = this.e / 2;
        this.e = i;
        if (i < 1) {
            this.e = 1;
            this.f = 0;
        } else if (i > 350) {
            this.e = 350;
        }
        nhh.f("UploadLogFromDB", "winsize", Integer.valueOf(this.e));
    }

    public final Map<String, String> g(List<Log> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7889cfa6", new Object[]{this, list});
        }
        HashMap hashMap = null;
        List<Log> list2 = null;
        hashMap = null;
        if (list != null && !list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Log log = list.get(i2);
                if (i > 5242880) {
                    list2 = f(list2, log);
                    nhh.f("UploadLogFromDB", "log delay to upload because totalUploadSize Exceed. log", log, "totalUploadSize", Integer.valueOf(i));
                } else {
                    StringBuilder sb = (StringBuilder) hashMap2.get(log.eventId);
                    if (sb == null) {
                        sb = new StringBuilder();
                        hashMap2.put(log.eventId, sb);
                    } else {
                        sb.append((char) 1);
                        i++;
                    }
                    i += list.get(i2).getContentForStringBuilder(sb);
                }
            }
            if (list2 != null) {
                list.removeAll(list2);
            }
            hashMap = new HashMap();
            this.h = i;
            for (String str : hashMap2.keySet()) {
                StringBuilder sb2 = (StringBuilder) hashMap2.get(str);
                if (sb2 != null) {
                    hashMap.put(str, sb2.toString());
                }
            }
            if (!list.isEmpty()) {
                this.g = this.h / list.size();
            }
            nhh.f("UploadLogFromDB", "averagePackageSize", Float.valueOf(this.g), "mUploadByteSize", Integer.valueOf(this.h), "count", Integer.valueOf(list.size()));
        }
        return hashMap;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551c3272", new Object[]{this});
            return;
        }
        nhh.d();
        if (!NetworkUtil.i(o2w.k().g())) {
            nhh.f("UploadLogFromDB", "Network is Disconnected");
            return;
        }
        UploadLog.NetworkStatus networkStatus = UploadLog.NetworkStatus.ALL;
        UploadLog.NetworkStatus networkStatus2 = this.c;
        if (networkStatus != networkStatus2 && networkStatus2 != a()) {
            nhh.v("UploadLogFromDB", "current networkstatus", a(), "mAllowedNetworkStatus", this.c);
        } else if (!this.d) {
            this.d = true;
            try {
                this.i = 0L;
            } catch (Throwable th) {
                try {
                    nhh.h("UploadLogFromDB", th, new Object[0]);
                } finally {
                    this.d = false;
                    pfj.b();
                }
            }
            if (!pfj.a(o2w.k().g())) {
                nhh.f("UploadLogFromDB", "Other Process is Uploading, break");
                return;
            }
            List<Log> k = ofh.l().k(j());
            if (k != null && !k.isEmpty()) {
                if (this.j <= 0) {
                    this.j = this.f2126a;
                }
                nhh.f("UploadLogFromDB", "mUploadIndex", Integer.valueOf(this.j), "mMaxUploadTimes", Integer.valueOf(this.f2126a));
                if (o(k, this.j == this.f2126a)) {
                    this.j = this.f2126a;
                } else {
                    int i = this.j - 1;
                    this.j = i;
                    if (i > 0) {
                        bmv.b().a(bmv.MSGTYPE_INTERVAL);
                    } else {
                        this.j = this.f2126a;
                    }
                }
                return;
            }
            nhh.f("UploadLogFromDB", "logs is null");
            this.j = this.f2126a;
            this.d = false;
        }
    }

    public final boolean o(List<Log> list, boolean z) {
        byte[] bArr;
        qe2 qe2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee15110", new Object[]{this, list, new Boolean(z)})).booleanValue();
        }
        nhh.f("UploadLogFromDB", "firstRequest", Boolean.valueOf(z), "firstLaunch", Boolean.valueOf(this.k));
        this.k = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, String> g = g(list);
        if (g == null || g.isEmpty()) {
            nhh.f("UploadLogFromDB", "postDataMap is null");
            this.d = false;
            return true;
        }
        if (!o2w.k().H()) {
            if (this.l && z && qzt.b().d() == 2 && qzt.b().c() == 0 && uzt.b().c() == 0 && uzt.b().a() > 0) {
                nhh.f("UploadLogFromDB", "forceCloseSession");
                vzt.q();
                this.l = false;
            }
            if (vzt.w()) {
                ozt e = qzt.b().e();
                nhh.f("UploadLogFromDB", "CreateSession tnet host", e.a(), "port", Integer.valueOf(e.b()), "type", Integer.valueOf(e.d()));
                if (e.d() == 1) {
                    szt.d().i(true);
                } else {
                    szt.d().i(false);
                }
            } else {
                ozt f = qzt.b().f();
                nhh.f("UploadLogFromDB", "TempSession tnet host", f.a(), "port", Integer.valueOf(f.b()), "type", Integer.valueOf(f.d()));
            }
        } else {
            szt.d().i(false);
        }
        try {
            bArr = oe2.f(g, z);
        } catch (Exception e2) {
            Object[] objArr = {e2.toString()};
            bArr = null;
            nhh.i(null, objArr);
        }
        if (bArr == null) {
            l();
            return false;
        }
        if (nhh.n()) {
            nhh.f("", "packRequest cost time", Long.valueOf(System.currentTimeMillis() - elapsedRealtime));
        }
        if (o2w.k().H()) {
            qe2Var = fpv.a(bArr);
        } else {
            qe2Var = vzt.v(bArr);
            qe2Var.f = z;
        }
        boolean a2 = qe2Var.a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j = elapsedRealtime2 - elapsedRealtime;
        h(Boolean.valueOf(a2), j);
        qzt.b().g(qe2Var);
        if (a2) {
            this.i += ofh.l().i(list);
            try {
                b(qe2Var.e);
            } catch (Exception unused) {
            }
        }
        nhh.m("UploadLogFromDB", "isSendSuccess", Boolean.valueOf(a2), "upload log count", Integer.valueOf(list.size()), "upload consume", Long.valueOf(j), "delete consume", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime2));
        return false;
    }
}
