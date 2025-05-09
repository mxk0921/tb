package com.taobao.nestedscroll.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.krj;
import tb.lrj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ChildRecyclerView extends AbstractRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private lrj mNestedScrollParent;

    public ChildRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ChildRecyclerView childRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == 1276176143) {
            return new Boolean(super.isAccepted(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nestedscroll/recyclerview/ChildRecyclerView");
    }

    public final lrj getNestedScrollParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrj) ipChange.ipc$dispatch("de2bf2a7", new Object[]{this});
        }
        return this.mNestedScrollParent;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public boolean isAccepted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10e70f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            return true;
        }
        return super.isAccepted(i);
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onParentScrollStatusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88ee564", new Object[]{this, new Integer(i)});
        } else {
            Log.e("Child", "onParentScrollStatusChange");
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onParentScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143a821c", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            Log.e("Child", "onParentScrolled");
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.t4d
    public boolean onReachedEdge(int i, int i2) {
        float f;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2de49fb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.mInterceptTouch = true;
        int scrollState = getScrollState();
        if (scrollState == 0 || scrollState == 1) {
            if (krj.a(this.mNestedScrollParent, this) && this.mNestedScrollParent.acceptNestedScroll(i)) {
                this.mInterceptTouch = false;
                this.mNestedScrollParent.dispatchNestedScroll(i);
                return true;
            }
        } else if (scrollState == 2) {
            if (!krj.a(this.mNestedScrollParent, this) || !this.mNestedScrollParent.acceptNestedFling(this.mVelocityY)) {
                z = false;
            } else {
                this.mInterceptTouch = false;
                float invokeCurrentVelocity = invokeCurrentVelocity();
                if (Math.abs(invokeCurrentVelocity) <= 2.0E-5f) {
                    invokeCurrentVelocity = this.mVelocityY;
                    f = 0.5f;
                } else {
                    f = 0.65f;
                }
                this.mNestedScrollParent.dispatchNestedFling((int) (invokeCurrentVelocity * f));
            }
            this.mVelocityY = 0;
            return z;
        }
        return false;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onScrolledByNestedParent(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce2566", new Object[]{this, lrjVar});
        } else {
            Log.e("Child", "onScrolledByNestedParent");
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public void setNestedScrollParent(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750ad753", new Object[]{this, lrjVar});
        } else {
            this.mNestedScrollParent = lrjVar;
        }
    }

    public ChildRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChildRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
