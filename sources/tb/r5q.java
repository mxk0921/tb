package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.Constants;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.heartbeat.IHeartbeat;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.ut.monitor.HeartbeatMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import com.taobao.weex.common.Constants;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r5q implements IHeartbeat, Runnable, AccsConnectStateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BACKGROUND_FREQ_INTERVAL = 220000;
    public static final int BACKGROUND_INTERVAL = 270000;
    public static final int DEFAULT_MAX_INTERVAL_IN_SECS = 600;
    public static final int DEFAULT_MIN_INTERVAL_IN_SECS = 60;
    public static final int FOREGROUND_INTERVAL = 45000;
    private static final String t = "SmartHeartbeatImpl";
    private static final long u = 5000;
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private Context e;
    private long f;
    private Session h;
    private long i;
    private Future j;
    private final InAppConnection k;
    private volatile long m;
    private long o;
    private volatile int q;
    private final IHeartBeat r;
    private String s;

    /* renamed from: a  reason: collision with root package name */
    private volatile int f27127a = 0;
    private final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicBoolean d = new AtomicBoolean();
    private boolean g = false;
    private volatile long l = -1;
    private volatile Long n = null;
    private boolean p = true;

    static {
        t2o.a(343933175);
        t2o.a(607125667);
        t2o.a(343933000);
    }

    public r5q(InAppConnection inAppConnection, int i) {
        a aVar = new a();
        this.r = aVar;
        this.e = inAppConnection.d;
        this.k = inAppConnection;
        this.q = i;
        String u2 = u();
        this.s = u2;
        ALog.e(t, "init", "lastNetType", u2);
        inAppConnection.G(this);
        inAppConnection.H(aVar);
    }

    public static /* synthetic */ Long a(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2c10a6be", new Object[]{r5qVar});
        }
        return r5qVar.n;
    }

    public static /* synthetic */ Long b(r5q r5qVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("3816f15d", new Object[]{r5qVar, l});
        }
        r5qVar.n = l;
        return l;
    }

    public static /* synthetic */ boolean c(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21d8fbbc", new Object[]{r5qVar})).booleanValue();
        }
        return r5qVar.w();
    }

    public static /* synthetic */ void d(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaaaa7a6", new Object[]{r5qVar});
        } else {
            r5qVar.y();
        }
    }

    public static /* synthetic */ long e(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2024cddb", new Object[]{r5qVar})).longValue();
        }
        return r5qVar.f;
    }

    public static /* synthetic */ long f(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("959ef41c", new Object[]{r5qVar})).longValue();
        }
        return r5qVar.m;
    }

    public static /* synthetic */ long g(r5q r5qVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("912f22ce", new Object[]{r5qVar, new Long(j)})).longValue();
        }
        r5qVar.m = j;
        return j;
    }

    public static /* synthetic */ long h(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b191a5d", new Object[]{r5qVar})).longValue();
        }
        return r5qVar.l;
    }

    public static /* synthetic */ Context i(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3b4765f1", new Object[]{r5qVar});
        }
        return r5qVar.e;
    }

    public static /* synthetic */ String j(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60b2e7a6", new Object[]{r5qVar});
        }
        return r5qVar.s;
    }

    public static /* synthetic */ long k(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82476e6f", new Object[]{r5qVar})).longValue();
        }
        return r5qVar.o;
    }

    public static /* synthetic */ long l(r5q r5qVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3995f2db", new Object[]{r5qVar, new Long(j)})).longValue();
        }
        r5qVar.o = j;
        return j;
    }

    public static /* synthetic */ long m(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("574d8277", new Object[]{r5qVar})).longValue();
        }
        long j = r5qVar.o;
        r5qVar.o = 1 + j;
        return j;
    }

    public static /* synthetic */ int n(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c194af", new Object[]{r5qVar})).intValue();
        }
        return r5qVar.f27127a;
    }

    public static /* synthetic */ int o(r5q r5qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("736090f8", new Object[]{r5qVar, new Integer(i)})).intValue();
        }
        r5qVar.f27127a = i;
        return i;
    }

    public static /* synthetic */ boolean p(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d3bbb01", new Object[]{r5qVar})).booleanValue();
        }
        return r5qVar.p;
    }

    public static /* synthetic */ boolean q(r5q r5qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad2b72b9", new Object[]{r5qVar, new Boolean(z)})).booleanValue();
        }
        r5qVar.p = z;
        return z;
    }

    public static /* synthetic */ long r(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b5e132", new Object[]{r5qVar})).longValue();
        }
        return r5qVar.i;
    }

    public static /* synthetic */ AtomicInteger s(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("5a4d3ba9", new Object[]{r5qVar});
        }
        return r5qVar.b;
    }

    public static /* synthetic */ AtomicInteger t(r5q r5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("435500aa", new Object[]{r5qVar});
        }
        return r5qVar.c;
    }

    private String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f577ff58", new Object[]{this});
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.k.d.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getTypeName();
            }
            return null;
        } catch (Throwable th) {
            ALog.e(t, "getNetType err", th, new Object[0]);
            return null;
        }
    }

    private boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f019464d", new Object[]{this})).booleanValue();
        }
        if (this.q == 0) {
            return true;
        }
        return false;
    }

    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95244acb", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean a2 = TimeMeter.a(TimeMeter.TAG_HB_RECOVER, xg4.DEFAULT_MAX_AGE);
        if (z) {
            this.g = true;
        } else if (a2) {
            this.g = false;
        }
    }

    @Override // com.taobao.accs.base.AccsConnectStateListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        } else if (!this.d.getAndSet(false)) {
            ALog.e(t, "onDisconnected, not connected", new Object[0]);
        } else {
            this.l = -1L;
            if (!w()) {
                ALog.e(t, "onDisconnected, no bg state", new Object[0]);
            } else if (!UtilityImpl.isNetworkConnected(this.e)) {
                ALog.e(t, "onDisconnected, no network", new Object[0]);
            } else {
                ALog.e(t, "onDisconnected", new Object[0]);
                if (SystemClock.elapsedRealtime() - this.f < 1000 && this.c.incrementAndGet() >= 3) {
                    ALog.e(t, "onDisconnected, degrade step", new Object[0]);
                    if (this.f27127a != 2) {
                        this.b.decrementAndGet();
                    }
                    this.c.set(0);
                }
            }
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
        } else if (session != null) {
            gva.a(GlobalClientInfo.getContext()).e();
            this.h = session;
            E();
            F(this.i);
        } else {
            throw new NullPointerException("session is null");
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebb5ff5", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d52728", new Object[]{this});
            return;
        }
        this.n = Long.valueOf(SystemClock.elapsedRealtime());
        y();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f3d34f", new Object[]{this});
        } else {
            F(this.i);
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a034d2b1", new Object[]{this});
            return;
        }
        ALog.e(t, "reScheduleImpl", new Object[0]);
        E();
        z();
        if (m8l.z()) {
            A(false);
            gva.a(this.e).f((int) (this.i + 5000));
        } else if (m8l.u()) {
            gva.a(GlobalClientInfo.getContext()).f((int) this.i);
        } else {
            gva.a(GlobalClientInfo.getContext()).e();
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd73a171", new Object[]{this});
            return;
        }
        this.n = Long.valueOf(SystemClock.elapsedRealtime());
        if (!TimeMeter.a(TimeMeter.TAG_HB_RESCHEDULE, m8l.z() ? 5000L : 1000L)) {
            ALog.d(t, "reSchedule freq", new Object[0]);
        } else {
            y();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements IHeartBeat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.accs.IHeartBeat
        public void onPingSuccess(String str) throws IPCException {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("290e2be3", new Object[]{this, str});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (r5q.a(r5q.this) != null) {
                j = elapsedRealtime - r5q.a(r5q.this).longValue();
                long j2 = j / 1000;
                ALog.e(r5q.t, "onPingSuccess diff", "isBg", Boolean.valueOf(r5q.c(r5q.this)), "diff", Long.valueOf(j2));
                if (r5q.c(r5q.this) && UtilityImpl.isAppKeepAlive()) {
                    HeartbeatMonitor heartbeatMonitor = new HeartbeatMonitor("back", j2);
                    heartbeatMonitor.setBucketId(UtilityImpl.getAppKeepAliveBucketId(r5q.i(r5q.this)));
                    heartbeatMonitor.setNetType(r5q.j(r5q.this));
                    AppMonitor.getInstance().commitStat(heartbeatMonitor);
                }
            } else {
                j = 0;
            }
            r5q.b(r5q.this, Long.valueOf(elapsedRealtime));
            if (!m8l.z()) {
                r5q.this.reSchedule();
            } else if (r5q.c(r5q.this)) {
                r5q.m(r5q.this);
                if (r5q.n(r5q.this) == 1 && r5q.k(r5q.this) >= 3 && r5q.p(r5q.this)) {
                    ALog.e(r5q.t, "onPingSuccess, try to detect", new Object[0]);
                    r5q.o(r5q.this, 0);
                }
                if (r5q.n(r5q.this) != 1 && r5q.n(r5q.this) != 3 && j > 0 && Math.abs(j - r5q.r(r5q.this)) < 10000) {
                    ALog.e(r5q.t, "onPingSuccess, upgrade", new Object[0]);
                    r5q.s(r5q.this).incrementAndGet();
                }
                r5q.t(r5q.this).set(0);
                r5q.d(r5q.this);
            }
        }

        @Override // com.taobao.accs.IHeartBeat
        public void onPingTimeout(String str) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b586bec1", new Object[]{this, str});
            } else if (m8l.z() && r5q.c(r5q.this)) {
                ALog.e(r5q.t, "onPingTimeout", new Object[0]);
                r5q.l(r5q.this, 0L);
                if (SystemClock.elapsedRealtime() - r5q.e(r5q.this) < 12000) {
                    if (r5q.n(r5q.this) != 2) {
                        ALog.e(r5q.t, "degrade", new Object[0]);
                        if (r5q.p(r5q.this) && r5q.f(r5q.this) > 0 && r5q.f(r5q.this) == r5q.h(r5q.this)) {
                            ALog.e(r5q.t, "degrade, never try to upgrade", "lastTimeout", Long.valueOf(r5q.f(r5q.this)));
                            r5q.q(r5q.this, false);
                        }
                        r5q r5qVar = r5q.this;
                        r5q.g(r5qVar, r5q.h(r5qVar));
                        r5q.s(r5q.this).decrementAndGet();
                    }
                    r5q.o(r5q.this, 1);
                    ALog.e(r5q.t, "state = STABLE", new Object[0]);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.k.r)) {
            ALog.e(t, "smart ping not allowed", new Object[0]);
        } else {
            ALog.e(t, "ping ", new Object[0]);
            try {
                Session a2 = l70.a(SessionCenter.getInstance(this.k.i()), this.k.l(null), 0L, this.k.r);
                this.h = a2;
                if (a2 != null) {
                    if (m8l.x()) {
                        l70.f(this.h, new Integer[0]);
                    } else {
                        this.h.ping(true);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    InAppConnection.J = elapsedRealtime;
                    this.f = elapsedRealtime;
                } else {
                    ALog.e(t, "empty session!", new Object[0]);
                }
            } catch (Exception e) {
                ALog.e(t, "get session null", e, new Object[0]);
            }
            y();
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Future future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Session session = this.h;
        ALog.i(t, "heartbeat stop", session.mSeq, MspGlobalDefine.SESSION, session);
        if (this.h != null && (future = this.j) != null) {
            future.cancel(true);
        }
    }

    private synchronized void F(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9205", new Object[]{this, new Long(j)});
            return;
        }
        try {
            ALog.d(t, "submit ping current delay: " + (j / 1000) + "s", new Object[0]);
            Future future = this.j;
            if (future != null) {
                future.cancel(false);
                this.j = null;
            }
            this.j = brt.j().schedule(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.e(t, "Submit heartbeat task failed.", this.h.mSeq, e);
        }
    }

    public void A(boolean z) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1672448", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (xd0.m(this.e) && UtilityImpl.isChannelProcess(this.e) && UtilityImpl.isAppKeepAlive()) {
                if (!m8l.z()) {
                    j = (!v() || !m8l.u()) ? 270000L : 220000L;
                    j2 = 10000;
                } else if (w()) {
                    if (z) {
                        E();
                    }
                    j = this.i;
                    j2 = 5000;
                } else {
                    return;
                }
                long j3 = j - j2;
                if (this.l == j3) {
                    ALog.e(t, "same ping sent", "pingInterval", Long.valueOf(j3));
                    return;
                }
                this.l = j3;
                InAppConnection inAppConnection = this.k;
                inAppConnection.L(Message.buildAServerPingControl(inAppConnection.l(null), j3), true);
            }
        } catch (Throwable th) {
            ALog.e(t, "sendServerPingSignal err", th, new Object[0]);
        }
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980df12a", new Object[]{this, new Integer(i)});
        } else if (this.q != i) {
            ALog.e(t, "setAppState", "old", Integer.valueOf(this.q), "new", Integer.valueOf(i));
            this.q = i;
            if (!m8l.z()) {
                if (this.q == 1) {
                    E();
                    reSchedule();
                }
                this.o = 0L;
            }
        }
    }

    @Override // com.taobao.accs.base.AccsConnectStateListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
            return;
        }
        this.d.set(true);
        this.n = Long.valueOf(SystemClock.elapsedRealtime());
        this.o = 0L;
        String u2 = u();
        boolean z = !TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(u2) && !this.s.equals(u2);
        ALog.e(t, "onConnected", "lastNetType", this.s, "newType", u2, "changed", Boolean.valueOf(z));
        if (z) {
            this.b.set(0);
            this.c.set(0);
            this.s = u2;
            this.f27127a = 0;
            this.p = true;
            ALog.e(t, "state = DETECT", new Object[0]);
        }
        y();
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39970c4e", new Object[]{this});
            return;
        }
        boolean z = this.q == 0;
        if (!z) {
            this.i = Constants.MAX_SESSION_IDLE_TIME;
        } else if (m8l.z()) {
            long i = m8l.i();
            long h = m8l.h();
            long min = Math.min(Math.max((this.b.get() * 60000) + 270000, i), h);
            if (this.f27127a == 0) {
                if (min == h) {
                    this.f27127a = 3;
                    ALog.e(t, "state = MAX_LIMIT", new Object[0]);
                } else if (min == i) {
                    this.f27127a = 2;
                    ALog.e(t, "state = MIN_LIMIT", new Object[0]);
                }
            } else if ((this.f27127a == 3 && min != h) || (this.f27127a == 2 && min != i)) {
                this.f27127a = 0;
                ALog.e(t, "config changed, state = DETECT", new Object[0]);
            }
            this.i = min;
        } else if (this.g) {
            this.i = 220000L;
        } else {
            this.i = 270000L;
        }
        ALog.e(t, "setInterval", Constants.Name.INTERVAL, Long.valueOf(this.i / 1000), tl.KEY_STEP, Integer.valueOf(this.b.get()), "background", Boolean.valueOf(z));
    }
}
