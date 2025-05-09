package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.SlidingLayout;
import com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout;
import tb.anl;
import tb.d3a;
import tb.jl4;
import tb.pn1;
import tb.t2o;
import tb.tfs;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GestureLayout extends FrameLayout implements jl4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GESTURE_TYPE_NONE = 0;
    public static final int GESTURE_TYPE_PULL_DOWN = 2;
    public static final int GESTURE_TYPE_PULL_RIGHT = 1;
    public static final int GESTURE_TYPE_PULL_SCALE = 4;
    public static final int GESTURE_TYPE_SECOND_PAGE = 8;
    private int gestureType;
    private ViewGroup gestureView;
    public ye<?> mSecPageWrapper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements PullDownCloseLayout.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ anl f8192a;

        public a(GestureLayout gestureLayout, anl anlVar) {
            this.f8192a = anlVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.c
        public void t0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1a3ba95", new Object[]{this});
            } else {
                this.f8192a.finish(false);
            }
        }
    }

    static {
        t2o.a(502268034);
        t2o.a(503316674);
    }

    public GestureLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(GestureLayout gestureLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/GestureLayout");
    }

    @Override // tb.jl4
    public RectF getContainerBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("7bac14a0", new Object[]{this});
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof jl4) {
            return ((jl4) viewGroup).getContainerBounds();
        }
        return null;
    }

    public boolean performCloseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd3f038", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof DragLayout) {
            return ((DragLayout) viewGroup).performCloseAnimation();
        }
        return false;
    }

    public void setBackInterceptListener(pn1 pn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1b8b61", new Object[]{this, pn1Var});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof DragLayout) {
            ((DragLayout) viewGroup).setBackInterceptListener(pn1Var);
        } else if (viewGroup instanceof SlidingLayout) {
            ((SlidingLayout) viewGroup).setBackInterceptListener(pn1Var);
        }
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup == null) {
            addView(view);
        } else if (this.mSecPageWrapper == null) {
            viewGroup.addView(view);
        }
    }

    public void setDragLayoutBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc1b4e", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof DragLayout) {
            ((DragLayout) viewGroup).setShadowViewBackgroundColor(i);
        }
    }

    public void setGestureLayoutBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22d8e1d", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof DragLayout) {
            ((DragLayout) viewGroup).setShadowViewBackgroundColor(i);
        } else if (viewGroup instanceof SlidingLayout) {
            ((SlidingLayout) viewGroup).setShadowViewBackgroundColor(i);
        }
    }

    public void setGestureSupportType(anl anlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1685127e", new Object[]{this, anlVar, new Integer(i)});
        } else if (this.gestureView == null) {
            this.gestureType = i;
            if ((1 & i) != 0) {
                SlidingLayout slidingLayout = new SlidingLayout(getContext());
                slidingLayout.bindPage(anlVar);
                slidingLayout.bindNavigationBarColorChangeListener(anlVar);
                addView(slidingLayout);
                if ((i & 8) != 0) {
                    d3a d3aVar = new d3a();
                    this.mSecPageWrapper = d3aVar;
                    d3aVar.x(anlVar, -1);
                    slidingLayout.addView(this.mSecPageWrapper.f());
                }
                this.gestureView = slidingLayout;
            } else if (i == 2) {
                PullDownCloseLayout pullDownCloseLayout = new PullDownCloseLayout(getContext());
                pullDownCloseLayout.setOnSwipeFinishListener(new a(this, anlVar));
                pullDownCloseLayout.setForbidGesture(false);
                addView(pullDownCloseLayout);
                this.gestureView = pullDownCloseLayout;
            } else if ((i & 4) != 0) {
                DragLayout dragLayout = new DragLayout(getContext());
                dragLayout.bindPage(anlVar);
                dragLayout.bindNavigationBarColorChangeListener(anlVar);
                addView(dragLayout);
                if ((i & 8) != 0) {
                    d3a d3aVar2 = new d3a();
                    this.mSecPageWrapper = d3aVar2;
                    d3aVar2.x(anlVar, -1);
                    dragLayout.addView(this.mSecPageWrapper.f());
                }
                this.gestureView = dragLayout;
            }
        } else {
            tfs.d("gesture Type 只能设置一次, 当前" + this.gestureType + "  设置为" + i);
        }
    }

    public GestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
