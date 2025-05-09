package tb;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.actionservice.core.BackgroundUCWebview;
import com.taobao.tao.flexbox.layoutmanager.actionservice.core.BackgroundWebview;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IWVWebView f21506a;

    static {
        t2o.a(347078695);
    }

    public iqf(Context context) {
        if ("true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tnode", "useucwebview", "true"))) {
            this.f21506a = new BackgroundUCWebview(context);
        } else {
            this.f21506a = new BackgroundWebview(context);
        }
    }

    public IWVWebView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("a50a9e10", new Object[]{this});
        }
        return this.f21506a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ef121", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        IWVWebView iWVWebView = this.f21506a;
        if (iWVWebView instanceof BackgroundUCWebview) {
            ((BackgroundUCWebview) iWVWebView).loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else if (iWVWebView instanceof BackgroundWebview) {
            ((BackgroundWebview) iWVWebView).loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }
}
