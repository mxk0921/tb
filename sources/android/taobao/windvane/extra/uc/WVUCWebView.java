package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.taobao.windvane.export.prerender.PrerenderManager;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.devtools.DevTools;
import android.taobao.windvane.extra.jsbridge.DefaultAsyncApiProxy;
import android.taobao.windvane.extra.jsbridge.JSAPIManager;
import android.taobao.windvane.extra.jsbridge.WVMega;
import android.taobao.windvane.extra.jsbridge.WVMegaBridge;
import android.taobao.windvane.extra.performance.WVErrorManager;
import android.taobao.windvane.extra.performance.WVH5PPManager;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.extra.performance2.WVFSPManager;
import android.taobao.windvane.extra.performance2.WVPageTracker;
import android.taobao.windvane.extra.performance2.WVPerformance;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.extra.performance2.WVWPManager;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.ha.UCHAManager;
import android.taobao.windvane.jsbridge.WVAppEvent;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.jsbridge.api.WVFalco;
import android.taobao.windvane.jsbridge.api.WVFullTrace;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.view.PopupWindowController;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.WindVaneError;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.ali.user.mobile.exception.ErrorCode;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.runtimepermission.a;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.uc.UCSoSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.ServiceWorkerController;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import com.uc.webview.export.extension.ExtImageDecoder;
import com.uc.webview.export.extension.INetworkDelegate;
import com.uc.webview.export.extension.INetworkHostingService;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.StorageUtils;
import com.uc.webview.export.extension.UCExtension;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a7e;
import tb.abq;
import tb.ace;
import tb.atw;
import tb.au4;
import tb.bba;
import tb.bf1;
import tb.bka;
import tb.bsw;
import tb.btw;
import tb.c40;
import tb.cce;
import tb.ctw;
import tb.eqw;
import tb.esw;
import tb.f7l;
import tb.fqw;
import tb.fsw;
import tb.gqw;
import tb.grw;
import tb.gtw;
import tb.h1p;
import tb.hzl;
import tb.itw;
import tb.iuv;
import tb.jpw;
import tb.jrw;
import tb.ksw;
import tb.lab;
import tb.lcn;
import tb.lex;
import tb.lqw;
import tb.n8c;
import tb.oba;
import tb.og8;
import tb.orb;
import tb.oz8;
import tb.psw;
import tb.qqm;
import tb.qsw;
import tb.r9u;
import tb.rsw;
import tb.srw;
import tb.ssw;
import tb.t2o;
import tb.tc;
import tb.trw;
import tb.urb;
import tb.urw;
import tb.uum;
import tb.v7t;
import tb.voe;
import tb.vpw;
import tb.w0a;
import tb.wmc;
import tb.wpw;
import tb.x74;
import tb.xsw;
import tb.y71;
import tb.yaa;
import tb.yd1;
import tb.ypw;
import tb.yt4;
import tb.zq;
import tb.zt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCWebView extends WebView implements Handler.Callback, IWVWebView, IPerformance, urb, a7e, n8c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCWebView";
    public static final String WINDVANE = "windvane";
    private static final boolean sEnableSystemWebView;
    public static boolean sIsSetHttpCacheSize;
    private static final AtomicBoolean sNetworkDelegateSet;
    private static final AtomicBoolean sStaticBlockedInitialized;
    public static boolean sWebViewFirstAttached;
    private AbilityHubAdapter abilityHubAdapter;
    private AliNetworkAdapterNew aliRequestAdapter;
    private yd1 asyncApiProxy;
    public String bizCode;
    private String cachedUrl;
    private oz8 containerSpan;
    public Context context;
    private String currentUrl;
    private String dataOnActive;
    private Paint debugPaint;
    public float dx;
    public float dy;
    public esw entryManager;
    public boolean firstTimeLoad;
    private boolean flag4commit;
    public UCExtension.InjectJSProvider injectJSProvider;
    public final StringBuilder injectJs;
    private boolean isLive;
    private boolean isPreCreated;
    private boolean isPreInit;
    private boolean isRealDestroyed;
    public boolean isUser;
    private grw jsPatchListener;
    private boolean longPressSaveImage;
    private zq mAbilityEnv;
    private boolean mAllowAllOpen;
    private boolean mEnableReportInjectJSCost;
    public SparseArray<MotionEvent> mEventSparseArray;
    private volatile Map<String, Object> mExternalContext;
    private Hashtable<String, Hashtable<String, String>> mH5MonitorCache;
    public Handler mHandler;
    private String mImageUrl;
    private boolean mIsCoreDestroy;
    private boolean mIsStaticWebView;
    private View.OnLongClickListener mLongClickListener;
    private boolean mNeedReloadWhenOnResume;
    private int mPageLoadedCount;
    public long mPageStart;
    private PopupWindowController mPopupController;
    private String[] mPopupMenuTags;
    private qqm mPrefetchInfo;
    private final abq mSpanWrapper;
    private TouchEventHandler mTouchEventHandler;
    private boolean mUseGlobalUrlConfig;
    private final ace mWebViewContext;
    private boolean mWebViewPaused;
    private int mWvNativeCallbackId;
    private long onErrorTime;
    private Map<String, String> openTracingContextMap;
    public String overrideBizId;
    public WVPageTracker pageTracker;
    private WVPerformance performanceDelegate;
    private String pid;
    private View.OnClickListener popupClickListener;
    private boolean reportedFSP;
    private boolean statusBarImmersive;
    public boolean supportDownload;
    public List<Runnable> taskQueue;
    private String ucParam;
    private String uid;
    private boolean useUrlConfig;
    public WVUCWebChromeClient webChromeClient;
    public WVUCWebViewClient webViewClient;
    public WVWPData wpData;
    public WVErrorManager wvErrorManager;
    private rsw wvSecurityFilter;
    private atw wvUIModel;
    public WVFSPManager wvfspManager;
    public WVH5PPManager wvh5PPManager;
    public static int webviewIndentifier = 0;
    private static String UC_CORE_REMOTE_SO_PATH = null;
    public static String bizId = "windvane";
    private static Pattern pattern = null;
    public static boolean isStop = false;
    private static int fromType = 70;
    private static final AtomicBoolean sCoreInitialized = new AtomicBoolean(false);
    private static final AtomicBoolean shouldUCLibInit = new AtomicBoolean(false);
    private static boolean sForegroundInitUC = false;
    private static String UC_CORE_URL_DEBUG_X86 = UCSoSettings.getInstance().UC_CORE_URL_DEBUG_X86;
    private static String UC_CORE_URL_DEBUG_32 = UCSoSettings.getInstance().UC_CORE_URL_DEBUG_32;
    private static String UC_CORE_URL_DEBUG_64 = UCSoSettings.getInstance().UC_CORE_URL_DEBUG_64;
    public static String UC_CORE_URL_32 = UCSoSettings.getInstance().UC_CORE_URL_32;
    public static String UC_CORE_URL_64 = UCSoSettings.getInstance().UC_CORE_URL_64;
    public static String UC_CORE_URL = UC_CORE_URL_32;
    private static String UC_PLAYER_URL = UCSoSettings.getInstance().UC_PLAYER_URL;
    private static boolean mUseAliNetwork = true;
    private static boolean mUseSystemWebView = false;
    private static boolean mUseSystemWebViewOnce = false;
    private static boolean mDegradeAliNetwork = false;
    private static boolean evaluateJavascriptSupported = true;
    private static zt4 coreEventCallback = null;
    private static volatile boolean sCoreFailed = false;
    private static volatile int sCoreFailedCode = -1;
    private static volatile String sCoreFailedMsg = null;
    private static volatile boolean sFetchFailed = false;
    private static volatile int sFetchFailCode = -1;
    private static volatile String sFetchFailMsg = null;
    private static boolean initedJSBridge = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TouchEventHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856141);
        }

        public Boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("477e730d", new Object[]{this, motionEvent});
            }
            return null;
        }

        public Boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("c848a3d3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WVValueCallback implements ValueCallback<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856142);
        }

        public void onReceiveValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("138ac29e", new Object[]{this, str});
                return;
            }
            v7t.i(WVUCWebView.TAG, "support : " + WVCore.getInstance().isUCSupport() + " UC SDK Callback : " + str);
            try {
                iuv.commitEvent(iuv.EVENTID_PA_UCSDK, String.valueOf(WVCore.getInstance().isUCSupport()), String.valueOf(WVUCWebView.getUseTaobaoNetwork()), str);
            } catch (Throwable th) {
                v7t.d(WVUCWebView.TAG, "UC commitEvent failed : " + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface whiteScreenCallback {
        void isPageEmpty(String str);
    }

    public WVUCWebView(Builder builder) {
        super(Builder.access$000(builder), Builder.access$100(builder) != 3);
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context = WVUCWebView.this.context;
                                    if (context != null) {
                                        voe.g(context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context = WVUCWebView.this.context;
                                    if (context != null) {
                                        voe.g(context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = Builder.access$000(builder);
        init();
    }

    public static /* synthetic */ void access$1001(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5642ce48", new Object[]{wVUCWebView});
        } else {
            super.coreDestroy();
        }
    }

    public static /* synthetic */ boolean access$1102(WVUCWebView wVUCWebView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba0bc68e", new Object[]{wVUCWebView, new Boolean(z)})).booleanValue();
        }
        wVUCWebView.mIsCoreDestroy = z;
        return z;
    }

    public static /* synthetic */ boolean access$1200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb76b2c", new Object[0])).booleanValue();
        }
        return sEnableSystemWebView;
    }

    public static /* synthetic */ AtomicBoolean access$1300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("543c0869", new Object[0]);
        }
        return sStaticBlockedInitialized;
    }

    public static /* synthetic */ void access$1400(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a2768b", new Object[]{wVUCWebView});
        } else {
            wVUCWebView.openAsyncAPIChannel();
        }
    }

    public static /* synthetic */ String[] access$200(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b69881e9", new Object[]{wVUCWebView});
        }
        return wVUCWebView.mPopupMenuTags;
    }

    public static /* synthetic */ String access$300(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11967be5", new Object[]{wVUCWebView});
        }
        return wVUCWebView.mImageUrl;
    }

    public static /* synthetic */ String access$302(WVUCWebView wVUCWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e7ffd59", new Object[]{wVUCWebView, str});
        }
        wVUCWebView.mImageUrl = str;
        return str;
    }

    public static /* synthetic */ PopupWindowController access$400(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowController) ipChange.ipc$dispatch("115cb277", new Object[]{wVUCWebView});
        }
        return wVUCWebView.mPopupController;
    }

    public static /* synthetic */ PopupWindowController access$402(WVUCWebView wVUCWebView, PopupWindowController popupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowController) ipChange.ipc$dispatch("afe6b6d8", new Object[]{wVUCWebView, popupWindowController});
        }
        wVUCWebView.mPopupController = popupWindowController;
        return popupWindowController;
    }

    public static /* synthetic */ void access$500(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdec6286", new Object[]{str});
        } else {
            onRemoteFetchSuccess(str);
        }
    }

    public static /* synthetic */ void access$600(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8c3918", new Object[]{th});
        } else {
            onRemoteFetchFail(th);
        }
    }

    public static /* synthetic */ void access$700() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f21a63e", new Object[0]);
        } else {
            initServiceWorkerClient();
        }
    }

    public static /* synthetic */ boolean access$800(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa209a4", new Object[]{wVUCWebView})).booleanValue();
        }
        return wVUCWebView.longPressSaveImage;
    }

    public static /* synthetic */ View.OnClickListener access$900(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("4b21664a", new Object[]{wVUCWebView});
        }
        return wVUCWebView.popupClickListener;
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

    private static void commitUCCoreReuseInfo(IRunningCoreInfo iRunningCoreInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda7032f", new Object[]{iRunningCoreInfo});
        } else if (iRunningCoreInfo != null) {
            if (iRunningCoreInfo.coreVersion() != null) {
                str = iRunningCoreInfo.coreVersion().version();
            } else {
                str = null;
            }
            if (iRunningCoreInfo.isReUsed()) {
                y71.commitSuccess(y71.MONITOR_POINT_CORE_REUSE, str);
            } else {
                y71.commitFail(y71.MONITOR_POINT_CORE_REUSE, -1, str, null);
            }
        }
    }

    private void configSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6d7b8c", new Object[]{this});
            return;
        }
        WebSettings settings = getSettings();
        if (getCurrentViewCoreType() == 2 && settings != null) {
            settings.setMixedContentMode(0);
        }
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(false);
        settings.setDatabasePath(this.context.getApplicationInfo().dataDir + "/localstorage");
        settings.setGeolocationEnabled(true);
        String a2 = yaa.f().a();
        String b = yaa.f().b();
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(b)) {
                userAgentString = userAgentString + " AliApp(" + a2 + "/" + b + f7l.BRACKET_END_STR;
            }
            if (!userAgentString.contains("UCBS/") && getCurrentViewCoreType() == 3) {
                userAgentString = userAgentString.concat(" UCBS/2.11.1.1");
            }
            if (!userAgentString.contains("TTID/") && !TextUtils.isEmpty(yaa.f().g())) {
                userAgentString = userAgentString + " TTID/" + yaa.f().g();
            }
        }
        settings.setUserAgentString(userAgentString + yaa.DEFAULT_UA);
        settings.setCacheMode(-1);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setTextZoom(WebSettings.TextSize.NORMAL.value);
        vpw.b();
        wpw wpwVar = vpw.commonConfig;
        boolean z = wpwVar.M0;
        vpw.b();
        if (wpwVar.N0) {
            settings.setAllowFileAccess(false);
        }
    }

    private static void fetchRemoteUCCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9bcf4", new Object[0]);
            return;
        }
        v7t.d(TAG, "start fetch uc core");
        r9u.a(bf1.FETCH_UC_SO);
        WVUCRemoteFetcher.fetchUCRemote(new WVUCRemoteFetcher.WVUCFetcherCallback() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher.WVUCFetcherCallback
            public void onFetchFail(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("249e4e15", new Object[]{this, th});
                    return;
                }
                r9u.c(bf1.FETCH_UC_SO);
                WVUCWebView.access$600(th);
            }

            @Override // android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher.WVUCFetcherCallback
            public void onFetchSuccess(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e41973f9", new Object[]{this, str});
                    return;
                }
                r9u.c(bf1.FETCH_UC_SO);
                WVUCWebView.access$500(str);
            }
        });
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

    private Paint getDebugPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("cfd690a3", new Object[]{this});
        }
        if (this.debugPaint == null) {
            Paint paint = new Paint();
            this.debugPaint = paint;
            paint.setTextSize(40.0f);
            this.debugPaint.setColor(-65536);
        }
        return this.debugPaint;
    }

    public static boolean getDegradeAliNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d18b1b", new Object[0])).booleanValue();
        }
        return mDegradeAliNetwork;
    }

    public static int getFromType() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a805aaf4", new Object[0])).intValue();
        }
        fromType = 70;
        if (WVCore.getInstance().isUCSupport()) {
            if (getUseTaobaoNetwork()) {
                i = 6;
            } else {
                i = 5;
            }
            fromType = i;
        } else if (!mUseSystemWebView) {
            fromType = 71;
        }
        return fromType;
    }

    @Deprecated
    public static boolean getUCSDKSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb055c4", new Object[0])).booleanValue();
        }
        return WVCore.getInstance().isUCSupport();
    }

    public static boolean getUseTaobaoNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e3eeb5a", new Object[0])).booleanValue();
        }
        if (!WVCore.getInstance().isUCSupport() || !mUseAliNetwork) {
            return false;
        }
        return true;
    }

    private static void handleInitUCCore() {
        boolean is64Bit;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b6f2ac", new Object[0]);
            return;
        }
        try {
            is64Bit = WVUCUtils.is64Bit();
        } catch (Exception unused) {
            sCoreInitialized.set(false);
        }
        if (is64Bit || !WVUCUtils.isArchContains("x86")) {
            if (og8.b()) {
                if (is64Bit) {
                    str2 = UC_CORE_URL_DEBUG_64;
                } else {
                    str2 = UC_CORE_URL_DEBUG_32;
                }
                UC_CORE_URL = str2;
                v7t.i(TAG, "use 5.0 debug core, use 64bit = [" + is64Bit + "]");
            } else {
                v7t.i(TAG, "use 5.0 release core, use 64bit = [" + is64Bit + "]");
                if (is64Bit) {
                    str = UC_CORE_URL_64;
                } else {
                    str = UC_CORE_URL_32;
                }
                UC_CORE_URL = str;
            }
            try {
                shouldUCLibInit.set(true);
                yaa f = yaa.f();
                if (f != null) {
                    initUCLIb(f.j(), yaa.n);
                } else {
                    initUCLIb(null, yaa.n);
                }
            } catch (Throwable unused2) {
                sCoreInitialized.set(false);
                initUCLIb(yaa.n);
            }
        } else {
            UC_CORE_URL = UC_CORE_URL_DEBUG_X86;
            v7t.i(TAG, "x86 arch, need not init uc core");
            sCoreInitialized.set(true);
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(au4.b(4, "x86 arch, need not init uc core"));
        }
    }

    private static void initServiceWorkerClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da4c695", new Object[0]);
            return;
        }
        try {
            v7t.d(TAG, "start to set ServiceWorker client");
            ServiceWorkerController.getInstance().setServiceWorkerClient(new WVUCServiceWorkerClient());
        } catch (Throwable th) {
            v7t.e(TAG, "failed to set ServiceWorker client", th, new Object[0]);
        }
    }

    public static void initUCCore(yt4 yt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cda04c7", new Object[]{yt4Var});
        } else if (x74.n() && Build.VERSION.SDK_INT == yaa.l) {
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(yt4Var, au4.b(2, "Android Q暂时先通过开关屏蔽"));
            v7t.d(TAG, "Android Q暂时先通过开关屏蔽");
        } else if (yaa.f().j() == null) {
            new AndroidRuntimeException("WVUCWebView: can not init uc core for uc key is null").printStackTrace();
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(yt4Var, au4.b(1, "uc key is null"));
        } else if (yaa.n == null) {
            new AndroidRuntimeException("WVUCWebView: can not init uc core for context is nulll").printStackTrace();
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(yt4Var, au4.b(1, "uc context is null"));
        } else {
            v7t.i(TAG, "init uc core");
            r9u.b("initNecessaryConfig");
            if (!vpw.b().c()) {
                vpw.b().d();
                v7t.i(TAG, "init WVCommonConfig params before init core");
            }
            if (!xsw.b().c()) {
                xsw.b().d();
                v7t.i(TAG, "init WVUCCoreConfig params before init core");
            }
            if (!ypw.b().c()) {
                ypw.b().d();
            }
            r9u.d();
            if (sCoreInitialized.compareAndSet(false, true)) {
                fetchRemoteUCCore();
            } else {
                v7t.a(TAG, "uc core has been initialized");
            }
        }
    }

    public static boolean initUCLIb(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3a4945e", new Object[]{context})).booleanValue();
        }
        if (!shouldUCLibInit.get()) {
            RuntimeException runtimeException = new RuntimeException("init uclib outer");
            runtimeException.fillInStackTrace();
            v7t.d(TAG, runtimeException.getStackTrace()[0].toString() + "\n" + runtimeException.getStackTrace()[1].toString() + "\n" + runtimeException.getStackTrace()[2].toString());
            return false;
        } else if (context == null) {
            return false;
        } else {
            return initUCLIb(null, context.getApplicationContext());
        }
    }

    public static /* synthetic */ Object ipc$super(WVUCWebView wVUCWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2075640349:
                return super.getCoreView();
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1955206122:
                super.loadHtmlData((String) objArr[0], (String) objArr[1]);
                return null;
            case -1888728565:
                return new Float(super.getScale());
            case -1512649357:
                super.onResume();
                return null;
            case -1384276246:
                return new Boolean(super.canGoBack());
            case -1312899459:
                super.evaluateJavascript((String) objArr[0], (ValueCallback) objArr[1]);
                return null;
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -1247571552:
                super.reload();
                return null;
            case -1185152872:
                super.addJavascriptInterface(objArr[0], (String) objArr[1]);
                return null;
            case -853109733:
                super.coreDraw((Canvas) objArr[0]);
                return null;
            case -788773096:
                super.clearCache(((Boolean) objArr[0]).booleanValue());
                return null;
            case -736275871:
                super.stopLoading();
                return null;
            case -610146718:
                super.coreDestroy();
                return null;
            case -597752619:
                super.loadData((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case -561052064:
                return super.getUrl();
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -148357436:
                return new Integer(super.getContentHeight());
            case 143264892:
                super.coreOnVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 490249163:
                super.loadUrl((String) objArr[0], (Map) objArr[1]);
                return null;
            case 522121505:
                super.loadDataWithBaseURL((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
                return null;
            case 658380796:
                super.setWebChromeClient((WebChromeClient) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 928790192:
                super.coreOnScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                wVUCWebView.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1118518886:
                super.setWebViewClient((WebViewClient) objArr[0]);
                return null;
            case 1248879303:
                super.postUrl((String) objArr[0], (byte[]) objArr[1]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVUCWebView");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.matches() != false) goto L_0x002d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isNeedCookie(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = android.taobao.windvane.extra.uc.WVUCWebView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "27270af9"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            java.util.regex.Pattern r2 = android.taobao.windvane.extra.uc.WVUCWebView.pattern     // Catch: Exception -> 0x002a
            if (r2 == 0) goto L_0x002c
            java.util.regex.Matcher r4 = r2.matcher(r4)     // Catch: Exception -> 0x002a
            if (r4 == 0) goto L_0x002c
            boolean r4 = r4.matches()     // Catch: Exception -> 0x002a
            if (r4 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002a:
            r4 = move-exception
            goto L_0x002f
        L_0x002c:
            r0 = 1
        L_0x002d:
            r1 = r0
            goto L_0x0046
        L_0x002f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pattern complile Exception"
            r0.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "WVUCWebView"
            tb.v7t.d(r0, r4)
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebView.isNeedCookie(java.lang.String):boolean");
    }

    private static boolean isUseSystemWebView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cdef258", new Object[]{context})).booleanValue();
        }
        r9u.b("WVUCWebView#isUseSystemWebView");
        boolean isUseSystemWebViewImpl = isUseSystemWebViewImpl(context);
        r9u.d();
        return isUseSystemWebViewImpl;
    }

    public static boolean isWebViewMultiProcessEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f66e9e7", new Object[0])).booleanValue();
        }
        if (xsw.configData.f32336a > 0) {
            return true;
        }
        return false;
    }

    public static void onUCMCoreDownloadIntercepted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3fab41", new Object[0]);
            return;
        }
        v7t.i(TAG, "UCSDK init onUCMCoreDownloadIntercepted");
        sCoreInitialized.set(false);
        shouldUCLibInit.set(false);
        WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(au4.b(3, "uc core download intercepted"));
    }

    private void openAsyncAPIChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601ba482", new Object[]{this});
        } else if (this.asyncApiProxy == null) {
            try {
                DefaultAsyncApiProxy defaultAsyncApiProxy = new DefaultAsyncApiProxy();
                this.asyncApiProxy = defaultAsyncApiProxy;
                defaultAsyncApiProxy.setUCWebView(this);
                this.asyncApiProxy.injectAsyncApiEvn();
            } catch (Throwable th) {
                v7t.d(TAG, "create async api channel failed :" + th.getMessage());
            }
        }
    }

    private void refreshIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535bc934", new Object[]{this});
        } else if (this.mNeedReloadWhenOnResume) {
            reload();
            this.mNeedReloadWhenOnResume = false;
        }
    }

    private void setAcceptThirdPartyCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a8f26d", new Object[]{this});
        } else if (getCurrentViewCoreType() != 1 && getCurrentViewCoreType() != 3) {
            try {
                View view = getView();
                if (view != null && (view instanceof android.webkit.WebView)) {
                    CookieManager.getInstance().setAcceptThirdPartyCookies((android.webkit.WebView) view, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{str});
        } else {
            bizId = str;
        }
    }

    @Deprecated
    public static void setCoreEventCallback(zt4 zt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d36116", new Object[]{zt4Var});
        } else {
            coreEventCallback = zt4Var;
        }
    }

    public static void setDegradeAliNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a426a9", new Object[]{new Boolean(z)});
        } else {
            mDegradeAliNetwork = z;
        }
    }

    public static void setUcCoreUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1356731", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            UC_CORE_URL = str;
        }
    }

    public static void setUseSystemWebView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f78128", new Object[]{new Boolean(z)});
            return;
        }
        mUseSystemWebView = z;
        fromType = 70;
    }

    public static void setUseSystemWebViewOnce(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6541f5a7", new Object[]{new Boolean(z)});
        } else {
            mUseSystemWebViewOnce = z;
        }
    }

    public static void setUseTaobaoNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b1e4b2", new Object[]{new Boolean(z)});
        } else {
            mUseAliNetwork = z;
        }
    }

    public static void staticInitializeOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49e2546", new Object[0]);
        } else if (sStaticBlockedInitialized.compareAndSet(false, true)) {
            r9u.b("staticInitializeOnce");
            v7t.d(TAG, "staticInitializeOnce");
            UCCoreStartup.getInstance().initPreprocess();
            if (!WVCore.getInstance().isUCSupport()) {
                v7t.i(TAG, "compensate for uc core initialization");
                initUCCore();
            }
            r9u.d();
        }
    }

    private void tryPrcacheDocument(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a599b51", new Object[]{this, str});
        } else if (WVUCPrecacheManager.getInstance().canPrecacheDoc(str) && this.webViewClient != null) {
            WebResourceResponse shouldInterceptRequest = this.webViewClient.shouldInterceptRequest(this, new WebResourceRequest(str, new HashMap()));
            if (shouldInterceptRequest != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(str, shouldInterceptRequest);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TBImageFlowMonitor.TTL_ERROR_MAX_AGE, "10");
                hashMap2.put("ignoreQuery", "0");
                StorageUtils.precacheResources(hashMap, hashMap2);
                return;
            }
            WVUCPrecacheManager.getInstance().addPrecacheDoc(str);
        }
    }

    public void OnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a8092f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.h(i, i2, i3, i4);
        }
        try {
            onScrollChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
        }
        Context context = getContext();
        if (context instanceof MutableContextWrapper) {
            return ((MutableContextWrapper) context).getBaseContext();
        }
        return context;
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
        v7t.a(TAG, " wait webview attach to window");
        this.taskQueue.add(runnable);
        return true;
    }

    @Override // com.uc.webview.export.WebView
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
        String url = getUrl();
        bka c = bka.c();
        if (!TextUtils.isEmpty(url) && c != null) {
            c.d(url);
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

    @Override // com.uc.webview.export.WebView
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (!isDestroied() && !lqw.d().e(ErrorCode.CLIENT_NETWORK_ERROR).f22859a) {
            return super.canGoBack();
        }
        return false;
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

    public void clearH5MonitorData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547db51", new Object[]{this});
            return;
        }
        Hashtable<String, Hashtable<String, String>> hashtable = this.mH5MonitorCache;
        if (hashtable != null) {
            hashtable.clear();
        }
    }

    public boolean containsH5MonitorData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d951cd", new Object[]{this, str})).booleanValue();
        }
        Hashtable<String, Hashtable<String, String>> hashtable = this.mH5MonitorCache;
        if (hashtable == null) {
            return false;
        }
        return hashtable.containsKey(str);
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        Boolean coreDispatchTouchEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        TouchEventHandler touchEventHandler = this.mTouchEventHandler;
        if (touchEventHandler != null && (coreDispatchTouchEvent = touchEventHandler.coreDispatchTouchEvent(motionEvent)) != null) {
            return coreDispatchTouchEvent.booleanValue();
        }
        int action = motionEvent.getAction();
        int actionIndex = motionEvent.getActionIndex();
        if (actionIndex >= motionEvent.getPointerCount()) {
            vpw.b();
            if (vpw.commonConfig.T0) {
                return super.coreDispatchTouchEvent(motionEvent);
            }
        }
        int pointerId = motionEvent.getPointerId(actionIndex);
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
                    super.coreDispatchTouchEvent(motionEvent2);
                    motionEvent2.recycle();
                    this.mEventSparseArray.remove(pointerId);
                }
            } else {
                this.isUser = true;
                return true;
            }
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd26941b", new Object[]{this, canvas});
            return;
        }
        super.coreDraw(canvas);
        drawDebugFlag(canvas);
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375c36b0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        OnScrollChanged(i, i2, i3, i4);
        super.coreOnScrollChanged(i, i2, i3, i4);
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a0c7c", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.coreOnVisibilityChanged(view, i);
        v7t.i("test", "coreOnVisibilityChanged = [" + i + "]");
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Boolean coreOverScrollBy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        TouchEventHandler touchEventHandler = this.mTouchEventHandler;
        if (touchEventHandler == null || (coreOverScrollBy = touchEventHandler.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z)) == null) {
            return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return coreOverScrollBy.booleanValue();
    }

    @Override // com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        if (vpw.commonConfig.I1 && this.abilityHubAdapter != null) {
            v7t.d(TAG, "destroy abilityHubAdapterV1");
            this.abilityHubAdapter.n();
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
            getWVCallBackContext().fireEvent(str, "{}");
        }
    }

    public AbilityHubAdapter getAbilityHubAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("5c734b22", new Object[]{this});
        }
        return this.abilityHubAdapter;
    }

    public AliNetworkAdapterNew getAliNetwork() {
        AliNetworkAdapterNew aliNetworkAdapterNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNetworkAdapterNew) ipChange.ipc$dispatch("38d8ba9f", new Object[]{this});
        }
        synchronized (this) {
            aliNetworkAdapterNew = this.aliRequestAdapter;
        }
        return aliNetworkAdapterNew;
    }

    public yd1 getAsyncApiProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yd1) ipChange.ipc$dispatch("860528ed", new Object[]{this});
        }
        return this.asyncApiProxy;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public String getCachedUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0783522", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.cachedUrl)) {
            return this.cachedUrl;
        }
        return null;
    }

    @Override // com.uc.webview.export.WebView
    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        return (int) (super.getContentHeight() * super.getScale());
    }

    @Override // tb.urb
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        if (vpw.commonConfig.c1) {
            return this.pageTracker.getPageIdentifier();
        }
        return "WVUC_" + this.uid;
    }

    public Context getCurrentContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("51c1976b", new Object[]{this});
        }
        return _getContext();
    }

    public String getCurrentUrl() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        try {
            str = super.getUrl();
        } catch (Exception unused) {
            v7t.n(TAG, "WebView had destroyed,forbid to be called getUrl. currentUrl : " + this.currentUrl);
            str = null;
        }
        if (str != null) {
            return str;
        }
        v7t.l(TAG, "getUrl by currentUrl: " + this.currentUrl);
        return this.currentUrl;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getDataOnActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b602214", new Object[]{this});
        }
        return this.dataOnActive;
    }

    public Object getExternalContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79cae7d3", new Object[]{this, str});
        }
        if (this.mExternalContext == null) {
            return null;
        }
        return this.mExternalContext.get(str);
    }

    public oz8 getFalcoSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("bb385c38", new Object[]{this});
        }
        return this.containerSpan;
    }

    public String getH5MonitorData(String str, String str2) {
        Hashtable<String, String> hashtable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("352185a4", new Object[]{this, str, str2});
        }
        Hashtable<String, Hashtable<String, String>> hashtable2 = this.mH5MonitorCache;
        if (hashtable2 == null || (hashtable = hashtable2.get(str)) == null) {
            return null;
        }
        return hashtable.get(str2);
    }

    public JSONObject getH5MonitorDatas() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("95767927", new Object[]{this});
        }
        if (this.mH5MonitorCache == null) {
            return new JSONObject();
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : this.mH5MonitorCache.keySet()) {
            Hashtable<String, String> hashtable = this.mH5MonitorCache.get(str);
            JSONObject jSONObject = new JSONObject();
            Enumeration<String> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                jSONObject.put(nextElement, hashtable.get(nextElement));
            }
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VideoControllerManager.ARRAY_KEY_RESOURCES, jSONArray);
        return jSONObject2;
    }

    public String getInjectJS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27c608e9", new Object[]{this});
        }
        try {
            return this.injectJs.substring(11);
        } catch (Exception unused) {
            return "";
        }
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

    public View.OnLongClickListener getLongClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("ee750356", new Object[]{this});
        }
        return this.mLongClickListener;
    }

    public Map<String, String> getOpenTracingContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be9386a9", new Object[]{this});
        }
        return this.openTracingContextMap;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this});
        }
        return this.pid;
    }

    @Override // tb.a7e
    public int getPageLoadedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("311abdbf", new Object[]{this})).intValue();
        }
        return this.mPageLoadedCount;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public WVPerformance getPerformanceDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPerformance) ipChange.ipc$dispatch("dd667958", new Object[]{this});
        }
        return this.performanceDelegate;
    }

    public qqm getPrefetchInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqm) ipChange.ipc$dispatch("9c4455b6", new Object[]{this});
        }
        return this.mPrefetchInfo;
    }

    @Override // tb.n8c
    public abq getSpanWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abq) ipChange.ipc$dispatch("5b230494", new Object[]{this});
        }
        return this.mSpanWrapper;
    }

    @Override // com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
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
        return super.getCoreView();
    }

    public WVCallBackContext getWVCallBackContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("587cc277", new Object[]{this});
        }
        return new WVCallBackContext(this);
    }

    public WVUCWebViewClient getWebViewClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebViewClient) ipChange.ipc$dispatch("624d37b7", new Object[]{this});
        }
        return this.webViewClient;
    }

    public ace getWebViewContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ace) ipChange.ipc$dispatch("39948840", new Object[]{this});
        }
        return this.mWebViewContext;
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

    public void insertH5MonitorData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6d1883", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.mH5MonitorCache == null) {
                this.mH5MonitorCache = new Hashtable<>();
            }
            Hashtable<String, String> hashtable = this.mH5MonitorCache.get(str);
            if (hashtable == null) {
                hashtable = new Hashtable<>();
                this.mH5MonitorCache.put(str, hashtable);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            hashtable.put(str2, str3);
        }
    }

    public boolean isCurrentU4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b98d39", new Object[]{this})).booleanValue();
        }
        if (getCurrentViewCoreType() == 3) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue();
        }
        return this.isLive;
    }

    public void isPageEmpty(final whiteScreenCallback whitescreencallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a05f26", new Object[]{this, whitescreencallback});
        } else {
            evaluateJavascript("(function(d){var filteredTagNames={'IFRAME':1,'STYLE':1,'HTML':1,'BODY':1,'HEAD':1,'SCRIPT':1,'TITLE':1};if(d.body){for(var nodes=d.body.childNodes,i=0;i<nodes.length;i++){var node=nodes[i];if(node!=undefined){if(node.nodeType==1&&filteredTagNames[node.tagName]!=1&&node.style.display!='none'){return'0'}else if(node.nodeType==3&&node.nodeValue.trim().length>0){return'0'}}}}return'1'}(document))", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    whiteScreenCallback whitescreencallback2 = whitescreencallback;
                    if (whitescreencallback2 != null) {
                        whitescreencallback2.isPageEmpty(str);
                    }
                }
            });
        }
    }

    public boolean isPreCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd46d89a", new Object[]{this})).booleanValue();
        }
        return this.isPreCreated;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public boolean isPreInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7f41d4", new Object[]{this})).booleanValue();
        }
        return this.isPreInit;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public boolean isReportedFSP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("197c5571", new Object[]{this})).booleanValue();
        }
        return this.reportedFSP;
    }

    public boolean isStaticWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f9d94cc", new Object[]{this})).booleanValue();
        }
        return this.mIsStaticWebView;
    }

    public boolean isStatusBarImmersive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1703924f", new Object[]{this})).booleanValue();
        }
        return this.statusBarImmersive;
    }

    @Override // com.uc.webview.export.WebView
    public void loadData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5f04d5", new Object[]{this, str, str2, str3});
            return;
        }
        zq zqVar = this.mAbilityEnv;
        if (zqVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                zqVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        super.loadData(str, str2, str3);
    }

    @Override // com.uc.webview.export.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ef121", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        WVGlobalState.markLoadUrl();
        if (v7t.h()) {
            v7t.d(TAG, "loadDataWithBaseURL: baseUrl=" + str);
        }
        zq zqVar = this.mAbilityEnv;
        if (zqVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                zqVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.uc.webview.export.WebView
    public void loadHtmlData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b75ec16", new Object[]{this, str, str2});
            return;
        }
        zq zqVar = this.mAbilityEnv;
        if (zqVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                zqVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        super.loadHtmlData(str, str2);
    }

    @Override // com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (str != null) {
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.Y1) {
                String str2 = DevTools.BACK_END_JS;
                if (!TextUtils.isEmpty(str2)) {
                    injectJsEarly(str2);
                }
                String str3 = DevTools.INJECTED_JS;
                if (!TextUtils.isEmpty(str3)) {
                    injectJsEarly(str3);
                }
            }
            if (this.mEnableReportInjectJSCost) {
                injectJsEarly("!function(){\"use strict\";!function(_){if(_&&_.__injected_script_start&&(_.__injected_script_end=Date.now(),_.__windvane__&&_.__windvane__.call)){var n=function(){};setTimeout((function(){_.__windvane__.call(\"WVPerformance.onStage\",{stage:{H5_INJECT_JS_START:_.__injected_script_start,H5_INJECT_JS_END:_.__injected_script_end}},n,n)}),100)}}(window)}();\n");
            }
            zq zqVar = this.mAbilityEnv;
            if (zqVar != null) {
                Context context = this.context;
                if (context instanceof MutableContextWrapper) {
                    zqVar.a(((MutableContextWrapper) context).getBaseContext());
                }
            }
            this.mSpanWrapper.e("loadUrl: ".concat(str));
            this.wpData.timeLoadurl = System.currentTimeMillis();
            if (this.mIsCoreDestroy) {
                vpw.b();
                if (wpwVar.w0) {
                    y71.commitFail("callAfterDestroy", 1, x74.i(new Exception().fillInStackTrace()), str);
                    v7t.d(TAG, "callAfterDestroy forbid");
                    return;
                }
            }
            vpw.b();
            if (!TextUtils.isEmpty(wpwVar.y0)) {
                vpw.b();
                if (str.matches(wpwVar.y0)) {
                    if (this.overrideBizId == null) {
                        setOverrideBizCode("meeting");
                    } else {
                        setOverrideBizCode(this.overrideBizId + "&meeting");
                    }
                }
            }
            if (gtw.g(str)) {
                if (ssw.c(str, this)) {
                    String b = eqw.c().b();
                    if (TextUtils.isEmpty(b)) {
                        HashMap hashMap = new HashMap(2);
                        hashMap.put("cause", "GET_ACCESS_FORBIDDEN");
                        hashMap.put("url", str);
                        onMessage(402, hashMap);
                        return;
                    }
                    try {
                        super.loadUrl(b);
                        return;
                    } catch (Exception e) {
                        v7t.d(TAG, e.getMessage());
                        return;
                    }
                } else if (ctw.a(str, this.context, this)) {
                    v7t.d(TAG, "loadUrl filter url=".concat(str));
                    y71.commitFail(y71.MONITOR_POINT_URL_CONFIG_FILTER_TYPE, 1, "WVUCWebView.loadUrl", str);
                    return;
                } else {
                    try {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("userAgent", getUserAgentString());
                        String f = com.taobao.weaver.prefetch.a.d().f(str, hashMap2);
                        if (!TextUtils.isEmpty(f)) {
                            str = f;
                        }
                    } catch (Throwable th) {
                        v7t.d(TAG, "failed to call prefetch: " + th.getMessage());
                        th.getStackTrace();
                    }
                    if (getCurrentViewCoreType() == 3) {
                        tryPrcacheDocument(str);
                    }
                }
            } else if (!TextUtils.isEmpty(str) && !str.startsWith("javascript:") && !str.startsWith("about:")) {
                y71.commitFail("NoHttpLoad", 1, null, str);
            }
            String handleUrlSchema = handleUrlSchema(str);
            if (!TextUtils.isEmpty(handleUrlSchema) && !handleUrlSchema.startsWith("javascript:") && !handleUrlSchema.startsWith("about:")) {
                if (this.firstTimeLoad && !handleUrlSchema.contains(BasePreInitManager.PRE_RENDER_URL_ADDITION_JUDGE)) {
                    this.wvh5PPManager.pageDidLoadRequest();
                    v7t.a(TAG, "pageDidLoadRequest " + getCurId() + " this=" + this + " loadUrl::" + handleUrlSchema);
                    this.firstTimeLoad = false;
                }
                this.wvh5PPManager.receiveHtmlUrl(handleUrlSchema);
                this.pageTracker.setPid(this.pid);
                this.pageTracker.loadUrl(handleUrlSchema);
                this.wpData.setPageCurrentStatus("loadUrl");
                try {
                    String queryParameter = Uri.parse(handleUrlSchema).getQueryParameter("_wvPgName");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        setFalcoPageName(queryParameter);
                    }
                } catch (Throwable th2) {
                    v7t.d(TAG, x74.i(th2));
                }
            }
            try {
                UCNetworkDelegate.getInstance().onUrlChange(this, handleUrlSchema);
                v7t.a(TAG, getCurId() + " this=" + this + " loadUrl:: " + handleUrlSchema);
                if (vpw.commonConfig.X0) {
                    this.currentUrl = handleUrlSchema;
                }
                commitLoadUrl(handleUrlSchema, 1);
                WVGlobalState.markLoadUrl();
                super.loadUrl(handleUrlSchema);
            } catch (Exception e2) {
                v7t.d(TAG, e2.getMessage());
            }
            setCachedUrl(handleUrlSchema);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 15 && this.webChromeClient.mFilePathCallback != null) {
            this.webChromeClient.mFilePathCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            this.webChromeClient.mFilePathCallback = null;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.c(i, i2, intent);
        }
    }

    @Override // com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        UCNetworkDelegate.getInstance().removeWebview(this);
        if (this.taskQueue.size() != 0) {
            this.taskQueue.clear();
        }
    }

    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
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

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.f(i, strArr, iArr);
        }
    }

    @Override // com.uc.webview.export.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        v7t.i("test", "onWindowVisibilityChanged  = [" + i + "]");
        if (i == 0) {
            Context _getContext = _getContext();
            if ((_getContext instanceof Activity) && (window = ((Activity) _getContext).getWindow()) != null) {
                final View decorView = window.getDecorView();
                decorView.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            decorView.requestLayout();
                        }
                    }
                }, 100L);
            }
        }
        super.onWindowVisibilityChanged(i);
    }

    public void putExternalContext(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca009382", new Object[]{this, str, obj});
            return;
        }
        if (this.mExternalContext == null) {
            synchronized (this) {
                try {
                    if (this.mExternalContext == null) {
                        this.mExternalContext = new HashMap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.mExternalContext.put(str, obj);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForCustomizedFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386157c9", new Object[]{this, new Long(j)});
        } else {
            this.pageTracker.onPageReceivedCustomizedFSP(j);
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForCustomizedStage(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd72d78", new Object[]{this, new Long(j), str});
        } else {
            this.pageTracker.onPageReceivedCustomizedStage(j, str);
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForFP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70c8d05", new Object[]{this, new Long(j)});
            return;
        }
        this.wvh5PPManager.receiveFPTime(j);
        this.pageTracker.onPageReceivedFP(j);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38219a8", new Object[]{this, new Long(j)});
            return;
        }
        this.wvfspManager.receiveJSMessage(j);
        this.pageTracker.onPageReceivedFSP(j);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForTTI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac6dcc2", new Object[]{this, new Long(j)});
            return;
        }
        this.wvh5PPManager.receiveTTITime(j);
        this.pageTracker.onPageReceivedTTI(j);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveOnProperty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28dbf60", new Object[]{this, jSONObject});
        } else {
            this.pageTracker.onPageReceiveProperty(jSONObject);
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveOnStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0dc1d8d", new Object[]{this, str});
        } else {
            this.pageTracker.onPageReceiveStage(str);
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

    public void refreshWhenForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24164c5f", new Object[]{this});
        } else if (!vpw.commonConfig.j2) {
            reload();
        } else if (this.mWebViewPaused) {
            this.mNeedReloadWhenOnResume = true;
        } else {
            reload();
        }
    }

    @Override // com.uc.webview.export.WebView
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("userAgent", getUserAgentString());
            com.taobao.weaver.prefetch.a.d().f(getCurrentUrl(), hashMap);
        } catch (Throwable th) {
            v7t.d(TAG, "failed to call prefetch: " + th.getMessage());
            th.printStackTrace();
        }
        super.reload();
    }

    public void setAbilityHubAdapter(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6fb4", new Object[]{this, abilityHubAdapter});
        } else {
            this.abilityHubAdapter = abilityHubAdapter;
        }
    }

    public void setAliNetwork(AliNetworkAdapterNew aliNetworkAdapterNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9840e9", new Object[]{this, aliNetworkAdapterNew});
            return;
        }
        synchronized (this) {
            this.aliRequestAdapter = aliNetworkAdapterNew;
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

    public void setCachedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cc2afc", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !str.startsWith("javascript:") && !str.startsWith("about:")) {
            this.cachedUrl = str;
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

    public void setFalcoPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeccbfa6", new Object[]{this, str});
            return;
        }
        try {
            ((WVFalco) getJsObject("WVFalco")).setPageName(str);
        } catch (Exception e) {
            v7t.d(TAG, "setPageName fail " + e);
        }
    }

    public void setFalcoSpan(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4da32c6", new Object[]{this, oz8Var});
            return;
        }
        this.containerSpan = oz8Var;
        UCLog.getInstance().getSpanWrapper().i(oz8Var);
        this.mSpanWrapper.i(oz8Var);
    }

    public void setFspCallback(WVFSPManager.FSPCallback fSPCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a179d", new Object[]{this, fSPCallback});
        } else {
            this.wvfspManager.setFspCallback(fSPCallback);
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

    public void setLongPressSaveImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e90054", new Object[]{this, new Boolean(z)});
        } else {
            this.longPressSaveImage = z;
        }
    }

    public void setOnErrorTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941a389", new Object[]{this, new Long(j)});
        } else {
            this.onErrorTime = j;
        }
    }

    public void setOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21064005", new Object[]{this, map});
        } else {
            this.openTracingContextMap = map;
        }
    }

    public void setOuterContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec406ab", new Object[]{this, context});
            return;
        }
        Context context2 = this.context;
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        } else {
            this.context = context;
        }
        if (WVCore.getInstance().isUCSupport() && (getContext() instanceof MutableContextWrapper)) {
            ((MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    public void setOverrideBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66966083", new Object[]{this, str});
            return;
        }
        vpw.b();
        if (vpw.commonConfig.z0) {
            this.overrideBizId = str;
            synchronized (this) {
                try {
                    AliNetworkAdapterNew aliNetworkAdapterNew = this.aliRequestAdapter;
                    if (aliNetworkAdapterNew != null) {
                        aliNetworkAdapterNew.setBizCode(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setPerformanceDelegate(WVPerformance wVPerformance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958e2782", new Object[]{this, wVPerformance});
        } else {
            this.performanceDelegate = wVPerformance;
        }
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public void setPreCreated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9807e6c6", new Object[]{this, new Boolean(z)});
        } else {
            this.isPreCreated = z;
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void setPreInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1693ad", new Object[]{this, new Boolean(z)});
        } else {
            this.isPreInit = z;
        }
    }

    public void setPrefetchInfo(qqm qqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21287c36", new Object[]{this, qqmVar});
        } else {
            this.mPrefetchInfo = qqmVar;
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void setReportedFSP(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fb4a3f", new Object[]{this, new Boolean(z)});
        } else {
            this.reportedFSP = z;
        }
    }

    public void setStatusBarImmersive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89501bb1", new Object[]{this, new Boolean(z)});
        } else {
            this.statusBarImmersive = z;
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

    public void setTouchEventHandler(TouchEventHandler touchEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b376bca", new Object[]{this, touchEventHandler});
        } else {
            this.mTouchEventHandler = touchEventHandler;
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

    @Override // com.uc.webview.export.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273e17fc", new Object[]{this, webChromeClient});
        } else if (webChromeClient instanceof WVUCWebChromeClient) {
            WVUCWebChromeClient wVUCWebChromeClient = (WVUCWebChromeClient) webChromeClient;
            this.webChromeClient = wVUCWebChromeClient;
            wVUCWebChromeClient.mWebView = this;
            super.setWebChromeClient(webChromeClient);
        } else {
            throw new WindVaneError("Your WebChromeClient must be extended from WVUCWebChromeClient");
        }
    }

    @Override // com.uc.webview.export.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ab3e66", new Object[]{this, webViewClient});
        } else if (webViewClient instanceof WVUCWebViewClient) {
            this.webViewClient = (WVUCWebViewClient) webViewClient;
            super.setWebViewClient(webViewClient);
        } else {
            throw new WindVaneError("Your WebViewClient must be extended from WVUCWebViewClient");
        }
    }

    public void setWvUIModel(atw atwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f036e74a", new Object[]{this, atwVar});
        } else {
            this.wvUIModel = atwVar;
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

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
        } else if (TextUtils.isEmpty(this.uid)) {
            this.uid = "" + urb.id.addAndGet(1);
        } else {
            this.uid += "_" + urb.subId.addAndGet(1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final long TIMESTAMP_DELTA = System.currentTimeMillis() - SystemClock.uptimeMillis();
        private Context mContext;
        private int mCoreType;
        private boolean mEnablePreCreate = false;
        private TouchEventHandler mTouchEventHandler = null;
        private boolean enablePrerender = false;
        private String realUrl = null;
        private String mPid = null;
        private boolean mEnableReportAPM = true;
        private cce mWebViewPageModel = null;
        private boolean mEnableAsyncJSAPIChannel = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface CoreType {
            public static final int System = 2;
            public static final int U4 = 3;
        }

        static {
            t2o.a(989856139);
        }

        public static /* synthetic */ Context access$000(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("c1405f59", new Object[]{builder});
            }
            return builder.mContext;
        }

        public static /* synthetic */ int access$100(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("52e573d5", new Object[]{builder})).intValue();
            }
            return builder.mCoreType;
        }

        public Builder setContext(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f43383ac", new Object[]{this, context});
            }
            this.mContext = context;
            return this;
        }

        public Builder setCoreType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dfc9e4df", new Object[]{this, new Integer(i)});
            }
            this.mCoreType = i;
            return this;
        }

        public Builder setEnableAsyncJSAPIChannel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5c3b85c", new Object[]{this, new Boolean(z)});
            }
            this.mEnableAsyncJSAPIChannel = z;
            return this;
        }

        public Builder setEnablePreCreate(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("13eff16d", new Object[]{this, new Boolean(z)});
            }
            this.mEnablePreCreate = z;
            return this;
        }

        public Builder setEnablePrerender(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ce0b3967", new Object[]{this, new Boolean(z)});
            }
            this.enablePrerender = z;
            return this;
        }

        public Builder setEnableReportAPM(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6e508078", new Object[]{this, new Boolean(z)});
            }
            this.mEnableReportAPM = z;
            return this;
        }

        public Builder setPid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3cddcd26", new Object[]{this, str});
            }
            this.mPid = str;
            return this;
        }

        public Builder setRealUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ba10fb00", new Object[]{this, str});
            }
            this.realUrl = str;
            return this;
        }

        public Builder setTouchEventHandler(TouchEventHandler touchEventHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7124f6f6", new Object[]{this, touchEventHandler});
            }
            this.mTouchEventHandler = touchEventHandler;
            return this;
        }

        public Builder setWebViewPageModel(c40 c40Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a0262359", new Object[]{this, c40Var});
            }
            this.mWebViewPageModel = c40Var;
            return this;
        }

        public WVUCWebView build() {
            WVUCWebView b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVUCWebView) ipChange.ipc$dispatch("6f296a2", new Object[]{this});
            }
            if (this.mContext != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (WVUCWebView.access$1200() && !WVUCWebView.access$1300().get() && this.mCoreType == 3) {
                    v7t.d(WVUCWebView.TAG, "call staticInitializeOnce in WVUCWebView.Builder.build");
                    WVUCWebView.staticInitializeOnce();
                }
                if (this.enablePrerender && !TextUtils.isEmpty(this.realUrl) && (b = PrerenderManager.INSTANCE.b(new uum(this.mContext, this.realUrl, 1))) != null) {
                    return b;
                }
                r9u.b("buildWebView");
                WVUCWebView wVUCWebView = null;
                if (vpw.commonConfig.V1 && this.mEnablePreCreate && this.mCoreType == 3) {
                    if (!(this.mContext == null || this.realUrl == null)) {
                        wVUCWebView = PrerenderManager.INSTANCE.b(new uum(this.mContext, this.realUrl, 2));
                    }
                    if (wVUCWebView == null) {
                        wVUCWebView = WebViewPool.acquirePreCreateWebView(this.mContext);
                    }
                }
                if (wVUCWebView == null) {
                    if (!WVCore.getInstance().isUCSupport() && this.mCoreType == 3) {
                        v7t.n(WVUCWebView.TAG, "webview is initializing during its creation");
                    }
                    r9u.b("createWebView");
                    wVUCWebView = new WVUCWebView(this);
                    r9u.d();
                }
                wVUCWebView.setTouchEventHandler(this.mTouchEventHandler);
                if (!this.mEnableReportAPM) {
                    tc.c(wVUCWebView, false);
                }
                if (this.mWebViewPageModel != null) {
                    wVUCWebView.getWebViewContext().addWebViewPageModel(this.mWebViewPageModel);
                }
                if (this.mEnableAsyncJSAPIChannel && wVUCWebView.isCurrentU4()) {
                    WVUCWebView.access$1400(wVUCWebView);
                    wVUCWebView.getWebViewContext().setEnableAsyncJSAPIChannel(true);
                }
                if (!TextUtils.isEmpty(this.mPid)) {
                    wVUCWebView.setPid(this.mPid);
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                try {
                    wVUCWebView.getWebViewContext().getWebViewPageModel().onStage("H5_webViewCreateStart", uptimeMillis);
                    wVUCWebView.getWebViewContext().getWebViewPageModel().onStage("H5_webViewCreateEnd", uptimeMillis2);
                    wVUCWebView.getWebViewContext().getWebViewPageModel().onProperty("H5_timestampDelta", Long.valueOf(TIMESTAMP_DELTA));
                    wVUCWebView.getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("wvEnableAsyncJSAPIChannel", Boolean.valueOf(this.mEnableAsyncJSAPIChannel));
                } catch (Exception unused) {
                }
                r9u.d();
                return wVUCWebView;
            }
            throw new IllegalStateException("create WVUCWebView with null context");
        }
    }

    private static void addUCCoreInfoToMotu(IRunningCoreInfo iRunningCoreInfo) {
        orb orbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce7c4ab", new Object[]{iRunningCoreInfo});
            return;
        }
        try {
            if (vpw.commonConfig.E1 && (orbVar = (orb) jpw.c().a(orb.class)) != null) {
                orbVar.addHeaderInfo("uc_core_first_used", String.valueOf(iRunningCoreInfo.isFirstUsed()));
                orbVar.addHeaderInfo("uc_core_is_reused", String.valueOf(iRunningCoreInfo.isReUsed()));
                orbVar.addHeaderInfo("uc_core_path", iRunningCoreInfo.path());
                orbVar.addHeaderInfo("uc_core_lib_path", iRunningCoreInfo.libPath());
            }
        } catch (Throwable th) {
            v7t.e(TAG, "add uc core info to motu fail", th, new Object[0]);
        }
    }

    private void drawDebugFlag(Canvas canvas) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a661923", new Object[]{this, canvas});
        } else if (og8.b()) {
            try {
                if (getCurrentViewCoreType() == 3) {
                    str = "U4";
                } else {
                    str = "Sys";
                }
                canvas.drawText("内核:".concat(str), 100.0f, 100.0f, getDebugPaint());
            } catch (Throwable th) {
                v7t.e(TAG, "draw debug fail", th, new Object[0]);
            }
        }
    }

    private String handleUrlSchema(String str) {
        qsw a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ff6a87", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.startsWith("javascript:") || str.startsWith("about:") || str.startsWith(h1p.HTTPS_PREFIX)) {
            return str;
        }
        boolean isInHttpUrlWhiteList = isInHttpUrlWhiteList(str);
        if (isInHttpUrlWhiteList && str.startsWith(itw.URL_SEPARATOR)) {
            lcn.a(RVLLevel.Error, "WindVane/Page").j("invalid_scheme").a("url", str).f();
            return str.replaceFirst(itw.URL_SEPARATOR, h1p.HTTP_PREFIX);
        } else if (!vpw.commonConfig.B1 || isInHttpUrlWhiteList || (a2 = psw.a()) == null) {
            return str;
        } else {
            String dealUrlScheme = a2.dealUrlScheme(str);
            if (TextUtils.equals(str, dealUrlScheme)) {
                return str;
            }
            y71.commitFail(y71.MONITOR_POINT_DEAL_URL_SCHEME, 0, str, dealUrlScheme);
            lcn.a(RVLLevel.Info, "WindVane/Page").j("url_scheme_changed").a("url", str).a("new_url", dealUrlScheme).f();
            return dealUrlScheme;
        }
    }

    private static void onRemoteFetchSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58556b9f", new Object[]{str});
            return;
        }
        sFetchFailed = false;
        sFetchFailCode = 0;
        sFetchFailMsg = null;
        UC_CORE_REMOTE_SO_PATH = str;
        v7t.d(TAG, "uc core remote fetch success:" + str);
        handleInitUCCore();
    }

    public static void onUCMCoreInitFailed(UCKnownException uCKnownException) {
        String str;
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c7cfb3", new Object[]{uCKnownException});
            return;
        }
        sCoreFailed = true;
        if (uCKnownException != null) {
            sCoreFailedCode = uCKnownException.errCode();
            sCoreFailedMsg = uCKnownException.getMessage();
            str = sCoreFailedMsg;
            if (TextUtils.isEmpty(str) && (rootCause = uCKnownException.getRootCause()) != null) {
                str = rootCause.getMessage();
            }
        } else {
            str = "";
        }
        v7t.d(TAG, "onUCMCoreInitFailed,code:" + sCoreFailedCode + ",msg:" + sCoreFailedMsg);
        WVCoreSettings instance = WVCoreSettings.getInstance();
        instance.notifyCoreEventCallback2Fail(au4.b(3, "uc core init failed, code:" + sCoreFailedCode + ", msg:" + str));
    }

    @Override // com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
        } else if (str != null) {
            if (isDestroied()) {
                v7t.d(TAG, "evaluateJavascriptNew after destroy : ".concat(str));
                return;
            }
            if (str.length() > 10 && str.regionMatches(true, 0, "javascript:", 0, 11)) {
                str = str.substring(11);
            }
            try {
                super.evaluateJavascript(str, valueCallback);
            } catch (Exception e) {
                v7t.d(TAG, "evaluateJavascriptNew error : " + e.getMessage());
                if (valueCallback == null) {
                    loadUrl("javascript:" + str);
                    return;
                }
                script2NativeCallback(str, valueCallback);
            }
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

    public void injectJsEarly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4c69a", new Object[]{this, str});
            return;
        }
        if (str.startsWith("javascript:")) {
            str = str.replace("javascript:", "");
        }
        StringBuilder sb = this.injectJs;
        sb.append(str);
        sb.append(";\n");
        if (this.injectJSProvider == null) {
            this.injectJSProvider = new UCExtension.InjectJSProvider() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uc.webview.export.extension.UCExtension.InjectJSProvider
                public String getJS(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("3f660b59", new Object[]{this, new Integer(i), str2});
                    }
                    return WVUCWebView.this.injectJs.toString();
                }
            };
        }
        if (getUCExtension() != null) {
            getUCExtension().setInjectJSProvider(this.injectJSProvider, 1);
        }
    }

    @Override // com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("webPageFirstLoad", Boolean.valueOf(sWebViewFirstAttached));
            getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("TMS_globalContainerOptimization", Boolean.valueOf(bba.a(this.context)));
            sWebViewFirstAttached = false;
        } catch (Exception unused) {
        }
        this.pageTracker.attachToWindow();
        v7t.a(TAG, " webview attach to window, and execute remain task");
        for (Runnable runnable : this.taskQueue) {
            runnable.run();
        }
        this.taskQueue.clear();
        super.onAttachedToWindow();
    }

    @Override // com.uc.webview.export.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.mWebViewPaused = true;
        try {
            if (getCurrentViewCoreType() == 3) {
                ExtImageDecoder.requestExtImageDecoderResult();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.e();
        }
        super.onPause();
        wpw wpwVar = vpw.commonConfig;
        if (wpwVar.c1) {
            lcn.a(RVLLevel.Info, "WindVane/Page").k("disappear", this.pageTracker.getPageIdentifier()).a("url", getCurrentUrl());
        }
        if (wpwVar.e0) {
            if (wpwVar.i2) {
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            x74.a();
                        }
                    }
                });
            } else {
                x74.a();
            }
        }
        lqw.d().e(3001);
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

    @Override // com.uc.webview.export.WebView
    public void stopLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41d5261", new Object[]{this});
            return;
        }
        isStop = true;
        super.stopLoading();
    }

    private void init() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        updateCurId();
        v7t.d(TAG, "uc webview init ");
        JSAPIManager.getInstance().register();
        gqw.a();
        oz8 d = w0a.d("windvanePage", "H5Page", this.isPreInit ? null : getOpenTracingContext());
        this.containerSpan = d;
        setFalcoSpan(d);
        try {
            lab labVar = (lab) jpw.c().a(lab.class);
            if (labVar != null) {
                setTag(labVar.d(), labVar.f());
                setTag(labVar.g(), Boolean.TRUE);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        int i = webviewIndentifier + 1;
        webviewIndentifier = i;
        this.pageTracker.setWebViewIdentifier(i);
        this.wvh5PPManager.webViewDidStartInit();
        this.pageTracker.initStart(this, this);
        if (!sCoreInitialized.get()) {
            v7t.d(TAG, "uc compensation initialization");
            sForegroundInitUC = true;
            initUCCore();
        }
        if (trw.getWvMonitorInterface() != null) {
            trw.getWvMonitorInterface().WebViewWrapType(_getContext().getClass().getSimpleName());
        }
        this.mIsCoreDestroy = false;
        if (!vpw.commonConfig.E2) {
            setContentDescription(TAG);
        }
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        if (TextUtils.equals("true", UCSoSettings.getInstance().UC_DEBUGGABLE)) {
            try {
                if (WVCore.getInstance().isUCStartInit()) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                android.webkit.WebView.setWebContentsDebuggingEnabled(true);
            } catch (Exception e) {
                v7t.o(TAG, "WebView.setWebContentsDebuggingEnabled failed", e, new Object[0]);
            }
        }
        this.isLive = true;
        vpw.b();
        wpw wpwVar = vpw.commonConfig;
        setUseTaobaoNetwork(!mDegradeAliNetwork && wpwVar.c > Math.random());
        v7t.a(TAG, "Webview init setUseTaobaoNetwork =" + getUseTaobaoNetwork());
        try {
            vpw.b();
            if (!TextUtils.isEmpty(wpwVar.g)) {
                pattern = Pattern.compile(wpwVar.g);
            }
        } catch (Exception e2) {
            v7t.d(TAG, "Pattern complile Exception" + e2.getMessage());
        }
        ksw.a(this.context);
        configSettings();
        if (getCurrentViewCoreType() == 3) {
            v7t.d(TAG, "core type: U4");
            WVCore.getInstance().setUCSupport(true);
            UCSetupService.configGlobalSettings();
            wpw wpwVar2 = vpw.commonConfig;
            if (wpwVar2.i1 && !sIsSetHttpCacheSize && Looper.myLooper() == Looper.getMainLooper()) {
                StorageUtils.setHttpCacheMaxSize(wpwVar2.j1, null);
                sIsSetHttpCacheSize = true;
                lcn.f(RVLLevel.Info, "WindVane/Cache", "Set HttpCache Max Size:" + wpwVar2.j1);
            }
            if (og8.b()) {
                StorageUtils.computeHttpCacheSize(new ValueCallback<Long>() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onReceiveValue(Long l) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2bfdf613", new Object[]{this, l});
                            return;
                        }
                        RVLLevel rVLLevel = RVLLevel.Info;
                        lcn.f(rVLLevel, "WindVane/Cache", "GetHttpCacheSize:" + l);
                    }
                });
            }
            y71.commitSuccess(y71.MONITOR_POINT_WEB_CORE_TYPE, "");
        } else {
            v7t.d(TAG, "core type: Android");
            if (vpw.commonConfig.e) {
                str = "forceSystem";
            } else if (WVCore.getInstance().isUCSupport()) {
                str = "successInit";
            } else if (sCoreFailed) {
                str = "core_" + sCoreFailedCode;
            } else if (WVUCRemoteFetcher.hasUCRemoteLocal()) {
                str = "notDoUCInitOrUCIniting";
            } else if (sFetchFailed) {
                str = "fetchFail_" + sFetchFailCode;
            } else if (sCoreInitialized.get()) {
                str = "notDownloaded";
            } else {
                str = "coreNotInit";
            }
            y71.commitFail(y71.MONITOR_POINT_WEB_CORE_TYPE, getCurrentViewCoreType(), str, x74.h(this.context));
            v7t.d(TAG, "WebViewCoreTypeByPV coreType=" + getCurrentViewCoreType() + " errorMsg=" + str + " process=" + x74.h(this.context));
        }
        if (getCurrentViewCoreType() == 3) {
            ExtImgDecoder.getInstance().init(this.context);
        }
        WVWPManager.getInstance().onViewInit(hashCode(), this.wpData);
        setWebViewClient(new WVUCWebViewClient(this.context));
        setWebChromeClient(new WVUCWebChromeClient(this.context));
        UCExtension uCExtension = getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new WVUCClient(this));
        }
        this.wvUIModel = new atw(_getContext(), this);
        WVJsBridge.g().i();
        this.entryManager = new esw(this.context, this, this);
        WVAppEvent wVAppEvent = new WVAppEvent();
        wVAppEvent.initialize(_getContext(), this);
        addJsObject("AppEvent", wVAppEvent);
        if (!initedJSBridge) {
            fsw.h("WVFullTrace", WVFullTrace.class);
            fsw.h("WVFalco", WVFalco.class);
            if (vpw.commonConfig.g1) {
                fsw.h("WVMega", WVMega.class);
            }
            initedJSBridge = true;
        }
        this.wvSecurityFilter = new rsw();
        lqw.d().c(this.wvSecurityFilter, lqw.e);
        this.jsPatchListener = new grw(this);
        lqw.d().c(this.jsPatchListener, lqw.f);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                try {
                    WebView.HitTestResult hitTestResult = WVUCWebView.this.getHitTestResult();
                    if (hitTestResult == null || !WVUCWebView.access$800(WVUCWebView.this)) {
                        return false;
                    }
                    if (v7t.h()) {
                        v7t.a(WVUCWebView.TAG, "Long click on WebView, " + hitTestResult.getExtra());
                    }
                    if (hitTestResult.getType() != 8 && hitTestResult.getType() != 5) {
                        return false;
                    }
                    WVUCWebView.access$302(WVUCWebView.this, hitTestResult.getExtra());
                    WVUCWebView wVUCWebView = WVUCWebView.this;
                    Context _getContext = WVUCWebView.this._getContext();
                    WVUCWebView wVUCWebView2 = WVUCWebView.this;
                    WVUCWebView.access$402(wVUCWebView, new PopupWindowController(_getContext, wVUCWebView2, WVUCWebView.access$200(wVUCWebView2), WVUCWebView.access$900(WVUCWebView.this)));
                    WVUCWebView.access$400(WVUCWebView.this).i();
                    return true;
                } catch (Exception e3) {
                    v7t.d(WVUCWebView.TAG, "getHitTestResult error:" + e3.getMessage());
                    return false;
                }
            }
        };
        this.mLongClickListener = onLongClickListener;
        setOnLongClickListener(onLongClickListener);
        boolean z = vpw.commonConfig.N2;
        this.mEnableReportInjectJSCost = z;
        if (z) {
            injectJsEarly("!function(){\"use strict\";window.__injected_script_start=Date.now()}();\n");
        }
        if (bsw.b().a().i()) {
            injectJsEarly(this.wvh5PPManager.jsCodeForUserPP());
        }
        if (bsw.b().a().e()) {
            setOnTouchListener(new View.OnTouchListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getAction() == 0) {
                        WVUCWebView.this.wvfspManager.unitDidFinish(new WVFSPManager.CompletionHandler() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.taobao.windvane.extra.performance2.WVFSPManager.CompletionHandler
                            public void stopObserving() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("65e141fe", new Object[]{this});
                                    return;
                                }
                                WVUCWebView wVUCWebView = WVUCWebView.this;
                                wVUCWebView.fireEvent(wVUCWebView.wvfspManager.eventForFSPStop());
                            }

                            @Override // android.taobao.windvane.extra.performance2.WVFSPManager.CompletionHandler
                            public void uploadFSPInfo(String str2, long j) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("2c485503", new Object[]{this, str2, new Long(j)});
                                } else {
                                    WVUCWebView.this.wvh5PPManager.recordFSP(j);
                                }
                            }
                        });
                    }
                    return false;
                }
            });
        }
        if (trw.getPackageMonitorInterface() != null) {
            trw.getPerformanceMonitor().didWebViewInitAtTime(System.currentTimeMillis());
        }
        if (ksw.b()) {
            try {
                setLayerType(1, null);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            CookieManager.getInstance().setAcceptCookie(true);
        } catch (Throwable unused) {
        }
        setAcceptThirdPartyCookies();
        addJavascriptInterface(new WVBridgeEngine(this, this), "__windvane__");
        wpw wpwVar3 = vpw.commonConfig;
        if (wpwVar3.g1) {
            if (wpwVar3.d2) {
                zq zqVar = new zq(bizId, "WindVane");
                this.mAbilityEnv = zqVar;
                zqVar.a(this.context);
                this.abilityHubAdapter = new AbilityHubAdapter(this.mAbilityEnv);
            } else {
                this.abilityHubAdapter = new AbilityHubAdapter(new zq(bizId, "WindVane").a(this.context));
            }
            addJavascriptInterface(new WVMegaBridge(this, this.abilityHubAdapter), "__sync_mega__");
        }
        if (!wpwVar3.C) {
            injectJsEarly(WVBridgeEngine.WINDVANE_CORE_JS);
        }
        if (ExtImgDecoder.getInstance().canExtImgDecoder()) {
            injectJsEarly("javascript:window.__windvane__.heic_supported=true");
        } else {
            injectJsEarly("javascript:window.__windvane__.heic_supported=false");
        }
        try {
            ArrayList<String> e4 = fqw.e();
            for (String str2 : wpwVar3.b) {
                e4.remove(str2);
            }
            StringBuilder sb = new StringBuilder("window.__mix_view_environment__={availableTypes:{");
            Iterator<String> it = e4.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(":");
                sb.append(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                sb.append(",");
            }
            if (sb.toString().contains(",")) {
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            sb.append("},matchType:'name',isForAppX:'no'}");
            injectJsEarly(sb.toString());
        } catch (Throwable unused2) {
        }
        if (!btw.c().d()) {
            btw.c().e();
            v7t.d(TAG, "init url config before init");
        }
        if (!eqw.c().d()) {
            eqw.c().e();
            v7t.d(TAG, "init domain config before init");
        }
        this.wvh5PPManager.webViewDidFinishInit();
        this.pageTracker.initEnd();
    }

    private boolean isInHttpUrlWhiteList(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a439b3c4", new Object[]{this, str})).booleanValue();
        }
        String str2 = vpw.commonConfig.A1;
        if (!(TextUtils.isEmpty(str2) || (split = str2.split(",")) == null || split.length == 0)) {
            try {
                for (String str3 : split) {
                    if (str.startsWith(itw.URL_SEPARATOR + str3)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                v7t.e(TAG, "url parse fail", e, new Object[0]);
            }
        }
        return false;
    }

    private static boolean isUseSystemWebViewImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa1af298", new Object[]{context})).booleanValue();
        }
        if (mUseSystemWebViewOnce) {
            mUseSystemWebViewOnce = false;
            return true;
        }
        wpw wpwVar = vpw.commonConfig;
        if (!wpwVar.i0) {
            setUseSystemWebView(wpwVar.e);
        } else if (wpwVar.e) {
            setUseSystemWebView(true);
        }
        boolean z = mUseSystemWebView;
        if (!z) {
            try {
                String config = OrangeConfig.getInstance().getConfig("WindVane", "useSysWebViewBizList", "");
                if (!TextUtils.isEmpty(config)) {
                    String[] split = config.split(";");
                    String name = context.getClass().getName();
                    for (String str : split) {
                        if (name.equals(str)) {
                            z = true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (!vpw.commonConfig.f || WVCore.getInstance().isUCSupport()) {
            if (sEnableSystemWebView && !z && !sStaticBlockedInitialized.get()) {
                v7t.d(TAG, "call staticInitializeOnce in isUseSystemWebView");
                staticInitializeOnce();
            }
            return z;
        }
        v7t.d(TAG, "windvane_uc_init_opt hit");
        return true;
    }

    private static void onRemoteFetchFail(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da45bb", new Object[]{th});
            return;
        }
        sCoreInitialized.set(false);
        sFetchFailed = true;
        if (th instanceof RSoException) {
            RSoException rSoException = (RSoException) th;
            sFetchFailCode = rSoException.getErrorCode();
            sFetchFailMsg = rSoException.getErrorMsg();
        }
        WVCoreSettings instance = WVCoreSettings.getInstance();
        instance.notifyCoreEventCallback2Fail(au4.b(3, sFetchFailCode + "_" + sFetchFailMsg));
        v7t.e(TAG, "uc core remote fetch fail:", th, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void coreDestroy() {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebView.coreDestroy():void");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
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
                v7t.a(TAG, "NOTIFY_PAGE_START mPageLoadedCount=" + this.mPageLoadedCount);
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
                atw atwVar3 = this.wvUIModel;
                if (atwVar3 != null) {
                    atwVar3.loadErrorPage();
                }
                this.onErrorTime = System.currentTimeMillis();
                atw atwVar4 = this.wvUIModel;
                if (atwVar4 != null) {
                    z = true;
                }
                if (atwVar4.isShowLoading() && z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 403:
                atw atwVar5 = this.wvUIModel;
                if (atwVar5 != null) {
                    z = true;
                }
                if (atwVar5.isShowLoading() && z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 404:
                try {
                    Toast.makeText(_getContext(), jrw.a(wmc.IMAGE_SAVED_SUCCESS), 1).show();
                } catch (Exception e) {
                    v7t.d(TAG, "NOTIFY_SAVE_IMAGE_SUCCESS fail " + e.getMessage());
                }
                return true;
            case 405:
                try {
                    Toast.makeText(_getContext(), jrw.a(wmc.IMAGE_SAVED_FAIL), 1).show();
                } catch (Exception e2) {
                    v7t.d(TAG, "NOTIFY_SAVE_IMAGE_FAIL fail " + e2.getMessage());
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.uc.webview.export.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.mWebViewPaused = false;
        refreshIfNeeded();
        esw eswVar = this.entryManager;
        if (eswVar != null) {
            eswVar.g();
        }
        try {
            super.onResume();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (vpw.commonConfig.c1) {
            lcn.a(RVLLevel.Info, "WindVane/Page").k("appear", this.pageTracker.getPageIdentifier()).a("url", getCurrentUrl());
        }
        lqw.d().f(3002, this, getUrl(), new Object[0]);
        this.isLive = true;
    }

    @Override // com.uc.webview.export.WebView
    public void postUrl(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7062c7", new Object[]{this, str, bArr});
        } else if (str != null) {
            if (gtw.g(str) && ssw.c(str, this)) {
                String b = btw.c().b();
                if (TextUtils.isEmpty(b)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "POST_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    loadUrl(b);
                } catch (Exception e) {
                    v7t.d(TAG, e.getMessage());
                }
            } else if (ctw.a(str, this.context, this)) {
                v7t.d(TAG, "postUrl filter url=".concat(str));
                y71.commitFail(y71.MONITOR_POINT_URL_CONFIG_FILTER_TYPE, 2, "WVUCWebView.loadUrl", str);
            } else {
                qsw a2 = psw.a();
                if (a2 != null) {
                    str = a2.dealUrlScheme(str);
                }
                this.wpData.setPageCurrentStatus("postUrl");
                try {
                    UCNetworkDelegate.getInstance().onUrlChange(this, str);
                    v7t.i(TAG, "postUrl : " + str);
                    commitLoadUrl(str, 3);
                    super.postUrl(str, bArr);
                } catch (Exception e2) {
                    v7t.d(TAG, e2.getMessage());
                }
                setCachedUrl(str);
            }
        }
    }

    static {
        t2o.a(989856122);
        t2o.a(989856464);
        t2o.a(989856003);
        t2o.a(989856196);
        t2o.a(989856463);
        t2o.a(989856461);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        sStaticBlockedInitialized = atomicBoolean;
        boolean z = vpw.commonConfig.x1;
        sEnableSystemWebView = z;
        if (!z && !atomicBoolean.get()) {
            v7t.d(TAG, "call staticInitializeOnce in static block");
            staticInitializeOnce();
        }
        sNetworkDelegateSet = new AtomicBoolean(false);
        sWebViewFirstAttached = true;
        sIsSetHttpCacheSize = false;
    }

    public static void onUCMCoreSwitched(Context context, long j, IRunningCoreInfo iRunningCoreInfo) {
        srw wvMonitorInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd41567f", new Object[]{context, new Long(j), iRunningCoreInfo});
            return;
        }
        v7t.i(TAG, "UCSDK init onUCMCoreSwitched: " + WebView.getCoreType());
        if (!WVCore.getInstance().isUCSupport() && WebView.getCoreType() == 3) {
            v7t.i(TAG, "CorePreparedCallback   isUCSDKSupport = true");
            WVCore.getInstance().setUCSupport(true);
            if (mUseAliNetwork) {
                INetworkHostingService.Instance.set(new AliNetworkHostingService(context));
            }
            sCoreFailed = false;
            sCoreFailedCode = 0;
            sCoreFailedMsg = null;
            if (coreEventCallback != null) {
                WVCoreSettings.getInstance().setCoreEventCallback(coreEventCallback);
            }
            boolean z = vpw.commonConfig.R2;
            if (z) {
                r9u.b("onUCMCoreSwitched-callback1");
                WVCoreSettings.getInstance().notifyCoreEventCallback2Success();
                r9u.d();
            }
            r9u.b("onUCMCoreSwitched-callback2");
            if (WVCoreSettings.getInstance().coreEventCallbacks != null) {
                for (zt4 zt4Var : WVCoreSettings.getInstance().coreEventCallbacks) {
                    zt4Var.onUCCorePrepared();
                }
            }
            r9u.d();
            if (!z) {
                WVCoreSettings.getInstance().notifyCoreEventCallback2Success();
            }
            vpw.b();
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.B0) {
                UCCoreController.registerThreadANRCallback(UCLog.getInstance().getSpanWrapper());
            }
            new UCHAManager().initHAParam(yaa.f().h());
            v7t.d(TAG, "onUCMCoreSwitched init ExtImgDecoder");
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            Application application = (Application) context;
            if (wpwVar.v1) {
                AtomicBoolean atomicBoolean = sNetworkDelegateSet;
                if (!atomicBoolean.get() && application != null && atomicBoolean.compareAndSet(false, true)) {
                    v7t.d(TAG, "set WVNetworkDelegate");
                    INetworkDelegate.Instance.set(1, new WVNetworkDelegate(application));
                }
            }
            if (!oba.g("wvDisableWebViewWarmup")) {
                ExtImgDecoder.getInstance().init(yaa.n);
            }
            if (wpwVar.F1 && (wvMonitorInterface = trw.getWvMonitorInterface()) != null) {
                wvMonitorInterface.commitCoreInitTime(System.currentTimeMillis() - j, String.valueOf(wpwVar.r));
            }
            lqw.d().e(ErrorCode.SERVER_DATA_ERROR);
            if (!yaa.f().p()) {
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            WVUCWebView.access$700();
                        }
                    }
                });
            }
            UCSetupService.initUCPlayerByDownload(yaa.n, UC_PLAYER_URL);
            commitUCCoreReuseInfo(iRunningCoreInfo);
            addUCCoreInfoToMotu(iRunningCoreInfo);
        }
    }

    public static boolean initUCLIb(String[] strArr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca2131bb", new Object[]{strArr, context})).booleanValue();
        }
        UCLog instance = UCLog.getInstance();
        wpw wpwVar = vpw.commonConfig;
        instance.init(wpwVar.z);
        setUseSystemWebView(wpwVar.e);
        v7t.a(TAG, "UCSDK initUCLib UseSystemWebView " + mUseSystemWebView);
        if (WVCore.getInstance().isUCSupport()) {
            return true;
        }
        try {
            setUcCoreUrl(wpwVar.h);
            if (strArr == null && og8.e()) {
                strArr = lex.TB_UC_SDK_APP_KEY_SEC;
            }
            if (UCSetupService.isU4MultiProcess(context)) {
                WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(au4.b(5, "uc core process no need init"));
                return false;
            }
            r9u.b("configInitSettings");
            UCSetupService.configInitSettings(context);
            r9u.d();
            String str = UCSoSettings.getInstance().UC_CORE_TYPE;
            String str2 = ("thick".equals(str) ? "厚" : "thin".equals(str) ? "薄" : "海外薄") + "集成、" + ("true".equals(UCSoSettings.getInstance().UC_DEBUGGABLE) ? "" : "不") + "可调试内核";
            if (WVCore.getInstance().innerSo(context)) {
                v7t.d(TAG, "当前内置".concat(str2));
                UCSetupService.initU4ByCompressedLib(context, strArr, UCCoreStartup.ucCore7ZFilePath(context));
                return !mUseSystemWebView;
            }
            String i = yaa.f().i();
            if (!TextUtils.isEmpty(i)) {
                v7t.d(TAG, "当前已解压".concat(str2));
                UCSetupService.initU4ByExtractedDir(context, strArr, i);
                return !mUseSystemWebView;
            }
            String str3 = UC_CORE_REMOTE_SO_PATH;
            if (!TextUtils.isEmpty(str3)) {
                v7t.d(TAG, "当前远程化SO".concat(str2));
                v7t.d(TAG, "当前远程化SO路径：" + str3);
                File file = new File(str3);
                if (file.isFile()) {
                    v7t.d(TAG, "kernel file, " + str2 + ", localPath=" + str3);
                    UCSetupService.initU4ByCompressedLib(context, strArr, str3);
                } else if (file.isDirectory()) {
                    v7t.d(TAG, "kernel dir, " + str2 + ", localPath=" + str3);
                    UCSetupService.initU4ByExtractedDir(context, strArr, str3);
                }
                return !mUseSystemWebView;
            } else if (TextUtils.isEmpty(UC_CORE_URL)) {
                new AndroidRuntimeException("neither inner so, remote so, nor download so").printStackTrace();
                if (WVUCUtils.is64Bit()) {
                    sCoreFailedCode = 300764;
                } else {
                    sCoreFailedCode = 300732;
                }
                WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(au4.b(6, "neither inner so, remote so, nor download so"));
                return false;
            } else {
                v7t.d(TAG, "当前下载".concat(str2));
                UCSetupService.initU4ByDownload(context, strArr, UC_CORE_URL);
                return !mUseSystemWebView;
            }
        } catch (Exception e) {
            v7t.d(TAG, "UCCore init fail " + e.getMessage());
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(au4.b(8, e.getMessage()));
            return false;
        }
    }

    public static void initUCCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fd9e64", new Object[0]);
        } else {
            initUCCore(null);
        }
    }

    public WVUCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        init();
    }

    @Override // com.uc.webview.export.WebView
    public void loadUrl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
            return;
        }
        zq zqVar = this.mAbilityEnv;
        if (zqVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                zqVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        String handleUrlSchema = handleUrlSchema(str);
        commitLoadUrl(handleUrlSchema, 2);
        WVGlobalState.markLoadUrl();
        super.loadUrl(handleUrlSchema, map);
        setCachedUrl(handleUrlSchema);
    }

    public WVUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        init();
    }

    public WVUCWebView(Context context) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        r9u.b("WVUCWebView#init");
        init();
        r9u.d();
    }

    public WVUCWebView(Context context, Map<String, String> map) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        this.openTracingContextMap = map;
        init();
    }

    public WVUCWebView(Context context, String str) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        if (!TextUtils.isEmpty(str)) {
            this.pid = str;
        }
        this.context = context;
        init();
    }

    public WVUCWebView(Context context, boolean z) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new abq();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{jrw.a(wmc.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = yaa.f().o();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.mEnableReportInjectJSCost = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            voe.g(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (vpw.commonConfig.t2) {
                            a.c(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).t("windvane").A(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).z(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).x(true).w("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").m();
                        } else {
                            hzl.b(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Context context2 = WVUCWebView.this.context;
                                    if (context2 != null) {
                                        voe.g(context2.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).d();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) != null) {
                    WVUCWebView.access$400(WVUCWebView.this).e();
                }
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        this.mIsStaticWebView = z;
        if (trw.getWvMonitorInterface() != null) {
            trw.getWvMonitorInterface().WebViewWrapType(context.getClass().getSimpleName());
        }
        if (z) {
            setWebViewClient(new WVUCWebViewClient(context));
            setWebChromeClient(new WVUCWebChromeClient(context));
            UCExtension uCExtension = getUCExtension();
            if (uCExtension != null) {
                uCExtension.setClient(new WVUCClient(this));
                return;
            }
            return;
        }
        init();
    }
}
