package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k5p implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22420a;
    public final /* synthetic */ SearchSceneEnhancedWeexModWidget b;

    public k5p(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str) {
        this.b = searchSceneEnhancedWeexModWidget;
        this.f22420a = str;
    }

    @Override // tb.vfw
    public void a(View view) {
        int S2;
        int U2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 49;
        int U22 = (SearchSceneEnhancedWeexModWidget.U2(this.b) + this.b.r) - o1p.b(41);
        if (TextUtils.equals(this.f22420a, abk.FROM_FULL)) {
            S2 = SearchSceneEnhancedWeexModWidget.V2(this.b);
            U2 = SearchSceneEnhancedWeexModWidget.U2(this.b);
        } else {
            if (TextUtils.equals(this.f22420a, "advance")) {
                S2 = SearchSceneEnhancedWeexModWidget.S2(this.b);
                U2 = SearchSceneEnhancedWeexModWidget.U2(this.b);
            }
            ((FrameLayout) this.b.getView()).addView(view, layoutParams);
            view.setTranslationY(U22);
        }
        U22 += S2 - U2;
        ((FrameLayout) this.b.getView()).addView(view, layoutParams);
        view.setTranslationY(U22);
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        } else {
            ((FrameLayout) this.b.getView()).removeView(view);
        }
    }
}
