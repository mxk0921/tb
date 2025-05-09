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
public class mbn implements lgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f23921a = hashCode();
    public final Map<String, RSoStatus> b = new HashMap();
    public final Map<String, Set<lgd.b>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements lgd.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23922a;

        public a(String str) {
            this.f23922a = str;
        }

        @Override // tb.lgd.c
        public void a(RSoStatus rSoStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc9998fb", new Object[]{this, rSoStatus});
                return;
            }
            RSoLog.d(mbn.c(mbn.this) + "status2 ->  " + this.f23922a + ", want change to " + rSoStatus);
            mbn.d(mbn.this).put(this.f23922a, rSoStatus);
        }
    }

    public static /* synthetic */ int c(mbn mbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b6c337", new Object[]{mbnVar})).intValue();
        }
        return mbnVar.f23921a;
    }

    public static /* synthetic */ Map d(mbn mbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8bcdf93a", new Object[]{mbnVar});
        }
        return mbnVar.b;
    }

    public static String e(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4d7c5da", new Object[]{z6oVar});
        }
        return z6oVar.b() + z6oVar.d();
    }

    @Override // tb.lgd
    public void a(z6o z6oVar, lgd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845dab4a", new Object[]{this, z6oVar, bVar});
            return;
        }
        RSoLog.d(this.f23921a + "status2 -> " + e(z6oVar) + ", registerListener = " + bVar);
        synchronized (this.b) {
            g(z6oVar).add(bVar);
        }
    }

    @Override // tb.lgd
    public <T> T b(z6o z6oVar, lgd.a<T> aVar) {
        T a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7e98eeb6", new Object[]{this, z6oVar, aVar});
        }
        String e = e(z6oVar);
        synchronized (this.b) {
            try {
                a aVar2 = new a(e);
                RSoStatus rSoStatus = (RSoStatus) ((HashMap) this.b).get(e);
                if (rSoStatus == null) {
                    rSoStatus = RSoStatus.INITIALIZED;
                }
                RSoLog.d(this.f23921a + "status2 ->  on-status, " + e + ",  on " + rSoStatus);
                a2 = aVar.a(rSoStatus, aVar2);
                RSoStatus rSoStatus2 = (RSoStatus) ((HashMap) this.b).get(e);
                if (!(rSoStatus2 == null || rSoStatus2 == rSoStatus)) {
                    Set<lgd.b> g = g(z6oVar);
                    if (g.size() > 0) {
                        f(z6oVar, rSoStatus2, g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    public final void f(z6o z6oVar, RSoStatus rSoStatus, Set<lgd.b> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874ef5cf", new Object[]{this, z6oVar, rSoStatus, set});
            return;
        }
        RSoLog.d(this.f23921a + "status2 -> notify listener.  " + set.size() + ",  " + e(z6oVar) + "  to  " + rSoStatus.name() + ", " + set);
        Iterator<lgd.b> it = set.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().a(rSoStatus)) {
                    it.remove();
                }
            } catch (Throwable th) {
                rbn.g("status2 -> notify listener", th);
            }
        }
    }

    public final Set<lgd.b> g(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5df3b08c", new Object[]{this, z6oVar});
        }
        String e = e(z6oVar);
        Set<lgd.b> set = (Set) ((HashMap) this.c).get(e);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        ((HashMap) this.c).put(e, hashSet);
        return hashSet;
    }
}
