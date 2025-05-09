package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.TBAnrConfig;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b01 extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DOUBLE_INC = 4;
    public static final int LINEAR_INC = 2;
    public static final int LOG_INC = 3;
    public static final int MSG_CLEAR_EXPIRED_TRACE = 1001;
    public static final int MSG_DUMP_STACK_TRACE = 0;
    public static final int MSG_FIX_DUMP_STACK_TIMEOUT = 1002;
    public static final int NO_INC = 1;

    /* renamed from: a  reason: collision with root package name */
    public long f16104a;
    public final h0i b;
    public int c;
    public final int e;
    public final TBAnrConfig g;
    public final c01 h;
    public a i;
    public int d = 0;
    public final ConcurrentLinkedQueue<a> f = new ConcurrentLinkedQueue<>();
    public final ve2 j = new ve2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f16105a;
        public final long b;
        public final int c;
        public final long d;
        public final Object[] e;

        static {
            t2o.a(824180754);
        }

        public a(long j, Object[] objArr, long j2, int i, long j3) {
            this.f16105a = j;
            this.e = objArr;
            this.b = j2;
            this.c = i;
            this.d = j3;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7032649", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f7121e9e", new Object[]{this});
            }
            return "";
        }

        public Object[] c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("320b127b", new Object[]{this});
            }
            return this.e;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("501a2bf5", new Object[]{this});
            }
            if (this.e == null || !y74.e()) {
                return "Failed to dump stack trace";
            }
            return StackDumpUtils.j(StackDumpUtils.h(Looper.getMainLooper().getThread().getName(), this.e));
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return String.format("[+%dms %s][%dms]  %s%s", Integer.valueOf(this.c), y74.h(this.b), Long.valueOf(this.d), d(), b());
        }
    }

    static {
        t2o.a(824180753);
    }

    public b01(c01 c01Var, Looper looper, h0i h0iVar, TBAnrConfig tBAnrConfig) {
        super(looper);
        urr.a("AnrTraceHandler", "MainThreadMonitorHandler init", new Object[0]);
        int i = tBAnrConfig.defaultDumpInterval;
        this.e = i;
        this.c = i;
        this.h = c01Var;
        this.b = h0iVar;
        this.g = tBAnrConfig;
    }

    public static /* synthetic */ Object ipc$super(b01 b01Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/anr/AnrTraceDumpHandler");
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31285f85", new Object[]{this, new Long(j)});
            return;
        }
        urr.a("AnrTraceHandler", "clearExpiredAnrTrace history stack trace " + this.f.size(), new Object[0]);
        if (this.f.size() != 0) {
            long j2 = g0i.m.get();
            synchronized (this) {
                while (!this.f.isEmpty()) {
                    try {
                        a peek = this.f.peek();
                        if (peek != null) {
                            long j3 = peek.f16105a;
                            if (j3 == j2 || j3 >= j) {
                                break;
                            }
                        }
                        this.f.poll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec035a9a", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) (i + (this.e * Math.log10(this.d * 10)));
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9959b750", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.d == 0) {
            return this.e;
        }
        int i2 = this.g.timeIncType;
        if (i2 == 2) {
            i += this.e;
        } else if (i2 == 3) {
            i = b(i);
        } else if (i2 == 4) {
            i += i;
        }
        int min = Math.min(i, this.g.maxDumpInterval);
        urr.f("AnrTraceHandler", "Next dump interval = " + min, new Object[0]);
        return min;
    }

    public void d(LinkedList<a> linkedList, LinkedList<a> linkedList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927e69f7", new Object[]{this, linkedList, linkedList2});
            return;
        }
        long j = g0i.m.get();
        synchronized (this) {
            try {
                Iterator<a> it = this.f.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next.f16105a != j) {
                        linkedList.add(next);
                    } else {
                        linkedList2.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int e() {
        Object[] objArr;
        int i;
        a aVar;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25c5b6e6", new Object[]{this})).intValue();
        }
        int i2 = this.e;
        long q = this.b.q();
        if (q != this.f16104a) {
            this.d = 0;
            this.f16104a = q;
            this.c = this.e;
        }
        if (q < 0) {
            return i2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - q;
        if (j <= this.g.largeTaskThreshold) {
            return i2 - ((int) j);
        }
        long j2 = g0i.m.get();
        if (y74.e()) {
            Thread thread = Looper.getMainLooper().getThread();
            if (this.g.ddmDumpSdkVersion == Build.VERSION.SDK_INT) {
                z = true;
            } else {
                z = false;
            }
            objArr = StackDumpUtils.dumpRawStackTraceSafely(thread, z);
        } else {
            objArr = null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (objArr != null) {
            z2 = true;
        }
        e6r.j(uptimeMillis2, z2);
        if (this.d == 0) {
            i = (int) j;
        } else {
            i = this.c;
        }
        a aVar2 = new a(j2, objArr, uptimeMillis, i, uptimeMillis2);
        if (this.d >= 1 && (aVar = this.i) != null) {
            this.j.a(aVar, aVar2, j);
        }
        this.i = aVar2;
        this.f.add(aVar2);
        int c = c(this.c);
        this.d++;
        return c;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 0) {
            int e = e();
            this.c = e;
            sendEmptyMessageDelayed(0, e);
        } else if (i == 1001) {
            a(((Long) message.obj).longValue());
        } else if (i == 1002) {
            if (!y74.e()) {
                urr.b("AnrTraceHandler", "tbp-anr-trace start failed", new Object[0]);
            } else if (!StackDumpUtils.l(Process.myTid(), this.h)) {
                urr.g("AnrTraceHandler", "fixThreadStackDumpTimeout invoke failed", new Object[0]);
            }
        }
    }
}
