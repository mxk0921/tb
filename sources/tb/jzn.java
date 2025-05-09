package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22310a;
    public static boolean b;
    public static edq c;
    public static final a Companion = new a(null);
    public static final HashMap<Integer, b> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.jzn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0960a<TResult> implements gvk<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f22311a;

            public C0960a(b bVar) {
                this.f22311a = bVar;
            }

            /* renamed from: b */
            public final void onSuccess(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                } else {
                    jzn.c().put(num, this.f22311a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements rqk {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f22312a;

            public b(b bVar) {
                this.f22312a = bVar;
            }

            @Override // tb.rqk
            public final void onFailure(Exception exc) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                b bVar = this.f22312a;
                if (bVar != null) {
                    bVar.onFailed();
                }
            }
        }

        static {
            t2o.a(758120573);
        }

        public a() {
        }

        @JvmStatic
        public final void a(b bVar) {
            bdt<Integer> c2;
            bdt<Integer> c3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d810962c", new Object[]{this, bVar});
                return;
            }
            c();
            ehn.c("XRateRemoteCheck", null, null, 6, null);
            if (!b()) {
                ehn.c("XRateRemoteLoading", null, null, 6, null);
                ktt.a("XRateRemoteLoading");
                xcq n = xcq.c().l("ugc_component_rate").l("ugc_core").n();
                ckf.f(n, "SplitInstallRequest.newB…EATURE_NAME_CORE).build()");
                ucq h = com.taobao.appbundle.a.Companion.a().h();
                if (h != null && (c2 = h.c(n)) != null && (c3 = c2.c(new C0960a(bVar))) != null) {
                    c3.b(new b(bVar));
                }
            } else if (bVar != null) {
                bVar.onSuccess();
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("312a8e45", new Object[]{this});
            } else if (jzn.d() == null) {
                jzn.g(c.INSTANCE);
                ucq h = com.taobao.appbundle.a.Companion.a().h();
                if (h != null) {
                    h.g(jzn.d());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class c implements edq {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final c INSTANCE = new c();

            /* renamed from: a */
            public final void onStateUpdate(bdq bdqVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                } else if (jzn.c().containsKey(Integer.valueOf(bdqVar.h()))) {
                    int i = bdqVar.i();
                    if (i == 5) {
                        odg.c("RateRemoteUtils", "ugc-component-rate installed");
                        odg.c("RateRemoteUtils", "ugc-core installed");
                        b bVar = (b) jzn.c().get(Integer.valueOf(bdqVar.h()));
                        if (bVar != null) {
                            bVar.onSuccess();
                        }
                        ehn.c("XRateRemoteLoadingSuccess", null, null, 6, null);
                        ktt.b("XRateRemoteLoading");
                    } else if (i == 6) {
                        odg.c("RateRemoteUtils", "ugc-component-rate init failed");
                        odg.c("RateRemoteUtils", "ugc-core init failed");
                        b bVar2 = (b) jzn.c().get(Integer.valueOf(bdqVar.h()));
                        if (bVar2 != null) {
                            bVar2.onFailed();
                        }
                        ktt.b("XRateRemoteLoading");
                        String valueOf = String.valueOf(bdqVar.b());
                        StringBuilder sb = new StringBuilder();
                        sb.append(bdqVar.b());
                        sb.append('_');
                        sb.append(bdqVar.c());
                        ehn.a("XRateRemoteLoadingFailed", valueOf, sb.toString());
                    }
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final boolean b() {
            Set<String> f;
            Set<String> f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
            }
            if (jzn.a()) {
                return true;
            }
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (BundleInfoManager.instance().getDynamicFeatureInfo("ugc_component_rate") == null && BundleInfoManager.instance().getDynamicFeatureInfo("ugc_core") == null) {
                odg.c("RateRemoteUtils", "ugc DynamicFeature is null, is Init true");
                jzn.e(true);
            } else if (h == null || (f = h.f()) == null || !f.contains("ugc_component_rate") || (f2 = h.f()) == null || !f2.contains("ugc_core")) {
                odg.c("RateRemoteUtils", "ugc not installed, is Init false");
                if (jzn.b()) {
                    return false;
                }
                jzn.f(true);
                ArrayList arrayList = new ArrayList();
                if (BundleInfoManager.instance().getDynamicFeatureInfo("ugc_component_rate") != null) {
                    arrayList.add("ugc_component_rate");
                }
                if (BundleInfoManager.instance().getDynamicFeatureInfo("ugc_core") != null) {
                    arrayList.add("ugc_core");
                }
                if (h == null) {
                    return false;
                }
                h.d(arrayList);
                return false;
            } else {
                odg.c("RateRemoteUtils", "ugc installed, is Init true");
                jzn.e(true);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onFailed();

        void onSuccess();
    }

    static {
        t2o.a(758120572);
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d694d05", new Object[0])).booleanValue();
        }
        return b;
    }

    public static final /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9785da3a", new Object[0])).booleanValue();
        }
        return f22310a;
    }

    public static final /* synthetic */ HashMap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("296bd047", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ edq d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (edq) ipChange.ipc$dispatch("a5cae8b1", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56979f67", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f061a16a", new Object[]{new Boolean(z)});
        } else {
            f22310a = z;
        }
    }

    public static final /* synthetic */ void g(edq edqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116d0809", new Object[]{edqVar});
        } else {
            c = edqVar;
        }
    }

    @JvmStatic
    public static final void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d810962c", new Object[]{bVar});
        } else {
            Companion.a(bVar);
        }
    }

    @JvmStatic
    public static final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[0])).booleanValue();
        }
        return Companion.b();
    }
}
