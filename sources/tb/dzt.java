package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.clickbackservice.ClickBackRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.CardOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.PerformanceOptimizationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl;
import com.taobao.oversea.homepage.recommend.service.scene.TmgRecSceneService;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.commonsubservice.tabappearservice.TabAppearServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.windvaneservice.HomeWindVaneServiceImpl;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dzt extends uv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final arb b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
            List<ISubService> c = dzt.c(dzt.this);
            c.add(wso.a(xn4.NEW_FACE_CHILD_INTL.getContainerId()));
            c.add(new HomeInfoFlowDataService(dzt.d(dzt.this)));
            c.add(new TmgRecSceneService());
            c.add(new ThemeServiceImpl());
            c.add(new TabAppearServiceImpl());
            c.add(new PerformanceOptimizationServiceImpl());
            c.add(new ClickBackRefreshServiceImpl());
            c.add(new TopViewServiceImpl());
            c.add(new CardOverlayServiceImpl());
            c.add(new FeedbackServiceImpl());
            c.add(new HomeWindVaneServiceImpl());
            return c;
        }
    }

    public dzt(String str, arb arbVar, lza lzaVar) {
        super(lzaVar);
        this.b = arbVar;
        this.c = str;
    }

    public static /* synthetic */ List c(dzt dztVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60498258", new Object[]{dztVar});
        }
        return dztVar.b();
    }

    public static /* synthetic */ String d(dzt dztVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c7d40f2", new Object[]{dztVar});
        }
        return dztVar.c;
    }

    public static /* synthetic */ Object ipc$super(dzt dztVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/recommend/config/TmgRecInfoFlowRegistry");
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
