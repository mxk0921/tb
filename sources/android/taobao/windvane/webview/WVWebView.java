package android.taobao.windvane.webview;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVAppEvent;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.view.PopupWindowController;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.ali.user.mobile.exception.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a7e;
import tb.atw;
import tb.btw;
import tb.ctw;
import tb.esw;
import tb.f7l;
import tb.grw;
import tb.gtw;
import tb.h1p;
import tb.hzl;
import tb.itw;
import tb.jrw;
import tb.ksw;
import tb.lqw;
import tb.og8;
import tb.psw;
import tb.qsw;
import tb.rsw;
import tb.ssw;
import tb.t2o;
import tb.trw;
import tb.urw;
import tb.v7t;
import tb.voe;
import tb.vpw;
import tb.wmc;
import tb.wpw;
import tb.y71;
import tb.yaa;

/* compiled from: Taobao */
@Deprecated(forRemoval = true, since = "8.6.4")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWebView extends WebView implements Handler.Callback, IWVWebView, a7e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWebView";
    private static boolean evaluateJavascriptSupported = true;
    public Context context;
    public float dx;
    public float dy;
    public esw entryManager;
    public boolean isAlive;
    private String mImageUrl;
    public WVWebChromeClient webChromeClient;
    public WVWebViewClient webViewClient;
    public String bizCode = "";
    private int mWvNativeCallbackId = 1000;
    private boolean longPressSaveImage = true;
    public Handler mHandler = null;
    private atw wvUIModel = null;
    public boolean supportDownload = true;
    private boolean wvSupportNativeJs = false;
    private boolean wvSupportFileSchema = og8.d();
    private String currentUrl = null;
    private String dataOnActive = null;
    private final String WVURL_SUFFIX = "?wvFackUrlState=";
    private rsw wvSecurityFilter = null;
    private grw jsPatchListener = null;
    private View.OnLongClickListener mLongClickListener = null;
    public List<Runnable> taskQueue = new ArrayList();
    private boolean useUrlConfig = false;
    private boolean mUseGlobalUrlConfig = yaa.f().o();
    private boolean mAllowAllOpen = false;
    private int mPageLoadedCount = 0;
    private long onErrorTime = 0;
    private PopupWindowController mPopupController = null;
    private String[] mPopupMenuTags = {jrw.a(wmc.SAVE_TO_ALBUM)};
    private View.OnClickListener mPopupClickListener = new b();
    public boolean isUser = true;
    public SparseArray<MotionEvent> mEventSparseArray = new SparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class WVDownLoadListener implements DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856482);
        }

        public WVDownLoadListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
                return;
            }
            if (v7t.h()) {
                v7t.a(WVWebView.TAG, "Download start, url: " + str + " contentDisposition: " + str3 + " mimetype: " + str4 + " contentLength: " + j);
            }
            if (!WVWebView.this.supportDownload) {
                v7t.n(WVWebView.TAG, "DownloadListener is not support for webview.");
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            try {
                WVWebView.this.context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(WVWebView.this.context, "对不起，您的设备找不到相应的程序", 1).show();
                v7t.d(WVWebView.TAG, "DownloadListener not found activity to open this url.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            WebView.HitTestResult hitTestResult;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            try {
                hitTestResult = WVWebView.this.getHitTestResult();
            } catch (Exception unused) {
                hitTestResult = null;
            }
            if (hitTestResult == null || !WVWebView.access$000(WVWebView.this)) {
                return false;
            }
            if (v7t.h()) {
                v7t.a(WVWebView.TAG, "Long click on WebView, " + hitTestResult.getExtra());
            }
            if (hitTestResult.getType() != 8 && hitTestResult.getType() != 5) {
                return false;
            }
            WVWebView.access$102(WVWebView.this, hitTestResult.getExtra());
            WVWebView wVWebView = WVWebView.this;
            WVWebView wVWebView2 = WVWebView.this;
            WVWebView.access$202(wVWebView, new PopupWindowController(wVWebView2.context, wVWebView2, WVWebView.access$300(wVWebView2), WVWebView.access$400(WVWebView.this)));
            WVWebView.access$200(WVWebView.this).i();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WVWebView.this.mHandler.sendEmptyMessage(405);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: android.taobao.windvane.webview.WVWebView$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class RunnableC0012b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0012b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    voe.g(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                }
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (WVWebView.access$300(WVWebView.this) != null && WVWebView.access$300(WVWebView.this).length > 0 && WVWebView.access$300(WVWebView.this)[0].equals(view.getTag())) {
                try {
                    if (Build.VERSION.SDK_INT < 30) {
                        hzl.b(WVWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new RunnableC0012b()).h(new a()).d();
                    } else {
                        voe.g(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                    }
                } catch (Exception unused) {
                }
            }
            if (WVWebView.access$200(WVWebView.this) != null) {
                WVWebView.access$200(WVWebView.this).e();
            }
        }
    }

    static {
        t2o.a(989856477);
        t2o.a(989856464);
        t2o.a(989856463);
    }

    public WVWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.context = context;
        init();
    }

    public static /* synthetic */ boolean access$000(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d435824e", new Object[]{wVWebView})).booleanValue();
        }
        return wVWebView.longPressSaveImage;
    }

    public static /* synthetic */ String access$100(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88658b57", new Object[]{wVWebView});
        }
        return wVWebView.mImageUrl;
    }

    public static /* synthetic */ String access$102(WVWebView wVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94de028f", new Object[]{wVWebView, str});
        }
        wVWebView.mImageUrl = str;
        return str;
    }

    public static /* synthetic */ PopupWindowController access$200(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowController) ipChange.ipc$dispatch("c3d1380b", new Object[]{wVWebView});
        }
        return wVWebView.mPopupController;
    }

    public static /* synthetic */ PopupWindowController access$202(WVWebView wVWebView, PopupWindowController popupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowController) ipChange.ipc$dispatch("6f29a6b0", new Object[]{wVWebView, popupWindowController});
        }
        wVWebView.mPopupController = popupWindowController;
        return popupWindowController;
    }

    public static /* synthetic */ String[] access$300(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("35b30cb6", new Object[]{wVWebView});
        }
        return wVWebView.mPopupMenuTags;
    }

    public static /* synthetic */ View.OnClickListener access$400(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("c23c9caf", new Object[]{wVWebView});
        }
        return wVWebView.mPopupClickListener;
    }

    private void commitLoadUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb980e0", new Object[]{this, str, new Integer(i)});
            return;
        }
        wpw wpwVar = vpw.commonConfig;
        if (wpwVar.t1 && str != null && (str.startsWith(itw.URL_SEPARATOR) || str.startsWith(h1p.HTTP_PREFIX))) {
            y71.commitFail("loadHttpUrl", i, getContextName(), str);
        }
        if (wpwVar.u1 && str != null) {
            y71.commitFail("loadUrl", i, getContextName(), str);
        }
    }

    private String getContextName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17dfa1d5", new Object[]{this});
        }
        Context _getContext = _getContext();
        if (_getContext != null) {
            return _getContext.getClass().getName();
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(WVWebView wVWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1888728565:
                return new Float(super.getScale());
            case -1512649357:
                super.onResume();
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1384276246:
                return new Boolean(super.canGoBack());
            case -1312899459:
                super.evaluateJavascript((String) objArr[0], (ValueCallback) objArr[1]);
                return null;
            case -1247571552:
                super.reload();
                return null;
            case -1185152872:
                super.addJavascriptInterface(objArr[0], (String) objArr[1]);
                return null;
            case -788773096:
                super.clearCache(((Boolean) objArr[0]).booleanValue());
                return null;
            case -597752619:
                super.loadData((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case -561052064:
                return super.getUrl();
            case -188459541:
                super.pauseTimers();
                return null;
            case -148357436:
                return new Integer(super.getContentHeight());
            case 490249163:
                super.loadUrl((String) objArr[0], (Map) objArr[1]);
                return null;
            case 522121505:
                super.loadDataWithBaseURL((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1052368738:
                super.resumeTimers();
                return null;
            case 1144012385:
                super.setWebViewClient((WebViewClient) objArr[0]);
                return null;
            case 1248879303:
                super.postUrl((String) objArr[0], (byte[]) objArr[1]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1991633153:
                super.setWebChromeClient((WebChromeClient) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/webview/WVWebView");
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
        }
        return getContext();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean _post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32066a08", new Object[]{this, runnable})).booleanValue();
        }
        if (isAttachedToWindow() || Build.VERSION.SDK_INT >= 24) {
            return post(runnable);
        }
        v7t.a(TAG, " webview has not attach to window");
        this.taskQueue.add(runnable);
        return true;
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        } else if (!"accessibility".equals(str) && !"accessibilityTraversal".equals(str)) {
            super.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void addJsObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.a(str, obj);
        }
    }

    @Override // tb.a7e
    public boolean allowAllOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f86a6f8d", new Object[]{this})).booleanValue();
        }
        return this.mAllowAllOpen;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!canGoBack()) {
            return false;
        }
        goBack();
        int i = this.mPageLoadedCount;
        if (i > 0) {
            this.mPageLoadedCount = i - 1;
        } else {
            v7t.d(TAG, "back pressed, mPageLoadedCount=" + this.mPageLoadedCount);
        }
        return true;
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (lqw.d().e(ErrorCode.CLIENT_NETWORK_ERROR).f22859a) {
            return false;
        }
        return super.canGoBack();
    }

    @Override // tb.a7e
    public boolean canUseGlobalUrlConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaf245a2", new Object[]{this})).booleanValue();
        }
        return this.mUseGlobalUrlConfig;
    }

    @Override // tb.a7e
    public boolean canUseUrlConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("240f7b45", new Object[]{this})).booleanValue();
        }
        return this.useUrlConfig;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            super.clearCache(true);
        }
    }

    public void closeLongPressSaveImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8d2f96", new Object[]{this});
        } else {
            this.longPressSaveImage = false;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
        } else {
            evaluateJavascript(str, null);
        }
    }

    public void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            fireEvent(str, "{}");
        }
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        return (int) (super.getContentHeight() * super.getScale());
    }

    public String getCurrentUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        String url = super.getUrl();
        if (url == null) {
            v7t.l(TAG, "getUrl by currentUrl: " + this.currentUrl);
            return this.currentUrl;
        }
        v7t.l(TAG, "getUrl by webview: " + url);
        return url;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getDataOnActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b602214", new Object[]{this});
        }
        return this.dataOnActive;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Object getJsObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
        }
        esw eswVar = this.entryManager;
        if (eswVar == null) {
            return null;
        }
        return eswVar.b(str);
    }

    @Override // tb.a7e
    public int getPageLoadedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("311abdbf", new Object[]{this})).intValue();
        }
        return this.mPageLoadedCount;
    }

    @Override // android.webkit.WebView, android.taobao.windvane.webview.IWVWebView
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return getCurrentUrl();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getUserAgentString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this});
        }
        return getSettings().getUserAgentString();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Deprecated
    public WVCallBackContext getWVCallBackContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("587cc277", new Object[]{this});
        }
        return new WVCallBackContext(this);
    }

    public Handler getWVHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e3580a6a", new Object[]{this});
        }
        return this.mHandler;
    }

    public atw getWvUIModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atw) ipChange.ipc$dispatch("3b3a9b1c", new Object[]{this});
        }
        return this.wvUIModel;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            return;
        }
        atw atwVar = this.wvUIModel;
        if (atwVar != null) {
            atwVar.hideLoadingView();
        }
    }

    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        return this.isAlive;
    }

    public boolean isSupportFileSchema() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcf11eed", new Object[]{this})).booleanValue();
        }
        return this.wvSupportFileSchema;
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5f04d5", new Object[]{this, str, str2, str3});
        } else if (this.isAlive) {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ef121", new Object[]{this, str, str2, str3, str4, str5});
        } else if (this.isAlive) {
            if (v7t.h()) {
                v7t.a(TAG, "loadDataWithBaseURL: baseUrl=" + str);
            }
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        qsw a2;
        qsw a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (this.isAlive && str != null) {
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.f0 && (a3 = psw.a()) != null) {
                str = a3.dealUrlScheme(str);
            }
            if (gtw.g(str) && ssw.c(str, this)) {
                String b2 = btw.c().b();
                if (TextUtils.isEmpty(b2)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "GET_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    super.loadUrl(b2);
                } catch (Exception e) {
                    v7t.d(TAG, e.getMessage());
                }
            } else if (ctw.a(str, this.context, this)) {
                v7t.d(TAG, "loadUrl filter url=" + str);
            } else {
                lqw.d().e(ErrorCode.SIM_LOGIN_GET_TOKEN_FAIL);
                if (v7t.h()) {
                    v7t.a(TAG, "loadUrl: url=" + str);
                }
                if (!wpwVar.f0 && (a2 = psw.a()) != null) {
                    str = a2.dealUrlScheme(str);
                }
                qsw a4 = psw.a();
                if (a4 != null) {
                    str = a4.dealUrlScheme(str);
                }
                try {
                    if (wpwVar.X0) {
                        this.currentUrl = str;
                    }
                    commitLoadUrl(str, 1);
                    super.loadUrl(str);
                } catch (Exception e2) {
                    v7t.d(TAG, e2.getMessage());
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.c(i, i2, intent);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        for (Runnable runnable : this.taskQueue) {
            runnable.run();
        }
        this.taskQueue.clear();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.taskQueue.size() != 0) {
            this.taskQueue.clear();
        }
    }

    public void onMessage(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf50210", new Object[]{this, new Integer(i), obj});
        } else if (this.mHandler != null) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.mHandler.sendMessage(obtain);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.e();
        }
        super.onPause();
        lqw.d().e(3001);
        if (vpw.commonConfig.e0) {
            CookieManager.getInstance().flush();
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.g();
        }
        super.onResume();
        lqw.d().f(3002, this, getUrl(), new Object[0]);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.h(i, i2, i3, i4);
        }
        try {
            super.onScrollChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (action == 0) {
            this.dx = motionEvent.getX();
            this.dy = motionEvent.getY();
            if (!this.isUser) {
                this.mEventSparseArray.put(pointerId, MotionEvent.obtain(motionEvent));
                return true;
            }
        } else if (action == 2) {
            if (!this.isUser && Math.abs(motionEvent.getY() - this.dy) > 5.0f) {
                return true;
            }
        } else if (action == 1) {
            if (this.isUser || Math.abs(motionEvent.getY() - this.dy) <= 5.0f) {
                MotionEvent motionEvent2 = this.mEventSparseArray.get(pointerId);
                if (motionEvent2 != null) {
                    super.onTouchEvent(motionEvent2);
                    motionEvent2.recycle();
                    this.mEventSparseArray.remove(pointerId);
                }
            } else {
                this.isUser = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void openLongPressSaveImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d988e68", new Object[]{this});
        } else {
            this.longPressSaveImage = true;
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c455eb", new Object[]{this});
            return;
        }
        super.pauseTimers();
        if (v7t.h()) {
            v7t.d(TAG, "You  must be careful  to Call pauseTimers ,It's Global");
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            reload();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            super.reload();
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb9df62", new Object[]{this});
            return;
        }
        super.resumeTimers();
        if (v7t.h()) {
            v7t.d(TAG, "You  must be careful  to Call resumeTimers ,It's Global");
        }
    }

    @Override // tb.a7e
    public void setAllowAllOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aec829", new Object[]{this, new Boolean(z)});
        } else {
            this.mAllowAllOpen = z;
        }
    }

    public void setCurrentUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770a2153", new Object[]{this, str, str2});
            return;
        }
        this.currentUrl = str;
        v7t.l(TAG, "setCurrentUrl: " + str + " state : " + str2);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setDataOnActive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714294e2", new Object[]{this, str});
        } else {
            this.dataOnActive = str;
        }
    }

    public void setGlobalUrlConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d3406d", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseGlobalUrlConfig = z;
        }
    }

    public void setSupportDownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f90f98", new Object[]{this, new Boolean(z)});
        } else {
            this.supportDownload = z;
        }
    }

    public void setSupportFileSchema(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d116643", new Object[]{this, new Boolean(z)});
        } else {
            this.wvSupportFileSchema = z;
        }
    }

    public void setUrlConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99261aa", new Object[]{this, new Boolean(z)});
        } else {
            this.useUrlConfig = z;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setUserAgentString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
        } else {
            getSettings().setUserAgentString(str);
        }
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b5e901", new Object[]{this, webChromeClient});
        } else if (webChromeClient instanceof WVWebChromeClient) {
            WVWebChromeClient wVWebChromeClient = (WVWebChromeClient) webChromeClient;
            this.webChromeClient = wVWebChromeClient;
            wVWebChromeClient.mWebView = this;
            super.setWebChromeClient(webChromeClient);
        } else {
            WVWebChromeClient wVWebChromeClient2 = this.webChromeClient;
            if (wVWebChromeClient2 != null) {
                wVWebChromeClient2.extraWebChromeClient = webChromeClient;
            }
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44303e61", new Object[]{this, webViewClient});
        } else if (webViewClient instanceof WVWebViewClient) {
            this.webViewClient = (WVWebViewClient) webViewClient;
            super.setWebViewClient(webViewClient);
        } else {
            WVWebViewClient wVWebViewClient = this.webViewClient;
            if (wVWebViewClient != null) {
                wVWebViewClient.extraWebViewClient = webViewClient;
            }
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
            return;
        }
        atw atwVar = this.wvUIModel;
        if (atwVar != null) {
            atwVar.showLoadingView();
        }
    }

    public void superLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2e52bf", new Object[]{this, str});
        } else if (this.isAlive) {
            super.loadUrl(str);
        }
    }

    public void supportJavascriptInterface(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898fb750", new Object[]{this, new Boolean(z)});
        } else {
            this.wvSupportNativeJs = z;
        }
    }

    private void configSettings() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        String a2 = yaa.f().a();
        String b2 = yaa.f().b();
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(b2)) {
                userAgentString = userAgentString + " AliApp(" + a2 + "/" + b2 + f7l.BRACKET_END_STR;
            }
            if (!userAgentString.contains("TTID/") && !TextUtils.isEmpty(yaa.f().g())) {
                userAgentString = userAgentString + " TTID/" + yaa.f().g();
            }
        }
        settings.setUserAgentString(userAgentString + yaa.DEFAULT_UA);
        settings.setCacheMode(-1);
        int i = Build.VERSION.SDK_INT;
        settings.setDatabaseEnabled(false);
        String str = "/data/data/" + this.context.getPackageName() + "/databases";
        settings.setDatabasePath(str);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(str);
        settings.setDomStorageEnabled(true);
        if (i < 33) {
            try {
                settings.getClass().getMethod("setAppCacheEnabled", Boolean.TYPE).invoke(settings, Boolean.TRUE);
                Context context = this.context;
                if (!(context == null || context.getCacheDir() == null)) {
                    settings.getClass().getMethod("setAppCachePath", String.class).invoke(settings, this.context.getCacheDir().getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        settings.setTextZoom(100);
        vpw.b();
        wpw wpwVar = vpw.commonConfig;
        boolean z = wpwVar.M0;
        vpw.b();
        if (wpwVar.N0) {
            settings.setAllowFileAccess(false);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.isAlive) {
            this.isAlive = false;
            this.mPageLoadedCount = 0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.context.getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
            }
            super.setWebViewClient(null);
            super.setWebChromeClient(null);
            this.webViewClient = null;
            this.webChromeClient = null;
            WVJsBridge.g().l();
            this.entryManager.d();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
            lqw.d().e(3003);
            lqw.d().h(this.wvSecurityFilter);
            lqw.d().h(this.jsPatchListener);
            removeAllViews();
            this.mPopupController = null;
            this.mPopupClickListener = null;
            this.mLongClickListener = null;
            setOnLongClickListener(null);
            ConcurrentHashMap<String, Integer> concurrentHashMap = IWVWebView.JsbridgeHis;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            try {
                super.destroy();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.webkit.WebView, android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
            return;
        }
        if (str != null && str.length() > 10 && "javascript:".equals(str.substring(0, 11).toLowerCase())) {
            str = str.substring(11);
        }
        if (evaluateJavascriptSupported) {
            try {
                super.evaluateJavascript(str, valueCallback);
            } catch (IllegalStateException unused) {
                evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            } catch (NoSuchMethodError unused2) {
                evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            }
        } else if (valueCallback == null) {
            loadUrl("javascript:" + str);
        } else {
            script2NativeCallback(str, valueCallback);
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
        } else {
            getWVCallBackContext().fireEvent(str, str2);
        }
    }

    public void script2NativeCallback(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5868cd3a", new Object[]{this, str, valueCallback});
            return;
        }
        int i = this.mWvNativeCallbackId + 1;
        this.mWvNativeCallbackId = i;
        urw.c(String.valueOf(i), valueCallback);
        loadUrl("javascript:console.log('wvNativeCallback/" + i + "/'+function(){var s = " + str + "; return (typeof s === 'object' ? JSON.stringify(s) : typeof s === 'string' ? '\"' + s + '\"' : s);}())");
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (og8.d()) {
            lqw.d().e(3008);
        }
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        WVWebViewClient wVWebViewClient = new WVWebViewClient(this.context);
        this.webViewClient = wVWebViewClient;
        super.setWebViewClient(wVWebViewClient);
        WVWebChromeClient wVWebChromeClient = new WVWebChromeClient(this.context);
        this.webChromeClient = wVWebChromeClient;
        super.setWebChromeClient(wVWebChromeClient);
        this.webChromeClient.mWebView = this;
        setVerticalScrollBarEnabled(false);
        requestFocus();
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        ksw.a(this.context);
        configSettings();
        if (v7t.h()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WVJsBridge.g().i();
        this.entryManager = new esw(this.context, this);
        WVAppEvent wVAppEvent = new WVAppEvent();
        wVAppEvent.initialize(this.context, this);
        addJsObject("AppEvent", wVAppEvent);
        this.wvSecurityFilter = new rsw();
        lqw.d().c(this.wvSecurityFilter, lqw.e);
        this.jsPatchListener = new grw(this);
        lqw.d().c(this.jsPatchListener, lqw.f);
        try {
            ClipboardManager clipboardManager = (ClipboardManager) this.context.getSystemService("clipboard");
            if (clipboardManager != null) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("初始化", ""));
                } else if ("intent:#Intent;S.K_1171477665=;end".equals(primaryClip.getItemAt(0).coerceToText(this.context).toString())) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("初始化", ""));
                }
            }
        } catch (Exception unused) {
        }
        this.wvUIModel = new atw(this.context, this);
        a aVar = new a();
        this.mLongClickListener = aVar;
        setOnLongClickListener(aVar);
        setDownloadListener(new WVDownLoadListener());
        this.isAlive = true;
        if (trw.getPackageMonitorInterface() != null) {
            trw.getPerformanceMonitor().didWebViewInitAtTime(System.currentTimeMillis());
        }
        if (ksw.b()) {
            try {
                setLayerType(1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        addJavascriptInterface(new WVBridgeEngine(this), "__windvane__");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        String str;
        String str2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 400:
                atw atwVar = this.wvUIModel;
                if (atwVar != null) {
                    z = true;
                }
                if (atwVar.isShowLoading() && z) {
                    this.wvUIModel.showLoadingView();
                    this.wvUIModel.switchNaviBar(1);
                }
                this.mPageLoadedCount++;
                return true;
            case 401:
                atw atwVar2 = this.wvUIModel;
                if (atwVar2 != null) {
                    z = true;
                }
                if (atwVar2.isShowLoading() && z) {
                    this.wvUIModel.hideLoadingView();
                    this.wvUIModel.resetNaviBar();
                }
                if (this.onErrorTime != 0 && System.currentTimeMillis() - this.onErrorTime > 3000) {
                    this.wvUIModel.hideErrorPage();
                }
                return true;
            case 402:
                this.wvUIModel.loadErrorPage();
                this.onErrorTime = System.currentTimeMillis();
                atw atwVar3 = this.wvUIModel;
                if (atwVar3 != null) {
                    z = true;
                }
                if (atwVar3.isShowLoading() && z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 403:
                atw atwVar4 = this.wvUIModel;
                if (atwVar4 != null) {
                    z = true;
                }
                if (atwVar4.isShowLoading() && z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 404:
                Context context = this.context;
                if (og8.c()) {
                    str = wmc.IMAGE_SAVED_SUCCESS;
                } else {
                    str = "Success to save picture";
                }
                Toast.makeText(context, str, 1).show();
                return true;
            case 405:
                Context context2 = this.context;
                if (og8.c()) {
                    str2 = wmc.IMAGE_SAVED_FAIL;
                } else {
                    str2 = "Failed to save picture";
                }
                Toast.makeText(context2, str2, 1).show();
                return true;
            default:
                return false;
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7062c7", new Object[]{this, str, bArr});
        } else if (this.isAlive && str != null) {
            if (gtw.g(str) && ssw.c(str, this)) {
                String b2 = btw.c().b();
                if (TextUtils.isEmpty(b2)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "POST_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    loadUrl(b2);
                } catch (Exception e) {
                    v7t.d(TAG, e.getMessage());
                }
            } else if (ctw.a(str, this.context, this)) {
                v7t.d(TAG, "loadUrl filter url=".concat(str));
            } else {
                if (v7t.h()) {
                    v7t.a(TAG, "postUrl: url=".concat(str));
                }
                commitLoadUrl(str, 3);
                super.postUrl(str, bArr);
            }
        }
    }

    public WVWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        init();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
        } else if (this.isAlive && str != null) {
            if (gtw.g(str) && ssw.c(str, this)) {
                String b2 = btw.c().b();
                if (TextUtils.isEmpty(b2)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "GET_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    super.loadUrl(b2);
                } catch (Exception e) {
                    v7t.d(TAG, e.getMessage());
                }
            } else if (ctw.a(str, this.context, this)) {
                v7t.d(TAG, "loadUrl filter url=".concat(str));
            } else {
                if (v7t.h()) {
                    v7t.a(TAG, "loadUrl with headers: url=".concat(str));
                }
                commitLoadUrl(str, 2);
                super.loadUrl(str, map);
            }
        }
    }

    public WVWebView(Context context) {
        super(context);
        this.context = context;
        init();
    }
}
