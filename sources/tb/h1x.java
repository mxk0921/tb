package tb;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import android.webkit.ConsoleMessage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.PopLayerWVPlugin;
import com.taobao.tbpoplayer.view.PopLayerWebView;
import com.uc.webview.export.WebSettings;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<ConsoleMessage.MessageLevel, Character> WEBCONSOLE_LOGCAT_MAP;

    static {
        t2o.a(790626533);
        HashMap hashMap = new HashMap();
        WEBCONSOLE_LOGCAT_MAP = hashMap;
        hashMap.put(ConsoleMessage.MessageLevel.TIP, 'v');
        hashMap.put(ConsoleMessage.MessageLevel.LOG, 'i');
        hashMap.put(ConsoleMessage.MessageLevel.WARNING, 'w');
        hashMap.put(ConsoleMessage.MessageLevel.ERROR, 'e');
        hashMap.put(ConsoleMessage.MessageLevel.DEBUG, 'd');
    }

    public static void a(Context context, PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8463963", new Object[]{context, popLayerWebView});
            return;
        }
        WVUCWebView webView = popLayerWebView.getWebView();
        if (popLayerWebView.getWebView() instanceof WVUCWebView) {
            webView.setBackgroundColor(0);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSavePassword(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            webView.addJsObject("WVPopLayer", new PopLayerWVPlugin(popLayerWebView));
            View view = new View(context);
            view.setBackgroundColor(1);
            webView.getWvUIModel().setErrorView(view);
            popLayerWebView.setUseCacheMark(false);
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
        }
    }
}
