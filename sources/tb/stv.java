package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class stv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TriggerEngine.UserTrackDataQueue";

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<UserTrackDO> f28268a;
    public final rtv b;
    public final AtomicBoolean c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends eo1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/usertrack/UserTrackDataQueue$1");
        }

        @Override // tb.tzu
        public void onSwitchBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74060788", new Object[]{this});
            } else {
                stv.a(stv.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    stv.b(stv.this);
                } catch (Exception e) {
                    kgh.d(stv.TAG, e.getMessage(), e);
                }
            } finally {
                stv.c(stv.this).set(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final stv f28271a = new stv(null);

        static {
            t2o.a(1034944672);
        }

        public static /* synthetic */ stv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (stv) ipChange.ipc$dispatch("bd8c28f8", new Object[0]);
            }
            return f28271a;
        }
    }

    static {
        t2o.a(1034944669);
    }

    public /* synthetic */ stv(a aVar) {
        this();
    }

    public static /* synthetic */ String a(stv stvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdaca11f", new Object[]{stvVar, str});
        }
        stvVar.d = str;
        return str;
    }

    public static /* synthetic */ void b(stv stvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99583b8", new Object[]{stvVar});
        } else {
            stvVar.e();
        }
    }

    public static /* synthetic */ AtomicBoolean c(stv stvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("d0bbe897", new Object[]{stvVar});
        }
        return stvVar.c;
    }

    public static stv d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (stv) ipChange.ipc$dispatch("9b9f2813", new Object[0]);
        }
        return c.a();
    }

    public final synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcbdf46", new Object[]{this});
            return;
        }
        while (true) {
            UserTrackDO userTrackDO = (UserTrackDO) ((LinkedBlockingQueue) this.f28268a).poll(1L, TimeUnit.SECONDS);
            if (userTrackDO != null) {
                System.nanoTime();
                if (!(userTrackDO.getEventId() == -19999 || userTrackDO.getEventId() == 99099)) {
                    if (userTrackDO.getSesionId() == null) {
                        if (this.d == null) {
                            this.d = g3v.getInstance().getUtsid();
                        }
                        userTrackDO.setSessionId(this.d);
                    }
                    this.b.a(userTrackDO);
                }
                zfu.e().i(userTrackDO);
            } else {
                return;
            }
        }
    }

    public void f(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23337f0", new Object[]{this, userTrackDO});
            return;
        }
        ((LinkedBlockingQueue) this.f28268a).offer(userTrackDO);
        g();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1e849e", new Object[]{this});
        } else if (this.c.compareAndSet(false, true)) {
            xdt.a(new b());
        }
    }

    public stv() {
        this.f28268a = new LinkedBlockingQueue();
        this.c = new AtomicBoolean(false);
        this.d = null;
        this.b = rtv.b();
        vzu.getInstance().registerAppStatusCallbacks(new a());
    }
}
