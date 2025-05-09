package com.alipay.android.msp.plugin.engine;

import android.app.Activity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IOcrEngine {
    void finishOCRView();

    String startOCR(Activity activity, String str, int i);

    void stopOCR(String str);

    boolean supportOCR();
}
