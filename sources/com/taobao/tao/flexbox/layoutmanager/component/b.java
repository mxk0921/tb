package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.akt;
import tb.igs;
import tb.nwv;
import tb.rbi;
import tb.s6o;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TNodeLayout";

    /* renamed from: a  reason: collision with root package name */
    public final n f12140a;
    public c b;
    public AbstractC0685b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f12141a;
        private n b;
        private int c;
        private boolean d;

        static {
            t2o.a(503316733);
        }

        public a(b bVar, n nVar, int i, boolean z) {
            this.f12141a = bVar;
            this.b = nVar;
            this.c = i;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.b.P().q0()) {
                igs.a("LayoutChildTask " + this.c);
                if (this.c < ((ArrayList) this.b.d).size()) {
                    b.l(this.f12141a, (n) ((ArrayList) this.b.d).get(this.c));
                }
                if (!this.d) {
                    if (this.c + 1 < ((ArrayList) this.b.d).size()) {
                        b.l(this.f12141a, (n) ((ArrayList) this.b.d).get(this.c + 1));
                    }
                    if (this.c + 2 < ((ArrayList) this.b.d).size()) {
                        b bVar = this.f12141a;
                        b.a(bVar, new a(bVar, this.b, this.c + 2, this.d));
                    } else if (b.b(this.f12141a) != null) {
                        b.b(this.f12141a).a();
                    }
                } else if (this.c + 1 < ((ArrayList) this.b.d).size()) {
                    b bVar2 = this.f12141a;
                    b.a(bVar2, new a(bVar2, this.b, this.c + 1, this.d));
                } else if (b.b(this.f12141a) != null) {
                    b.b(this.f12141a).a();
                }
                igs.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0685b {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f12142a;

        static {
            t2o.a(503316735);
        }

        public c(Runnable runnable) {
            this.f12142a = runnable;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            this.f12142a.run();
            return false;
        }
    }

    static {
        t2o.a(503316732);
    }

    public b(n nVar) {
        this.f12140a = nVar;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b2e232", new Object[]{bVar, runnable});
        } else {
            bVar.o(runnable);
        }
    }

    public static /* synthetic */ AbstractC0685b b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC0685b) ipChange.ipc$dispatch("964fc11c", new Object[]{bVar});
        }
        return bVar.c;
    }

    public static boolean e(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9077bdb", new Object[]{nVar})).booleanValue();
        }
        return false;
    }

    public static n f(n nVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("f52e96ae", new Object[]{nVar, new Boolean(z), new Boolean(z2)});
        }
        if (nVar == null) {
            return null;
        }
        if (nVar.u0().u().equals(WXBasicComponentType.CELL)) {
            if (!z2 || nVar.w == 2) {
                r(nVar);
                if (!((ArrayList) nVar.d).isEmpty()) {
                    return (n) ((ArrayList) nVar.d).get(0);
                }
                if (z) {
                    return null;
                }
                return nVar;
            } else if (z) {
                return null;
            } else {
                return nVar;
            }
        } else if (!nVar.r0().equals("header")) {
            return nVar;
        } else {
            if (!((ArrayList) nVar.d).isEmpty()) {
                return (n) ((ArrayList) nVar.d).get(0);
            }
            return null;
        }
    }

    public static float g(n nVar, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3bf500b", new Object[]{nVar, nVar2})).floatValue();
        }
        int p = q.p(nVar);
        if (p > 0) {
            return p;
        }
        return Float.NaN;
    }

    public static float h(ListViewComponent listViewComponent, n nVar, n nVar2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0b4a9c0", new Object[]{listViewComponent, nVar, nVar2})).floatValue();
        }
        int r = q.r(nVar);
        if (r > 0) {
            f = r;
        } else {
            f = Float.NaN;
        }
        if (!YogaConstants.isUndefined(f)) {
            return f;
        }
        float r2 = nwv.r(nVar.H("flex"), 0);
        float r3 = nwv.r(nVar2.H("flex"), 0);
        if (r2 == 1.0f || r3 == 1.0f) {
            return listViewComponent.K1() - q.q(nVar2, false);
        }
        return f;
    }

    public static float i(n nVar, ListViewComponent listViewComponent) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66304e5", new Object[]{nVar, listViewComponent})).floatValue();
        }
        int r = q.r(nVar);
        if (r < 0 || r >= listViewComponent.J1()) {
            f = Float.NaN;
        } else {
            f = listViewComponent.J1();
        }
        if (listViewComponent.getViewParams().w0 == 1 && YogaConstants.isUndefined(f) && listViewComponent.getViewParams().v == YogaFlexDirection.COLUMN) {
            f = listViewComponent.K1() - q.q(nVar, false);
        }
        if (!YogaConstants.isUndefined(f)) {
            return f;
        }
        if (nVar.Y().r0().equals("header")) {
            return h(listViewComponent, nVar.Y(), nVar);
        }
        if (nwv.r(nVar.H("flex"), 0) == 1.0f) {
            return listViewComponent.K1() - q.q(nVar, false);
        }
        return f;
    }

    public static b j(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d78ae094", new Object[]{nVar});
        }
        b bVar = (b) nVar.m0(100);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(nVar);
        nVar.w1(100, bVar2);
        return bVar2;
    }

    public static boolean l(b bVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4d87daa", new Object[]{bVar, nVar})).booleanValue();
        }
        if (nVar.w == 2) {
            return false;
        }
        synchronized (nVar) {
            if (nVar.w == 2) {
                return false;
            }
            tfs.g(TAG, "cell做layout, thread:" + Thread.currentThread().getName());
            nVar.w = 1;
            m(bVar, f(nVar, true, false));
            nVar.w = 2;
            return true;
        }
    }

    public static rbi m(b bVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("1b4c665d", new Object[]{bVar, nVar});
        }
        if (nVar == null) {
            return null;
        }
        if (nVar.D0()) {
            nVar.N0(i(nVar, (ListViewComponent) bVar.f12140a.K()), Float.NaN);
        }
        return nVar.S();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0cae2b", new Object[]{this});
        }
    }

    public void d(n nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78402948", new Object[]{this, nVar, new Integer(i)});
        }
    }

    public final n k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("fd13ed9a", new Object[]{this, nVar});
        }
        if (((ArrayList) nVar.d).isEmpty()) {
            return null;
        }
        return (n) ((ArrayList) nVar.d).get(0);
    }

    public final rbi n(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("e225e6d1", new Object[]{this, nVar});
        }
        if (nVar == null || nVar.i0(0) == null || !nVar.i0(0).D0()) {
            return null;
        }
        n i0 = nVar.i0(0);
        i0.M0(h((ListViewComponent) this.f12140a.K(), nVar, i0), g(nVar, i0));
        return i0.S();
    }

    public final void o(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c3e5ca", new Object[]{this, runnable});
            return;
        }
        if (this.b != null) {
            Looper.myQueue().removeIdleHandler(this.b);
            this.b = null;
        }
        c cVar = new c(runnable);
        Looper.myQueue().addIdleHandler(cVar);
        this.b = cVar;
    }

    public void p(n nVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14af67a4", new Object[]{this, nVar, new Integer(i), new Boolean(z)});
        }
    }

    public void q(n nVar, n nVar2, AbstractC0685b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        rbi rbiVar;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8adee7", new Object[]{this, nVar, nVar2, bVar});
            return;
        }
        igs.a("ListOnLayout");
        this.c = bVar;
        if (this.f12140a.K().getViewParams().v == YogaFlexDirection.COLUMN) {
            z = true;
        } else {
            z = false;
        }
        rbi n = n(nVar);
        if (n == null) {
            i = 0;
        } else if (z) {
            i = n.b;
        } else {
            i = n.f27261a;
        }
        if (akt.r2() == 0 || akt.r()) {
            if (nVar2 == null || ((ArrayList) nVar2.d).isEmpty()) {
                i2 = 0;
                z2 = false;
            } else {
                Context N = this.f12140a.N();
                if (z) {
                    i3 = s6o.n(N);
                } else {
                    i3 = s6o.B(N);
                }
                i2 = 0;
                z2 = false;
                while (i2 < ((ArrayList) nVar2.d).size()) {
                    n nVar3 = (n) ((ArrayList) nVar2.d).get(i2);
                    boolean l = l(this, nVar3);
                    n k = k(nVar3);
                    if (k != null) {
                        rbiVar = k.S();
                    } else {
                        rbiVar = null;
                    }
                    if (rbiVar == null) {
                        i4 = 0;
                    } else if (z) {
                        i4 = rbiVar.b;
                    } else {
                        i4 = rbiVar.f27261a;
                    }
                    if (l) {
                        i += i4;
                        if (i >= i3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    i2++;
                }
            }
            if (z2) {
                o(new a(this, nVar2, i2 + 1, false));
            }
        }
        igs.c();
    }

    public static void r(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed33afd", new Object[]{nVar});
        } else if (((ArrayList) nVar.d).isEmpty()) {
            try {
                r u0 = nVar.u0();
                if (!u0.t && u0.w().isEmpty()) {
                    u0.t = true;
                    List<r.d> E = u0.E(r.CELL_DIFF_NAME);
                    u0.t = false;
                    if (!E.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (r.d dVar : E) {
                            n y = dVar.f12290a.y();
                            if (y != null) {
                                h.a(y, dVar.b, false, false);
                                arrayList.add(y);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            n nVar2 = (n) it.next();
                            if (nVar2.K() != null) {
                                nVar2.K().onPatchCompleted();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                tfs.d("vnodeDiffForCell:" + e.getMessage());
            }
        }
    }
}
