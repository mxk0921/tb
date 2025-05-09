package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class AbsPinchImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float endCornerRadius;
    public float startCornerRadius;

    static {
        t2o.a(503316672);
    }

    public AbsPinchImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(AbsPinchImageView absPinchImageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/shareelement/AbsPinchImageView");
    }

    public abstract void setCornerRadius(float f);

    public void setCornerRadius(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72980d0", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.startCornerRadius = f;
        this.endCornerRadius = f2;
    }

    public AbsPinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsPinchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
