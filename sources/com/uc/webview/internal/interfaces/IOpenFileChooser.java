package com.uc.webview.internal.interfaces;

import android.net.Uri;
import android.webkit.ValueCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IOpenFileChooser {
    public static final int FLAG = 100;

    void openFileChooser(ValueCallback<Uri> valueCallback);

    void openFileChooser(ValueCallback<Uri> valueCallback, String str);

    void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);
}
