package com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RecommendTouchView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnTouchListener mRecommendTouchListener;

    static {
        t2o.a(295699699);
    }

    public RecommendTouchView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(RecommendTouchView recommendTouchView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/view/RecommendTouchView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent) {
            return this.mRecommendTouchListener.onTouch(this, motionEvent);
        }
        return dispatchTouchEvent;
    }

    public void setRecommendTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4be962", new Object[]{this, onTouchListener});
        } else {
            this.mRecommendTouchListener = onTouchListener;
        }
    }

    public RecommendTouchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecommendTouchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
