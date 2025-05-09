package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wi8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IMainFeedsLoopStartStopService f30713a;
    public IMainLifecycleService b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public boolean k;
    public final m47 l = new a();
    public final IMainFeedsLoopStartStopService.a m = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/smartnextpagerequestservice/impl/EscapeDurationCounter$1");
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                wi8.a(wi8.this).a(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
            }
        }

        @Override // tb.m47, tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                wi8.a(wi8.this).onStart(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IMainFeedsLoopStartStopService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b7652", new Object[]{this, str});
            } else if (!wi8.b(wi8.this)) {
                wi8.c(wi8.this, true);
                long uptimeMillis = SystemClock.uptimeMillis();
                wi8.g(wi8.this, uptimeMillis);
                wi8.k(wi8.this, uptimeMillis);
                wi8.m(wi8.this, true);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            } else if (wi8.b(wi8.this)) {
                wi8.c(wi8.this, false);
                wi8 wi8Var = wi8.this;
                wi8.e(wi8Var, wi8.d(wi8Var) + (SystemClock.uptimeMillis() - wi8.f(wi8.this)));
                wi8 wi8Var2 = wi8.this;
                wi8.i(wi8Var2, wi8.h(wi8Var2) + (SystemClock.uptimeMillis() - wi8.j(wi8.this)));
                wi8.l(wi8.this, SystemClock.uptimeMillis());
            }
        }
    }

    static {
        t2o.a(491782688);
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a a(wi8 wi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("31fc2333", new Object[]{wi8Var});
        }
        return wi8Var.m;
    }

    public static /* synthetic */ boolean b(wi8 wi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b0f7d60", new Object[]{wi8Var})).booleanValue();
        }
        return wi8Var.k;
    }

    public static /* synthetic */ boolean c(wi8 wi8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59afd2ba", new Object[]{wi8Var, new Boolean(z)})).booleanValue();
        }
        wi8Var.k = z;
        return z;
    }

    public static /* synthetic */ long d(wi8 wi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e972051", new Object[]{wi8Var})).longValue();
        }
        return wi8Var.i;
    }

    public static /* synthetic */ long e(wi8 wi8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c71c53b9", new Object[]{wi8Var, new Long(j)})).longValue();
        }
        wi8Var.i = j;
        return j;
    }

    public static /* synthetic */ long f(wi8 wi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("621ec352", new Object[]{wi8Var})).longValue();
        }
        return wi8Var.h;
    }

    public static /* synthetic */ long g(wi8 wi8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("348910d8", new Object[]{wi8Var, new Long(j)})).longValue();
        }
        wi8Var.h = j;
        return j;
    }

    public static /* synthetic */ long h(wi8 wi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65a66653", new Object[]{wi8Var})).longValue();
        }
        return wi8Var.f;
    }

    public static /* synthetic */ long i(wi8 wi8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1f5cdf7", new Object[]{wi8Var, new Long(j)})).longValue();
        }
        wi8Var.f = j;
        return j;
    }

    public static /* synthetic */ long j(wi8 wi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692e0954", new Object[]{wi8Var})).longValue();
        }
        return wi8Var.d;
    }

    public static /* synthetic */ long k(wi8 wi8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f628b16", new Object[]{wi8Var, new Long(j)})).longValue();
        }
        wi8Var.d = j;
        return j;
    }

    public static /* synthetic */ long l(wi8 wi8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ccf4835", new Object[]{wi8Var, new Long(j)})).longValue();
        }
        wi8Var.e = j;
        return j;
    }

    public static /* synthetic */ boolean m(wi8 wi8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3c4174", new Object[]{wi8Var, new Boolean(z)})).booleanValue();
        }
        wi8Var.j = z;
        return z;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = this.f30713a;
        if (iMainFeedsLoopStartStopService != null) {
            iMainFeedsLoopStartStopService.unregisterStartStopListener(this.m);
        }
        IMainLifecycleService iMainLifecycleService = this.b;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.l);
        }
    }

    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("211baa24", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("escapeDuration", String.valueOf(this.f));
        hashMap.put("escapeDurationAfterDragging", String.valueOf(this.g + this.f));
        hashMap.put("triggerPreloadCardDisplayTimestamp", String.valueOf(this.c));
        hashMap.put("totalEscapeDuration", String.valueOf(this.i));
        return hashMap;
    }

    public void p(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a723c9", new Object[]{this, cfcVar});
            return;
        }
        cfcVar.a(IMainLifecycleService.class);
        this.f30713a = (IMainFeedsLoopStartStopService) cfcVar.a(IMainFeedsLoopStartStopService.class);
        this.b = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = this.f30713a;
        if (iMainFeedsLoopStartStopService != null) {
            iMainFeedsLoopStartStopService.registerStartStopListener(this.m);
        }
        IMainLifecycleService iMainLifecycleService = this.b;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().a(this.l);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a19a24", new Object[]{this});
        } else if (this.j) {
            this.j = false;
            this.g += SystemClock.uptimeMillis() - this.e;
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16bc06c5", new Object[]{this});
            return;
        }
        this.c = SystemClock.uptimeMillis();
        this.d = 0L;
        this.f = 0L;
        this.g = 0L;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa275825", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.h = 0L;
        this.i = 0L;
    }
}
