package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ykz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32160a;
    public static boolean b;
    public static edq c;
    public static final a Companion = new a(null);
    public static final HashMap<Integer, b> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.ykz$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C1109a<TResult> implements gvk<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f32161a;

            public C1109a(b bVar) {
                this.f32161a = bVar;
            }

            /* renamed from: a */
            public final void onSuccess(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                } else {
                    ykz.c().put(num, this.f32161a);
                }
            }
        }

        public a() {
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("312a8e45", new Object[]{this});
            } else if (ykz.d() == null) {
                ykz.g(c.INSTANCE);
                ucq h = com.taobao.appbundle.a.Companion.a().h();
                if (h != null) {
                    h.g(ykz.d());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements rqk {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f32162a;

            public b(b bVar) {
                this.f32162a = bVar;
            }

            @Override // tb.rqk
            public final void onFailure(Exception exc) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                b bVar = this.f32162a;
                if (bVar != null) {
                    bVar.onFailed();
                }
                odg.c("RateFeatureRemoteUtils", "ratefeature init failed");
                vgn.j("onFailed");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class c implements edq {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final c INSTANCE = new c();

            /* renamed from: a */
            public final void onStateUpdate(bdq bdqVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                } else if (ykz.c().containsKey(Integer.valueOf(bdqVar.h()))) {
                    int i = bdqVar.i();
                    if (i == 5) {
                        odg.c("RateFeatureRemoteUtils", "ratefeature installed");
                        b bVar = (b) ykz.c().get(Integer.valueOf(bdqVar.h()));
                        if (bVar != null) {
                            bVar.onSuccess();
                        }
                    } else if (i == 6) {
                        odg.c("RateFeatureRemoteUtils", "ratefeature init failed");
                        b bVar2 = (b) ykz.c().get(Integer.valueOf(bdqVar.h()));
                        if (bVar2 != null) {
                            bVar2.onFailed();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(bdqVar.b());
                        sb.append('_');
                        sb.append(bdqVar.c());
                        vgn.j(sb.toString());
                    }
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(b bVar) {
            bdt<Integer> c2;
            bdt<Integer> c3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7450e8a", new Object[]{this, bVar});
                return;
            }
            c();
            odg.c("RateFeatureRemoteUtils", "ratefeature XRateRemoteCheck");
            if (!b()) {
                xcq n = xcq.c().l("ratefeature").n();
                ckf.f(n, "SplitInstallRequest.newB…EATURE_NAME_RATE).build()");
                ucq h = com.taobao.appbundle.a.Companion.a().h();
                if (h != null && (c2 = h.c(n)) != null && (c3 = c2.c(new C1109a(bVar))) != null) {
                    c3.b(new b(bVar));
                }
            } else if (bVar != null) {
                bVar.onSuccess();
            }
        }

        @JvmStatic
        public final boolean b() {
            Set<String> f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
            }
            if (ykz.a()) {
                return true;
            }
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (BundleInfoManager.instance().getDynamicFeatureInfo("ratefeature") == null) {
                odg.c("RateFeatureRemoteUtils", "ratefeature DynamicFeature is null, is Init true");
                ykz.e(true);
            } else if (h == null || (f = h.f()) == null || !f.contains("ratefeature")) {
                odg.c("RateFeatureRemoteUtils", "ratefeature not installed, is Init false");
                if (ykz.b()) {
                    return false;
                }
                ykz.f(true);
                ArrayList arrayList = new ArrayList();
                if (BundleInfoManager.instance().getDynamicFeatureInfo("ratefeature") != null) {
                    arrayList.add("ratefeature");
                }
                if (h == null) {
                    return false;
                }
                h.d(arrayList);
                return false;
            } else {
                odg.c("RateFeatureRemoteUtils", "ratefeature installed, is Init true");
                ykz.e(true);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onFailed();

        void onSuccess();
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
        return f32160a;
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
            f32160a = z;
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
    public static final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[0])).booleanValue();
        }
        return Companion.b();
    }
}
