package tb;

import android.app.Application;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.manager.TMSInstanceManager;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dbs INSTANCE = new dbs();
    public static final int b = q9s.k4();
    public static final long c = q9s.j4();

    /* renamed from: a  reason: collision with root package name */
    public static final ReentrantLock f17714a = new ReentrantLock();
    public static final CopyOnWriteArrayList<b> d = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17717a;

        public d(b bVar) {
            this.f17717a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (dbs.a().contains(this.f17717a)) {
                dbs.a().remove(this.f17717a);
                this.f17717a.b().destroy();
            }
        }
    }

    static {
        t2o.a(839909912);
    }

    public static final /* synthetic */ CopyOnWriteArrayList a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("4161bdff", new Object[0]);
        }
        return d;
    }

    @JvmStatic
    public static final void d(bbs bbsVar) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c674c6dc", new Object[]{bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        try {
            f17714a.lock();
            Iterator<b> it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (ckf.b(bVar.b().g, bbsVar.g)) {
                    break;
                }
            }
            b bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.f(true);
            }
        } finally {
            f17714a.unlock();
        }
    }

    /* compiled from: Taobao */
    @JvmInline
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public static final String f17716a = g("success");
        public static final String b = g("预渲染解决方案类型不支持");
        public static final String c = g("预渲染Url不在白名单内");
        public static final String d = g("预渲染池子已满");
        public static final String e = g("预渲染实例已存在");
        public static final String f = g("预渲染实例创建失败");

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(839909915);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final String a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("b5d49a70", new Object[]{this});
                }
                return c.a();
            }

            public final String b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("1644b758", new Object[]{this});
                }
                return c.b();
            }

            public final String c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("2b6c84d", new Object[]{this});
                }
                return c.c();
            }

            public final String d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("1d12e9bb", new Object[]{this});
                }
                return c.d();
            }

            public final String e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("cb9b68d2", new Object[]{this});
                }
                return c.e();
            }

            public final String f() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("522e5aa5", new Object[]{this});
                }
                return c.f();
            }

            public a() {
            }
        }

        public static final /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("41fc1d6a", new Object[0]);
            }
            return f;
        }

        public static final /* synthetic */ String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9a7b2902", new Object[0]);
            }
            return e;
        }

        public static final /* synthetic */ String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d362d96d", new Object[0]);
            }
            return d;
        }

        public static final /* synthetic */ String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d208b3f", new Object[0]);
            }
            return b;
        }

        public static final /* synthetic */ String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2b3d99c8", new Object[0]);
            }
            return c;
        }

        public static final /* synthetic */ String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3da7015", new Object[0]);
            }
            return f17716a;
        }

        public static String g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("327656bc", new Object[]{str});
            }
            ckf.g(str, "errorMsg");
            return str;
        }

        public static final boolean h(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b26382a1", new Object[]{str, str2})).booleanValue();
            }
            return ckf.b(str, str2);
        }

        static {
            t2o.a(839909914);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x012b A[SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.bbs b(android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dbs.b(android.net.Uri):tb.bbs");
    }

    @JvmStatic
    public static final String c(Application application, String str, TMSSolutionType tMSSolutionType, Map<String, ? extends Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c394921e", new Object[]{application, str, tMSSolutionType, map, new Boolean(z)});
        }
        ckf.g(application, "application");
        ckf.g(str, "url");
        ckf.g(tMSSolutionType, "solutionType");
        if (tMSSolutionType != TMSSolutionType.WEEX) {
            TMSLogger.b("TMSInstancePreRenderPool", "TMSInstancePreRenderPool only support WEEX solutionType");
            return c.Companion.d();
        }
        Uri g = ies.g(str);
        try {
            JSONArray<Object> parseArray = JSON.parseArray(q9s.i4());
            ckf.f(parseArray, KeepModel.STRATEGY_WHITE_LIST);
            if (!parseArray.isEmpty()) {
                for (Object obj : parseArray) {
                    Uri g2 = ies.g(obj.toString());
                    if (g2 != null && ckf.b(g2.getScheme(), g.getScheme()) && ckf.b(g2.getHost(), g.getHost())) {
                        try {
                            if (ckf.b(g2.getPath(), g.getPath())) {
                                ReentrantLock reentrantLock = f17714a;
                                reentrantLock.lock();
                                CopyOnWriteArrayList<b> copyOnWriteArrayList = d;
                                if (copyOnWriteArrayList.size() >= b) {
                                    TMSLogger.b("TMSInstancePreRenderPool", "TMSInstancePreRenderPool is full");
                                    String c2 = c.Companion.c();
                                    reentrantLock.unlock();
                                    return c2;
                                }
                                Iterator<b> it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    if (ckf.b(it.next().d(), str)) {
                                        TMSLogger.b("TMSInstancePreRenderPool", ckf.p("TMSInstancePreRenderPool is already exist: ", str));
                                        return c.Companion.b();
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                Boolean bool = Boolean.TRUE;
                                jSONObject.put((JSONObject) "is_tms_launcher_ng", (String) bool);
                                jSONObject.put((JSONObject) "is_tms_instance_prerender", (String) bool);
                                xhv xhvVar = xhv.INSTANCE;
                                bbs c3 = TMSInstanceManager.c(application, g, null, jSONObject, 4, null);
                                b bVar = new b(str, c3, map, z, false, 16, null);
                                c3.k0(new kly());
                                c3.A0(TMSSolutionType.WEEX);
                                d.add(bVar);
                                CommonExtKt.b().postDelayed(new d(bVar), c);
                                return c.Companion.f();
                            }
                        } catch (Exception e) {
                            TMSLogger.b("TMSInstancePreRenderPool", ckf.p("TMSInstancePreRenderPool create error: ", e));
                            return c.Companion.a();
                        } finally {
                            f17714a.unlock();
                        }
                    }
                }
            }
            return c.Companion.e();
        } catch (Exception e2) {
            TMSLogger.b("TMSInstancePreRenderPool", ckf.p("TMSInstancePreRenderPool parse url error: ", e2));
            return c.Companion.e();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17715a;
        public final bbs b;
        public final Map<String, Object> c;
        public final boolean d;
        public boolean e;

        static {
            t2o.a(839909913);
        }

        public b(String str, bbs bbsVar, Map<String, ? extends Object> map, boolean z, boolean z2) {
            ckf.g(str, TBImageFlowMonitor.ERROR_ORIGIN_URL);
            ckf.g(bbsVar, "instance");
            this.f17715a = str;
            this.b = bbsVar;
            this.c = map;
            this.d = z;
            this.e = z2;
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4d0e6894", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public final bbs b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
            }
            return this.b;
        }

        public final Map<String, Object> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("20efd75", new Object[]{this});
            }
            return this.c;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bbd726", new Object[]{this});
            }
            return this.f17715a;
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f64353e6", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public final void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24d20eb8", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public /* synthetic */ b(String str, bbs bbsVar, Map map, boolean z, boolean z2, int i, a07 a07Var) {
            this(str, bbsVar, (i & 4) != 0 ? null : map, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
