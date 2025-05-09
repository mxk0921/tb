package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f20144a;

    static {
        t2o.a(486539673);
    }

    public gpf(RecyclerView recyclerView) {
        this.f20144a = recyclerView;
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c1b264b1", new Object[]{this, view});
        }
        if (view != null) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.addView(view);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            view = frameLayout;
        }
        b(view);
        return view;
    }

    public final void b(View view) {
        RecyclerView.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992b0012", new Object[]{this, view});
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = this.f20144a.getLayoutManager().generateLayoutParams(layoutParams2);
            } else {
                layoutParams = this.f20144a.getLayoutManager().generateDefaultLayoutParams();
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
