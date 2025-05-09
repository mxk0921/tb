package com.taobao.search.musie.component.tbscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import tb.hzo;
import tb.pxh;
import tb.t2o;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BounceScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBounceDistance;
    private Scroller mBounceScroller;
    private LinearLayout mContainer;
    private MUSView mContentView;
    private MUSView mFootView;
    private final float mFraction = 0.5f;
    private int mHeadInvokeDistance;
    private int mHeadScrollDistance;
    private int mInitScrollX;
    private int mInvokeDistance;
    private int mLastScrollX;
    private int mMaxScrollDistance;
    private Scroller mScroller;
    private a mStateChangeListener;
    private hzo mStateObserver;
    private boolean scrollLeft;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onBounceBack(int i, boolean z);

        void onStateChange(int i);
    }

    static {
        t2o.a(815792708);
    }

    public BounceScrollView(Context context) {
        super(context);
        init(context);
    }

    private void addContent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66858953", new Object[]{this, view});
        } else {
            this.mContainer.addView(view);
        }
    }

    private void addFootView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6998e77", new Object[]{this, view});
        } else {
            this.mContainer.addView(view);
        }
    }

    private void bounceBack() {
        int scrollX;
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c61096", new Object[]{this});
        } else if (this.mContainer.getTranslationX() > 0.0f) {
            this.scrollLeft = true;
            int translationX = (int) this.mContainer.getTranslationX();
            this.mBounceDistance = translationX;
            this.mBounceScroller.startScroll(0, 0, translationX, 0, 300);
            invalidate();
            a aVar = this.mStateChangeListener;
            if (aVar != null) {
                if (this.mBounceDistance >= this.mInvokeDistance) {
                    i = 1;
                }
                aVar.onBounceBack(i, true);
            }
        } else {
            this.scrollLeft = false;
            View childAt = this.mContainer.getChildAt(0);
            if (childAt != null && (scrollX = childAt.getScrollX()) != 0) {
                this.mBounceDistance = scrollX;
                this.mBounceScroller.startScroll(0, 0, scrollX, 0, 300);
                invalidate();
                a aVar2 = this.mStateChangeListener;
                if (aVar2 != null) {
                    if (this.mContentView.getScrollX() < this.mInvokeDistance) {
                        i2 = 0;
                    }
                    aVar2.onBounceBack(i2, false);
                }
            }
        }
    }

    private boolean consumed(int i, int i2, int i3) {
        int i4;
        LinearLayout linearLayout;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ca63fd8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (i > 0) {
            if (this.mContainer.getTranslationX() > 0.0f) {
                float f = i;
                int translationX = (int) (this.mContainer.getTranslationX() - f);
                if (translationX <= 0) {
                    this.mContainer.setTranslationX(0.0f);
                    i = (int) (f - this.mContainer.getTranslationX());
                    if (i == 0) {
                        updateState(this.mContentView);
                        return true;
                    }
                } else {
                    this.mContainer.setTranslationX(translationX);
                    updateState(this.mContentView);
                    return true;
                }
            }
            if (i2 + i <= i3) {
                return false;
            }
            int i6 = (int) ((i5 - i3) * 0.5f);
            int scrollX = this.mContentView.getScrollX() + i6;
            int i7 = this.mMaxScrollDistance;
            if (scrollX > i7) {
                i6 = i7 - this.mContentView.getScrollX();
            }
            this.mContentView.scrollBy(i6, 0);
        } else {
            int scrollX2 = this.mContentView.getScrollX();
            int i8 = i + scrollX2;
            if (i2 + i8 < 0) {
                this.mContainer.setTranslationX(Math.min((int) (linearLayout.getTranslationX() - (i4 * 0.5f)), this.mHeadScrollDistance));
                if (scrollX2 <= 0) {
                    updateState(this.mContentView);
                }
            }
            if (scrollX2 <= 0) {
                return false;
            }
            this.mContentView.scrollTo(Math.max(0, i8), 0);
        }
        updateState(this.mContentView);
        return true;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.mContainer = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.mContainer, new ViewGroup.LayoutParams(-2, -1));
        setOverScrollMode(2);
        setHorizontalFadingEdgeEnabled(false);
        MUSView mUSView = new MUSView(context);
        this.mContentView = mUSView;
        mUSView.setRoot(false);
        addContent(this.mContentView);
        this.mBounceScroller = new Scroller(context);
        this.mScroller = new Scroller(context);
        MUSView mUSView2 = new MUSView(context);
        this.mFootView = mUSView2;
        mUSView2.setRoot(false);
        addFootView(this.mFootView);
    }

    public static /* synthetic */ Object ipc$super(BounceScrollView bounceScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -894236565:
                super.computeScroll();
                return null;
            case -381850951:
                return new Boolean(super.overScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/tbscroll/BounceScrollView");
        }
    }

    private void updateState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27b1ea3", new Object[]{this, view});
            return;
        }
        int i = this.mLastScrollX;
        int scrollX = view.getScrollX();
        this.mLastScrollX = scrollX;
        a aVar = this.mStateChangeListener;
        if (aVar != null) {
            int i2 = this.mInvokeDistance;
            if (i < i2 && scrollX >= i2) {
                aVar.onStateChange(1);
            } else if (i >= i2 && scrollX < i2) {
                aVar.onStateChange(0);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (this.mBounceScroller.computeScrollOffset()) {
            if (this.scrollLeft) {
                this.mContainer.setTranslationX(this.mBounceDistance - this.mBounceScroller.getCurrX());
            } else {
                int currX = this.mBounceDistance - this.mBounceScroller.getCurrX();
                View childAt = this.mContainer.getChildAt(0);
                if (childAt != null) {
                    childAt.scrollTo(currX, 0);
                    updateState(childAt);
                } else {
                    return;
                }
            }
            invalidate();
        }
        if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), 0);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            if (!this.mBounceScroller.isFinished()) {
                this.mBounceScroller.forceFinished(true);
            }
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            bounceBack();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.mInitScrollX;
        if (i5 != 0) {
            scrollTo(i5, 0);
            this.mInitScrollX = 0;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        hzo hzoVar = this.mStateObserver;
        if (hzoVar != null) {
            hzoVar.d(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e93d6ab9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, false);
        }
        if (!consumed(i, i3, i5) || i3 < i5) {
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, true);
        }
        return true;
    }

    public void scrollTo(boolean z, int i, int i2, boolean z2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8debe94", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Boolean(z2), new Integer(i3)});
            return;
        }
        if (!this.mScroller.isFinished()) {
            this.mScroller.forceFinished(true);
        }
        if (z2 && i3 > 0) {
            if (z) {
                this.mScroller.startScroll(0, i, 0, i2 - i, i3);
            } else {
                this.mScroller.startScroll(i, 0, i2 - i, 0, i3);
            }
            invalidate();
        } else if (z) {
            scrollTo(0, i2);
        } else {
            scrollTo(i2, 0);
        }
    }

    public void setContent(ywh ywhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5d9934", new Object[]{this, ywhVar});
        } else {
            this.mContentView.setUiNodeTree(ywhVar);
        }
    }

    public void setFoot(ywh ywhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bcedb", new Object[]{this, ywhVar});
        } else {
            this.mFootView.setUiNodeTree(ywhVar);
        }
    }

    public void setHeadInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da7ce2d", new Object[]{this, new Integer(i)});
        } else {
            this.mHeadInvokeDistance = Math.max(0, i);
        }
    }

    public void setHeadMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340ccf05", new Object[]{this, new Integer(i)});
        } else {
            this.mHeadScrollDistance = Math.max(i, 0);
        }
    }

    public void setInitScrollX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6976cc3", new Object[]{this, new Integer(i)});
        } else {
            this.mInitScrollX = i;
        }
    }

    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        this.mFootView.setInstance(mUSDKInstance);
        this.mContentView.setInstance(mUSDKInstance);
    }

    public void setInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b22af2d", new Object[]{this, new Integer(i)});
        } else {
            this.mInvokeDistance = Math.max(0, i);
        }
    }

    public void setMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e658e05", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxScrollDistance = Math.max(i, 0);
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void setScrollChangeListener(pxh pxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6832e", new Object[]{this, pxhVar});
        } else {
            this.mStateObserver = new hzo(pxhVar, this);
        }
    }

    public void setShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8721146", new Object[]{this, new Boolean(z)});
        } else {
            setHorizontalScrollBarEnabled(z);
        }
    }

    public void setStateChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c77135", new Object[]{this, aVar});
        } else {
            this.mStateChangeListener = aVar;
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.mContentView.release(true);
        this.mFootView.release(true);
        this.mLastScrollX = 0;
        this.mStateChangeListener = null;
        this.mMaxScrollDistance = 0;
        this.mInvokeDistance = 0;
        this.mFootView.setInstance(null);
        this.mContentView.setInstance(null);
    }

    public BounceScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
