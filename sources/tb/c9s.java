package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Set;
import tb.jjc;
import tb.mwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class c9s implements mwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ITMSPage f16929a;
    public final String b = "TMSBasePageTask";
    public final Set<Class<? extends mwd>> c = kfp.d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ITMSPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f16930a;

        public a(bbs bbsVar) {
            this.f16930a = bbsVar;
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d0ee080", new Object[]{this, iTMSPage});
            } else {
                ckf.g(iTMSPage, "page");
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e2d820", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            this.f16930a.S().b("firstPageRenderSuccess");
        }
    }

    static {
        t2o.a(839909740);
        t2o.a(839909724);
    }

    @Override // tb.mwd
    public Set<Class<? extends mwd>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("aeaeee15", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.mwd
    public void c(jbs jbsVar, mwd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc1e853", new Object[]{this, jbsVar, aVar});
            return;
        }
        ckf.g(jbsVar, "launchRuntime");
        ckf.g(aVar, "callback");
        bbs instance = jbsVar.getInstance();
        instance.X().e("firstPageStartCreate");
        gld m = CommonExtKt.m(instance);
        if (m != null) {
            m.C("firstPageStartCreate");
        }
        instance.S().b("firstPageRenderStart");
        gld m2 = CommonExtKt.m(instance);
        if (m2 != null) {
            m2.C("engineInitStart");
        }
        gld m3 = CommonExtKt.m(instance);
        if (m3 != null) {
            m3.C("pageCreateStart");
        }
        ITMSPage e = e(jbsVar);
        instance.S().b("pageCreateEnd");
        if (e == null) {
            int a2 = jjc.a.Companion.a();
            eas easVar = eas.h;
            ckf.f(easVar, "TMS_ERR_CAN_NOT_CREATE_PAGE");
            aVar.a(a2, easVar);
            return;
        }
        e.v(new a(instance));
        this.f16929a = e;
        jbsVar.k(c9s.class, this);
        aVar.onSuccess();
    }

    public abstract ITMSPage e(jbs jbsVar);

    public final ITMSPage f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f16929a;
    }

    @Override // tb.mwd
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }
}
