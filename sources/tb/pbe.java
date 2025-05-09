package tb;

import android.webkit.ValueCallback;
import kotlin.Deprecated;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface pbe extends krb {
    void E0(fu fuVar);

    @Deprecated(message = "deprecated, use IWebCoreView#registerWebGestureListener instead")
    void M0(jzw jzwVar);

    m3e e0();

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    void f1(kzw kzwVar);
}
