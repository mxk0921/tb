package com.taobao.live.home.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.view.LiveListViewHolder;
import com.taobao.live.home.dinamic.view.LiveNormalDecoration;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveStaggeredDecoration extends LiveNormalDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean f;

    static {
        t2o.a(806355509);
    }

    public static /* synthetic */ Object ipc$super(LiveStaggeredDecoration liveStaggeredDecoration, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 285712922) {
            super.onDrawOver((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        } else if (hashCode == 1452916494) {
            super.onDraw((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/view/LiveStaggeredDecoration");
        }
    }

    public final void b(Canvas canvas, View view, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683a81f", new Object[]{this, canvas, view, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        int top = view.getTop() - this.c;
        int left = view.getLeft();
        int right = view.getRight();
        int bottom = view.getBottom();
        if (!z3) {
            int left2 = view.getLeft();
            if (z) {
                i = this.f10961a;
            } else {
                i = this.b;
            }
            left = left2 - i;
            int right2 = view.getRight();
            if (z2) {
                i2 = this.f10961a;
            } else {
                i2 = this.b;
            }
            right = right2 + i2;
        }
        canvas.drawRect(left, top, right, bottom, null);
    }

    public final boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cfd672f", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i % i2 == 0) {
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501638bd", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((i + 1) % i2 == 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.live.home.dinamic.view.LiveNormalDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        DinamicDataObject g0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        rect.set(0, 0, 0, 0);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        int spanCount = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount();
        int width = recyclerView.getWidth();
        int i = width / spanCount;
        int i2 = spanCount - 1;
        int i3 = width - ((this.b * i2) * 2);
        int i4 = this.f10961a;
        int i5 = ((i3 - i4) - i4) / spanCount;
        int spanIndex = layoutParams.getSpanIndex();
        if (spanIndex == 0) {
            rect.left = this.f10961a;
        } else if (spanIndex == i2) {
            rect.left = (i - this.f10961a) - i5;
        } else {
            int i6 = this.b;
            rect.left = (i6 * 2) - ((((i - i5) * spanIndex) - ((i6 * 2) * (spanIndex - 1))) - this.f10961a);
        }
        if ((recyclerView.getChildViewHolder(view) instanceof LiveListViewHolder) && (g0 = ((LiveListViewHolder) recyclerView.getChildViewHolder(view)).g0()) != null && g0.noLeftRightSpace) {
            rect.left = 0;
            rect.right = 0;
        }
        if (childAdapterPosition == 0) {
            this.f = layoutParams.isFullSpan();
            rect.top = this.c;
        } else if (childAdapterPosition != 1 || this.f) {
            rect.top = this.c;
        } else {
            rect.top = this.c;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5699bf0e", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView.getChildViewHolder(childAt) instanceof LiveListViewHolder) {
                DinamicDataObject g0 = ((LiveListViewHolder) recyclerView.getChildViewHolder(childAt)).g0();
                if (g0 == null || !g0.noLeftRightSpace) {
                    z = false;
                } else {
                    z = true;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams()).getSpanIndex();
                if (childAdapterPosition >= 0) {
                    int spanCount = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount();
                    if (childAdapterPosition == 0) {
                        b(canvas, childAt, c(spanIndex, spanCount), d(spanIndex, spanCount), z, true);
                    } else if (childAdapterPosition != 1 || this.f) {
                        b(canvas, childAt, c(spanIndex, spanCount), d(spanIndex, spanCount), z, false);
                    } else {
                        b(canvas, childAt, c(spanIndex, spanCount), d(spanIndex, spanCount), z, true);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView, state});
        } else {
            super.onDrawOver(canvas, recyclerView, state);
        }
    }
}
