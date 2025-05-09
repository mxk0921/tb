package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f17618a = null;

    static {
        t2o.a(468714449);
    }

    public static int a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb5a1db3", new Object[]{fluidContext})).intValue();
        }
        if (((ILifecycleService) fluidContext.getService(ILifecycleService.class)).getPageState() != 2) {
            return 0;
        }
        if (((IMediaService) fluidContext.getService(IMediaService.class)).shouldVideoStay() || ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).isPublicTheLastOne()) {
            return 2;
        }
        if (zk1.e(((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().f) || ((IContainerService) fluidContext.getService(IContainerService.class)).getConfig().n()) {
            return 1;
        }
        return 0;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f963f0", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.disableInsideLoadOnCreate", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d37b9605", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableActiveCheckLoadmore", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7aa67e0", new Object[0])).booleanValue();
        }
        if (FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("disableAutoScrollLoadMore", false)) {
            return true;
        }
        return w0.a("AB_fullscreenpage_loadmore", "autoScrollLoadMore", "disable", false);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6f8ef28", new Object[0])).booleanValue();
        }
        if (f17618a == null) {
            f17618a = Boolean.valueOf(nwv.o(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableH5ScrollOpti", "true"), false));
        }
        tfs.e("TestConfig", "AB_fullscreen.web优化---isEnableH5ScrollOpti : " + f17618a);
        return f17618a.booleanValue();
    }

    public static boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("957c76a6", new Object[]{fluidContext})).booleanValue();
        }
        if (b93.n(fluidContext) || pto.i(fluidContext)) {
            return akt.p2("ShortVideo.enableImmersiveVideoPullRefresh", true);
        }
        return false;
    }

    public static boolean g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("457dfc04", new Object[]{fluidContext})).booleanValue();
        }
        return !((ICollectionService) fluidContext.getService(ICollectionService.class)).isActiveCardLastCollection();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6e2d0d4", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("layoutXmlToJava", "true"));
    }
}
