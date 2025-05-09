package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.alibaba.ut.TrackerWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class egw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static xbe a(Activity activity) {
        WebView webView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xbe) ipChange.ipc$dispatch("7da8228b", new Object[]{activity});
        }
        TrackerWebView trackerWebView = (TrackerWebView) activity.getClass().getAnnotation(TrackerWebView.class);
        if (trackerWebView != null) {
            webView = (WebView) activity.findViewById(trackerWebView.value());
        } else {
            webView = null;
        }
        if (webView != null) {
            return new d4r(webView);
        }
        return c(activity.getWindow().getDecorView());
    }

    public static boolean b(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57b4b099", new Object[]{cls})).booleanValue();
        }
        if (cls == null || "android.view.View".equalsIgnoreCase(cls.getName()) || cls.getSuperclass() == null) {
            return false;
        }
        if ("com.uc.webview.export.WebView".equalsIgnoreCase(cls.getName())) {
            return true;
        }
        return b(cls.getSuperclass());
    }

    public static xbe c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xbe) ipChange.ipc$dispatch("cf0b5f29", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof WebView) {
            return new d4r((WebView) view);
        }
        if (b(view.getClass())) {
            return new tsu((com.uc.webview.export.WebView) view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xbe c = c(viewGroup.getChildAt(i));
            if (c != null) {
                return c;
            }
        }
        return null;
    }
}
