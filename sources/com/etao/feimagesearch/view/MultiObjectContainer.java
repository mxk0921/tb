package com.etao.feimagesearch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MultiObjectContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297683);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiObjectContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(MultiObjectContainer multiObjectContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/view/MultiObjectContainer");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return isClickable();
    }
}
