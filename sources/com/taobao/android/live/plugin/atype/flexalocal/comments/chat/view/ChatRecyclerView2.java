package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nrj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ChatRecyclerView2 extends RecyclerView implements nrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int recycleViewItemCornerIconPaddingWidthDP = 13;
    private int mCurrentScrolledDy;
    private boolean performClearClick = false;

    static {
        t2o.a(295698593);
        t2o.a(806356053);
    }

    public ChatRecyclerView2(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ChatRecyclerView2 chatRecyclerView2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 589342167:
                return new Boolean(super.dispatchNestedScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (int[]) objArr[4]));
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/view/ChatRecyclerView2");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40f48794", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5)})).booleanValue() : dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.performClearClick) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            this.mCurrentScrolledDy = 0;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12db3b6f", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (getScrollState() == 1) {
            this.mCurrentScrolledDy = i2;
        }
    }

    public void setPerformClearClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e671a33", new Object[]{this, new Boolean(z)});
        } else {
            this.performClearClick = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2320a5d7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr})).booleanValue();
        }
        if (this.mCurrentScrolledDy != 0) {
            i6 = i2 + i4;
            i5 = 0;
        } else {
            i6 = i2;
            i5 = i4;
        }
        return super.dispatchNestedScroll(i, i6, i3, i5, iArr);
    }

    public ChatRecyclerView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
