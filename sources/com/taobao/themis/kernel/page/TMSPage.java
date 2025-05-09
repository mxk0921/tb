package com.taobao.themis.kernel.page;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.trtc.api.TrtcConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Pair;
import tb.a07;
import tb.arf;
import tb.bbs;
import tb.ccs;
import tb.ckf;
import tb.eas;
import tb.gl4;
import tb.jwd;
import tb.k8s;
import tb.mcs;
import tb.ncs;
import tb.ocs;
import tb.p8s;
import tb.pcs;
import tb.q6d;
import tb.q9s;
import tb.qbs;
import tb.qcs;
import tb.qml;
import tb.t2o;
import tb.tll;
import tb.unl;
import tb.vxm;
import tb.x5d;
import tb.xhv;
import tb.y0e;
import tb.z5d;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPage implements ITMSPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final AtomicInteger n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13594a;
    public tll b;
    public final String c;
    public final String d;
    public final ccs e;
    public final CopyOnWriteArrayList<ITMSPage.b> f;
    public final CopyOnWriteArraySet<ITMSPage.a> g;
    public final c h;
    public final b i;
    public TMSJSAPIHandler j;
    public qcs k;
    public final CopyOnWriteArraySet<z5d> l;
    public final d m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class RenderStatusEnum extends Enum<RenderStatusEnum> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final RenderStatusEnum INIT = new RenderStatusEnum(ModuleConstants.VI_MODULE_NAME_INIT, 0);
        public static final RenderStatusEnum RENDER_READY = new RenderStatusEnum("RENDER_READY", 1);
        public static final RenderStatusEnum RENDER_SUCCESS = new RenderStatusEnum("RENDER_SUCCESS", 2);
        public static final RenderStatusEnum RENDER_ERROR = new RenderStatusEnum("RENDER_ERROR", 3);
        private static final /* synthetic */ RenderStatusEnum[] $VALUES = $values();

        private static final /* synthetic */ RenderStatusEnum[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RenderStatusEnum[]) ipChange.ipc$dispatch("d97304f9", new Object[0]) : new RenderStatusEnum[]{INIT, RENDER_READY, RENDER_SUCCESS, RENDER_ERROR};
        }

        private RenderStatusEnum(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(RenderStatusEnum renderStatusEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/page/TMSPage$RenderStatusEnum");
        }

        public static RenderStatusEnum valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("9d47fc64", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(RenderStatusEnum.class, str);
            }
            return (RenderStatusEnum) valueOf;
        }

        public static RenderStatusEnum[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("f23d9dd5", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (RenderStatusEnum[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909882);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ITMSPage.PageStatusEnum f13595a = ITMSPage.PageStatusEnum.INIT;
        public final ReentrantReadWriteLock.ReadLock b;
        public final ReentrantReadWriteLock.WriteLock c;

        static {
            t2o.a(839909883);
        }

        public b() {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.b = reentrantReadWriteLock.readLock();
            this.c = reentrantReadWriteLock.writeLock();
        }

        public final ITMSPage.PageStatusEnum a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage.PageStatusEnum) ipChange.ipc$dispatch("9ed69fcc", new Object[]{this});
            }
            this.b.lock();
            try {
                return this.f13595a;
            } finally {
                this.b.unlock();
            }
        }

        public final void b(ITMSPage.PageStatusEnum pageStatusEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd4b076", new Object[]{this, pageStatusEnum});
                return;
            }
            ckf.g(pageStatusEnum, "status");
            this.c.lock();
            try {
                this.f13595a = pageStatusEnum;
            } finally {
                this.c.unlock();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public RenderStatusEnum f13596a = RenderStatusEnum.INIT;
        public final ReentrantReadWriteLock.ReadLock b;
        public final ReentrantReadWriteLock.WriteLock c;

        static {
            t2o.a(839909884);
        }

        public c() {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.b = reentrantReadWriteLock.readLock();
            this.c = reentrantReadWriteLock.writeLock();
        }

        public final RenderStatusEnum a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderStatusEnum) ipChange.ipc$dispatch("4c6fac0", new Object[]{this});
            }
            this.b.lock();
            try {
                return this.f13596a;
            } finally {
                this.b.unlock();
            }
        }

        public final void b(RenderStatusEnum renderStatusEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a64d50", new Object[]{this, renderStatusEnum});
                return;
            }
            ckf.g(renderStatusEnum, "status");
            this.c.lock();
            try {
                this.f13596a = renderStatusEnum;
            } finally {
                this.c.unlock();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements ocs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ocs
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            vxm.b.e().j("TMS_firstFrame", SystemClock.uptimeMillis());
            String d = ncs.d(TMSPage.d(TMSPage.this));
            String c = ncs.c(TMSPage.this);
            JSONObject jSONObject = new JSONObject();
            CopyOnWriteArraySet<z5d> a2 = TMSPage.a(TMSPage.this);
            ArrayList arrayList = new ArrayList(zz3.q(a2, 10));
            for (z5d z5dVar : a2) {
                arrayList.add(z5dVar.getClass().getSimpleName());
            }
            jSONObject.put((JSONObject) "extensions", (String) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_PAGE_RENDER_SUCCESS, d, c, jSONObject);
            TMSPage.g(TMSPage.this).b(RenderStatusEnum.RENDER_SUCCESS);
            Iterator it = TMSPage.e(TMSPage.this).iterator();
            while (it.hasNext()) {
                ((ITMSPage.b) it.next()).f(TMSPage.this);
            }
        }

        @Override // tb.ocs
        public void b(String str, String str2) {
            String str3;
            String str4;
            x5d pageContainer;
            jwd jwdVar;
            x5d pageContainer2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
                return;
            }
            TMSPage.g(TMSPage.this).b(RenderStatusEnum.RENDER_ERROR);
            if (qml.z(TMSPage.this)) {
                if (q9s.W1() && (jwdVar = (jwd) TMSPage.this.getExtension(jwd.class)) != null && jwdVar.isHitSnapshot()) {
                    tll pageContext = TMSPage.this.getPageContext();
                    xhv xhvVar = null;
                    if (!(pageContext == null || (pageContainer2 = pageContext.getPageContainer()) == null)) {
                        pageContainer2.b(new eas(str, str2, ""));
                        xhvVar = xhv.INSTANCE;
                    }
                    if (xhvVar == null) {
                        TMSPage.d(TMSPage.this).x0(new eas(str, str2, ""));
                    }
                } else if (!q9s.V1()) {
                    TMSPage.d(TMSPage.this).x0(new eas(str, str2, ""));
                } else if (TMSPage.this.getInstance().O() != TMSContainerType.EMBEDDED || TMSPage.this.getInstance().a0() == TMSSolutionType.UNIAPP || q9s.e2()) {
                    eas easVar = new eas(str, str2, "");
                    tll pageContext2 = TMSPage.this.getPageContext();
                    if (!(pageContext2 == null || (pageContainer = pageContext2.getPageContainer()) == null)) {
                        pageContainer.e(easVar);
                    }
                    TMSPage.d(TMSPage.this).p0(easVar);
                } else {
                    TMSPage.d(TMSPage.this).x0(new eas(str, str2, ""));
                }
            }
            String d = ncs.d(TMSPage.d(TMSPage.this));
            String c = ncs.c(TMSPage.this);
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2;
            }
            JSONObject jSONObject = new JSONObject();
            CopyOnWriteArraySet<z5d> a2 = TMSPage.a(TMSPage.this);
            ArrayList arrayList = new ArrayList(zz3.q(a2, 10));
            for (z5d z5dVar : a2) {
                arrayList.add(z5dVar.getClass().getSimpleName());
            }
            jSONObject.put((JSONObject) "extensions", (String) arrayList);
            xhv xhvVar2 = xhv.INSTANCE;
            mcs.a(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_PAGE_RENDER_ERROR, d, c, str3, str4, jSONObject);
        }

        @Override // tb.ocs
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af48699b", new Object[]{this, str, str2});
                return;
            }
            bbs.e R = TMSPage.d(TMSPage.this).R();
            if (R != null) {
                R.c(str, str2);
            }
        }

        @Override // tb.ocs
        public void onRenderReady() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61f6bd5", new Object[]{this});
                return;
            }
            TMSPage.g(TMSPage.this).b(RenderStatusEnum.RENDER_READY);
            Iterator it = TMSPage.e(TMSPage.this).iterator();
            while (it.hasNext()) {
                ((ITMSPage.b) it.next()).a(TMSPage.this);
            }
            TMSPage.d(TMSPage.this).S().b("firstPageRenderFinish");
            vxm.b.e().j("TMS_finishLoad", SystemClock.uptimeMillis());
            String d = ncs.d(TMSPage.d(TMSPage.this));
            String c = ncs.c(TMSPage.this);
            JSONObject jSONObject = new JSONObject();
            TMSPage tMSPage = TMSPage.this;
            jSONObject.put((JSONObject) "pageIndex", (String) Integer.valueOf(TMSPage.d(tMSPage).W().c(tMSPage)));
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_PAGE_RENDER_READY, d, c, jSONObject);
        }
    }

    static {
        t2o.a(839909881);
        t2o.a(839909863);
    }

    public TMSPage(bbs bbsVar, unl unlVar, JSONObject jSONObject) {
        ckf.g(bbsVar, "mInstance");
        ckf.g(unlVar, "pageModel");
        this.f13594a = bbsVar;
        String g = unlVar.g();
        this.c = g == null ? ckf.p(gl4.CONFIG_PAGE_PREFIX, Integer.valueOf(n.incrementAndGet())) : g;
        String k = unlVar.k();
        k = k == null ? "" : k;
        this.d = k;
        this.e = new ccs(unlVar, jSONObject == null ? new JSONObject() : jSONObject);
        this.f = new CopyOnWriteArrayList<>();
        this.g = new CopyOnWriteArraySet<>();
        this.h = new c();
        this.i = new b();
        this.l = new CopyOnWriteArraySet<>();
        String d2 = ncs.d(bbsVar);
        String c2 = ncs.c(this);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "url", k);
        jSONObject2.put((JSONObject) "pageModel", (String) JSON.parse(JSON.toJSONString(unlVar)));
        jSONObject2.put((JSONObject) "extraParams", (String) jSONObject);
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_PAGE_INIT, d2, c2, jSONObject2);
        q6d q6dVar = (q6d) p8s.b(q6d.class);
        if (q6dVar != null) {
            q6dVar.c(this);
        }
        this.m = new d();
    }

    public static final /* synthetic */ CopyOnWriteArraySet a(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("b4b2254b", new Object[]{tMSPage});
        }
        return tMSPage.l;
    }

    public static final /* synthetic */ bbs d(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("a31bc9f5", new Object[]{tMSPage});
        }
        return tMSPage.f13594a;
    }

    public static final /* synthetic */ CopyOnWriteArrayList e(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("8aa999a4", new Object[]{tMSPage});
        }
        return tMSPage.f;
    }

    public static final /* synthetic */ c g(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("568b9a94", new Object[]{tMSPage});
        }
        return tMSPage.h;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void B(tll tllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3aa52", new Object[]{this, tllVar});
            return;
        }
        ckf.g(tllVar, CoreConstants.KEY_PAGE_CONTEXT);
        TMSLogger.a("TMSBasePage", "bindContext");
        this.b = tllVar;
        x5d pageContainer = tllVar.getPageContainer();
        if (pageContainer != null) {
            pageContainer.attachPage(this);
        }
        Iterator<z5d> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().w0();
        }
        if (q9s.L0() && qml.q(this).c()) {
            qcs qcsVar = this.k;
            if (qcsVar != null) {
                boolean b2 = ckf.b(qcsVar.f(), "Weex");
                qcs qcsVar2 = this.k;
                if (qcsVar2 != null) {
                    qml.B(this, b2, qcsVar2);
                } else {
                    ckf.y("mRender");
                    throw null;
                }
            } else {
                ckf.y("mRender");
                throw null;
            }
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void C(ITMSPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641f46d5", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.g.add(aVar);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public ITMSPage.PageStatusEnum D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage.PageStatusEnum) ipChange.ipc$dispatch("a4e44c8d", new Object[]{this});
        }
        return this.i.a();
    }

    @Override // tb.x4k
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void destroy() {
        y0e titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TMSLogger.f("TMSBasePage", "pageId: " + this.c + " destroy");
        TMSJSAPIHandler tMSJSAPIHandler = this.j;
        if (tMSJSAPIHandler != null) {
            tMSJSAPIHandler.terminal();
            j();
            this.i.b(ITMSPage.PageStatusEnum.DESTROYED);
            q6d q6dVar = (q6d) p8s.b(q6d.class);
            if (q6dVar != null) {
                q6dVar.b(this);
            }
            this.g.clear();
            Iterator<z5d> it = this.l.iterator();
            while (it.hasNext()) {
                z5d next = it.next();
                ckf.f(next, "item");
                t(next);
            }
            tll tllVar = this.b;
            if (!(tllVar == null || (titleBar = tllVar.getTitleBar()) == null)) {
                titleBar.onDestroy();
            }
            qcs qcsVar = this.k;
            if (qcsVar != null) {
                qcsVar.destroy();
                mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_PAGE_ON_DESTROY, ncs.d(this.f13594a), ncs.c(this), new JSONObject());
                return;
            }
            ckf.y("mRender");
            throw null;
        }
        ckf.y("mJSAPIHandler");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            return qcsVar.f();
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public <T> T getExtension(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("57944325", new Object[]{this, cls});
        }
        ckf.g(cls, "clz");
        T t = null;
        for (T t2 : this.l) {
            if (cls.isInstance((z5d) t2)) {
                t = t2;
            }
        }
        return t;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public bbs getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f13594a;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public tll getPageContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tll) ipChange.ipc$dispatch("c65dd5de", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public ccs getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ccs) ipChange.ipc$dispatch("49860fe4", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            return qcsVar.getView();
        }
        ckf.y("mRender");
        throw null;
    }

    public final qcs h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qcs) ipChange.ipc$dispatch("caf8aa17", new Object[]{this});
        }
        return this.f13594a.Y().createRender(this, this.m);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.k = h();
        this.j = new TMSJSAPIHandler(this);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        if (this.i.a() == ITMSPage.PageStatusEnum.DESTROYED) {
            return true;
        }
        return false;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b2fa46", new Object[]{this});
        } else {
            k8s.j().k(this);
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            return qcsVar.l();
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "script");
        ckf.g(str2, "name");
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.n(str, str2);
        } else {
            ckf.y("mRender");
            throw null;
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onActivityResult(i, i2, intent);
        } else {
            ckf.y("mRender");
            throw null;
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.i.b(ITMSPage.PageStatusEnum.ON_PAUSE);
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onPause();
            q6d q6dVar = (q6d) p8s.b(q6d.class);
            if (q6dVar != null) {
                q6dVar.g(this);
            }
            Iterator<ITMSPage.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().g(this);
            }
            String c2 = ncs.c(this);
            String d2 = mcs.d(ncs.c(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onPause");
            CopyOnWriteArraySet<ITMSPage.a> copyOnWriteArraySet = this.g;
            ArrayList arrayList = new ArrayList(zz3.q(copyOnWriteArraySet, 10));
            Iterator<ITMSPage.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass().getName());
            }
            jSONObject.put("listeners", (Object) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, c2, d2, jSONObject);
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.i.b(ITMSPage.PageStatusEnum.ON_RESUME);
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onResume();
            q6d q6dVar = (q6d) p8s.b(q6d.class);
            if (q6dVar != null) {
                q6dVar.a(this);
            }
            Iterator<ITMSPage.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            String c2 = ncs.c(this);
            String d2 = mcs.d(ncs.c(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onResume");
            CopyOnWriteArraySet<ITMSPage.a> copyOnWriteArraySet = this.g;
            ArrayList arrayList = new ArrayList(zz3.q(copyOnWriteArraySet, 10));
            Iterator<ITMSPage.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass().getName());
            }
            jSONObject.put("listeners", (Object) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, c2, d2, jSONObject);
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onStart();
            this.i.b(ITMSPage.PageStatusEnum.ON_START);
            q6d q6dVar = (q6d) p8s.b(q6d.class);
            if (q6dVar != null) {
                q6dVar.f(this);
            }
            Iterator<ITMSPage.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().f(this);
            }
            String c2 = ncs.c(this);
            String d2 = mcs.d(ncs.c(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onStart");
            CopyOnWriteArraySet<ITMSPage.a> copyOnWriteArraySet = this.g;
            ArrayList arrayList = new ArrayList(zz3.q(copyOnWriteArraySet, 10));
            Iterator<ITMSPage.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass().getName());
            }
            jSONObject.put("listeners", (Object) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, c2, d2, jSONObject);
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onStop();
            this.i.b(ITMSPage.PageStatusEnum.ON_STOP);
            q6d q6dVar = (q6d) p8s.b(q6d.class);
            if (q6dVar != null) {
                q6dVar.h(this);
            }
            Iterator<ITMSPage.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().h(this);
            }
            String c2 = ncs.c(this);
            String d2 = mcs.d(ncs.c(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onStop");
            CopyOnWriteArraySet<ITMSPage.a> copyOnWriteArraySet = this.g;
            ArrayList arrayList = new ArrayList(zz3.q(copyOnWriteArraySet, 10));
            Iterator<ITMSPage.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass().getName());
            }
            jSONObject.put("listeners", (Object) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, c2, d2, jSONObject);
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        this.i.b(ITMSPage.PageStatusEnum.ON_VIEW_APPEAR);
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onViewAppear();
            Iterator<ITMSPage.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().l(this);
            }
            String c2 = ncs.c(this);
            String d2 = mcs.d(ncs.c(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onViewAppear");
            CopyOnWriteArraySet<ITMSPage.a> copyOnWriteArraySet = this.g;
            ArrayList arrayList = new ArrayList(zz3.q(copyOnWriteArraySet, 10));
            Iterator<ITMSPage.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass().getName());
            }
            jSONObject.put("listeners", (Object) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, c2, d2, jSONObject);
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        this.i.b(ITMSPage.PageStatusEnum.ON_VIEW_DISAPPEAR);
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.onViewDisappear();
            Iterator<ITMSPage.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().n(this);
            }
            String c2 = ncs.c(this);
            String d2 = mcs.d(ncs.c(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onViewDisappear");
            CopyOnWriteArraySet<ITMSPage.a> copyOnWriteArraySet = this.g;
            ArrayList arrayList = new ArrayList(zz3.q(copyOnWriteArraySet, 10));
            Iterator<ITMSPage.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass().getName());
            }
            jSONObject.put("listeners", (Object) arrayList);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, c2, d2, jSONObject);
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
            return;
        }
        ckf.g(bArr, "script");
        ckf.g(str, "name");
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.r(bArr, str);
        } else {
            ckf.y("mRender");
            throw null;
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void reload(pcs pcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961bd7e0", new Object[]{this, pcsVar});
            return;
        }
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.reload(pcsVar);
        } else {
            ckf.y("mRender");
            throw null;
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        TMSLogger.f("TMSBasePage", "trigger render");
        if (q9s.INSTANCE.U() && ckf.b(f(), "Weex") && (ckf.b(this.f13594a.c0().getExtraData().getString("tms_weex_async_create"), "true") || TMSInstanceExtKt.e(this.f13594a))) {
            TMSLogger.f("TMSBasePage", "do not handle reentry");
        } else if (q9s.j0()) {
            if (this.h.a().compareTo(RenderStatusEnum.RENDER_READY) > 0) {
                TMSLogger.b("TMSBasePage", "render in error status");
                return;
            }
        } else if (this.h.a().compareTo(RenderStatusEnum.INIT) > 0) {
            TMSLogger.b("TMSBasePage", "render in error status");
            return;
        }
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.s();
        } else {
            ckf.y("mRender");
            throw null;
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void t(z5d z5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b0cc1e", new Object[]{this, z5dVar});
            return;
        }
        ckf.g(z5dVar, TrtcConstants.TRTC_PARAMS_EXTENSION);
        z5dVar.c();
        this.l.remove(z5dVar);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void u(ITMSPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37133c92", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.g.remove(aVar);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void v(ITMSPage.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d32265", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        if (this.h.a() == RenderStatusEnum.RENDER_SUCCESS) {
            bVar.f(this);
        } else {
            this.f.add(bVar);
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void x(z5d z5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0705217", new Object[]{this, z5dVar});
            return;
        }
        ckf.g(z5dVar, TrtcConstants.TRTC_PARAMS_EXTENSION);
        z5dVar.G(this);
        this.l.add(z5dVar);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public TMSJSAPIHandler z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSJSAPIHandler) ipChange.ipc$dispatch("27b3b81", new Object[]{this});
        }
        TMSJSAPIHandler tMSJSAPIHandler = this.j;
        if (tMSJSAPIHandler != null) {
            return tMSJSAPIHandler;
        }
        ckf.y("mJSAPIHandler");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void w(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51266b1b", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.X0(str, json);
            qbs.b(str, json);
            mcs.e(mcs.MODULE_NATIVE_EVENT, mcs.EVEN_ON_NEVENT_FIRE, ncs.c(this), mcs.d(ncs.c(this)), arf.b(new Pair("name", str), new Pair("params", json)));
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    @Deprecated(message = "use sendEventToRender")
    public void y(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88773e1a", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.P(str, json);
            qbs.b(str, json);
            mcs.e(mcs.MODULE_NATIVE_EVENT, mcs.EVEN_ON_NEVENT_FIRE, ncs.c(this), mcs.d(ncs.c(this)), arf.b(new Pair("name", str), new Pair("params", json)));
            return;
        }
        ckf.y("mRender");
        throw null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void A(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42428dc2", new Object[]{this, str, str2, json});
            return;
        }
        ckf.g(str, "target");
        ckf.g(str2, "event");
        qcs qcsVar = this.k;
        if (qcsVar != null) {
            qcsVar.D0(str, str2, json);
            qbs.b(str2, json);
            mcs.e(mcs.MODULE_NATIVE_EVENT, mcs.EVEN_ON_NEVENT_FIRE, ncs.c(this), mcs.d(ncs.c(this)), arf.b(new Pair("name", str2), new Pair("params", json), new Pair("target", str)));
            return;
        }
        ckf.y("mRender");
        throw null;
    }
}
