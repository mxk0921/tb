package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.manager.TMSInstanceManager;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import tb.eas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bbs extends qt6 implements x4k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger A = new AtomicInteger(0);
    public uwd c;
    public Activity d;
    public final Application e;
    public kbs f;
    public final String g;
    public final String h;
    public String i;
    public String j;
    public final String k;
    public String l;
    public TMSMetaInfoWrapper m;
    public TMSMetaInfoWrapper n;
    public swd o;
    public final InstanceStartParams p;
    public final List<String> q;
    public final mgg r;
    public final f8d s;
    public d t;
    public final List<t4c> u;
    public final TMSContainerType v;
    public e w;
    public final List<f> x;
    public final List<b> y;
    public volatile boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(Activity activity);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();

        void b();

        void c();

        void d();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void a();

        void b();

        void c(eas easVar);

        void onRenderReady();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void c(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
        void onPause();

        void onResume();

        void onStart();

        void onStop();
    }

    static {
        t2o.a(839909401);
        t2o.a(839909383);
    }

    public bbs(Activity activity, InstanceStartParams instanceStartParams, TMSContainerType tMSContainerType) {
        this.q = new ArrayList();
        mgg mggVar = new mgg();
        this.r = mggVar;
        this.s = new rcf();
        this.u = new CopyOnWriteArrayList();
        this.v = TMSContainerType.GENERIC;
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = false;
        this.p = instanceStartParams;
        this.g = "instance_" + A.incrementAndGet();
        this.j = instanceStartParams.getAppId();
        this.k = instanceStartParams.getUniAppId();
        this.i = instanceStartParams.getStartUrl();
        this.d = activity;
        this.e = activity.getApplication();
        this.h = h0();
        this.v = tMSContainerType;
        mggVar.b("instanceCreate");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) this.i);
        jSONObject.put("extraPrams", (Object) instanceStartParams.getExtraData());
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onCreate(this);
        }
        mcs.e(mcs.MODULE_INSTANCE, mcs.EVENT_ON_INIT, "", ncs.d(this), jSONObject);
    }

    public static /* synthetic */ uwd E(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uwd) ipChange.ipc$dispatch("c80dc38a", new Object[]{bbsVar});
        }
        return bbsVar.c;
    }

    public static /* synthetic */ Object ipc$super(bbs bbsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/TMSInstance");
    }

    public static /* synthetic */ d m(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("32113ef0", new Object[]{bbsVar});
        }
        return bbsVar.t;
    }

    public static /* synthetic */ String o(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5883584c", new Object[]{bbsVar});
        }
        return bbsVar.j;
    }

    public static /* synthetic */ String p(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecc1c7eb", new Object[]{bbsVar});
        }
        return bbsVar.k;
    }

    public static /* synthetic */ mgg q(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mgg) ipChange.ipc$dispatch("b26744f", new Object[]{bbsVar});
        }
        return bbsVar.r;
    }

    public void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onStop(this);
        }
        Iterator it = ((CopyOnWriteArrayList) this.x).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStop();
        }
        ngb ngbVar = (ngb) getExtension(ngb.class);
        if (ngbVar != null) {
            ngbVar.onStop();
        }
    }

    public void C0(t4c t4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d27ff5", new Object[]{this, t4cVar});
            return;
        }
        ((CopyOnWriteArrayList) this.u).remove(t4cVar);
        t4cVar.c();
    }

    public void F(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b91626", new Object[]{this, fVar});
        } else {
            this.x.add(fVar);
        }
    }

    public boolean G(TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc66326c", new Object[]{this, tMSBackPressedType})).booleanValue();
        }
        swd swdVar = this.o;
        if (swdVar == null) {
            return false;
        }
        ITMSPage topPage = swdVar.getTopPage();
        if (topPage == null) {
            TMSLogger.b("TMSInstance", "can't find current top active page");
            return false;
        }
        if (q9s.C2()) {
            topPage = lae.Companion.a(this.o.getTopPage());
        }
        if (topPage == null) {
            TMSLogger.b("TMSInstance", "can't find current top active page");
            return false;
        }
        w5d w5dVar = (w5d) topPage.getExtension(w5d.class);
        if (w5dVar != null && w5dVar.C0(tMSBackPressedType)) {
            return true;
        }
        if (!qml.z(topPage) || !q9s.e(this.j) || !((ArrayList) this.q).contains("closeWindow") || this.o.getAlivePageCount() != 1) {
            return this.o.f(true);
        }
        TMSLogger.f("TMSInstance", "can't backPressed due to closeWindow event");
        topPage.y("closeWindow", new JSONObject());
        return true;
    }

    public void H(Activity activity) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0574c05", new Object[]{this, activity});
            return;
        }
        if (this.d == null) {
            z = true;
        }
        TMSAssertUtils.a(z, "activity has been set");
        this.d = activity;
        kbs kbsVar = this.f;
        if (kbsVar != null) {
            kbsVar.k(1);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(I());
        }
    }

    public Activity I() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        if (this.d != null) {
            z = true;
        }
        TMSAssertUtils.a(z, "activity is null");
        return this.d;
    }

    public void J(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34300332", new Object[]{this, bVar});
        } else if (this.d != null) {
            bVar.a(I());
        } else {
            ((CopyOnWriteArrayList) this.y).add(bVar);
        }
    }

    public Activity K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d9ab9872", new Object[]{this});
        }
        return this.d;
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        return this.j;
    }

    public Application M() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        if (this.e != null) {
            z = true;
        }
        TMSAssertUtils.a(z, "application is null");
        return this.e;
    }

    public mm4 N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("6dea3104", new Object[]{this});
        }
        return this.c.getContainerModel();
    }

    public TMSContainerType O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSContainerType) ipChange.ipc$dispatch("71d656c0", new Object[]{this});
        }
        return this.v;
    }

    public TMSMetaInfoWrapper P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSMetaInfoWrapper) ipChange.ipc$dispatch("9c77d6e2", new Object[]{this});
        }
        return this.n;
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.g;
    }

    public e R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b85acdf", new Object[]{this});
        }
        return this.w;
    }

    public mgg S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mgg) ipChange.ipc$dispatch("691387e3", new Object[]{this});
        }
        return this.r;
    }

    public kbs T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kbs) ipChange.ipc$dispatch("a42b1dd4", new Object[]{this});
        }
        return this.f;
    }

    public TMSMetaInfoWrapper U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSMetaInfoWrapper) ipChange.ipc$dispatch("9c86d88f", new Object[]{this});
        }
        return this.m;
    }

    public rwd V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("96566cd7", new Object[]{this});
        }
        return this.c.getPageFactory();
    }

    public swd W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swd) ipChange.ipc$dispatch("c632b277", new Object[]{this});
        }
        return this.o;
    }

    public f8d X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8d) ipChange.ipc$dispatch("97aeed5c", new Object[]{this});
        }
        return this.s;
    }

    public twd Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("61c10865", new Object[]{this});
        }
        return this.c.getRenderFactory();
    }

    public uwd Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uwd) ipChange.ipc$dispatch("481f140b", new Object[]{this});
        }
        return this.c;
    }

    public TMSSolutionType a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        uwd uwdVar = this.c;
        if (uwdVar != null) {
            return uwdVar.getSolutionType();
        }
        return TMSSolutionType.getType(this);
    }

    @Override // tb.x4k
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.g;
    }

    public String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1059306d", new Object[]{this});
        }
        return this.l;
    }

    public InstanceStartParams c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceStartParams) ipChange.ipc$dispatch("693fd0c7", new Object[]{this});
        }
        return this.p;
    }

    public String d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c176b7", new Object[]{this});
        }
        return this.k;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.z) {
            this.z = true;
            i0();
            TMSLogger.f("TMSInstance", "instance triggers destroy");
            IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
            if (iInstanceLifecycleAdapter != null) {
                iInstanceLifecycleAdapter.onDestroy(this);
            }
            qbs.a();
            swd swdVar = this.o;
            if (swdVar != null) {
                swdVar.destroy();
            }
            uwd uwdVar = this.c;
            if (uwdVar != null) {
                uwdVar.destroy();
            }
            Iterator it = ((CopyOnWriteArrayList) this.u).iterator();
            while (it.hasNext()) {
                ((t4c) it.next()).c();
            }
            ((CopyOnWriteArrayList) this.u).clear();
            ((ArrayList) this.q).clear();
            this.r.d(this);
            TMSInstanceManager.f(this);
            d();
        }
    }

    public String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.i;
    }

    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b100b2", new Object[]{this});
            return;
        }
        uwd uwdVar = this.c;
        if (uwdVar != null && uwdVar.getSplashView() != null) {
            this.c.getSplashView().exit();
        }
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public <T> T getExtension(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("57944325", new Object[]{this, cls});
        }
        Iterator<t4c> it = this.u.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    public final String h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b27042c7", new Object[]{this});
        }
        String utdid = ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).getUtdid(this.d);
        if (TextUtils.isEmpty(utdid)) {
            utdid = String.valueOf(Math.random() * 100000.0d);
        }
        return o9s.o(utdid + this.j + System.currentTimeMillis());
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b2fa46", new Object[]{this});
        } else {
            k8s.j().k(this);
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onPause(this);
        }
        Iterator it = ((CopyOnWriteArrayList) this.x).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onPause();
        }
        ngb ngbVar = (ngb) getExtension(ngb.class);
        if (ngbVar != null) {
            ngbVar.onPause();
        }
    }

    public void k0(t4c t4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329205ee", new Object[]{this, t4cVar});
            return;
        }
        ((CopyOnWriteArrayList) this.u).add(t4cVar);
        t4cVar.N(this);
    }

    public void m0(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3bd884", new Object[]{this, eVar});
        } else {
            this.w = eVar;
        }
    }

    public void n0(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4c1041", new Object[]{this, dVar});
        } else {
            this.t = dVar;
        }
    }

    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        uwd uwdVar = this.c;
        if (uwdVar != null) {
            uwdVar.reload(null);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (W().getTopPage() != null) {
            W().getTopPage().onActivityResult(i, i2, intent);
        }
    }

    public void p0(eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a112341e", new Object[]{this, easVar});
            return;
        }
        d dVar = this.t;
        if (dVar != null) {
            dVar.c(easVar);
        }
    }

    public void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onResume(this);
        }
        Iterator it = ((CopyOnWriteArrayList) this.x).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onResume();
        }
        ngb ngbVar = (ngb) getExtension(ngb.class);
        if (ngbVar != null) {
            ngbVar.onResume();
        }
    }

    public void r0(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb4de9a", new Object[]{this, tMSMetaInfoWrapper});
        } else {
            this.n = tMSMetaInfoWrapper;
        }
    }

    public void reload(pcs pcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961bd7e0", new Object[]{this, pcsVar});
            return;
        }
        uwd uwdVar = this.c;
        if (uwdVar != null) {
            uwdVar.reload(pcsVar);
        }
    }

    public void s0(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810d1f25", new Object[]{this, tMSMetaInfoWrapper});
            return;
        }
        this.m = tMSMetaInfoWrapper;
        if (tMSMetaInfoWrapper != null && TMSInstanceExtKt.r(this)) {
            this.j = tMSMetaInfoWrapper.b();
        }
    }

    public void t0(swd swdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06fb695", new Object[]{this, swdVar});
            return;
        }
        this.o = swdVar;
        if (g(ITMSPage.class) != null) {
            this.o.a((ITMSPage) g(ITMSPage.class));
        }
    }

    public void u0(uwd uwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979d65ed", new Object[]{this, uwdVar});
            return;
        }
        this.c = uwdVar;
        List<t4c> instanceExtension = uwdVar.getInstanceExtension();
        if (instanceExtension != null) {
            for (t4c t4cVar : instanceExtension) {
                k0(t4cVar);
            }
        }
    }

    public void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a76caa9", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void w0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void x0(eas easVar) {
        ITMSPage topPage;
        tll pageContext;
        x5d pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6292a20", new Object[]{this, easVar});
            return;
        }
        uwd uwdVar = this.c;
        if (!(uwdVar == null || uwdVar.getSplashView() == null)) {
            this.c.getSplashView().b(easVar, null);
        }
        uwd uwdVar2 = this.c;
        if (!(uwdVar2 == null || uwdVar2.getSolutionType() != TMSSolutionType.WEB_SINGLE_PAGE || (topPage = this.o.getTopPage()) == null || (pageContext = topPage.getPageContext()) == null || (pageContainer = pageContext.getPageContainer()) == null)) {
            pageContainer.e(easVar);
        }
        d dVar = this.t;
        if (dVar != null) {
            dVar.c(easVar);
        }
        try {
            this.r.i(easVar.f18428a);
            this.r.j(easVar.b);
            this.r.d(this);
        } catch (Throwable th) {
            TMSLogger.d("TMSInstance", th);
        }
    }

    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onStart(this);
        }
        Iterator it = ((CopyOnWriteArrayList) this.x).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStart();
        }
        ngb ngbVar = (ngb) getExtension(ngb.class);
        if (ngbVar != null) {
            ngbVar.onStart();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements lwd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f16306a;
        public final /* synthetic */ String b;

        public a(c cVar, String str) {
            this.f16306a = cVar;
            this.b = str;
        }

        @Override // tb.lwd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            c cVar = this.f16306a;
            if (cVar != null) {
                cVar.a();
            }
            if (bbs.m(bbs.this) != null) {
                bbs.m(bbs.this).a();
            }
        }

        @Override // tb.lwd
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4667d5a", new Object[]{this});
                return;
            }
            c cVar = this.f16306a;
            if (cVar != null) {
                cVar.c();
            }
        }

        @Override // tb.lwd
        public void d(eas easVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("588812fa", new Object[]{this, easVar});
                return;
            }
            bbs.q(bbs.this).i(easVar.f18428a);
            bbs.q(bbs.this).j(easVar.b);
            bbs.q(bbs.this).d(bbs.this);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) easVar.f18428a);
            jSONObject.put("errorMsg", (Object) easVar.b);
            mcs.a(mcs.MODULE_LAUNCH, mcs.EVENT_ON_ERROR, ncs.d(bbs.this), this.b, easVar.f18428a, easVar.b, null);
            if (q9s.O() && TMSContainerType.GENERIC.equals(bbs.this.O()) && bbs.E(bbs.this).getSolutionType() == TMSSolutionType.UNIAPP && (easVar.f18428a.startsWith(eas.a.TMS_ERR_MANIFEST_PREFIX) || easVar.f18428a.equals(eas.h.f18428a))) {
                TMSInstanceExtKt.c(bbs.this);
                z = false;
            }
            if (!(bbs.E(bbs.this) == null || bbs.E(bbs.this).getSplashView() == null || !z)) {
                bbs.E(bbs.this).getSplashView().b(easVar, null);
            }
            if (bbs.m(bbs.this) != null) {
                bbs.m(bbs.this).c(easVar);
            }
        }

        @Override // tb.lwd
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a17d1bd", new Object[]{this});
            }
        }

        @Override // tb.lwd
        public void onRenderReady() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61f6bd5", new Object[]{this});
            } else if (bbs.m(bbs.this) != null) {
                bbs.m(bbs.this).onRenderReady();
            }
        }

        @Override // tb.lwd
        public void b() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a16c1d38", new Object[]{this});
                return;
            }
            c cVar = this.f16306a;
            if (cVar != null) {
                cVar.b();
            }
            if (bbs.m(bbs.this) != null) {
                bbs.m(bbs.this).b();
            }
            new JSONObject();
            String d = ncs.d(bbs.this);
            String str2 = this.b;
            Pair pair = new Pair("solution", bbs.this.a0().name());
            Pair pair2 = new Pair("appName", r8s.f(bbs.this));
            if (TMSInstanceExtKt.r(bbs.this)) {
                str = bbs.o(bbs.this);
            } else {
                str = bbs.p(bbs.this);
            }
            mcs.e(mcs.MODULE_LAUNCH, mcs.EVENT_ON_FINISH, d, str2, arf.b(pair, pair2, new Pair("appId", str)));
        }
    }

    public void A0(TMSSolutionType tMSSolutionType) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6e3e39", new Object[]{this, tMSSolutionType});
            return;
        }
        TMSBaseSolution a2 = cds.a(this, tMSSolutionType);
        TMSAssertUtils.a(a2 != null, "solution is null");
        if (a2 != null) {
            pwd launcherNG = a2.getLauncherNG();
            if (launcherNG == null) {
                z = false;
            }
            TMSAssertUtils.a(z, "launcherNG is null");
            if (launcherNG != null) {
                kbs kbsVar = new kbs(new jbs(M(), this, ncs.b(this)), launcherNG.a(), launcherNG.b());
                this.f = kbsVar;
                u0(a2);
                kbsVar.i();
            }
        }
    }

    @Deprecated
    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486fd272", new Object[]{this, str});
            return;
        }
        if (this.o.getTopPage() != null) {
            mcs.e(mcs.MODULE_NATIVE_EVENT, mcs.EVEN_ON_NEVENT_REGISTER, ncs.c(this.o.getTopPage()), mcs.d(ncs.c(this.o.getTopPage())), arf.b(new Pair("name", str)));
        }
        ((ArrayList) this.q).add(str);
    }

    @Deprecated
    public void z0(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18348ccc", new Object[]{this, cVar});
            return;
        }
        a9s launcher = this.c.getLauncher();
        String d2 = mcs.d(ncs.d(this));
        mcs.e(mcs.MODULE_LAUNCH, mcs.EVENT_ON_INIT, ncs.d(this), d2, arf.b(new Pair("url", this.i), new Pair("instanceId", this.g), new Pair("class", launcher.getClass().getSimpleName())));
        mcs.e(mcs.MODULE_LAUNCH, mcs.EVENT_ON_START, ncs.d(this), d2, new JSONObject());
        launcher.a(new a(cVar, d2));
    }

    public bbs(Application application, InstanceStartParams instanceStartParams, TMSContainerType tMSContainerType) {
        this.q = new ArrayList();
        mgg mggVar = new mgg();
        this.r = mggVar;
        this.s = new rcf();
        this.u = new CopyOnWriteArrayList();
        this.v = TMSContainerType.GENERIC;
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = false;
        this.p = instanceStartParams;
        this.g = "instance_" + A.incrementAndGet();
        this.j = instanceStartParams.getAppId();
        this.k = instanceStartParams.getUniAppId();
        this.i = instanceStartParams.getStartUrl();
        this.d = null;
        this.e = application;
        this.h = h0();
        this.v = tMSContainerType;
        mggVar.b("instanceCreate");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) this.i);
        jSONObject.put("extraPrams", (Object) instanceStartParams.getExtraData());
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) p8s.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onCreate(this);
        }
        mcs.e(mcs.MODULE_INSTANCE, mcs.EVENT_ON_INIT, "", ncs.d(this), jSONObject);
    }

    public bbs() {
        this.q = new ArrayList();
        mgg mggVar = new mgg();
        this.r = mggVar;
        this.s = new rcf();
        this.u = new CopyOnWriteArrayList();
        this.v = TMSContainerType.GENERIC;
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = false;
        this.d = null;
        this.e = null;
        this.p = new InstanceStartParams("", new Bundle(), new Bundle());
        this.g = "instance_" + A.incrementAndGet();
        this.k = "";
        this.h = h0();
        this.v = TMSContainerType.EMBEDDED;
        mggVar.b("instanceCreate");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) "https://framework");
        mcs.e(mcs.MODULE_INSTANCE, mcs.EVENT_ON_INIT, "", ncs.d(this), jSONObject);
    }
}
