package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.dxitemclickservice.DxItemClickServiceImpl;
import com.taobao.infoflow.core.subservice.biz.experiencecheck.UserExperienceCheckServiceImpl;
import com.taobao.infoflow.core.subservice.biz.firstscreendataservice.FirstScreenDataServiceImpl;
import com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice.GlobalSceneUtPassServiceImpl;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.OutLinkServiceImpl;
import com.taobao.infoflow.core.subservice.biz.rocketservice.RocketServiceImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice.CardDebugInfoServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.ClientToServerMonitorServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.collect.CollectServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.containerflagservice.ContainerFlagServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.entryutservice.EntryUtServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.expofilterservice.ExposeItemFilterServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.FaceDetectorServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.floatviewmonitorservice.FloatViewDetectServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.IconBackGuideAnimeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.IconServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.iconoverlayservice.IconOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.jump2banner.JumpToBannerServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.NextPageOptimizeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.CardOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pagebackItemClickService.PageBackItemClickServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.PerformanceOptimizationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.image.ImageMonitorServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbStickyPopServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.prefetchservice.PrefetchServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pullrefreshservice.PullRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.realexpose.RealExposureServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.resetpagingnumber.ResetPagingNumberServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.unexpoparamservice.UnexposedItemFiltrationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.VideoCardAnimationServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.hostservice.HomePageHostService;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.commonsubservice.itemclick.DxItemClickNavServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.pullsecondfloor.PullSecondFloorServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.recbot.RecbotServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.tabappearservice.TabAppearServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.windvaneservice.HomeWindVaneServiceImpl;
import com.taobao.tao.infoflow.scene.homemainland.subservice.HomeMainLandInfoFlowSceneService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j1b implements qve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lza f21698a;
    public final arb b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements mtd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.mtd
        public List<ISubService> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("19850b7", new Object[]{this});
            }
            List<ISubService> a2 = mgt.a();
            a2.add(new HomePageHostService(j1b.b(j1b.this)));
            a2.add(new RocketServiceImpl());
            a2.add(new HomeWindVaneServiceImpl());
            a2.add(new HomeInfoFlowDataService(j1b.c(j1b.this)));
            a2.add(new ThemeServiceImpl());
            a2.add(new TabAppearServiceImpl());
            a2.add(new PerformanceOptimizationServiceImpl());
            if (dvh.k()) {
                a2.add(new ImageMonitorServiceImpl());
            }
            a2.add(new OutLinkServiceImpl());
            a2.add(new FirstScreenDataServiceImpl());
            a2.add(new CardOverlayServiceImpl());
            a2.add(new HomeMainLandInfoFlowSceneService());
            a2.add(new TopViewServiceImpl());
            a2.add(new GlobalSceneUtPassServiceImpl());
            a2.add(new TbPopViewServiceImpl());
            a2.add(new TbStickyPopServiceImpl());
            a2.add(new PullSecondFloorServiceImpl());
            a2.add(new PullRefreshServiceImpl());
            a2.add(new NextPageOptimizeServiceImpl());
            a2.add(new DxItemClickServiceImpl());
            a2.add(new DxItemClickNavServiceImpl());
            a2.add(new ClientToServerMonitorServiceImpl());
            a2.add(new SmartBackRefreshServiceImpl());
            a2.add(new UnexposedItemFiltrationServiceImpl());
            a2.add(new IconBackGuideAnimeServiceImpl());
            a2.add(new IconServiceImpl());
            a2.add(new PageBackItemClickServiceImpl());
            a2.add(new FeedbackServiceImpl());
            a2.add(new IconOverlayServiceImpl());
            a2.add(new ResetPagingNumberServiceImpl());
            a2.add(new FoldDeviceAndPadServiceImpl());
            if (!vxl.i()) {
                a2.add(new FaceDetectorServiceImpl());
            }
            if (eue.b()) {
                a2.add(new CardDebugInfoServiceImpl());
            }
            a2.add(new EntryUtServiceImpl());
            a2.add(new PrefetchServiceImpl());
            a2.add(new JumpToBannerServiceImpl());
            a2.add(new ExposeItemFilterServiceImpl());
            a2.add(new SmartNextPageRequestServiceImpl());
            a2.add(new UserExperienceCheckServiceImpl());
            a2.add(new RealExposureServiceImpl());
            a2.add(new FloatViewDetectServiceImpl());
            a2.add(new VideoCardAnimationServiceImpl());
            a2.add(new ContainerFlagServiceImpl());
            a2.add(new RecbotServiceImpl());
            a2.add(new CollectServiceImpl());
            return a2;
        }
    }

    static {
        t2o.a(729809602);
        t2o.a(488636422);
    }

    public j1b(String str, arb arbVar, lza lzaVar) {
        this.b = arbVar;
        this.f21698a = lzaVar;
        this.c = str;
    }

    public static /* synthetic */ lza b(j1b j1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lza) ipChange.ipc$dispatch("53b43981", new Object[]{j1bVar});
        }
        return j1bVar.f21698a;
    }

    public static /* synthetic */ String c(j1b j1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bab924c", new Object[]{j1bVar});
        }
        return j1bVar.c;
    }

    @Override // tb.qve
    public mtd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("8ac61e48", new Object[]{this});
        }
        return new a();
    }
}
