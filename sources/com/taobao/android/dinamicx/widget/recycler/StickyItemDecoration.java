package com.taobao.android.dinamicx.widget.recycler;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import tb.t2o;
import tb.ysd;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public StickyLayout f7472a;
    public ysd b;
    public final boolean g;
    public final SparseArray<List<RecyclerView.ViewHolder>> c = new SparseArray<>();
    public final SparseArray<RecyclerView.ViewHolder> d = new SparseArray<>();
    public final Set<Integer> e = new HashSet();
    public final List<String> f = new ArrayList();
    public final SparseArray<RecyclerView.ViewHolder> h = new SparseArray<>();

    static {
        t2o.a(444597531);
    }

    public StickyItemDecoration(boolean z) {
        this.g = false;
        this.g = z;
    }

    public static /* synthetic */ Object ipc$super(StickyItemDecoration stickyItemDecoration, String str, Object... objArr) {
        if (str.hashCode() == 285712922) {
            super.onDrawOver((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/StickyItemDecoration");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cc4aaf", new Object[]{this});
        } else {
            ((ArrayList) this.f).clear();
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView, View view, RecyclerView.Adapter adapter, int i, int i2) {
        int i3;
        int measuredHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01ddfd4", new Object[]{this, canvas, recyclerView, view, adapter, new Integer(i), new Integer(i2)});
            return;
        }
        View view2 = d(recyclerView, i, true).itemView;
        canvas.save();
        Rect rect = new Rect();
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            recyclerView.getLayoutManager().calculateItemDecorationsForChild(view, rect);
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        if (zg5.L2()) {
            if (g(i)) {
                i3 = rect.left;
            }
            int f = f(i);
            int e = e(recyclerView, adapter.getItemCount(), view, view2, i, i2, f);
            measuredHeight = view2.getMeasuredHeight() + e;
            if (measuredHeight > 0 && e < recyclerView.getMeasuredHeight()) {
                int e2 = this.b.e(i);
                if (g(e2)) {
                    String valueOf = String.valueOf(e2);
                    if (e == f) {
                        if (!((ArrayList) this.f).contains(valueOf)) {
                            ((ArrayList) this.f).add(valueOf);
                            this.b.L(e2, true);
                        }
                    } else if (e > zg5.Y2() + f && ((ArrayList) this.f).contains(valueOf)) {
                        ((ArrayList) this.f).remove(valueOf);
                        this.b.L(e2, false);
                    }
                }
                canvas.translate(paddingLeft, e);
                view2.draw(canvas);
                canvas.restore();
                view2.layout(paddingLeft, e, view2.getMeasuredWidth() + paddingLeft, measuredHeight);
                return;
            }
        }
        i3 = rect.left;
        paddingLeft += i3;
        int f2 = f(i);
        int e3 = e(recyclerView, adapter.getItemCount(), view, view2, i, i2, f2);
        measuredHeight = view2.getMeasuredHeight() + e3;
        if (measuredHeight > 0) {
        }
    }

    public final RecyclerView.ViewHolder c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("bb619519", new Object[]{this, new Integer(i)});
        }
        return this.d.get(i);
    }

    public RecyclerView.ViewHolder d(RecyclerView recyclerView, int i, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("cec6ef54", new Object[]{this, recyclerView, new Integer(i), new Boolean(z)});
        }
        int e = this.b.e(i);
        if (this.g) {
            viewHolder = this.h.get(e);
        } else {
            viewHolder = c(e);
        }
        List<Integer> C = this.b.C();
        if (C != null) {
            i2 = C.indexOf(Integer.valueOf(e));
        } else {
            i2 = -1;
        }
        RecyclerView.ViewHolder viewHolder2 = null;
        if (viewHolder != null && i2 >= 0) {
            i(e, viewHolder);
            viewHolder = null;
        }
        if (viewHolder == null) {
            List<RecyclerView.ViewHolder> list = this.c.get(this.b.getItemViewType(e));
            if (list != null && list.size() > 0) {
                viewHolder2 = list.remove(0);
            }
            if (viewHolder2 == null) {
                ysd ysdVar = this.b;
                viewHolder = ysdVar.onCreateViewHolder(recyclerView, ysdVar.getItemViewType(e));
            } else {
                viewHolder = viewHolder2;
            }
            View view = viewHolder.itemView;
            view.setTag(R.id.dx_recycler_sticky_holder, viewHolder);
            view.setTag(R.id.dx_recycler_sticky_key, Integer.valueOf(e));
            this.b.c(viewHolder, e);
            if (i2 >= 0) {
                C.remove(i2);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i5 = marginLayoutParams.leftMargin;
                i4 = marginLayoutParams.topMargin;
                i3 = marginLayoutParams.rightMargin;
                i6 = marginLayoutParams.bottomMargin;
            } else {
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((((recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) - i5) - i3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(i5, i4, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + i6);
            h(e, viewHolder);
        }
        if (z && viewHolder.itemView.getParent() == null && this.f7472a != null) {
            this.f7472a.addView(viewHolder.itemView, viewHolder.itemView.getLayoutParams());
        }
        if (this.g) {
            this.h.put(e, viewHolder);
        }
        return viewHolder;
    }

    public final int e(RecyclerView recyclerView, int i, View view, View view2, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be69605d", new Object[]{this, recyclerView, new Integer(i), view, view2, new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        int height = view2.getHeight();
        int y = ((int) view.getY()) - height;
        if (i3 == 0) {
            int childCount = recyclerView.getChildCount();
            int e = this.b.e(i2);
            int i5 = 1;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i5));
                if (childAdapterPosition == -1 || !this.b.K(childAdapterPosition) || e == this.b.e(childAdapterPosition)) {
                    i5++;
                } else {
                    int y2 = ((int) recyclerView.getChildAt(i5).getY()) - (height + d(recyclerView, childAdapterPosition, false).itemView.getHeight());
                    if (y2 < 0) {
                        return y2;
                    }
                }
            }
            y = Math.max(i4, y);
        }
        return Math.max(i4, y);
    }

    public final int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9bee03d", new Object[]{this, new Integer(i)})).intValue();
        }
        ysd ysdVar = this.b;
        if (ysdVar == null) {
            return 0;
        }
        return ysdVar.z(i);
    }

    public final boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("296eb38d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ysd ysdVar = this.b;
        if (ysdVar == null || !ysdVar.o(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        rect.set(0, 0, 0, 0);
        if (recyclerView.getAdapter() != null && this.b != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            m(recyclerView, childAdapterPosition);
            if (g(childAdapterPosition)) {
                RecyclerView.ViewHolder d = d(recyclerView, childAdapterPosition, true);
                ViewGroup.LayoutParams layoutParams = d.itemView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i = marginLayoutParams.topMargin;
                    i3 = marginLayoutParams.rightMargin;
                    i2 = marginLayoutParams.bottomMargin;
                } else {
                    i2 = 0;
                    i = 0;
                    i3 = 0;
                }
                rect.set(i4, d.itemView.getMeasuredHeight() - i, i3, i2);
            }
        }
    }

    public final void h(int i, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324aea73", new Object[]{this, new Integer(i), viewHolder});
        } else {
            this.d.put(i, viewHolder);
        }
    }

    public final void i(int i, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e52b60", new Object[]{this, new Integer(i), viewHolder});
            return;
        }
        this.d.remove(i);
        if (viewHolder != null) {
            int itemViewType = this.b.getItemViewType(i);
            List<RecyclerView.ViewHolder> list = this.c.get(itemViewType);
            if (list == null) {
                list = new LinkedList<>();
                this.c.put(itemViewType, list);
            }
            list.add(viewHolder);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5b3d65", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (int i = 0; i < this.f7472a.getChildCount(); i++) {
            View childAt = this.f7472a.getChildAt(i);
            int e = this.b.e(((Integer) childAt.getTag(R.id.dx_recycler_sticky_key)).intValue());
            if (!((HashSet) this.e).contains(Integer.valueOf(e))) {
                i(e, (RecyclerView.ViewHolder) childAt.getTag(R.id.dx_recycler_sticky_holder));
                arrayList.add(childAt);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f7472a.removeView((View) it.next());
        }
    }

    public void k(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28e27f9", new Object[]{this, adapter});
        } else if (adapter instanceof ysd) {
            this.b = (ysd) adapter;
        }
    }

    public void l(StickyLayout stickyLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de38418", new Object[]{this, stickyLayout});
        } else {
            this.f7472a = stickyLayout;
        }
    }

    public final void m(RecyclerView recyclerView, int i) {
        ysd ysdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497c4b8a", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!zg5.N2() || (ysdVar = this.b) == null || i >= ysdVar.q()) {
            if (this.g) {
                this.h.clear();
            } else {
                ((HashSet) this.e).clear();
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i2));
                    if (g(childAdapterPosition) || (i2 == 0 && this.b.K(childAdapterPosition))) {
                        ((HashSet) this.e).add(Integer.valueOf(this.b.e(childAdapterPosition)));
                    }
                }
            }
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        if (this.b != null) {
            int childCount = recyclerView.getChildCount();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof BaseStickyAdapter) {
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                    if (g(childAdapterPosition) || (i == 0 && this.b.K(childAdapterPosition))) {
                        b(canvas, recyclerView, childAt, adapter, childAdapterPosition, i);
                    }
                }
            }
        }
    }
}
