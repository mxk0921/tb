package tb;

import android.view.ViewGroup;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface jyc {
    ViewGroup.LayoutParams generateLayoutParams(DXWidgetNode dXWidgetNode);

    xk9 getFlattenHolder();

    void setWidgetNode(DXWidgetNode dXWidgetNode);

    boolean updateLayoutParams(ViewGroup.LayoutParams layoutParams, DXWidgetNode dXWidgetNode);
}
