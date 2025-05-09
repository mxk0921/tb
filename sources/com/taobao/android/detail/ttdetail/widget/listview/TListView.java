package com.taobao.android.detail.ttdetail.widget.listview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.listview.feature.features.FeatureList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.b33;
import tb.bw6;
import tb.i5u;
import tb.iv;
import tb.lbi;
import tb.nd0;
import tb.qs9;
import tb.rif;
import tb.rxo;
import tb.sig;
import tb.t2o;
import tb.tgh;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TListView extends ListView implements AbsListView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FeatureList<ListView> mFeatureList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private float mLastMotionX;
    private float mLastMotionY;
    private List<AbsListView.OnScrollListener> mOnScrollListeners;
    private boolean unScroll;

    static {
        t2o.a(912263026);
        t2o.a(912263027);
        t2o.a(912263041);
    }

    public TListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFeatureList = new FeatureList<>(this);
        this.mOnScrollListeners = new ArrayList();
        this.unScroll = false;
        super.setOnScrollListener(this);
        setOverScrollMode(2);
        this.mFeatureList.init(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(TListView tListView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1823422940:
                super.removeDetachedView((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1488275586:
                super.setOnScrollListener((AbsListView.OnScrollListener) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
            case -429021187:
                super.setAdapter((ListAdapter) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 678958088:
                super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                return null;
            case 1560169965:
                super.measureChild((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/listview/TListView");
        }
    }

    public boolean addFeature(iv<? super ListView> ivVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81a2b746", new Object[]{this, ivVar})).booleanValue();
        }
        return this.mFeatureList.addFeature(ivVar);
    }

    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
        } else {
            this.mFeatureList.clearFeatures();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof rxo) {
                ((rxo) ivVar).beforeComputeScroll();
            }
        }
        super.computeScroll();
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof rxo) {
                ((rxo) ivVar2).afterComputeScroll();
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof b33) {
                ((b33) ivVar).beforeDispatchDraw(canvas);
            }
        }
        super.dispatchDraw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof b33) {
                ((b33) ivVar2).afterDispatchDraw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof i5u) {
                ((i5u) ivVar).beforeDispatchTouchEvent(motionEvent);
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof i5u) {
                ((i5u) ivVar2).afterDispatchTouchEvent(motionEvent);
            }
        }
        return dispatchTouchEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof b33) {
                ((b33) ivVar).beforeDraw(canvas);
            }
        }
        super.draw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof b33) {
                ((b33) ivVar2).afterDraw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9105d4f", new Object[]{this, canvas, view, new Long(j), new Integer(i)})).booleanValue();
        }
        return super.drawChild(canvas, view, j);
    }

    public iv<? super ListView> findFeature(Class<? extends iv<? super ListView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iv) ipChange.ipc$dispatch("c2a88e3", new Object[]{this, cls});
        }
        return this.mFeatureList.findFeature(cls);
    }

    public int getFeatureSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34f0d6db", new Object[]{this})).intValue();
        }
        return this.mFeatureList.size();
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mFeatureList.init(context, attributeSet, i);
        }
    }

    public boolean isUnScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbc76e9b", new Object[]{this})).booleanValue();
        }
        return this.unScroll;
    }

    public void measureChild(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbe2b6", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            super.measureChild(view, i, i2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof b33) {
                ((b33) ivVar).beforeOnDraw(canvas);
            }
        }
        super.onDraw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof b33) {
                ((b33) ivVar2).afterOnDraw(canvas);
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof qs9) {
                ((qs9) ivVar).beforeOnFocusChanged(z, i, rect);
            }
        }
        super.onFocusChanged(z, i, rect);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof qs9) {
                ((qs9) ivVar2).afterOnFocusChanged(z, i, rect);
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        tq4.d(this).hashCode();
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar = this.mFeatureList.get(size);
            if (ivVar instanceof rif) {
                onInterceptTouchEvent = ((rif) ivVar).onInterceptTouchEvent(motionEvent) | onInterceptTouchEvent;
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (bw6.a(tq4.d(this))) {
            j = System.currentTimeMillis();
            tgh.b("DetailTime", "onLayout start");
        } else {
            j = 0;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof sig) {
                ((sig) ivVar).beforeOnLayout(z, i, i2, i3, i4);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof sig) {
                ((sig) ivVar2).afterOnLayout(z, i, i2, i3, i4);
            }
        }
        if (bw6.a(tq4.d(this))) {
            tgh.b("DetailTime", "onLayout end:" + (System.currentTimeMillis() - j) + "ms");
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.unScroll) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        } else {
            Iterator<iv<? super T>> it = this.mFeatureList.iterator();
            while (it.hasNext()) {
                iv ivVar = (iv) it.next();
                if (ivVar instanceof lbi) {
                    ((lbi) ivVar).beforeOnMeasure(i, i2);
                }
            }
            super.onMeasure(i, i2);
            for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
                iv ivVar2 = this.mFeatureList.get(size);
                if (ivVar2 instanceof lbi) {
                    ((lbi) ivVar2).afterOnMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        for (AbsListView.OnScrollListener onScrollListener : this.mOnScrollListeners) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        for (AbsListView.OnScrollListener onScrollListener : this.mOnScrollListeners) {
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(absListView, i);
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof i5u) {
                ((i5u) ivVar).beforeOnTouchEvent(motionEvent);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof i5u) {
                ((i5u) ivVar2).afterOnTouchEvent(motionEvent);
            }
        }
        return onTouchEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof qs9) {
                ((qs9) ivVar).beforeOnWindowFocusChanged(z);
            }
        }
        super.onWindowFocusChanged(z);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            iv ivVar2 = this.mFeatureList.get(size);
            if (ivVar2 instanceof qs9) {
                ((qs9) ivVar2).afterOnWindowFocusChanged(z);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9350c624", new Object[]{this, view, new Boolean(z)});
            return;
        }
        try {
            super.removeDetachedView(view, z);
        } catch (Throwable th) {
            tgh.c("TListView", "removeDetachedView", th);
        }
    }

    public boolean removeFeature(Class<? extends iv<? super ListView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        return this.mFeatureList.removeFeature(cls);
    }

    public void removeOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee590f9c", new Object[]{this, onScrollListener});
        } else if (onScrollListener != null) {
            this.mOnScrollListeners.remove(onScrollListener);
        }
    }

    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ab77e", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListeners.add(onScrollListener);
        }
    }

    public void setUnScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1de2e5", new Object[]{this, new Boolean(z)});
        } else {
            this.unScroll = z;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void setAdapter(ListAdapter listAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66da7fd", new Object[]{this, listAdapter});
            return;
        }
        Iterator<iv<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar instanceof nd0) {
                listAdapter = ((nd0) ivVar).wrapAdapter(listAdapter);
            }
        }
        super.setAdapter(listAdapter);
    }

    public TListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TListView(Context context) {
        this(context, null);
    }
}
