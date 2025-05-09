package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import tb.pxh;
import tb.t2o;
import tb.vvh;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScrollerContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pxh changeListener;
    private ViewGroup child;
    private int direction = 0;
    private int initScroll;
    private MUSView musView;
    private ywh nodeTree;
    private Scroller scroller;

    static {
        t2o.a(986710227);
    }

    public ScrollerContainer(Context context) {
        super(context);
        this.scroller = new Scroller(context);
    }

    public static /* synthetic */ Object ipc$super(ScrollerContainer scrollerContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -894236565) {
            super.computeScroll();
            return null;
        } else if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/scroller/ScrollerContainer");
        }
    }

    private void onDirectionChanged(int i, pxh pxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9acb1c", new Object[]{this, new Integer(i), pxhVar});
            return;
        }
        cancelAnimation();
        if (this.child != null) {
            removeAllViews();
            this.child.removeAllViews();
        }
        if (i != 2) {
            MUScrollView mUScrollView = new MUScrollView(getContext());
            mUScrollView.setFillViewport(true);
            mUScrollView.setOnScrollChangedListener(pxhVar);
            addView(mUScrollView, new FrameLayout.LayoutParams(-1, -1));
            this.child = mUScrollView;
        } else {
            MUSHorizontalScrollView mUSHorizontalScrollView = new MUSHorizontalScrollView(getContext());
            mUSHorizontalScrollView.setFillViewport(true);
            addView(mUSHorizontalScrollView, new FrameLayout.LayoutParams(-1, -1));
            mUSHorizontalScrollView.setOnScrollChangedListener(pxhVar);
            this.child = mUSHorizontalScrollView;
        }
        MUSView mUSView = this.musView;
        if (mUSView != null) {
            mUSView.release(false);
            if (this.musView.getUiNodeTree() != null) {
                this.musView.getUiNodeTree().B(this.musView);
            }
            this.child.addView(this.musView);
        }
    }

    private void setDirection(int i, pxh pxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8414d473", new Object[]{this, new Integer(i), pxhVar});
            return;
        }
        if (this.direction != i) {
            onDirectionChanged(i, pxhVar);
        }
        this.direction = i;
    }

    public void cancelAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5115b1", new Object[]{this});
        } else if (!this.scroller.isFinished()) {
            this.scroller.forceFinished(true);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (this.child != null && this.scroller.computeScrollOffset()) {
            ViewGroup viewGroup = this.child;
            if (viewGroup instanceof MUScrollView) {
                viewGroup.scrollTo(0, this.scroller.getCurrY());
            } else {
                viewGroup.scrollTo(this.scroller.getCurrX(), 0);
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        cancelAnimation();
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentScrollRight() {
        MUSView mUSView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a9b1886", new Object[]{this})).intValue();
        }
        if (this.child == null || (mUSView = this.musView) == null) {
            return 0;
        }
        if (mUSView.getMeasuredWidth() <= this.child.getMeasuredWidth()) {
            return this.musView.getMeasuredWidth();
        }
        return this.child.getScrollX() + this.child.getMeasuredWidth();
    }

    public int getCurrentScrollX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f6240e2", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getScrollX();
    }

    public int getCurrentScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f705863", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getScrollY();
    }

    public void mount(MUSDKInstance mUSDKInstance, boolean z, boolean z2, int i, ywh ywhVar, int i2, pxh pxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9d9ff2", new Object[]{this, mUSDKInstance, new Boolean(z), new Boolean(z2), new Integer(i), ywhVar, new Integer(i2), pxhVar});
            return;
        }
        this.changeListener = pxhVar;
        this.initScroll = i2;
        if (this.nodeTree != ywhVar) {
            setNodeTree(mUSDKInstance, ywhVar);
            this.nodeTree = ywhVar;
        }
        setDirection(i, pxhVar);
        setShowScrollBar(z);
        setScrollable(z2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.initScroll;
        if (i5 != 0) {
            ViewGroup viewGroup = this.child;
            if (viewGroup instanceof MUScrollView) {
                viewGroup.scrollTo(0, i5);
            } else if (viewGroup instanceof HorizontalScrollView) {
                viewGroup.scrollTo(i5, 0);
            }
            this.initScroll = 0;
        }
        if (z) {
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
    }

    public void scrollTo(boolean z, int i, int i2, boolean z2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8debe94", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Boolean(z2), new Integer(i3)});
            return;
        }
        this.initScroll = 0;
        if (this.child != null) {
            cancelAnimation();
            if (z2 && i3 > 0) {
                if (z) {
                    this.scroller.startScroll(0, i, 0, i2 - i, i3);
                } else {
                    this.scroller.startScroll(i, 0, i2 - i, 0, i3);
                }
                invalidate();
            } else if (z) {
                this.child.scrollTo(0, i2);
            } else {
                this.child.scrollTo(i2, 0);
            }
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup instanceof MUScrollView) {
            ((MUScrollView) viewGroup).setScrollable(z);
        } else if (viewGroup instanceof MUSHorizontalScrollView) {
            ((MUSHorizontalScrollView) viewGroup).setScrollable(z);
        }
    }

    public void setShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8721146", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup instanceof MUScrollView) {
            viewGroup.setVerticalScrollBarEnabled(z);
        } else if (viewGroup instanceof HorizontalScrollView) {
            viewGroup.setHorizontalScrollBarEnabled(z);
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        cancelAnimation();
        MUSView mUSView = this.musView;
        if (mUSView != null) {
            mUSView.release(true);
            this.musView.setTag(null);
            this.musView = null;
        }
        this.changeListener = null;
        removeAllViews();
        this.direction = 0;
        this.child = null;
        this.nodeTree = null;
    }

    public void setNodeTree(MUSDKInstance mUSDKInstance, ywh ywhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af5fd45", new Object[]{this, mUSDKInstance, ywhVar});
            return;
        }
        if (this.musView == null) {
            MUSView mUSView = new MUSView(mUSDKInstance);
            this.musView = mUSView;
            mUSView.setRoot(false);
            if (vvh.m()) {
                this.musView.setTag("scroller-child");
            }
            ViewGroup viewGroup = this.child;
            if (viewGroup != null) {
                viewGroup.addView(this.musView);
            }
        }
        this.musView.setUiNodeTree(ywhVar);
    }

    public void setDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12d843f", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.direction != i) {
            onDirectionChanged(i, this.changeListener);
        }
        this.direction = i;
    }
}
