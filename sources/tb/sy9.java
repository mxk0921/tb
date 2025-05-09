package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.adaemon.ADaemon;
import com.taobao.adaemon.LocalProcessMonitor;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.atools.StaticHook;
import com.taobao.orange.OConstant;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.sy9;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sy9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile int g = -1;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f28354a;
    public final b b;
    public final b c;
    public final b d;
    public final List<Integer> e;
    public final Set<Integer> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f28355a = new AtomicBoolean();

        static {
            t2o.a(349175922);
        }

        public b(sy9 sy9Var, Context context) {
        }

        public abstract void a();

        public void b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("446964fa", new Object[]{this, message});
            } else if (!this.f28355a.getAndSet(true)) {
                a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175923);
        }

        public c(sy9 sy9Var, Context context) {
            super(sy9Var, context);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 1147757818) {
                super.b((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/FrameRater$BoostFrame");
        }

        @Override // tb.sy9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
            }
        }

        @Override // tb.sy9.b
        public void b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("446964fa", new Object[]{this, message});
                return;
            }
            super.b(message);
            qti.c(message.arg1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d {
        public static final sy9 instance = new sy9();

        static {
            t2o.a(349175924);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Handler f;
        public Choreographer g;
        public Choreographer.FrameCallback h;
        public volatile Handler i;
        public final AtomicBoolean b = new AtomicBoolean();
        public final List<Runnable> c = new CopyOnWriteArrayList();
        public final LinkedBlockingQueue<Runnable> d = new LinkedBlockingQueue<>();
        public final Map<Integer, Runnable> e = new ConcurrentHashMap();
        public long j = 0;
        public final AtomicBoolean k = new AtomicBoolean();

        static {
            t2o.a(349175928);
        }

        public f(sy9 sy9Var, Context context) {
            super(sy9Var, context);
        }

        public static /* synthetic */ LinkedBlockingQueue e(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinkedBlockingQueue) ipChange.ipc$dispatch("4489076f", new Object[]{fVar});
            }
            return fVar.d;
        }

        public static /* synthetic */ Handler f(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("51c28a1c", new Object[]{fVar});
            }
            return fVar.f;
        }

        public static /* synthetic */ Choreographer g(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Choreographer) ipChange.ipc$dispatch("42626d1d", new Object[]{fVar});
            }
            return fVar.g;
        }

        public static /* synthetic */ List h(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e2bb969f", new Object[]{fVar});
            }
            return fVar.c;
        }

        public static /* synthetic */ AtomicBoolean i(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("3cee7a47", new Object[]{fVar});
            }
            return fVar.b;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == 1147757818) {
                super.b((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/FrameRater$ScheduleFrame");
        }

        public static /* synthetic */ long j(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bfcf44da", new Object[]{fVar})).longValue();
            }
            return fVar.j;
        }

        public static /* synthetic */ long k(f fVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8541e094", new Object[]{fVar, new Long(j)})).longValue();
            }
            fVar.j = j;
            return j;
        }

        public static /* synthetic */ Handler l(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("55cb02a1", new Object[]{fVar});
            }
            return fVar.i;
        }

        public static /* synthetic */ Handler m(f fVar, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("69936a73", new Object[]{fVar, handler});
            }
            fVar.i = handler;
            return handler;
        }

        public static /* synthetic */ AtomicBoolean n(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("6694bb64", new Object[]{fVar});
            }
            return fVar.k;
        }

        @Override // tb.sy9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            this.f = new Handler(Looper.getMainLooper());
            com.taobao.adaemon.g.w(new ik4() { // from class: tb.xy9
                @Override // tb.ik4
                public final void accept(Object obj) {
                    sy9.f.this.p((Choreographer) obj);
                }
            });
        }

        @Override // tb.sy9.b
        public void b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("446964fa", new Object[]{this, message});
                return;
            }
            super.b(message);
            int i = message.what;
            if (i == 1) {
                r((Runnable) message.obj, message.arg1);
            } else if (i == 2) {
                u((Runnable) message.obj);
            } else if (i == 3) {
                t();
            }
        }

        public final Choreographer.FrameCallback o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Choreographer.FrameCallback) ipChange.ipc$dispatch("152cc175", new Object[]{this});
            }
            return new a();
        }

        public final /* synthetic */ void p(Choreographer choreographer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aef16d0", new Object[]{this, choreographer});
            } else {
                this.g = choreographer;
            }
        }

        public final void s() {
            MessageQueue queue;
            boolean isIdle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fec0c1ec", new Object[]{this});
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && this.i != null) {
                queue = this.i.getLooper().getQueue();
                isIdle = queue.isIdle();
                if (!isIdle) {
                    return;
                }
            }
            if (!this.k.getAndSet(true)) {
                mf.c().schedule(new b(), 10000L, TimeUnit.MILLISECONDS);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f28359a;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int size = f.h(f.this).size();
                this.f28359a = size;
                if (size > 0) {
                    if (SystemClock.elapsedRealtime() - f.j(f.this) > 30000) {
                        hkq.b(com.taobao.adaemon.e.MODULE_NAME, com.taobao.adaemon.e.b, "sch_frame_timeout", vu3.b.GEO_NOT_SUPPORT);
                        s55.i("FrameRater_ScheduleFrame", "quitHandlerThread timeout", "postingCnt", Integer.valueOf(this.f28359a));
                        f.k(f.this, Long.MAX_VALUE);
                    }
                    mf.c().schedule(this, 10000L, TimeUnit.MILLISECONDS);
                    return;
                }
                s55.i("FrameRater_ScheduleFrame", "queueHandler.quit", new Object[0]);
                if (f.l(f.this) != null) {
                    Looper looper = f.l(f.this).getLooper();
                    f.m(f.this, null);
                    looper.quit();
                }
                f.n(f.this).set(false);
            }
        }

        public final void t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a838569", new Object[]{this});
                return;
            }
            s55.i("FrameRater_ScheduleFrame", "removeAllCallback", new Object[0]);
            if (this.i != null) {
                this.i.removeCallbacksAndMessages(null);
            }
            this.d.clear();
            Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ((CopyOnWriteArrayList) this.c).clear();
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public Runnable f28358a;

            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    return;
                }
                Runnable runnable = (Runnable) f.e(f.this).poll();
                this.f28358a = runnable;
                if (runnable != null) {
                    if (ADaemon.traceEnabled) {
                        Trace.beginSection("ADaemon:mainHandler.post():" + this.f28358a.hashCode());
                    }
                    f.f(f.this).post(this.f28358a);
                    f.g(f.this).postFrameCallback(this);
                    f.h(f.this).remove(this.f28358a);
                    s55.i("FrameRater_ScheduleFrame", "doFrame, post:", "runnable", this.f28358a, "runningCnt", Integer.valueOf(f.h(f.this).size()));
                    if (ADaemon.traceEnabled) {
                        Trace.endSection();
                        return;
                    }
                    return;
                }
                f.i(f.this).set(false);
                s55.i("FrameRater_ScheduleFrame", "doFrame, cancel:", "runningCnt", Integer.valueOf(f.h(f.this).size()));
            }
        }

        public final /* synthetic */ void q(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b5a3354", new Object[]{this, runnable});
                return;
            }
            try {
                if (ADaemon.traceEnabled) {
                    Trace.beginSection("ADaemon:frameQueue.add():" + runnable.hashCode());
                    Trace.endSection();
                }
                ((ConcurrentHashMap) this.e).remove(Integer.valueOf(runnable.hashCode()));
                this.d.add(runnable);
                this.j = SystemClock.elapsedRealtime();
                if (!this.b.getAndSet(true)) {
                    this.g.postFrameCallback(this.h);
                }
                s();
            } catch (Throwable th) {
                s55.h("FrameRater_ScheduleFrame", "queueHandler run err", th, new Object[0]);
            }
        }

        public final void u(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1544b36e", new Object[]{this, runnable});
                return;
            }
            boolean remove = ((CopyOnWriteArrayList) this.c).remove(runnable);
            if (remove) {
                if (this.i != null) {
                    this.i.removeCallbacks((Runnable) ((ConcurrentHashMap) this.e).remove(Integer.valueOf(runnable.hashCode())));
                }
                this.d.remove(runnable);
            }
            Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
            s55.i("FrameRater_ScheduleFrame", "removeCallback", "runnable", runnable, "result", Boolean.valueOf(remove));
        }

        public final void r(final Runnable runnable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("469600b9", new Object[]{this, runnable, new Integer(i)});
            } else if (this.g == null) {
                s55.i("FrameRater_ScheduleFrame", "postCallback, mainChoreographer is null", new Object[0]);
                this.f.postDelayed(runnable, i);
            } else {
                int max = Math.max(0, i);
                ((CopyOnWriteArrayList) this.c).add(runnable);
                s55.i("FrameRater_ScheduleFrame", "postCallback", "runnable", runnable, cc5.DELAY_MILLIS, Integer.valueOf(max), "runningCnt", Integer.valueOf(((CopyOnWriteArrayList) this.c).size()));
                if (this.h == null) {
                    this.h = o();
                }
                if (this.i == null) {
                    HandlerThread handlerThread = new HandlerThread("ADaemon-Frame_HT");
                    handlerThread.start();
                    this.i = new Handler(handlerThread.getLooper());
                }
                Runnable yy9Var = new Runnable() { // from class: tb.yy9
                    @Override // java.lang.Runnable
                    public final void run() {
                        sy9.f.this.q(runnable);
                    }
                };
                ((ConcurrentHashMap) this.e).put(Integer.valueOf(runnable.hashCode()), yy9Var);
                this.i.postDelayed(yy9Var, max);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f28360a;
        public final int b;

        static {
            t2o.a(349175921);
        }

        public g(Object obj, int i) {
            this.f28360a = obj;
            this.b = i;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("dispatchTouchEvent".equals(method.getName()) && TimeMeter.a("FrameRater_hookTouchEvent", 500L)) {
                s55.i("FrameRater", "dispatchTouchEvent", new Object[0]);
                sy9.j(sy9.this, 3000L, this.b);
            }
            try {
                return method.invoke(this.f28360a, objArr);
            } catch (Throwable th) {
                s55.h("FrameRater", "hookImpl invoke err", th, new Object[0]);
                if (!(th instanceof InvocationTargetException) || th.getCause() == null) {
                    throw th;
                }
                throw th.getCause();
            }
        }
    }

    static {
        t2o.a(349175919);
    }

    public static /* synthetic */ void j(sy9 sy9Var, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deeaee4e", new Object[]{sy9Var, new Long(j), new Integer(i)});
        } else {
            sy9Var.o(j, i);
        }
    }

    public static /* synthetic */ Set k(sy9 sy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("87758f9a", new Object[]{sy9Var});
        }
        return sy9Var.f;
    }

    public static /* synthetic */ List l(sy9 sy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("779160bd", new Object[]{sy9Var});
        }
        return sy9Var.e;
    }

    public static sy9 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy9) ipChange.ipc$dispatch("9d260157", new Object[0]);
        }
        return d.instance;
    }

    public void A(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97072204", new Object[]{this, activity});
        } else if (oxn.s().F()) {
            if (LocalProcessMonitor.h0().r0()) {
                s55.i("FrameRater", "Don't lock in fold device", new Object[0]);
            } else {
                mf.c().execute(new Runnable() { // from class: tb.ly9
                    @Override // java.lang.Runnable
                    public final void run() {
                        sy9.this.q(activity);
                    }
                });
            }
        }
    }

    public void B(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828f5ea8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            mf.c().execute(new Runnable() { // from class: tb.py9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.s(i, i2);
                }
            });
        }
    }

    public void C(final Runnable runnable, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb39d3f", new Object[]{this, runnable, new Long(j)});
        } else if (!tb.f.j()) {
            this.f28354a.postDelayed(runnable, j);
        } else {
            mf.d().execute(new Runnable() { // from class: tb.oy9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.u(runnable, j);
                }
            });
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bc2ed8", new Object[]{this});
        } else if (!tb.f.j()) {
            this.f28354a.removeCallbacksAndMessages(null);
        } else {
            mf.d().execute(new Runnable() { // from class: tb.ky9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.v();
                }
            });
        }
    }

    public void E(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1544b36e", new Object[]{this, runnable});
        } else if (!tb.f.j()) {
            this.f28354a.removeCallbacks(runnable);
        } else {
            mf.d().execute(new Runnable() { // from class: tb.jy9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.w(runnable);
                }
            });
        }
    }

    public void F(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc84e81f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            mf.c().execute(new Runnable() { // from class: tb.ny9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.t(i, i2);
                }
            });
        }
    }

    public void G(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d08a98", new Object[]{this, new Integer(i)});
        } else {
            mf.c().execute(new Runnable() { // from class: tb.my9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.x(i);
                }
            });
        }
    }

    public final boolean n(Activity activity) {
        Window.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00c173b", new Object[]{this, activity})).booleanValue();
        }
        if (com.taobao.adaemon.g.E(activity) < 60.0f) {
            s55.i("FrameRater", "hookTouchEvent, refreshRate < 60", new Object[0]);
            return false;
        }
        int hashCode = activity.hashCode();
        if (((CopyOnWriteArrayList) this.e).contains(Integer.valueOf(hashCode))) {
            return true;
        }
        try {
            Window.Callback callback2 = activity.getWindow().getCallback();
            if (callback2 != null) {
                callback = callback2;
            } else {
                callback = activity;
            }
            if (!(callback instanceof Proxy) || !(Proxy.getInvocationHandler(callback) instanceof g)) {
                activity.getWindow().setCallback((Window.Callback) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Window.Callback.class}, new g(callback, hashCode)));
            }
            ((CopyOnWriteArrayList) this.e).add(Integer.valueOf(hashCode));
            s55.i("FrameRater", "hookTouchEvent, success", "activity", activity.getLocalClassName(), "callback", callback2);
            return true;
        } catch (Throwable th) {
            s55.h("FrameRater", "hookTouchEvent err", th, new Object[0]);
            return false;
        }
    }

    public final void o(final long j, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3568f734", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            mf.c().execute(new Runnable() { // from class: tb.qy9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.p(j, i);
                }
            });
        }
    }

    public final /* synthetic */ void p(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a84ca68", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.arg1 = (int) j;
        obtain.arg2 = i;
        this.d.b(obtain);
    }

    public final /* synthetic */ void q(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708cd511", new Object[]{this, activity});
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
        if (n(activity)) {
            s55.i("FrameRater", "lock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 4;
            this.d.b(obtain);
        }
    }

    public final /* synthetic */ void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2580bff2", new Object[]{this, new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        this.b.b(obtain);
    }

    public final /* synthetic */ void u(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cefc75", new Object[]{this, runnable, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = runnable;
        obtain.arg1 = (int) j;
        this.c.b(obtain);
    }

    public final /* synthetic */ void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137081e4", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.c.b(obtain);
    }

    public final /* synthetic */ void w(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987dfbf9", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = runnable;
        this.c.b(obtain);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Choreographer b;
        public Field c;
        public Field d;
        public Choreographer.FrameCallback j;
        public Choreographer.FrameCallback k;
        public boolean l;
        public long n;
        public double o;
        public int p;
        public long q;
        public long r;
        public int s;
        public final AtomicInteger e = new AtomicInteger();
        public final AtomicBoolean f = new AtomicBoolean();
        public final AtomicBoolean g = new AtomicBoolean();
        public final AtomicBoolean h = new AtomicBoolean();
        public final AtomicBoolean i = new AtomicBoolean();
        public final ConcurrentHashMap<Integer, Set<String>> m = new ConcurrentHashMap<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public long f28356a;

            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                if (this.f28356a != j) {
                    this.f28356a = j;
                    e eVar = e.this;
                    if (!e.o(eVar).get() && !e.f(eVar).get()) {
                        try {
                            e.h(eVar).set(e.g(eVar), Long.valueOf(System.nanoTime() + 20000000));
                        } catch (Throwable th) {
                            s55.h("FrameRater_LockFrame", "lock err", th, new Object[0]);
                        }
                    }
                    if (e.i(eVar) && !e.f(eVar).get()) {
                        e.g(eVar).postFrameCallback(this);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    return;
                }
                e eVar = e.this;
                long j2 = eVar.r;
                if (j2 != j) {
                    if (j2 > 0) {
                        eVar.o += 1000000000 / (j - j2);
                        eVar.p++;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        e eVar2 = e.this;
                        if (elapsedRealtime - eVar2.q >= 1000) {
                            double d = eVar2.o / eVar2.p;
                            s55.i("FrameRater_LockFrame", "detectFps", "avgFps", Double.valueOf(d));
                            if (d < 24.0d) {
                                s55.i("FrameRater_LockFrame", "detectFps over, degrade", new Object[0]);
                                e.j(e.this);
                                e.k(e.this, false);
                                e.l(e.this).set(false);
                                e.m(e.this);
                                return;
                            }
                            e eVar3 = e.this;
                            if (eVar3.s == 3) {
                                s55.i("FrameRater_LockFrame", "detectFps over, keep fps divisor", new Object[0]);
                                e.l(e.this).set(false);
                                return;
                            }
                            e.n(eVar3, true);
                            return;
                        }
                    }
                    e eVar4 = e.this;
                    eVar4.r = j;
                    e.g(eVar4).postFrameCallback(this);
                }
            }
        }

        static {
            t2o.a(349175925);
        }

        public e(Context context) {
            super(sy9.this, context);
        }

        public static /* synthetic */ AtomicBoolean f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("afce78b1", new Object[]{eVar});
            }
            return eVar.i;
        }

        public static /* synthetic */ Choreographer g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Choreographer) ipChange.ipc$dispatch("b988d8f6", new Object[]{eVar});
            }
            return eVar.b;
        }

        public static /* synthetic */ Field h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Field) ipChange.ipc$dispatch("e718dbec", new Object[]{eVar});
            }
            return eVar.c;
        }

        public static /* synthetic */ boolean i(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b77ec92", new Object[]{eVar})).booleanValue();
            }
            return eVar.r();
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1147757818) {
                super.b((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/FrameRater$LockFrame");
        }

        public static /* synthetic */ void j(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59ca686b", new Object[]{eVar});
            } else {
                eVar.B();
            }
        }

        public static /* synthetic */ boolean k(e eVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("234d1010", new Object[]{eVar, new Boolean(z)})).booleanValue();
            }
            eVar.l = z;
            return z;
        }

        public static /* synthetic */ AtomicBoolean l(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("b3dcb7a9", new Object[]{eVar});
            }
            return eVar.h;
        }

        public static /* synthetic */ void m(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a81ce448", new Object[]{eVar});
            } else {
                eVar.w();
            }
        }

        public static /* synthetic */ void n(e eVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bfab22", new Object[]{eVar, new Boolean(z)});
            } else {
                eVar.p(z);
            }
        }

        public static /* synthetic */ AtomicBoolean o(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("9ede91d7", new Object[]{eVar});
            }
            return eVar.f;
        }

        public final void B() {
            if (this.l) {
                try {
                    this.d.set(this.b, 1);
                    s55.i("FrameRater_LockFrame", "unlockFPSDivisor succ", new Object[0]);
                } catch (Throwable th) {
                    s55.h("FrameRater_LockFrame", "unlockFPSDivisor err", th, new Object[0]);
                }
            }
        }

        @Override // tb.sy9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            com.taobao.adaemon.g.w(new ik4() { // from class: tb.ty9
                @Override // tb.ik4
                public final void accept(Object obj) {
                    sy9.e.this.u((Choreographer) obj);
                }
            });
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    Field i = StaticHook.i(Choreographer.class, "mFPSDivisor");
                    this.d = i;
                    i.setAccessible(true);
                    this.l = true;
                } catch (Throwable th) {
                    s55.h("FrameRater_LockFrame", "init mFPSDivisor err", th, new Object[0]);
                }
            }
            try {
                Field i2 = StaticHook.i(Choreographer.class, "mLastFrameTimeNanos");
                this.c = i2;
                i2.setAccessible(true);
            } catch (Throwable th2) {
                s55.h("FrameRater_LockFrame", "init mLastFrameTimeNanos err", th2, new Object[0]);
            }
            if (tb.f.c("adaemon_forbid_usingFPSDivisor")) {
                this.l = false;
            }
        }

        @Override // tb.sy9.b
        public void b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("446964fa", new Object[]{this, message});
                return;
            }
            super.b(message);
            if (this.b == null) {
                s55.i("FrameRater_LockFrame", "empty mainChoreographer", new Object[0]);
                return;
            }
            switch (message.what) {
                case 4:
                    this.e.incrementAndGet();
                    w();
                    return;
                case 5:
                    this.e.decrementAndGet();
                    A(message.arg1);
                    return;
                case 6:
                    s(message.arg1, message.arg2);
                    return;
                case 7:
                    x(message.arg1, message.arg2);
                    return;
                case 8:
                    z(message.arg1, message.arg2);
                    return;
                default:
                    return;
            }
        }

        public final void p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899c13a7", new Object[]{this, new Boolean(z)});
                return;
            }
            if (!this.g.get()) {
                mf.k(new Runnable() { // from class: tb.uy9
                    @Override // java.lang.Runnable
                    public final void run() {
                        sy9.e.this.t();
                    }
                }, 5L, TimeUnit.SECONDS);
            }
            if (z || !this.g.getAndSet(true)) {
                int i = this.s + 1;
                this.s = i;
                if (i > 3) {
                    s55.i("FrameRater_LockFrame", "detectFps exceeded", new Object[0]);
                    return;
                }
                s55.i("FrameRater_LockFrame", "detectFps", "detectTimes", Integer.valueOf(i));
                this.h.set(true);
                this.o = vu3.b.GEO_NOT_SUPPORT;
                this.p = 0;
                this.r = 0L;
                this.q = SystemClock.elapsedRealtime();
                if (this.k == null) {
                    this.k = new b();
                }
                this.b.postFrameCallback(this.k);
            }
        }

        public final String q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d48d467e", new Object[]{this, new Integer(i)});
            }
            switch (i) {
                case 1:
                    return "REASON_LIFECYCLE";
                case 2:
                    return "REASON_TAOLIVE";
                case 3:
                    return "REASON_TAOLIVE_PLAYER";
                case 4:
                    return "REASON_ND_PIC";
                case 5:
                    return "REASON_TAOLIVE_NOTICE";
                case 6:
                    return "REASON_TAB2_AVATAR_BREATHING";
                default:
                    return "REASON_OTHERS";
            }
        }

        public final boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d1078f0", new Object[]{this})).booleanValue();
            }
            if (this.e.get() > 0) {
                return true;
            }
            return false;
        }

        public final void s(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a3e774a", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (!r()) {
                s55.i("FrameRater_LockFrame", "interrupt, not locking", new Object[0]);
            } else if (this.h.get()) {
                s55.i("FrameRater_LockFrame", "interrupt, detecting", new Object[0]);
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min = Math.min(3000L, i);
                long j = elapsedRealtime + min;
                if (j >= this.n) {
                    if (min != 3000 || TimeMeter.a("FrameRater_LockFrame", 300L)) {
                        this.n = j;
                        this.f.set(true);
                        B();
                        mf.c().schedule(new Runnable() { // from class: tb.vy9
                            @Override // java.lang.Runnable
                            public final void run() {
                                sy9.e.this.v();
                            }
                        }, min + 50, TimeUnit.MILLISECONDS);
                        return;
                    }
                    s55.i("FrameRater_LockFrame", "interrupt, freq", new Object[0]);
                }
            }
        }

        public final /* synthetic */ void t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cace5fe", new Object[]{this});
            } else {
                this.h.set(false);
            }
        }

        public final /* synthetic */ void u(Choreographer choreographer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aef16d0", new Object[]{this, choreographer});
            } else {
                this.b = choreographer;
            }
        }

        public final /* synthetic */ void v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cfe2bda", new Object[]{this});
            } else if (SystemClock.elapsedRealtime() > this.n) {
                s55.i("FrameRater_LockFrame", "interrupt finish", new Object[0]);
                this.f.set(false);
                if (this.l) {
                    w();
                }
            }
        }

        public final void y(int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b642d46", new Object[]{this, new Integer(i)});
            } else if (!sy9.k(sy9.this).isEmpty() && FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY.equals(LocalProcessMonitor.h0().e0())) {
                Iterator it = sy9.k(sy9.this).iterator();
                while (true) {
                    if (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue == 3) {
                            i2 = intValue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                sy9.k(sy9.this).clear();
                if (i2 > 0) {
                    Set<String> set = this.m.get(Integer.valueOf(i));
                    if (set == null) {
                        set = new HashSet<>();
                        this.m.put(Integer.valueOf(i), set);
                    }
                    set.add(q(i2));
                }
            }
        }

        public final void w() {
            if (r()) {
                AtomicBoolean atomicBoolean = this.i;
                s55.i("FrameRater_LockFrame", OConstant.DIMEN_FILE_LOCK, "pausing", Boolean.valueOf(atomicBoolean.get()), "usingFPSDivisor", Boolean.valueOf(this.l));
                if (this.l) {
                    try {
                        if (!atomicBoolean.get()) {
                            this.d.set(this.b, 2);
                            s55.i("FrameRater_LockFrame", "lock fps divisor success", new Object[0]);
                            p(false);
                        }
                    } catch (Throwable th) {
                        s55.h("FrameRater_LockFrame", "lock fps divisor err", th, new Object[0]);
                    }
                } else if (this.c != null) {
                    if (this.j == null) {
                        this.j = new a();
                    }
                    this.b.postFrameCallback(this.j);
                    s55.i("FrameRater_LockFrame", "lock frame success", new Object[0]);
                }
            }
        }

        public final void A(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9d08a98", new Object[]{this, new Integer(i)});
                return;
            }
            s55.i("FrameRater_LockFrame", "unlock success", "activityHash", Integer.valueOf(i));
            this.m.remove(Integer.valueOf(i));
            if (!r()) {
                this.i.set(false);
                B();
                return;
            }
            sy9.l(sy9.this).contains(Integer.valueOf(LocalProcessMonitor.h0().g0()));
        }

        public final void x(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50fa349d", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (r()) {
                Set<String> set = this.m.get(Integer.valueOf(i));
                if (set == null) {
                    set = new HashSet<>();
                    this.m.put(Integer.valueOf(i), set);
                }
                String q = q(i2);
                set.add(q);
                s55.i("FrameRater_LockFrame", "pause success", "reason", q, "activityHash", Integer.valueOf(i));
                this.i.set(true);
                B();
            }
        }

        public final void z(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16251194", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (r()) {
                y(i);
                String q = q(i2);
                Set<String> set = this.m.get(Integer.valueOf(i));
                if (set != null && !set.isEmpty()) {
                    set.remove(q);
                    if (!set.isEmpty()) {
                        s55.i("FrameRater_LockFrame", "resume, but reasons not empty, pausing", new Object[0]);
                        this.i.set(true);
                        B();
                        return;
                    }
                }
                s55.i("FrameRater_LockFrame", "resume success", "reason", q, "hash", Integer.valueOf(i));
                this.i.set(false);
                w();
            }
        }
    }

    public sy9() {
        this.e = new CopyOnWriteArrayList();
        this.f = new HashSet();
        this.f28354a = new Handler(Looper.getMainLooper());
        Context l = com.taobao.adaemon.g.l();
        this.b = new c(this, l);
        this.c = new f(this, l);
        this.d = new e(l);
    }

    public final /* synthetic */ void t(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5830892e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (((CopyOnWriteArrayList) this.e).contains(Integer.valueOf(i))) {
            s55.i("FrameRater", "resumeLock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = i;
            obtain.arg2 = i2;
            this.d.b(obtain);
        }
    }

    public final /* synthetic */ void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f26967", new Object[]{this, new Integer(i)});
        } else if (((CopyOnWriteArrayList) this.e).remove(Integer.valueOf(i))) {
            s55.i("FrameRater", "unlock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.arg1 = i;
            this.d.b(obtain);
        }
    }

    public final /* synthetic */ void s(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4ae91e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (((CopyOnWriteArrayList) this.e).contains(Integer.valueOf(i))) {
            s55.i("FrameRater", "pauseLock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = i;
            obtain.arg2 = i2;
            this.d.b(obtain);
        } else if (i2 == 3) {
            ((HashSet) this.f).add(Integer.valueOf(i2));
        }
    }

    public void z(Context context, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f40c7d", new Object[]{this, context, new Integer(i)});
            return;
        }
        String str = Build.BRAND;
        if ((!"Xiaomi".equals(str) && !"Redmi".equals(str)) || !oxn.s().E() || context == null) {
            return;
        }
        if ((i == 0 || i == 10102 || i == 20201) && i != g) {
            g = i;
            s55.i("FrameRater", "limit", "rate", Integer.valueOf(i));
            mf.c().execute(new Runnable() { // from class: tb.iy9
                @Override // java.lang.Runnable
                public final void run() {
                    sy9.this.r(i);
                }
            });
        }
    }
}
