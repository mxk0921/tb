package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.g1a;
import tb.t2o;
import tb.zfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PerceptionLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g1a<? super MotionEvent, Boolean> dispatchTouchEventDelegate;
    private zfw viewSizeChangedListener;

    static {
        t2o.a(766509684);
    }

    public PerceptionLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PerceptionLinearLayout perceptionLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/PerceptionLinearLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        g1a<? super MotionEvent, Boolean> g1aVar = this.dispatchTouchEventDelegate;
        if (g1aVar == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (g1aVar.invoke(motionEvent).booleanValue()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final g1a<MotionEvent, Boolean> getDispatchTouchEventDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("a119ba5", new Object[]{this});
        }
        return this.dispatchTouchEventDelegate;
    }

    public final zfw getViewSizeChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfw) ipChange.ipc$dispatch("e6ff350b", new Object[]{this});
        }
        return this.viewSizeChangedListener;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        zfw zfwVar = this.viewSizeChangedListener;
        if (zfwVar != null) {
            zfwVar.a(this, i, i2, i3, i4);
        }
    }

    public final void setDispatchTouchEventDelegate(g1a<? super MotionEvent, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928519a9", new Object[]{this, g1aVar});
        } else {
            this.dispatchTouchEventDelegate = g1aVar;
        }
    }

    public final void setViewSizeChangedListener(zfw zfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae430e61", new Object[]{this, zfwVar});
        } else {
            this.viewSizeChangedListener = zfwVar;
        }
    }

    public PerceptionLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PerceptionLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PerceptionLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
