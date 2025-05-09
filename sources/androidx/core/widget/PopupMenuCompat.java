package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PopupMenuCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private PopupMenuCompat() {
    }

    public static View.OnTouchListener getDragToOpenListener(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnTouchListener) ipChange.ipc$dispatch("6ee261f8", new Object[]{obj});
        }
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
