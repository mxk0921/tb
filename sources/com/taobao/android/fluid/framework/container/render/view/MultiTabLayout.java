package com.taobao.android.fluid.framework.container.render.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a5n;
import tb.cl4;
import tb.j0q;
import tb.t2o;
import tb.x5b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiTabLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiTabLayout";
    private j0q callback;
    private int currentHeight;
    private int currentWidth;
    private b heightProvider;
    private x5b horizontalSlideCallback;
    private boolean isLockedTouchEvent = false;
    private int motionEventAction = -1;
    private final a5n pullLeftHelper = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends a5n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/container/render/view/MultiTabLayout$1");
        }

        @Override // tb.a5n
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (MultiTabLayout.access$000(MultiTabLayout.this) != null) {
                MultiTabLayout.access$000(MultiTabLayout.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(468714165);
    }

    public MultiTabLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ x5b access$000(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5b) ipChange.ipc$dispatch("56ff6cef", new Object[]{multiTabLayout});
        }
        return multiTabLayout.horizontalSlideCallback;
    }

    public static /* synthetic */ Object ipc$super(MultiTabLayout multiTabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/container/render/view/MultiTabLayout");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.motionEventAction = motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isTouchOnView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0fa71c4", new Object[]{this})).booleanValue();
        }
        int i = this.motionEventAction;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isLockedTouchEvent) {
            return false;
        }
        if (this.horizontalSlideCallback != null) {
            return this.pullLeftHelper.d(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = this.heightProvider;
        if (bVar != null && (a2 = ((cl4.d) bVar).a()) > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.currentWidth != measuredWidth || this.currentHeight != measuredHeight) {
            this.currentWidth = measuredWidth;
            this.currentHeight = measuredHeight;
            j0q j0qVar = this.callback;
            if (j0qVar != null) {
                j0qVar.onSizeChanged(measuredWidth, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isLockedTouchEvent) {
            return false;
        }
        if (this.horizontalSlideCallback != null) {
            return this.pullLeftHelper.f(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setHeightProvider(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2bad055", new Object[]{this, bVar});
        } else {
            this.heightProvider = bVar;
        }
    }

    public void setHorizontalSlideCallback(x5b x5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9eda0c", new Object[]{this, x5bVar});
        } else {
            this.horizontalSlideCallback = x5bVar;
        }
    }

    public void setLockedTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e29c6", new Object[]{this, new Boolean(z)});
        } else {
            this.isLockedTouchEvent = z;
        }
    }

    public void setSizeChangedCallback(j0q j0qVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81e9000", new Object[]{this, j0qVar});
            return;
        }
        this.callback = j0qVar;
        int i2 = this.currentWidth;
        if (i2 > 0 && (i = this.currentHeight) > 0 && j0qVar != null) {
            j0qVar.onSizeChanged(i2, i);
        }
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
