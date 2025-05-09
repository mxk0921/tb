package com.taobao.android.tbsku.image;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.image.accessories.FixedViewAdapter;
import com.taobao.android.tbsku.image.accessories.GridSpanSizeLookup;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kk9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RecyclerViewFixed extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter mAdapter;
    private boolean mAsTargetView;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private float mLastMotionX;
    private float mLastMotionY;
    private a mWindowStateListener;
    private ArrayList<kk9> mStartViewInfos = new ArrayList<>();
    private ArrayList<kk9> mEndViewInfos = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(785383536);
    }

    public RecyclerViewFixed(Context context) {
        super(context);
    }

    private boolean childFirstIntercept(ViewGroup viewGroup) {
        boolean childInterceptValue;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1082eef8", new Object[]{this, viewGroup})).booleanValue();
        }
        if (viewGroup == null) {
            return false;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                childInterceptValue = childFirstIntercept((ViewGroup) childAt);
            } else {
                childInterceptValue = getChildInterceptValue(childAt);
            }
            z = childInterceptValue | z;
        }
        return getChildInterceptValue(viewGroup) | z;
    }

    private boolean getChildInterceptValue(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eecba7a", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Object tag = view.getTag(R.id.sku_child_first_intercept);
        if (tag instanceof Boolean) {
            return ((Boolean) tag).booleanValue();
        }
        return false;
    }

    private int indexOfFixedInfos(List<kk9> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c08fb73", new Object[]{this, list, view})).intValue();
        }
        if (list == null || view == null) {
            return 0;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).a() == view.hashCode()) {
                return i;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewFixed recyclerViewFixed, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1480138640:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/image/RecyclerViewFixed");
        }
    }

    private boolean removeFixedViewInfo(View view, ArrayList<kk9> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1c5f86", new Object[]{this, view, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kk9 kk9Var = arrayList.get(i);
            if (kk9Var.b() == view) {
                if (view.getParent() == this) {
                    removeView(view);
                }
                if (arrayList.remove(i) == kk9Var) {
                    return true;
                }
            }
        }
        return false;
    }

    private void spanStaggeredGridStartEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7420474", new Object[]{this});
            return;
        }
        spanStaggeredGridViews(this.mStartViewInfos);
        spanStaggeredGridViews(this.mEndViewInfos);
    }

    private void spanStaggeredGridViews(List<kk9> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb6fc7e", new Object[]{this, list});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (list != null && (layoutManager instanceof StaggeredGridLayoutManager)) {
            for (kk9 kk9Var : list) {
                View b = kk9Var.b();
                if (b != null) {
                    ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                    if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                        StaggeredGridLayoutManager.LayoutParams layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
                        layoutParams2.setFullSpan(true);
                        b.setLayoutParams(layoutParams2);
                    } else {
                        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                    }
                }
            }
        }
    }

    public void addEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749bffcc", new Object[]{this, view});
        } else if (view != null) {
            this.mEndViewInfos.add(Math.max(this.mEndViewInfos.size(), 0), new kk9(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof FixedViewAdapter)) {
                FixedViewAdapter fixedViewAdapter = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, this.mAdapter);
                this.mAdapter = fixedViewAdapter;
                super.setAdapter(fixedViewAdapter);
                return;
            }
            this.mAdapter.notifyItemInserted(adapter.getItemCount() - 1);
        }
    }

    public void addStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf378ba5", new Object[]{this, view});
        } else if (view != null) {
            this.mStartViewInfos.add(new kk9(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof FixedViewAdapter)) {
                FixedViewAdapter fixedViewAdapter = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, this.mAdapter);
                this.mAdapter = fixedViewAdapter;
                super.setAdapter(fixedViewAdapter);
                return;
            }
            adapter.notifyItemInserted(this.mStartViewInfos.size() - 1);
        }
    }

    public int getEndViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue();
        }
        return this.mEndViewInfos.size();
    }

    public int getStartViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue();
        }
        return this.mStartViewInfos.size();
    }

    public boolean hasEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86952009", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<kk9> it = this.mEndViewInfos.iterator();
        while (it.hasNext()) {
            kk9 next = it.next();
            if (next != null && view == next.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476981a2", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<kk9> it = this.mStartViewInfos.iterator();
        while (it.hasNext()) {
            kk9 next = it.next();
            if (next != null && view == next.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3 != 3) goto L_0x0060;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tbsku.image.RecyclerViewFixed.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            int r3 = r6.getActionMasked()
            if (r3 == 0) goto L_0x0041
            if (r3 == r0) goto L_0x0037
            if (r3 == r2) goto L_0x002a
            r2 = 3
            if (r3 == r2) goto L_0x0037
            goto L_0x0060
        L_0x002a:
            float r2 = r6.getY()
            r5.mLastMotionY = r2
            float r2 = r6.getX()
            r5.mLastMotionX = r2
            goto L_0x0060
        L_0x0037:
            r2 = 0
            r5.mInitialMotionY = r2
            r5.mLastMotionY = r2
            r5.mInitialMotionX = r2
            r5.mLastMotionX = r2
            goto L_0x0060
        L_0x0041:
            float r2 = r6.getY()
            r5.mInitialMotionY = r2
            r5.mLastMotionY = r2
            float r2 = r6.getX()
            r5.mInitialMotionX = r2
            r5.mLastMotionX = r2
            boolean r2 = r5.mAsTargetView
            if (r2 == 0) goto L_0x0060
            android.view.ViewParent r2 = r5.getParent()
            if (r2 == 0) goto L_0x005e
            r2.requestDisallowInterceptTouchEvent(r0)
        L_0x005e:
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            boolean r3 = r5.childFirstIntercept(r5)
            if (r3 != 0) goto L_0x0072
            boolean r6 = super.onInterceptTouchEvent(r6)
            boolean r1 = r5.mAsTargetView
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0071
            return r0
        L_0x0071:
            return r6
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.RecyclerViewFixed.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0074;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tbsku.image.RecyclerViewFixed.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            r2[r0] = r10
            java.lang.Object r10 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001c:
            int r3 = r10.getActionMasked()
            if (r3 == r0) goto L_0x006b
            if (r3 == r2) goto L_0x0028
            r1 = 3
            if (r3 == r1) goto L_0x006b
            goto L_0x0074
        L_0x0028:
            float r2 = r10.getY()
            float r3 = r10.getX()
            float r4 = r9.mLastMotionX
            float r4 = r3 - r4
            float r5 = r9.mLastMotionY
            float r5 = r2 - r5
            float r6 = r9.mInitialMotionX
            float r6 = r3 - r6
            float r6 = java.lang.Math.abs(r6)
            float r7 = r9.mInitialMotionY
            float r7 = r2 - r7
            float r7 = java.lang.Math.abs(r7)
            boolean r8 = r9.mAsTargetView
            if (r8 == 0) goto L_0x0066
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0066
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            android.view.ViewParent r4 = r9.getParent()
            if (r4 == 0) goto L_0x0066
            r4.requestDisallowInterceptTouchEvent(r1)
        L_0x0066:
            r9.mLastMotionY = r2
            r9.mLastMotionX = r3
            goto L_0x0074
        L_0x006b:
            r1 = 0
            r9.mInitialMotionY = r1
            r9.mLastMotionY = r1
            r9.mInitialMotionX = r1
            r9.mLastMotionX = r1
        L_0x0074:
            boolean r10 = super.onTouchEvent(r10)
            boolean r1 = r9.mAsTargetView
            if (r1 == 0) goto L_0x007d
            return r0
        L_0x007d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.RecyclerViewFixed.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean removeAllEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a9a07b", new Object[]{this})).booleanValue();
        }
        int size = this.mEndViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((FixedViewAdapter) this.mAdapter).Q()) {
                this.mAdapter.notifyItemRangeRemoved(itemCount - size, size);
                Iterator<kk9> it = this.mEndViewInfos.iterator();
                while (it.hasNext()) {
                    kk9 next = it.next();
                    if (!(next == null || next.b() == null || next.b().getParent() != this)) {
                        removeView(next.b());
                    }
                }
            }
        }
        this.mEndViewInfos.clear();
        return true;
    }

    public boolean removeAllStartViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22d71994", new Object[]{this})).booleanValue();
        }
        int size = this.mStartViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && ((FixedViewAdapter) adapter).S()) {
            this.mAdapter.notifyItemRangeRemoved(0, size);
            Iterator<kk9> it = this.mStartViewInfos.iterator();
            while (it.hasNext()) {
                kk9 next = it.next();
                if (!(next == null || next.b() == null || next.b().getParent() != this)) {
                    removeView(next.b());
                }
            }
        }
        this.mStartViewInfos.clear();
        return true;
    }

    public boolean removeEndView(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce6d073", new Object[]{this, view})).booleanValue();
        }
        if (this.mEndViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int size = this.mEndViewInfos.size();
        int indexOfFixedInfos = indexOfFixedInfos(this.mEndViewInfos, view);
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((FixedViewAdapter) this.mAdapter).T(view)) {
                this.mAdapter.notifyItemRemoved(itemCount - (size - indexOfFixedInfos));
                if (view.getParent() == this) {
                    removeView(view);
                }
                return removeFixedViewInfo(view, this.mEndViewInfos) | z;
            }
        }
        z = false;
        return removeFixedViewInfo(view, this.mEndViewInfos) | z;
    }

    public boolean removeStartView(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d010bf8c", new Object[]{this, view})).booleanValue();
        }
        if (this.mStartViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int indexOfFixedInfos = indexOfFixedInfos(this.mStartViewInfos, view);
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter == null || !((FixedViewAdapter) adapter).U(view)) {
            z = false;
        } else {
            this.mAdapter.notifyItemRemoved(indexOfFixedInfos);
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        return removeFixedViewInfo(view, this.mStartViewInfos) | z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        FixedViewAdapter fixedViewAdapter = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, adapter);
        this.mAdapter = fixedViewAdapter;
        super.setAdapter(fixedViewAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58391f90", new Object[]{this, layoutManager});
            return;
        }
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new GridSpanSizeLookup(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
    }

    public void setWindowStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d69e5a", new Object[]{this, aVar});
        }
    }

    public void treatAsTargetView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a917fd8b", new Object[]{this, new Boolean(z)});
        } else {
            this.mAsTargetView = z;
        }
    }

    public RecyclerViewFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecyclerViewFixed(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
