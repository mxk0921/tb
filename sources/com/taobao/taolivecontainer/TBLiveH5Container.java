package com.taobao.taolivecontainer;

import android.content.Context;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.jsbridge.TBLiveBasePlugin;
import com.uc.webview.export.WebViewClient;
import tb.a1v;
import tb.brq;
import tb.ch8;
import tb.fsw;
import tb.nkr;
import tb.t2o;
import tb.xud;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveH5Container extends TBLiveWebView implements xud {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TBLiveH5Container.class.getSimpleName();
    private long loadUrlTimestamp;
    private nkr mBuilder;
    public WVUCWebViewProxy mWebViewProxy;

    static {
        t2o.a(1027604484);
        t2o.a(1027604482);
        t2o.a(1027604483);
        fsw.i("TBLiveBasePlugin", TBLiveBasePlugin.class, true);
    }

    public TBLiveH5Container(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(TBLiveH5Container tBLiveH5Container, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1118518886:
                super.setWebViewClient((WebViewClient) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivecontainer/TBLiveH5Container");
        }
    }

    public void changeScreenLandscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a956e6", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageLandscape", "{}");
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, "changeScreenLandscape");
        }
    }

    public void changeScreenPortrait() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35710fe", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pagePortrait", "{}");
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, "changeScreenPortrait");
        }
    }

    @Override // com.taobao.taolivecontainer.TBLiveWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, "destroy");
        }
        this.mBuilder = null;
        WVUCWebViewProxy wVUCWebViewProxy = this.mWebViewProxy;
        if (wVUCWebViewProxy != null) {
            wVUCWebViewProxy.a();
            this.mWebViewProxy = null;
        }
    }

    @Override // tb.xud
    public nkr getBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkr) ipChange.ipc$dispatch("7b6af6f", new Object[]{this});
        }
        return this.mBuilder;
    }

    @Override // tb.xud
    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        return this;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            super.loadUrl(str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageDisappear", "{}");
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, "pageDisAppear onPause");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageAppear", "{}");
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, "pageAppear onResume");
        }
    }

    @Override // tb.xud
    public void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageAppear", "{}");
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, a1v.PAGE_APPEAR);
        }
    }

    public void pageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d96b47b", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageDisappear", "{}");
        nkr nkrVar = this.mBuilder;
        if (nkrVar != null) {
            nkrVar.v(TAG, "pageDisAppear");
        }
    }

    public void setBuilder(nkr nkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e382225", new Object[]{this, nkrVar});
        } else {
            this.mBuilder = nkrVar;
        }
    }

    public void setLoadUrlTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5f238e", new Object[]{this, new Long(j)});
        } else {
            this.loadUrlTimestamp = j;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ab3e66", new Object[]{this, webViewClient});
            return;
        }
        WVUCWebViewProxy wVUCWebViewProxy = this.mWebViewProxy;
        if (wVUCWebViewProxy != null) {
            wVUCWebViewProxy.b(webViewClient);
        }
    }

    public void setWebViewClientProxy(WVUCWebViewProxy wVUCWebViewProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75c9537", new Object[]{this, wVUCWebViewProxy});
            return;
        }
        super.setWebViewClient(wVUCWebViewProxy);
        this.mWebViewProxy = wVUCWebViewProxy;
    }

    public TBLiveH5Container(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // tb.xud
    public void renderSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb76c5dc", new Object[]{this, jSONObject});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!(this.mBuilder == null || jSONObject == null)) {
            currentTimeMillis = this.mBuilder.t("tlh5_h5_render_success", brq.b(jSONObject));
        }
        if (ch8.j(getContext())) {
            Context context = getContext();
            Toast.makeText(context, "TBLiveH5Container_time:" + (currentTimeMillis - this.loadUrlTimestamp), 0).show();
        }
    }

    public TBLiveH5Container(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
