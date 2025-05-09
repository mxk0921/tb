package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.TBLiveWebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class roa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1027604502);
    }

    public static Object a(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b7cf83d1", new Object[]{iWVWebView});
        }
        if (iWVWebView instanceof TBLiveWebView) {
            return ((TBLiveWebView) iWVWebView).getWebViewToken();
        }
        if (!(iWVWebView instanceof WVUCWebView)) {
            return null;
        }
        Object externalContext = ((WVUCWebView) iWVWebView).getExternalContext("themis_data_extension");
        if (!(externalContext instanceof rrb)) {
            return null;
        }
        Object n0 = ((rrb) externalContext).n0(zmr.TB_LIVE_THEMIS_CONTAINER);
        if (n0 instanceof zmr) {
            return ((zmr) n0).c();
        }
        return null;
    }
}
