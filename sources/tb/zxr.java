package tb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.embed.Empty;
import android.taobao.windvane.extra.uc.WVUCClient;
import android.taobao.windvane.webview.IWVWebView;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.fragment.SplashFragment;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedView;
import com.uc.webview.export.extension.IEmbedViewContainer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zxr extends WVUCClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IWVWebView f33080a;

    static {
        t2o.a(619708477);
    }

    public zxr(IWVWebView iWVWebView) {
        super(iWVWebView);
        this.f33080a = iWVWebView;
    }

    public static /* synthetic */ Object ipc$super(zxr zxrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1410714603) {
            return super.getEmbedView((EmbedViewConfig) objArr[0], (IEmbedViewContainer) objArr[1]);
        }
        if (hashCode == 1507240588) {
            super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/TBUCClient");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEmbedView) ipChange.ipc$dispatch("5415cbeb", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        IWVWebView iWVWebView = this.f33080a;
        if (iWVWebView != null && ssw.e(iWVWebView.getUrl())) {
            return super.getEmbedView(embedViewConfig, iEmbedViewContainer);
        }
        if (this.f33080a == null) {
            v7t.d(y71.MONITOR_POINT_EMBED_VIEW, "embed view not allowed, for webview is null");
        } else {
            v7t.d(y71.MONITOR_POINT_EMBED_VIEW, "embed view not allowed, for url = [" + this.f33080a.getUrl() + "] is not allowed");
        }
        Empty empty = new Empty();
        empty.init("", "empty", this.f33080a, null);
        return empty;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public void onWebViewEvent(WebView webView, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d6aa8c", new Object[]{this, webView, new Integer(i), obj});
            return;
        }
        if (i == 6) {
            try {
                String str = "0";
                if ((obj instanceof Map) && ((Map) obj).containsKey("ts")) {
                    str = (String) ((Map) obj).get("ts");
                }
                long parseLong = Long.parseLong(str);
                v7t.i("TBUCClient", "BA UC_T1:  t1=" + parseLong);
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    context = ((MutableContextWrapper) webView.getContext()).getBaseContext();
                }
                if (!(context instanceof FragmentActivity)) {
                    v7t.d("TBUCClient", "cannot dismiss. context is " + context);
                } else if (j9l.a()) {
                    SplashFragment.dismiss(((FragmentActivity) context).getSupportFragmentManager());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.onWebViewEvent(webView, i, obj);
    }
}
