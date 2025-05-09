package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m2p implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f23743a;

    public m2p(o2p o2pVar, ViewGroup viewGroup) {
        this.f23743a = viewGroup;
    }

    @Override // tb.vfw
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        layoutParams.bottomMargin = o1p.b(10);
        layoutParams.rightMargin = o1p.b(15);
        this.f23743a.addView(view, layoutParams);
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        }
    }
}
