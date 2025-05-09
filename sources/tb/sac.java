package tb;

import android.view.View;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface sac extends r9e {
    AbstractGoodsRecyclerAdapter getAdapter();

    View getContentView();

    void showEmpty(String str);

    void showError(String str);

    void showGoodList(int i, String str);
}
