package tb;

import com.alibaba.analytics.core.model.Log;
import com.alibaba.analytics.core.sync.UploadLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class flv extends UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile flv h = new flv();
    public volatile boolean d = false;
    public final List<Log> e = new ArrayList();
    public final List<Log> f = new ArrayList();
    public boolean g = false;

    static {
        t2o.a(962592958);
    }

    public static flv h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (flv) ipChange.ipc$dispatch("980ee064", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Object ipc$super(flv flvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/sync/UploadLogFromStartCache");
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d19a541", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            if (!z) {
                try {
                    Iterator it = ((ArrayList) this.f).iterator();
                    while (it.hasNext()) {
                        ofh.l().e((Log) it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
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
        if (!this.d) {
            this.d = true;
            try {
            } catch (Throwable th) {
                try {
                    nhh.h(null, th, new Object[0]);
                } finally {
                    this.d = false;
                }
            }
            if (((ArrayList) this.e).size() == 0) {
                this.d = false;
            } else {
                k();
            }
        }
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8dbc75", new Object[]{this});
        }
        if (((ArrayList) this.e).size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            try {
                ((ArrayList) this.f).clear();
                for (int i = 0; i < ((ArrayList) this.e).size(); i++) {
                    Log log = (Log) ((ArrayList) this.e).get(i);
                    ((ArrayList) this.f).add(log);
                    StringBuilder sb = (StringBuilder) hashMap.get(log.eventId);
                    if (sb == null) {
                        sb = new StringBuilder();
                        hashMap.put(log.eventId, sb);
                    } else {
                        sb.append((char) 1);
                    }
                    ((Log) ((ArrayList) this.e).get(i)).getContentForStringBuilder(sb);
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
            nhh.f("UploadLogFromStartCache", "upload log count", Integer.valueOf(((ArrayList) this.f).size()));
        }
        return hashMap2;
    }

    public boolean f(Log log) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("273a5445", new Object[]{this, log})).booleanValue();
        }
        if (wu3.c().h()) {
            nhh.f("UploadLogFromStartCache", "isInitUTServer true");
            return false;
        }
        if (nhh.n()) {
            StringBuilder sb = new StringBuilder();
            log.getContentForStringBuilderWithDebug(sb, true);
            nhh.m("UploadLogFromStartCache", "addLog", sb.toString());
        }
        synchronized (this) {
            ((ArrayList) this.e).add(log);
        }
        bmv.b().a(bmv.MSGTYPE_START_LOG);
        return true;
    }

    public final boolean k() throws Exception {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c298b30c", new Object[]{this})).booleanValue();
        }
        nhh.d();
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> g = g();
        if (g == null || g.size() == 0) {
            this.d = false;
            return true;
        }
        if (!this.g) {
            erx.e().c();
            uzt.b().h(false);
            tzt.c().f(false);
            b1v.bXmodule = false;
            oe2.c();
            this.g = true;
        }
        try {
            bArr = oe2.h(g);
        } catch (Exception e) {
            nhh.h(null, e, new Object[0]);
            bArr = null;
        }
        if (bArr == null) {
            nhh.f("UploadLogFromStartCache", "packRequest is null");
            return false;
        }
        if (nhh.n()) {
            nhh.f("UploadLogFromStartCache", "packRequest cost time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        if (vzt.w()) {
            ozt e2 = qzt.b().e();
            nhh.m("UploadLogFromStartCache", "CreateSession tnet host", e2.a(), "port", Integer.valueOf(e2.b()), "type", Integer.valueOf(e2.d()));
        }
        qe2 v = vzt.v(bArr);
        boolean a2 = v.a();
        i(a2);
        if (nhh.n()) {
            nhh.m("UploadLogFromStartCache", "isSendSuccess", Boolean.valueOf(a2), gat.CT, Long.valueOf(v.b), "rt", Long.valueOf(v.c), "upload cost time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "from init cost", Long.valueOf(System.currentTimeMillis() - UTAnalytics.testTime));
        }
        return false;
    }
}
