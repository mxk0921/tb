package com.taobao.nestedscroll.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jrj;
import tb.krj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ParentRecyclerView extends AbstractRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jrj mNestedScrollChild;

    public ParentRecyclerView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ jrj access$000(ParentRecyclerView parentRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrj) ipChange.ipc$dispatch("78697907", new Object[]{parentRecyclerView});
        }
        return parentRecyclerView.mNestedScrollChild;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.nestedscroll.recyclerview.ParentRecyclerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nestedscroll/recyclerview/ParentRecyclerView$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    } else if (ParentRecyclerView.access$000(ParentRecyclerView.this) != null) {
                        ParentRecyclerView.access$000(ParentRecyclerView.this).onParentScrollStatusChange(i);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else if (ParentRecyclerView.access$000(ParentRecyclerView.this) != null) {
                        ParentRecyclerView.access$000(ParentRecyclerView.this).onParentScrolled(i, i2);
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(ParentRecyclerView parentRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == 1276176143) {
            return new Boolean(super.isAccepted(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nestedscroll/recyclerview/ParentRecyclerView");
    }

    public final jrj getNestedScrollChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrj) ipChange.ipc$dispatch("ad1ea747", new Object[]{this});
        }
        return this.mNestedScrollChild;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public boolean isAccepted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10e70f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            return true;
        }
        return super.isAccepted(i);
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onParentScrollStatusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88ee564", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onParentScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143a821c", new Object[]{this, new Integer(i), new Integer(i2)});
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
            if (krj.a(this, this.mNestedScrollChild) && this.mNestedScrollChild.acceptNestedScroll(i)) {
                this.mInterceptTouch = false;
                this.mNestedScrollChild.dispatchNestedScroll(i);
                return true;
            }
        } else if (scrollState == 2) {
            if (!krj.a(this, this.mNestedScrollChild) || !this.mNestedScrollChild.acceptNestedFling(this.mVelocityY)) {
                z = false;
            } else {
                this.mInterceptTouch = false;
                float invokeCurrentVelocity = invokeCurrentVelocity();
                if (Math.abs(invokeCurrentVelocity) <= 2.0E-5f) {
                    invokeCurrentVelocity = this.mVelocityY;
                    f = 0.5f;
                } else {
                    f = 0.46f;
                }
                this.mNestedScrollChild.dispatchNestedFling((int) (invokeCurrentVelocity * f));
            }
            this.mVelocityY = 0;
            return z;
        }
        return false;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public void setNestedScrollChild(jrj jrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc68cf31", new Object[]{this, jrjVar});
        } else {
            this.mNestedScrollChild = jrjVar;
        }
    }

    public ParentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ParentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
