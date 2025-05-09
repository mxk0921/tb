package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbsFloatWindow extends FrameLayout {
    public int level;

    static {
        t2o.a(98566187);
    }

    public /* synthetic */ AbsFloatWindow(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsFloatWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }
}
