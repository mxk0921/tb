package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EventInterceptFrameLayout extends PerceptionSizeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean interceptAllEvent;

    static {
        t2o.a(766509620);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventInterceptFrameLayout(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(EventInterceptFrameLayout eventInterceptFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/EventInterceptFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.interceptAllEvent) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getInterceptAllEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("488c39b0", new Object[]{this})).booleanValue();
        }
        return this.interceptAllEvent;
    }

    public final void setInterceptAllEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f4ab4", new Object[]{this, new Boolean(z)});
        } else {
            this.interceptAllEvent = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventInterceptFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventInterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventInterceptFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
    }
}
