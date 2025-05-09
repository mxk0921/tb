package tb;

import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface pqd extends r9e {
    AbstractGoodsRecyclerAdapter getAdapter();

    CloseRecyclerView getRecyclerView();

    void hideEmptyView(pxg pxgVar);

    void hideErrorView(pxg pxgVar);

    void showEmptyView(pxg pxgVar);

    void showErrorView(pxg pxgVar);
}
