package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f17792a;
    public final IMainFeedsViewService<ViewGroup> b;
    public final IContainerDataService<?> c;
    public String d;

    static {
        t2o.a(491782358);
    }

    public dge(cfc cfcVar) {
        this.f17792a = cfcVar;
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.c = (IContainerDataService) cfcVar.a(IContainerDataService.class);
    }

    public final boolean a(View view, View view2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90972ab", new Object[]{this, view, view2})).booleanValue();
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (globalVisibleRect) {
            i = rect.height();
        } else {
            i = 0;
        }
        if (globalVisibleRect) {
            i2 = rect.width();
        } else {
            i2 = 0;
        }
        if (i2 / view.getWidth() <= 0.5d || i / view.getHeight() <= 0.5d || rect.centerY() <= f()) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        if (iArr2[1] + view.getHeight() <= iArr[1] + view2.getHeight()) {
            return true;
        }
        return false;
    }

    public final DXRootView b(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("55ea5980", new Object[]{this, view});
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
            i++;
        }
    }

    public final View c(DXRootView dXRootView, String str) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ede49f8", new Object[]{this, dXRootView, str});
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str + "_frame");
        if (queryWidgetNodeByUserId == null || (dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext()) == null) {
            return null;
        }
        return dXRuntimeContext.D();
    }

    public final DXRootView d(String str) {
        View findItemViewByPosition;
        DXRootView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("1e883498", new Object[]{this, str});
        }
        IContainerDataService<?> iContainerDataService = this.c;
        if (iContainerDataService == null || this.b == null) {
            fve.e("IconPositionFinder", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            return null;
        }
        List totalData = containerData.getTotalData();
        for (int i = 0; i < totalData.size(); i++) {
            if (TextUtils.equals(str, ((SectionModel) totalData.get(i)).getSectionBizCode()) && (findItemViewByPosition = this.b.findItemViewByPosition(i)) != null && findItemViewByPosition.getVisibility() == 0 && (b = b(findItemViewByPosition)) != null) {
                return b;
            }
        }
        return null;
    }

    public View e(rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d95cbc6f", new Object[]{this, aVar});
        }
        DXRootView d = d(aVar.d());
        if (d == null) {
            return null;
        }
        View c = c(d, aVar.f());
        if (c != null && a(c, d)) {
            return c;
        }
        View c2 = c(d, aVar.b());
        if (c2 == null || !a(c2, d)) {
            return null;
        }
        return c2;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de93", new Object[]{this})).floatValue();
        }
        IHostService iHostService = (IHostService) this.f17792a.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().i().c();
        }
        return 0.0f;
    }

    public boolean g(rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78efc81b", new Object[]{this, aVar})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d) || !TextUtils.equals(this.d, aVar.f())) {
            return false;
        }
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77539b94", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService<ViewGroup> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null || iMainFeedsViewService.getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5112bcdc", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
