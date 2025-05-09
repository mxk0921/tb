package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class as {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean d;
    public static long e;
    public static long f;
    public static long g;
    public static volatile as h;

    /* renamed from: a  reason: collision with root package name */
    public long f15968a;
    public final List<rp9> b = new ArrayList();
    public boolean c = true;

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5da7f", new Object[]{str});
            return;
        }
        d = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(str, "needMonitor", "false"));
        e = Long.parseLong(OrangeConfig.getInstance().getConfig(str, "maxUnitTimeFlow", "100"));
        f = Long.parseLong(OrangeConfig.getInstance().getConfig(str, "maxMemoryRecord", "50"));
        g = Long.parseLong(OrangeConfig.getInstance().getConfig(str, "maxFileSize", "2000"));
    }

    public static as c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (as) ipChange.ipc$dispatch("948e598", new Object[0]);
        }
        if (h == null) {
            synchronized (as.class) {
                try {
                    if (h == null) {
                        h = new as();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public synchronized void a(String str, String str2, String str3, boolean z, long j, long j2) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946183c2", new Object[]{this, str, str2, str3, new Boolean(z), new Long(j), new Long(j2)});
            return;
        }
        if (!(!d || e == 0 || f == 0 || g == 0)) {
            if (this.c) {
                d();
                this.c = false;
            }
            if (TextUtils.isEmpty(str3) || str3.length() <= 128) {
                str4 = str3;
            } else {
                str4 = srj.b(str3);
            }
            if (((ArrayList) this.b).size() <= f) {
                ((ArrayList) this.b).add(new rp9(str, str2, str4, z, srj.f28231a, j, j2));
            } else {
                e(false);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ad77ac", new Object[]{this});
        } else {
            this.f15968a = System.currentTimeMillis();
        }
    }

    public synchronized void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf46ea5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!(this.f15968a == 0 || !d || e == 0 || f == 0 || g == 0)) {
            Iterator it = ((ArrayList) this.b).iterator();
            long j = 0;
            while (it.hasNext()) {
                rp9 rp9Var = (rp9) it.next();
                j += rp9Var.f + rp9Var.g;
            }
            if (j > (System.currentTimeMillis() - this.f15968a) * e) {
                f(this.b);
                AppMonitor.Counter.commit("networkPrefer", "invalidFlow", null, ((ArrayList) this.b).size());
            }
            if (z) {
                this.f15968a = 0L;
            } else {
                this.f15968a = System.currentTimeMillis();
            }
            ((ArrayList) this.b).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[Catch: all -> 0x003f, Exception -> 0x0042, TryCatch #4 {Exception -> 0x0042, all -> 0x003f, blocks: (B:9:0x0019, B:11:0x0028, B:13:0x002e, B:15:0x003b, B:19:0x0045, B:21:0x0053, B:23:0x005f, B:24:0x006a, B:25:0x0077, B:27:0x007d, B:32:0x0092, B:34:0x009d, B:36:0x00a5, B:39:0x00c0, B:40:0x00c2, B:43:0x00d1, B:44:0x00d3, B:45:0x0102), top: B:59:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[Catch: all -> 0x003f, Exception -> 0x0042, TryCatch #4 {Exception -> 0x0042, all -> 0x003f, blocks: (B:9:0x0019, B:11:0x0028, B:13:0x002e, B:15:0x003b, B:19:0x0045, B:21:0x0053, B:23:0x005f, B:24:0x006a, B:25:0x0077, B:27:0x007d, B:32:0x0092, B:34:0x009d, B:36:0x00a5, B:39:0x00c0, B:40:0x00c2, B:43:0x00d1, B:44:0x00d3, B:45:0x0102), top: B:59:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List<tb.rp9> r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.as.f(java.util.List):void");
    }
}
