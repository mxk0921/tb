package tb;

import com.alibaba.analytics.core.model.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import tb.w2v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ofh implements w2v.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ofh g = new ofh();
    public static int h = 0;
    public static final Object i = new Object();
    public static final Object j = new Object();
    public final List<Log> b = new CopyOnWriteArrayList();
    public final List<mnc> c = Collections.synchronizedList(new ArrayList());
    public ScheduledFuture d = null;
    public final Runnable e = new a();
    public final Runnable f = new b();

    /* renamed from: a  reason: collision with root package name */
    public final snc f25350a = new mfh(o2w.k().g());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ofh.this.n();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ofh.this.n();
            bmv.b().a("bg");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592936);
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ofh.a(ofh.this);
            int count = ofh.b(ofh.this).count();
            if (count > 9000) {
                ofh.c(ofh.this, count);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592937);
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int count = ofh.b(ofh.this).count();
            if (count > 9000) {
                ofh.c(ofh.this, count);
            }
        }
    }

    static {
        t2o.a(962592933);
        t2o.a(962593012);
    }

    public ofh() {
        zdt.c().f(new c());
        w2v.d(this);
    }

    public static /* synthetic */ int a(ofh ofhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b32de452", new Object[]{ofhVar})).intValue();
        }
        return ofhVar.g();
    }

    public static /* synthetic */ snc b(ofh ofhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snc) ipChange.ipc$dispatch("28af8d53", new Object[]{ofhVar});
        }
        return ofhVar.f25350a;
    }

    public static /* synthetic */ int c(ofh ofhVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6c617b5", new Object[]{ofhVar, new Integer(i2)})).intValue();
        }
        return ofhVar.f(i2);
    }

    public static ofh l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofh) ipChange.ipc$dispatch("6db6392c", new Object[0]);
        }
        return g;
    }

    public void d(Log log) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4bdc7f", new Object[]{this, log});
            return;
        }
        if (nhh.n()) {
            StringBuilder sb = new StringBuilder();
            log.getContentForStringBuilderWithDebug(sb, true);
            nhh.m("LogStoreMgr", "addLog", sb.toString());
        }
        synchronized (j) {
            ((CopyOnWriteArrayList) this.b).add(log);
            size = ((CopyOnWriteArrayList) this.b).size();
        }
        if (size >= 45 || o2w.k().K()) {
            this.d = zdt.c().d(null, this.e, 0L);
        } else {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.d = zdt.c().d(this.d, this.e, 5000L);
            }
        }
        if (log != null && log.eventId.equalsIgnoreCase("1010")) {
            zdt.c().d(null, this.f, 0L);
        }
        synchronized (i) {
            try {
                int i2 = h + 1;
                h = i2;
                if (i2 > 5000) {
                    h = 0;
                    zdt.c().f(new d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Log log) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828e36f", new Object[]{this, log});
            return;
        }
        d(log);
        n();
    }

    public final int f(int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b700c8c1", new Object[]{this, new Integer(i2)})).intValue();
        }
        if (i2 > 9000) {
            i3 = ((mfh) this.f25350a).a(i2 - 8000);
        } else {
            i3 = 0;
        }
        nhh.f("LogStoreMgr", "clearOldLogByCount", Integer.valueOf(i3));
        return i2;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85f6c628", new Object[]{this})).intValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.add(5, -3);
        return ((mfh) this.f25350a).b("time", String.valueOf(instance.getTimeInMillis()));
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7564f72c", new Object[]{this})).longValue();
        }
        return ((mfh) this.f25350a).count();
    }

    public int i(List<Log> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642e2596", new Object[]{this, list})).intValue();
        }
        return ((mfh) this.f25350a).c(list);
    }

    public final void j(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6b5ed4", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        for (int i4 = 0; i4 < this.c.size(); i4++) {
            mnc mncVar = this.c.get(i4);
            if (mncVar != null) {
                if (i2 == 1) {
                    mncVar.a(i3, h());
                } else if (i2 == 2) {
                    mncVar.b(i3, h());
                }
            }
        }
    }

    public List<Log> k(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("640eb7c1", new Object[]{this, new Integer(i2)});
        }
        return ((mfh) this.f25350a).d(i2);
    }

    public void m(mnc mncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11db0662", new Object[]{this, mncVar});
        } else {
            this.c.add(mncVar);
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45517a28", new Object[]{this, str});
            return;
        }
        n();
        bmv.b().a(str);
    }

    @Override // tb.w2v.a
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    public void p(mnc mncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834c4347", new Object[]{this, mncVar});
        } else {
            this.c.remove(mncVar);
        }
    }

    public void n() {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c724e8", new Object[]{this});
            return;
        }
        try {
            synchronized (j) {
                if (nhh.n()) {
                    nhh.f("LogStoreMgr", "store temp.size()", Integer.valueOf(((CopyOnWriteArrayList) this.b).size()));
                }
                if (((CopyOnWriteArrayList) this.b).size() > 0) {
                    arrayList = new ArrayList(this.b);
                    ((CopyOnWriteArrayList) this.b).clear();
                } else {
                    arrayList = null;
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                ((mfh) this.f25350a).e(arrayList);
                j(1, arrayList.size());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.w2v.a
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        nhh.f("LogStoreMgr", "onBackground", Boolean.TRUE);
        this.d = zdt.c().d(null, this.e, 0L);
    }
}
