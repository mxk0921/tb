package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static pnm d;

    /* renamed from: a  reason: collision with root package name */
    public final String f26199a = "NewDetail";
    public final List<d> b = new ArrayList(2);
    public c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f26200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, c cVar) {
            super(str);
            this.f26200a = cVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/optimize/prerender/PreRenderViewController$1");
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                try {
                    o2r.a("AsyncInstanceViewLoad");
                    i1d.a();
                    txj.e(txj.TAG_RENDER, "开始异步instance_layout视图");
                    c cVar = this.f26200a;
                    cVar.b = v39.b(cVar.c);
                    synchronized (this.f26200a.f26202a) {
                        txj.e(txj.TAG_RENDER, "通知终止异步instance_layout视图线程阻塞");
                        this.f26200a.f26202a.notifyAll();
                    }
                } catch (Throwable th) {
                    synchronized (this.f26200a.f26202a) {
                        txj.e(txj.TAG_RENDER, "通知终止异步instance_layout视图线程阻塞");
                        this.f26200a.f26202a.notifyAll();
                        o2r.b();
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                txj.e(txj.TAG_RENDER, "异步instance_layout视图异常");
                synchronized (this.f26200a.f26202a) {
                    txj.e(txj.TAG_RENDER, "通知终止异步instance_layout视图线程阻塞");
                    this.f26200a.f26202a.notifyAll();
                }
            }
            o2r.b();
            txj.e(txj.TAG_RENDER, "异步instance_layout视图完成");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f26201a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, d dVar) {
            super(str);
            this.f26201a = dVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/optimize/prerender/PreRenderViewController$2");
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                try {
                    o2r.a("AsyncCardViewLoad");
                    i1d.a();
                    txj.e(txj.TAG_RENDER, "开始异步detail_card_layout视图");
                    d dVar = this.f26201a;
                    dVar.b = v39.a(dVar.d);
                    d dVar2 = this.f26201a;
                    dVar2.c = v39.c(dVar2.d);
                    synchronized (this.f26201a.f26203a) {
                        txj.e(txj.TAG_RENDER, "通知终止异步detail_card_layout视图线程阻塞");
                        this.f26201a.f26203a.notifyAll();
                    }
                } catch (Throwable th) {
                    synchronized (this.f26201a.f26203a) {
                        txj.e(txj.TAG_RENDER, "通知终止异步detail_card_layout视图线程阻塞");
                        this.f26201a.f26203a.notifyAll();
                        o2r.b();
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                txj.e(txj.TAG_RENDER, "异步detail_card_layout视图异常");
                synchronized (this.f26201a.f26203a) {
                    txj.e(txj.TAG_RENDER, "通知终止异步detail_card_layout视图线程阻塞");
                    this.f26201a.f26203a.notifyAll();
                }
            }
            o2r.b();
            txj.e(txj.TAG_RENDER, "异步detail_card_layout视图完成");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f26202a;
        public View b;
        public aew c;

        static {
            t2o.a(352322211);
        }

        public c(pnm pnmVar) {
        }

        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("7498895b", new Object[]{this});
            }
            return this.b;
        }

        public Object b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a2ea28a", new Object[]{this});
            }
            return this.f26202a;
        }

        public void c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740cd63b", new Object[]{this, context});
            } else {
                this.c.c(context);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f26203a;
        public View b;
        public FrameLayout c;
        public aew d;

        static {
            t2o.a(352322212);
        }

        public d(pnm pnmVar) {
        }

        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("1f8a1196", new Object[]{this});
            }
            return this.b;
        }

        public Object b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a2ea28a", new Object[]{this});
            }
            return this.f26203a;
        }

        public FrameLayout c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("f26165fa", new Object[]{this});
            }
            return this.c;
        }

        public void d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740cd63b", new Object[]{this, context});
            } else {
                this.d.c(context);
            }
        }
    }

    static {
        t2o.a(352322208);
    }

    public static pnm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnm) ipChange.ipc$dispatch("df36b072", new Object[0]);
        }
        if (d == null) {
            d = new pnm();
        }
        return d;
    }

    public d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a4dee0fc", new Object[]{this});
        }
        if (((ArrayList) this.b).isEmpty()) {
            return null;
        }
        return (d) ((ArrayList) this.b).remove(0);
    }

    public c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("38098b6c", new Object[]{this});
        }
        c cVar = this.c;
        this.c = null;
        return cVar;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343b80e6", new Object[]{this, new Integer(i)});
            return;
        }
        txj.e(txj.TAG_RENDER, "preCreateCardRootViewImpl" + i);
        o2r.a("preCreateCardRootViewImpl" + i);
        d dVar = new d(this);
        dVar.f26203a = new Object();
        dVar.d = new aew(Globals.getApplication());
        ((ArrayList) this.b).add(dVar);
        new b(this.f26199a, dVar).start();
        o2r.b();
    }

    public void e(com.taobao.android.detail2.core.framework.data.global.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633c9fdd", new Object[]{this, aVar});
        } else if (aVar.M() != null && aVar.M().c(aVar.R().x)) {
            while (((ArrayList) this.b).size() < 2) {
                d(((ArrayList) this.b).size());
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325971c2", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_RENDER, "preCreateInstanceRootViewImpl");
        o2r.a("preCreateInstanceRootViewImpl");
        c cVar = new c(this);
        cVar.f26202a = new Object();
        cVar.c = new aew(Globals.getApplication());
        this.c = cVar;
        new a(this.f26199a, cVar).start();
        o2r.b();
    }

    public void g(com.taobao.android.detail2.core.framework.data.global.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ffb562", new Object[]{this, aVar});
        } else if (aVar.M() != null && aVar.M().c(aVar.R().x)) {
            f();
        }
    }
}
