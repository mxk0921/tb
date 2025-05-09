package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.video_remoteso.VideoRemoteSo;
import com.taobao.video_remoteso.api.FetchCallback;
import com.taobao.video_remoteso.api.FetchResult;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Future<fq> o;

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedList<eq> f19461a = new LinkedList<>();
    public static final LinkedList<eq> b = new LinkedList<>();
    public static volatile AtomicBoolean c = new AtomicBoolean(false);
    public static volatile AtomicReference<String> d = new AtomicReference<>("");
    public static volatile AtomicReference<String> e = new AtomicReference<>("");
    public static volatile AtomicReference<String> f = new AtomicReference<>("");
    public static volatile AtomicBoolean g = new AtomicBoolean(false);
    public static volatile AtomicReference<String> h = new AtomicReference<>("");
    public static volatile AtomicBoolean i = new AtomicBoolean(false);
    public static volatile AtomicReference<String> j = new AtomicReference<>("");
    public static volatile AtomicBoolean k = new AtomicBoolean(false);
    public static volatile AtomicReference<String> l = new AtomicReference<>("");
    public static volatile AtomicBoolean m = new AtomicBoolean(false);
    public static final Object n = new Object();
    public static final feh p = new feh("AVSDKFetchHelper", "Global");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements FetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(fq fqVar) {
        }

        @Override // com.taobao.video_remoteso.api.FetchCallback
        public void onFetchFinished(FetchResult fetchResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                return;
            }
            feh a2 = fq.a();
            AVSDKLog.e(a2, this + " fetchSo onFetchFinished " + fetchResult);
            if (!TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                feh a3 = fq.a();
                AVSDKLog.e(a3, this + " fetchSo set " + fetchResult.getLibFullPath());
                fq.b().set(true);
                fq.f().set(fetchResult.getLibFullPath());
                fq.g(fetchResult);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements FetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(fq fqVar) {
        }

        @Override // com.taobao.video_remoteso.api.FetchCallback
        public void onFetchFinished(FetchResult fetchResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                return;
            }
            feh a2 = fq.a();
            AVSDKLog.e(a2, this + " fetchSo onFetchFinished " + fetchResult);
            if (!TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                feh a3 = fq.a();
                AVSDKLog.e(a3, this + " fetchSo set " + fetchResult.getLibFullPath());
                fq.h().set(true);
                fq.i().set(fetchResult.getLibFullPath());
                fq.j().set(fetchResult.getMajorVersion());
                fq.k().set(fetchResult.getMinorVersion());
                fq.g(fetchResult);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements FetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(fq fqVar) {
        }

        @Override // com.taobao.video_remoteso.api.FetchCallback
        public void onFetchFinished(FetchResult fetchResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                return;
            }
            feh a2 = fq.a();
            AVSDKLog.e(a2, " fetchSo onFetchFinished " + fetchResult);
            feh a3 = fq.a();
            AVSDKLog.e(a3, this + " fetchSo set " + fetchResult.getLibFullPath());
            fq.l().set(true);
            fq.m().set(fetchResult.getLibFullPath());
            fq.g(fetchResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements FetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(fq fqVar) {
        }

        @Override // com.taobao.video_remoteso.api.FetchCallback
        public void onFetchFinished(FetchResult fetchResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                return;
            }
            feh a2 = fq.a();
            AVSDKLog.e(a2, this + " fetchSo onFetchFinished " + fetchResult);
            if (!TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                feh a3 = fq.a();
                AVSDKLog.e(a3, this + " fetchSo set " + fetchResult.getLibFullPath());
                fq.c().set(true);
                fq.d().set(fetchResult.getLibFullPath());
                fq.g(fetchResult);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements Callable<fq> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public fq call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fq) ipChange.ipc$dispatch("7646f01f", new Object[]{this});
            }
            fq fqVar = new fq();
            fq.e(fqVar);
            return fqVar;
        }
    }

    static {
        t2o.a(774897939);
    }

    public fq() {
        AVSDKLog.e(p, this + " create AVSDKFetchHelper");
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[0])).booleanValue();
        }
        try {
            if (!v().isDone()) {
                return false;
            }
            v().get();
            return c.get();
        } catch (InterruptedException e2) {
            feh fehVar = p;
            AVSDKLog.e(fehVar, " InterruptedException " + e2);
            return false;
        } catch (ExecutionException e3) {
            feh fehVar2 = p;
            AVSDKLog.e(fehVar2, " ExecutionException " + e3);
            return false;
        }
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("123c489", new Object[0])).booleanValue();
        }
        try {
            if (!v().isDone()) {
                return false;
            }
            v().get();
            return i.get();
        } catch (InterruptedException e2) {
            feh fehVar = p;
            AVSDKLog.e(fehVar, " InterruptedException " + e2);
            return false;
        } catch (ExecutionException e3) {
            feh fehVar2 = p;
            AVSDKLog.e(fehVar2, " ExecutionException " + e3);
            return false;
        }
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a73289", new Object[0])).booleanValue();
        }
        return m.get();
    }

    public static void E(FetchResult fetchResult) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09396a1", new Object[]{fetchResult});
            return;
        }
        AtomicBoolean atomicBoolean = c;
        if (g.get() && k.get()) {
            z = true;
        }
        atomicBoolean.set(z);
        gq p2 = p();
        if (p2.f20161a && !TextUtils.isEmpty(p2.b)) {
            Iterator<eq> it = n().iterator();
            while (it.hasNext()) {
                it.next().onFetchFinished(p2);
            }
        }
        Iterator<eq> it2 = o().iterator();
        while (it2.hasNext()) {
            it2.next().onFetchFinished(p2);
        }
    }

    public static synchronized void F(eq eqVar) {
        synchronized (fq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19e5401a", new Object[]{eqVar});
                return;
            }
            if (eqVar != null) {
                feh fehVar = p;
                AVSDKLog.e(fehVar, "fetchSo registerFetchCallback " + eqVar);
                try {
                    if (v().isDone()) {
                        v().get();
                        if (c.get()) {
                            v().get().D();
                        }
                    }
                    synchronized (n) {
                        f19461a.add(eqVar);
                    }
                } catch (InterruptedException e2) {
                    feh fehVar2 = p;
                    AVSDKLog.e(fehVar2, " InterruptedException " + e2);
                } catch (ExecutionException e3) {
                    feh fehVar3 = p;
                    AVSDKLog.e(fehVar3, " ExecutionException " + e3);
                }
            }
        }
    }

    public static synchronized void G(eq eqVar) {
        synchronized (fq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f6ce0e3", new Object[]{eqVar});
                return;
            }
            if (eqVar != null) {
                feh fehVar = p;
                AVSDKLog.e(fehVar, "fetchSo registerFetchCallbackAll " + eqVar);
                try {
                    if (v().isDone()) {
                        v().get();
                        if (c.get()) {
                            v().get().D();
                        }
                    }
                    synchronized (n) {
                        b.add(eqVar);
                    }
                } catch (InterruptedException e2) {
                    feh fehVar2 = p;
                    AVSDKLog.e(fehVar2, " InterruptedException " + e2);
                } catch (ExecutionException e3) {
                    feh fehVar3 = p;
                    AVSDKLog.e(fehVar3, " ExecutionException " + e3);
                }
            }
        }
    }

    public static void H(eq eqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3a8fe1", new Object[]{eqVar});
        } else if (eqVar != null) {
            feh fehVar = p;
            AVSDKLog.e(fehVar, "fetchSo unregisterFetchCallback " + eqVar);
            synchronized (n) {
                f19461a.remove(eqVar);
            }
        }
    }

    public static void I(eq eqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33ba7bc", new Object[]{eqVar});
        } else if (eqVar != null) {
            feh fehVar = p;
            AVSDKLog.e(fehVar, "fetchSo unregisterFetchCallbackAll " + eqVar);
            synchronized (n) {
                b.remove(eqVar);
            }
        }
    }

    public static /* synthetic */ feh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("2773b1b2", new Object[0]);
        }
        return p;
    }

    public static /* synthetic */ AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba88d1f8", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("559f3a66", new Object[0]);
        }
        return m;
    }

    public static /* synthetic */ AtomicReference d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("2561e0a4", new Object[0]);
        }
        return l;
    }

    public static /* synthetic */ void e(fq fqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddcd8136", new Object[]{fqVar});
        } else {
            fqVar.q();
        }
    }

    public static /* synthetic */ AtomicReference f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("f643dbb6", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ void g(FetchResult fetchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f94815b", new Object[]{fetchResult});
        } else {
            E(fetchResult);
        }
    }

    public static /* synthetic */ AtomicBoolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b9259ffb", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ AtomicReference i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("c0e534f9", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ AtomicReference j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("47052ba", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ AtomicReference k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("47fb707b", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ AtomicBoolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b74c07ff", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ AtomicReference m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("cf11abfd", new Object[0]);
        }
        return h;
    }

    public static LinkedList<eq> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("5f585f9f", new Object[0]);
        }
        LinkedList<eq> linkedList = new LinkedList<>();
        synchronized (n) {
            linkedList.addAll(f19461a);
        }
        return linkedList;
    }

    public static LinkedList<eq> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("bad4ff0e", new Object[0]);
        }
        LinkedList<eq> linkedList = new LinkedList<>();
        synchronized (n) {
            linkedList.addAll(b);
        }
        return linkedList;
    }

    public static gq p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gq) ipChange.ipc$dispatch("79fe1a80", new Object[0]);
        }
        gq gqVar = new gq();
        gqVar.f20161a = g.get();
        i.get();
        k.get();
        m.get();
        gqVar.b = d.get();
        h.get();
        gqVar.e = j.get();
        l.get();
        gqVar.c = e.get();
        gqVar.d = f.get();
        return gqVar;
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95a2cdc8", new Object[0]);
        }
        return e.get();
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ac7edc4", new Object[0]);
        }
        return f.get();
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9315cc42", new Object[0]);
        }
        return d.get();
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2009ebd", new Object[0]);
        }
        return j.get();
    }

    public static Future<fq> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("443009a8", new Object[0]);
        }
        if (o == null) {
            synchronized (fq.class) {
                try {
                    if (o == null) {
                        o = dq.b().submit(new e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public static String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a315623", new Object[0]);
        }
        return h.get();
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9273f8fb", new Object[0]);
        }
        return l.get();
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("451e58a8", new Object[0])).booleanValue();
        }
        try {
            if (v().isDone()) {
                v().get();
                return g.get();
            }
            AVSDKLog.e(p, " getInstance().isDone() is false");
            return false;
        } catch (InterruptedException e2) {
            feh fehVar = p;
            AVSDKLog.e(fehVar, " InterruptedException " + e2);
            return false;
        } catch (ExecutionException e3) {
            feh fehVar2 = p;
            AVSDKLog.e(fehVar2, " ExecutionException " + e3);
            return false;
        }
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12bf8e43", new Object[0])).booleanValue();
        }
        try {
            if (!v().isDone()) {
                return false;
            }
            v().get();
            return k.get();
        } catch (InterruptedException e2) {
            feh fehVar = p;
            AVSDKLog.e(fehVar, " InterruptedException " + e2);
            return false;
        } catch (ExecutionException e3) {
            feh fehVar2 = p;
            AVSDKLog.e(fehVar2, " ExecutionException " + e3);
            return false;
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739a9bb4", new Object[]{this});
            return;
        }
        gq p2 = p();
        Iterator<eq> it = n().iterator();
        while (it.hasNext()) {
            it.next().onFetchFinished(p2);
        }
        Iterator<eq> it2 = o().iterator();
        while (it2.hasNext()) {
            it2.next().onFetchFinished(p2);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208b843d", new Object[]{this});
            return;
        }
        feh fehVar = p;
        AVSDKLog.e(fehVar, this + " fetchSo init");
        VideoRemoteSo.fetchAsync("avcodec", new a(this));
        VideoRemoteSo.fetchAsync("artc_engine", new b(this));
        VideoRemoteSo.fetchAsync("s266dec", new c(this));
        VideoRemoteSo.fetchAsync("VPM", new d(this));
    }
}
