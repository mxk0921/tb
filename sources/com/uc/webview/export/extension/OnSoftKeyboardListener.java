package com.uc.webview.export.extension;

import android.webkit.ValueCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface OnSoftKeyboardListener {
    boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback);

    boolean hideSoftKeyboard();

    boolean onFinishComposingText();
}
