package com.taobao.mytaobao.view;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pagev2.architecture.MtbWeexViewHolder;
import com.taobao.ptr.views.recycler.PtrRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import tb.dgw;
import tb.pzc;
import tb.t2o;
import tb.uxo;
import tb.xvc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTPtrRecyclerView extends PtrRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View.OnTouchListener afterTouchListener;
    private int cacheVerticalScrollOffset;
    private float deltaPx;
    private FrameLayout flEndViewContainer;
    private boolean isOnTouch;
    private View mBasementView;
    private final List<RecyclerView.OnFlingListener> mOnFlingListenerList;
    private final List<View.OnTouchListener> mOnTouchListenerList;
    public pzc nestedScrollHook;
    public uxo onScrollEnableChangeListener;
    public boolean v2;
    public boolean v2HasBasement;

    static {
        t2o.a(745538220);
    }

    public MTPtrRecyclerView(Context context) {
        this(context, null);
        setOverScrollMode(2);
    }

    private void disableItemAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fb4d53", new Object[]{this});
        } else {
            setItemAnimator(null);
        }
    }

    public static /* synthetic */ Object ipc$super(MTPtrRecyclerView mTPtrRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1708092539:
                return new Boolean(super.dispatchNestedPreScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (int[]) objArr[2], (int[]) objArr[3], ((Number) objArr[4]).intValue()));
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -848676619:
                return new Boolean(super.dispatchNestedPreFling(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue()));
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/view/MTPtrRecyclerView");
        }
    }

    private boolean isWeexPartiallyVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f65b893a", new Object[]{this})).booleanValue();
        }
        if (getAdapter() == null) {
            return false;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(getAdapter().getItemCount() - 1);
        if (findViewHolderForAdapterPosition instanceof MtbWeexViewHolder) {
            if (findViewHolderForAdapterPosition.itemView.getBottom() > getBottom()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            TLog.loge("mtbMainLink", "Rv error: 子线程addView, view=" + view + " thread=" + Thread.currentThread().getName());
        }
        super.addView(view, i, layoutParams);
    }

    public int calcVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("981cfd45", new Object[]{this})).intValue();
        }
        if (isScrollEnable()) {
            return computeVerticalScrollOffset();
        }
        return this.cacheVerticalScrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6a38f5", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        pzc pzcVar = this.nestedScrollHook;
        if (pzcVar == null || !pzcVar.dispatchNestedPreFling(f, f2)) {
            return super.dispatchNestedPreFling(f, f2);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a309385", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
        }
        pzc pzcVar = this.nestedScrollHook;
        if (pzcVar == null || !pzcVar.a(i, i2, iArr, iArr2, i3)) {
            return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (RecyclerView.OnFlingListener onFlingListener : this.mOnFlingListenerList) {
            onFlingListener.onFling(i, i2);
        }
        return super.fling(i, i2);
    }

    public FrameLayout getFlEndViewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8cf19f35", new Object[]{this});
        }
        return this.flEndViewContainer;
    }

    public boolean isCloseToTheBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4deb88fe", new Object[]{this})).booleanValue();
        }
        if (this.deltaPx == 0.0f) {
            this.deltaPx = DensityUtil.dip2px(getContext(), 30.0f);
        }
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        if (computeVerticalScrollRange != 0 && computeVerticalScrollRange - computeVerticalScrollOffset > this.deltaPx) {
            return false;
        }
        return true;
    }

    public boolean isScrollEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4e25485", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof xvc) {
            return ((LinearLayoutManager) layoutManager).canScrollVertically();
        }
        return true;
    }

    @Override // com.taobao.ptr.views.recycler.PtrRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean z2 = false;
        for (View.OnTouchListener onTouchListener : this.mOnTouchListenerList) {
            if (onTouchListener.onTouch(this, motionEvent)) {
                z2 = true;
            }
        }
        if (motionEvent.getAction() == 2) {
            z = true;
        }
        this.isOnTouch = z;
        if (!isScrollEnable()) {
            if (this.v2 || ((frameLayout = this.flEndViewContainer) != null && frameLayout.getBottom() <= getBottom())) {
                boolean z3 = this.v2;
                if (z3 && !this.v2HasBasement) {
                    setScrollEnable(true);
                } else if (z3 && this.v2HasBasement && isWeexPartiallyVisible()) {
                    setScrollEnable(true);
                }
            } else {
                setScrollEnable(true);
            }
        }
        if (!z2) {
            return super.onTouchEvent(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        View.OnTouchListener onTouchListener2 = this.afterTouchListener;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(this, motionEvent);
        }
        return onTouchEvent;
    }

    public void registerOnFlingListener(RecyclerView.OnFlingListener onFlingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb46575", new Object[]{this, onFlingListener});
        } else {
            this.mOnFlingListenerList.add(onFlingListener);
        }
    }

    public void registerOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ed5eca", new Object[]{this, onTouchListener});
        } else {
            this.mOnTouchListenerList.add(onTouchListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            TLog.loge("mtbMainLink", "Rv error: 子线程removeView, view=" + view + " thread=" + Thread.currentThread().getName());
        }
        super.removeView(view);
    }

    public void resetBasementData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf3036f", new Object[]{this});
            return;
        }
        safeRemoveEndView(this.mBasementView);
        this.mBasementView = null;
    }

    public void safeAddEndView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a53c4f5", new Object[]{this, view, new Boolean(z)});
            return;
        }
        TLog.loge("basementLog", "safeAddEndView, id=" + view);
        if (view != null) {
            FrameLayout frameLayout = this.flEndViewContainer;
            if (frameLayout == null) {
                removeAllEndViews();
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                this.flEndViewContainer = frameLayout2;
                frameLayout2.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                this.flEndViewContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.flEndViewContainer.addView(view);
                addEndView(this.flEndViewContainer);
                return;
            }
            if (z) {
                frameLayout.removeAllViews();
            }
            this.flEndViewContainer.addView(view);
        }
    }

    public void safeRemoveEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f1819c", new Object[]{this, view});
            return;
        }
        TLog.loge("basementLog", "safeRemoveEndView, id=" + view);
        FrameLayout frameLayout = this.flEndViewContainer;
        if (frameLayout != null && view != null) {
            frameLayout.removeView(view);
        }
    }

    public void setBasementView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87af83b5", new Object[]{this, view});
        } else {
            this.mBasementView = view;
        }
    }

    public void setScrollEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8304963b", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof xvc) {
            xvc xvcVar = (xvc) layoutManager;
            if (!xvcVar.canScrollVertically() && z && this.isOnTouch) {
                xvcVar.t(true);
            }
            if (!z) {
                this.cacheVerticalScrollOffset = computeVerticalScrollOffset();
            }
            xvcVar.s(z);
            uxo uxoVar = this.onScrollEnableChangeListener;
            if (uxoVar != null) {
                uxoVar.a(z);
            }
        }
    }

    public void unregisterOnFlingListener(RecyclerView.OnFlingListener onFlingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715f434e", new Object[]{this, onFlingListener});
        } else {
            this.mOnFlingListenerList.remove(onFlingListener);
        }
    }

    public void unregisterOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edeef7a3", new Object[]{this, onTouchListener});
        } else {
            this.mOnTouchListenerList.remove(onTouchListener);
        }
    }

    public MTPtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnTouchListenerList = new ArrayList(4);
        this.v2 = false;
        this.mOnFlingListenerList = new ArrayList(4);
        this.cacheVerticalScrollOffset = 0;
        this.deltaPx = 0.0f;
        this.isOnTouch = false;
        this.v2HasBasement = false;
        setOverScrollMode(2);
        disableItemAnim();
    }
}
