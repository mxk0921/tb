package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.MRTJobRefuseReason;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class crh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final crh e = new crh();

    /* renamed from: a  reason: collision with root package name */
    public final long f17259a = 90000;
    public final Set<String> b = new HashSet();
    public int c = 0;
    public final HashSet<b> d = new HashSet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final drh f17261a;
        public final String b;
        public final long c;
        public final String d;
        public final String e;

        static {
            t2o.a(577765438);
        }

        public b(String str, String str2, long j, drh drhVar, String str3) {
            this.d = str;
            this.e = str2;
            this.c = j;
            this.f17261a = drhVar;
            this.b = str3;
        }
    }

    static {
        t2o.a(577765436);
    }

    public crh() {
        j();
    }

    public static /* synthetic */ HashSet a(crh crhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("a09faa10", new Object[]{crhVar});
        }
        return crhVar.d;
    }

    public static /* synthetic */ long b(crh crhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73bb7e8", new Object[]{crhVar})).longValue();
        }
        return crhVar.f17259a;
    }

    public static /* synthetic */ Set c(crh crhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f23b3964", new Object[]{crhVar});
        }
        return crhVar.b;
    }

    public static /* synthetic */ int d(crh crhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2300469", new Object[]{crhVar})).intValue();
        }
        return crhVar.c;
    }

    public static /* synthetic */ int e(crh crhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6c0187e", new Object[]{crhVar, new Integer(i)})).intValue();
        }
        crhVar.c = i;
        return i;
    }

    public static crh g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crh) ipChange.ipc$dispatch("c7d9e700", new Object[0]);
        }
        return e;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6782fc9", new Object[]{this, str});
            return;
        }
        ((HashSet) this.b).add(str);
        kgh.a("MRTThreadMonitor", "task " + str + " execute timeout");
    }

    public MRTJobRefuseReason h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTJobRefuseReason) ipChange.ipc$dispatch("af5f162c", new Object[]{this, str});
        }
        if (this.c >= 4) {
            return MRTJobRefuseReason.MRTJobRefuseThreadExceed;
        }
        if (TextUtils.isEmpty(str)) {
            return MRTJobRefuseReason.MRTJobRefuseReasonNone;
        }
        if (MRT.j()) {
            return MRTJobRefuseReason.MRTJobRefuseReasonNone;
        }
        synchronized (this.b) {
            try {
                if (!((HashSet) this.b).contains(str)) {
                    return MRTJobRefuseReason.MRTJobRefuseReasonNone;
                }
                return MRTJobRefuseReason.MRTJobRefuseReasonBug;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee05a5e2", new Object[]{this, bVar});
        } else if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
            this.d.add(bVar);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a908b93", new Object[]{this});
        } else {
            eqh.b().a(new a(), 1000);
        }
    }

    public void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9964982", new Object[]{this, bVar});
        } else if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
            this.d.remove(bVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                try {
                    HashSet hashSet = new HashSet();
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = crh.a(crh.this).iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (currentTimeMillis - bVar.c > crh.b(crh.this)) {
                            kgh.s("MRTThreadMonitor", "任务:" + bVar.d + "执行超时");
                            hashSet.add(bVar);
                            crh.c(crh.this).add(bVar.d);
                        }
                    }
                    if (hashSet.size() > 0) {
                        crh.a(crh.this).removeAll(hashSet);
                        crh crhVar = crh.this;
                        crh.e(crhVar, crh.d(crhVar) + hashSet.size());
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        b bVar2 = (b) it2.next();
                        bVar2.f17261a.d(bVar2.b);
                        xqh.h(null, bVar2.d, "", bVar2.e, "", 151, 0, 1, 0L, 0L, 0L, 0L);
                    }
                } catch (Throwable unused) {
                    kgh.s("MRTThreadMonitor", "monitor task exception");
                }
            } finally {
                eqh.b().a(this, 5000);
            }
        }
    }
}
