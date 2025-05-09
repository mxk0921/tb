package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.listview.feature.features.FeatureList;
import java.util.Iterator;
import tb.b33;
import tb.i5u;
import tb.iv;
import tb.lbi;
import tb.qs9;
import tb.rxo;
import tb.sig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FeatureList<TextView> mFeatureList;

    static {
        t2o.a(912262956);
        t2o.a(912263027);
        t2o.a(912263041);
    }

    public TTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FeatureList<TextView> featureList = new FeatureList<>(this);
        this.mFeatureList = featureList;
        featureList.init(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(TTextView tTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
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
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TTextView");
        }
    }

    public boolean addFeature(iv<? super TextView> ivVar) {
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

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.view.View
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

    @Override // android.view.View
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

    @Override // android.view.View
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

    public iv<? super TextView> findFeature(Class<? extends iv<? super TextView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iv) ipChange.ipc$dispatch("c2a88e3", new Object[]{this, cls});
        }
        return this.mFeatureList.findFeature(cls);
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mFeatureList.init(context, attributeSet, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
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
            if (ivVar2 instanceof i5u) {
                ((qs9) ivVar2).afterOnFocusChanged(z, i, rect);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
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
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
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

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
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

    public boolean removeFeature(Class<? extends iv<? super TextView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        return this.mFeatureList.removeFeature(cls);
    }

    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    public TTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTextView(Context context) {
        this(context, null);
    }
}
