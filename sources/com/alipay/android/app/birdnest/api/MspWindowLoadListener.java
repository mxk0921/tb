package com.alipay.android.app.birdnest.api;

import android.os.Bundle;
import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface MspWindowLoadListener {
    void onCloseWindow(View view, Bundle bundle);

    void onWindowLoadFail(int i, Bundle bundle);

    void onWindowLoadSuccess(View view, Bundle bundle);

    void onWindowResize(int i, int i2, Bundle bundle);
}
