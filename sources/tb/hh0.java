package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.dxitemclickservice.DxItemClickServiceImpl;
import com.taobao.infoflow.core.subservice.biz.firstscreendataservice.FirstScreenDataServiceImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.broadcastservice.AfterBuyBroadcastServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.containerservice.AfterBuyContainerServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.firstscreenservice.AfterBuyFirstScreenConfigServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.popservice.AfterBuyPopNotifyServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.recyclerstyleservice.AfterBuyRecyclerStyleServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.requestservice.AddViewCallbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.staytimeservice.AfterBuyStayTimeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice.CardDebugInfoServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.NextPageOptimizeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.CardOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.PerformanceOptimizationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;
import com.taobao.tao.afterbuy.sceneservice.AfterBuyInfoFlowSceneServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.itemclick.DxItemClickNavServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.windvaneservice.HomeWindVaneServiceImpl;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hh0 implements qve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final arb f20633a;

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
            a2.add(new AfterBuyContainerServiceImpl());
            a2.add(new HomeWindVaneServiceImpl());
            a2.add(hh0.b(hh0.this));
            a2.add(new FirstScreenDataServiceImpl());
            a2.add(new PerformanceOptimizationServiceImpl());
            a2.add(new CardOverlayServiceImpl());
            a2.add(new AfterBuyInfoFlowSceneServiceImpl());
            a2.add(new TbPopViewServiceImpl());
            a2.add(new NextPageOptimizeServiceImpl());
            a2.add(new DxItemClickServiceImpl());
            a2.add(new FeedbackServiceImpl());
            a2.add(new DxItemClickNavServiceImpl());
            a2.add(new FoldDeviceAndPadServiceImpl());
            if (eue.b()) {
                a2.add(new CardDebugInfoServiceImpl());
            }
            a2.add(new AfterBuyRecyclerStyleServiceImpl());
            a2.add(new AddViewCallbackServiceImpl());
            a2.add(new AfterBuyBroadcastServiceImpl());
            a2.add(new AfterBuyFirstScreenConfigServiceImpl());
            a2.add(new AfterBuyPopNotifyServiceImpl());
            a2.add(new AfterBuyStayTimeServiceImpl());
            return a2;
        }
    }

    static {
        t2o.a(729809236);
        t2o.a(488636422);
    }

    public hh0(arb arbVar) {
        this.f20633a = arbVar;
    }

    public static /* synthetic */ DosaContainerDataService b(hh0 hh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DosaContainerDataService) ipChange.ipc$dispatch("77be2de5", new Object[]{hh0Var});
        }
        return hh0Var.c();
    }

    @Override // tb.qve
    public mtd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("8ac61e48", new Object[]{this});
        }
        return new a();
    }

    public final DosaContainerDataService c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DosaContainerDataService) ipChange.ipc$dispatch("21fd22ee", new Object[]{this});
        }
        DosaContainerDataService.c cVar = new DosaContainerDataService.c(new qh0());
        gt6 gt6Var = new gt6();
        gt6Var.e(new ih0());
        cVar.i(gt6Var);
        return cVar.h().j(true).g();
    }
}
