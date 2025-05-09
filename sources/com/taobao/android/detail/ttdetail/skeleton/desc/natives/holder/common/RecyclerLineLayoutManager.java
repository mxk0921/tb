package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecyclerLineLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f6907a = 0;
    public final int[] b = new int[2];

    static {
        t2o.a(912262415);
    }

    public RecyclerLineLayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(RecyclerLineLayoutManager recyclerLineLayoutManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/common/RecyclerLineLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f0048e", new Object[]{this, recycler, state, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < getItemCount()) {
            z(recycler, i5, View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(i5, 0), this.b);
            if (getOrientation() == 0) {
                int[] iArr = this.b;
                i4 += iArr[0];
                i3 = 1;
                i6 = iArr[1];
            } else {
                i3 = 1;
                int[] iArr2 = this.b;
                i6 += iArr2[1];
                i4 = iArr2[0];
            }
            i5 += i3;
        }
        for (int i7 = 0; i7 < getItemCount(); i7++) {
            y(recycler, i7, i4, i6);
        }
        if (mode != 1073741824) {
            size = i4;
        }
        if (mode2 != 1073741824) {
            size2 = i6;
        }
        setMeasuredDimension(size, size2);
    }

    public final void y(RecyclerView.Recycler recycler, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325afec8", new Object[]{this, recycler, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        View viewForPosition = recycler.getViewForPosition(i);
        if (viewForPosition != null) {
            viewForPosition.measure(i2, i3);
        }
        recycler.recycleView(viewForPosition);
    }

    public final void z(RecyclerView.Recycler recycler, int i, int i2, int i3, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793b724b", new Object[]{this, recycler, new Integer(i), new Integer(i2), new Integer(i3), iArr});
            return;
        }
        View viewForPosition = recycler.getViewForPosition(i);
        if (viewForPosition != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewForPosition.getLayoutParams();
            viewForPosition.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
            iArr[0] = viewForPosition.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int measuredHeight = viewForPosition.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            iArr[1] = measuredHeight;
            int i4 = this.f6907a;
            if (measuredHeight < i4) {
                iArr[1] = i4;
            } else {
                this.f6907a = measuredHeight;
            }
            recycler.recycleView(viewForPosition);
        }
    }
}
