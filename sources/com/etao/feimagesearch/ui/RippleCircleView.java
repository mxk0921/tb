package com.etao.feimagesearch.ui;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.hfn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RippleCircleView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RippleLayout rippleContainer;

    static {
        t2o.a(481297545);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleCircleView(RippleLayout rippleLayout) {
        super(rippleLayout.getContext(), null);
        ckf.g(rippleLayout, "rippleContainer");
        this.rippleContainer = rippleLayout;
        setVisibility(4);
    }

    public static /* synthetic */ Object ipc$super(RippleCircleView rippleCircleView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/RippleCircleView");
    }

    public final RippleLayout getRippleContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RippleLayout) ipChange.ipc$dispatch("f61815d", new Object[]{this});
        }
        return this.rippleContainer;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        super.onDraw(canvas);
        float f = hfn.f(getWidth(), getHeight()) / 2.0f;
        canvas.drawCircle(f, f, f, this.rippleContainer.getPaint());
    }

    public final void setRippleContainer(RippleLayout rippleLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965728bf", new Object[]{this, rippleLayout});
            return;
        }
        ckf.g(rippleLayout, "<set-?>");
        this.rippleContainer = rippleLayout;
    }
}
