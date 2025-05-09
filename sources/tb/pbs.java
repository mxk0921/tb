package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.ability.basic.TMSClipboardBridge;
import com.taobao.themis.ability.basic.TMSDeviceBridge;
import com.taobao.themis.ability.basic.TMSDialogBridge;
import com.taobao.themis.ability.basic.TMSNavigatorBridge;
import com.taobao.themis.ability.basic.TMSSystemInfoBridge;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.inside.adapter.ABTestAdapter;
import com.taobao.themis.inside.adapter.DefaultApiInvokerChainFactory;
import com.taobao.themis.inside.adapter.DefaultContainerViewFactory;
import com.taobao.themis.inside.adapter.DefaultSplashViewFactory;
import com.taobao.themis.inside.adapter.DefaultWebAdapter;
import com.taobao.themis.inside.adapter.DeviceInfoAdapter;
import com.taobao.themis.inside.adapter.MtopAdapterImpl;
import com.taobao.themis.inside.adapter.TBDBProxyImpl;
import com.taobao.themis.inside.adapter.TCrashAdapter;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.inside.adapter.TMSExecutorImpl;
import com.taobao.themis.inside.adapter.TMSImageImpl;
import com.taobao.themis.inside.adapter.TMSMegaAdapter;
import com.taobao.themis.inside.adapter.TMSMonitorImpl;
import com.taobao.themis.inside.adapter.TMSOrangeImpl;
import com.taobao.themis.inside.adapter.TMSRemoteLoggerImpl;
import com.taobao.themis.inside.adapter.TMSTransportAdapter;
import com.taobao.themis.inside.adapter.TMSUserTrackerImpl;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.adapter.IABTestAdapter;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.ICrashCatchAdapter;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.adapter.IMegaAdapter;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.logger.IRemoteLoggerAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.request.AppInfoDefaultRequestClient;
import com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.web.runtime.IWebAdapter;
import java.util.ArrayList;
import java.util.List;
import tb.qwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pbs implements qwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements o8s<ITransportAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(pbs pbsVar) {
        }

        /* renamed from: a */
        public ITransportAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITransportAdapter) ipChange.ipc$dispatch("786d1f95", new Object[]{this});
            }
            return new TMSTransportAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements o8s<IApiInvokerChainFactory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(pbs pbsVar) {
        }

        /* renamed from: a */
        public IApiInvokerChainFactory get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IApiInvokerChainFactory) ipChange.ipc$dispatch("4107d932", new Object[]{this});
            }
            return new DefaultApiInvokerChainFactory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements o8s<IDeviceInfoAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(pbs pbsVar) {
        }

        /* renamed from: a */
        public IDeviceInfoAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IDeviceInfoAdapter) ipChange.ipc$dispatch("b71e3c90", new Object[]{this});
            }
            return new DeviceInfoAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements o8s<ISplashViewFactory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(pbs pbsVar) {
        }

        /* renamed from: a */
        public ISplashViewFactory get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ISplashViewFactory) ipChange.ipc$dispatch("6d52a9b5", new Object[]{this});
            }
            return new DefaultSplashViewFactory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements o8s<IContainerViewFactory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(pbs pbsVar) {
        }

        /* renamed from: a */
        public IContainerViewFactory get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IContainerViewFactory) ipChange.ipc$dispatch("3145d889", new Object[]{this});
            }
            return new DefaultContainerViewFactory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements o8s<IMegaAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(pbs pbsVar) {
        }

        /* renamed from: a */
        public IMegaAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMegaAdapter) ipChange.ipc$dispatch("407966de", new Object[]{this});
            }
            return new TMSMegaAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements o8s<IWebAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(pbs pbsVar) {
        }

        /* renamed from: a */
        public IWebAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IWebAdapter) ipChange.ipc$dispatch("6352f912", new Object[]{this});
            }
            return new DefaultWebAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements o8s<IABTestAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(pbs pbsVar) {
        }

        /* renamed from: a */
        public IABTestAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IABTestAdapter) ipChange.ipc$dispatch("faae7d9f", new Object[]{this});
            }
            return new ABTestAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements o8s<ICrashCatchAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(pbs pbsVar) {
        }

        /* renamed from: a */
        public ICrashCatchAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ICrashCatchAdapter) ipChange.ipc$dispatch("13fdfbc0", new Object[]{this});
            }
            return new TCrashAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements o8s<TMSDBAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(pbs pbsVar) {
        }

        /* renamed from: a */
        public TMSDBAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TMSDBAdapter) ipChange.ipc$dispatch("959cf25c", new Object[]{this});
            }
            return TBDBProxyImpl.getInstance();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements o8s<IExecutorService> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(pbs pbsVar) {
        }

        /* renamed from: a */
        public IExecutorService get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IExecutorService) ipChange.ipc$dispatch("2dd86f4f", new Object[]{this});
            }
            return new TMSExecutorImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements o8s<IUserTrackerAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l(pbs pbsVar) {
        }

        /* renamed from: a */
        public IUserTrackerAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IUserTrackerAdapter) ipChange.ipc$dispatch("73ad3d59", new Object[]{this});
            }
            return new TMSUserTrackerImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements o8s<IMonitorAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m(pbs pbsVar) {
        }

        /* renamed from: a */
        public IMonitorAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMonitorAdapter) ipChange.ipc$dispatch("1f29c4c6", new Object[]{this});
            }
            return new TMSMonitorImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n implements o8s<IAppInfoRequestClient> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n(pbs pbsVar) {
        }

        /* renamed from: a */
        public IAppInfoRequestClient get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAppInfoRequestClient) ipChange.ipc$dispatch("85ee32da", new Object[]{this});
            }
            return new AppInfoDefaultRequestClient();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class o implements o8s<IMtopInnerAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o(pbs pbsVar) {
        }

        /* renamed from: a */
        public IMtopInnerAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMtopInnerAdapter) ipChange.ipc$dispatch("6409c79b", new Object[]{this});
            }
            return new MtopAdapterImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class p implements o8s<IImageAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p(pbs pbsVar) {
        }

        /* renamed from: a */
        public IImageAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IImageAdapter) ipChange.ipc$dispatch("b94fbfc7", new Object[]{this});
            }
            return new TMSImageImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class q implements o8s<IConfigAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q(pbs pbsVar) {
        }

        /* renamed from: a */
        public IConfigAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IConfigAdapter) ipChange.ipc$dispatch("f609a5ae", new Object[]{this});
            }
            return new TMSOrangeImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class r implements o8s<IRemoteLoggerAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r(pbs pbsVar) {
        }

        /* renamed from: a */
        public IRemoteLoggerAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IRemoteLoggerAdapter) ipChange.ipc$dispatch("50360bd5", new Object[]{this});
            }
            return new TMSRemoteLoggerImpl();
        }
    }

    static {
        t2o.a(837812226);
        t2o.a(839909709);
    }

    @Override // tb.qwd
    public List<qwd.e> getAbilities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cec13d0e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        AbilityType abilityType = AbilityType.GLOBAL;
        arrayList.add(new qwd.b(TMSClipboardBridge.class, abilityType));
        arrayList.add(new qwd.b(TMSDialogBridge.class, abilityType));
        arrayList.add(new qwd.b(TMSNavigatorBridge.class, AbilityType.INSTANCE));
        arrayList.add(new qwd.b(TMSSystemInfoBridge.class, AbilityType.SUBPAGE));
        arrayList.add(new qwd.b(TMSDeviceBridge.class, abilityType));
        return arrayList;
    }

    @Override // tb.qwd
    public List<qwd.f> getAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("475b7426", new Object[]{this});
        }
        p8s.j(new TLogAdapterImpl());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qwd.c(TMSDBAdapter.class, new j(this)));
        arrayList.add(new qwd.c(IExecutorService.class, new k(this)));
        arrayList.add(new qwd.c(IUserTrackerAdapter.class, new l(this)));
        arrayList.add(new qwd.c(IMonitorAdapter.class, new m(this)));
        arrayList.add(new qwd.c(IAppInfoRequestClient.class, new n(this)));
        arrayList.add(new qwd.c(IMtopInnerAdapter.class, new o(this)));
        arrayList.add(new qwd.c(IImageAdapter.class, new p(this)));
        arrayList.add(new qwd.c(IConfigAdapter.class, new q(this)));
        arrayList.add(new qwd.c(IRemoteLoggerAdapter.class, new r(this)));
        arrayList.add(new qwd.c(ITransportAdapter.class, new a(this)));
        arrayList.add(new qwd.c(IApiInvokerChainFactory.class, new b(this)));
        arrayList.add(new qwd.c(IDeviceInfoAdapter.class, new c(this)));
        arrayList.add(new qwd.c(ISplashViewFactory.class, new d(this)));
        arrayList.add(new qwd.c(IContainerViewFactory.class, new e(this)));
        arrayList.add(new qwd.c(IMegaAdapter.class, new f(this)));
        arrayList.add(new qwd.c(IWebAdapter.class, new g(this)));
        arrayList.add(new qwd.c(IABTestAdapter.class, new h(this)));
        arrayList.add(new qwd.c(ICrashCatchAdapter.class, new i(this)));
        return arrayList;
    }
}
