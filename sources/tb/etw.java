package tb;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface etw {
    boolean isNeedupdateURLRule(boolean z);

    boolean isOpenURLIntercept();

    boolean shouldOverrideUrlLoading(Context context, IWVWebView iWVWebView, String str);

    void updateURLRule();
}
