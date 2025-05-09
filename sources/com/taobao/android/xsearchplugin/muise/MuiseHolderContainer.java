package com.taobao.android.xsearchplugin.muise;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.sif;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MuiseHolderContainer extends FrameLayout implements sif {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int height;
    private View.OnTouchListener interceptListener;
    private a listener;
    private int clipHeight = 0;
    private boolean observeHeightChange = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void y(int i);
    }

    static {
        t2o.a(993002144);
        t2o.a(993001955);
    }

    public MuiseHolderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ Object ipc$super(MuiseHolderContainer muiseHolderContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MuiseHolderContainer");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        if (this.clipHeight > 0) {
            i = canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight() - this.clipHeight);
        } else {
            i = -1;
        }
        super.dispatchDraw(canvas);
        if (i != -1) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() != 0 || motionEvent.getY() <= getHeight() - getClipHeight()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public int getClipHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2239287", new Object[]{this})).intValue();
        }
        return this.clipHeight;
    }

    public int getContentHeight() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dynamic_container);
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
            return -1;
        }
        return childAt.getMeasuredHeight();
    }

    public View getDynamicContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c2a64981", new Object[]{this});
        }
        return findViewById(R.id.dynamic_container);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.interceptListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.height;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        this.height = measuredHeight;
        if (this.observeHeightChange && i3 != measuredHeight && (aVar = this.listener) != null) {
            aVar.y(measuredHeight);
        }
    }

    public void setClipHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7925cc63", new Object[]{this, new Integer(i)});
        } else if (this.clipHeight != i) {
            this.clipHeight = i;
            invalidate();
        }
    }

    public void setHeightChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b176c2", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    public void setObserveHeightChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b55c69c", new Object[]{this, new Boolean(z)});
        } else {
            this.observeHeightChange = z;
        }
    }

    @Override // tb.sif
    public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
        } else {
            this.interceptListener = onTouchListener;
        }
    }
}
