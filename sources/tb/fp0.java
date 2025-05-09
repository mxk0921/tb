package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.widget.AliDetailScrollerLayoutWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fp0 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f19451a;
    public final /* synthetic */ AliDetailScrollerLayoutWidgetNode b;

    public fp0(AliDetailScrollerLayoutWidgetNode aliDetailScrollerLayoutWidgetNode, View view) {
        this.f19451a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            ((RecyclerView) this.f19451a).smoothScrollToPosition(AliDetailScrollerLayoutWidgetNode.t(null));
        }
    }
}
