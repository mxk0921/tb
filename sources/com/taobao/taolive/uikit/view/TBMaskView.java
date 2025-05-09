package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBMaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093707);
    }

    public TBMaskView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBMaskView tBMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBMaskView");
    }

    public void setMask(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f84e099", new Object[]{this, drawable});
        } else if (drawable != null) {
            setBackground(drawable);
        }
    }

    public TBMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TBMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
