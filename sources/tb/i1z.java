package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.JvmStatic;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class i1z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i1z INSTANCE = new i1z();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21046a;

    static {
        t2o.a(479199487);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85d191", new Object[0]);
        } else {
            f21046a = false;
        }
    }

    @JvmStatic
    public static final void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75bea556", new Object[]{recyclerView});
            return;
        }
        try {
            if (!vav.a(c9x.CART_BIZ_NAME, "monitorWhitePageStatus", true) || f21046a) {
                return;
            }
            if (recyclerView == null) {
                hav.d("UltronWhitePageMonitor", "recyclerView is null");
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                if (itemCount <= 0) {
                    hav.d("UltronWhitePageMonitor", "itemCount <= 0");
                    return;
                }
                ub3.e(ub3.a.a("CartRenderAnomaly").sampling(0.1f).branchEntry(true));
                f21046a = true;
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    hav.a("UltronWhitePageMonitor", "没有子View");
                    ub3.e(ub3.a.a("CartRenderAnomaly").sampling(1.0f).branch(1).message("没有子View").indicator("c1", String.valueOf(itemCount)).indicator("c2", "0").indicator("c3", "0").dimension("d1", "白屏"));
                    return;
                }
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = recyclerView.getChildAt(i3);
                    if (childAt != null && (childAt instanceof DXRootView)) {
                        i2++;
                        if (((DXRootView) childAt).getVisibility() == 0 && (((DXRootView) childAt).getChildCount() == 0 || ((DXRootView) childAt).getHeight() == 0)) {
                            i++;
                        }
                    }
                }
                if (i == 0) {
                    hav.d("UltronWhitePageMonitor", "没有白屏");
                } else if (i == i2) {
                    hav.a("UltronWhitePageMonitor", "所有DXRootView渲染失败");
                    ub3.e(ub3.a.a("CartRenderAnomaly").sampling(1.0f).branch(2).message("所有DXRootView渲染失败").indicator("c1", String.valueOf(itemCount)).indicator("c2", String.valueOf(i2)).indicator("c3", String.valueOf(i)).dimension("d1", "白屏"));
                } else {
                    hav.a("UltronWhitePageMonitor", "部分DXRootView渲染失败");
                    ub3.e(ub3.a.a("CartRenderAnomaly").sampling(1.0f).branch(3).message("部分DXRootView渲染失败").indicator("c1", String.valueOf(itemCount)).indicator("c2", String.valueOf(i2)).indicator("c3", String.valueOf(i)).dimension("d1", "渲染错误"));
                }
            }
        } catch (Exception e) {
            xh8 c = xh8.a("Ultron").c("白屏监控逻辑异常");
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            f9v.q(c.message(message));
        }
    }
}
