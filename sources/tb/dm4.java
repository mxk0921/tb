package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyRecyclerStyleService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dm4 implements oqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f17911a;
    public final IFirstScreenDataService b;
    public final cfc c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17912a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f17912a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dm4.f(dm4.this).smoothScrollToPositionWithOffset(this.f17912a + this.b, -1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17913a;
        public final /* synthetic */ int b;

        public b(int i, int i2) {
            this.f17913a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dm4.f(dm4.this).scrollToPositionWithOffset(this.f17913a, this.b);
            }
        }
    }

    static {
        t2o.a(486539580);
        t2o.a(488636441);
    }

    public dm4(cfc cfcVar) {
        this.c = cfcVar;
        this.f17911a = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.b = (IFirstScreenDataService) cfcVar.a(IFirstScreenDataService.class);
    }

    public static /* synthetic */ IMainFeedsViewService f(dm4 dm4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("3827261d", new Object[]{dm4Var});
        }
        return dm4Var.f17911a;
    }

    @Override // tb.oqb
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6177b79a", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f17911a;
        if (iMainFeedsViewService == null) {
            return false;
        }
        return iMainFeedsViewService.isInterceptTouch();
    }

    @Override // tb.oqb
    public View b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9bb02a29", new Object[]{this, str, str2});
        }
        int positionBySectionBizCode = this.f17911a.getPositionBySectionBizCode(str);
        if (positionBySectionBizCode < 0) {
            fve.e("ContainerInvokerImpl", "position < 0");
            return null;
        }
        View findItemViewByPosition = this.f17911a.findItemViewByPosition(positionBySectionBizCode);
        if (findItemViewByPosition != null) {
            return lue.c(str2, findItemViewByPosition);
        }
        fve.e("ContainerInvokerImpl", "cardView is null");
        return null;
    }

    @Override // tb.oqb
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa33c656", new Object[]{this, str});
            return;
        }
        IAfterBuyRecyclerStyleService iAfterBuyRecyclerStyleService = (IAfterBuyRecyclerStyleService) this.c.a(IAfterBuyRecyclerStyleService.class);
        if (iAfterBuyRecyclerStyleService != null) {
            iAfterBuyRecyclerStyleService.setRecyclerViewBackgroundColor(str);
        }
    }

    @Override // tb.oqb
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352bda8c", new Object[]{this, new Integer(i)});
            return;
        }
        IItemRenderService iItemRenderService = (IItemRenderService) this.c.a(IItemRenderService.class);
        if (iItemRenderService != null) {
            iItemRenderService.setLoadMoreBottomOffset(i);
        }
    }

    @Override // tb.oqb
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c45d596", new Object[]{this})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f17911a;
        if (iMainFeedsViewService == null) {
            return 0;
        }
        return iMainFeedsViewService.getVerticalScrollOffset();
    }

    @Override // tb.oqb
    public ntd getSubTabParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntd) ipChange.ipc$dispatch("8e24caab", new Object[]{this});
        }
        return new nve(g());
    }

    @Override // tb.oqb
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f17911a;
        if (iMainFeedsViewService == null) {
            return true;
        }
        return iMainFeedsViewService.isReachTopEdge();
    }

    public final dqc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqc) ipChange.ipc$dispatch("39bcb153", new Object[]{this});
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f17911a;
        if (iMainFeedsViewService == null) {
            fve.e("ContainerInvokerImpl", "getInfoFlowParams mMainFeedsViewService == null");
            return null;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length <= 0) {
            fve.e("ContainerInvokerImpl", "visiblePositionRange == null || visiblePositionRange.length <= 0");
            return null;
        }
        int i = visiblePositionRange[0];
        if (i < 0) {
            fve.e("ContainerInvokerImpl", "firstVisibleCardPosition <= 0");
            return null;
        }
        View findItemViewByPosition = this.f17911a.findItemViewByPosition(i);
        if (findItemViewByPosition == null) {
            return null;
        }
        int top = findItemViewByPosition.getTop();
        fve.e("ContainerInvokerImpl", "firstVisibleCardOffset:" + i + "firstVisibleItemViewOffset" + top);
        return new tzh(i, top);
    }

    @Override // tb.oqb
    public boolean scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5c5ef5", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.f17911a == null) {
            fve.e("ContainerInvokerImpl", "scrollToPositionWithOffset mMainFeedsViewService == null");
            return false;
        }
        get.a().h(new b(i, i2));
        return true;
    }

    @Override // tb.oqb
    public boolean smoothScrollToPositionFromInfoFlow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0a6db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int b2 = lnn.b(this.c);
        if (b2 < 0) {
            fve.e("ContainerInvokerImpl", "startPosition: " + b2);
            return false;
        }
        get.a().h(new a(b2, i));
        return true;
    }
}
