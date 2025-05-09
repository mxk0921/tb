package com.taobao.android.icart.widget.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DragParentFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DragFloatLayer dragFloatLayer;

    static {
        t2o.a(478151159);
    }

    public DragParentFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DragParentFrameLayout dragParentFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/DragParentFrameLayout");
    }

    public void attach(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697fe0d0", new Object[]{this, dragFloatLayer});
        } else {
            this.dragFloatLayer = dragFloatLayer;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        DragFloatLayer dragFloatLayer = this.dragFloatLayer;
        if (dragFloatLayer == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dragFloatLayer.setLastMonitorEvent(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.dragFloatLayer.setVisibility(8);
        }
        if (!this.dragFloatLayer.isDraging()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.dragFloatLayer.dispatchTouchEvent(motionEvent);
        return true;
    }

    public DragParentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DragParentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
