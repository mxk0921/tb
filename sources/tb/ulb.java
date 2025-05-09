package tb;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ulb extends wlb, o6d {
    int A();

    @Deprecated
    int D();

    int J();

    View i(ViewGroup viewGroup);

    @Override // tb.wlb
    /* synthetic */ void onActive(uq9 uq9Var);

    @Override // tb.wlb
    /* synthetic */ void onAppear(uq9 uq9Var);

    @Override // tb.wlb
    /* synthetic */ void onBindData(uq9 uq9Var, a aVar, int i);

    @Override // tb.wlb
    /* synthetic */ void onBindData(uq9 uq9Var, a aVar, int i, List list);

    @Override // tb.o6d
    /* synthetic */ void onCreate();

    @Override // tb.wlb
    /* synthetic */ void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder);

    /* synthetic */ void onDestroy();

    @Override // tb.wlb
    /* synthetic */ void onDisActive(uq9 uq9Var);

    @Override // tb.wlb
    /* synthetic */ void onDisAppear(uq9 uq9Var);

    /* synthetic */ void onPause();

    @Override // tb.o6d
    /* synthetic */ void onRealStart();

    @Override // tb.o6d
    /* synthetic */ void onRealStop();

    @Override // tb.wlb
    /* synthetic */ void onRecycle(uq9 uq9Var);

    /* synthetic */ void onResume();

    /* synthetic */ void onStart();

    @Override // tb.o6d
    /* synthetic */ void onStop();

    @Override // tb.wlb
    /* synthetic */ void onWillActive(uq9 uq9Var);

    @Override // tb.wlb
    /* synthetic */ void onWillDisActive(uq9 uq9Var);

    String y();
}
