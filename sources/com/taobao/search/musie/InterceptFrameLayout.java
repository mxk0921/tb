package com.taobao.search.musie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.sif;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InterceptFrameLayout extends FrameLayout implements sif {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnTouchListener interceptListener;

    static {
        t2o.a(815792602);
        t2o.a(993001955);
    }

    public InterceptFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(InterceptFrameLayout interceptFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/InterceptFrameLayout");
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

    @Override // tb.sif
    public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
        } else {
            this.interceptListener = onTouchListener;
        }
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
