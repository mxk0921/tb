package com.taobao.tbmobilesmartapi.collector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.z8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultGestureCollectorDelegateLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private z8c gestureCollector = null;

    static {
        t2o.a(809500677);
    }

    public DefaultGestureCollectorDelegateLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DefaultGestureCollectorDelegateLayout defaultGestureCollectorDelegateLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbmobilesmartapi/collector/DefaultGestureCollectorDelegateLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        z8c z8cVar = this.gestureCollector;
        if (z8cVar != null) {
            z8cVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setGestureCollector(z8c z8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934da484", new Object[]{this, z8cVar});
        } else {
            this.gestureCollector = z8cVar;
        }
    }

    public DefaultGestureCollectorDelegateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DefaultGestureCollectorDelegateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
