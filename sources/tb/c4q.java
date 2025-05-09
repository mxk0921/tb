package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.weex.ui.component.WXBasicComponentType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c4q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f16861a;

    static {
        t2o.a(491782861);
    }

    public c4q(cfc cfcVar) {
        this.f16861a = cfcVar;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fcf05fb", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f16861a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        int a2 = h83.a(iContainerDataService.getContainerData().getTotalData());
        if (a2 == -1) {
            fve.e("SliderViewHelper", "findSliderItemView->   sliderDataPosition == RecyclerView.NO_POSITION");
            return null;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f16861a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return null;
        }
        return iMainFeedsViewService.findItemViewByPosition(a2);
    }

    public final DXSliderLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXSliderLayout) ipChange.ipc$dispatch("dda4d3c5", new Object[]{this});
        }
        View c = c();
        if (!(c instanceof DXRootView)) {
            fve.e("SliderViewHelper", "findSliderLayout -> !(sliderView instanceof DXRootView)");
            return null;
        }
        DXWidgetNode expandWidgetNode = ((DXRootView) c).getExpandWidgetNode();
        if (expandWidgetNode == null) {
            fve.e("SliderViewHelper", "findSliderLayout -> getExpandWidgetNode() == null");
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(WXBasicComponentType.SLIDER);
        if (queryWidgetNodeByUserId instanceof DXSliderLayout) {
            return (DXSliderLayout) queryWidgetNodeByUserId;
        }
        fve.e("SliderViewHelper", "findSliderLayout -> !(slider instanceof DXSliderLayout)");
        return null;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9586cd88", new Object[]{this});
        }
        ViewGroup viewGroup = (ViewGroup) a();
        if (viewGroup == null) {
            fve.e("SliderViewHelper", "findSliderView -> itemView == null");
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return childAt;
            }
        }
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e778797", new Object[]{this});
            return;
        }
        DXSliderLayout b = b();
        if (b == null) {
            fve.e("SliderViewHelper", "resetSlider -> sliderLayout == null");
            return;
        }
        try {
            b.stopTimer();
            b.scrollToPageIndex(0);
            b.startTimer();
        } catch (Throwable th) {
            fve.c("SliderViewHelper", "resetSlider:", th);
        }
    }
}
