package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class no2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f24857a;

    static {
        t2o.a(486539629);
    }

    public no2(cfc cfcVar) {
        this.f24857a = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    public final rm1 a(BaseSectionModel<?> baseSectionModel, View view, om1 om1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rm1) ipChange.ipc$dispatch("a5d2fe17", new Object[]{this, baseSectionModel, view, om1Var});
        }
        rm1 rm1Var = new rm1();
        rm1Var.e = wsn.c(baseSectionModel);
        rm1Var.d = wsn.e(baseSectionModel);
        String b = wsn.b(baseSectionModel);
        if (TextUtils.isEmpty(b)) {
            b = wsn.d(baseSectionModel);
        }
        rm1Var.f27464a = b;
        rm1Var.b = hue.g(view);
        rm1Var.c = om1Var;
        return rm1Var;
    }

    public final List<rm1> b(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95c6c550", new Object[]{this, iMainFeedsViewService});
        }
        ArrayList arrayList = new ArrayList();
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            fve.e("BxCardTracer", "findOnScreenViews visiblePositionRange error");
            return null;
        }
        int i = visiblePositionRange[1];
        om1 h = hue.h(iMainFeedsViewService.getOriginalView());
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i2);
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (!(findItemViewByPosition == null || findItemViewByPosition.getVisibility() != 0 || findItemDataByPosition == null)) {
                try {
                    arrayList.add(a(findItemDataByPosition, findItemViewByPosition, h));
                } catch (Throwable th) {
                    fve.c("BxCardTracer", "bx接口异常：", th);
                }
            }
        }
        return arrayList;
    }

    public List<rm1> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bfd63e43", new Object[]{this});
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f24857a;
        if (iMainFeedsViewService == null) {
            return null;
        }
        return b(iMainFeedsViewService);
    }
}
