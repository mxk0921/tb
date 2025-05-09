package tb;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import android.webkit.ValueCallback;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hmj implements IWVWebView, crw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20748a;
    public final View b;
    public final esw c;

    static {
        t2o.a(790626487);
        t2o.a(989856464);
        t2o.a(989856225);
    }

    public hmj(Context context, View view, Map<String, Object> map, String str) {
        this.c = new esw(context, this);
        this.f20748a = str;
        this.b = view;
        for (String str2 : map.keySet()) {
            addJsObject(str2, map.get(str2));
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
        }
        return null;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean _post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32066a08", new Object[]{this, runnable})).booleanValue();
        }
        return false;
    }

    @Override // tb.crw
    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e99ff9", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        return false;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void addJsObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            return;
        }
        esw eswVar = this.c;
        if (eswVar != null) {
            eswVar.a(str, obj);
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return PopLayer.getReference().getApp();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getDataOnActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b602214", new Object[]{this});
        }
        return "";
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Object getJsObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
        }
        esw eswVar = this.c;
        if (eswVar == null) {
            return null;
        }
        return eswVar.b(str);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        String str = this.f20748a;
        if (str != null) {
            return str;
        }
        return "NativePopEngine";
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getUserAgentString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this});
        }
        return "";
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setDataOnActive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714294e2", new Object[]{this, str});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setUserAgentString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
        }
    }
}
