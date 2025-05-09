package tb;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbuprofen.adapter.anr.MainLooperTaskMonitor;
import com.taobao.android.tbuprofen.adapter.anr.TBAnrConfig;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.b01;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h0i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SOURCE_TYPE_IDLE_HANDLER = 2;
    public static final int SOURCE_TYPE_MESSAGE = 1;
    public static final int SOURCE_TYPE_MESSAGE_STR = 3;
    public static final String TBP_MSG_WHEN = "when";
    public static long s;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20342a;
    public final TBAnrConfig b;
    public b e;
    public c01 f;
    public String p = null;
    public final HandlerThread d = wsa.b("tbp-looper-monitor");
    public final MainLooperTaskMonitor c = new MainLooperTaskMonitor();
    public final Queue<g0i> g = new ConcurrentLinkedDeque();
    public g0i h = null;
    public final MessageQueue i = pri.b();
    public CountDownLatch r = null;
    public String j = "android.app.ActivityThread$H BIND_APPLICATION";
    public volatile long k = SystemClock.uptimeMillis();
    public long m = SystemClock.currentThreadTimeMillis();
    public volatile long l = 0;
    public long n = 0;
    public long o = 0;
    public long q = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements AnrUncaughtListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.tcrash.AnrUncaughtListener
        public Map<String, Object> onAnrUncaught() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
            }
            Log.e("MainLooperTaskManager", "anr happened!!! " + UTDevice.getUtdid(h0i.a(h0i.this)));
            long currentTimeMillis = System.currentTimeMillis();
            e6r.e(currentTimeMillis, h0i.b(h0i.this).anrInfoSaveFlag);
            HashMap hashMap = new HashMap();
            try {
                h0i h0iVar = h0i.this;
                h0i.e(h0iVar, h0i.f(h0iVar, currentTimeMillis));
                if ((h0i.b(h0i.this).anrInfoSaveFlag & 4) != 0) {
                    hashMap.put("TBP_ANR_INFO", h0i.d(h0i.this));
                }
                if ((h0i.b(h0i.this).anrInfoSaveFlag & 2) != 0) {
                    h0i h0iVar2 = h0i.this;
                    File g = h0i.g(h0iVar2, h0i.d(h0iVar2), currentTimeMillis);
                    if (g != null) {
                        hashMap.put("TBP_ANR_FILE", g.getName());
                    }
                }
                e6r.c(System.currentTimeMillis() - currentTimeMillis, h0i.d(h0i.this));
                return hashMap;
            } catch (Exception e) {
                e6r.d();
                Log.e("MainLooperTaskManager", "dump anr info error", e);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Handler implements f0i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final h0i f20344a;

        static {
            t2o.a(824180768);
            t2o.a(824180763);
        }

        public b(Looper looper, h0i h0iVar) {
            super(looper);
            this.f20344a = h0iVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/anr/MainLooperTaskManager$LooperCallbackHandler");
        }

        @Override // tb.f0i
        public void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74374dd4", new Object[]{this, message});
            } else {
                g(2, 1, Message.obtain(message));
            }
        }

        @Override // tb.f0i
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b31819", new Object[]{this, str});
            } else {
                g(1, 3, str);
            }
        }

        @Override // tb.f0i
        public void c(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e46bd43", new Object[]{this, idleHandler});
            } else {
                g(1, 2, idleHandler);
            }
        }

        @Override // tb.f0i
        public void d(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c9833e4", new Object[]{this, idleHandler});
            } else {
                g(2, 2, idleHandler);
            }
        }

        @Override // tb.f0i
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0d7340f", new Object[]{this});
            } else {
                g(1, 3, "");
            }
        }

        @Override // tb.f0i
        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e213f28b", new Object[]{this, str});
            } else {
                g(2, 3, str);
            }
        }

        public final void g(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0e0076", new Object[]{this, new Integer(i), new Integer(i2), obj});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.obj = obj;
            obtain.getData().putLong("upTime", uptimeMillis);
            obtain.getData().putLong("threadTime", currentThreadTimeMillis);
            sendMessage(obtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                h0i.j(this.f20344a, message);
            } else if (i == 2) {
                h0i.k(this.f20344a, message);
            } else if (i == 3) {
                this.f20344a.o((c) message.obj);
            } else if (i == 4) {
                h0i.l(this.f20344a, ((Long) message.obj).longValue());
                h0i.c(this.f20344a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public List<g0i> f20345a = null;
        public long b = -1;
        public String c = null;
        public long d = -1;
        public Queue<Message> e = null;
        public LinkedList<b01.a> f = null;
        public LinkedList<b01.a> g = null;
        public long h;

        static {
            t2o.a(824180769);
        }
    }

    static {
        t2o.a(824180765);
    }

    public h0i(Context context, TBAnrConfig tBAnrConfig) {
        this.f20342a = context;
        this.b = tBAnrConfig;
    }

    public static /* synthetic */ Context a(h0i h0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("21622823", new Object[]{h0iVar});
        }
        return h0iVar.f20342a;
    }

    public static /* synthetic */ TBAnrConfig b(h0i h0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAnrConfig) ipChange.ipc$dispatch("5a76e043", new Object[]{h0iVar});
        }
        return h0iVar.b;
    }

    public static /* synthetic */ void c(h0i h0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efacf5a", new Object[]{h0iVar});
        } else {
            h0iVar.y();
        }
    }

    public static /* synthetic */ String d(h0i h0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90198393", new Object[]{h0iVar});
        }
        return h0iVar.p;
    }

    public static /* synthetic */ String e(h0i h0iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c4a2207", new Object[]{h0iVar, str});
        }
        h0iVar.p = str;
        return str;
    }

    public static /* synthetic */ String f(h0i h0iVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("853f72ca", new Object[]{h0iVar, new Long(j)});
        }
        return h0iVar.n(j);
    }

    public static /* synthetic */ File g(h0i h0iVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e9a1d842", new Object[]{h0iVar, str, new Long(j)});
        }
        return h0iVar.x(str, j);
    }

    public static /* synthetic */ MainLooperTaskMonitor h(h0i h0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainLooperTaskMonitor) ipChange.ipc$dispatch("ae2c124d", new Object[]{h0iVar});
        }
        return h0iVar.c;
    }

    public static /* synthetic */ c01 i(h0i h0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c01) ipChange.ipc$dispatch("c9abaa1e", new Object[]{h0iVar});
        }
        return h0iVar.f;
    }

    public static /* synthetic */ void j(h0i h0iVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26088545", new Object[]{h0iVar, message});
        } else {
            h0iVar.u(message);
        }
    }

    public static /* synthetic */ void k(h0i h0iVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec330e06", new Object[]{h0iVar, message});
        } else {
            h0iVar.v(message);
        }
    }

    public static /* synthetic */ void l(h0i h0iVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53dd0", new Object[]{h0iVar, new Long(j)});
        } else {
            h0iVar.m(j);
        }
    }

    public final void m(long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fe9639", new Object[]{this, new Long(j)});
            return;
        }
        while (!((ConcurrentLinkedDeque) this.g).isEmpty()) {
            g0i g0iVar = (g0i) ((ConcurrentLinkedDeque) this.g).peek();
            if (g0iVar != null) {
                if (j - g0iVar.h() <= this.b.monitorTimeScope) {
                    break;
                }
                ((ConcurrentLinkedDeque) this.g).poll();
            }
        }
        if (this.b.isAnrTraceDumpEnable && this.f != null) {
            g0i g0iVar2 = (g0i) ((ConcurrentLinkedDeque) this.g).peek();
            if (g0iVar2 != null) {
                j2 = g0iVar2.i();
            } else {
                j2 = g0i.m.get();
            }
            this.f.a(j2);
        }
    }

    public void o(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1627b4e", new Object[]{this, cVar});
            return;
        }
        try {
            cVar.b = this.k;
            cVar.d = SystemClock.uptimeMillis();
            cVar.c = this.j;
            cVar.h = this.q;
            cVar.f20345a = p();
            if (this.b.isAnrTraceDumpEnable) {
                cVar.f = new LinkedList<>();
                LinkedList<b01.a> linkedList = new LinkedList<>();
                cVar.g = linkedList;
                this.f.b(cVar.f, linkedList);
            }
            this.r.countDown();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final List<g0i> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8d26ff", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ConcurrentLinkedDeque) this.g).iterator();
        while (it.hasNext()) {
            arrayList.add(new g0i((g0i) it.next()));
        }
        return arrayList;
    }

    public long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5391810c", new Object[]{this})).longValue();
        }
        return this.k;
    }

    public Queue<Message> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("bc87494b", new Object[]{this});
        }
        return s(this.b.maxPendingMessageCount);
    }

    public final Queue<Message> s(int i) {
        LinkedList linkedList = new LinkedList();
        synchronized (this.i) {
            try {
                Field c2 = ReflectUtils.c(MessageQueue.class, "mMessages");
                Field c3 = ReflectUtils.c(Message.class, "next");
                if (c2 != null && c3 != null) {
                    int i2 = 0;
                    for (Message message = (Message) c2.get(this.i); message != null; message = (Message) c3.get(message)) {
                        i2++;
                        if (i2 > i) {
                            break;
                        }
                        Message obtain = Message.obtain(message);
                        obtain.getData().putLong("when", message.getWhen());
                        linkedList.add(obtain);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return linkedList;
    }

    public final void w(int i, Object obj, long j, long j2, long j3) {
        boolean z;
        String str;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93a5102", new Object[]{this, new Integer(i), obj, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        long j4 = j3 - j2;
        if (j4 > this.b.largeTaskThreshold) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            Message message = (Message) obj;
            if (pri.f(message)) {
                ((ConcurrentLinkedDeque) this.g).add(g0i.f(message, j4, j, z, j2, j3));
                this.h = null;
                return;
            }
        } else if (i == 3) {
            String str2 = this.j;
            if (pri.g(str2)) {
                ((ConcurrentLinkedDeque) this.g).add(g0i.g(str2, j4, j, z, j2, j3));
                this.h = null;
                return;
            }
        }
        if (z) {
            if (i == 3) {
                obj2 = this.j;
            } else {
                obj2 = obj;
            }
            ((ConcurrentLinkedDeque) this.g).add(g0i.e(i, obj2, j4, j, j2, j3));
            this.h = null;
            return;
        }
        g0i g0iVar = this.h;
        if (g0iVar == null || !g0iVar.b()) {
            g0i c2 = g0i.c(j4, j, j2, j3);
            this.h = c2;
            ((ConcurrentLinkedDeque) this.g).add(c2);
            return;
        }
        if (this.b.collectAggregatedMessage) {
            str = pri.c(i, obj);
        } else {
            str = "";
        }
        this.h.a(j4, j, j3, this.o, str);
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("110d91e0", new Object[]{this});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = Long.valueOf(uptimeMillis);
        this.e.sendMessageDelayed(obtain, this.b.checkTaskInterval);
    }

    public final void v(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebc6991", new Object[]{this, message});
            return;
        }
        this.l = message.peekData().getLong("upTime");
        long j = message.peekData().getLong("threadTime");
        this.n = j;
        w(message.arg1, message.obj, j - this.m, this.k, this.l);
        if (message.arg1 == 1) {
            ((Message) message.obj).recycle();
        }
        this.k = -1L;
    }

    public final File x(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("54c55947", new Object[]{this, str, new Long(j)});
        }
        int myPid = Process.myPid();
        String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Long.valueOf(j));
        File file = new File(this.f20342a.getExternalFilesDir("anrinfo"), myPid + "_" + format + ".anr");
        if (!y74.i(file, str, false)) {
            return null;
        }
        urr.d("MainLooperTaskManager", "Save anr info to " + file.getAbsolutePath(), new Object[0]);
        return file;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.d.start();
        this.e = new b(this.d.getLooper(), this);
        y();
        int i = this.b.monitorMessageType;
        if (Build.VERSION.SDK_INT < 29) {
            i = 2;
        }
        boolean d = this.c.d(i, this.e);
        urr.b("MainLooperTaskManager", "Start Main Looper Monitor: %b", Boolean.valueOf(d));
        if (d && this.b.isAnrTraceDumpEnable) {
            c01 c01Var = new c01(this, this.b);
            this.f = c01Var;
            c01Var.c();
        }
        UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY);
        crashCaughtHeaderByType.addHeaderInfo("TBP_ANR_ENABLE", y74.g(System.currentTimeMillis()));
        crashCaughtHeaderByType.addHeaderInfo("TBP_ANR_DUMP_FLAG", String.valueOf(this.b.anrInfoSaveFlag));
        if (this.b.dumpNativeStack) {
            crashCaughtHeaderByType.addHeaderInfo("TBP_ANR_DUMP_NATIVE_STACK", "true");
        }
        TCrashSDK.instance().addAnrUncaughtListener(new a());
    }

    public synchronized c z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a3a0b65", new Object[]{this});
        }
        c cVar = new c();
        synchronized (this.i) {
            urr.b("MainLooperTaskManager", "dump main looper message!", new Object[0]);
            cVar.e = r();
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = cVar;
            this.e.sendMessage(obtain);
        }
        try {
            urr.b("MainLooperTaskManager", "wait dump history!", new Object[0]);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.r = countDownLatch;
            if (!countDownLatch.await(10000L, TimeUnit.MILLISECONDS)) {
                urr.b("MainLooperTaskManager", "wait dump history timeout!", new Object[0]);
                return null;
            }
            urr.b("MainLooperTaskManager", "Take snapshot done!!!", new Object[0]);
            return cVar;
        } catch (Exception e) {
            urr.b("MainLooperTaskManager", "wait dump history error!", new Object[0]);
            e.printStackTrace();
            return null;
        }
    }

    public final void u(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950685f", new Object[]{this, message});
            return;
        }
        if (g0i.m.get() == 0) {
            this.l = message.peekData().getLong("upTime");
            this.n = message.peekData().getLong("threadTime");
            long j = this.l - this.k;
            long j2 = this.n - this.m;
            boolean z = j > ((long) this.b.largeTaskThreshold);
            Message obtain = Message.obtain();
            obtain.what = 110;
            ((ConcurrentLinkedDeque) this.g).add(g0i.f(obtain, j, j2, z, this.k, this.l));
            obtain.recycle();
        }
        this.k = message.peekData().getLong("upTime");
        this.m = message.peekData().getLong("threadTime");
        int i = message.arg1;
        if (i == 3) {
            this.j = (String) message.obj;
        } else if (i == 2) {
            this.j = message.obj.getClass().getName();
        }
        long j3 = this.k - this.l;
        this.o = j3;
        long j4 = this.m - this.n;
        if (j3 >= this.b.idleTaskThreshold) {
            ((ConcurrentLinkedDeque) this.g).add(g0i.d(j3, j4, this.l, this.k));
            this.h = null;
            this.o = 0L;
        }
        this.l = -1L;
        this.q++;
    }

    public final String n(long j) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15013582", new Object[]{this, new Long(j)});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        c z = z();
        if (z == null) {
            return "null";
        }
        if (this.b.dumpMessageObjInfo) {
            pri.e();
        }
        StringBuilder sb = new StringBuilder("\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nTBP ANR Message Start\n[packageName]:");
        sb.append(this.f20342a.getPackageName());
        sb.append("\n[anrTime]:");
        sb.append(y74.g(j));
        sb.append("\n[buildId]:");
        sb.append(y74.a(this.f20342a, "build_id"));
        sb.append("\n[deviceBrand]:");
        sb.append(Build.BRAND);
        sb.append("\n[deviceModel]:");
        sb.append(Build.MODEL);
        sb.append("\n[fingerprint]:");
        sb.append(Build.FINGERPRINT);
        sb.append("\n[systemVersion]:");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\n[sdkVersion]:");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\n[utdid]:");
        sb.append(UTDevice.getUtdid(this.f20342a));
        sb.append("\n[is64bit]:");
        sb.append(br2.b());
        sb.append("\n\n[Running Task]\n");
        long j2 = z.b;
        if (j2 == -1) {
            sb.append("Do not have any running task.\n");
        } else if (j2 == 0) {
            long j3 = s;
            sb.append(String.format("[%s]====> Execute: %dms. %s", y74.g(j3), Long.valueOf(j - j3), "BindApplication"));
            sb.append("\n");
        } else {
            long j4 = z.d - j2;
            sb.append(String.format("[%s]====> Execute: %dms. %s", y74.g(j - j4), Long.valueOf(j4), z.c));
            sb.append("\n");
        }
        LinkedList<b01.a> linkedList = z.g;
        if (linkedList != null && !linkedList.isEmpty()) {
            while (!z.g.isEmpty()) {
                b01.a peek = z.g.peek();
                if (peek != null) {
                    sb.append(peek);
                    sb.append("\n");
                    z.g.poll();
                }
            }
        }
        sb.append("\n[Total Handle Message]: ");
        sb.append(z.h);
        sb.append("\n\n[History Task]: ");
        List<g0i> list = z.f20345a;
        sb.append(list.size());
        sb.append("\n");
        for (int size = list.size() - 1; size >= 0; size--) {
            g0i g0iVar = list.get(size);
            sb.append(g0iVar.toString());
            sb.append("\n");
            Iterator<b01.a> it = z.f.iterator();
            while (it.hasNext()) {
                b01.a next = it.next();
                if (g0iVar.i() == next.f16105a) {
                    sb.append(next);
                    sb.append("\n");
                }
            }
        }
        Queue<Message> queue = z.e;
        sb.append("\n[Main Looper MessageQueue]: ");
        sb.append(queue.size());
        sb.append("\n");
        for (Message message : queue) {
            boolean z2 = message.getTarget() == null;
            long j5 = message.getData().getLong("when");
            long j6 = j5 - uptimeMillis;
            String h = y74.h(j5);
            if (z2) {
                str = "Barrier";
            } else {
                str = "Message";
            }
            if (j6 < 0) {
                str2 = "waited";
            } else {
                str2 = "after";
            }
            sb.append(String.format("[%s] ==> (%s %s:%d)", h, str, str2, Long.valueOf(Math.abs(j6))));
            if (z2) {
                sb.append(" index:");
                sb.append(message.arg1);
            } else {
                sb.append(" what:");
                sb.append(message.what);
                sb.append(", target:");
                sb.append(message.getTarget().getClass().getName());
                if (message.getCallback() != null) {
                    sb.append(", callback:");
                    sb.append(message.getCallback().getClass().getName());
                }
                if (pri.f(message)) {
                    String d = pri.d(message.obj, message.what);
                    sb.append(", obj:");
                    sb.append(d);
                }
            }
            sb.append("\n");
            message.recycle();
        }
        sb.append("\nTBP ANR Message End\n");
        return sb.toString();
    }
}
