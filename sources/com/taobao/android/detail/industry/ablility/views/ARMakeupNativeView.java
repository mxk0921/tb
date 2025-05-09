package com.taobao.android.detail.industry.ablility.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ARMakeupNativeView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ARMakeupNativeView";
    private ARTryViewContainer arTryViewContainer;

    static {
        t2o.a(440401934);
    }

    public ARMakeupNativeView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ARMakeupNativeView aRMakeupNativeView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/ablility/views/ARMakeupNativeView");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ARTryViewContainer aRTryViewContainer = this.arTryViewContainer;
        if (aRTryViewContainer != null) {
            aRTryViewContainer.destroy();
        }
        removeView(this.arTryViewContainer);
        this.arTryViewContainer = null;
    }

    public ARTryViewContainer getArTryViewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARTryViewContainer) ipChange.ipc$dispatch("e4186b6c", new Object[]{this});
        }
        return this.arTryViewContainer;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        ARTryViewContainer aRTryViewContainer = new ARTryViewContainer(context, (AttributeSet) null);
        this.arTryViewContainer = aRTryViewContainer;
        aRTryViewContainer.init((Activity) context);
        addView(this.arTryViewContainer, new ViewGroup.LayoutParams(-1, -1));
    }

    public ARMakeupNativeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ARMakeupNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
