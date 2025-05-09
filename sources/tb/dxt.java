package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dxt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARTIFACT_ID = "dtao-liveshop-ttdetail";

    /* renamed from: a  reason: collision with root package name */
    public static int f18138a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ucq f18139a;
        public final /* synthetic */ edq b;

        public a(ucq ucqVar, edq edqVar) {
            this.f18139a = ucqVar;
            this.b = edqVar;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            this.f18139a.e(this.b);
            tgh.b("TinyShopRemoteUtils", "send install request failure: dtao-liveshop-ttdetail");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                return;
            }
            dxt.b(num.intValue());
            tgh.b("TinyShopRemoteUtils", "send install request success: " + dxt.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ucq f18140a;

        static {
            t2o.a(354418807);
            t2o.a(676331590);
        }

        public c(ucq ucqVar) {
            this.f18140a = ucqVar;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar.h() == dxt.a()) {
                int i = bdqVar.i();
                if (i == 5) {
                    this.f18140a.e(this);
                } else if (i == 6) {
                    this.f18140a.e(this);
                    tgh.b("TinyShopRemoteUtils", "install failed dtao-liveshop-ttdetail");
                }
            }
        }
    }

    static {
        t2o.a(354418804);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return f18138a;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        f18138a = i;
        return i;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282cc069", new Object[0])).booleanValue();
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        if (h == null) {
            return false;
        }
        if (h.f().contains(ARTIFACT_ID)) {
            return true;
        }
        tgh.b("TinyShopRemoteUtils", "remomte module not installed：dtao-liveshop-ttdetail");
        d();
        return false;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bf7186", new Object[0]);
            return;
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        if (h != null) {
            c cVar = new c(h);
            h.g(cVar);
            h.c(xcq.c().l(ARTIFACT_ID).n()).c(new b()).b(new a(h, cVar));
        }
    }
}
