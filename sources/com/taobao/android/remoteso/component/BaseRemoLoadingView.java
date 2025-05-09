package com.taobao.android.remoteso.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import tb.j0n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseRemoLoadingView extends FrameLayout implements j0n {
    public BaseRemoLoadingView(Context context) {
        super(context);
    }

    @Override // tb.j0n
    public abstract /* synthetic */ void onProgressChanged(int i);

    public BaseRemoLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseRemoLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BaseRemoLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
