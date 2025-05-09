package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o06 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DXNativeRecyclerView f25062a;
    public final /* synthetic */ DXHighlightScrollableLayoutWidgetNode b;

    public o06(DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode, DXNativeRecyclerView dXNativeRecyclerView) {
        this.b = dXHighlightScrollableLayoutWidgetNode;
        this.f25062a = dXNativeRecyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.f25062a.getAdapter() != null) {
                this.f25062a.getAdapter().notifyDataSetChanged();
            }
        } catch (Throwable th) {
            xv5.b(th);
            DXHighlightScrollableLayoutWidgetNode.a(this.b);
        }
    }
}
