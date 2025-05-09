package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.containerframe.ContainerFrameService;
import com.taobao.android.fluid.business.containerframe.IContainerFrameService;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.globalinteraction.InteractionService;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.business.intelligence.IntelligenceService;
import com.taobao.android.fluid.business.interact.IInteractService;
import com.taobao.android.fluid.business.interact.IneractService;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.business.publishinsert.PublishInsertService;
import com.taobao.android.fluid.business.undermode.IUnderageModeService;
import com.taobao.android.fluid.business.undermode.UnderageModeService;
import com.taobao.android.fluid.business.usercontext.IUserEventMonitorService;
import com.taobao.android.fluid.business.usercontext.UserEventMonitorService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.TrackService;
import com.taobao.android.fluid.business.videocollection.CollectionService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.devtools.IDevToolsService;
import com.taobao.android.fluid.framework.activityresult.ActivityResultService;
import com.taobao.android.fluid.framework.activityresult.IActivityResultService;
import com.taobao.android.fluid.framework.analysis.AnalysisService;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.back.BackEventService;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.CardService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.ContainerService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.DataService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.ITimeOutRefreshService;
import com.taobao.android.fluid.framework.data.TimeOutRefreshService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.deprecated.message.MessageService;
import com.taobao.android.fluid.framework.device.DeviceService;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.devtools.DevToolsNoOpService;
import com.taobao.android.fluid.framework.hostapp.HostAppService;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.HostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.HostTNodeService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.lifecycle.LifecycleService;
import com.taobao.android.fluid.framework.list.FeedsListService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.media.MediaService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.mute.MuteService;
import com.taobao.android.fluid.framework.performance.IPerformanceService;
import com.taobao.android.fluid.framework.performance.PerformanceService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.preload.PreloadService;
import com.taobao.android.fluid.framework.preload.UsePreloadService;
import com.taobao.android.fluid.framework.preload.cardwarmup.CardWarmUpService;
import com.taobao.android.fluid.framework.preload.cardwarmup.ICardWarmUpService;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.quickopen.QuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.scene.SceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.android.fluid.framework.shareplayer.SharePlayerService;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class h57 implements yod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SERVICE_INITIAL_CAPACITY = 32;

    static {
        t2o.a(468713793);
        t2o.a(469762057);
    }

    @Override // tb.yod
    public LinkedHashMap<Class<? extends FluidService>, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("50ead65d", new Object[]{this});
        }
        LinkedHashMap<Class<? extends FluidService>, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(IPreCacheService.class, "com.taobao.android.fluid.remote.precache.PreCacheService");
        return linkedHashMap;
    }

    @Override // tb.yod
    public LinkedHashMap<Class<? extends FluidService>, FluidService> b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("e73ea88", new Object[]{this, fluidContext});
        }
        LinkedHashMap<Class<? extends FluidService>, FluidService> linkedHashMap = new LinkedHashMap<>(32);
        long currentTimeMillis = System.currentTimeMillis();
        linkedHashMap.put(IDevToolsService.class, c(fluidContext));
        linkedHashMap.put(ISceneConfigService.class, new SceneConfigService(fluidContext));
        linkedHashMap.put(IDataService.class, new DataService(fluidContext));
        linkedHashMap.put(IActivityResultService.class, new ActivityResultService(fluidContext));
        linkedHashMap.put(IContainerService.class, new ContainerService(fluidContext));
        linkedHashMap.put(ILifecycleService.class, new LifecycleService(fluidContext));
        linkedHashMap.put(IBackEventService.class, new BackEventService(fluidContext));
        linkedHashMap.put(IFeedsListService.class, new FeedsListService(fluidContext));
        linkedHashMap.put(ICardService.class, new CardService(fluidContext));
        linkedHashMap.put(IMediaService.class, new MediaService(fluidContext));
        linkedHashMap.put(ISharePlayerService.class, new SharePlayerService(fluidContext));
        linkedHashMap.put(IMuteService.class, new MuteService(fluidContext));
        linkedHashMap.put(IAnalysisService.class, new AnalysisService(fluidContext));
        linkedHashMap.put(IPerformanceService.class, new PerformanceService(fluidContext));
        linkedHashMap.put(IUsePreloadService.class, new UsePreloadService(fluidContext));
        linkedHashMap.put(IPreloadService.class, new PreloadService(fluidContext));
        linkedHashMap.put(IPreloadWeexService.class, new PreloadWeexServiceImpl(fluidContext));
        linkedHashMap.put(IDeviceService.class, new DeviceService(fluidContext));
        linkedHashMap.put(IMessageService.class, new MessageService(fluidContext));
        linkedHashMap.put(IQuickOpenService.class, new QuickOpenService(fluidContext));
        linkedHashMap.put(ITimeOutRefreshService.class, new TimeOutRefreshService(fluidContext));
        linkedHashMap.put(ICardWarmUpService.class, new CardWarmUpService(fluidContext));
        linkedHashMap.put(IHostAppService.class, new HostAppService(fluidContext));
        linkedHashMap.put(IHostPageInterfaceService.class, new HostPageInterfaceService(fluidContext));
        linkedHashMap.put(IHostTNodeService.class, new HostTNodeService(fluidContext));
        linkedHashMap.put(ITrackService.class, new TrackService(fluidContext));
        linkedHashMap.put(IIntelligenceService.class, new IntelligenceService(fluidContext));
        linkedHashMap.put(IContainerFrameService.class, new ContainerFrameService(fluidContext));
        linkedHashMap.put(ICollectionService.class, new CollectionService(fluidContext));
        linkedHashMap.put(IPublishInsertService.class, new PublishInsertService(fluidContext));
        linkedHashMap.put(IInteractionService.class, new InteractionService(fluidContext));
        linkedHashMap.put(IUnderageModeService.class, new UnderageModeService(fluidContext));
        linkedHashMap.put(IUserEventMonitorService.class, new UserEventMonitorService(fluidContext));
        linkedHashMap.put(IInteractService.class, new IneractService(fluidContext));
        long currentTimeMillis2 = System.currentTimeMillis();
        ir9.b("DefaultServiceRegistry", "DefaultServiceRegistry 注册服务耗时：" + (currentTimeMillis2 - currentTimeMillis) + "ms");
        return linkedHashMap;
    }

    public final IDevToolsService c(FluidContext fluidContext) {
        Class<?> j;
        try {
            j = or9.j(or9.DEV_TOOLS_CLASS_NAME, false);
        } catch (Exception e) {
            ir9.c("DefaultServiceRegistry", "com.taobao.android.fluid.devtools.DevToolsService 未找到, 请确认 fluid-devtools 模块是否集成", e);
        }
        if (j == null) {
            ir9.b("DefaultServiceRegistry", "com.taobao.android.fluid.devtools.DevToolsService 未找到，不启用调试服务");
            return new DevToolsNoOpService();
        } else if (!IDevToolsService.class.isAssignableFrom(j)) {
            ir9.b("DefaultServiceRegistry", "com.taobao.android.fluid.devtools.DevToolsService 不是 IDevToolsService");
            ir9.b("DefaultServiceRegistry", "com.taobao.android.fluid.devtools.DevToolsService 未找到，不启用调试服务");
            return new DevToolsNoOpService();
        } else {
            Constructor<?> constructor = j.getConstructor(FluidContext.class);
            ir9.b("DefaultServiceRegistry", "com.taobao.android.fluid.devtools.DevToolsService 已找到，启用调试服务");
            return (IDevToolsService) constructor.newInstance(fluidContext);
        }
    }
}
