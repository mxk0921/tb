package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.widget.BaseM3CellWidget;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jx1 implements f64.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseM3CellWidget f22263a;

    public jx1(BaseM3CellWidget baseM3CellWidget) {
        this.f22263a = baseM3CellWidget;
    }

    @Override // tb.f64.a
    public void invoke(Object obj) {
        p59 feedback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        M3CellBean H0 = BaseM3CellWidget.H0(this.f22263a);
        if (H0 != null && (feedback = H0.getFeedback()) != null && !feedback.c()) {
            View view = this.f22263a.itemView;
            ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            ((ohb) view).hideFeedback();
        }
    }
}
