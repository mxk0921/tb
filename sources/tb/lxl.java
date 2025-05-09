package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static lxl b = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f23623a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f23624a;
        public long b;

        static {
            t2o.a(481297632);
        }

        public a(long j) {
            this.f23624a = j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23625a;
        public final String b;
        public long c;
        public final int d;
        public final List<a> e = new ArrayList();

        static {
            t2o.a(481297633);
        }

        public b(String str, String str2, int i) {
            this.f23625a = str;
            this.d = i;
            this.b = str2;
        }

        public static /* synthetic */ List a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("5be8c9a3", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ long b(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58d44bb1", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.c = j;
            return j;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bffb80b0", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ((ArrayList) this.e).add(new a(currentTimeMillis));
            agh.b("PerformanceLog", "Begin->EventId:[%s] Group:[%s] StartTime:[%d] ThreadId:[%d]", this.f23625a, this.b, Long.valueOf(currentTimeMillis), Long.valueOf(this.c));
        }

        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a02127d6", new Object[]{this})).longValue();
            }
            long j = 0;
            if (((ArrayList) this.e).size() <= 0) {
                return 0L;
            }
            ArrayList arrayList = (ArrayList) this.e;
            a aVar = (a) arrayList.get(arrayList.size() - 1);
            long currentTimeMillis = System.currentTimeMillis();
            aVar.getClass();
            long j2 = currentTimeMillis - aVar.f23624a;
            aVar.b = j2;
            agh.b("PerformanceLog", "End->EventId:[%s] Group:[%s] CostTime:[%d]ms ThreadId:[%d]", this.f23625a, this.b, Long.valueOf(j2), Long.valueOf(Thread.currentThread().getId()));
            if (this.d > 0 && ((ArrayList) this.e).size() % this.d == 0) {
                Iterator it = ((ArrayList) this.e).iterator();
                while (it.hasNext()) {
                    j += ((a) it.next()).b;
                }
                agh.b("PerformanceLog", "Average->EventId:[%s] Group:[%s] AverageCostTime:[%d]ms", this.f23625a, this.b, Long.valueOf(j / ((ArrayList) this.e).size()));
            }
            return aVar.b;
        }
    }

    static {
        t2o.a(481297631);
    }

    public static lxl b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxl) ipChange.ipc$dispatch("de98c3c1", new Object[0]);
        }
        if (b == null) {
            b = new lxl();
        }
        return b;
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41f4dd20", new Object[]{this, str})).longValue();
        }
        b bVar = (b) ((HashMap) this.f23623a).get(str);
        if (bVar != null) {
            return bVar.d();
        }
        return 0L;
    }

    public void c(String str, int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbdf7f0", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (i > 100) {
            i = 99;
        }
        if (((HashMap) this.f23623a).containsKey(str)) {
            bVar = (b) ((HashMap) this.f23623a).get(str);
            if (b.a(bVar).size() > 100) {
                b.a(bVar).clear();
            }
        } else {
            b bVar2 = new b(str, "", i);
            b.b(bVar2, Thread.currentThread().getId());
            ((HashMap) this.f23623a).put(str, bVar2);
            bVar = bVar2;
        }
        if (bVar != null) {
            bVar.c();
        }
    }
}
