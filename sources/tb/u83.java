package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29219a = new ArrayList();
    public final cfc b;
    public sgc.b c;
    public IContainerService.a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements sgc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.sgc.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }

        @Override // tb.sgc.b
        public void h(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            } else {
                u83.this.a(view, baseSectionModel);
            }
        }

        @Override // tb.sgc.b
        public void o(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            } else {
                u83.this.g();
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            }
        }
    }

    static {
        t2o.a(729809435);
    }

    public u83(cfc cfcVar) {
        this.b = cfcVar;
        d();
        h();
    }

    public void a(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1678f16", new Object[]{this, view, baseSectionModel});
        } else if (view != null) {
            b(view, baseSectionModel);
        }
    }

    public final boolean c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa4fb7d9", new Object[]{this, view})).booleanValue();
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).getTag(R.id.tag_view_has_cover) != null) {
                return true;
            }
            return false;
        } else if (view.getTag(R.id.tag_view_has_cover) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2e3075", new Object[]{this});
            return;
        }
        this.c = new a();
        this.d = new b();
    }

    public final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453d599c", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setTag(R.id.tag_view_has_cover, Boolean.TRUE);
        } else {
            view.setTag(R.id.tag_view_has_cover, Boolean.TRUE);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        j();
        ((ArrayList) this.f29219a).clear();
    }

    public void h() {
        IContainerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959ebcd2", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.b.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null && this.c != null) {
            iMainFeedsViewService.getLifeCycleRegister().y(this.c);
            IContainerService iContainerService = (IContainerService) this.b.a(IContainerService.class);
            if (iContainerService != null && (aVar = this.d) != null) {
                iContainerService.addUiRefreshListener(aVar);
            }
        }
    }

    public final void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b091485", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setTag(R.id.tag_view_has_cover, null);
        } else {
            view.setTag(R.id.tag_view_has_cover, null);
        }
    }

    public void j() {
        IContainerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a147b9", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.b.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null && this.c != null) {
            iMainFeedsViewService.getLifeCycleRegister().q(this.c);
            IContainerService iContainerService = (IContainerService) this.b.a(IContainerService.class);
            if (iContainerService != null && (aVar = this.d) != null) {
                iContainerService.removeUiRefreshListener(aVar);
            }
        }
    }

    public final boolean b(View view, BaseSectionModel<?> baseSectionModel) {
        ICardOverlayService iCardOverlayService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3cce14", new Object[]{this, view, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null || (iCardOverlayService = (ICardOverlayService) this.b.a(ICardOverlayService.class)) == null) {
            return false;
        }
        if (c(view)) {
            iCardOverlayService.removeOverlayView("commonOverlay", view);
            i(view);
            fve.e("浮层日志:", "removeOverlayView:" + System.identityHashCode(view));
        }
        if (baseSectionModel.getSubSection() == null || baseSectionModel.getSubSection().getWindvaneOverlay() == null) {
            return false;
        }
        new ArrayList().add(baseSectionModel.getSubSection().getWindvaneOverlay());
        fve.e("浮层日志:", "showOverlay:" + System.identityHashCode(view));
        iCardOverlayService.showOverlay("commonOverlay", view, baseSectionModel);
        e(view);
        return true;
    }

    public void g() {
        int[] visiblePositionRange;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a216630", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.b.a(IMainFeedsViewService.class);
        if (!(iMainFeedsViewService == null || (visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange()) == null || visiblePositionRange.length < 2)) {
            int i = visiblePositionRange[1];
            if (((ICardOverlayService) this.b.a(ICardOverlayService.class)) != null) {
                for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
                    BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
                    if (!(findItemDataByPosition == null || findItemDataByPosition.getSubSection() == null || findItemDataByPosition.getSubSection().getWindvaneOverlay() == null)) {
                        String sectionBizCode = findItemDataByPosition.getSubSection().getWindvaneOverlay().getSectionBizCode();
                        if (((ArrayList) this.f29219a).contains(sectionBizCode)) {
                            TLog.loge("浮层日志:", "浮层bizCode: 已经展示过" + sectionBizCode);
                        } else if (iMainFeedsViewService.findItemViewByPosition(i2) != null && (iMainFeedsViewService.findItemViewByPosition(i2) instanceof ViewGroup) && ((ViewGroup) iMainFeedsViewService.findItemViewByPosition(i2)).getChildCount() > 0) {
                            b(((ViewGroup) iMainFeedsViewService.findItemViewByPosition(i2)).getChildAt(0), findItemDataByPosition);
                            TLog.loge("浮层日志:", "准备展示，浮层bizCode:" + sectionBizCode);
                            ((ArrayList) this.f29219a).add(sectionBizCode);
                        }
                    }
                }
            }
        }
    }
}
