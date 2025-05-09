package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539776);
    }

    public static DXRootView a(View view) {
        ViewGroup viewGroup;
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("d061cf49", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) == 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
        }
        return null;
    }

    public static Rect b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f941cc34", new Object[]{view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    public static View c(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f94946", new Object[]{str, view});
        }
        if (TextUtils.isEmpty(str)) {
            return view;
        }
        DXRootView a2 = a(view);
        if (a2 == null) {
            fve.e("InfoFlowCardViewUtil", "dxRootView is null");
            return null;
        }
        DXWidgetNode expandWidgetNode = a2.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            fve.e("InfoFlowCardViewUtil", "dxWidgetNode is null");
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str);
        if (queryWidgetNodeByUserId == null) {
            fve.e("InfoFlowCardViewUtil", "childWidgetNode is null");
            return null;
        }
        DXRuntimeContext dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext();
        if (dXRuntimeContext != null) {
            return dXRuntimeContext.D();
        }
        fve.e("InfoFlowCardViewUtil", "runtimeContext is null");
        return null;
    }

    public static float d(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a47ac7c0", new Object[]{rect, rect2})).floatValue();
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom || rect2.right < rect.left || rect2.left > rect.right) {
            return 0.0f;
        }
        if (rect.contains(rect2)) {
            return 1.0f;
        }
        int i = rect2.top;
        int i2 = rect.top;
        if (i < i2) {
            int i3 = rect2.bottom;
            return ((i3 - i2) * 1.0f) / (i3 - i);
        }
        int i4 = rect2.bottom;
        int i5 = rect.bottom;
        if (i4 > i5) {
            return ((i5 - i) * 1.0f) / (i4 - i);
        }
        return 1.0f;
    }

    public static boolean e(View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e90eda", new Object[]{view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            fve.e("InfoFlowCardViewUtil", "viewWidth <= 0 || viewHeight <= 0,viewWidth: " + width);
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        int height2 = globalVisibleRect ? rect.height() : 0;
        if ((globalVisibleRect ? rect.width() : 0) / view.getWidth() > 0.5d && height2 / view.getHeight() > 0.5d) {
            z = true;
        }
        fve.e("InfoFlowCardViewUtil", "isVisibleMoreThanFiftyPercent: " + z);
        return z;
    }
}
