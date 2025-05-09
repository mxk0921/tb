package tb;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509554);
    }

    public static final RecyclerView a(ViewGroup viewGroup, g1a<? super RecyclerView, xhv> g1aVar, d1a<? extends RecyclerView> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("1e78cdfe", new Object[]{viewGroup, g1aVar, d1aVar});
        }
        ckf.g(viewGroup, "<this>");
        ckf.g(g1aVar, "init");
        RecyclerView recyclerView = d1aVar == null ? null : (RecyclerView) d1aVar.invoke();
        if (recyclerView == null) {
            recyclerView = new RecyclerView(viewGroup.getContext());
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            recyclerView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        g1aVar.invoke(recyclerView);
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
