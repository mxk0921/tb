package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.e8b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class u7b implements eq9, ruc, l7b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, cov> J = new ConcurrentHashMap();
    public static final Deque<String> K = new LinkedList();
    public boolean A;
    public int B;
    public final boolean D;
    public final String b;
    public String c;
    public boolean d;
    public String f;
    public int g;
    public final t7b h;
    public volatile s7b i;
    public final List<ss2> j;
    public final ss2 k;
    public final cf4 l;
    public e8b m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public String s;
    public int t;
    public int u;
    public int v;
    public String x;
    public String y;
    public long z;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f29206a = new AtomicInteger(0);
    public final Object r = new Object();
    public final Map<String, String> w = new HashMap();
    public boolean C = false;
    public long E = 0;
    public long F = -3;
    public long G = -3;
    public long H = -3;
    public String e;
    public final feh I = new feh(toString(), this.e);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends Handler implements ss2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f29207a;
        public final List<ss2> b;

        static {
            t2o.a(774897890);
            t2o.a(774897871);
        }

        public a(String str, List<ss2> list) {
            super(Looper.getMainLooper());
            this.f29207a = str;
            this.b = list;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/cache/library/HttpProxyCacheServerClients$UiListenerHandler");
        }

        @Override // tb.ss2
        public void a(File file, String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef625295", new Object[]{this, file, str, new Integer(i)});
                return;
            }
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            for (ss2 ss2Var : this.b) {
                ss2Var.a((File) message.obj, this.f29207a, message.arg1);
            }
        }
    }

    static {
        t2o.a(774897889);
        t2o.a(774897874);
        t2o.a(774897894);
        t2o.a(774897876);
    }

    public u7b(String str, cf4 cf4Var, t7b t7bVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.j = copyOnWriteArrayList;
        this.D = true;
        this.b = (String) epm.b(str);
        this.l = (cf4) epm.b(cf4Var);
        this.k = new a(str, copyOnWriteArrayList);
        this.h = t7bVar;
        this.D = true;
    }

    public final void a() {
        String n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f1e4c9", new Object[]{this});
        } else if (this.i != null && this.i.p != null) {
            try {
                n = this.i.p.n();
            } catch (Exception e) {
                AVSDKLog.e("TBNetStatistic", "commitTBNetData error:" + e.getMessage());
            }
            if (!TextUtils.isEmpty(n)) {
                String[] split = n.split(",");
                if (this.D) {
                    TBS.Ext.commitEvent("Page_Video", 19997, "Page_Video_Button-TBNetStatistic", "", "", split);
                } else {
                    TBS.Adv.ctrlClicked("Page_Video", CT.Button, "TBNetStatistic", split);
                }
                AVSDKLog.d("TBNetStatistic", n);
                AVSDKLog.e(this.I, n);
                try {
                    String[] strArr = {"play_token=" + this.e, "read_from_download=" + (this.n - this.o), "read_from_cache=" + this.o};
                    if (this.D) {
                        TBS.Ext.commitEvent("Page_VideoCache", 19997, "Page_VideoCache_Button-PlayerCache", "", "", strArr);
                    } else {
                        TBS.Adv.ctrlClicked("Page_VideoCache", CT.Button, "PlayerCache", strArr);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2614c4ad", new Object[]{this});
            return;
        }
        e8b.a aVar = new e8b.a();
        aVar.i(this);
        aVar.e(this);
        aVar.p(this.b);
        aVar.r(this.c);
        aVar.h(e2n.j(this.b));
        aVar.q(this.d);
        aVar.j(this.e);
        aVar.c(this.f);
        feh fehVar = this.I;
        AVSDKLog.e(fehVar, "videoLength is  :" + this.g + "cached videolenth is : " + mfi.b(this.l.b(this.b)));
        aVar.f(this.g);
        aVar.g(mfi.b(this.l.b(this.b)));
        aVar.b(this.s);
        aVar.d(this.t);
        aVar.n(this.u);
        aVar.o(this.v);
        aVar.t(this.x);
        aVar.s(this.y);
        aVar.m(this.z);
        aVar.k(this.A);
        aVar.l(this.B);
        this.m = aVar.a();
    }

    public final synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af777f9a", new Object[]{this});
            return;
        }
        if (this.f29206a.decrementAndGet() <= 0 && this.i != null) {
            a();
            this.i.A(null);
            this.i.B(null);
            this.i.p();
            this.i = null;
        }
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("840450ff", new Object[]{this})).longValue();
        }
        return this.o;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        return this.l.b(this.b);
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c159047f", new Object[]{this})).longValue();
        }
        if (this.i == null || this.H > 0) {
            return this.H;
        }
        return this.i.f();
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e591b4b5", new Object[]{this})).longValue();
        }
        if (this.i == null || this.F > 0) {
            return this.F;
        }
        return this.i.u();
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19cd9331", new Object[]{this})).longValue();
        }
        if (this.i == null || this.G > 0) {
            return this.G;
        }
        return this.i.g();
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34d4b41", new Object[]{this})).longValue();
        }
        AVSDKLog.e(this.I, "enter client getHeadRequestTime!");
        return this.E;
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b7f9e48", new Object[]{this});
        }
        return this.w;
    }

    public cov k(String str) {
        Map<String, cov> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cov) ipChange.ipc$dispatch("cdd36333", new Object[]{this, str});
        }
        synchronized (this.r) {
            try {
                if (!TextUtils.isEmpty(str) && (map = J) != null && !((ConcurrentHashMap) map).isEmpty()) {
                    String h = e2n.h(str);
                    if (TextUtils.isEmpty(h)) {
                        return null;
                    }
                    cov covVar = (cov) ((ConcurrentHashMap) map).get(h);
                    if (covVar != null) {
                        Deque<String> deque = K;
                        ((LinkedList) deque).remove(h);
                        ((LinkedList) deque).addFirst(h);
                    }
                    return covVar;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56bec7d1", new Object[]{this});
        }
        if (this.i == null || this.i.p == null) {
            return "";
        }
        return this.i.p.n();
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d537ac5", new Object[]{this})).longValue();
        }
        return this.n - this.o;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83a2ccb3", new Object[]{this})).longValue();
        }
        if (this.q) {
            return this.n - this.o;
        }
        return 0L;
    }

    public long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de691d0d", new Object[]{this})).longValue();
        }
        return this.p;
    }

    public final s7b p() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s7b) ipChange.ipc$dispatch("75f3cb0c", new Object[]{this});
        }
        b();
        s7b s7bVar = new s7b(this.m, new wb9(this.l.a(this.b), this.l.b), this.h);
        s7bVar.A(this.k);
        s7bVar.B(this);
        return s7bVar;
    }

    public void q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbeb048", new Object[]{this, str, str2});
            return;
        }
        ((HashMap) this.w).put(str, str2);
        if ("HeadRequetTime".equals(str)) {
            feh fehVar = this.I;
            AVSDKLog.e(fehVar, "onInfo fetchContentInfo :" + str2);
            this.E = (long) Integer.valueOf(str2).intValue();
        }
    }

    public void r(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d488efb6", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.n += i;
        this.o += i2;
        this.q = z;
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495e1c22", new Object[]{this, new Integer(i)});
        } else {
            this.p += i;
        }
    }

    public void t(b8a b8aVar, Socket socket) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b483dcf", new Object[]{this, b8aVar, socket});
            return;
        }
        if (b8aVar != null) {
            this.c = b8aVar.d;
            this.d = b8aVar.e;
            String str = b8aVar.f;
            this.e = str;
            this.I.c(str);
            this.f = b8aVar.g;
            this.g = b8aVar.h;
            this.s = b8aVar.n;
            this.t = b8aVar.k;
            this.u = b8aVar.l;
            this.v = b8aVar.m;
            this.x = b8aVar.p;
            this.y = b8aVar.q;
            this.z = b8aVar.i;
            this.A = b8aVar.j;
            this.B = b8aVar.r;
        }
        x();
        try {
            this.f29206a.incrementAndGet();
            this.i.y(b8aVar, socket);
        } finally {
            this.i.t(b8aVar, this.C, this.h);
            c();
        }
    }

    public void u(b8a b8aVar, Socket socket) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7415063a", new Object[]{this, b8aVar, socket});
            return;
        }
        if (b8aVar != null) {
            this.c = b8aVar.d;
            this.d = b8aVar.e;
            this.e = b8aVar.f;
            this.f = b8aVar.g;
            this.g = b8aVar.h;
            this.s = b8aVar.n;
            this.t = b8aVar.k;
            this.u = b8aVar.l;
            this.v = b8aVar.m;
            this.x = b8aVar.p;
            this.y = b8aVar.q;
            this.z = b8aVar.i;
            this.B = b8aVar.r;
        }
        x();
        try {
            this.f29206a.incrementAndGet();
            this.i.z(b8aVar, socket);
            if (this.F < 0) {
                this.F = this.i.u();
            }
            if (this.G < 0) {
                this.G = this.i.g();
            }
            if (this.H < 0) {
                this.H = this.i.f();
            }
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public void v(String str, long j, String str2) {
        Map<String, cov> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a38da", new Object[]{this, str, new Long(j), str2});
            return;
        }
        synchronized (this.r) {
            try {
                if (!TextUtils.isEmpty(str) && (map = J) != null) {
                    String h = e2n.h(str);
                    if (!TextUtils.isEmpty(h)) {
                        cov covVar = new cov();
                        covVar.c(j);
                        covVar.d(str2);
                        if (((ConcurrentHashMap) map).size() >= 15) {
                            ((ConcurrentHashMap) map).remove((String) ((LinkedList) K).removeLast());
                        }
                        ((ConcurrentHashMap) map).put(h, covVar);
                        ((LinkedList) K).addFirst(h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.C = true;
        ((CopyOnWriteArrayList) this.j).clear();
        if (this.i != null) {
            this.i.A(null);
            this.i.B(null);
            this.i.p();
        }
        this.f29206a.set(0);
    }

    public final synchronized void x() throws IOException {
        s7b s7bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7e01a9", new Object[]{this});
            return;
        }
        if (this.i == null) {
            s7bVar = p();
        } else {
            s7bVar = this.i;
        }
        this.i = s7bVar;
    }
}
