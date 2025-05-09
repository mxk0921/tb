package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.base.IDressUpAnimHelper;
import com.taobao.android.dressup.base.IDressUpMtopRequest;
import tb.tpu;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_TURBOFLOW_DRESSUP_REMOTE = "turboflow_dressup_remote";

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f22299a;
    public static final a Companion = new a(null);
    public static final String b = "com.taobao.android.dressup.flexaremote.feeds.DressUpFeedServiceRegistry";
    public static final String c = "com.taobao.android.dressup.feeds.DressUpFeedServiceRegistry";
    public static final String d = "com.taobao.android.dressup.flexaremote.detail.DressUpDetailServiceRegistry";
    public static final String e = "com.taobao.android.dressup.detail.DressUpDetailServiceRegistry";
    public static final String f = "com.taobao.android.dressup.flexaremote.common.service.dresslist.DressListService";
    public static final String g = "com.taobao.android.dressup.common.service.dresslist.DressListService";
    public static final String h = "com.taobao.android.dressup.flexaremote.common.prefetch.DressUpMtopRequest";
    public static final String i = "com.taobao.android.dressup.common.prefetch.DressUpMtopRequest";
    public static final String j = "com.taobao.android.dressup.flexaremote.common.anim.impl.DressUpAnimHelperImpl";
    public static final String k = "com.taobao.android.dressup.common.anim.impl.DressUpAnimHelperImpl";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.jz7$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class C0958a implements zk9.i {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ zk9.i f22300a;

            public C0958a(zk9.i iVar) {
                this.f22300a = iVar;
            }

            @Override // tb.zk9.i
            public void onClassLoaded(Class<?> cls) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    return;
                }
                tpu.Companion.a("DressUpBundleLoader", "loadRemoteDressupBundle success", null);
                a.a(jz7.Companion, true);
                zk9.i iVar = this.f22300a;
                if (iVar != null) {
                    iVar.onClassLoaded(cls);
                }
            }

            @Override // tb.zk9.i
            public void onClassNotFound() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    return;
                }
                tpu.Companion.a("DressUpBundleLoader", "loadRemoteDressupBundle fail", null);
                a.a(jz7.Companion, false);
                zk9.i iVar = this.f22300a;
                if (iVar != null) {
                    iVar.onClassNotFound();
                }
            }
        }

        static {
            t2o.a(918552585);
        }

        public a() {
        }

        public static final /* synthetic */ void a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("692de12c", new Object[]{aVar, new Boolean(z)});
            } else {
                aVar.l(z);
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2cbc7836", new Object[]{this})).booleanValue();
            }
            if (jz7.a() == null) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (jz7.class) {
                    try {
                        if (jz7.a() == null) {
                            jz7.b(Boolean.valueOf(jz7.Companion.j()));
                            tpu.a aVar = tpu.Companion;
                            aVar.a("DressUpBundleLoader", "isRemoteDressupBundleLoaded " + jz7.a() + " time:" + (System.currentTimeMillis() - currentTimeMillis), null);
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Boolean a2 = jz7.a();
            ckf.d(a2);
            return a2.booleanValue();
        }

        public final IDressUpAnimHelper d() {
            String str;
            boolean h = h();
            if (h) {
                str = jz7.j();
            } else {
                str = jz7.e();
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance != null) {
                    IDressUpAnimHelper iDressUpAnimHelper = (IDressUpAnimHelper) newInstance;
                    tpu.a aVar = tpu.Companion;
                    aVar.a("DressUpBundleLoader", "create DressUpAnimHelper success, isRemote " + h, null);
                    return iDressUpAnimHelper;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.base.IDressUpAnimHelper");
            } catch (Throwable th) {
                tpu.a aVar2 = tpu.Companion;
                aVar2.a("DressUpBundleLoader", "create DressUpAnimHelper fail, isRemote " + h, th);
                return null;
            }
        }

        public final g1c e() {
            String str;
            boolean h = h();
            if (h) {
                str = jz7.i();
            } else {
                str = jz7.d();
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance != null) {
                    g1c g1cVar = (g1c) newInstance;
                    tpu.a aVar = tpu.Companion;
                    aVar.a("DressUpBundleLoader", "create DressUpHostService success, isRemote " + h, null);
                    return g1cVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.base.IDressListService");
            } catch (Throwable th) {
                tpu.a aVar2 = tpu.Companion;
                aVar2.a("DressUpBundleLoader", "create DressUpHostService fail, isRemote " + h, th);
                return null;
            }
        }

        public final IDressUpMtopRequest f() {
            String str;
            boolean h = h();
            if (h) {
                str = jz7.k();
            } else {
                str = jz7.f();
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance != null) {
                    IDressUpMtopRequest iDressUpMtopRequest = (IDressUpMtopRequest) newInstance;
                    tpu.a aVar = tpu.Companion;
                    aVar.a("DressUpBundleLoader", "create DressUpMtopRequest success, isRemote " + h, null);
                    return iDressUpMtopRequest;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.base.IDressUpMtopRequest");
            } catch (Throwable th) {
                tpu.a aVar2 = tpu.Companion;
                aVar2.a("DressUpBundleLoader", "create DressUpMtopRequest fail, isRemote " + h, th);
                return null;
            }
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f59b13a", new Object[]{this})).booleanValue();
            }
            if (!b() || !i() || l91.Companion.c()) {
                return false;
            }
            return true;
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d9e20b4e", new Object[]{this})).booleanValue();
            }
            return ((Boolean) ud0.Companion.b().c("weitao_switch.enableRemoteDressupBundle", Boolean.TRUE)).booleanValue();
        }

        public final void k(zk9.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6f126ff", new Object[]{this, iVar});
            } else {
                zk9.b(jz7.l(), new C0958a(iVar));
            }
        }

        public final void l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e753ebc", new Object[]{this, new Boolean(z)});
            } else if (jz7.a() == null) {
                jz7.b(Boolean.valueOf(z));
                tpu.a aVar = tpu.Companion;
                aVar.a("DressUpBundleLoader", "isRemoteDressupBundleLoaded " + z + " in setRemoteDressUpBundleLoaded", null);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final xod c(g1c g1cVar) {
            String str;
            boolean h = h();
            if (h) {
                str = jz7.h();
            } else {
                str = jz7.c();
            }
            Object newInstance = Class.forName(str).getConstructor(g1c.class).newInstance(g1cVar);
            if (newInstance != null) {
                xod xodVar = (xod) newInstance;
                tpu.a aVar = tpu.Companion;
                aVar.a("DressUpBundleLoader", "create DetailServiceRegister success, isRemote " + h, null);
                return xodVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.core.service.IServiceRegistry");
        }

        public final xod g(g1c g1cVar) {
            String str;
            boolean h = h();
            if (h) {
                str = jz7.l();
            } else {
                str = jz7.g();
            }
            Object newInstance = Class.forName(str).getConstructor(g1c.class).newInstance(g1cVar);
            if (newInstance != null) {
                xod xodVar = (xod) newInstance;
                tpu.a aVar = tpu.Companion;
                aVar.a("DressUpBundleLoader", "create FeedServiceRegister success, isRemote " + h, null);
                return xodVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.core.service.IServiceRegistry");
        }

        public final boolean j() {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cf3ab7bf", new Object[]{this})).booleanValue();
            }
            if (((Boolean) ud0.Companion.b().c("weitao_switch.enableCheckBundleFeatureUpdate", Boolean.TRUE)).booleanValue()) {
                z = w49.c(l91.Companion.a(spu.Companion.d()), jz7.BUNDLE_TURBOFLOW_DRESSUP_REMOTE);
                tpu.a aVar = tpu.Companion;
                aVar.a("DressUpBundleLoader", "isFeatureUpdated " + z, null);
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            try {
                z2 = bcq.a().g(spu.Companion.d(), true, jz7.BUNDLE_TURBOFLOW_DRESSUP_REMOTE);
            } catch (Exception e) {
                tpu.a aVar2 = tpu.Companion;
                aVar2.a("DressUpBundleLoader", "load turboflow_dressup-remote error " + e.getMessage(), null);
                z2 = false;
            }
            if (z2) {
                try {
                    Class.forName(jz7.l());
                    Class.forName(jz7.h());
                } catch (Throwable unused) {
                    return false;
                }
            }
            return z2;
        }
    }

    static {
        t2o.a(918552584);
    }

    public static final /* synthetic */ Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("6f046a5e", new Object[0]);
        }
        return f22299a;
    }

    public static final /* synthetic */ void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f549a744", new Object[]{bool});
        } else {
            f22299a = bool;
        }
    }

    public static final /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5a5f0dd", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fe96939", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa044568", new Object[0]);
        }
        return k;
    }

    public static final /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e84298e", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("108d316a", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36e0d456", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a20e9b72", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc855a4f", new Object[0]);
        }
        return j;
    }

    public static final /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc25b187", new Object[0]);
        }
        return h;
    }

    public static final /* synthetic */ String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbec9f23", new Object[0]);
        }
        return b;
    }
}
