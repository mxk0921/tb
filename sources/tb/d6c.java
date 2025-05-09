package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface d6c extends bpk, TBSwipeRefreshLayout.OnPushLoadMoreListener, TBSwipeRefreshLayout.OnPullRefreshListener, LockableRecycerView.c, TBVideoPagerSnapHelper.b, nkc {
    void onScrollStateChanged(RecyclerView recyclerView, int i);

    void onScrolled(RecyclerView recyclerView, int i, int i2);
}
