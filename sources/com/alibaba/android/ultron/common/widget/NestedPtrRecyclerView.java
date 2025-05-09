package com.alibaba.android.ultron.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParentHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.views.recycler.PtrRecyclerView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NestedPtrRecyclerView extends PtrRecyclerView implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mNestedScrollEnable;
    private NestedScrollingParentHelper mParentHelper;

    static {
        t2o.a(153092157);
    }

    public NestedPtrRecyclerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(NestedPtrRecyclerView nestedPtrRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1226565810) {
            super.onNestedScrollAccepted((View) objArr[0], (View) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1235539846) {
            super.onStopNestedScroll((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/common/widget/NestedPtrRecyclerView");
        }
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ae0ec59", new Object[]{this})).intValue();
        }
        return this.mParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mNestedScrollEnable) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        int nestedScrollAxes = this.mParentHelper.getNestedScrollAxes();
        if ((nestedScrollAxes & 2) != 0 && i4 != 0) {
            scrollBy(0, i4);
        } else if ((nestedScrollAxes & 1) != 0 && i3 != 0) {
            scrollBy(i3, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491be8b2", new Object[]{this, view, view2, new Integer(i)});
            return;
        }
        super.onNestedScrollAccepted(view, view2, i);
        this.mParentHelper.onNestedScrollAccepted(view, view2, i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.mNestedScrollEnable = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a4d786", new Object[]{this, view});
            return;
        }
        super.onStopNestedScroll(view);
        this.mParentHelper.onStopNestedScroll(view);
    }

    public NestedPtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollEnable = false;
        this.mParentHelper = new NestedScrollingParentHelper(this);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        } else {
            this.mParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mParentHelper.onStopNestedScroll(view, i);
        this.mNestedScrollEnable = false;
    }
}
