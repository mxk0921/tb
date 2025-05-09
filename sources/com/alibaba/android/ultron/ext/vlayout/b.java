package com.alibaba.android.ultron.ext.vlayout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import tb.gfl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface b {
    boolean a(View view);

    void b(View view);

    gfl c();

    void d(View view, int i);

    void e(View view);

    void f(View view, int i, int i2, int i3, int i4);

    View findViewByPosition(int i);

    gfl g();

    View getChildAt(int i);

    int getChildCount();

    RecyclerView.ViewHolder getChildViewHolder(View view);

    int getContentHeight();

    int getContentWidth();

    int getOrientation();

    int getPaddingBottom();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingTop();

    int getPosition(View view);

    boolean getReverseLayout();

    void h(View view);

    void i(View view);

    View j();

    a k(int i);

    void l(View view);

    boolean m();

    void measureChild(View view, int i, int i2);

    void measureChildWithMargins(View view, int i, int i2);

    boolean n();

    void o(View view, boolean z);

    void p(View view, boolean z);

    int q(int i, int i2, boolean z);

    void r(VirtualLayoutManager.f fVar, View view, int i);

    void v(VirtualLayoutManager.f fVar, View view);

    void x(View view, int i, int i2, int i3, int i4);
}
