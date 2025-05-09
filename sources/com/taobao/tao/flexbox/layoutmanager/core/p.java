package com.taobao.tao.flexbox.layoutmanager.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.ig8;
import tb.igs;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;
import tb.ut2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static p d;

    /* renamed from: a  reason: collision with root package name */
    public b f12271a;
    public b b;
    public d c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f12272a;
        public d b;
        public int c;

        static {
            t2o.a(503317165);
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1e81fe17", new Object[]{bVar})).intValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("315ab50f", new Object[]{bVar})).intValue();
            }
            int i = bVar.c;
            bVar.c = 1 + i;
            return i;
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("789c318", new Object[]{bVar})).intValue();
            }
            int i = bVar.c;
            bVar.c = i - 1;
            return i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d extends HandlerThread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<Runnable> f12282a = new ArrayList();
        private C0697d b = new C0697d();
        public Handler c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(d dVar, Looper looper) {
                super(looper);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == 72182663) {
                    super.dispatchMessage((Message) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/TNodeEngineThreadPool$TNodeHandlerThread$1");
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                try {
                    super.dispatchMessage(message);
                } catch (Exception e) {
                    tfs.d("TNodeThread exception:" + e.getMessage());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Looper.myQueue().addIdleHandler(d.a(d.this));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f12284a;

            public c(Runnable runnable) {
                this.f12284a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.b(d.this).add(this.f12284a);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.p$d$d  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0697d implements MessageQueue.IdleHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(503317181);
            }

            public C0697d() {
            }

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                for (Runnable runnable : d.b(d.this)) {
                    runnable.run();
                }
                d.b(d.this).clear();
                return true;
            }
        }

        static {
            t2o.a(503317177);
        }

        public d(String str) {
            super(str);
        }

        public static /* synthetic */ C0697d a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0697d) ipChange.ipc$dispatch("517f535e", new Object[]{dVar});
            }
            return dVar.b;
        }

        public static /* synthetic */ List b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("5a25cb43", new Object[]{dVar});
            }
            return dVar.f12282a;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/TNodeEngineThreadPool$TNodeHandlerThread");
        }

        public Handler c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
            }
            return this.c;
        }

        public Handler d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("b03ad6f0", new Object[]{this});
            }
            return new a(this, getLooper());
        }

        public final void e(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18716f10", new Object[]{this, runnable});
            } else if (Looper.myLooper() == getLooper()) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    tfs.d("TNodeThread exception:" + e.getMessage());
                }
            } else {
                this.c.post(runnable);
            }
        }

        public final void f(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25091843", new Object[]{this, runnable});
            } else {
                this.c.post(new c(runnable));
            }
        }

        public final void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a908b93", new Object[]{this});
                return;
            }
            start();
            Handler d = d();
            this.c = d;
            d.post(new b());
        }
    }

    static {
        t2o.a(503317163);
    }

    public static /* synthetic */ Pair a(o.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("76ef3fed", new Object[]{pVar});
        }
        return p(pVar);
    }

    public static /* synthetic */ boolean b(n nVar, List list, o.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db29217", new Object[]{nVar, list, pVar})).booleanValue();
        }
        return n(nVar, list, pVar);
    }

    public static /* synthetic */ void c(n nVar, o.p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ea44ae", new Object[]{nVar, pVar, new Boolean(z)});
        } else {
            o(nVar, pVar, z);
        }
    }

    public static /* synthetic */ void d(n nVar, o.p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb382ec", new Object[]{nVar, pVar, new Boolean(z)});
        } else {
            m(nVar, pVar, z);
        }
    }

    public static synchronized p f() {
        synchronized (p.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p) ipChange.ipc$dispatch("a5b764cc", new Object[0]);
            }
            if (d == null) {
                d = new p();
            }
            return d;
        }
    }

    public static void m(n nVar, o.p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3498ee3", new Object[]{nVar, pVar, new Boolean(z)});
            return;
        }
        igs.a("tnodelayout");
        try {
        } catch (Throwable th) {
            tfs.d("tnode layout:" + th.getMessage());
        }
        if (!pVar.g && nVar.Y() != null) {
            if (!z) {
                if (nVar.D0()) {
                }
                igs.c();
            }
            nVar.K0();
            igs.c();
        }
        float m = nVar.c0().m();
        float f = Float.NaN;
        if (m <= 0.0f) {
            m = Float.NaN;
        }
        float l = nVar.c0().l();
        if (l > 0.0f) {
            f = l;
        }
        if (!pVar.g || nVar.D0()) {
            nVar.M0(m, f);
        }
        igs.c();
    }

    public static void o(n nVar, o.p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e2def7", new Object[]{nVar, pVar, new Boolean(z)});
            return;
        }
        igs.a("tnoderender");
        n L = nVar.L();
        m(L, pVar, z);
        d.j jVar = pVar.k;
        Object obj = pVar.h;
        L.d1(pVar.c.p, new n.f(jVar, obj instanceof Map ? (Map) obj : null));
        o.w wVar = pVar.f;
        if (wVar != null) {
            wVar.b(nVar);
        }
        igs.c();
    }

    public static Pair<n, List<r.d>> p(o.p pVar) {
        List<r.d> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f1c28a82", new Object[]{pVar});
        }
        igs.a("vnodediff");
        r rVar = pVar.d.c;
        rVar.F(pVar.e);
        n nVar = pVar.d;
        if (pVar.i) {
            nVar = nVar.g0();
            rVar = nVar.c;
        } else {
            while (true) {
                r rVar2 = rVar.c;
                if (rVar2 == null || rVar2.q != rVar.q) {
                    break;
                }
                rVar = rVar2;
            }
            if (rVar.f != null && akt.R()) {
                nVar = rVar.f;
            }
        }
        System.nanoTime();
        try {
            list = rVar.E(pVar.j);
        } catch (Exception e) {
            ArrayList arrayList = new ArrayList();
            tfs.e("VNodeDiff", e.getMessage());
            list = arrayList;
        }
        igs.c();
        return new Pair<>(nVar, list);
    }

    public b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fe70ae6f", new Object[]{this});
        }
        if (akt.k1()) {
            j();
            if (!(this.b == null && b.a(this.f12271a) == 0) && (this.b == null || b.a(this.f12271a) > b.a(this.b))) {
                k();
                b.b(this.b);
                return this.b;
            }
            b.b(this.f12271a);
            return this.f12271a;
        }
        j();
        b.b(this.f12271a);
        return this.f12271a;
    }

    public d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("cf130ae9", new Object[]{this});
        }
        j();
        return this.c;
    }

    public c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("19ae241e", new Object[]{this});
        }
        j();
        return this.f12271a.f12272a;
    }

    public d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8644c851", new Object[]{this});
        }
        j();
        return this.f12271a.b;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c82691", new Object[]{this});
        } else if (this.f12271a == null) {
            b bVar = new b();
            this.f12271a = bVar;
            bVar.f12272a = new c("tnode-main-engine-thread");
            this.f12271a.f12272a.g();
            c.h(this.f12271a.f12272a);
            if (akt.Q1()) {
                b bVar2 = this.f12271a;
                bVar2.b = bVar2.f12272a;
            } else {
                this.f12271a.b = new d("tnode-main-js-thread");
                this.f12271a.b.g();
            }
            if (akt.i() || akt.c2()) {
                d dVar = new d("tnode-layout-thread");
                this.c = dVar;
                dVar.g();
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f121a75", new Object[]{this});
        } else if (this.b == null) {
            b bVar = new b();
            this.b = bVar;
            bVar.f12272a = new c("tnode-minor-engine-thread");
            this.b.f12272a.g();
            if (akt.Q1()) {
                b bVar2 = this.b;
                bVar2.b = bVar2.f12272a;
                return;
            }
            this.b.b = new d("tnode-minor-js-thread");
            this.b.b.g();
        }
    }

    public void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19297fe8", new Object[]{this, bVar});
            return;
        }
        b.c(bVar);
        tfs.d("releaseEngineThreadGroup:" + b.a(bVar));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int d = 0;
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 4;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f12277a;

            public b(f fVar) {
                this.f12277a = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((d.a) this.f12277a).a();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.p$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0696c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ o.p f12278a;

            public RunnableC0696c(o.p pVar) {
                this.f12278a = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                o.p pVar = this.f12278a;
                p.c(pVar.d, pVar, true);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Pair f12279a;
            public final /* synthetic */ o.p b;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class a implements f {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("1ad3dde9", new Object[]{this});
                        return;
                    }
                    o.p pVar = d.this.b;
                    o.w wVar = pVar.f;
                    if (wVar != null) {
                        wVar.b(pVar.d);
                    }
                }
            }

            public d(Pair pair, o.p pVar) {
                this.f12279a = pair;
                this.b = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Pair pair = this.f12279a;
                c.i(c.this, (n) this.f12279a.first, this.b, p.b((n) pair.first, (List) pair.second, this.b), new a());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ o.p f12281a;

            public e(o.p pVar) {
                this.f12281a = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f12281a.f.b(null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public interface f {
        }

        static {
            t2o.a(503317166);
        }

        public c(String str) {
            super(str);
        }

        public static /* synthetic */ void h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72d69f34", new Object[]{cVar});
            } else {
                cVar.o();
            }
        }

        public static /* synthetic */ void i(c cVar, n nVar, o.p pVar, boolean z, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b31ffe34", new Object[]{cVar, nVar, pVar, new Boolean(z), fVar});
            } else {
                cVar.p(nVar, pVar, z, fVar);
            }
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/TNodeEngineThreadPool$TNodeEngineThread");
        }

        public static /* synthetic */ void j(c cVar, o.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("621de24d", new Object[]{cVar, pVar});
            } else {
                cVar.q(pVar);
            }
        }

        private n l(n nVar, o.p pVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("ce187616", new Object[]{this, nVar, pVar, new Boolean(z)});
            }
            if (!(pVar == null || nVar == null)) {
                Rect n = n(pVar.d.c);
                if (n.width() > 0 && n.height() > 0) {
                    n L = nVar.L();
                    p.d(L, pVar, z);
                    return L;
                }
            }
            return null;
        }

        private Rect n(r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("aaddc06", new Object[]{this, rVar});
            }
            o.y c0 = rVar.y().c0();
            return new Rect(0, 0, c0.m(), c0.l());
        }

        private void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58bda0cc", new Object[]{this});
            } else {
                this.c.sendEmptyMessage(0);
            }
        }

        private void p(n nVar, o.p pVar, boolean z, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a273c24", new Object[]{this, nVar, pVar, new Boolean(z), fVar});
                return;
            }
            if (akt.D()) {
                l(nVar, pVar, z);
            }
            if (fVar != null) {
                nwv.z0(new b(fVar), true);
            }
        }

        private void q(o.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9dc31b3", new Object[]{this, pVar});
                return;
            }
            try {
                Pair a2 = p.a(pVar);
                d dVar = new d(a2, pVar);
                if (akt.j((n) a2.first)) {
                    synchronized (pVar.c) {
                        dVar.run();
                    }
                } else {
                    nwv.z0(dVar, true);
                }
            } catch (Exception unused) {
                if (pVar.f != null) {
                    nwv.z0(new e(pVar), true);
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.p.d
        public Handler d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("b03ad6f0", new Object[]{this});
            }
            return new a(getLooper());
        }

        public void m(o.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f6e189c", new Object[]{this, pVar});
                return;
            }
            n nVar = pVar.d;
            nVar.D();
            nVar.c0().s(pVar.f12265a, pVar.b);
            Message.obtain(this.c, 4, new o.p(pVar.k, "forceRefreshLayout", System.currentTimeMillis(), pVar.c, nVar.c0().d, nVar, nVar.t0(), pVar.f, pVar.h, true)).sendToTarget();
        }

        public void r(o.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31428a22", new Object[]{this, pVar});
            } else if (pVar != null && pVar.d != null) {
                Message.obtain(this.c, 2, pVar).sendToTarget();
            }
        }

        public void s(o.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e64cbf9", new Object[]{this, pVar});
                return;
            }
            IDeviceInfo i = od0.D().i();
            int[] e2 = ig8.e(pVar.c.T());
            int m = pVar.d.c0().m();
            if (!i.l() || m == e2[0]) {
                nwv.z0(new RunnableC0696c(pVar), true);
                return;
            }
            pVar.c.F1();
            d.j jVar = pVar.k;
            long currentTimeMillis = System.currentTimeMillis();
            o oVar = pVar.c;
            String str = pVar.d.c0().d;
            n nVar = pVar.d;
            Message.obtain(this.c, 4, new o.p(jVar, "forceRefreshLayout", currentTimeMillis, oVar, str, nVar, nVar.t0(), pVar.f, pVar.h, true)).sendToTarget();
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.p$c$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RunnableC0694a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Pair f12274a;
                public final /* synthetic */ o.p b;
                public final /* synthetic */ boolean c;

                public RunnableC0694a(Pair pair, o.p pVar, boolean z) {
                    this.f12274a = pair;
                    this.b = pVar;
                    this.c = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Pair pair = this.f12274a;
                    boolean b = p.b((n) pair.first, (List) pair.second, this.b);
                    if (!this.c) {
                        p.c((n) this.f12274a.first, this.b, b);
                    } else {
                        c.i(c.this, (n) this.f12274a.first, this.b, b, null);
                    }
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ o.p f12275a;
                public final /* synthetic */ Runnable b;

                public b(o.p pVar, Runnable runnable) {
                    this.f12275a = pVar;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (this.f12275a.c) {
                        this.b.run();
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.p$c$a$c  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RunnableC0695c implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Pair f12276a;
                public final /* synthetic */ o.p b;

                public RunnableC0695c(Pair pair, o.p pVar) {
                    this.f12276a = pair;
                    this.b = pVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Pair pair = this.f12276a;
                    p.b((n) pair.first, (List) pair.second, this.b);
                    o.p pVar = this.b;
                    p.c(pVar.d, pVar, true);
                }
            }

            public a(Looper looper) {
                super(looper);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == 72182663) {
                    super.dispatchMessage((Message) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/TNodeEngineThreadPool$TNodeEngineThread$1");
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                try {
                    super.dispatchMessage(message);
                } catch (Exception e) {
                    tfs.d("TNodeThread exception:" + e.getMessage());
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                boolean z = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                int i = message.what;
                if (i == 0) {
                    ut2.u();
                } else if (i == 1) {
                    o.p pVar = (o.p) message.obj;
                    Pair a2 = p.a(pVar);
                    if (!"onready".equals(pVar.j) || pVar.d.w0() != null) {
                        z = false;
                    }
                    boolean j = akt.j((n) a2.first);
                    if (!z || ((n) a2.first).S() != null || !j) {
                        Runnable aVar = new RunnableC0694a(a2, pVar, z);
                        if (j) {
                            aVar = new b(pVar, aVar);
                        }
                        nwv.y0(aVar);
                        return;
                    }
                    synchronized (pVar.c) {
                        c.i(c.this, (n) a2.first, pVar, p.b((n) a2.first, (List) a2.second, pVar), null);
                    }
                } else if (i == 2) {
                    c.j(c.this, (o.p) message.obj);
                } else if (i == 4) {
                    o.p pVar2 = (o.p) message.obj;
                    nwv.z0(new RunnableC0695c(p.a(pVar2), pVar2), true);
                }
            }
        }

        public void k(o.p pVar) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b9d5e5d", new Object[]{this, pVar});
                return;
            }
            if ("onready".equals(pVar.j) && pVar.d.w0() == null) {
                z = true;
            }
            if (!pVar.g || !nwv.X() || pVar.d.r0().equals("poplayer")) {
                Message obtain = Message.obtain(this.c, 1, pVar);
                if (Looper.myLooper() == getLooper()) {
                    this.c.handleMessage(obtain);
                    obtain.recycle();
                    return;
                }
                obtain.sendToTarget();
                return;
            }
            Pair a2 = p.a(pVar);
            boolean b2 = p.b((n) a2.first, (List) a2.second, pVar);
            if (!z) {
                p.c((n) a2.first, pVar, b2);
            }
        }
    }

    public static boolean n(n nVar, List<r.d> list, o.p pVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36e8fe36", new Object[]{nVar, list, pVar})).booleanValue();
        }
        System.nanoTime();
        igs.a("tnodepatch");
        boolean z2 = pVar.i;
        if (nVar == null || nVar.b == null) {
            z2 = true;
        }
        ArrayList arrayList = new ArrayList();
        if (pVar.g) {
            for (r.d dVar : list) {
                n nVar2 = dVar.f12290a.f;
                if (nVar2 == null) {
                    nVar2 = null;
                }
                if (nVar2 != null) {
                    nVar2.t1(pVar.j);
                    h.a(nVar2, dVar.b, false, z2);
                    nVar2.t1(null);
                    arrayList.add(nVar2);
                }
            }
        } else {
            for (r.d dVar2 : list) {
                n nVar3 = dVar2.f12290a.f;
                if (nVar3 == null) {
                    nVar3 = null;
                }
                if (nVar3 != null) {
                    nVar3.t1(pVar.j);
                    z |= h.a(nVar3, dVar2.b, true, z2);
                    nVar3.t1(null);
                    arrayList.add(nVar3);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar4 = (n) it.next();
            if (nVar4.K() != null) {
                nVar4.K().onPatchCompleted();
            }
        }
        igs.c();
        return z;
    }
}
