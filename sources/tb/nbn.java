package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.status.RSoStatus;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.lgd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nbn implements lgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24620a = hashCode();
    public final Map<String, a> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements lgd.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f24621a;
        public final String b;
        public final Set<lgd.b> c = new HashSet();
        public RSoStatus d = RSoStatus.INITIALIZED;

        public a(int i, String str) {
            this.f24621a = i;
            this.b = str;
        }

        public static /* synthetic */ RSoStatus b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RSoStatus) ipChange.ipc$dispatch("20f9a633", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b3539a8c", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ Set d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("9d342022", new Object[]{aVar});
            }
            return aVar.c;
        }

        @Override // tb.lgd.c
        public void a(RSoStatus rSoStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc9998fb", new Object[]{this, rSoStatus});
                return;
            }
            RSoLog.d(this.f24621a + "status3 ->  " + this.b + ", want change to " + rSoStatus);
            this.d = rSoStatus;
        }
    }

    @Override // tb.lgd
    public void a(z6o z6oVar, lgd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845dab4a", new Object[]{this, z6oVar, bVar});
            return;
        }
        a c = c(z6oVar);
        RSoLog.d(this.f24620a + "status3 -> " + a.c(c) + ", registerListener = " + bVar);
        synchronized (c) {
            a.d(c).add(bVar);
        }
    }

    @Override // tb.lgd
    public <T> T b(z6o z6oVar, lgd.a<T> aVar) {
        T a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7e98eeb6", new Object[]{this, z6oVar, aVar});
        }
        a c = c(z6oVar);
        synchronized (c) {
            try {
                RSoStatus b = a.b(c);
                RSoLog.d(this.f24620a + "status3 ->  on-status, " + a.c(c) + ",  on " + b);
                a2 = aVar.a(b, c);
                RSoStatus b2 = a.b(c);
                if (b2 != b) {
                    Set<lgd.b> d = a.d(c);
                    if (d.size() > 0) {
                        RSoLog.d(this.f24620a + "status3 -> notify listener.size=  " + d.size() + ", " + a.c(c) + "  to  " + b2.name() + ", " + d);
                        d(b2, d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    public final a c(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6d772040", new Object[]{this, z6oVar});
        }
        String str = z6oVar.b() + z6oVar.d();
        a aVar = (a) ((HashMap) this.b).get(str);
        if (aVar == null) {
            synchronized (this.b) {
                try {
                    aVar = (a) ((HashMap) this.b).get(str);
                    if (aVar == null) {
                        aVar = new a(this.f24620a, str);
                        ((HashMap) this.b).put(str, aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aVar;
    }

    public final void d(RSoStatus rSoStatus, Set<lgd.b> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7579a16d", new Object[]{this, rSoStatus, set});
            return;
        }
        Iterator<lgd.b> it = set.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().a(rSoStatus)) {
                    it.remove();
                }
            } catch (Throwable th) {
                rbn.g("status3 -> notify listener", th);
            }
        }
    }
}
