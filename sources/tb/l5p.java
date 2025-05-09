package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l5p implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchSceneEnhancedWeexModWidget f23123a;

    public l5p(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        this.f23123a = searchSceneEnhancedWeexModWidget;
    }

    @Override // tb.vfw
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
        } else {
            ((FrameLayout) this.f23123a.getView()).addView(view, 0);
        }
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        } else {
            ((FrameLayout) this.f23123a.getView()).removeView(view);
        }
    }
}
