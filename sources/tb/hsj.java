package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.gsj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hsj extends gsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gsj.a f20865a;
    public final ConcurrentLinkedQueue<ow> b;
    public final ConcurrentHashMap<ow, nw> c;
    public final AtomicInteger d;
    public tzu e;
    public final CopyOnWriteArrayList<gsj.b> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements msj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ow f20866a;
        public final /* synthetic */ boolean b;

        public a(ow owVar, boolean z) {
            this.f20866a = owVar;
            this.b = z;
        }

        @Override // tb.msj
        public void a(lsj lsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fb14a75", new Object[]{this, lsjVar});
                return;
            }
            hsj.d(hsj.this).remove(this.f20866a);
            if (lsjVar.a()) {
                if (this.b) {
                    hsj.e(hsj.this, this.f20866a, null, null);
                } else {
                    hsj.f(hsj.this, this.f20866a, null, null);
                }
            } else if (this.f20866a.i(lsjVar.f23544a)) {
                if (this.b) {
                    hsj.g(hsj.this, this.f20866a, lsjVar.f23544a, lsjVar.c, true);
                } else {
                    hsj.h(hsj.this, this.f20866a, lsjVar.f23544a, lsjVar.c, false);
                }
            } else if (this.f20866a.j(lsjVar.f23544a)) {
                if (this.b) {
                    hsj.e(hsj.this, this.f20866a, lsjVar.f23544a, lsjVar.b);
                } else {
                    hsj.f(hsj.this, this.f20866a, lsjVar.f23544a, lsjVar.b);
                }
            } else if (this.b) {
                hsj.i(hsj.this, this.f20866a, lsjVar.f23544a, lsjVar.b);
            } else {
                hsj.j(hsj.this, this.f20866a, lsjVar.f23544a, lsjVar.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements tzu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.tzu
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // tb.tzu
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // tb.tzu
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // tb.tzu
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // tb.tzu
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // tb.tzu
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // tb.tzu
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        @Override // tb.tzu
        public void onSwitchBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74060788", new Object[]{this});
            } else if (hsj.k(hsj.this).size() != 0 || hsj.d(hsj.this).size() != 0) {
                Iterator it = hsj.l(hsj.this).iterator();
                while (it.hasNext()) {
                    ((gsj.b) it.next()).b(new HashSet(hsj.k(hsj.this)), hsj.d(hsj.this).keySet());
                }
            }
        }

        @Override // tb.tzu
        public void onSwitchForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ow f20868a;

        public c(ow owVar) {
            this.f20868a = owVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20868a.b().b("ERROR_BE_ABANDONED", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ow f20869a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ boolean d;

        public d(ow owVar, String str, Object obj, boolean z) {
            this.f20869a = owVar;
            this.b = str;
            this.c = obj;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20869a.b().c(this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ow f20870a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public e(ow owVar, String str, String str2) {
            this.f20870a = owVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20870a.b().a(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ow f20871a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public f(ow owVar, String str, String str2) {
            this.f20871a = owVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20871a.b().b(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final hsj f20872a = new hsj(null);

        static {
            t2o.a(1018167326);
        }

        public static /* synthetic */ hsj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hsj) ipChange.ipc$dispatch("f3bdcb9e", new Object[0]);
            }
            return f20872a;
        }
    }

    static {
        t2o.a(1018167319);
    }

    public /* synthetic */ hsj(a aVar) {
        this();
    }

    public static /* synthetic */ ConcurrentHashMap d(hsj hsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("f9a5b415", new Object[]{hsjVar});
        }
        return hsjVar.c;
    }

    public static /* synthetic */ void e(hsj hsjVar, ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b8bb92", new Object[]{hsjVar, owVar, str, str2});
        } else {
            hsjVar.z(owVar, str, str2);
        }
    }

    public static /* synthetic */ void f(hsj hsjVar, ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb49adb1", new Object[]{hsjVar, owVar, str, str2});
        } else {
            hsjVar.B(owVar, str, str2);
        }
    }

    public static /* synthetic */ void g(hsj hsjVar, ow owVar, String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d40932", new Object[]{hsjVar, owVar, str, obj, new Boolean(z)});
        } else {
            hsjVar.y(owVar, str, obj, z);
        }
    }

    public static /* synthetic */ void h(hsj hsjVar, ow owVar, String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae615af3", new Object[]{hsjVar, owVar, str, obj, new Boolean(z)});
        } else {
            hsjVar.A(owVar, str, obj, z);
        }
    }

    public static /* synthetic */ void i(hsj hsjVar, ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fc840e", new Object[]{hsjVar, owVar, str, str2});
        } else {
            hsjVar.x(owVar, str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(hsj hsjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/net/core/NetRequestManagerImpl");
    }

    public static /* synthetic */ void j(hsj hsjVar, ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8d762d", new Object[]{hsjVar, owVar, str, str2});
        } else {
            hsjVar.u(owVar, str, str2);
        }
    }

    public static /* synthetic */ ConcurrentLinkedQueue k(hsj hsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentLinkedQueue) ipChange.ipc$dispatch("dfb6a0d2", new Object[]{hsjVar});
        }
        return hsjVar.b;
    }

    public static /* synthetic */ CopyOnWriteArrayList l(hsj hsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("ecbabf96", new Object[]{hsjVar});
        }
        return hsjVar.f;
    }

    public static hsj s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hsj) ipChange.ipc$dispatch("a640f414", new Object[0]);
        }
        return g.a();
    }

    public final void A(ow owVar, String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c50435", new Object[]{this, owVar, str, obj, new Boolean(z)});
            return;
        }
        n(owVar, str, obj, z);
        v();
        w();
    }

    public final void B(ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc46a803", new Object[]{this, owVar, str, str2});
        } else if (t(owVar)) {
            if (!this.b.contains(owVar)) {
                q();
                this.b.add(owVar);
            }
            p(owVar, str, str2);
        } else {
            m(owVar, str, str2);
        }
    }

    public void C(gsj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62452fc5", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.f.add(bVar);
            if (this.e == null) {
                b bVar2 = new b();
                this.e = bVar2;
                wzu.registerAppStatusCallbacks(bVar2);
            }
        }
    }

    public boolean D(ow owVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2dee3c7", new Object[]{this, owVar})).booleanValue();
        }
        if (owVar == null || !this.b.contains(owVar) || !this.b.remove(owVar)) {
            return false;
        }
        r(owVar, false);
        return true;
    }

    @Override // tb.gsj
    public wrj c(ow owVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wrj) ipChange.ipc$dispatch("2f57488d", new Object[]{this, owVar});
        }
        if (owVar == null) {
            return null;
        }
        if (!owVar.h()) {
            owVar.l(Looper.myLooper());
        }
        return r(owVar, false);
    }

    public final void m(ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d9d017", new Object[]{this, owVar, str, str2});
        } else if (owVar.b() != null) {
            o(owVar, new f(owVar, str, str2));
        }
    }

    public final void n(ow owVar, String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3502b9b", new Object[]{this, owVar, str, obj, new Boolean(z)});
        } else if (owVar.b() != null) {
            o(owVar, new d(owVar, str, obj, z));
        }
    }

    public final void o(ow owVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2b51d", new Object[]{this, owVar, runnable});
            return;
        }
        Handler c2 = owVar.c();
        if (c2 != null) {
            c2.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void p(ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb7479f", new Object[]{this, owVar, str, str2});
        } else if (owVar.b() != null) {
            o(owVar, new e(owVar, str, str2));
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50413ca", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int size = this.b.size();
            this.f20865a.getClass();
            if (size < 500) {
                break;
            }
            ow poll = this.b.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ow owVar = (ow) it.next();
            o(owVar, new c(owVar));
        }
    }

    public final wrj r(ow owVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wrj) ipChange.ipc$dispatch("c7045668", new Object[]{this, owVar, new Boolean(z)});
        }
        nw a2 = csj.a(owVar);
        if (a2 == null || owVar == null || owVar.f() == null) {
            return null;
        }
        if (z) {
            owVar.f().f22891a.incrementAndGet();
            this.d.incrementAndGet();
        }
        this.c.put(owVar, a2);
        a2.a(owVar, new a(owVar, z));
        return new xrj(owVar);
    }

    public final boolean t(ow owVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("223c106b", new Object[]{this, owVar})).booleanValue();
        }
        if (owVar.e().f22185a <= 0 || owVar.f().f22891a.get() >= owVar.e().f22185a) {
            return false;
        }
        return true;
    }

    public final void u(ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb73afd", new Object[]{this, owVar, str, str2});
        } else {
            m(owVar, str, str2);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641a3d34", new Object[]{this});
            return;
        }
        Iterator<gsj.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e82e20", new Object[]{this});
            return;
        }
        this.f20865a.getClass();
        int i = 5 - this.d.get();
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                ow poll = this.b.poll();
                if (poll != null) {
                    arrayList.add(poll);
                }
                i = i2;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r((ow) it.next(), true);
            }
        }
    }

    public final void x(ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1508827", new Object[]{this, owVar, str, str2});
            return;
        }
        this.d.decrementAndGet();
        m(owVar, str, str2);
    }

    public final void y(ow owVar, String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5e515f", new Object[]{this, owVar, str, obj, new Boolean(z)});
            return;
        }
        this.d.decrementAndGet();
        n(owVar, str, obj, z);
    }

    public final void z(ow owVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57215299", new Object[]{this, owVar, str, str2});
            return;
        }
        this.d.decrementAndGet();
        if (t(owVar)) {
            if (!this.b.contains(owVar)) {
                q();
                this.b.add(owVar);
            }
            p(owVar, str, str2);
            return;
        }
        m(owVar, str, str2);
    }

    public hsj() {
        this.f20865a = new gsj.a();
        this.b = new ConcurrentLinkedQueue<>();
        this.c = new ConcurrentHashMap<>();
        this.d = new AtomicInteger(0);
        this.f = new CopyOnWriteArrayList<>();
    }
}
