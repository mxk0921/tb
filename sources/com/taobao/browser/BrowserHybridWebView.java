package com.taobao.browser;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.performance2.WVFSPManager;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.urlFilter.UrlResourceFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.view.BrowserUIModel;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemUtils;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.uc.webview.export.WebBackForwardList;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCExtension;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import tb.a7e;
import tb.atf;
import tb.atw;
import tb.b2i;
import tb.d8s;
import tb.eqw;
import tb.ew8;
import tb.f7l;
import tb.fm2;
import tb.gov;
import tb.gtw;
import tb.h1p;
import tb.hzl;
import tb.jrw;
import tb.k7r;
import tb.lcn;
import tb.m7r;
import tb.mov;
import tb.og8;
import tb.opw;
import tb.qqw;
import tb.ssw;
import tb.t2o;
import tb.t4p;
import tb.v4s;
import tb.v7t;
import tb.vpw;
import tb.wmc;
import tb.wpw;
import tb.y71;
import tb.y7t;
import tb.yaa;
import tb.zxr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserHybridWebView extends PreRenderWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserHybridWebView";
    public UrlFilter filter;
    private boolean isProgessLoaded;
    public BrowserUIModel mBrowserUIModel;
    private Handler mOutHandler;
    private String mUTPageName;
    public Map<String, String> mUTParamMap;
    public ValueCallback<Uri> mUploadMsg;
    public ValueCallback<Uri[]> mUploadMsgAboveL;
    public Uri mUploadUriAboveL;
    @Deprecated
    private int jaeState = 2;
    private int webviewMode = -2;
    private String data2H5 = null;
    public boolean needNotiSafe = true;
    public boolean allowThirdMiddlePageJump = false;
    public int mPageLoadCount = 0;
    private String thirdMiddleJumpRegex = "";
    private String allowOpenClient = "0";
    public Map<String, Object> coreMultiType = new HashMap();
    public CommonWebViewClient client = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.browser.BrowserHybridWebView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0540a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0540a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    k7r.a(BrowserHybridWebView.TAG, "Permission Denied");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f10243a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ boolean d;

            public b(boolean z, String str, Context context, boolean z2) {
                this.f10243a = z;
                this.b = str;
                this.c = context;
                this.d = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f10243a) {
                    File file = new File(this.b + File.separator + "IMAGE_" + System.currentTimeMillis() + ".jpg");
                    a aVar = a.this;
                    BrowserHybridWebView.this.mUploadUriAboveL = qqw.c(a.a(aVar), file);
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.addFlags(1);
                    }
                    intent.putExtra("output", BrowserHybridWebView.this.mUploadUriAboveL);
                    ((Activity) this.c).startActivityForResult(intent, Constants.FILECHOOSER_REQ_CODE);
                } else if (this.d) {
                    File file2 = new File(this.b + File.separator + "VIDEO_" + System.currentTimeMillis() + gov.SUFFIX_MP4);
                    a aVar2 = a.this;
                    BrowserHybridWebView.this.mUploadUriAboveL = qqw.c(a.b(aVar2), file2);
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent2.addFlags(1);
                    }
                    intent2.putExtra("output", BrowserHybridWebView.this.mUploadUriAboveL);
                    ((Activity) this.c).startActivityForResult(intent2, Constants.FILECHOOSER_REQ_CODE);
                }
            }
        }

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Context a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("ec2c37e5", new Object[]{aVar});
            }
            return aVar.mContext;
        }

        public static /* synthetic */ Context b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("69d3104", new Object[]{aVar});
            }
            return aVar.mContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 2060440615) {
                return new Boolean(super.onShowFileChooser((WebView) objArr[0], (ValueCallback) objArr[1], (WebChromeClient.FileChooserParams) objArr[2]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserHybridWebView$1");
        }

        public void c(ValueCallback<Uri> valueCallback, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4d4056", new Object[]{this, valueCallback, str, str2});
                return;
            }
            Context _getContext = BrowserHybridWebView.this._getContext();
            if (_getContext != null && (_getContext instanceof Activity)) {
                BrowserHybridWebView.access$000(BrowserHybridWebView.this, valueCallback);
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/*");
                ((Activity) _getContext).startActivityForResult(Intent.createChooser(intent, _getContext.getString(R.string.browser_webview_file_chooser_title)), Constants.FILECHOOSER_REQ_CODE);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f178442", new Object[]{this, valueCallback});
            } else {
                c(valueCallback, null, null);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7acfd427", new Object[]{this, webView, valueCallback, fileChooserParams})).booleanValue();
            }
            if (!fm2.commonConfig.t) {
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            String arrays = Arrays.toString(fileChooserParams.getAcceptTypes());
            lcn.f(RVLLevel.Info, "onShowFileChooser", "AcceptTypes:" + arrays + ", Mode:" + fileChooserParams.getMode() + ", Hint:" + fileChooserParams.getFilenameHint());
            BrowserHybridWebView browserHybridWebView = BrowserHybridWebView.this;
            browserHybridWebView.mUploadMsgAboveL = valueCallback;
            Context _getContext = browserHybridWebView._getContext();
            if (_getContext != null && (_getContext instanceof Activity)) {
                try {
                    String b2 = opw.e().b(true);
                    if (b2 == null) {
                        return true;
                    }
                    File file = new File(b2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    boolean contains = arrays.contains("image/");
                    boolean contains2 = arrays.contains("video/");
                    if (!fileChooserParams.isCaptureEnabled() || (!contains && !contains2)) {
                        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
                    }
                    hzl.b(_getContext, new String[]{t4p.CAMERA}).i(new b(contains, b2, _getContext, contains2)).h(new RunnableC0540a()).d();
                } catch (Throwable th) {
                    y7t.a(BrowserHybridWebView.TAG, th.getMessage());
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements WVFSPManager.FSPCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(BrowserHybridWebView browserHybridWebView) {
        }

        @Override // android.taobao.windvane.extra.performance2.WVFSPManager.FSPCallback
        public void onFSPBack(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7555412", new Object[]{this, new Long(j)});
                return;
            }
            d8s.a().c(j);
            d8s.a().b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements UrlResourceFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(BrowserHybridWebView browserHybridWebView) {
        }

        @Override // com.taobao.browser.urlFilter.UrlResourceFilter
        public WebResourceResponse doFilter(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WebResourceResponse) ipChange.ipc$dispatch("baf08034", new Object[]{this, str});
            }
            return null;
        }

        @Override // com.taobao.browser.urlFilter.UrlResourceFilter
        public boolean match(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("705b429a", new Object[]{this, str})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            BrowserHybridWebView browserHybridWebView = BrowserHybridWebView.this;
            if (browserHybridWebView.mPageLoadCount > 0) {
                browserHybridWebView.refresh();
            } else {
                browserHybridWebView.back();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10245a;
        public final /* synthetic */ Context b;

        public e(String str, Context context) {
            this.f10245a = str;
            this.b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            try {
                this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10245a)));
                BrowserHybridWebView browserHybridWebView = BrowserHybridWebView.this;
                if (browserHybridWebView.mPageLoadCount <= 0) {
                    browserHybridWebView.back();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(619708454);
        }

        public f(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == -1540056808) {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/BrowserHybridWebView$BrowserWebChromeClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                return;
            }
            if (i == 100) {
                if (webView.getUCExtension() == null) {
                    BrowserActivity.hideLoadingDialog();
                }
                BrowserHybridWebView.this.ObtainRenderType();
            }
            if (i < 70 || BrowserHybridWebView.access$300(BrowserHybridWebView.this)) {
                BrowserHybridWebView.access$302(BrowserHybridWebView.this, false);
            } else if (BrowserHybridWebView.this.filter != null) {
                Message obtain = Message.obtain();
                obtain.what = 1103;
                BrowserHybridWebView.this.filter.notifyParent(obtain);
                BrowserHybridWebView.access$302(BrowserHybridWebView.this, true);
            }
            if (BrowserHybridWebView.this.filter != null) {
                Message obtain2 = Message.obtain();
                obtain2.what = m7r.WEBVIEW_PROGRESS_CHANGE;
                obtain2.arg1 = i;
                BrowserHybridWebView.this.filter.notifyParent(obtain2);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            super.onReceivedTitle(webView, str);
            if (BrowserHybridWebView.access$400(BrowserHybridWebView.this) != null) {
                String str2 = m7r.d;
                if (str2 != null) {
                    str = str2;
                } else {
                    String title = webView.getTitle();
                    if (title != null && !TextUtils.isEmpty(title) && !title.equals("0")) {
                        str = title;
                    }
                }
                if (!gtw.g(str)) {
                    if (fm2.commonConfig.C && TextUtils.equals(wmc.WEB_CANNOT_OPEN, str)) {
                        str = jrw.a(wmc.WEB_CANNOT_OPEN);
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 1104;
                    BrowserHybridWebView.access$400(BrowserHybridWebView.this).sendMessage(obtain);
                }
            }
        }
    }

    static {
        t2o.a(619708445);
    }

    @Deprecated
    public BrowserHybridWebView(Context context, boolean z) {
        super(context);
        if (vpw.commonConfig.A) {
            setUrlConfigSwitch(true);
        }
    }

    public static /* synthetic */ void access$000(BrowserHybridWebView browserHybridWebView, ValueCallback valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da9f4c1", new Object[]{browserHybridWebView, valueCallback});
        } else {
            browserHybridWebView.setUploadMsg(valueCallback);
        }
    }

    public static /* synthetic */ boolean access$300(BrowserHybridWebView browserHybridWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("461d4bdc", new Object[]{browserHybridWebView})).booleanValue();
        }
        return browserHybridWebView.isProgessLoaded;
    }

    public static /* synthetic */ boolean access$302(BrowserHybridWebView browserHybridWebView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68812e82", new Object[]{browserHybridWebView, new Boolean(z)})).booleanValue();
        }
        browserHybridWebView.isProgessLoaded = z;
        return z;
    }

    public static /* synthetic */ Handler access$400(BrowserHybridWebView browserHybridWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fdb2dfaf", new Object[]{browserHybridWebView});
        }
        return browserHybridWebView.mOutHandler;
    }

    @Deprecated
    public static String addTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd5adef3", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String scheme = parse.getScheme();
        if (host == null) {
            return str;
        }
        if (!host.endsWith("m.taobao.com") && !host.endsWith("wapa.taobao.com") && !host.endsWith("waptest.taobao.com")) {
            return str;
        }
        if ((!"http".equals(scheme) && !"https".equals(scheme)) || parse.getQueryParameter("ttid") != null) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("ttid", yaa.f().g());
        return buildUpon.toString();
    }

    private void commitLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192f4283", new Object[]{this, str});
            return;
        }
        try {
            AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "LoadUrl", str, 1.0d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserHybridWebView browserHybridWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -610146718:
                super.coreDestroy();
                return null;
            case 673877021:
                return new Boolean(super.handleMessage((Message) objArr[0]));
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2119745010:
                return new Boolean(super.back());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserHybridWebView");
        }
    }

    private boolean isIPAddress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43c5a138", new Object[]{this, str})).booleanValue();
        }
        return Pattern.matches("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$", str);
    }

    private boolean isUnSafeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c4d7514", new Object[]{this, str})).booleanValue();
        }
        setWebviewMode(str, this);
        if (getWebviewMode() == -1) {
            return true;
        }
        return false;
    }

    private boolean nativeBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("964b6b29", new Object[]{this})).booleanValue();
        }
        if (canGoBack()) {
            WebBackForwardList copyBackForwardList = copyBackForwardList();
            if (copyBackForwardList.getCurrentIndex() > 0 && copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl() != null) {
                super.back();
                return true;
            }
        }
        return false;
    }

    private void setUploadMsg(ValueCallback<Uri> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621dae0b", new Object[]{this, valueCallback});
        } else {
            this.mUploadMsg = valueCallback;
        }
    }

    @Deprecated
    private void switchResourceControl(boolean z) {
        CommonWebViewClient commonWebViewClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375ae872", new Object[]{this, new Boolean(z)});
            return;
        }
        WVUCWebViewClient wVUCWebViewClient = this.webViewClient;
        if (wVUCWebViewClient instanceof CommonWebViewClient) {
            commonWebViewClient = (CommonWebViewClient) wVUCWebViewClient;
        } else {
            commonWebViewClient = null;
        }
        if (commonWebViewClient != null) {
            commonWebViewClient.i(z);
        }
    }

    public void ObtainRenderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2710329c", new Object[]{this});
        } else if (getUCExtension() != null) {
            getUCExtension().getCoreStatus(2, new ValueCallback<Object>() { // from class: com.taobao.browser.BrowserHybridWebView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c60988b0", new Object[]{this, obj});
                    } else if (obj instanceof Map) {
                        Map map = (Map) obj;
                        String str = (String) map.get("rt");
                        String str2 = (String) map.get("rtWhy");
                        String str3 = (String) map.get("gt");
                        String str4 = (String) map.get("gtWhy");
                        BrowserHybridWebView.this.coreMultiType.put(v4s.PARAM_UPLOAD_STAGE, "WhitePage");
                        BrowserHybridWebView.this.coreMultiType.put("requireRenderType", Integer.valueOf(WVCore.getInstance().getUsedWebMulti()));
                        Map<String, Object> map2 = BrowserHybridWebView.this.coreMultiType;
                        if (str == null) {
                            str = "";
                        }
                        map2.put("realRenderType", str);
                        Map<String, Object> map3 = BrowserHybridWebView.this.coreMultiType;
                        if (str2 == null) {
                            str2 = "";
                        }
                        map3.put("renderTypeReason", str2);
                        BrowserHybridWebView.this.coreMultiType.put("requireGpuType", Integer.valueOf(WVCore.getInstance().getUsedGpuMulti()));
                        Map<String, Object> map4 = BrowserHybridWebView.this.coreMultiType;
                        if (str3 == null) {
                            str3 = "";
                        }
                        map4.put("realGpuType", str3);
                        Map<String, Object> map5 = BrowserHybridWebView.this.coreMultiType;
                        if (str4 == null) {
                            str4 = "";
                        }
                        map5.put("gpuTypeReason", str4);
                    }
                }
            });
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!nativeBack()) {
            Message obtain = Message.obtain();
            obtain.what = 1102;
            UrlFilter urlFilter = this.filter;
            if (urlFilter != null) {
                urlFilter.notifyParent(obtain);
            }
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba1e662", new Object[]{this});
            return;
        }
        this.mPageLoadCount = 0;
        b2i.b().a();
        super.coreDestroy();
    }

    public String getData2H5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a93bcbda", new Object[]{this});
        }
        return this.data2H5;
    }

    public Handler getOutHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a8b37e8d", new Object[]{this});
        }
        return this.mOutHandler;
    }

    public int getPageLoadCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1dc968be", new Object[]{this})).intValue();
        }
        return this.mPageLoadCount;
    }

    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return this.mUTPageName;
    }

    public Map<String, String> getUTParamMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac0586a0", new Object[]{this});
        }
        return this.mUTParamMap;
    }

    public int getWebviewMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd599d80", new Object[]{this})).intValue();
        }
        return this.webviewMode;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 402) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof Map)) {
                Map map = (Map) obj;
                atw wvUIModel = getWvUIModel();
                if ((wvUIModel instanceof BrowserUIModel) && map.containsKey("cause")) {
                    ((BrowserUIModel) wvUIModel).loadErrorPage((String) map.get("cause"));
                    setOnErrorTime(System.currentTimeMillis());
                    if (wvUIModel.isShowLoading()) {
                        wvUIModel.hideLoadingView();
                    }
                    return true;
                }
            }
        } else if (i == 400) {
            this.mPageLoadCount++;
        }
        return super.handleMessage(message);
    }

    public void hideErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4239c", new Object[]{this});
            return;
        }
        BrowserUIModel browserUIModel = this.mBrowserUIModel;
        if (browserUIModel != null) {
            browserUIModel.hideErrorPage();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        Uri uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 2688) {
            ValueCallback<Uri[]> valueCallback = this.mUploadMsgAboveL;
            if (valueCallback != null) {
                if (i2 != -1 || (uri2 = this.mUploadUriAboveL) == null) {
                    valueCallback.onReceiveValue(null);
                } else {
                    valueCallback.onReceiveValue(new Uri[]{uri2});
                }
                this.mUploadMsgAboveL = null;
                this.mUploadUriAboveL = null;
            } else if (this.mUploadMsg != null) {
                if (intent == null || i2 != -1) {
                    uri = null;
                } else {
                    uri = intent.getData();
                }
                this.mUploadMsg.onReceiveValue(uri);
                this.mUploadMsg = null;
            }
        } else if (i == 7000 && intent != null) {
            try {
                setDataOnActive(intent.getStringExtra("data"));
            } catch (Exception e2) {
                y7t.a(TAG, e2.getMessage());
            }
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        new StringBuilder("Activity call pause ").append(toString());
        WVJsBridge.g().j(true);
        super.onPause();
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        new StringBuilder("Activity call resume ").append(toString());
        try {
            setWebviewMode(this.webviewMode, getUrl());
        } catch (Exception unused) {
        }
        super.onResume();
    }

    public void setData2H5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85413844", new Object[]{this, str});
        } else {
            this.data2H5 = str;
        }
    }

    public void setFilter(UrlFilter urlFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a57b6ab", new Object[]{this, urlFilter});
            return;
        }
        this.filter = urlFilter;
        CommonWebViewClient commonWebViewClient = new CommonWebViewClient(_getContext(), urlFilter);
        this.client = commonWebViewClient;
        commonWebViewClient.c(new c(this));
        setWebViewClient(this.client);
    }

    public void setOutHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cba8255", new Object[]{this, handler});
        } else {
            this.mOutHandler = handler;
        }
    }

    public void setSafeFormatData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2089207d", new Object[]{this, new Boolean(z)});
        } else {
            getSettings().setSaveFormData(z);
        }
    }

    public void setUTPageNameAndParamMap(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03c189", new Object[]{this, str, map});
            return;
        }
        this.mUTPageName = str;
        this.mUTParamMap = map;
    }

    public void setWebviewMode(String str, a7e a7eVar) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ed9122", new Object[]{this, str, a7eVar});
            return;
        }
        if (ssw.k(str, a7eVar)) {
            i = 0;
        } else if (atf.a(str)) {
            BrowserUtil.b(TAG, "setWebviewMode", "isJaeUrl", null, null);
        } else if (ssw.h(str, a7eVar)) {
            BrowserUtil.b(TAG, "setWebviewMode", "isThirdPartyUrl", null, null);
            i = 2;
        } else {
            BrowserUtil.b(TAG, "setWebviewMode", "isUnsafeUrl", null, null);
            i = -1;
        }
        if (i != this.webviewMode) {
            setWebviewMode(i, str);
        }
        y7t.c();
        if (i == 2) {
            y71.commitFail("SecurityBlock", 4, "setWebviewMode third", str);
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setImportantForAccessibility(2);
        BrowserUIModel browserUIModel = new BrowserUIModel(_getContext(), this);
        this.mBrowserUIModel = browserUIModel;
        setWvUIModel(browserUIModel);
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        String format = String.format(" %dX%d", Integer.valueOf(SystemUtils.getScreenWidth(_getContext())), Integer.valueOf(SystemUtils.getScreenHeight(_getContext())));
        settings.setUserAgentString(settings.getUserAgentString() + format);
        settings.setNeedInitialFocus(true);
        setVerticalScrollbarOverlay(true);
        setOverScrollMode(2);
        setWebChromeClient(new a(_getContext()));
        UCExtension uCExtension = getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new zxr(this));
        }
        String userAgentString = getUserAgentString();
        setUserAgentString(userAgentString + " UT4Aplus/0.2.29");
        setFspCallback(new b(this));
        if (!getSettings().getUserAgentString().contains(" AliApp(")) {
            WebSettings settings2 = getSettings();
            settings2.setUserAgentString(getSettings().getUserAgentString() + " AliApp(TB/" + TaoPackageInfo.getVersion() + f7l.BRACKET_END_STR);
        }
        if (!ABGlobal.isFeatureOpened(this.context, "wvInjectMetricScript")) {
            String a2 = ew8.a();
            if (!TextUtils.isEmpty(a2)) {
                injectJsEarly(a2);
            }
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        b2i.b().c("loadUrl start");
        Context _getContext = _getContext();
        long currentTimeMillis = System.currentTimeMillis();
        this.allowOpenClient = OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_ALLOW_OPEN_CLIENT, "0");
        this.thirdMiddleJumpRegex = OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_THIRD_MIDDLE_JUMP_REGEX, "");
        TBS.setH5Url(str);
        if (str == null) {
            y7t.a(TAG, "Error  load  url is null");
            return;
        }
        if (TaoHelper.isSpecialManuFacturer("xiaomi") || TaoHelper.isSpecialManuFacturer("meizu") || TaoHelper.isSpecialManuFacturer("lenovo")) {
            int indexOf = str.indexOf(35);
            if ((indexOf > 0 ? str.substring(0, indexOf) : str).equals(getUrl())) {
                reload();
                return;
            }
        }
        if (str.startsWith("taobao://")) {
            str = str.replace("taobao://", h1p.HTTP_PREFIX);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (isPreRender() || ((!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) || host == null)) {
            super.loadUrl(addTTID(str));
            commitLoadUrl(str);
            k7r.b("exchain.FullTrace", "BrowserActivity.loadUrl cost time: " + (System.currentTimeMillis() - currentTimeMillis));
        } else {
            if (mov.a(this.thirdMiddleJumpRegex, str)) {
                this.allowThirdMiddlePageJump = true;
                this.needNotiSafe = false;
            }
            if (!og8.b() || !isIPAddress(host)) {
                wpw wpwVar = vpw.commonConfig;
                if (wpwVar.A || !ssw.c(str, this)) {
                    int d2 = BrowserUtil.d(this, str);
                    this.jaeState = d2;
                    if (d2 == 0) {
                        y7t.c();
                    }
                    if (wpwVar.A || !isUnSafeUrl(str) || !"1".equals(this.allowOpenClient) || this.allowThirdMiddlePageJump) {
                        k7r.b("exchain.FullTrace", "BrowserActivity.loadUrl.before cost time: " + (System.currentTimeMillis() - currentTimeMillis) + " url=" + str);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        super.loadUrl(addTTID(str));
                        commitLoadUrl(str);
                        k7r.b("exchain.FullTrace", "BrowserActivity.loadUrl cost time: " + (System.currentTimeMillis() - currentTimeMillis2));
                    } else if (_getContext instanceof Activity) {
                        Intent intent = new Intent("NON_WHITELIST_URL_VISIT");
                        intent.putExtra("url", str);
                        intent.putExtra("whitelistAvailable", !TextUtils.isEmpty(ssw.f28255a) ? 1 : 0);
                        intent.putExtra("from", "windvane");
                        if (_getContext() != null) {
                            LocalBroadcastManager.getInstance(_getContext().getApplicationContext()).sendBroadcast(intent);
                        }
                        AlertDialog.Builder title = new AlertDialog.Builder(_getContext).setTitle(R.string.browser_warning);
                        title.setMessage(_getContext.getString(R.string.browser_tips) + scheme + HttpConstant.SCHEME_SPLIT + host).setPositiveButton(R.string.browser_open_url, new e(str, _getContext)).setNegativeButton(R.string.browser_cancel, new d()).setCancelable(false).create().show();
                        StringBuilder sb = new StringBuilder("BrowserActivity.loadUrl cost time: ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        k7r.b("exchain.FullTrace", sb.toString());
                        y71.commitFail("SecurityBlock", 1, "loadUrl block", str);
                        return;
                    } else {
                        return;
                    }
                } else {
                    String b2 = eqw.c().b();
                    if (TextUtils.isEmpty(b2)) {
                        onMessage(402, str);
                    } else {
                        try {
                            super.loadUrl(b2);
                        } catch (Exception e2) {
                            v7t.d(TAG, e2.getMessage());
                        }
                    }
                    k7r.b("exchain.FullTrace", "BrowserActivity.loadUrl cost time: " + (System.currentTimeMillis() - currentTimeMillis));
                    y71.commitFail("SecurityBlock", 2, "loadUrl Black", str);
                    return;
                }
            } else {
                TLog.logd(TAG, "is debug: " + og8.b());
                super.loadUrl(addTTID(str));
                return;
            }
        }
        b2i.b().a();
    }

    private void setWebviewMode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02e416c", new Object[]{this, new Integer(i), str});
            return;
        }
        this.webviewMode = i;
        WVJsBridge.g().j(true);
        switchResourceControl(false);
        setSupportDownload(true);
        if (i == -1) {
            WVJsBridge.g().j(false);
            setSupportDownload(false);
        } else if (i == 1) {
            switchResourceControl(true);
        } else if (i == 2) {
            WVJsBridge.g().j(false);
            if (ssw.f(str)) {
                setSupportDownload(true);
            } else {
                setSupportDownload(false);
            }
        }
    }

    public BrowserHybridWebView(Context context, Map<String, String> map) {
        super(context, map);
        if (vpw.commonConfig.A) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(Context context) {
        super(context);
        if (vpw.commonConfig.A) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (vpw.commonConfig.A) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (vpw.commonConfig.A) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(WVUCWebView.Builder builder) {
        super(builder);
        if (vpw.commonConfig.A) {
            setUrlConfigSwitch(true);
        }
        init();
    }
}
