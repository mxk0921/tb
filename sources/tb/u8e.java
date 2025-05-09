package tb;

import android.graphics.drawable.Drawable;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface u8e extends trc, wlb {
    Set<atb> B();

    void C();

    void E();

    boolean K();

    boolean L();

    /* synthetic */ atb a();

    void b();

    atb getDWInstance();

    int getVideoLength();

    int getVideoProgress();

    boolean isPlaying();

    void j(String str);

    int k(int i);

    String n();

    /* synthetic */ void onActive(uq9 uq9Var);

    /* synthetic */ void onAppear(uq9 uq9Var);

    /* synthetic */ void onBindData(uq9 uq9Var, a aVar, int i);

    /* synthetic */ void onBindData(uq9 uq9Var, a aVar, int i, List list);

    /* synthetic */ void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder);

    @Override // tb.trc
    /* synthetic */ void onDataUpdate(uq9 uq9Var);

    /* synthetic */ void onDisActive(uq9 uq9Var);

    /* synthetic */ void onDisAppear(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onPauseMedia(uq9 uq9Var);

    /* synthetic */ void onRecycle(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onRecyclePlayer(uq9 uq9Var, boolean z);

    @Override // tb.trc
    /* synthetic */ void onRequestMediaPlayer(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onShowCover(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str);

    @Override // tb.trc
    /* synthetic */ void onStartMedia(uq9 uq9Var, boolean z, boolean z2);

    @Override // tb.trc
    /* synthetic */ void onStopMedia(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onUTPairsUpdate(uq9 uq9Var);

    /* synthetic */ void onWillActive(uq9 uq9Var);

    /* synthetic */ void onWillDisActive(uq9 uq9Var);

    void p();

    void r();

    /* synthetic */ void s();

    void setPlayRate(float f);

    String t();

    void u(float f);

    void update12003UtParams(Map<String, String> map);

    void w(int i, boolean z);

    void z();
}
