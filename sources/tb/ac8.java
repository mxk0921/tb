package tb;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ac8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936321);
    }

    public static void a(IWVWebView iWVWebView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827780f4", new Object[]{iWVWebView, str, str2, str3});
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "{}";
        }
        iWVWebView.fireEvent("embedviewevent", "{\"param\":{\"eventType\":\"" + str2 + "\",\"bridgeId\":\"" + str + "\",\"params\":" + str3 + "}}");
    }
}
