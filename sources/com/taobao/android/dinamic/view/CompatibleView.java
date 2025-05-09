package com.taobao.android.dinamic.view;

import android.content.Context;
import tb.t2o;
import tb.tl7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CompatibleView extends DFrameLayout {
    static {
        t2o.a(444596409);
    }

    public CompatibleView(Context context, String str) {
        super(context);
        if (tl7.f()) {
            setContentDescription(str);
        }
    }
}
