package tb;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ca6 {
    void a(MotionEvent motionEvent);

    ValueAnimator.AnimatorUpdateListener b(int i);

    boolean c();

    boolean canRefresh();

    void d(boolean z);

    void e(DXRefreshLayout.i iVar, View view, View view2);

    void f(int i, int i2, int i3);

    void g(int i);

    View getView();

    void h(sb6 sb6Var);

    View i();
}
