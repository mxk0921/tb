package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class drw implements crw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856226);
        t2o.a(989856225);
    }

    public boolean b(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad0c10d", new Object[]{this, iWVWebView})).booleanValue();
        }
        return false;
    }
}
