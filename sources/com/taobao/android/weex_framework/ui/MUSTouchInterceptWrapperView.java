package com.taobao.android.weex_framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSTouchInterceptWrapperView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mTouchDisabled;

    static {
        t2o.a(982516233);
    }

    public MUSTouchInterceptWrapperView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MUSTouchInterceptWrapperView mUSTouchInterceptWrapperView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/ui/MUSTouchInterceptWrapperView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mTouchDisabled) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isTouchDisabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdb59dc", new Object[]{this})).booleanValue();
        }
        return this.mTouchDisabled;
    }

    public void setTouchDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6669e534", new Object[]{this, new Boolean(z)});
        } else {
            this.mTouchDisabled = z;
        }
    }

    public MUSTouchInterceptWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MUSTouchInterceptWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
