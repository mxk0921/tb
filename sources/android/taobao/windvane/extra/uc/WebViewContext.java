package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.performance.BuiltinWebViewPageModel;
import android.taobao.windvane.extra.performance.WVWebViewPageModel;
import android.taobao.windvane.extra.uc.pool.PreCreateInfo;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCExtension;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ace;
import tb.add;
import tb.cce;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.w9o;
import tb.x74;
import tb.ycd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WebViewContext implements ace {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String customMegaBizId;
    private String customMegaNamespace;
    private PreCreateInfo mPreCreateInfo;
    private String mRealUrl;
    private w9o mResponseInfo;
    private final WVUCWebView mWebView;
    public ace.a megaHandler;
    private final List<ycd> prerenderAttachEventListeners = new CopyOnWriteArrayList();
    private final List<add> prerenderSuccessEventListeners = new CopyOnWriteArrayList();
    private boolean mIsClientPrerender = false;
    private boolean mHitSnapshot = false;
    private boolean mEnableAsyncJSAPIChannel = false;
    private boolean mIsThemis = false;
    private final WVWebViewPageModel webViewPageModel = new WVWebViewPageModel();

    static {
        t2o.a(989856154);
        t2o.a(989855918);
    }

    public WebViewContext(final WVUCWebView wVUCWebView) {
        this.mWebView = wVUCWebView;
        if (vpw.commonConfig.r2) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            wVUCWebView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: android.taobao.windvane.extra.uc.WebViewContext.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                    } else if (atomicBoolean.compareAndSet(false, true)) {
                        v7t.i("WebViewContext", "addBuiltinPageModel");
                        WebViewContext.this.addWebViewPageModel(new BuiltinWebViewPageModel(wVUCWebView));
                        if (WebViewContext.access$000(WebViewContext.this)) {
                            UCExtension uCExtension = wVUCWebView.getUCExtension();
                            if (uCExtension != null) {
                                uCExtension.setIsPreRender(false);
                                WebViewContext.this.getWebViewPageModel().onProperty("H5_PreRender", Boolean.TRUE);
                                WebViewContext.this.getWebViewPageModel().onProperty("H5_URL", wVUCWebView.getUrl());
                            }
                            for (ycd ycdVar : WebViewContext.access$100(WebViewContext.this)) {
                                if (ycdVar != null) {
                                    ycdVar.a(wVUCWebView.getWebViewContext().getRealUrl());
                                }
                            }
                        }
                        wVUCWebView.removeOnAttachStateChangeListener(this);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    }
                }
            });
            return;
        }
        addWebViewPageModel(new BuiltinWebViewPageModel(wVUCWebView));
    }

    public static /* synthetic */ boolean access$000(WebViewContext webViewContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("635d5e1a", new Object[]{webViewContext})).booleanValue();
        }
        return webViewContext.mIsClientPrerender;
    }

    public static /* synthetic */ List access$100(WebViewContext webViewContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ecb578b2", new Object[]{webViewContext});
        }
        return webViewContext.prerenderAttachEventListeners;
    }

    @Override // tb.ace
    public void addPrerenderAttachEventListener(ycd ycdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc5aad3", new Object[]{this, ycdVar});
        } else {
            this.prerenderAttachEventListeners.add(ycdVar);
        }
    }

    @Override // tb.ace
    public void addPrerenderSuccessEventListener(add addVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117e5a3f", new Object[]{this, addVar});
        } else {
            this.prerenderSuccessEventListeners.add(addVar);
        }
    }

    @Override // tb.ace
    public void addWebViewPageModel(cce cceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ed38db", new Object[]{this, cceVar});
        } else {
            this.webViewPageModel.addWebViewPageModel(cceVar);
        }
    }

    @Override // tb.ace
    public String getCustomMegaBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c39b884", new Object[]{this});
        }
        return this.customMegaBizId;
    }

    @Override // tb.ace
    public String getCustomMegaNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0b2ee57", new Object[]{this});
        }
        return this.customMegaNamespace;
    }

    @Override // tb.ace
    public boolean getEnableAsyncJSAPIChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9de2ec0", new Object[]{this})).booleanValue();
        }
        return this.mEnableAsyncJSAPIChannel;
    }

    public w9o getMainFrameResponseInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9o) ipChange.ipc$dispatch("c45b28a9", new Object[]{this});
        }
        return this.mResponseInfo;
    }

    @Override // tb.ace
    public String getMegaBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28d88d33", new Object[]{this});
        }
        return x74.c(this.mWebView.getCurrentUrl(), this.customMegaBizId);
    }

    @Override // tb.ace
    public ace.a getMegaHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ace.a) ipChange.ipc$dispatch("e244b519", new Object[]{this});
        }
        return this.megaHandler;
    }

    @Override // tb.ace
    public PreCreateInfo getPreCreateInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreCreateInfo) ipChange.ipc$dispatch("c7ffbd37", new Object[]{this});
        }
        return this.mPreCreateInfo;
    }

    @Override // tb.ace
    public String getRealUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbf55f1e", new Object[]{this});
        }
        return this.mRealUrl;
    }

    @Override // tb.ace
    public cce getWebViewPageModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cce) ipChange.ipc$dispatch("9884ab6a", new Object[]{this});
        }
        return this.webViewPageModel;
    }

    @Override // tb.ace
    public boolean isClientPrerender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdf4d26f", new Object[]{this})).booleanValue();
        }
        return this.mIsClientPrerender;
    }

    @Override // tb.ace
    public boolean isHitSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39726cf8", new Object[]{this})).booleanValue();
        }
        return this.mHitSnapshot;
    }

    @Override // tb.ace
    public boolean isThemis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4329b", new Object[]{this})).booleanValue();
        }
        return this.mIsThemis;
    }

    @Override // tb.ace
    public void notifyPrerenderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9c8c3a", new Object[]{this});
            return;
        }
        for (add addVar : this.prerenderSuccessEventListeners) {
            if (addVar != null) {
                addVar.onSuccess();
            }
        }
        this.prerenderSuccessEventListeners.clear();
    }

    @Override // tb.ace
    public void removePrerenderAttachEventListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea49719b", new Object[]{this});
        } else {
            this.prerenderAttachEventListeners.clear();
        }
    }

    @Override // tb.ace
    public void setCustomMegaBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5252cda", new Object[]{this, str});
        } else {
            this.customMegaBizId = str;
        }
    }

    @Override // tb.ace
    public void setCustomMegaNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d805767", new Object[]{this, str});
        } else {
            this.customMegaNamespace = str;
        }
    }

    @Override // tb.ace
    public void setEnableAsyncJSAPIChannel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd1bea4", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAsyncJSAPIChannel = z;
        }
    }

    @Override // tb.ace
    public void setHitSnapshot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c82398", new Object[]{this, new Boolean(z)});
        } else {
            this.mHitSnapshot = z;
        }
    }

    @Override // tb.ace
    public void setIsClientPrerender(boolean z) {
        UCExtension uCExtension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb840cb", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsClientPrerender = z;
        if (z && (uCExtension = this.mWebView.getUCExtension()) != null) {
            uCExtension.setIsPreRender(true);
        }
    }

    @Override // tb.ace
    public void setMainFrameResponseInfo(w9o w9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929d85dd", new Object[]{this, w9oVar});
        } else {
            this.mResponseInfo = w9oVar;
        }
    }

    @Override // tb.ace
    public void setMegaHandler(ace.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd7303", new Object[]{this, aVar});
        } else {
            this.megaHandler = aVar;
        }
    }

    @Override // tb.ace
    public void setPreCreateInfo(PreCreateInfo preCreateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d09c0d7", new Object[]{this, preCreateInfo});
        } else {
            this.mPreCreateInfo = preCreateInfo;
        }
    }

    @Override // tb.ace
    public void setRealUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba0d80", new Object[]{this, str});
        } else {
            this.mRealUrl = str;
        }
    }

    @Override // tb.ace
    public void setThemis(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d9f0e5", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsThemis = z;
        }
    }
}
