package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.widget.AKVerticalGestureHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lrr implements AKVerticalGestureHandler.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f23533a = new JSONObject();
    public final /* synthetic */ TBOrderDetailActivity b;

    public lrr(TBOrderDetailActivity tBOrderDetailActivity) {
        this.b = tBOrderDetailActivity;
    }

    @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.c
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03d1338", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.c
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a18b2e", new Object[]{this, view});
        } else {
            TBOrderDetailActivity.O3(this.b).o((int) (TBOrderDetailActivity.N3(this.b).c() - view.getTranslationY()));
        }
    }

    @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.c
    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c998742f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return TBOrderDetailActivity.P3(this.b).canScrollVertically(-1);
    }

    @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34137239", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.c
    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc8f5da", new Object[]{this, view, new Integer(i)});
        } else if (TBOrderDetailActivity.N3(this.b).j()) {
            this.f23533a.put("yOffset", (Object) String.valueOf(f2u.h(this.b, (int) view.getTranslationY())));
            if (i == 3 || i == 2 || i == 1) {
                if (this.b.q3() != null) {
                    this.b.q3().j("onOrderBodyScrollEnd", this.f23533a);
                } else {
                    return;
                }
            }
            TBOrderDetailActivity.O3(this.b).o((int) (TBOrderDetailActivity.N3(this.b).c() - view.getTranslationY()));
        }
    }
}
