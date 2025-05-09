package com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.i4e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFNoneCornerCardView extends FrameLayout implements i4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mRadius = 0.0f;

    static {
        t2o.a(80740635);
        t2o.a(80740633);
    }

    public UMFNoneCornerCardView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(UMFNoneCornerCardView uMFNoneCornerCardView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/roundcard/UMFNoneCornerCardView");
    }

    @Override // tb.i4e
    public float getRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
        }
        return this.mRadius;
    }

    @Override // tb.i4e
    public void setCardBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94366759", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(i);
        }
    }

    @Override // tb.i4e
    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.mRadius = f;
        }
    }

    public UMFNoneCornerCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UMFNoneCornerCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
