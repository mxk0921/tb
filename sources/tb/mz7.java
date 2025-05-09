package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.dxitemclickservice.DxItemClickServiceImpl;
import com.taobao.infoflow.core.subservice.biz.firstscreendataservice.FirstScreenDataServiceImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.containerservice.DressUpContainerServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.firstscreenservice.AfterBuyFirstScreenConfigServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.afterbuy.requestservice.AddViewCallbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice.CardDebugInfoServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.NextPageOptimizeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.PerformanceOptimizationServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;
import com.taobao.tao.afterbuy.sceneservice.AfterBuyInfoFlowSceneServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.itemclick.DxItemClickNavServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mz7 extends hh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final arb b;
    public List<ISubService> c = new ArrayList();

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
            if (mz7.d(mz7.this) != null && !mz7.d(mz7.this).isEmpty()) {
                a2.addAll(mz7.d(mz7.this));
            }
            a2.add(new DressUpContainerServiceImpl());
            a2.add(mz7.e(mz7.this));
            a2.add(new FirstScreenDataServiceImpl());
            a2.add(new PerformanceOptimizationServiceImpl());
            a2.add(new AfterBuyInfoFlowSceneServiceImpl());
            a2.add(new NextPageOptimizeServiceImpl());
            a2.add(new DxItemClickServiceImpl());
            a2.add(new DxItemClickNavServiceImpl());
            if (eue.b()) {
                a2.add(new CardDebugInfoServiceImpl());
            }
            a2.add(new AddViewCallbackServiceImpl());
            a2.add(new AfterBuyFirstScreenConfigServiceImpl());
            return a2;
        }
    }

    static {
        t2o.a(729809239);
    }

    public mz7(arb arbVar) {
        super(arbVar);
        this.b = arbVar;
    }

    public static /* synthetic */ List d(mz7 mz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef587da8", new Object[]{mz7Var});
        }
        return mz7Var.c;
    }

    public static /* synthetic */ DosaContainerDataService e(mz7 mz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DosaContainerDataService) ipChange.ipc$dispatch("61b2d296", new Object[]{mz7Var});
        }
        return mz7Var.f();
    }

    public static /* synthetic */ Object ipc$super(mz7 mz7Var, String str, Object... objArr) {
        if (str.hashCode() == -1966727608) {
            return super.a();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/afterbuy/register/DressUpInfoFlowServiceRegistry");
    }

    @Override // tb.hh0, tb.qve
    public mtd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("8ac61e48", new Object[]{this});
        }
        super.a().a();
        return new a();
    }

    public final DosaContainerDataService f() {
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

    public void g(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45e7a74", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            this.c = list;
        }
    }
}
