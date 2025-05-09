package com.taobao.android.searchbaseframe.uikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.ymx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DebugFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDebugClickListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(993001950);
    }

    public DebugFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DebugFrameLayout debugFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/uikit/DebugFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = ymx.f32206a;
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getDebugClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("80a003f1", new Object[]{this});
        }
        return this.mDebugClickListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = ymx.f32206a;
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setDebugClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83e1c33", new Object[]{this, aVar});
        } else {
            this.mDebugClickListener = aVar;
        }
    }

    public DebugFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DebugFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
