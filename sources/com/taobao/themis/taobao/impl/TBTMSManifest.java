package com.taobao.themis.taobao.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaMiniGameBridgeExtension;
import com.taobao.themis.ability.basic.TMSUserTrackerBridge;
import com.taobao.themis.ability_taobao.TMSAPMBridge;
import com.taobao.themis.ability_taobao.TMSEBizBridge;
import com.taobao.themis.ability_taobao.TMSPubBridge;
import com.taobao.themis.ability_taobao.TMSTBBizBridge;
import com.taobao.themis.ability_taobao.TMSTBLoginBridge;
import com.taobao.themis.ability_taobao.TMSTitleBarBridge;
import com.taobao.themis.ability_taobao.share.TMSTBShareBridge;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.inside.adapter.DefaultTraceAdapter;
import com.taobao.themis.inside.adapter.TBDBProxyImpl;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.adapter.IEditionSwitcherAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.adapter.ITMSRUMAdapter;
import com.taobao.themis.kernel.adapter.ITraceAdapter;
import com.taobao.themis.kernel.adapter.IWeexAdapter;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.open.ability.EnginePluginBridge;
import com.taobao.themis.open.ability.TMSBroadCastBridge;
import com.taobao.themis.open.ability.TMSCommonBridge;
import com.taobao.themis.open.ability.TMSMegaBridge;
import com.taobao.themis.open.ability.TMSSendMtopBridge;
import com.taobao.themis.open.ability.TMSStorageBridge;
import com.taobao.themis.open.ability.TMSSubPackageBridge;
import com.taobao.themis.open.ability.TMSVibrateBridge;
import com.taobao.themis.open.ability.TMSWebSocketBridge;
import com.taobao.themis.open.ability.audio.TMSForegroundAudioBridge;
import com.taobao.themis.open.ability.audio.TMSNewForegroundAudioBridge;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.open.ability.file.FSManagerBridge;
import com.taobao.themis.open.ability.file.TMSFileBridge;
import com.taobao.themis.open.ability.image.TMSImageBridge;
import com.taobao.themis.open.ability.network.TMSNetworkBridge;
import com.taobao.themis.open.permission.auth.TMSAuthBridge;
import com.taobao.themis.taobao.account.TMSAccountAdapter;
import com.taobao.themis.taobao.container.TBGlobalMenuAdapter;
import com.taobao.themis.taobao.container.TMSTBSplashViewFactory;
import com.taobao.themis.taobao.edtionswitcher.EditionSwitcherAdapter;
import com.taobao.themis.taobao.env.TBEnvironmentAdapterImpl;
import com.taobao.themis.taobao.lifecycle.TBInstanceLifecycleAdapter;
import com.taobao.themis.taobao.nav.TMSNavigatorAdapter;
import com.taobao.themis.taobao.share.TMSTBShareAdapter;
import com.taobao.themis.taobao.view.TMSTBContainerViewFactory;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.taobao.themis.weex.runtime.TMSDefaultWeexAdapter;
import com.taobao.themis.widget.TMSWidgetBridge;
import com.taobao.themis.widget.broadcast.TMSWidgetBroadcastBridge;
import com.taobao.themis_rum.TMSRUMAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.o8s;
import tb.pbs;
import tb.q9s;
import tb.qwd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBTMSManifest extends pbs implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements o8s<IWebAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IWebAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IWebAdapter) ipChange.ipc$dispatch("6352f912", new Object[]{this});
            }
            return new TBWebAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements o8s<IGlobalMenuAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IGlobalMenuAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IGlobalMenuAdapter) ipChange.ipc$dispatch("59f8060e", new Object[]{this});
            }
            return new TBGlobalMenuAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements o8s<IInstanceLifecycleAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IInstanceLifecycleAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IInstanceLifecycleAdapter) ipChange.ipc$dispatch("cec786c1", new Object[]{this});
            }
            return new TBInstanceLifecycleAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements o8s<ITraceAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public ITraceAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITraceAdapter) ipChange.ipc$dispatch("4e437db1", new Object[]{this});
            }
            return new DefaultTraceAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements o8s<ITMSRUMAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public ITMSRUMAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSRUMAdapter) ipChange.ipc$dispatch("b212a77c", new Object[]{this});
            }
            return new TMSRUMAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements o8s<IEditionSwitcherAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IEditionSwitcherAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IEditionSwitcherAdapter) ipChange.ipc$dispatch("3027d52b", new Object[]{this});
            }
            return new EditionSwitcherAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements o8s<IWeexAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IWeexAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IWeexAdapter) ipChange.ipc$dispatch("f6fcf36d", new Object[]{this});
            }
            return new TMSDefaultWeexAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements o8s<TMSDBAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(TBTMSManifest tBTMSManifest) {
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
    public class i implements o8s<IEnvironmentService> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IEnvironmentService get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IEnvironmentService) ipChange.ipc$dispatch("5cd879d9", new Object[]{this});
            }
            return new TBEnvironmentAdapterImpl();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements o8s<IContainerViewFactory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IContainerViewFactory get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IContainerViewFactory) ipChange.ipc$dispatch("3145d889", new Object[]{this});
            }
            return new TMSTBContainerViewFactory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements o8s<INavigatorAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public INavigatorAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (INavigatorAdapter) ipChange.ipc$dispatch("d0f244c3", new Object[]{this});
            }
            return new TMSNavigatorAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements o8s<IAccountAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IAccountAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAccountAdapter) ipChange.ipc$dispatch("a280e99", new Object[]{this});
            }
            return new TMSAccountAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements o8s<ISplashViewFactory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public ISplashViewFactory get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ISplashViewFactory) ipChange.ipc$dispatch("6d52a9b5", new Object[]{this});
            }
            return new TMSTBSplashViewFactory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n implements o8s<IShareAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IShareAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IShareAdapter) ipChange.ipc$dispatch("631da24b", new Object[]{this});
            }
            return new TMSTBShareAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class o implements o8s<IBizLaunchAdapter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IBizLaunchAdapter get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBizLaunchAdapter) ipChange.ipc$dispatch("2e2d8e12", new Object[]{this});
            }
            return new TMSTBBizLaunchAdapter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class p implements o8s<IApiInvokerChainFactory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p(TBTMSManifest tBTMSManifest) {
        }

        /* renamed from: a */
        public IApiInvokerChainFactory get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IApiInvokerChainFactory) ipChange.ipc$dispatch("4107d932", new Object[]{this});
            }
            return new TBApiInvokerChainFactory();
        }
    }

    static {
        t2o.a(847249464);
    }

    public static /* synthetic */ Object ipc$super(TBTMSManifest tBTMSManifest, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -826196722) {
            return super.getAbilities();
        }
        if (hashCode == 1197175846) {
            return super.getAdapters();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/taobao/impl/TBTMSManifest");
    }

    @Override // tb.pbs, tb.qwd
    public List<qwd.e> getAbilities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cec13d0e", new Object[]{this});
        }
        List<qwd.e> abilities = super.getAbilities();
        if (abilities == null) {
            abilities = new ArrayList<>();
        }
        AbilityType abilityType = AbilityType.SUBPAGE;
        abilities.add(new qwd.b(TMSTitleBarBridge.class, abilityType));
        AbilityType abilityType2 = AbilityType.INSTANCE;
        abilities.add(new qwd.b(TMSPubBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSAPMBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSTBLoginBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSTBBizBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSTBShareBridge.class, abilityType));
        abilities.add(new qwd.b(TMSUserTrackerBridge.class, abilityType2));
        AbilityType abilityType3 = AbilityType.GLOBAL;
        abilities.add(new qwd.b(TMSCalendarBridge.class, abilityType3));
        abilities.add(new qwd.b(TMSFileBridge.class, abilityType2));
        if (q9s.Y0()) {
            abilities.add(new qwd.b(TMSNewForegroundAudioBridge.class, abilityType2));
        } else {
            abilities.add(new qwd.b(TMSForegroundAudioBridge.class, abilityType2));
        }
        abilities.add(new qwd.b(FSManagerBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSStorageBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSNetworkBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSVibrateBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSSubPackageBridge.class, abilityType2));
        abilities.add(new qwd.b(EnginePluginBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSBroadCastBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSSendMtopBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSMegaBridge.class, abilityType));
        abilities.add(new qwd.b(TMSWebSocketBridge.class, abilityType2));
        abilities.add(new qwd.b(TMSImageBridge.class, abilityType3));
        abilities.add(new qwd.b(TMSEBizBridge.class, abilityType3));
        try {
            IpChange ipChange2 = AlimamaMiniGameBridgeExtension.$ipChange;
            abilities.add(new qwd.b(AlimamaMiniGameBridgeExtension.class, abilityType2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        AbilityType abilityType4 = AbilityType.GLOBAL;
        abilities.add(new qwd.b(TMSWidgetBridge.class, abilityType4));
        abilities.add(new qwd.b(TMSWidgetBroadcastBridge.class, AbilityType.INSTANCE));
        abilities.add(new qwd.b(TMSAuthBridge.class, abilityType4));
        abilities.add(new qwd.b(TMSCommonBridge.class, abilityType4));
        return abilities;
    }

    @Override // tb.pbs, tb.qwd
    public List<qwd.f> getAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("475b7426", new Object[]{this});
        }
        List<qwd.f> adapters = super.getAdapters();
        if (adapters == null) {
            adapters = new ArrayList<>();
        }
        adapters.add(new qwd.c(TMSDBAdapter.class, new h(this)));
        adapters.add(new qwd.c(IEnvironmentService.class, new i(this)));
        adapters.add(new qwd.c(IContainerViewFactory.class, new j(this)));
        adapters.add(new qwd.c(INavigatorAdapter.class, new k(this)));
        adapters.add(new qwd.c(IAccountAdapter.class, new l(this)));
        adapters.add(new qwd.c(ISplashViewFactory.class, new m(this)));
        adapters.add(new qwd.c(IShareAdapter.class, new n(this)));
        adapters.add(new qwd.c(IBizLaunchAdapter.class, new o(this)));
        adapters.add(new qwd.c(IApiInvokerChainFactory.class, new p(this)));
        adapters.add(new qwd.c(IWebAdapter.class, new a(this)));
        adapters.add(new qwd.c(IGlobalMenuAdapter.class, new b(this)));
        adapters.add(new qwd.c(IInstanceLifecycleAdapter.class, new c(this)));
        adapters.add(new qwd.c(ITraceAdapter.class, new d(this)));
        adapters.add(new qwd.c(ITMSRUMAdapter.class, new e(this)));
        adapters.add(new qwd.c(IEditionSwitcherAdapter.class, new f(this)));
        adapters.add(new qwd.c(IWeexAdapter.class, new g(this)));
        return adapters;
    }
}
