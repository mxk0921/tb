package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.o7;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class o7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static n7 b;
    public static final o7 INSTANCE = new o7();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f25175a = new AtomicBoolean(false);
    public static final HashSet<i3> c = new HashSet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static final void c(Class cls) {
            ckf.g(cls, "$aClass");
            IpChange ipChange = o7.$ipChange;
            Object newInstance = cls.newInstance();
            ckf.e(newInstance, "null cannot be cast to non-null type com.taobao.search.ai.AIWidgetCreator");
            o7.d((n7) newInstance);
            o7.c(o7.INSTANCE);
        }

        public static final void d(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d719740", new Object[]{num});
            } else {
                o7.b(o7.INSTANCE);
            }
        }

        @Override // tb.zk9.i
        public void onClassLoaded(final Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "aClass");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.l7a
                @Override // java.lang.Runnable
                public final void run() {
                    o7.a.c(cls);
                }
            });
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            c4p.n("RemoteWidgetCreator", "AI搜索类为找到");
            vcq.a(Globals.getApplication()).c(xcq.c().l("taowise_android_aar").n()).c(new gvk() { // from class: tb.hg9
                @Override // tb.gvk
                public final void onSuccess(Object obj) {
                    o7.a.d((Integer) obj);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static final void b(Class cls) {
            ckf.g(cls, "$aClass");
            IpChange ipChange = o7.$ipChange;
            Object newInstance = cls.newInstance();
            ckf.e(newInstance, "null cannot be cast to non-null type com.taobao.search.ai.AIWidgetCreator");
            o7.d((n7) newInstance);
            o7.c(o7.INSTANCE);
        }

        @Override // tb.zk9.i
        public void onClassLoaded(final Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "aClass");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.tpa
                @Override // java.lang.Runnable
                public final void run() {
                    o7.b.b(cls);
                }
            });
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                o7.a().set(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static final void c(Class cls) {
            ckf.g(cls, "$aClass");
            IpChange ipChange = o7.$ipChange;
            Object newInstance = cls.newInstance();
            ckf.e(newInstance, "null cannot be cast to non-null type com.taobao.search.ai.AIWidgetCreator");
            o7.d((n7) newInstance);
            o7.c(o7.INSTANCE);
        }

        public static final void d(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d719740", new Object[]{num});
            } else {
                o7.b(o7.INSTANCE);
            }
        }

        @Override // tb.zk9.i
        public void onClassLoaded(final Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "aClass");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.rqa
                @Override // java.lang.Runnable
                public final void run() {
                    o7.c.c(cls);
                }
            });
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            c4p.n("RemoteWidgetCreator", "AI搜索类为找到");
            vcq.a(Globals.getApplication()).c(xcq.c().l("taowise_android_aar").n()).c(new gvk() { // from class: tb.upa
                @Override // tb.gvk
                public final void onSuccess(Object obj) {
                    o7.c.d((Integer) obj);
                }
            });
        }
    }

    static {
        t2o.a(815792153);
    }

    public static final /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("90720119", new Object[0]);
        }
        return f25175a;
    }

    public static final /* synthetic */ void b(o7 o7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28c190e", new Object[]{o7Var});
        } else {
            o7Var.f();
        }
    }

    public static final /* synthetic */ void c(o7 o7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0ae72a", new Object[]{o7Var});
        } else {
            o7Var.g();
        }
    }

    public static final /* synthetic */ void d(n7 n7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3226dff", new Object[]{n7Var});
        } else {
            b = n7Var;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bf05ed", new Object[]{this});
        } else {
            zk9.b("com.taobao.taowise.srp.RemoteAIWidgetCreator", new b());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df489909", new Object[]{this});
            return;
        }
        Iterator<i3> it = c.iterator();
        while (it.hasNext()) {
            m7 m7Var = it.next().a().get();
            if (m7Var != null) {
                m7Var.a();
            }
        }
        c.clear();
    }

    public final synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[]{this});
        } else if (b == null) {
            AtomicBoolean atomicBoolean = f25175a;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                try {
                    zk9.b("com.taobao.taowise.srp.RemoteAIWidgetCreator", new c());
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final synchronized void i(WeakReference<m7> weakReference) {
        m7 m7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74814656", new Object[]{this, weakReference});
        } else if (b != null) {
            if (!(weakReference == null || (m7Var = weakReference.get()) == null)) {
                m7Var.a();
            }
        } else {
            e(null, null, weakReference);
        }
    }

    public final synchronized phw<?, ? extends View, ?> e(l7 l7Var, mzn mznVar, WeakReference<m7> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("e4762a7", new Object[]{this, l7Var, mznVar, weakReference});
        } else if (b == null) {
            if (weakReference != null) {
                c.add(new i3(weakReference));
            }
            AtomicBoolean atomicBoolean = f25175a;
            if (atomicBoolean.get()) {
                return null;
            }
            atomicBoolean.set(true);
            try {
                zk9.b("com.taobao.taowise.srp.RemoteAIWidgetCreator", new a());
            } catch (Throwable unused) {
            }
            return null;
        } else if (l7Var == null || mznVar == null) {
            return null;
        } else {
            bcq.a().f(mznVar.a(), "taowise_android_aar");
            n7 n7Var = b;
            ckf.d(n7Var);
            return n7Var.createAIWidget(l7Var, mznVar);
        }
    }
}
