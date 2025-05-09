package com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import tb.i4e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFCardView extends CardView implements i4e {
    static {
        t2o.a(80740634);
        t2o.a(80740633);
    }

    public UMFCardView(Context context) {
        this(context, null);
    }

    public UMFCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UMFCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
        setRadius(0.0f);
    }
}
