package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.c;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.n;
import com.taobao.android.dinamicx.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vc5 extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_ASYNC_RENDER = 3;
    public static final int MSG_BATCH_RENDER = 9;
    public static final int MSG_CACHE_MONITOR = 8;
    public static final int MSG_CANCEL_PREFETCH_SIMPLE = 11;
    public static final int MSG_CANCEL_PREFETCH_TASK = 7;
    public static final int MSG_CLEAR_COMPLETED_SIMPLE_TASKS = 13;
    public static final int MSG_CLEAR_EXECUTOR_TASKS = 4;
    public static final int MSG_CLEAR_SIMPLE_TASKS = 12;
    public static final int MSG_CLEAR_TASKS = 5;
    public static final int MSG_PREFETCH = 2;
    public static final int MSG_PREFETCH_SIMPLE = 10;
    public static final int MSG_PRE_RENDER = 1;
    public static final int MSG_REMOVE_COMPLETED_TASK = 14;
    public static final int MSG_REMOVE_COMPLETED_TASK_VALUE = 15;
    public static final int MSG_RESTORE_EXECUTOR_TASKS = 6;
    public int c = -1;
    public int d;
    public int e;
    public int f;
    public HashMap<String, m86> g;
    public HashMap<String, n> h;
    public boolean i;
    public final a j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<vc5> f29917a;

        static {
            t2o.a(444596631);
        }

        public a(vc5 vc5Var, Looper looper) {
            super(looper);
            this.f29917a = new WeakReference<>(vc5Var);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/asyncrender/DXAsyncRenderManager$AsyncScheduledHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                vc5 vc5Var = this.f29917a.get();
                if (vc5Var == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                try {
                    switch (message.what) {
                        case 1:
                            ((Runnable) message.obj).run();
                            break;
                        case 2:
                            ((Runnable) message.obj).run();
                            break;
                        case 4:
                            vc5.h(vc5Var);
                            break;
                        case 5:
                            vc5.g(vc5Var);
                            break;
                        case 6:
                            vc5.i(vc5Var);
                            break;
                        case 7:
                            vc5Var.o((DXRuntimeContext) message.obj);
                            break;
                        case 8:
                            vc5.j(vc5Var);
                            break;
                        case 9:
                            ((Runnable) message.obj).run();
                            break;
                        case 10:
                            ((Runnable) message.obj).run();
                            break;
                        case 11:
                            vc5Var.p((DXRuntimeContext) message.obj);
                            break;
                        case 12:
                            vc5.k(vc5Var);
                            break;
                        case 13:
                            vc5Var.q();
                            break;
                        case 14:
                            vc5Var.D((DXRuntimeContext) message.obj);
                            break;
                        case 15:
                            vc5Var.E((DXRuntimeContext) message.obj);
                            break;
                    }
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    static {
        t2o.a(444596630);
    }

    public vc5(av5 av5Var) {
        super(av5Var);
        try {
            this.j = new a(this, jb6.c().getLooper());
        } catch (Throwable th) {
            this.j = new a(this, Looper.getMainLooper());
            ic5.s(this.f15675a, null, "AsyncRender", "Async_Render_3.0_init_Crash", f.V3_ASYNC_RENDER_INIT_CRASH, xv5.a(th));
        }
    }

    public static /* synthetic */ void g(vc5 vc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb97b6c7", new Object[]{vc5Var});
        } else {
            vc5Var.t();
        }
    }

    public static /* synthetic */ void h(vc5 vc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace94648", new Object[]{vc5Var});
        } else {
            vc5Var.r();
        }
    }

    public static /* synthetic */ void i(vc5 vc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3ad5c9", new Object[]{vc5Var});
        } else {
            vc5Var.G();
        }
    }

    public static /* synthetic */ Object ipc$super(vc5 vc5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/asyncrender/DXAsyncRenderManager");
    }

    public static /* synthetic */ void j(vc5 vc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8c654a", new Object[]{vc5Var});
        } else {
            vc5Var.A();
        }
    }

    public static /* synthetic */ void k(vc5 vc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ddf4cb", new Object[]{vc5Var});
        } else {
            vc5Var.s();
        }
    }

    public void B(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, ph5 ph5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5370f5", new Object[]{this, dXRuntimeContext, dXRenderOptions, pVar, kVar, ph5Var});
            return;
        }
        if (this.g == null) {
            this.g = new HashMap<>(100);
        }
        if (!this.g.containsKey(dXRuntimeContext.d())) {
            if (this.c == -1) {
                this.c = 0;
            }
            m86 m86Var = new m86(dXRuntimeContext, dXRenderOptions, pVar, kVar, this.b, ph5Var);
            jb6.k(new t86(2, m86Var));
            this.g.put(dXRuntimeContext.d(), m86Var);
            this.c++;
        }
    }

    public void C(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, k kVar, View view, tc5<DXRuntimeContext> tc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e50ad95", new Object[]{this, dXRuntimeContext, dXRenderOptions, kVar, view, tc5Var});
            return;
        }
        if (this.h == null) {
            this.h = new HashMap<>();
        }
        String u = u(dXRuntimeContext);
        if (!this.h.containsKey(u)) {
            n nVar = new n(dXRuntimeContext, dXRenderOptions, this.b, kVar, view, tc5Var);
            jb6.l(new t86(2, nVar));
            this.h.put(u, nVar);
        }
    }

    public void D(DXRuntimeContext dXRuntimeContext) {
        String d;
        m86 m86Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10714cdb", new Object[]{this, dXRuntimeContext});
        } else if (this.g != null && dXRuntimeContext != null && (m86Var = this.g.get((d = dXRuntimeContext.d()))) != null && m86Var.h) {
            this.g.remove(d);
        }
    }

    public void E(DXRuntimeContext dXRuntimeContext) {
        String d;
        m86 m86Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40675b86", new Object[]{this, dXRuntimeContext});
        } else if (this.g != null && dXRuntimeContext != null && (m86Var = this.g.get((d = dXRuntimeContext.d()))) != null && m86Var.h) {
            this.g.put(d, null);
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.c != -1) {
            O();
            K();
            M();
            L();
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4300894", new Object[]{this});
        } else if (this.i) {
            HashMap<String, m86> hashMap = this.g;
            if (hashMap != null) {
                for (m86 m86Var : hashMap.values()) {
                    if (!m86Var.h) {
                        jb6.k(new t86(2, m86Var));
                    }
                }
            }
            HashMap<String, n> hashMap2 = this.h;
            if (hashMap2 != null) {
                for (n nVar : hashMap2.values()) {
                    if (!nVar.b) {
                        jb6.l(new t86(2, nVar));
                    }
                }
            }
            this.i = false;
        }
    }

    public final void H(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ee9525", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    public final void I(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5629fe6", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 11;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa69dce", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 13;
        this.j.sendMessage(obtain);
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71665e2c", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        this.j.sendMessage(obtain);
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac04d2ad", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 12;
        this.j.sendMessage(obtain);
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae343bf", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 5;
        this.j.sendMessage(obtain);
    }

    public void N(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00f8161", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = runnable;
        this.j.sendMessage(obtain);
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6673b1cd", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 8;
        this.j.sendMessage(obtain);
    }

    public void P(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9221cd", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = runnable;
        this.j.sendMessage(obtain);
    }

    public void Q(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6888f8", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 10;
        obtain.obj = runnable;
        this.j.sendMessage(obtain);
    }

    public void R(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f64d0ad", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 14;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    public void S(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72876af4", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 15;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccc2a4b", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        this.j.sendMessage(obtain);
    }

    public void l(List<DXRuntimeContext> list, DXRenderOptions dXRenderOptions, p pVar, k kVar, ph5 ph5Var, cd5 cd5Var, boolean z) {
        fd5 fd5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab0553f", new Object[]{this, list, dXRenderOptions, pVar, kVar, ph5Var, cd5Var, new Boolean(z)});
            return;
        }
        if (dXRenderOptions.f() == 1) {
            fd5Var = new ed5(pVar, kVar, ph5Var, dXRenderOptions, list, cd5Var, z);
        } else if (dXRenderOptions.f() == 2) {
            fd5Var = new dd5(pVar, kVar, ph5Var, dXRenderOptions, list, cd5Var, z);
        } else {
            fd5Var = null;
        }
        if (fd5Var != null) {
            fd5Var.o();
        }
    }

    public void m(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74beb87", new Object[]{this, dXRuntimeContext});
        } else {
            H(dXRuntimeContext);
        }
    }

    public void n(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a579e19", new Object[]{this, dXRuntimeContext});
        } else {
            I(dXRuntimeContext);
        }
    }

    public void o(DXRuntimeContext dXRuntimeContext) {
        m86 m86Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f054e9ee", new Object[]{this, dXRuntimeContext});
            return;
        }
        this.e++;
        HashMap<String, m86> hashMap = this.g;
        if (hashMap != null && (m86Var = hashMap.get(dXRuntimeContext.d())) != null) {
            if (!m86Var.h) {
                m86Var.g.q(true);
                m86Var.h = true;
                this.d++;
            } else if (!m86Var.g.j()) {
                this.f++;
            }
        }
    }

    public void p(DXRuntimeContext dXRuntimeContext) {
        n remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e6a0c0", new Object[]{this, dXRuntimeContext});
            return;
        }
        HashMap<String, n> hashMap = this.h;
        if (hashMap != null && (remove = hashMap.remove(u(dXRuntimeContext))) != null) {
            remove.e();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0160093", new Object[]{this});
        } else if (this.h != null) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<String, n> entry : this.h.entrySet()) {
                if (entry.getValue().b) {
                    hashSet.add(entry.getKey());
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.h.remove((String) it.next());
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8f3ab5", new Object[]{this});
            return;
        }
        this.i = true;
        jb6.b();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9d3d76", new Object[]{this});
            return;
        }
        HashMap<String, n> hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b1b948", new Object[]{this});
            return;
        }
        HashMap<String, m86> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final String u(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("958deb2d", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext.W() instanceof bi6) {
            return dXRuntimeContext.e();
        }
        return dXRuntimeContext.d();
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.c != -1) {
            K();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.c != -1) {
            T();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (this.c != -1) {
            O();
            K();
        }
    }

    public void y(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, ph5 ph5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c141f13", new Object[]{this, dXRuntimeContext, dXRenderOptions, pVar, kVar, ph5Var});
        } else {
            jb6.j(new t86(0, new l86(dXRuntimeContext, dXRenderOptions, pVar, kVar, this.b, ph5Var)));
        }
    }

    public void z(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a250ee8f", new Object[]{this, dXRuntimeContext, dXRenderOptions});
        } else {
            jb6.j(new t86(0, new c(dXRuntimeContext, dXRenderOptions)));
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21091a6a", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i != 0) {
            if (i > 0) {
                float f = (i - this.d) / i;
                HashMap hashMap = new HashMap();
                hashMap.put("totalNum", String.valueOf(this.c));
                hashMap.put("cancelNum", String.valueOf(this.d));
                hashMap.put("fillRate", String.valueOf(f));
                ic5.o(0, this.f15675a, "PreRender", "PreRender_FillRate", hashMap);
                h36.i("DXAsyncRenderManager", "任务填充率=" + f + "预加载任务创建=" + this.c + "任务取消=" + this.d);
            }
            int i2 = this.e;
            if (i2 > 0) {
                float f2 = this.f / i2;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("totalNum", String.valueOf(this.e));
                hashMap2.put("hitNum", String.valueOf(this.f));
                hashMap2.put("hitRate", String.valueOf(f2));
                ic5.o(0, this.f15675a, "PreRender", "PreRender_HitRate", hashMap2);
                h36.i("DXAsyncRenderManager", "缓存命中率=" + f2 + "模板渲染调用次数=" + this.e + "缓存命中的调用次数=" + this.f);
            }
            if (d().m() > 0) {
                float m = this.c / d().m();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("maxNum", String.valueOf(d().m()));
                HashMap<String, m86> hashMap4 = this.g;
                hashMap3.put("taskNum", String.valueOf(hashMap4 != null ? hashMap4.size() : 0));
                hashMap3.put("hitRate", String.valueOf(m));
                ic5.o(0, this.f15675a, "PreRender", "PreRender_OccupationRate", hashMap3);
                h36.i("DXAsyncRenderManager", "缓存利用率=" + m + "缓存最大个数限制=" + d().m() + "预加载的创建任务=" + this.c);
            }
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
        }
    }
}
