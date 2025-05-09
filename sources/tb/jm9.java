package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jm9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARTIFACT_ID = "fliggy_vacation_ttdetail";

    /* renamed from: a  reason: collision with root package name */
    public static int f22071a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ucq f22072a;
        public final /* synthetic */ edq b;

        public a(ucq ucqVar, edq edqVar) {
            this.f22072a = ucqVar;
            this.b = edqVar;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            this.f22072a.e(this.b);
            tgh.b("FliggyRemoteUtils", "send install request failure: fliggy_vacation_ttdetail");
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
            jm9.b(num.intValue());
            tgh.b("FliggyRemoteUtils", "send install request success: " + jm9.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ucq f22073a;

        static {
            t2o.a(354418803);
            t2o.a(676331590);
        }

        public c(ucq ucqVar) {
            this.f22073a = ucqVar;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar.h() == jm9.a()) {
                int i = bdqVar.i();
                if (i == 5) {
                    this.f22073a.e(this);
                } else if (i == 6) {
                    this.f22073a.e(this);
                    tgh.b("FliggyRemoteUtils", "install failed fliggy_vacation_ttdetail");
                }
            }
        }
    }

    static {
        t2o.a(354418800);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return f22071a;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        f22071a = i;
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
        tgh.b("FliggyRemoteUtils", "remomte module not installed：fliggy_vacation_ttdetail");
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
            xcq n = xcq.c().l(ARTIFACT_ID).n();
            System.currentTimeMillis();
            h.c(n).c(new b()).b(new a(h, cVar));
        }
    }
}
