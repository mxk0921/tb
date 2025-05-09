package com.etao.feimagesearch.structure.capture.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.view.CameraZoomView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerticalProgressBar extends AppCompatSeekBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a callback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    static {
        t2o.a(481297529);
    }

    public VerticalProgressBar(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(VerticalProgressBar verticalProgressBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 2079339533:
                super.setProgress(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/capture/view/VerticalProgressBar");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onSizeChanged(i2, i, i4, i3);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            int max = Math.max(0, Math.min(getMax() - ((int) ((getMax() * motionEvent.getY()) / getHeight())), getMax()));
            setProgress(max);
            a aVar = this.callback;
            if (aVar != null) {
                ((CameraZoomView.a) aVar).a(max / getMax());
            }
        }
        return true;
    }

    public void setCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff66901", new Object[]{this, aVar});
        } else {
            this.callback = aVar;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    public VerticalProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VerticalProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
