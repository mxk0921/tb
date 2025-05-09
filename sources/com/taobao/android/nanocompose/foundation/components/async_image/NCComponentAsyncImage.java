package com.taobao.android.nanocompose.foundation.components.async_image;

import android.content.Context;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCComponentAsyncImage extends TUrlImageView {
    static {
        t2o.a(598736945);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCComponentAsyncImage(Context context) {
        super(context);
        ckf.g(context, "context");
        setEnableLayoutOptimize(true);
        setAutoRelease(true);
        enableSizeInLayoutParams(true);
    }
}
