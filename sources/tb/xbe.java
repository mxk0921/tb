package tb;

import android.content.Context;
import android.webkit.ValueCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface xbe {
    void addJavascriptInterface(Object obj, String str);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    Context getContext();

    boolean post(Runnable runnable);
}
