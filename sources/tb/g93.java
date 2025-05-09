package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f19795a;
    public final IVideoPlayControllerService b;
    public final IVideoPlayControllerService.a c;
    public final q38 d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IVideoPlayControllerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd8e2aa7", new Object[]{this});
            } else if (g93.a(g93.this)) {
                g93 g93Var = g93.this;
                List<f83> c = g93.c(g93Var, g93.b(g93Var));
                if (c == null || c.isEmpty()) {
                    fve.e("CardTitleDisplayCollector", "屏上未找到视图");
                    return;
                }
                for (f83 f83Var : c) {
                    RRichTextView c2 = g93.d(g93.this).c(f83Var.b());
                    if (c2 != null) {
                        sxt.d(g93.e(g93.this), f83Var, c2);
                    }
                }
            }
        }
    }

    static {
        t2o.a(486539527);
    }

    public g93(cfc cfcVar) {
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.f19795a = iMainFeedsViewService;
        IVideoPlayControllerService iVideoPlayControllerService = (IVideoPlayControllerService) cfcVar.a(IVideoPlayControllerService.class);
        this.b = iVideoPlayControllerService;
        this.e = cfcVar.getContainerType().a();
        if (iMainFeedsViewService == null || iVideoPlayControllerService == null) {
            fve.e("CardTitleDisplayCollector", "不满足检查标题条件，如低端机不做检查");
            return;
        }
        this.d = new q38();
        IVideoPlayControllerService.a f = f();
        this.c = f;
        iVideoPlayControllerService.addCheckExecutePlayListener(f);
    }

    public static /* synthetic */ boolean a(g93 g93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41fd77c8", new Object[]{g93Var})).booleanValue();
        }
        return g93Var.h();
    }

    public static /* synthetic */ IMainFeedsViewService b(g93 g93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("e16384b", new Object[]{g93Var});
        }
        return g93Var.f19795a;
    }

    public static /* synthetic */ List c(g93 g93Var, IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f69fed1", new Object[]{g93Var, iMainFeedsViewService});
        }
        return g93Var.i(iMainFeedsViewService);
    }

    public static /* synthetic */ q38 d(g93 g93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q38) ipChange.ipc$dispatch("79677555", new Object[]{g93Var});
        }
        return g93Var.d;
    }

    public static /* synthetic */ String e(g93 g93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c6edf60", new Object[]{g93Var});
        }
        return g93Var.e;
    }

    public final IVideoPlayControllerService.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IVideoPlayControllerService.a) ipChange.ipc$dispatch("c2bf537b", new Object[]{this});
        }
        return new a();
    }

    public void g() {
        IVideoPlayControllerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IVideoPlayControllerService iVideoPlayControllerService = this.b;
        if (iVideoPlayControllerService != null && (aVar = this.c) != null) {
            iVideoPlayControllerService.removeCheckExecutePlayListener(aVar);
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adeffe87", new Object[]{this})).booleanValue();
        }
        boolean a2 = mve.a("enableCollectorTitleInfo", true);
        fve.e("CardTitleDisplayCollector", "enableCollectorTitleInfo: " + a2);
        return a2;
    }

    public final List<f83> i(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95c6c550", new Object[]{this, iMainFeedsViewService});
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            fve.e("CardTitleDisplayCollector", "findOnScreenViews visiblePositionRange error");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i2);
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (!(findItemViewByPosition == null || findItemViewByPosition.getVisibility() != 0 || findItemDataByPosition == null)) {
                arrayList.add(new f83(findItemDataByPosition, findItemViewByPosition));
            }
        }
        return arrayList;
    }
}
