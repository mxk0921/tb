package com.taobao.trade.uikit.feature.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trade.uikit.feature.utils.FeatureList;
import tb.a33;
import tb.h5u;
import tb.hv;
import tb.kbi;
import tb.ps9;
import tb.qxo;
import tb.rig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FeatureList<TextView> mFeatureList;

    static {
        t2o.a(724566108);
        t2o.a(724566110);
        t2o.a(724566095);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/view/TTextView");
        }
    }

    public boolean addFeature(hv<? super TextView> hvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86bfac9d", new Object[]{this, hvVar})).booleanValue();
        }
        return this.mFeatureList.addFeature(hvVar);
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
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof qxo) {
                ((qxo) hvVar).beforeComputeScroll();
            }
        }
        super.computeScroll();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof qxo) {
                ((qxo) hvVar2).afterComputeScroll();
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
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof a33) {
                ((a33) hvVar).beforeDispatchDraw(canvas);
            }
        }
        super.dispatchDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof a33) {
                ((a33) hvVar2).afterDispatchDraw(canvas);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof h5u) {
                ((h5u) hvVar).beforeDispatchTouchEvent(motionEvent);
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof h5u) {
                ((h5u) hvVar2).afterDispatchTouchEvent(motionEvent);
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
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof a33) {
                ((a33) hvVar).beforeDraw(canvas);
            }
        }
        super.draw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof a33) {
                ((a33) hvVar2).afterDraw(canvas);
            }
        }
    }

    public hv<? super TextView> findFeature(Class<? extends hv<? super TextView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hv) ipChange.ipc$dispatch("265698fa", new Object[]{this, cls});
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
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof a33) {
                ((a33) hvVar).beforeOnDraw(canvas);
            }
        }
        super.onDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof a33) {
                ((a33) hvVar2).afterOnDraw(canvas);
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
        int size = this.mFeatureList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hv hvVar = this.mFeatureList.get(i2);
            if (hvVar instanceof ps9) {
                ((ps9) hvVar).beforeOnFocusChanged(z, i, rect);
            }
        }
        super.onFocusChanged(z, i, rect);
        for (int i3 = size - 1; i3 >= 0; i3--) {
            hv hvVar2 = this.mFeatureList.get(i3);
            if (hvVar2 instanceof h5u) {
                ((ps9) hvVar2).afterOnFocusChanged(z, i, rect);
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
        int size = this.mFeatureList.size();
        for (int i5 = 0; i5 < size; i5++) {
            hv hvVar = this.mFeatureList.get(i5);
            if (hvVar instanceof rig) {
                ((rig) hvVar).beforeOnLayout(z, i, i2, i3, i4);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            hv hvVar2 = this.mFeatureList.get(i6);
            if (hvVar2 instanceof rig) {
                ((rig) hvVar2).afterOnLayout(z, i, i2, i3, i4);
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
        int size = this.mFeatureList.size();
        for (int i3 = 0; i3 < size; i3++) {
            hv hvVar = this.mFeatureList.get(i3);
            if (hvVar instanceof kbi) {
                ((kbi) hvVar).beforeOnMeasure(i, i2);
            }
        }
        super.onMeasure(i, i2);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            hv hvVar2 = this.mFeatureList.get(i4);
            if (hvVar2 instanceof kbi) {
                ((kbi) hvVar2).afterOnMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof h5u) {
                ((h5u) hvVar).beforeOnTouchEvent(motionEvent);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof h5u) {
                ((h5u) hvVar2).afterOnTouchEvent(motionEvent);
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
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof ps9) {
                ((ps9) hvVar).beforeOnWindowFocusChanged(z);
            }
        }
        super.onWindowFocusChanged(z);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof ps9) {
                ((ps9) hvVar2).afterOnWindowFocusChanged(z);
            }
        }
    }

    public boolean removeFeature(Class<? extends hv<? super TextView>> cls) {
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
        super(context, attributeSet);
        FeatureList<TextView> featureList = new FeatureList<>(this);
        this.mFeatureList = featureList;
        featureList.init(context, attributeSet, 0);
    }

    public TTextView(Context context) {
        this(context, null);
    }
}
