package com.taobao.ptr.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import tb.t2o;
import tb.v4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrWebView extends WebView implements v4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final PtrBase.e defaultOnRefreshListener = new a();
    private final WebChromeClient defaultWebChromeClient = new WebChromeClient() { // from class: com.taobao.ptr.views.PtrWebView.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            if (str.hashCode() == 384496945) {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/PtrWebView$2");
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
                return;
            }
            super.onProgressChanged(webView, i);
            if (i >= 100 && PtrWebView.access$000(PtrWebView.this) != null) {
                PtrWebView.access$000(PtrWebView.this).refreshComplete(PtrWebView.this.getResources().getString(R.string.ptr_complete_label));
            }
        }
    };
    private final WebViewClient defaultWebViewClient = new WebViewClient() { // from class: com.taobao.ptr.views.PtrWebView.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            if (str.hashCode() == -1517546125) {
                super.onScaleChanged((WebView) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/PtrWebView$3");
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a58c1573", new Object[]{this, webView, new Float(f), new Float(f2)});
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }
    };
    private int lagThreshold;
    private PtrBase mParent;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements PtrBase.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.ptr.PtrBase.e
        public void a(PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
            }
        }

        @Override // com.taobao.ptr.PtrBase.e
        public void b(PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
            } else {
                PtrWebView.this.reload();
            }
        }
    }

    static {
        t2o.a(632291366);
        t2o.a(632291347);
    }

    public PtrWebView(Context context) {
        super(context);
        init();
        removeDefaultJsInterface();
    }

    public static /* synthetic */ PtrBase access$000(PtrWebView ptrWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("6a70ed50", new Object[]{ptrWebView});
        }
        return ptrWebView.mParent;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setWebViewClient(this.defaultWebViewClient);
        setWebChromeClient(this.defaultWebChromeClient);
    }

    private void initPtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb67145", new Object[]{this});
            return;
        }
        PtrBase ptrBase = this.mParent;
        if (ptrBase != null) {
            ptrBase.setOnRefreshListener(this.defaultOnRefreshListener);
        }
    }

    public static /* synthetic */ Object ipc$super(PtrWebView ptrWebView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/PtrWebView");
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        if (getScrollY() + this.lagThreshold >= ((float) Math.floor(getContentHeight() * getScale())) - getHeight()) {
            return true;
        }
        return false;
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        if (getScrollY() <= this.lagThreshold) {
            return true;
        }
        return false;
    }

    @Override // tb.v4n
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            this.mParent = (PtrBase) pullBase;
            initPtr();
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            this.mParent.setOnRefreshListener(null);
            this.mParent = null;
        }
    }

    public void removeDefaultJsInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21888f9a", new Object[]{this});
            return;
        }
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibilityTraversal");
            removeJavascriptInterface("accessibility");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setLagThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5267fc1", new Object[]{this, new Integer(i)});
        } else {
            this.lagThreshold = i;
        }
    }

    public PtrWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
        removeDefaultJsInterface();
    }

    public PtrWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
        removeDefaultJsInterface();
    }
}
