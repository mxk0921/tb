package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.tao.Globals;
import com.taobao.tao.linklog.RecommendLinkLogAdapter;
import com.taobao.tao.topmultitab.service.ab.HomepagePublicABServiceImpl;
import com.taobao.tao.topmultitab.service.appexit.TaoAppExitServiceImpl;
import com.taobao.tao.topmultitab.service.base.IHomeStaticService;
import com.taobao.tao.topmultitab.service.bgcontainer.BGContainerServiceImpl;
import com.taobao.tao.topmultitab.service.client.ClientToServerMonitorServiceImpl;
import com.taobao.tao.topmultitab.service.controller.HomeControllerServiceImpl;
import com.taobao.tao.topmultitab.service.data.HomeDataServiceImpl;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl;
import com.taobao.tao.topmultitab.service.festival.FestivalServiceImpl;
import com.taobao.tao.topmultitab.service.hudscreen.HudScreenServiceImpl;
import com.taobao.tao.topmultitab.service.lazyinit.LazyInitServiceImpl;
import com.taobao.tao.topmultitab.service.lifecycle.HomePageLifecycleServiceImpl;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.location.ILocationService;
import com.taobao.tao.topmultitab.service.location.LocationServiceImpl;
import com.taobao.tao.topmultitab.service.login.LoginServiceImpl;
import com.taobao.tao.topmultitab.service.pageprovider.HomePageProviderServiceImpl;
import com.taobao.tao.topmultitab.service.performance.PreLoadService;
import com.taobao.tao.topmultitab.service.poplayer.PopLayerServiceImpl;
import com.taobao.tao.topmultitab.service.pulldown.PullDownUpServiceImpl;
import com.taobao.tao.topmultitab.service.searchbar.HomeSearchBarServiceImpl;
import com.taobao.tao.topmultitab.service.shake.ShakeServiceImpl;
import com.taobao.tao.topmultitab.service.statusbar.StatusBarServiceImpl;
import com.taobao.tao.topmultitab.service.tab.HomeTabServiceImpl;
import com.taobao.tao.topmultitab.service.tabbar.TabBarActionButtonServiceImpl;
import com.taobao.tao.topmultitab.service.ut.HomeUtServiceImpl;
import com.taobao.tao.topmultitab.service.view.HomeViewServiceImpl;
import com.taobao.tao.topmultitab.service.viewresue.HomeViewReuseServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c4b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j2b f16849a;
    public final IHomeStaticService b;
    public final IHomeStaticService c;
    public final ycc d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements ycc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729810149);
            t2o.a(729810156);
        }

        public b() {
        }

        @Override // tb.mtd
        public List<ISubService> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("19850b7", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new LazyInitServiceImpl());
            arrayList.add(new HomeSearchBarServiceImpl());
            arrayList.add(new StatusBarServiceImpl());
            arrayList.add(new HomeTabServiceImpl());
            arrayList.add(new PullDownUpServiceImpl());
            arrayList.add(new PopLayerServiceImpl());
            arrayList.add(new LoginServiceImpl());
            arrayList.add(new HudScreenServiceImpl());
            arrayList.add(new BGContainerServiceImpl());
            arrayList.add(new TaoAppExitServiceImpl());
            arrayList.add(new ShakeServiceImpl());
            arrayList.add(new TabBarActionButtonServiceImpl());
            arrayList.add(new ClientToServerMonitorServiceImpl());
            arrayList.add(new PreLoadService());
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ycc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729810150);
            t2o.a(729810156);
        }

        public c() {
        }

        @Override // tb.mtd
        public List<ISubService> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("19850b7", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new HomeDataServiceImpl());
            arrayList.add(new HomePageLifecycleServiceImpl());
            arrayList.add(new LocationServiceImpl());
            arrayList.add(c4b.a(c4b.this));
            arrayList.add(c4b.b(c4b.this));
            arrayList.add(new HomePageProviderServiceImpl());
            arrayList.add(new HomeViewServiceImpl());
            arrayList.add(new HomeViewReuseServiceImpl());
            arrayList.add(new HomeUtServiceImpl());
            arrayList.add(new FestivalServiceImpl());
            arrayList.add(new HomepagePublicABServiceImpl());
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final c4b f16851a = new c4b();

        static {
            t2o.a(729810151);
        }

        public static /* synthetic */ c4b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c4b) ipChange.ipc$dispatch("cf348544", new Object[0]);
            }
            return f16851a;
        }
    }

    static {
        t2o.a(729810147);
    }

    public static /* synthetic */ IHomeStaticService a(c4b c4bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeStaticService) ipChange.ipc$dispatch("e2dce09f", new Object[]{c4bVar});
        }
        return c4bVar.b;
    }

    public static /* synthetic */ IHomeStaticService b(c4b c4bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeStaticService) ipChange.ipc$dispatch("4dcdf920", new Object[]{c4bVar});
        }
        return c4bVar.c;
    }

    public static c4b i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4b) ipChange.ipc$dispatch("2e3171e", new Object[0]);
        }
        return d.a();
    }

    public synchronized void c(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68f2434", new Object[]{this, z6dVar});
        } else if (g()) {
            if (this.g != -1) {
                f();
                d();
                d4b.a(d4b.ERROR_CODE_MULTI_ACTIVITY_INSTANCE, "multi activity instance", null);
                bqa.d("HomeServiceCenter", "repeat attach Fragment: " + z6dVar + " hashCode: " + this.g + " activity: " + z6dVar.k1());
            }
            this.g = z6dVar.hashCode();
            bqa.d("HomeServiceCenter", "attach Fragment: " + z6dVar + " hashCode: " + this.g);
        }
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        if (!this.e.get()) {
            k();
            bqa.d("HomeServiceCenter", "checkInit");
        }
    }

    public synchronized void e(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f07b7e9", new Object[]{this, z6dVar});
        } else if (!g() || this.g == z6dVar.hashCode()) {
            f();
        } else {
            bqa.d("HomeServiceCenter", "destroy abort, attach Fragment: " + this.g + " destroy Fragment: " + z6dVar + " hashCode: " + z6dVar.hashCode() + " activity: " + z6dVar.k1());
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4671de", new Object[]{this});
            return;
        }
        this.f16849a.b();
        this.e.compareAndSet(true, false);
        this.f.compareAndSet(true, false);
        this.g = -1;
        bqa.d("HomeServiceCenter", "destroy");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d09bb8", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableFixHomeServiceMultiActivityInstance", true);
    }

    public synchronized <T extends ISubService> T h(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISubService) ipChange.ipc$dispatch("3e2437be", new Object[]{this, cls}));
        }
        T t = (T) this.f16849a.a(cls);
        if (t == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(AURASubmitEvent.RPC_SERVICE_NAME, cls.getSimpleName());
            d4b.a(d4b.ERROR_CODE_EMPTY_SERVICE, "service is null", hashMap);
            bqa.d("HomeServiceCenter", "找不到对应服务，请检查是否注册或是否已销毁：".concat(cls.getSimpleName()));
        }
        return t;
    }

    public final List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5a3eeeae", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(IHomeDataService.SERVICE_NAME);
        arrayList.add(IHomePageLifecycleService.SERVICE_NAME);
        arrayList.add(ILocationService.SERVICE_NAME);
        return arrayList;
    }

    public c4b() {
        this.f16849a = new j2b();
        this.b = new HomeControllerServiceImpl();
        this.c = new HomeEditionSwitchServiceImpl();
        this.d = new c();
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = -1;
    }

    public synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.e.compareAndSet(false, true)) {
            bqa.d("HomeServiceCenter", "已经创建过了");
        } else {
            hrg.h(new RecommendLinkLogAdapter());
            phg.e("HomeClientABTestTool.init");
            mza.d().e(Globals.getApplication());
            phg.d("HomeClientABTestTool.init");
            g0b.j("start[1], HomeServiceCenter");
            phg.e("HomePageContext.init");
            this.f16849a.c(this.d, j());
            phg.d("HomePageContext.init");
            g0b.j("end[1], HomeServiceCenter");
            bqa.d("HomeServiceCenter", "init HomeServiceCenter");
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a35b2c", new Object[]{this});
        } else if (!this.f.compareAndSet(false, true)) {
            bqa.d("HomeServiceCenter", "已经注册过业务服务了");
        } else {
            this.f16849a.d(new b());
            bqa.d("HomeServiceCenter", "注册业务服务");
        }
    }
}
