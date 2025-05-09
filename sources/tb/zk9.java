package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final o5c f32823a = new y07();
    public static final wnc b = (wnc) d62.b(wnc.class, "FlexaClass");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32824a;
        public final /* synthetic */ i b;

        public a(String str, i iVar) {
            this.f32824a = str;
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.b.onClassLoaded(Class.forName(this.f32824a, true, zk9.class.getClassLoader()));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                this.b.onClassNotFound();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32825a;
        public final /* synthetic */ i b;

        public b(String str, i iVar) {
            this.f32825a = str;
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Class<?> cls = Class.forName(this.f32825a, true, zk9.class.getClassLoader());
                zk9.a().c("callback success:%s on thread:%s", cls, Thread.currentThread());
                this.b.onClassLoaded(cls);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                this.b.onClassNotFound();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32826a;
        public final /* synthetic */ i b;
        public final /* synthetic */ Executor c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ucq e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Class<?> cls = Class.forName(c.this.d, true, zk9.class.getClassLoader());
                    zk9.a().c("callback success:%s on thread:%s", cls, Thread.currentThread());
                    c.this.b.onClassLoaded(cls);
                } catch (ClassNotFoundException e) {
                    c.this.b.onClassNotFound();
                    e.printStackTrace();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Class<?> cls = Class.forName(c.this.d, true, zk9.class.getClassLoader());
                    zk9.a().c("callback success:%s on thread:%s", cls, Thread.currentThread());
                    c.this.b.onClassLoaded(cls);
                } catch (ClassNotFoundException e) {
                    c.this.b.onClassNotFound();
                    e.printStackTrace();
                }
            }
        }

        public c(String str, i iVar, Executor executor, String str2, ucq ucqVar) {
            this.f32826a = str;
            this.b = iVar;
            this.c = executor;
            this.d = str2;
            this.e = ucqVar;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar.f() != null && bdqVar.f().contains(this.f32826a) && bdqVar.i() == 5) {
                if (this.b != null) {
                    Executor executor = this.c;
                    if (executor != null) {
                        executor.execute(new a());
                    } else {
                        rdq.b().a(new b());
                    }
                }
                this.e.e(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32829a;
        public final /* synthetic */ Executor b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                zk9.a().c("callback failed:%s on thread:%s", d.this.c, Thread.currentThread());
                d.this.f32829a.onClassNotFound();
            }
        }

        public d(i iVar, Executor executor, String str) {
            this.f32829a = iVar;
            this.b = executor;
            this.c = str;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
            } else if (this.f32829a != null) {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new a());
                    return;
                }
                zk9.a().c("callback failed:%s on thread:%s", this.c, Thread.currentThread());
                this.f32829a.onClassNotFound();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32831a;
        public final /* synthetic */ Class b;

        public e(i iVar, Class cls) {
            this.f32831a = iVar;
            this.b = cls;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f32831a.onClassLoaded(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32832a;
        public final /* synthetic */ i b;
        public final /* synthetic */ Class c;

        public f(String str, i iVar, Class cls) {
            this.f32832a = str;
            this.b = iVar;
            this.c = cls;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Log.e("FlexaClass", "callback success:" + this.f32832a);
            this.b.onClassLoaded(this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32833a;

        public g(i iVar) {
            this.f32833a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f32833a.onClassNotFound();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32834a;

        public h(i iVar) {
            this.f32834a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f32834a.onClassNotFound();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface i {
        void onClassLoaded(Class<?> cls);

        void onClassNotFound();
    }

    static {
        t2o.a(676331706);
    }

    public static /* synthetic */ wnc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("6bace6de", new Object[0]);
        }
        return b;
    }

    public static void b(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9d3289", new Object[]{str, iVar});
        } else {
            c(str, iVar, null);
        }
    }

    public static void c(String str, i iVar, Executor executor) {
        ucq ucqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15158e6d", new Object[]{str, iVar, executor});
            return;
        }
        y07 y07Var = (y07) f32823a;
        String a2 = y07Var.a(str);
        if (!TextUtils.isEmpty(a2)) {
            b.c("forName:%s from Feature:%s", a2, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            arrayList.addAll(y07Var.b(a2));
            try {
                ucqVar = vcq.a(bcq.a().e().j());
            } catch (Exception e2) {
                e2.printStackTrace();
                ucqVar = vcq.a(fx4.m().k());
            }
            if (!ucqVar.f().containsAll(arrayList)) {
                ucqVar.g(new c(a2, iVar, executor, str, ucqVar));
                ucqVar.c(xcq.c().l(a2).n()).b(new d(iVar, executor, str));
            } else if (iVar == null) {
            } else {
                if (executor != null) {
                    executor.execute(new a(str, iVar));
                } else {
                    rdq.b().a(new b(str, iVar));
                }
            }
        } else {
            try {
                Class<?> cls = Class.forName(str);
                if (iVar != null) {
                    if (executor != null) {
                        executor.execute(new e(iVar, cls));
                    } else {
                        rdq.b().a(new f(str, iVar, cls));
                    }
                }
            } catch (ClassNotFoundException e3) {
                e3.printStackTrace();
                if (iVar == null) {
                    return;
                }
                if (executor != null) {
                    executor.execute(new g(iVar));
                } else {
                    rdq.b().a(new h(iVar));
                }
            }
        }
    }
}
