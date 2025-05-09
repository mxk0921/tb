package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;
import tb.h6c;
import tb.lgc;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class y30 implements IVideoPlayControllerService.b, h6c.c<ViewGroup>, h6c.e, sgc.b, IContainerDataService.a, h6c.b, lgc.a, IPullSecondFloorService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final IMainFeedsViewService<?> b;
    public final IVideoPlayControllerService.a c;
    public final IMainFeedsLoopStartStopService d;

    /* renamed from: a  reason: collision with root package name */
    public int f31818a = -1;
    public boolean e = false;
    public final Runnable f = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("AbstractVideoPlayController", "executePlayRunnable");
            y30 y30Var = y30.this;
            y30.q(y30Var, y30.p(y30Var));
            y30.r(y30.this).a();
        }
    }

    static {
        t2o.a(491782754);
        t2o.a(488636618);
        t2o.a(488636470);
        t2o.a(488636472);
        t2o.a(488636482);
        t2o.a(488636639);
        t2o.a(488636469);
        t2o.a(488636478);
        t2o.a(488636596);
    }

    public y30(cfc cfcVar, IVideoPlayControllerService.a aVar) {
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.d = (IMainFeedsLoopStartStopService) cfcVar.a(IMainFeedsLoopStartStopService.class);
        this.c = aVar;
    }

    public static /* synthetic */ IMainFeedsViewService p(y30 y30Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("579448", new Object[]{y30Var});
        }
        return y30Var.b;
    }

    public static /* synthetic */ void q(y30 y30Var, IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76055819", new Object[]{y30Var, iMainFeedsViewService});
        } else {
            y30Var.s(iMainFeedsViewService);
        }
    }

    public static /* synthetic */ IVideoPlayControllerService.a r(y30 y30Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IVideoPlayControllerService.a) ipChange.ipc$dispatch("de401841", new Object[]{y30Var});
        }
        return y30Var.c;
    }

    public abstract void A(IContainerDataModel<?> iContainerDataModel);

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ff1309", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // tb.sgc.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        }
    }

    @Override // tb.h6c.e
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4813aba", new Object[]{this, new Boolean(z)});
        } else if (z) {
            fve.e("AbstractVideoPlayController", "可见触发播控");
            C();
        } else {
            y();
        }
    }

    @Override // tb.h6c.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            return;
        }
        fve.e("AbstractVideoPlayController", "DataChangeLayoutFinish 触发播控");
        C();
    }

    @Override // tb.h6c.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d673366", new Object[]{this});
        }
    }

    @Override // tb.lgc.a
    public void e(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66994eec", new Object[]{this, viewHolder});
            return;
        }
        fve.e("AbstractVideoPlayController", "onItemAddFinished");
        C();
    }

    @Override // tb.lgc.a
    public void f(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe53713a", new Object[]{this, viewHolder});
        }
    }

    @Override // tb.lgc.a
    public void g(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd58c33", new Object[]{this, viewHolder});
            return;
        }
        fve.e("AbstractVideoPlayController", "onItemRemoveFinished");
        C();
    }

    @Override // tb.sgc.b
    public void h(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else {
            z(view);
        }
    }

    @Override // tb.sgc.b
    public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void j(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
        }
    }

    @Override // tb.lgc.a
    public void k(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae81", new Object[]{this, viewHolder});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
        } else {
            A(iContainerDataModel);
        }
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.sgc.b
    public void o(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }

    @Override // tb.h6c.c
    public void onScrollStateChanged(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
        } else if (i != this.f31818a) {
            this.f31818a = i;
            if (i == 0) {
                fve.e("AbstractVideoPlayController", "滚动停止触发播控");
                C();
            }
        }
    }

    @Override // tb.h6c.c
    public void onScrolled(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else if (this.f31818a == 0) {
            fve.e("AbstractVideoPlayController", "scrollTo 的场景（如置顶），触发播控");
            C();
        }
    }

    public final void s(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b616a8", new Object[]{this, iMainFeedsViewService});
        } else if (iMainFeedsViewService == null || !v()) {
            fve.e("AbstractVideoPlayController", "不允许执行播控 mainFeedsViewService :" + iMainFeedsViewService);
        } else {
            ViewGroup originalView = iMainFeedsViewService.getOriginalView();
            if (originalView == null) {
                fve.e("AbstractVideoPlayController", "feeds 容器为空");
                return;
            }
            a69 a69Var = new a69(lue.b(originalView));
            List<View> t = t(iMainFeedsViewService);
            if (t == null || t.isEmpty()) {
                fve.e("AbstractVideoPlayController", "没有在屏上的feeds子视图");
            } else {
                x(t, a69Var);
            }
        }
    }

    public final List<View> t(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95c6c550", new Object[]{this, iMainFeedsViewService});
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            fve.e("AbstractVideoPlayController", "findOnScreenViews visiblePositionRange error");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i2);
            if (findItemViewByPosition != null && findItemViewByPosition.getVisibility() == 0) {
                arrayList.add(findItemViewByPosition);
            }
        }
        return arrayList;
    }

    public abstract void u(String str, int i);

    public abstract boolean v();

    public abstract void w();

    public abstract void x(List<View> list, a69 a69Var);

    public abstract void y();

    public abstract void z(View view);

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170224de", new Object[]{this});
        } else if (!this.d.isAllowStart() && mve.a("isFixPlayVideoInSecondFloor", true)) {
            fve.e("AbstractVideoPlayController", "当前启停服务不允许播放");
        } else if (this.e) {
            fve.e("AbstractVideoPlayController", "force intercept video play");
        } else if (o7p.a().c()) {
            o7p.a().f(this.f);
            o7p.a().e(this.f);
        } else {
            get.a().k(this.f);
            get.a().f(this.f, 0L);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
        } else if (mve.a("isFixPlayVideoInSecondFloor", true)) {
            fve.e("AbstractVideoPlayController", "进入二楼，停止播放");
            y();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
        } else if (mve.a("isFixPlayVideoInSecondFloor", true)) {
            fve.e("AbstractVideoPlayController", "离开二楼，停止播放");
            C();
        }
    }
}
