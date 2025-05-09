package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.NestedScrollingParent2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.cba;
import tb.gu3;
import tb.h4s;
import tb.nrj;
import tb.p1j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveRecyclerView extends RecyclerView implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_FLING = 1000;
    private static final String TAG = "TaoLiveRecyclerView";
    private cba globalContext;
    public gu3 mClickUtil;
    public p1j mMoveUtil;
    public List<Class<?>> mNestedChilds;
    public SnapHelper mSnapHelper;
    private boolean mParentIsScroll = false;
    public int mMaxFling = 1000;
    private final PointF mTouchDownPointF = new PointF();

    static {
        t2o.a(779093437);
    }

    public TaoLiveRecyclerView(Context context) {
        super(context);
    }

    private boolean hasSnapTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42ba640", new Object[]{this})).booleanValue();
        }
        if (getScrollState() == 2 || getLayoutManager().isSmoothScrolling()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveRecyclerView taoLiveRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 640003410:
                super.requestChildFocus((View) objArr[0], (View) objArr[1]);
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2114251219:
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/controller/TaoLiveRecyclerView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            h4s.b("KLifecycle_click_down");
            h4s.e();
            cba cbaVar = this.globalContext;
            if (cbaVar != null) {
                cbaVar.W().put("kLiveRoomEnterClickTs", String.valueOf(System.currentTimeMillis()));
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.mMaxFling;
        if (i3 > 0 && i2 > i3) {
            return super.fling(i, i3);
        }
        if (i3 <= 0 || i2 >= (-i3)) {
            return super.fling(i, i2);
        }
        return super.fling(i, -i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r4 != 3) goto L_0x0086;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            int r3 = com.taobao.taobao.R.id.tag_kill_up_down
            java.lang.Object r3 = r6.getTag(r3)
            if (r3 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r4 = r7.getAction()
            if (r4 == 0) goto L_0x006d
            if (r4 == r0) goto L_0x0065
            if (r4 == r2) goto L_0x0035
            r0 = 3
            if (r4 == r0) goto L_0x0065
            goto L_0x0086
        L_0x0035:
            float r2 = r7.getX()
            android.graphics.PointF r4 = r6.mTouchDownPointF
            float r4 = r4.x
            float r2 = r2 - r4
            int r2 = (int) r2
            float r4 = r7.getY()
            android.graphics.PointF r5 = r6.mTouchDownPointF
            float r5 = r5.y
            float r4 = r4 - r5
            int r4 = (int) r4
            int r2 = java.lang.Math.abs(r2)
            int r4 = java.lang.Math.abs(r4)
            if (r2 <= r4) goto L_0x005b
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            return r1
        L_0x005b:
            if (r3 == 0) goto L_0x0086
            android.view.ViewParent r1 = r6.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
            goto L_0x0086
        L_0x0065:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0086
        L_0x006d:
            android.graphics.PointF r1 = r6.mTouchDownPointF
            float r2 = r7.getX()
            r1.x = r2
            android.graphics.PointF r1 = r6.mTouchDownPointF
            float r2 = r7.getY()
            r1.y = r2
            if (r3 == 0) goto L_0x0086
            android.view.ViewParent r1 = r6.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x0086:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (hasSnapTarget() || !this.mParentIsScroll) {
            return super.onNestedFling(view, f, f2, z);
        }
        fling((int) f, (int) f2);
        this.mParentIsScroll = false;
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (this.mParentIsScroll) {
            scrollBy(i, i2);
            iArr[1] = i2;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (hasSnapTarget()) {
            return false;
        }
        List<Class<?>> list = this.mNestedChilds;
        if (list != null) {
            for (Class<?> cls : list) {
                if (cls.isInstance(view2)) {
                    return true;
                }
            }
        }
        if (view2 instanceof nrj) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        SnapHelper snapHelper;
        View findSnapView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mParentIsScroll = false;
        if (!hasSnapTarget() && (snapHelper = this.mSnapHelper) != null && (findSnapView = snapHelper.findSnapView(getLayoutManager())) != null) {
            int[] calculateDistanceToFinalSnap = snapHelper.calculateDistanceToFinalSnap(getLayoutManager(), findSnapView);
            int i2 = calculateDistanceToFinalSnap[0];
            int i3 = calculateDistanceToFinalSnap[1];
            if (Math.abs(i3) > 0) {
                smoothScrollBy(i2, i3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3 != 3) goto L_0x0077;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            int r3 = r6.getAction()
            if (r3 == 0) goto L_0x0059
            if (r3 == r0) goto L_0x003a
            if (r3 == r2) goto L_0x002a
            r0 = 3
            if (r3 == r0) goto L_0x003a
            goto L_0x0077
        L_0x002a:
            tb.p1j r0 = r5.mMoveUtil
            if (r0 == 0) goto L_0x0077
            float r2 = r6.getX()
            float r3 = r6.getY()
            r0.a(r2, r3)
            goto L_0x0077
        L_0x003a:
            tb.p1j r0 = r5.mMoveUtil
            if (r0 == 0) goto L_0x0049
            float r2 = r6.getX()
            float r3 = r6.getY()
            r0.d(r2, r3)
        L_0x0049:
            tb.gu3 r0 = r5.mClickUtil
            if (r0 == 0) goto L_0x0077
            float r2 = r6.getX()
            float r3 = r6.getY()
            r0.k(r2, r3)
            goto L_0x0077
        L_0x0059:
            tb.p1j r0 = r5.mMoveUtil
            if (r0 == 0) goto L_0x0068
            float r2 = r6.getX()
            float r3 = r6.getY()
            r0.c(r2, r3)
        L_0x0068:
            tb.gu3 r0 = r5.mClickUtil
            if (r0 == 0) goto L_0x0077
            float r2 = r6.getX()
            float r3 = r6.getY()
            r0.j(r2, r3)
        L_0x0077:
            boolean r6 = super.onTouchEvent(r6)     // Catch: Exception -> 0x007c
            return r6
        L_0x007c:
            r6 = move-exception
            boolean r0 = tb.pvs.L0()
            java.lang.String r2 = "TaoLiveRecyclerView onTouchEvent catch Exception:"
            if (r0 == 0) goto L_0x008c
            android.content.Context r0 = r5.getContext()
            tb.n2o.a(r0, r2, r6)
        L_0x008c:
            java.lang.String r6 = r6.getMessage()
            tb.x5t.d(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        } else if (getScrollState() != 2 && !getLayoutManager().isSmoothScrolling()) {
            super.requestChildFocus(view, view2);
        }
    }

    public void setGlobalContext(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
        } else {
            this.globalContext = cbaVar;
        }
    }

    public void setMaxFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51ea2c2", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxFling = i;
        }
    }

    public void setNestedScrollChilds(List<Class<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a90595", new Object[]{this, list});
        } else {
            this.mNestedChilds = list;
        }
    }

    public void setOnClearClickListener(gu3.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5624ca", new Object[]{this, cVar});
        } else {
            this.mClickUtil = new gu3(getContext(), cVar);
        }
    }

    public void setOnMoveListener(p1j.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25b6fae", new Object[]{this, aVar});
        } else {
            this.mMoveUtil = new p1j(aVar);
        }
    }

    public void setSnapHelper(SnapHelper snapHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2455f7a2", new Object[]{this, snapHelper});
        } else {
            this.mSnapHelper = snapHelper;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (!hasSnapTarget() && i5 == 0 && Math.abs(i4) > 0) {
            new StringBuilder("onNestedScroll, 消费NestedScrollingChild 处理不了的dyUnconsumed ").append(i4);
            scrollBy(i3, i4);
            this.mParentIsScroll = true;
        }
    }

    public void setOnClearClickListener(gu3.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b27b27", new Object[]{this, dVar});
        } else {
            this.mClickUtil = new gu3(getContext(), dVar);
        }
    }

    public TaoLiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TaoLiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
