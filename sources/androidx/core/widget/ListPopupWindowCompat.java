package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ListPopupWindowCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ListPopupWindowCompat() {
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("a74503d8", new Object[]{obj, view}) : createDragToOpenListener((ListPopupWindow) obj, view);
    }

    public static View.OnTouchListener createDragToOpenListener(ListPopupWindow listPopupWindow, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("ab1f3bd8", new Object[]{listPopupWindow, view}) : listPopupWindow.createDragToOpenListener(view);
    }
}
