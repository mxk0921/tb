package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter;
import com.taobao.android.searchbaseframe.util.ListStyle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface kib<VIEW, PRESENTER> extends p9e<VIEW, PRESENTER> {
    void A(int i);

    ViewGroup B();

    void C(int i, BaseListAdapter baseListAdapter);

    ViewGroup D();

    void E(int i, int i2, BaseListAdapter baseListAdapter);

    void F(yw1 yw1Var);

    void G(int i, SparseArrayCompat<Boolean> sparseArrayCompat);

    void H(yw1 yw1Var, boolean z);

    boolean I();

    void J(ListStyle listStyle);

    void K(RecyclerView.Adapter adapter);

    void N();

    void addFooterView(View view);

    void addHeaderView(View view);

    RecyclerView getRecyclerView();

    void x();

    int y();
}
