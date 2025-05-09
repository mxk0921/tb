package com.taobao.tao.flexbox.layoutmanager.core;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.LayoutManagerInitializer;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.ShareElementAnimationController;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.i;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.p;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a5k;
import tb.akt;
import tb.anl;
import tb.bb4;
import tb.f21;
import tb.fhb;
import tb.g2e;
import tb.ggs;
import tb.gol;
import tb.hc8;
import tb.hk8;
import tb.ig8;
import tb.igs;
import tb.le8;
import tb.lgs;
import tb.mx7;
import tb.nwv;
import tb.od0;
import tb.pg1;
import tb.qau;
import tb.rxl;
import tb.s6o;
import tb.sz3;
import tb.t2o;
import tb.tfs;
import tb.ut2;
import tb.vfs;
import tb.ytn;
import tb.yx9;
import tb.zcr;
import tb.zh9;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMIT_MODE_APPEND = "append";
    public static final String COMMIT_MODE_IGNORE_LIST = "ignoredlist";
    public static final String COMMIT_MODE_LIST_DATASETCHANGE = "list-datasetchange";
    public static final String COMMIT_MODE_NONE = "none";
    public static final String LAYOUT_STRATEGY_KEY = "kTNodeRenderOptionLocalFirst";
    public static final int LAYOUT_STRATEGY_LOCAL = 0;
    public static final int LAYOUT_STRATEGY_NETWORK = 1;
    public static final int LAYOUT_STRATEGY_UNSET = -1;
    public static Context O;
    public com.taobao.tao.flexbox.layoutmanager.core.i A;
    public final ShareElementAnimationController B;
    public int C;
    public vfs.b D;
    public boolean E;
    public y.a F;
    public boolean G;
    public final bb4 H;
    public final Handler I;
    public final g2e J;
    public final Runnable K;
    public final HashMap<String, Integer> L;
    public final Map<String, PreloadDelegate.c> M;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f12249a;
    public final String b;
    public rxl.a c;
    public Map<String, Integer> d;
    public final HashMap<String, Class> e;
    public List<com.taobao.tao.flexbox.layoutmanager.core.j> f;
    public List<com.taobao.tao.flexbox.layoutmanager.core.j> g;
    public final t h;
    public final SparseArray<com.taobao.tao.flexbox.layoutmanager.core.n> i;
    public com.taobao.tao.flexbox.layoutmanager.core.n j;
    public final List<com.taobao.tao.flexbox.layoutmanager.core.n> k;
    public com.taobao.tao.flexbox.layoutmanager.ac.d l;
    public Boolean m;
    public boolean n;
    public boolean o;
    public Context p;
    public ComponentCallbacks q;
    public Object r;
    public p.b s;
    public String t;
    public JSONObject u;
    public final le8 v;
    public w w;
    public TNodeView x;
    public yx9 y;
    public SparseArray<Object> z;
    public static final AtomicInteger N = new AtomicInteger(0);
    public static boolean P = false;
    public static final List<o> Q = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements f.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f12250a;
        public final /* synthetic */ w b;
        public final /* synthetic */ long c;

        public a(y yVar, w wVar, long j) {
            this.f12250a = yVar;
            this.b = wVar;
            this.c = j;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.f.g
        public void a(Map map, String str) {
            com.taobao.tao.flexbox.layoutmanager.core.n nVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccc9f5b1", new Object[]{this, map, str});
                return;
            }
            if (map != null) {
                nVar = o.this.i1(this.f12250a, map, this.b);
                if (nVar == null && !TextUtils.equals(str, "local") && !TextUtils.isEmpty(this.f12250a.e)) {
                    nVar = o.this.i1(this.f12250a, com.taobao.tao.flexbox.layoutmanager.core.f.h(this.f12250a), this.b);
                }
            } else {
                w wVar = this.b;
                if (wVar != null) {
                    wVar.b(null);
                    tfs.e("TNode", "node is null for no dsl");
                }
                nVar = null;
            }
            if (nVar != null) {
                f21.m(this.f12250a, f21.TASK_DSL_LOAD, null);
                return;
            }
            f21.j(this.f12250a, f21.TASK_DSL_LOAD, "download_error", null);
            o.a(o.this, this.f12250a, this.c, null, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements PreloadDelegate.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f12251a;
        public final /* synthetic */ s b;

        public b(y yVar, s sVar) {
            this.f12251a = yVar;
            this.b = sVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.b
        public void a(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9866760a", new Object[]{this, nVar});
                return;
            }
            tfs.f("in layout render. use cached tnode to continue render");
            o.b(o.this, y.k(this.f12251a));
            o.c(o.this, nVar, this.f12251a, this.b);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b33285", new Object[]{this});
                return;
            }
            tfs.f("in layout render. preload fail,have to render again");
            o.b(o.this, y.k(this.f12251a));
            if (PreloadDelegate.j(o.this, y.k(this.f12251a))) {
                o.x(o.this, null);
            }
            o.d(o.this, System.nanoTime(), this.f12251a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vfs.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.vfs.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ea082d8", new Object[]{this, str, str2, str3});
            } else if (com.taobao.tao.flexbox.layoutmanager.core.f.BAD_DSL.equals(str2)) {
                o.n(o.this).removeCallbacks(o.m(o.this));
                o.n(o.this).post(o.m(o.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (o.this.W() instanceof anl) {
                ((anl) o.this.W()).startPostponedEnterTransition(null);
            } else {
                Context context = o.this.p;
                if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
                    ((Activity) o.this.p).startPostponedEnterTransition();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n f12255a;

        public f(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            this.f12255a = nVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.o.w
        public void b(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d402dbd", new Object[]{this, nVar});
                return;
            }
            this.f12255a.w1(200, Boolean.FALSE);
            int[] iArr = (int[]) this.f12255a.m0(201);
            if (iArr != null) {
                this.f12255a.w1(201, null);
                o.this.Q0(this.f12255a, iArr[0], iArr[1]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f12256a;

        public g(o oVar, Runnable runnable) {
            this.f12256a = runnable;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            this.f12256a.run();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MessageQueue.IdleHandler f12257a;

        public h(MessageQueue.IdleHandler idleHandler) {
            this.f12257a = idleHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Looper.myQueue().addIdleHandler(this.f12257a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.taobao.tao.flexbox.layoutmanager.core.n nVar : o.i(o.this)) {
                if (com.taobao.tao.flexbox.layoutmanager.core.f.i(com.taobao.tao.flexbox.layoutmanager.core.q.k(nVar))) {
                    o.q(o.this);
                    o.this.a1(nVar);
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            tfs.e(com.taobao.tao.flexbox.layoutmanager.core.l.TAG, "FlexaClass load ToolManager error:onClassNotFound");
            com.taobao.tao.flexbox.layoutmanager.core.l.g(true, "type", "ToolManager", "error", "ClassNotFound");
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            o oVar = o.this;
            try {
                o.u(oVar, (com.taobao.tao.flexbox.layoutmanager.core.i) cls.getConstructor(o.class).newInstance(oVar));
                o.t(oVar).setEnableDebugTool(o.P);
                if (o.P) {
                    o.t(oVar).showTool(oVar.I().A());
                }
            } catch (Throwable th) {
                th.printStackTrace();
                tfs.e(com.taobao.tao.flexbox.layoutmanager.core.l.TAG, "FlexaClass load ToolManager error:Throwable: " + th.toString());
                com.taobao.tao.flexbox.layoutmanager.core.l.g(true, "type", "ToolManager", "error", th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12260a;
        public final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ hk8 f;

        public k(int i, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str, String str2, Map map, hk8 hk8Var) {
            this.f12260a = i;
            this.b = nVar;
            this.c = str;
            this.d = str2;
            this.e = map;
            this.f = hk8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o.this.o1(this.f12260a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements nwv.a<x> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f12261a;
        public final /* synthetic */ z b;

        public l(boolean[] zArr, z zVar) {
            this.f12261a = zArr;
            this.b = zVar;
        }

        public void a(Class<x> cls) {
            if (cls != null) {
                try {
                    cls.newInstance().onInitTNodeEngine(o.this);
                } catch (IllegalAccessException e) {
                    tfs.e("TNodeEngine", e.getMessage());
                } catch (InstantiationException e2) {
                    tfs.e("TNodeEngine", e2.getMessage());
                } catch (Exception e3) {
                    tfs.e("TNodeEngine", e3.getMessage());
                }
            }
            boolean[] zArr = this.f12261a;
            if (!zArr[0]) {
                ((d) this.b).a();
                zArr[0] = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o.v(o.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (o.w(o.this) != null) {
                o.w(o.this).n(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.o$o  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ComponentCallbacksC0693o implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ComponentCallbacksC0693o() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else if (akt.f1()) {
                o.y(o.this);
                com.taobao.tao.flexbox.layoutmanager.core.f.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public int f12265a;
        public int b;
        public final o c;
        public final com.taobao.tao.flexbox.layoutmanager.core.n d;
        public final Object e;
        public final w f;
        public final boolean g;
        public final Object h;
        public final boolean i;
        public final String j;
        public final d.j k;

        static {
            t2o.a(503317150);
        }

        public p(d.j jVar, String str, long j, o oVar, String str2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, Object obj, w wVar, Object obj2, boolean z) {
            this.k = jVar;
            this.c = oVar;
            this.d = nVar;
            this.e = obj;
            this.f = wVar;
            boolean z2 = false;
            if (nVar == null || nVar.Y() != null) {
                this.g = (oVar.d0() == null || oVar.d0().w0() == null) ? true : z2;
            } else {
                this.g = nVar.w0() == null ? true : z2;
            }
            this.i = z;
            this.h = obj2;
            this.j = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface q {
        void a(o oVar, y yVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface r {
        boolean isAlive();

        boolean isDestroy();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface t {
        void a(String str, com.taobao.tao.flexbox.layoutmanager.core.j jVar);

        void b(String str, com.taobao.tao.flexbox.layoutmanager.core.j jVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface v extends w {
        void a(com.taobao.tao.flexbox.layoutmanager.core.n nVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface w {
        void b(com.taobao.tao.flexbox.layoutmanager.core.n nVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface x {
        void onInitTNodeEngine(o oVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class y {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f12269a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public int f;
        public int g;
        public final Map h;
        public final String i;
        public Map j;
        public final boolean k;
        public Map l;
        public o m;
        public Map p;
        public final boolean r;
        public final int s;
        public final String t;
        public com.taobao.tao.flexbox.layoutmanager.core.n u;
        public final lgs.b v;
        public final boolean w;
        public final boolean x;
        public a y;
        public int n = 0;
        public int o = 0;
        public String q = "unknown";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public Context f12270a;
            public String b;
            public String c;
            public boolean d;
            public String e;
            public String f;
            public int g;
            public Map i;
            public Map j;
            public Map l;
            public String o;
            public lgs.b p;
            public int h = -1;
            public boolean k = true;
            public boolean m = false;
            public int n = -1;
            public final boolean q = true;

            static {
                t2o.a(503317161);
            }

            public a(Context context) {
                this.f12270a = context;
            }

            public static /* synthetic */ int a(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("895c23db", new Object[]{aVar, new Integer(i)})).intValue();
                }
                aVar.h = i;
                return i;
            }

            public static /* synthetic */ int b(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("c14cfefa", new Object[]{aVar, new Integer(i)})).intValue();
                }
                aVar.g = i;
                return i;
            }

            public static /* synthetic */ Context c(a aVar, Context context) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Context) ipChange.ipc$dispatch("ac764735", new Object[]{aVar, context});
                }
                aVar.f12270a = context;
                return context;
            }

            public y d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (y) ipChange.ipc$dispatch("ad2164ba", new Object[]{this});
                }
                y yVar = new y(this.f12270a, this.c, this.p, this.d, this.b, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q);
                yVar.y = this;
                return yVar;
            }

            public Context e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
                }
                return this.f12270a;
            }

            public Map f() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("426496e4", new Object[]{this});
                }
                return this.j;
            }

            public String g() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
                }
                return this.e;
            }

            public String h() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
                }
                return this.c;
            }

            public a i(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("90900cbb", new Object[]{this, new Boolean(z)});
                }
                this.m = z;
                return this;
            }

            public a j(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("c094e995", new Object[]{this, new Boolean(z)});
                }
                this.k = z;
                return this;
            }

            public a k(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("5b9d3902", new Object[]{this, new Integer(i)});
                }
                this.g = i;
                return this;
            }

            public a l(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("94e128c3", new Object[]{this, new Integer(i)});
                }
                this.h = i;
                return this;
            }

            public a m(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("2293b94a", new Object[]{this, new Integer(i)});
                }
                this.n = i;
                return this;
            }

            public a n(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("dae01de6", new Object[]{this, map});
                }
                this.i = map;
                return this;
            }

            public a o(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("ad3bea4", new Object[]{this, str});
                }
                this.f = str;
                return this;
            }

            public a p(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("e68cf77", new Object[]{this, str});
                }
                this.b = str;
                return this;
            }

            public a q(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("95e9b358", new Object[]{this, str});
                }
                this.o = str;
                return this;
            }

            @Deprecated
            public a r(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("80641fcb", new Object[]{this, jSONObject});
                }
                this.j = jSONObject;
                return this;
            }

            public a s(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("e067f696", new Object[]{this, map});
                }
                this.j = map;
                return this;
            }

            public a t(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("64b8190c", new Object[]{this, map});
                }
                this.l = map;
                return this;
            }

            public a u(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("6d440910", new Object[]{this, str});
                }
                this.e = str;
                return this;
            }

            public a v(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("9794805a", new Object[]{this, str});
                }
                this.c = str;
                return this;
            }

            public a w(lgs.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("ba53b0e5", new Object[]{this, bVar});
                }
                this.p = bVar;
                return this;
            }

            public a x(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("2c4a601e", new Object[]{this, new Boolean(z)});
                }
                this.d = z;
                return this;
            }
        }

        static {
            t2o.a(503317160);
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public y(android.content.Context r17, java.lang.String r18, tb.lgs.b r19, boolean r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, java.util.Map r26, java.util.Map r27, boolean r28, java.util.Map r29, boolean r30, int r31, java.lang.String r32, boolean r33) {
            /*
                Method dump skipped, instructions count: 351
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.o.y.<init>(android.content.Context, java.lang.String, tb.lgs$b, boolean, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.Map, java.util.Map, boolean, java.util.Map, boolean, int, java.lang.String, boolean):void");
        }

        public static /* synthetic */ Map a(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("83f15cb4", new Object[]{yVar});
            }
            return yVar.l;
        }

        public static /* synthetic */ Map b(y yVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("16eb4b59", new Object[]{yVar, map});
            }
            yVar.l = map;
            return map;
        }

        public static /* synthetic */ Map c(y yVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5952b774", new Object[]{yVar, map});
            }
            yVar.p = map;
            return map;
        }

        public static /* synthetic */ String d(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("eb93ee7b", new Object[]{yVar});
            }
            return yVar.b;
        }

        public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n e(y yVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("58251f0c", new Object[]{yVar, nVar});
            }
            yVar.u = nVar;
            return nVar;
        }

        public static /* synthetic */ Map f(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b4ffa515", new Object[]{yVar});
            }
            return yVar.h;
        }

        public static /* synthetic */ int g(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("797f70d4", new Object[]{yVar})).intValue();
            }
            return yVar.f;
        }

        public static /* synthetic */ int h(y yVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7255e9f3", new Object[]{yVar, new Integer(i)})).intValue();
            }
            yVar.f = i;
            return i;
        }

        public static /* synthetic */ int i(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59f8c6d5", new Object[]{yVar})).intValue();
            }
            return yVar.g;
        }

        public static /* synthetic */ int j(y yVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a1075412", new Object[]{yVar, new Integer(i)})).intValue();
            }
            yVar.g = i;
            return i;
        }

        public static /* synthetic */ String k(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e2108cec", new Object[]{yVar});
            }
            return yVar.c;
        }

        public int l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue();
            }
            return this.g;
        }

        public int m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("67e015b5", new Object[]{this})).intValue();
            }
            return this.f;
        }

        public Context n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
            }
            return this.f12269a;
        }

        public Map o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("426496e4", new Object[]{this});
            }
            return this.j;
        }

        public com.taobao.tao.flexbox.layoutmanager.core.n p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("d6e63de1", new Object[]{this});
            }
            return this.u;
        }

        public String q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.c;
        }

        public lgs.b r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lgs.b) ipChange.ipc$dispatch("d2e5f5ad", new Object[]{this});
            }
            return this.v;
        }

        public void s(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd151640", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.f = i;
            this.g = i2;
            a aVar = this.y;
            if (aVar != null) {
                a.a(aVar, i);
                a.b(this.y, i2);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TNodeRenderContext{url='" + this.c + "', renderUrl='" + this.d + "', containerWidth=" + this.f + ", containerHeight=" + this.g + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface z {
    }

    static {
        t2o.a(503317132);
    }

    public o() {
        this(null);
    }

    public static Context J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[0]);
        }
        Context context = O;
        if (context != null) {
            return context;
        }
        return Globals.getApplication();
    }

    public static List<o> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b4b6cc5", new Object[0]);
        }
        return Q;
    }

    public static void S0(String str, Class<? extends Component> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8ed975", new Object[]{str, cls});
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.d.h(str, cls);
        }
    }

    public static void T0(String str, Class<Object> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae14065a", new Object[]{str, cls});
        } else {
            com.taobao.tao.flexbox.layoutmanager.ac.c.c(str, cls);
        }
    }

    public static void Y0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bd404f", new Object[]{str, str2});
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.d.j(str, str2);
        }
    }

    public static /* synthetic */ void a(o oVar, y yVar, long j2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e140e3", new Object[]{oVar, yVar, new Long(j2), nVar, new Boolean(z2)});
        } else {
            oVar.z1(yVar, j2, nVar, z2);
        }
    }

    public static /* synthetic */ void b(o oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e4c5d2", new Object[]{oVar, str});
        } else {
            oVar.w1(str);
        }
    }

    public static void b1(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341da4e", new Object[]{oVar});
            return;
        }
        Iterator it = ((ArrayList) Q).iterator();
        while (it.hasNext()) {
            if (it.next() == oVar) {
                it.remove();
            }
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n c(o oVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar, y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("276e2c07", new Object[]{oVar, nVar, yVar, wVar});
        }
        return oVar.h1(nVar, yVar, wVar);
    }

    public static /* synthetic */ void d(o oVar, long j2, y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f107bfb8", new Object[]{oVar, new Long(j2), yVar, wVar});
        } else {
            oVar.j0(j2, yVar, wVar);
        }
    }

    public static /* synthetic */ w e(o oVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("7a0e0233", new Object[]{oVar, wVar});
        }
        oVar.w = wVar;
        return wVar;
    }

    public static /* synthetic */ void f(o oVar, String str, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b9efc4", new Object[]{oVar, str, nVar});
        } else {
            oVar.x0(str, nVar);
        }
    }

    public static /* synthetic */ void g(o oVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d17098f", new Object[]{oVar, nVar});
        } else {
            oVar.D(nVar);
        }
    }

    public static /* synthetic */ void h(o oVar, y yVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08b78f8", new Object[]{oVar, yVar, nVar});
        } else {
            oVar.p1(yVar, nVar);
        }
    }

    public static /* synthetic */ List i(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f35dd50", new Object[]{oVar});
        }
        return oVar.k;
    }

    public static /* synthetic */ void j(o oVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cddfa7", new Object[]{oVar, nVar});
        } else {
            oVar.G1(nVar);
        }
    }

    public static /* synthetic */ void k(o oVar, y yVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad2d110", new Object[]{oVar, yVar, nVar});
        } else {
            oVar.q1(yVar, nVar);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.ac.d l(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.ac.d) ipChange.ipc$dispatch("49150110", new Object[]{oVar});
        }
        return oVar.l;
    }

    public static /* synthetic */ Runnable m(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d6daa0ad", new Object[]{oVar});
        }
        return oVar.K;
    }

    public static void m1(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d7ce24", new Object[]{runnable});
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.p.f().i().e(runnable);
        }
    }

    public static /* synthetic */ Handler n(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d1c4ffe0", new Object[]{oVar});
        }
        return oVar.I;
    }

    public static /* synthetic */ void o(o oVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f26ff0", new Object[]{oVar, nVar});
        } else {
            oVar.H1(nVar);
        }
    }

    public static synchronized void o0(Context context) {
        synchronized (o.class) {
            if (O == null) {
                O = context.getApplicationContext();
                igs.e();
                try {
                    try {
                        try {
                            IpChange ipChange = LayoutManagerInitializer.$ipChange;
                            ytn.c("setup", LayoutManagerInitializer.class, new Class[0]).invoke(null, new Object[0]);
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                    }
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ List p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cd6f63", new Object[0]);
        }
        return null;
    }

    public static /* synthetic */ int q(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8db32ea1", new Object[]{oVar})).intValue();
        }
        int i2 = oVar.C;
        oVar.C = 1 + i2;
        return i2;
    }

    public static /* synthetic */ void r(o oVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str, Object obj, w wVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42a4a26", new Object[]{oVar, nVar, str, obj, wVar, new Boolean(z2)});
        } else {
            oVar.B(nVar, str, obj, wVar, z2);
        }
    }

    public static /* synthetic */ void s(o oVar, d.j jVar, String str, long j2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str2, Object obj, w wVar, Object obj2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5921a110", new Object[]{oVar, jVar, str, new Long(j2), nVar, str2, obj, wVar, obj2, new Boolean(z2)});
        } else {
            oVar.A(jVar, str, j2, nVar, str2, obj, wVar, obj2, z2);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.i t(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.i) ipChange.ipc$dispatch("fd6cdf8b", new Object[]{oVar});
        }
        return oVar.A;
    }

    public static void t1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0170767", new Object[]{new Boolean(z2)});
        } else {
            P = z2;
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.i u(o oVar, com.taobao.tao.flexbox.layoutmanager.core.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.i) ipChange.ipc$dispatch("9ad3cb8f", new Object[]{oVar, iVar});
        }
        oVar.A = iVar;
        return iVar;
    }

    public static /* synthetic */ void v(o oVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234466e2", new Object[]{oVar, new Boolean(z2)});
        } else {
            oVar.F(z2);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n w(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("4456d1d3", new Object[]{oVar});
        }
        return oVar.j;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n x(o oVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("ae1e66a5", new Object[]{oVar, nVar});
        }
        oVar.j = nVar;
        return nVar;
    }

    public static /* synthetic */ void y(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70b7170", new Object[]{oVar});
        } else {
            oVar.Z0();
        }
    }

    public final void A(d.j jVar, String str, long j2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str2, Object obj, w wVar, Object obj2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a20bd8", new Object[]{this, jVar, str, new Long(j2), nVar, str2, obj, wVar, obj2, new Boolean(z2)});
            return;
        }
        G();
        this.s.f12272a.k(new p(jVar, str, j2, this, str2, nVar, obj, wVar, obj2, z2));
    }

    public void A0(int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fd97e2", new Object[]{this, new Integer(i2), intent});
        } else {
            this.B.m(i2, intent);
        }
    }

    public void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9679e089", new Object[]{this});
            return;
        }
        ComponentCallbacks componentCallbacks = this.q;
        if (componentCallbacks != null) {
            componentCallbacks.onLowMemory();
        }
    }

    public final void B(com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str, Object obj, w wVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500bf05a", new Object[]{this, nVar, str, obj, wVar, new Boolean(z2)});
            return;
        }
        G();
        this.s.f12272a.r(new p(null, null, 0L, this, str, nVar, obj, wVar, null, z2));
    }

    public void B0(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        if (od0.D().j() != null) {
            od0.D().j().c(this, i2, i3, intent);
        }
        if (this.j != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestCode", Integer.valueOf(i2));
            hashMap.put("resultCode", Integer.valueOf(i3));
            hashMap.put("data", intent);
            o1(512, this.j, "onactivityresult", null, hashMap, null);
        }
    }

    public final boolean B1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b1e1b7c", new Object[]{this, str})).booleanValue();
        }
        String g2 = PreloadDelegate.g(str);
        if (TextUtils.isEmpty(g2)) {
            return false;
        }
        synchronized (this.L) {
            try {
                Integer num = this.L.get(g2);
                if (num != null && num.intValue() == 2) {
                    return false;
                }
                this.L.put(g2, 1);
                ((HashMap) this.M).put(g2, new PreloadDelegate.c());
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str, Object obj, w wVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5baccb67", new Object[]{this, nVar, str, obj, wVar, new Boolean(z2)});
            return;
        }
        G();
        this.s.f12272a.s(new p(null, null, 0L, this, str, nVar, obj, wVar, null, z2));
    }

    public final PreloadDelegate.PreloadHitResult C1(String str, PreloadDelegate.b bVar) {
        PreloadDelegate.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadDelegate.PreloadHitResult) ipChange.ipc$dispatch("97b0dbb3", new Object[]{this, str, bVar});
        }
        String g2 = PreloadDelegate.g(str);
        synchronized (this.L) {
            try {
                Integer num = this.L.get(g2);
                if (num == null || num.intValue() != 1) {
                    this.L.put(g2, 2);
                    return PreloadDelegate.PreloadHitResult.NONE;
                }
                Map<String, PreloadDelegate.c> map = this.M;
                if (map != null) {
                    cVar = (PreloadDelegate.c) ((HashMap) map).get(g2);
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    return PreloadDelegate.PreloadHitResult.NONE;
                } else if (cVar.c()) {
                    if (cVar.b() != null) {
                        bVar.a(cVar.b());
                    } else {
                        bVar.b();
                    }
                    return PreloadDelegate.PreloadHitResult.REUSE;
                } else {
                    cVar.e(bVar);
                    return PreloadDelegate.PreloadHitResult.WAIT;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcc2f8a", new Object[]{this, nVar});
        } else if (com.taobao.tao.flexbox.layoutmanager.core.f.i(com.taobao.tao.flexbox.layoutmanager.core.q.k(nVar)) && this.C < 3) {
            this.I.removeCallbacks(this.K);
            this.I.post(this.K);
        } else if (this.D == null) {
            this.D = new c();
            vfs.g().p("weitao_switch", com.taobao.tao.flexbox.layoutmanager.core.f.BAD_DSL, this.D);
        }
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2164d10d", new Object[]{this});
        } else if (this.q != null) {
            J().unregisterComponentCallbacks(this.q);
            this.q = null;
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a124d5c", new Object[]{this});
            return;
        }
        synchronized (this.L) {
            this.L.clear();
            ((HashMap) this.M).clear();
        }
    }

    public void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            F0(this.j);
        }
    }

    public final void E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d5c9ed", new Object[]{this});
        } else if (this.c != null) {
            od0.D().t().a(this.c);
            this.c = null;
        }
    }

    public void F0(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4c92b4", new Object[]{this, nVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sourcePage", "page");
            hashMap.put("type", "page");
            if (nVar != null) {
                if (nVar.w0() != null || !akt.W(nVar.c0())) {
                    tfs.f("onPause, send page disappear");
                    o1(130, nVar, "onpagedisappear", null, hashMap, null);
                } else {
                    tfs.f("ignore pagedisappear for view is null");
                    return;
                }
            }
        } catch (Exception unused) {
        }
        if (!(nVar == null || od0.D().j() == null)) {
            od0.D().j().a(this);
        }
        this.A.onPause();
    }

    public void F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f469eb", new Object[]{this});
        } else {
            this.u = ig8.d(this.p);
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb40708b", new Object[]{this});
        } else if (this.s == null) {
            this.s = com.taobao.tao.flexbox.layoutmanager.core.p.f().e();
        }
    }

    public void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            H0(this.j);
        }
    }

    public final void G1(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88484e84", new Object[]{this, nVar});
        } else if (nVar != null) {
            String I = nwv.I(nVar.H(Component.KEY_PAGE_NAME), null);
            String I2 = nwv.I(nVar.H("spm"), null);
            String I3 = nwv.I(nVar.H("spm-url"), null);
            if (!TextUtils.isEmpty(I)) {
                od0.D().d().updatePageName(nVar, I);
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(I2)) {
                hashMap.put("spm-cnt", I2);
            }
            if (!TextUtils.isEmpty(I3)) {
                hashMap.put("spm-url", I3);
            }
            od0.D().d().updatePageProperties(nVar, hashMap);
        }
    }

    public Class H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f75cc89a", new Object[]{this, str});
        }
        return this.e.get(str);
    }

    public final void H1(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a43d9de", new Object[]{this, nVar});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.n nVar2 = this.j;
        if (nVar2 == null || !nVar2.s) {
            this.j = nVar;
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.ac.d I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.ac.d) ipChange.ipc$dispatch("a7ef6208", new Object[]{this});
        }
        return this.l;
    }

    public void I0(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a1fc8", new Object[]{this, nVar});
            return;
        }
        try {
            tfs.f("onStart");
            o1(130, nVar, "onstart", null, null, null);
        } catch (Exception unused) {
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f304fdbe", new Object[]{this});
        } else if (this.j != null && akt.k2() && !(this.j.N() instanceof Application)) {
            nwv.A0(new n(), 400L);
        }
    }

    public bb4 K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bb4) ipChange.ipc$dispatch("e7b9a17c", new Object[]{this});
        }
        return this.H;
    }

    public void K0(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb431ca", new Object[]{this, nVar});
            return;
        }
        try {
            tfs.f("onStop");
            o1(Component.MSG_FLAG_DISAPPEAR, nVar, "onstop", null, null, null);
        } catch (Exception unused) {
        }
    }

    public TNodeView L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("d8dc4274", new Object[]{this});
        }
        return this.x;
    }

    public void L0(com.taobao.tao.flexbox.layoutmanager.core.n nVar, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d864781", new Object[]{this, nVar, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (nVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("oldType", Integer.valueOf(i2));
            hashMap.put("newType", Integer.valueOf(i3));
            hashMap.put("x", Integer.valueOf(s6o.K(nVar, nVar.N(), 0.0f)));
            hashMap.put("y", Integer.valueOf(s6o.K(nVar, nVar.N(), 0.0f)));
            hashMap.put("w", Integer.valueOf(s6o.K(nVar, nVar.N(), i4)));
            hashMap.put("h", Integer.valueOf(s6o.K(nVar, nVar.N(), i5)));
            tfs.f("onWindowSizeTypeChanged, oldType:" + i2 + " newType:" + i3 + " newWidth:" + i4 + " newHeight:" + i5);
            String str = (String) nVar.H("onwindowsizetypechanged");
            if (nVar.K() != null && str != null) {
                nVar.K().sendMessage(nVar, "onwindowsizetypechanged", str, hashMap, null);
            }
        }
    }

    public Context M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.p;
    }

    public void M0(int i2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50d9fda", new Object[]{this, new Integer(i2), nVar, str, str2, map, hk8Var});
        } else {
            nwv.y0(new k(i2, nVar, str, str2, map, hk8Var));
        }
    }

    public String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1add75e2", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.j;
        if (nVar != null) {
            return com.taobao.tao.flexbox.layoutmanager.core.q.k(nVar);
        }
        return null;
    }

    public void N0(y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790f4f8a", new Object[]{this, yVar, wVar});
        } else {
            g1(yVar, true, wVar);
        }
    }

    public String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4aaa242a", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.j;
        if (nVar != null) {
            return com.taobao.tao.flexbox.layoutmanager.core.q.m(nVar);
        }
        return null;
    }

    public le8 P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (le8) ipChange.ipc$dispatch("56243319", new Object[]{this});
        }
        return this.v;
    }

    public void P0(int i2, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c60a67", new Object[]{this, new Integer(i2), nVar});
            return;
        }
        synchronized (this.i) {
            this.i.put(i2, nVar);
        }
    }

    public Handler Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("bd4a83ad", new Object[]{this});
        }
        return this.s.f12272a.c();
    }

    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca44c66", new Object[]{this});
        }
        return this.b;
    }

    public final void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cf8d06", new Object[]{this});
        } else if (this.q == null) {
            this.q = new ComponentCallbacksC0693o();
            J().registerComponentCallbacks(this.q);
        }
    }

    public JSONObject T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("faa03dde", new Object[]{this});
        }
        return this.u;
    }

    public double U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13a8ecf9", new Object[]{this})).doubleValue();
        }
        if (P() == null) {
            return 1.0d;
        }
        le8 P2 = P();
        if (!P2.b()) {
            return 1.0d;
        }
        if (P2.a() != 1.0d) {
            return P2.a();
        }
        return od0.D().A().b(M());
    }

    public void U0(com.taobao.tao.flexbox.layoutmanager.core.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4b08", new Object[]{this, jVar});
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (!this.f.contains(jVar)) {
            this.f.add(jVar);
        }
    }

    public yx9 V(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yx9) ipChange.ipc$dispatch("82d4e398", new Object[]{this, activity});
        }
        if (this.y == null && activity != null) {
            this.y = new yx9(activity);
        }
        return this.y;
    }

    public void V0(com.taobao.tao.flexbox.layoutmanager.core.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b9d7d2", new Object[]{this, jVar});
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (!this.g.contains(jVar)) {
            this.g.add(jVar);
        }
    }

    public Object W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d73a922d", new Object[]{this});
        }
        return this.r;
    }

    public final void W0(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7873b8d", new Object[]{this, yVar});
        } else if (this.c == null && od0.D().t() != null) {
            this.c = od0.D().t().b(this);
            od0.D().t().c(this.c);
        }
    }

    public Handler X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ba2a7354", new Object[]{this});
        }
        return this.s.b.c();
    }

    public void X0(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f3d663", new Object[]{this, str, num});
            return;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, num);
    }

    public t Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("86dd94eb", new Object[]{this});
        }
        return this.h;
    }

    public String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.t;
    }

    public final void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("affb6c89", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.j;
        if (nVar != null && nVar.w0() != null && !this.j.z0()) {
            if ((W() instanceof zcr) || (W() instanceof anl)) {
                this.F = this.j.c0().y;
                F(false);
                e1();
                ((ArrayList) this.k).clear();
                this.j = null;
                this.E = true;
            }
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.n a0(int i2) {
        com.taobao.tao.flexbox.layoutmanager.core.n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("2a2ff1e6", new Object[]{this, new Integer(i2)});
        }
        synchronized (this.i) {
            nVar = this.i.get(i2);
        }
        return nVar;
    }

    public void a1(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fe71b2", new Object[]{this, nVar});
            return;
        }
        if (this.j.w0() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        y c0 = nVar.c0();
        com.taobao.tao.flexbox.layoutmanager.core.f.r(c0);
        F(false);
        e1();
        gol.l(c0.d);
        y c02 = this.j.c0();
        this.l = new com.taobao.tao.flexbox.layoutmanager.ac.d(this);
        y.a aVar = c02.y;
        y.a.c(aVar, this.j.N());
        if (z2) {
            g1(aVar.d(), true, this.w);
        } else {
            g1(aVar.d(), false, this.w);
        }
    }

    public int b0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f92d9b6b", new Object[]{this, str})).intValue();
        }
        Map<String, Integer> map = this.d;
        if (map == null || !((HashMap) map).containsKey(str)) {
            return 0;
        }
        return ((Integer) ((HashMap) this.d).get(str)).intValue();
    }

    public List<com.taobao.tao.flexbox.layoutmanager.core.n> c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5edb8bff", new Object[]{this});
        }
        return this.k;
    }

    public void c1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cabe76", new Object[]{this, new Integer(i2)});
            return;
        }
        synchronized (this.i) {
            this.i.remove(i2);
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.n d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("d6e63de1", new Object[]{this});
        }
        return this.j;
    }

    public void d1(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f0ab1c", new Object[]{this, nVar});
        } else {
            ((ArrayList) this.k).remove(nVar);
        }
    }

    public ShareElementAnimationController e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareElementAnimationController) ipChange.ipc$dispatch("a6ab2c60", new Object[]{this});
        }
        return this.B;
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee5df90", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.k).iterator();
        while (it.hasNext()) {
            com.taobao.tao.flexbox.layoutmanager.core.n nVar = (com.taobao.tao.flexbox.layoutmanager.core.n) it.next();
            nVar.s = false;
            nVar.p();
        }
    }

    public Object f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return null;
    }

    public void f1(y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f00a97", new Object[]{this, yVar, wVar});
        } else {
            g1(yVar, false, wVar);
        }
    }

    public Object g0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efd71630", new Object[]{this, new Integer(i2)});
        }
        SparseArray<Object> sparseArray = this.z;
        if (sparseArray != null) {
            return sparseArray.get(i2);
        }
        return null;
    }

    public final void g1(y yVar, boolean z2, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cb057f", new Object[]{this, yVar, new Boolean(z2), wVar});
        } else if (!yVar.x) {
            tfs.f("renderContext invalid, url: " + y.k(yVar) + " renderUrl:" + yVar.d);
            if (wVar != null) {
                wVar.b(null);
            }
        } else {
            tfs.f("start render, " + yVar);
            if (z2) {
                O0(yVar, wVar);
            } else {
                v0(yVar, wVar);
            }
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.i h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.i) ipChange.ipc$dispatch("e6171ebe", new Object[]{this});
        }
        return this.A;
    }

    public final com.taobao.tao.flexbox.layoutmanager.core.n h1(com.taobao.tao.flexbox.layoutmanager.core.n nVar, y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("c84d833c", new Object[]{this, nVar, yVar, wVar});
        }
        nVar.f(this);
        H1(nVar);
        y yVar2 = nVar.f12238a;
        yVar2.f12269a = yVar.f12269a;
        yVar2.j = yVar.j;
        yVar2.o = 0;
        x1(yVar2, true);
        y.h(nVar.f12238a, y.g(yVar));
        y.j(nVar.f12238a, y.i(yVar));
        C(nVar, yVar.d, y.f(yVar), wVar, false);
        return nVar;
    }

    public g2e i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("2eb6f185", new Object[]{this});
        }
        return this.J;
    }

    public final void j0(long j2, y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49503f71", new Object[]{this, new Long(j2), yVar, wVar});
            return;
        }
        f21.g(yVar, f21.TASK_DSL_LOAD);
        igs.a("loadDSL");
        com.taobao.tao.flexbox.layoutmanager.core.f.l(this, yVar, new a(yVar, wVar, j2));
        igs.c();
    }

    public final boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("116c7db3", new Object[]{this})).booleanValue();
        }
        if (!this.E) {
            return false;
        }
        this.l = new com.taobao.tao.flexbox.layoutmanager.ac.d(this);
        y.a aVar = this.F;
        y.a.c(aVar, this.p);
        g1(aVar.d(), false, this.w);
        this.E = false;
        return true;
    }

    public final boolean k0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("826dcb9", new Object[]{this, str})).booleanValue();
        }
        String g2 = PreloadDelegate.g(str);
        if (TextUtils.isEmpty(g2)) {
            return false;
        }
        synchronized (this.L) {
            try {
                Integer num = this.L.get(g2);
                if (num == null || num.intValue() != 1) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k1(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46578b02", new Object[]{this, runnable});
            return;
        }
        G();
        p.d dVar = this.s.b;
        if (dVar != null) {
            dVar.e(runnable);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c56baf9", new Object[]{this});
            return;
        }
        igs.a("init Engine");
        if (this.p == null) {
            this.p = J();
        }
        o0(this.p);
        ig8.g(this.p);
        hc8.h(this.p);
        mx7.g(this.p);
        R0();
        fhb f2 = od0.D().f();
        if (f2 != null) {
            this.v.d(f2, this);
        }
        igs.c();
    }

    public void l1(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c39237d", new Object[]{this, runnable});
            return;
        }
        G();
        this.s.f12272a.e(runnable);
    }

    public void n1(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fa7b5b", new Object[]{this, runnable});
        } else {
            nwv.z0(new h(new g(this, runnable)), true);
        }
    }

    public void o1(int i2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str, String str2, Map map, hk8 hk8Var) {
        com.taobao.tao.flexbox.layoutmanager.core.j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887c35f2", new Object[]{this, new Integer(i2), nVar, str, str2, map, hk8Var});
        } else if (nVar != null) {
            try {
                try {
                    igs.a(str != null ? str : "sendMessage");
                    n.g e2 = n.g.e(nVar, nVar, str, map, i2, hk8Var);
                    nVar.R0(e2);
                    boolean t2 = nVar.t(e2);
                    nVar.Q0(e2);
                    if (!t2 && (jVar = (com.taobao.tao.flexbox.layoutmanager.core.j) nVar.h0().m0(202)) != null) {
                        jVar.onHandleMessage(e2);
                    }
                    e2.f();
                } catch (Exception e3) {
                    tfs.d("sendMessage, name:" + str + "  msg:" + e3.getMessage());
                }
                igs.c();
            } catch (Throwable th) {
                igs.c();
                throw th;
            }
        }
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ab0468", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("872135fd", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    @Deprecated
    public void r1(com.taobao.tao.flexbox.layoutmanager.ac.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a26946", new Object[]{this, dVar});
        } else {
            this.l = dVar;
        }
    }

    public boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f02c4bff", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public void s1(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b13242", new Object[]{this, tNodeView});
        } else if (!akt.p2("fixEngineContainerView", true)) {
            this.x = tNodeView;
        } else if (this.x == null) {
            this.x = tNodeView;
        }
    }

    public boolean t0(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70087679", new Object[]{this, yVar})).booleanValue();
        }
        return k0(y.k(yVar));
    }

    public boolean u0() {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22e1042f", new Object[]{this})).booleanValue();
        }
        if (!nwv.N(this.p) || akt.m2()) {
            return false;
        }
        if (this.m == null) {
            if (nwv.h(M()) && akt.P1()) {
                z2 = true;
            }
            this.m = Boolean.valueOf(z2);
        }
        return this.m.booleanValue();
    }

    public void u1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcae8a4d", new Object[]{this, obj});
        } else if (this.r == null) {
            this.r = obj;
        }
    }

    public void v1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else if (this.t == null) {
            this.t = str;
        }
    }

    public final Object w0(y yVar, f.h hVar) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c16a3153", new Object[]{this, yVar, hVar});
        }
        if (y.f(yVar) != null) {
            map = y.f(yVar);
        } else if (!TextUtils.isEmpty(yVar.i)) {
            Object c2 = ggs.c(yVar.i);
            if (c2 instanceof JSONObject) {
                map = (JSONObject) c2;
            } else {
                if (c2 instanceof String) {
                    try {
                        map = JSON.parseObject((String) c2);
                    } catch (Exception unused) {
                        tfs.d("initData is invalid json" + c2);
                    }
                }
                map = null;
            }
        } else {
            map = hVar.h;
            if (map != null) {
                if ((map instanceof Map) && !(map instanceof JSONObject)) {
                    map = new JSONObject(map);
                }
            }
            map = null;
        }
        if (map == null) {
            map = new JSONObject();
        }
        TNodeView tNodeView = this.x;
        if (tNodeView != null) {
            tNodeView.getRenderIntercept().j(M(), this.r, map, yVar.r());
        }
        return map;
    }

    public final void w1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e865d286", new Object[]{this, str});
            return;
        }
        String g2 = PreloadDelegate.g(str);
        if (!TextUtils.isEmpty(g2)) {
            synchronized (this.L) {
                this.L.put(g2, 2);
            }
        }
    }

    public final void x0(String str, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24807646", new Object[]{this, str, nVar});
            return;
        }
        String g2 = PreloadDelegate.g(str);
        if (!TextUtils.isEmpty(g2)) {
            synchronized (this.L) {
                try {
                    PreloadDelegate.c cVar = (PreloadDelegate.c) ((HashMap) this.M).get(g2);
                    if (cVar == null) {
                        cVar = new PreloadDelegate.c();
                        ((HashMap) this.M).put(g2, cVar);
                    }
                    cVar.d(true);
                    if (cVar.a() == null) {
                        cVar.f(nVar);
                    } else if (nVar == null) {
                        cVar.a().b();
                    } else {
                        cVar.a().a(nVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void x1(y yVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fda40c7", new Object[]{this, yVar, new Boolean(z2)});
        } else if (yVar != null) {
            Map map = yVar.j;
            if (map == null) {
                map = new HashMap();
                yVar.j = map;
            }
            map.put("preload", Boolean.valueOf(z2));
        }
    }

    public final void y0() {
        TabBarControllerComponent tabBarControllerComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6432eea", new Object[]{this});
            return;
        }
        try {
            com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.j;
            if (nVar != null && (tabBarControllerComponent = (TabBarControllerComponent) nVar.v(TabBarControllerComponent.class)) != null) {
                tabBarControllerComponent.i0();
            }
        } catch (Exception unused) {
        }
    }

    public void y1(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0ccdaa", new Object[]{this, new Integer(i2), obj});
            return;
        }
        if (this.z == null) {
            this.z = new SparseArray<>();
        }
        this.z.put(i2, obj);
    }

    public void z(d.j jVar, String str, long j2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, String str2, Object obj, Object obj2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47141e9c", new Object[]{this, jVar, str, new Long(j2), nVar, str2, obj, obj2, new Boolean(z2)});
        } else {
            A(jVar, str, j2, nVar, str2, obj, null, obj2, z2);
        }
    }

    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef00ad3", new Object[]{this});
        } else {
            this.B.l();
        }
    }

    public final void z1(y yVar, long j2, com.taobao.tao.flexbox.layoutmanager.core.n nVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8b777", new Object[]{this, yVar, new Long(j2), nVar, new Boolean(z2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", yVar.d);
        Map map = yVar.j;
        Object obj = null;
        hashMap.put("pageURL", map != null ? map.get("url") : null);
        Map map2 = yVar.j;
        if (map2 != null) {
            obj = map2.get("pageName");
        }
        hashMap.put("pageName", obj);
        if (z2) {
            com.taobao.tao.flexbox.layoutmanager.core.l.m(this, nVar, System.nanoTime() - j2, 3, hashMap);
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.l.m(this, null, System.nanoTime() - j2, 2, hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n f12253a;
        public final /* synthetic */ w b;
        public final /* synthetic */ y c;
        public final /* synthetic */ Object d;

        public d(com.taobao.tao.flexbox.layoutmanager.core.n nVar, w wVar, y yVar, Object obj) {
            this.f12253a = nVar;
            this.b = wVar;
            this.c = yVar;
            this.d = obj;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1370bd15", new Object[]{this});
                return;
            }
            o.o(o.this, this.f12253a);
            w wVar = this.b;
            if (wVar instanceof v) {
                ((v) wVar).a(this.f12253a);
            }
            if (!sz3.a(o.p())) {
                for (q qVar : o.p()) {
                    qVar.a(o.this, this.c);
                }
            }
            f21.m(this.c, f21.TASK_DSL_RENDER, null);
            if (this.f12253a.H("onready") != null) {
                o.this.o1(34, this.f12253a, "onready", null, null, null);
            }
            if (o.this.t0(this.c)) {
                y yVar = this.c;
                if (!yVar.r) {
                    o.r(o.this, this.f12253a, yVar.d, this.d, this.b, false);
                    return;
                }
            }
            o.s(o.this, null, null, 0L, this.f12253a, this.c.d, this.d, this.b, null, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class s implements w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final y f12266a;
        public final long b;
        public final w c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n f12267a;

            public a(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
                this.f12267a = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                s sVar = s.this;
                o.h(o.this, s.c(sVar), this.f12267a);
                o.j(o.this, this.f12267a);
                y.b(s.c(s.this), null);
                s sVar2 = s.this;
                o.k(o.this, s.c(sVar2), this.f12267a);
            }
        }

        static {
            t2o.a(503317153);
            t2o.a(503317157);
        }

        public s(y yVar, long j, w wVar) {
            this.f12266a = yVar;
            this.b = j;
            this.c = wVar;
        }

        public static /* synthetic */ y c(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y) ipChange.ipc$dispatch("ca00754a", new Object[]{sVar});
            }
            return sVar.f12266a;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.o.w
        public void b(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d402dbd", new Object[]{this, nVar});
                return;
            }
            StringBuilder sb = new StringBuilder("render complete from layout render,result is ");
            sb.append(nVar != null);
            tfs.f(sb.toString());
            w wVar = this.c;
            if (wVar != null) {
                wVar.b(nVar);
            }
            if (nVar != null) {
                if (!o.i(o.this).contains(nVar)) {
                    o.i(o.this).add(nVar);
                }
                if (nVar.w0() != null) {
                    o.a(o.this, this.f12266a, this.b, nVar, true);
                    if (akt.V0() && o.this.L() != null && !o.this.L().isContainerResumed() && o.this.L().getRenderIntercept().c()) {
                        z = false;
                    }
                    if (akt.e0() && (nVar.l0() instanceof a5k)) {
                        z &= nwv.Y(((Component) nVar.l0()).getNode());
                    }
                    if (z) {
                        nwv.z0(new a(nVar), akt.p2("syncSendPageAppear", false));
                    }
                    o oVar = o.this;
                    if (oVar.p instanceof Activity) {
                        o.t(oVar).showTool(o.l(o.this).A());
                    }
                }
                if (o.w(o.this) == nVar) {
                    o.e(o.this, this.c);
                }
                o.g(o.this, nVar);
                return;
            }
            o.a(o.this, this.f12266a, this.b, null, false);
            if (o.w(o.this) != null) {
                return;
            }
            if (o.this.W() instanceof anl) {
                ((anl) o.this.W()).startPostponedEnterTransition(null);
                return;
            }
            Context context = o.this.p;
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                ((Activity) o.this.p).startPostponedEnterTransition();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class u implements v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final y f12268a;
        public final long b;
        public final w c;

        static {
            t2o.a(503317156);
            t2o.a(503317158);
        }

        public u(y yVar, long j, w wVar) {
            this.f12268a = yVar;
            this.b = j;
            this.c = wVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.o.v
        public void a(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16a2266", new Object[]{this, nVar});
                return;
            }
            w wVar = this.c;
            if (wVar instanceof v) {
                ((v) wVar).a(nVar);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.o.w
        public void b(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d402dbd", new Object[]{this, nVar});
                return;
            }
            StringBuilder sb = new StringBuilder("render complete from preload render,result is ");
            if (nVar == null) {
                z = false;
            }
            sb.append(z);
            tfs.f(sb.toString());
            w wVar = this.c;
            if (wVar != null) {
                wVar.b(nVar);
            }
            if (nVar != null) {
                if (!o.i(o.this).contains(nVar)) {
                    o.i(o.this).add(nVar);
                }
                if (o.w(o.this) == nVar) {
                    o.e(o.this, this.c);
                }
                o.f(o.this, y.k(this.f12268a), nVar);
                o.g(o.this, nVar);
                return;
            }
            o.f(o.this, y.k(this.f12268a), null);
            o.a(o.this, this.f12268a, this.b, null, false);
        }
    }

    public o(Context context) {
        HashMap<String, Class> hashMap = new HashMap<>();
        this.e = hashMap;
        this.i = new SparseArray<>();
        this.k = new ArrayList();
        this.n = false;
        this.o = false;
        this.v = new le8();
        this.A = new i.a();
        this.H = new bb4();
        this.I = new Handler(Looper.getMainLooper());
        this.J = qau.p();
        this.K = new i();
        this.L = new HashMap<>();
        this.M = new HashMap();
        this.p = context;
        this.b = "TNodeEngine-" + N.getAndIncrement();
        if (!akt.i2()) {
            this.h = new com.taobao.tao.flexbox.layoutmanager.core.k();
        }
        U0(new com.taobao.tao.flexbox.layoutmanager.core.m());
        V0(new com.taobao.tao.flexbox.layoutmanager.core.a(this));
        zh9.c(hashMap);
        this.l = new com.taobao.tao.flexbox.layoutmanager.ac.d(this);
        tfs.f("init engine at tnode engine constructor");
        l0();
        this.l.x();
        this.B = new ShareElementAnimationController(this);
        ((ArrayList) Q).add(this);
        m0();
    }

    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2372e0f1", new Object[]{this})).booleanValue();
        }
        try {
            tfs.f("onBack");
            HashMap hashMap = new HashMap();
            o1(130, this.j, "onbackclick", null, hashMap, null);
            return nwv.o(hashMap.get("handled"), false);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void O0(y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99e9b80", new Object[]{this, yVar, wVar});
            return;
        }
        igs.a("preload render");
        boolean B1 = B1(y.k(yVar));
        tfs.f("in preloadRender render. whether continue: " + B1);
        if (B1) {
            this.p = yVar.f12269a;
            yVar.m = this;
            x1(yVar, true);
            long nanoTime = System.nanoTime();
            j0(nanoTime, yVar, new u(yVar, nanoTime, wVar));
        }
        igs.c();
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f7b40e", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.l.g(false, "type", "ToolManager");
        zk9.b("com.taobao.tao.flexbox.layoutmanager.tool.ToolManager", new j());
    }

    public final void q1(y yVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65b6fe4", new Object[]{this, yVar, nVar});
        } else if (yVar.w && this.j == nVar && (W() instanceof Fragment)) {
            try {
                Bundle arguments = ((Fragment) W()).getArguments();
                if (arguments != null && arguments.containsKey("disappear_flag")) {
                    z2 = arguments.getBoolean("disappear_flag");
                }
                if (z2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("sourcePage", "page");
                    hashMap.put("type", "page");
                    if (akt.V0()) {
                        o1(130, nVar, "onpagedisappear", null, hashMap, null);
                        o1(130, nVar, "onstop", null, hashMap, null);
                        return;
                    }
                    M0(130, nVar, "onpagedisappear", null, hashMap, null);
                    M0(130, nVar, "onstop", null, hashMap, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void D0() {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        tfs.f("onDestroy");
        if (!this.n && !this.o) {
            if (akt.i0()) {
                this.o = true;
            }
            com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.j;
            if (nVar != null) {
                this.o = true;
                if (nVar.H("ondestroy") != null) {
                    z2 = true;
                }
                try {
                    o1(Component.MSG_FLAG_DISAPPEAR, this.j, "ondestroy", null, null, null);
                } catch (Exception unused) {
                }
            }
            nwv.A0(new m(), z2 ? 2000L : 0L);
        }
    }

    public final void F(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0cf39e", new Object[]{this, new Boolean(z2)});
            return;
        }
        tfs.f("doDestroy, fullDestroy:" + z2);
        if (z2) {
            J0();
            if (this.D != null) {
                vfs.g().l("weitao_switch", com.taobao.tao.flexbox.layoutmanager.core.f.BAD_DSL, this.D);
                this.D = null;
            }
            E1();
            this.A.destroy();
            if (!(W() instanceof anl)) {
                ut2.r(this.p);
            }
            D1();
            if (od0.D().j() != null) {
                od0.D().j().b(this);
            }
            com.taobao.tao.flexbox.layoutmanager.ac.c.a(this);
            com.taobao.tao.flexbox.layoutmanager.component.g.n(this);
            b1(this);
        }
        E();
        if (z2) {
            PreloadDelegate.n(this);
        }
        y0();
        this.l.I();
        this.l.j();
        if (z2) {
            this.n = true;
            this.o = false;
            if (this.s != null) {
                com.taobao.tao.flexbox.layoutmanager.core.p.f().l(this.s);
            }
        }
        if (!sz3.a(null)) {
            throw null;
        }
    }

    public void H0(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3748823f", new Object[]{this, nVar});
        } else if (!j1()) {
            try {
                HashMap hashMap = new HashMap();
                if (TabBarControllerComponent.u) {
                    hashMap.put("source", 1);
                } else {
                    hashMap.put("source", 2);
                }
                hashMap.put("sourcePage", "page");
                hashMap.put("type", "page");
                if (nVar != null) {
                    if (nVar.w0() != null || !akt.W(nVar.c0())) {
                        tfs.f("onResume, send page appear");
                        o1(130, nVar, "onpageappear", null, hashMap, null);
                    } else {
                        tfs.f("ignore pageappear for view is null");
                        try {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("name", nVar.c0().d);
                            com.taobao.tao.flexbox.layoutmanager.core.l.p(this, "InCorrectPageAppear", hashMap2);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            if (!(nVar == null || od0.D().j() == null)) {
                od0.D().j().f(this);
            }
            this.A.onResume();
        }
    }

    public final void v0(y yVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3230161", new Object[]{this, yVar, wVar});
            return;
        }
        igs.a("layout render");
        tfs.f("start layoutRender");
        yx9 yx9Var = this.y;
        if (yx9Var != null) {
            yx9Var.k();
        }
        W0(yVar);
        long nanoTime = System.nanoTime();
        s sVar = new s(yVar, nanoTime, wVar);
        this.p = yVar.f12269a;
        yVar.m = this;
        PreloadDelegate.PreloadHitResult C1 = C1(y.k(yVar), new b(yVar, sVar));
        if (C1 == PreloadDelegate.PreloadHitResult.REUSE || C1 == PreloadDelegate.PreloadHitResult.WAIT) {
            com.taobao.tao.flexbox.layoutmanager.core.l.o(this, true, yVar.d, "tnode");
            yVar.q = com.taobao.tao.flexbox.layoutmanager.core.f.DSL_TYPE_REUSE;
        }
        tfs.f("in layout render.preload hit result is " + C1.getTip());
        if (C1 == PreloadDelegate.PreloadHitResult.NONE) {
            x1(yVar, false);
            j0(nanoTime, yVar, sVar);
        }
        igs.c();
    }

    public final void n0(y yVar, Map map, z zVar) {
        Map map2;
        String str;
        String str2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed74488", new Object[]{this, yVar, map, zVar});
            return;
        }
        Map map3 = (Map) map.get(".");
        if (map3 != null) {
            Map map4 = (Map) map3.get("ac");
            if (map4 != null) {
                String str3 = (String) map4.get("code");
                String str4 = (String) map4.get("name");
                String str5 = (String) map3.get(pg1.ATOM_debugger);
                if (!this.l.A()) {
                    if (str5 != null && (nwv.R(J()) || akt.q2("enableTNodeDebug"))) {
                        this.l.H(str4, str5);
                    }
                    this.l.D(str4, str3);
                }
            }
            yVar.j.put("md5", (String) map3.get("md5"));
            if (LogContext.RELEASETYPE_DEV.equals(map3.get("mode"))) {
                this.A.setEnableDebugTool(true);
            }
            nwv.t(map3.get("version"), 2);
            List v2 = nwv.v(map3.get("register"), null);
            boolean[] zArr = {false};
            if (v2 != null && !v2.isEmpty()) {
                boolean z3 = false;
                for (int i2 = 0; i2 < v2.size(); i2++) {
                    Object obj = v2.get(i2);
                    if (obj instanceof f.h) {
                        f.h hVar = (f.h) obj;
                        map2 = hVar.b;
                        str = hVar.f12215a;
                    } else if (obj instanceof Map) {
                        Map map5 = (Map) obj;
                        map2 = nwv.z(map5.get("attrs"), null);
                        str = nwv.I(map5.get("type"), null);
                    } else {
                        str = null;
                        map2 = null;
                    }
                    if (map2 != null && (((str2 = (String) map2.get("platform")) == null || str2.equals("android")) && "register".equals(str))) {
                        String[] o0 = nwv.o0((String) map2.get("value"));
                        nwv.c0(o0[0], o0[1], new l(zArr, zVar));
                        z3 = true;
                    }
                }
                z2 = z3;
            }
        }
        if (!z2) {
            ((d) zVar).a();
        }
    }

    public final void p1(y yVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abae8b64", new Object[]{this, yVar, nVar});
            return;
        }
        boolean z2 = yVar.w;
        if ((nVar.l0() instanceof a5k) && akt.p2("checkNodeAppearState", true)) {
            z2 = ((a5k) nVar.l0()).getNode().z0();
        }
        if (z2) {
            if (y.a(yVar) == null) {
                y.b(yVar, new HashMap());
            }
            if (TabBarControllerComponent.u) {
                y.a(yVar).put("source", 1);
            } else {
                y.a(yVar).put("source", 2);
            }
            y.a(yVar).put("sourcePage", "page");
            y.a(yVar).put("type", "page");
            o1(130, nVar, "onstart", null, y.a(yVar), null);
            o1(130, nVar, "onpageappear", null, y.a(yVar), null);
        }
    }

    public void Q0(com.taobao.tao.flexbox.layoutmanager.core.n nVar, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1839fc6", new Object[]{this, nVar, new Integer(i2), new Integer(i3)});
        } else if (nVar != null && nVar.Y() == null && i2 > 0 && i3 > 0) {
            if (!nwv.o(nVar.m0(200), false)) {
                tfs.f("refreshLayout node:" + nVar + " width:" + i2 + " height:" + i3);
                nVar.w1(200, Boolean.TRUE);
                F1();
                G();
                p pVar = new p(null, "forceRefreshLayout", System.currentTimeMillis(), this, nVar.c0().d, nVar, nVar.t0(), new f(nVar), null, true);
                pVar.f12265a = i2;
                pVar.b = i3;
                this.s.f12272a.m(pVar);
                return;
            }
            nVar.w1(201, new int[]{i2, i3});
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.n i1(y yVar, Map map, w wVar) {
        Exception e2;
        String str;
        f.h hVar;
        Object w0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("51f845f5", new Object[]{this, yVar, map, wVar});
        }
        f21.g(yVar, f21.TASK_DSL_RENDER);
        igs.a("renderInternal");
        if (this.u == null) {
            this.u = ig8.d(this.p);
        }
        y.c(yVar, map);
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = null;
        try {
            if (y.d(yVar) == null) {
                str = "main";
            } else {
                str = y.d(yVar);
            }
            hVar = (f.h) map.get(str);
            w0 = w0(yVar, hVar);
            try {
                nVar = null;
            } catch (Exception e3) {
                e2 = e3;
                nVar = null;
            }
        } catch (Exception e4) {
            e2 = e4;
        }
        try {
            com.taobao.tao.flexbox.layoutmanager.core.n nVar2 = new com.taobao.tao.flexbox.layoutmanager.core.n(yVar, new com.taobao.tao.flexbox.layoutmanager.core.r(this, map, hVar, hVar, w0, yVar.j, null, null, null, null, new r.c("", -1)), null);
            y.e(yVar, nVar2);
            n0(yVar, map, new d(nVar2, wVar, yVar, w0));
            if (yVar.m.u0() && !this.G && nwv.N(this.p)) {
                this.G = true;
                nwv.A0(new e(), 500L);
            }
            igs.c();
            return nVar2;
        } catch (Exception e5) {
            e2 = e5;
            igs.c();
            e2.printStackTrace();
            if (wVar != null) {
                wVar.b(nVar);
            }
            return nVar;
        }
    }
}
