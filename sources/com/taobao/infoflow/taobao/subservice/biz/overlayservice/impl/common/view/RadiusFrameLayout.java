package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RadiusFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wq2 cLipRadiusHandler;

    static {
        t2o.a(491782455);
    }

    public RadiusFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(RadiusFrameLayout radiusFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/common/view/RadiusFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.cLipRadiusHandler.h()) {
            super.dispatchDraw(canvas);
        } else {
            this.cLipRadiusHandler.b(this, canvas);
            super.dispatchDraw(canvas);
            this.cLipRadiusHandler.a(this, canvas);
        }
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.cLipRadiusHandler.j(this, f);
        }
    }

    public RadiusFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadiusFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cLipRadiusHandler = new wq2();
    }
}
