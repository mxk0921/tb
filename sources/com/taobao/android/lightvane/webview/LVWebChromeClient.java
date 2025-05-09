package com.taobao.android.lightvane.webview;

import android.content.Context;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.keg;
import tb.neg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LVWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LVWebChromeClient";
    private Context context;

    static {
        t2o.a(507510823);
    }

    public LVWebChromeClient(Context context) {
        this.context = context;
    }

    public static /* synthetic */ Object ipc$super(LVWebChromeClient lVWebChromeClient, String str, Object... objArr) {
        if (str.hashCode() == -634514222) {
            return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightvane/webview/LVWebChromeClient");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        String message = consoleMessage.message();
        if (message == null || !message.startsWith("lvNativeCallback")) {
            return super.onConsoleMessage(consoleMessage);
        }
        String substring = message.substring(message.indexOf("/") + 1);
        int indexOf = substring.indexOf("/");
        String substring2 = substring.substring(0, indexOf);
        String substring3 = substring.substring(indexOf + 1);
        ValueCallback<String> b = neg.b(substring2);
        if (b != null) {
            b.onReceiveValue(substring3);
            neg.a(substring2);
        } else {
            keg.b(TAG, "NativeCallback failed: " + substring3);
        }
        return true;
    }
}
