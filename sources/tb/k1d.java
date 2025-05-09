package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.n1d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22339a = "PeriodIOMonitor";
    public static volatile boolean b = false;
    public static final long c = 30000;

    static {
        t2o.a(737149004);
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue();
        }
        return c;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return f22339a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends n1d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public h1d f22340a;

        static {
            t2o.a(737149006);
        }

        public a() {
            this.f22340a = null;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/io/IOPeriodMonitor$PeriodIOInfoListener");
        }

        public void b(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfd30c6d", new Object[]{this, str});
                return;
            }
            h1d a2 = a(str);
            h1d h1dVar = this.f22340a;
            if (h1dVar == null) {
                str2 = n1d.c(a2);
            } else {
                str2 = n1d.e(a2, h1dVar);
            }
            TLog.loge(yr2.MODULE, "PeriodIOInfoListener", "onResult: " + str2);
            this.f22340a = a2;
        }

        public /* synthetic */ a(j1d j1dVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final a f22341a;

        static {
            t2o.a(737149007);
        }

        private b() {
            this.f22341a = new a(null);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                n1d.a(this.f22341a);
                if (!k1d.b()) {
                    o1d.a().b(this, k1d.a());
                }
            } catch (Throwable th) {
                String d = k1d.d();
                TLog.loge(yr2.MODULE, d, "run: io period record runnable with exception " + th);
            }
        }

        public /* synthetic */ b(j1d j1dVar) {
            this();
        }
    }
}
