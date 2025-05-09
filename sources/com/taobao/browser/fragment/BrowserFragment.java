package com.taobao.browser.fragment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.crash.WVUTCrashCaughtListener;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver;
import com.taobao.browser.jsbridge.JsApiManager;
import com.taobao.browser.jsbridge.ui.ActionBarMenuItem;
import com.taobao.browser.urlFilter.BrowserUrlFilter;
import com.taobao.browser.urlFilter.UrlpreLoadFilter;
import com.taobao.browser.ut.FragmentWVUserTrack;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.UrlFormator;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.uc.webview.export.WebView;
import com.ut.mini.UTAnalytics;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aqw;
import tb.b2i;
import tb.d8s;
import tb.epo;
import tb.eqw;
import tb.fm2;
import tb.gtw;
import tb.j9l;
import tb.k7r;
import tb.km2;
import tb.knj;
import tb.lcn;
import tb.lm2;
import tb.lq6;
import tb.lqw;
import tb.m7r;
import tb.mdd;
import tb.mol;
import tb.mov;
import tb.mrw;
import tb.psw;
import tb.qsw;
import tb.t;
import tb.t2o;
import tb.trw;
import tb.v7t;
import tb.vmm;
import tb.vpw;
import tb.vtv;
import tb.vxm;
import tb.wym;
import tb.y71;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserFragment extends SupportSecondaryBaseFragment implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_SAVE_FORMAT_DATA = "SAVE_FORMAT_DATA";
    public static final String KEY_IMAGE_LIST = "imagelist";
    private static final String MONITOR_POINT_AFC_NAV_FAIL = "afcNavFail";
    private static final String MONITOR_POINT_TIME_OUT_GO_TO_HOME = "timeoutGoToHome";
    private static final int MSG_FINISH = 900;
    public static final int MYTAOBAO_BIND_CARD = 1001;
    public static final int MYTAOXIAOPU_BIND_CARD = 1003;
    private static final String TAG_FAV = "Favorite";
    private static final String URI_HOMEPAGE = "http://m.taobao.com/index.htm";
    private BrowserHybridWebView browserWebView;
    private long creatActivityTimeStamp;
    private BrowserUrlFilter filter;
    private boolean isBkpg;
    public epo mHandle;
    private SurfaceView mSurfaceView;
    private String mYyzUrl;
    private String orderId;
    public String url;
    private WVCallBackContext wvContext;
    private static String TAG = BrowserFragment.class.getSimpleName();
    private static int browserActivityID = 0;
    private static String mUTPageName = "BrowserFragment";
    private TBProgressBar progressbar = null;
    private HashMap<String, RelativeLayout> flowBarMap = new HashMap<>();
    private RelativeLayout mTabBarLayout = null;
    private boolean mAppLinkIsNewIntent = false;
    private boolean mAutoShowNavbar = true;
    private boolean saveFormatData = true;
    private boolean invalidateOnce = false;
    private boolean isRefundOrderUrl = false;
    private boolean isaddDesktop = false;
    private boolean isHookNativeBackByJs = false;
    private boolean isHookNativeBack = false;
    private boolean isAutoResetMenu = true;
    private boolean readTitle = true;
    private boolean alloweWebViewHistoryBack = true;
    private String mlinkhref = null;
    private String mlinkonclick = null;
    private Bitmap bitmap = null;
    private String shortcut_title = null;
    private String shortcut_icon = null;
    private String shortcut_url = null;
    private String shortcut_buttonText = null;
    private Bitmap shortcut_bitmap = null;
    private String mFavorIcon = null;
    private String mFavorText = "收藏";
    private ActionBarMenuItem menuItemRight = null;
    private ActionBarMenuItem menuItemSecondRight = null;
    private ActionBarMenuItem menuItemTitle = null;
    private List<ActionBarMenuItem> menuItemList = null;
    private String className = BrowserActivity.class.getName();
    public boolean forceWebView = false;
    private boolean hasCustomButton = false;
    private boolean hideUserHelperItem = false;
    private boolean hideShareItem = false;
    private String useDounble11Style = "festivalWithRainbowLine";
    private boolean mHasCollectData = false;
    public boolean enableUCVisibility = true;
    private String noMetaPageList = "";
    private String quitWebViewDirectlyUrls = "";
    private boolean statusImmersive = false;
    private String mActivityHashCode = "";

    static {
        t2o.a(619708487);
    }

    @Deprecated
    public BrowserFragment() {
        v7t.d(TAG, "BrowserFragment()");
    }

    public static /* synthetic */ BrowserHybridWebView access$000(BrowserFragment browserFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserHybridWebView) ipChange.ipc$dispatch("f4580d9", new Object[]{browserFragment});
        }
        return browserFragment.browserWebView;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ boolean access$202(BrowserFragment browserFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("516507e5", new Object[]{browserFragment, new Boolean(z)})).booleanValue();
        }
        browserFragment.isHookNativeBackByJs = z;
        return z;
    }

    private void finishSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75de7b86", new Object[]{this});
        } else if (!onBackPressed()) {
            finish();
        }
    }

    private static String getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b12904a8", new Object[0]);
        }
        return "BA_" + browserActivityID;
    }

    private void getMetaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe96f9a", new Object[]{this, str});
            return;
        }
        String p = BrowserUtil.p();
        if (p != null) {
            this.hideShareItem = BrowserUtil.c(str);
            this.browserWebView.evaluateJavascript(p, new ValueCallback<String>() { // from class: com.taobao.browser.fragment.BrowserFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    mrw.b().e(str2);
                    JSONObject c = mrw.b().c();
                    if (c != null) {
                        if (!c.has("WV.Meta.StopSaveImage") || !"true".equalsIgnoreCase(c.optString("WV.Meta.StopSaveImage"))) {
                            try {
                                View.OnLongClickListener longClickListener = BrowserFragment.access$000(BrowserFragment.this).getLongClickListener();
                                if (BrowserFragment.access$000(BrowserFragment.this) != null) {
                                    BrowserFragment.access$000(BrowserFragment.this).setOnLongClickListener(longClickListener);
                                    v7t.a(BrowserFragment.access$100(), "reset SaveImage");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (BrowserFragment.access$000(BrowserFragment.this) != null) {
                            BrowserFragment.access$000(BrowserFragment.this).setOnLongClickListener(null);
                            v7t.a(BrowserFragment.access$100(), "StopSaveImage");
                        }
                    }
                }
            });
        }
    }

    private String getPageNameUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c813b83a", new Object[]{this});
        }
        String dataString = getOriginIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            int indexOf = dataString.indexOf("?");
            if (indexOf != -1) {
                dataString = dataString.substring(0, indexOf);
            }
            if (!TextUtils.isEmpty(dataString)) {
                return dataString;
            }
        }
        return "";
    }

    private String getUrlReferer(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df2dbde", new Object[]{this, str, intent});
        }
        String str2 = null;
        try {
            if (intent.getExtras() != null) {
                if (intent.hasExtra(m7r.WEEX_REFERER_ORIGIN)) {
                    str2 = (String) intent.getExtras().get(m7r.WEEX_REFERER_ORIGIN);
                } else {
                    str2 = (String) intent.getExtras().get(m7r.URL_REFERER_ORIGIN);
                }
            }
        } catch (Exception unused) {
            TLog.loge(TAG, "error extras");
        }
        if (str2 != null) {
            str = str2;
        }
        qsw a2 = psw.a();
        if (a2 == null) {
            a2 = new WVSchemeProcessor();
            psw.b(a2);
        }
        String dealUrlScheme = a2.dealUrlScheme(str);
        String str3 = TAG;
        TLog.loge(str3, "intercepted by [" + a2.getClass().getName() + "],origin_url=[" + str + "], new_url=[" + dealUrlScheme + "]");
        return dealUrlScheme;
    }

    public static void hideLoadingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395c4f09", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserFragment browserFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -512593800:
                return super.getContext();
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/fragment/BrowserFragment");
        }
    }

    private String preBrowserFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6595bcb2", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            v7t.d(TAG, "originalurl is null, and finish activity.");
            epo epoVar = this.mHandle;
            if (epoVar != null) {
                epoVar.sendEmptyMessage(900);
            }
            return null;
        }
        UrlpreLoadFilter urlpreLoadFilter = new UrlpreLoadFilter(getContext(), getOriginIntent(), this.mHandle, this.browserWebView);
        String preloadURL = urlpreLoadFilter.preloadURL(str, getOriginIntent());
        if (preloadURL == null) {
            this.browserWebView.loadUrl(str);
            v7t.d(TAG, "UrlpreLoadFilter result is null, and call superLoadUrl.");
            return null;
        } else if (urlpreLoadFilter.filtrate(preloadURL)) {
            return null;
        } else {
            return preloadURL;
        }
    }

    private static void updateID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420462b", new Object[0]);
        } else {
            browserActivityID++;
        }
    }

    public Context getActivityOrContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f42dfd46", new Object[]{this});
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        return LauncherRuntime.g;
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = super.getContext();
        if (context != null) {
            return context;
        }
        return LauncherRuntime.g;
    }

    public epo getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epo) ipChange.ipc$dispatch("27d8787b", new Object[]{this});
        }
        return this.mHandle;
    }

    public String getNoMetaPageList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a6ac450", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_NO_META_PAGE_LIST, "");
    }

    public Intent getOriginIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("56cdf9d4", new Object[]{this});
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Intent) arguments.getParcelable("originActivityIntent");
        }
        return null;
    }

    public String getQuitWebViewDirectlyList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4481f51", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_QUIT_WEBVIEW_DIRECTLY_LIST, "");
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !TextUtils.isEmpty(browserHybridWebView.getUTPageName())) {
            return this.browserWebView.getUTPageName();
        }
        String pageNameUrl = getPageNameUrl();
        if (!TextUtils.isEmpty(pageNameUrl)) {
            return pageNameUrl;
        }
        return mUTPageName;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "BrowserFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.browserWebView.onActivityResult(i, i2, intent);
        if (i == 7000 && intent != null) {
            try {
                this.browserWebView.setDataOnActive(intent.getStringExtra("data"));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        if (BrowserUtil.s(getActivityOrContext())) {
            Toast.makeText(getActivityOrContext(), "BrowserFragment!", 0).show();
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView == null || !browserHybridWebView.canGoBack()) {
            return false;
        }
        this.browserWebView.goBack();
        return true;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        lm2.c();
        super.onCreate(bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        boolean z;
        boolean z2;
        String str;
        long j;
        boolean z3;
        String str2;
        boolean z4;
        Uri parse;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        long currentTimeMillis = System.currentTimeMillis();
        mdd j2 = vxm.b.j(this);
        j2.v("containerInit");
        k7r.b("exchain.FullTrace", "BrowserActivity.onCreate start time: " + currentTimeMillis);
        updateID();
        lcn.a(RVLLevel.Error, "BrowserFragment").k("H5_initContainer", getID()).n(currentTimeMillis).f();
        d8s.a().f(getClass().getName());
        b2i.b().c("onCreate start");
        fm2.b().c();
        Intent originIntent = getOriginIntent();
        String dataString = originIntent.getDataString();
        String str3 = TAG;
        v7t.d(str3, "mUrl=" + dataString);
        y71.commitFail("BrowserFragment", 1, "createView", dataString);
        if (TextUtils.isEmpty(dataString)) {
            super.onCreate(bundle);
            v7t.d(TAG, "originalurl is null, finishSelf");
            finishSelf();
            return null;
        }
        String trim = dataString.trim();
        this.url = trim;
        String urlReferer = getUrlReferer(trim, originIntent);
        if (urlReferer != null) {
            trim = urlReferer;
        }
        Uri parse2 = Uri.parse(trim);
        if (!eqw.c().d()) {
            b2i.b().c("init domain config");
            eqw.c().e();
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.dealURL cost time: " + (System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            bundle2 = originIntent.getExtras();
        } catch (Exception unused) {
            v7t.d(TAG, "fail to get intent extras");
            bundle2 = null;
        }
        if (bundle2 != null) {
            z = bundle2.getBoolean(Constants.MYBROWSERHIDETITLE, false);
            this.isRefundOrderUrl = bundle2.getBoolean("is_refund_order_url", false);
            this.orderId = bundle2.getString("bizOrderId");
            this.alloweWebViewHistoryBack = bundle2.getBoolean("alloweWebViewHistoryBack", true);
            this.saveFormatData = bundle2.getBoolean("SAVE_FORMAT_DATA", true);
            z2 = bundle2.getBoolean("isPostUrl", false);
            bundle3 = bundle2;
        } else {
            bundle3 = bundle2;
            z2 = false;
            z = false;
        }
        if (parse2 == null || !parse2.isHierarchical()) {
            str = "true";
        } else {
            if (!z) {
                BrowserUtil.e(parse2);
            }
            String queryParameter2 = parse2.getQueryParameter("hasCustomButton");
            if (queryParameter2 != null && "true".equals(queryParameter2.trim())) {
                this.hasCustomButton = true;
            }
            str = "true";
            this.statusImmersive = parse2.getBooleanQueryParameter("status_bar_transparent", false);
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.dealBundle cost time: " + (System.currentTimeMillis() - currentTimeMillis2));
        long currentTimeMillis3 = System.currentTimeMillis();
        b2i.b().c("super.onCreate start");
        super.onCreate(bundle);
        k7r.b("exchain.FullTrace", "BrowserActivity.superOnCreate cost time: " + (System.currentTimeMillis() - currentTimeMillis3));
        long currentTimeMillis4 = System.currentTimeMillis();
        k7r.b("exchain.FullTrace", "BrowserActivity.ObtainOrange cost time: " + (System.currentTimeMillis() - currentTimeMillis4));
        b2i.b().c("ObtainOrange start");
        long currentTimeMillis5 = System.currentTimeMillis();
        k7r.b("exchain.FullTrace", "BrowserActivity.InflateLayout cost time: " + (System.currentTimeMillis() - currentTimeMillis5));
        long currentTimeMillis6 = System.currentTimeMillis();
        this.mHandle = new epo(getActivity(), this);
        boolean z5 = vpw.commonConfig.e;
        if (BrowserUtil.g(parse2)) {
            y71.commitFail("wvUseSysWebView", 1, "wvUseSysWebView", trim);
            z5 = true;
        }
        WVUCWebView.setUseSystemWebView(z5);
        if (trim.contains("waitUCPrepared=true")) {
            z3 = z2;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            j = currentTimeMillis;
            lqw.d().b(new aqw() { // from class: com.taobao.browser.fragment.BrowserFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str4, Object... objArr) {
                    if (str4.hashCode() == 1847240272) {
                        super.onUCCorePrepared();
                        return null;
                    }
                    int hashCode = str4.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/browser/fragment/BrowserFragment$1");
                }

                @Override // tb.aqw
                public void onUCCorePrepared() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                        return;
                    }
                    super.onUCCorePrepared();
                    v7t.i("WVUCWebView", "countDown");
                    countDownLatch.countDown();
                }
            });
            if (z5 || WebView.getCoreType() == 3) {
                v7t.i("WVUCWebView", "need not wait");
            } else {
                v7t.i("WVUCWebView", "need wait");
                try {
                    countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            z3 = z2;
            j = currentTimeMillis;
        }
        k7r.b("exchain.FullTrace", "init webveiw start: " + currentTimeMillis6);
        lcn.a(RVLLevel.Error, "BrowserFragment").k("H5_initWebview", getID()).n(currentTimeMillis6).f();
        b2i.b().c("init webveiw start");
        TLog.logi("WVUCWebView", "use uc core = [" + WVCore.getInstance().isUCSupport() + "]");
        j2.e("containerInit", null);
        j2.v("webviewInit");
        if (WVCore.getInstance().isUCSupport()) {
            try {
                this.browserWebView = vmm.a().getPreRender(trim, getActivity());
            } catch (Throwable unused2) {
            }
            if (this.browserWebView == null) {
                if (!z5) {
                    this.browserWebView = vmm.a().getPreWeb();
                    vmm.a();
                    vmm.b(getActivity());
                    v7t.d(vmm.TAG, "getPreRender by key=[" + trim + "] failed");
                }
                z4 = false;
            } else {
                v7t.d(vmm.TAG, "getPreRender by key=[" + trim + "] success");
                z4 = true;
            }
            if (!wym.a(getContext())) {
                WVUCWebView.setBizCode(m7r.WINDVANE_MULTI_BIZ_ID);
                str2 = "]";
                BrowserUtil.b(TAG, "onCreateView", "set_multi_biz", this.url, null);
            } else {
                str2 = "]";
                if (originIntent.hasExtra("BizId")) {
                    try {
                        WVUCWebView.setBizCode(originIntent.getStringExtra("BizId"));
                    } catch (Exception e2) {
                        v7t.d(TAG, e2.getMessage());
                    }
                }
            }
        } else {
            str2 = "]";
            z4 = false;
        }
        if (this.browserWebView != null) {
            v7t.d(vmm.TAG, "browserWebView != null");
            this.browserWebView.setOuterContext(getActivity());
            if (!z4) {
                this.browserWebView.init();
                vmm.a().clear();
            }
        } else {
            v7t.d(vmm.TAG, "new BrowserHybridWebView");
            this.browserWebView = new BrowserHybridWebView(getActivity());
        }
        FragmentWVUserTrack fragmentWVUserTrack = new FragmentWVUserTrack();
        fragmentWVUserTrack.initialize(getActivityOrContext(), this.browserWebView);
        this.browserWebView.addJsObject("WVTBUserTrack", fragmentWVUserTrack);
        j2.e("webviewInit", null);
        j2.v("jsBridgeInit");
        RVLLevel rVLLevel = RVLLevel.Error;
        lcn.a(rVLLevel, "BrowserFragment").k("H5_initJsBridge", getID()).n(System.currentTimeMillis()).f();
        if (getActivity() != null) {
            this.mActivityHashCode = BrowserUtil.r(getActivity());
        }
        this.browserWebView.setStatusBarImmersive(this.statusImmersive);
        this.browserWebView.pageTracker.creatActivity(this.creatActivityTimeStamp);
        k7r.b("exchain.FullTrace", "init webveiw end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis6));
        long currentTimeMillis7 = System.currentTimeMillis();
        if (getActivity() != null) {
            if (WVCore.getInstance().isUCSupport()) {
                getActivity().getWindow().setSoftInputMode(34);
            } else {
                getActivity().getWindow().setSoftInputMode(18);
            }
        }
        this.browserWebView.setOutHandler(this.mHandle);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("url", trim);
        if (originIntent.hasCategory("com.taobao.intent.category.HYBRID_UI") || !knj.a(getActivity(), parse2)) {
            vtv.a(getActivity(), this.className, trim, originIntent);
            k7r.b("exchain.FullTrace", "BrowserActivity.[webview-initjsapi] cost time: " + (System.currentTimeMillis() - currentTimeMillis7));
            long currentTimeMillis8 = System.currentTimeMillis();
            JsApiManager.initJsApi(getActivity(), this.browserWebView);
            k7r.b("exchain.FullTrace", "BrowserActivity.InitJsApi cost time: " + (System.currentTimeMillis() - currentTimeMillis8));
            long currentTimeMillis9 = System.currentTimeMillis();
            j2.e("jsBridgeInit", null);
            j2.v("filtrate");
            lcn.a(rVLLevel, "BrowserFragment").k("H5_filtrate", getID()).n(System.currentTimeMillis()).f();
            BrowserUrlFilter browserUrlFilter = new BrowserUrlFilter(getActivity(), this.mHandle, this.browserWebView);
            this.filter = browserUrlFilter;
            this.browserWebView.setFilter(browserUrlFilter);
            if (z3) {
                String string = bundle3.getString("postdata");
                try {
                    new String(string.getBytes(), "UTF-8");
                    this.browserWebView.postUrl(trim, string.getBytes());
                } catch (Exception unused3) {
                }
                String str4 = TAG;
                v7t.n(str4, "post Url originalurl is  " + trim + MspWebActivity.POSTDATA + string);
                return null;
            }
            if (parse2.isHierarchical() && (queryParameter = parse2.getQueryParameter("forceAllH5")) != null && str.equals(queryParameter.trim())) {
                this.forceWebView = true;
            }
            this.filter.setForceWebView(this.forceWebView);
            k7r.b("exchain.FullTrace", "BrowserActivity.[wopc-preloadurl] cost time: " + (System.currentTimeMillis() - currentTimeMillis9));
            long currentTimeMillis10 = System.currentTimeMillis();
            UrlpreLoadFilter urlpreLoadFilter = new UrlpreLoadFilter(getContext(), getOriginIntent(), this.mHandle, this.browserWebView);
            String preloadURL = urlpreLoadFilter.preloadURL(trim, originIntent);
            k7r.b("exchain.FullTrace", "BrowserActivity.UrlpreLoadFilter.preloadURL cost time: " + (System.currentTimeMillis() - currentTimeMillis10));
            String str5 = TAG;
            TLog.loge(str5, "preloadUrl before_url=[" + trim + "], new_url = [" + preloadURL + str2);
            if (preloadURL == null) {
                this.browserWebView.loadUrl(trim);
                if (trw.getWvPerformanceMonitorInterface() != null) {
                    trw.getWvPerformanceMonitorInterface().recordDeviceCreateTime(trim, System.currentTimeMillis() - j);
                }
                v7t.n(TAG, "UrlpreLoadFilter result is null, and call superLoadUrl.");
                return null;
            }
            long currentTimeMillis11 = System.currentTimeMillis();
            if (urlpreLoadFilter.basefiltrate(preloadURL)) {
                lq6.a().e("afc", hashMap);
                if (!preloadURL.contains("hybrid=true")) {
                    finishSelf();
                }
                k7r.b("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
                b2i.b().a();
                return null;
            }
            k7r.b("exchain.FullTrace", "BrowserActivity.UrlpreLoadFilter.baseFilterate cost time: " + (System.currentTimeMillis() - currentTimeMillis11));
            long currentTimeMillis12 = System.currentTimeMillis();
            if (urlpreLoadFilter.filtrate(preloadURL)) {
                lq6.a().e("afc", hashMap);
                finishSelf();
                k7r.b("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
                b2i.b().a();
                return null;
            }
            k7r.b("exchain.FullTrace", "BrowserActivity.UrlpreLoadFilter.filtrate cost time: " + (System.currentTimeMillis() - currentTimeMillis12));
            long currentTimeMillis13 = System.currentTimeMillis();
            Uri.parse(preloadURL);
            new Bundle().putBoolean("from_browser", true);
            if (!StringUtil.isEmpty(preloadURL) && (parse = Uri.parse(preloadURL)) != null && parse.isHierarchical()) {
                String queryParameter3 = parse.getQueryParameter("clickid");
                if (!StringUtil.isEmpty(queryParameter3)) {
                    this.filter.setFilterClickId(queryParameter3);
                }
            }
            mrw.b().f(new String[]{"WV.Meta.Share.Title", "WV.Meta.Share.Url", "WV.Meta.Share.Image", "WV.Meta.Share.Text", "WV.Meta.Share.Disabled", "WV.Meta.Share.Targets", "WV.Meta.Share.BizId", "WV.Meta.Nav.HideMoreItem", "WV.Meta.Nav.HideNavBar", "WV.Meta.DisableRefresh", "WV.Meta.Favorite.BizId", "WV.Meta.Favorite.FeedId", "WV.Meta.Favorite.Title", "WV.Meta.Favorite.Image", "WV.Meta.Favorite.Summary", "WV.Meta.Favorite.Url", "WV.Meta.StopSaveImage"});
            try {
                WVUTCrashCaughtListener.wv_currentStatus = "2";
            } catch (Throwable unused4) {
            }
            k7r.b("exchain.FullTrace", "BrowserActivity.[urlfilter-loadurl] cost time: " + (System.currentTimeMillis() - currentTimeMillis13));
            String str6 = TAG;
            TLog.loge(str6, "load url = [" + preloadURL + str2);
            System.currentTimeMillis();
            j2.e("filtrate", null);
            if (!z4) {
                lcn.a(RVLLevel.Error, "BrowserFragment").k("H5_loadUrl", getID()).a("url", trim).n(System.currentTimeMillis()).f();
                this.browserWebView.loadUrl(preloadURL);
                this.browserWebView.wpData.timeLoadurl = System.currentTimeMillis();
            }
            long currentTimeMillis14 = System.currentTimeMillis();
            if (trw.getWvPerformanceMonitorInterface() != null) {
                trw.getWvPerformanceMonitorInterface().recordDeviceCreateTime(preloadURL, currentTimeMillis14 - j);
            }
            this.browserWebView.setSafeFormatData(this.saveFormatData);
            if (!t.a(getActivityOrContext(), "enableMultiExecutor")) {
                BrowserUtil.u(getActivityOrContext(), this.browserWebView);
                LoginBroadcastReceiver.a(getActivity(), this.browserWebView, null, 101);
            } else {
                km2.a().b(new Runnable() { // from class: com.taobao.browser.fragment.BrowserFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BrowserUtil.u(BrowserFragment.this.getActivityOrContext(), BrowserFragment.access$000(BrowserFragment.this));
                        LoginBroadcastReceiver.a(BrowserFragment.this.getActivity(), BrowserFragment.access$000(BrowserFragment.this), null, 101);
                    }
                });
            }
            if (getActivity() != null) {
                Intent intent = getActivity().getIntent();
                intent.putExtra("ActivityName", "BrowserActivity:" + gtw.i(preloadURL));
            }
            this.useDounble11Style = j9l.c("android_windvane_config", "defaultFestivalStyle", "festivalWithRainbowLine");
            k7r.b("exchain.FullTrace", "BrowserActivity.[loadurl-end] cost time: " + (System.currentTimeMillis() - currentTimeMillis14));
            k7r.b("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("stageName", "onCreage");
                jSONObject.put("beginTime", j);
                jSONObject.put("endTime", System.currentTimeMillis());
                jSONObject.put("thread", Thread.currentThread().getName());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            d8s.a().g(jSONObject);
            b2i.b().a();
            long j3 = 0;
            long longValue = (originIntent.getExtras() == null || !originIntent.getExtras().containsKey("NAV_START_ACTIVITY_TIME")) ? 0L : ((Long) originIntent.getExtras().get("NAV_START_ACTIVITY_TIME")).longValue();
            if (longValue > 0) {
                j3 = System.currentTimeMillis() - longValue;
            }
            try {
                j2.a("H5_BrowserFragment", Boolean.TRUE);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            String str7 = TAG;
            Log.e(str7, "Create cost time : " + j3);
            return this.browserWebView;
        }
        lq6.a().e("afc", hashMap);
        finishSelf();
        k7r.b("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
        b2i.b().a();
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            browserHybridWebView.onLowMemory();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        TLog.loge(TAG, "onNewIntent.");
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    this.mAppLinkIsNewIntent = intent.getExtras().getBoolean("AppLinkISOnNewIntent");
                }
            } catch (Exception unused) {
            }
            String str = null;
            try {
                str = intent.getStringExtra(Constants.MYBROWSERURL);
                if (TextUtils.isEmpty(str)) {
                    str = intent.getDataString();
                }
                String urlReferer = getUrlReferer(str, intent);
                if (urlReferer != null) {
                    str = urlReferer;
                }
                str = preBrowserFilter(str);
            } catch (Exception unused2) {
                TLog.loge(TAG, "fail to get intent extras");
            }
            v7t.d(y7t.TAOBAO_TAG, "Browser : onNewIntent 2:" + str);
            BrowserHybridWebView browserHybridWebView = this.browserWebView;
            if (!(browserHybridWebView == null || str == null)) {
                browserHybridWebView.resume();
                this.browserWebView.loadUrl(UrlFormator.formatUrl(str));
                this.browserWebView.wpData.timeLoadurl = System.currentTimeMillis();
            }
            epo epoVar = this.mHandle;
            if (epoVar != null && epoVar.hasMessages(1105)) {
                this.mHandle.removeMessages(1105);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("url", str);
            Intent originIntent = getOriginIntent();
            originIntent.putExtra("ActivityName", "BrowserActivity:" + gtw.i(str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (!shouldDoOnPause()) {
            v7t.d(TAG, "into not shouldDoOnPause");
            super.onPause();
        } else {
            v7t.d(TAG, "into onPause");
            doOnPause();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!shouldDoOnResume()) {
            v7t.d(TAG, "into not shouldDoOnResume");
            super.onResume();
        } else {
            v7t.d(TAG, "into onResume");
            doOnResume();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void setUTPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fa6fac", new Object[]{this, str});
        } else {
            mUTPageName = str;
        }
    }

    public void doOnPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1426e2d3", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            browserHybridWebView.pause();
            epo epoVar = this.mHandle;
            if (epoVar != null) {
                epoVar.postDelayed(new Runnable() { // from class: com.taobao.browser.fragment.BrowserFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            BrowserFragment.access$000(BrowserFragment.this).evaluateJavascript("(function() { return (!!document.body.innerHTML);})()", new ValueCallback<String>() { // from class: com.taobao.browser.fragment.BrowserFragment.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public void onReceiveValue(String str) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str});
                                        return;
                                    }
                                    epo epoVar2 = BrowserFragment.this.mHandle;
                                    if (epoVar2 != null) {
                                        if (epoVar2.hasMessages(1105)) {
                                            BrowserFragment.this.mHandle.removeMessages(1105);
                                        }
                                        if ("false".equalsIgnoreCase(str)) {
                                            Message obtain = Message.obtain();
                                            obtain.what = 1105;
                                            BrowserFragment.this.mHandle.dispatchMessage(obtain);
                                        }
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                }, 3000L);
            } else {
                return;
            }
        }
        v7t.a(TAG, "onPause.");
        mol.b().e(this.mActivityHashCode, this.browserWebView.getOriginalUrl(), false);
        try {
            WVUTCrashCaughtListener.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        super.onPause();
    }

    public void doOnResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5514b59e", new Object[]{this});
            return;
        }
        this.enableUCVisibility = TextUtils.equals("true", OrangeConfig.getInstance().getConfig("group_common_browser", m7r.KEY_ORANGE_CONFIG_ENABLE_UC_VISIBILITY, "false"));
        long currentTimeMillis = System.currentTimeMillis();
        super.onResume();
        v7t.a(TAG, "onResume.");
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !TextUtils.isEmpty(browserHybridWebView.getCurrentUrl())) {
            Properties properties = new Properties();
            properties.put("url", this.browserWebView.getCurrentUrl());
            TBS.EasyTrace.updateEasyTraceActivityProperties(getActivity(), properties);
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.onResume after supper: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        epo epoVar = this.mHandle;
        if (epoVar != null && epoVar.hasMessages(1105)) {
            this.mHandle.removeMessages(1105);
        }
        BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
        if (browserHybridWebView2 != null) {
            browserHybridWebView2.resume();
            this.browserWebView.setVisibility(0);
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.onResume after resume webview: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        if (m7r.c) {
            m7r.c = false;
            this.browserWebView.getWVCallBackContext().fireEvent("WindVane.fromWebViewPop", "{}");
        }
        try {
            getMetaInfo(this.mYyzUrl);
            WVUTCrashCaughtListener.wv_currentStatus = "2";
        } catch (Throwable unused) {
        }
        BrowserUtil.u(getActivityOrContext(), this.browserWebView);
        k7r.b("exchain.FullTrace", "BrowserActivity.onResume end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        BrowserHybridWebView browserHybridWebView3 = this.browserWebView;
        if (!(browserHybridWebView3 == null || browserHybridWebView3.getUTPageName() == null)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), this.browserWebView.getUTPageName());
        }
        BrowserHybridWebView browserHybridWebView4 = this.browserWebView;
        if (browserHybridWebView4 != null && browserHybridWebView4.getUTParamMap() != null) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), this.browserWebView.getUTParamMap());
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !this.isBkpg) {
            browserHybridWebView.ObtainRenderType();
        }
        m7r.d = null;
        LoginBroadcastReceiver.b(getActivity());
        v7t.a(TAG, "onDestroy.");
        if (this.mSurfaceView != null) {
            this.mSurfaceView = null;
        }
        TBProgressBar tBProgressBar = this.progressbar;
        if (tBProgressBar != null) {
            if (tBProgressBar.getParent() != null && (this.progressbar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.progressbar.getParent()).removeView(this.progressbar);
            }
            this.progressbar = null;
        }
        epo epoVar = this.mHandle;
        if (epoVar != null) {
            epoVar.b();
            this.mHandle = null;
        }
        Bitmap bitmap4 = this.bitmap;
        if (bitmap4 != null) {
            bitmap4.recycle();
            this.bitmap = null;
        }
        ActionBarMenuItem actionBarMenuItem = this.menuItemTitle;
        if (!(actionBarMenuItem == null || (bitmap3 = actionBarMenuItem.iconBitemap) == null)) {
            bitmap3.recycle();
            this.menuItemTitle = null;
        }
        ActionBarMenuItem actionBarMenuItem2 = this.menuItemRight;
        if (!(actionBarMenuItem2 == null || (bitmap2 = actionBarMenuItem2.iconBitemap) == null)) {
            bitmap2.recycle();
            this.menuItemRight = null;
        }
        ActionBarMenuItem actionBarMenuItem3 = this.menuItemSecondRight;
        if (!(actionBarMenuItem3 == null || (bitmap = actionBarMenuItem3.iconBitemap) == null)) {
            bitmap.recycle();
            this.menuItemSecondRight = null;
        }
        List<ActionBarMenuItem> list = this.menuItemList;
        if (list != null && list.size() > 0) {
            for (ActionBarMenuItem actionBarMenuItem4 : this.menuItemList) {
                Bitmap bitmap5 = actionBarMenuItem4.iconBitemap;
                if (bitmap5 != null) {
                    bitmap5.recycle();
                }
            }
            this.menuItemList = null;
        }
        super.onDestroy();
        BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
        if (browserHybridWebView2 != null) {
            browserHybridWebView2.hideErrorPage();
            this.browserWebView.setFilter(null);
            this.browserWebView.setOutHandler(null);
            this.browserWebView.setVisibility(8);
            this.browserWebView.removeAllViews();
            this.browserWebView.coreDestroy();
            this.browserWebView = null;
        }
        this.isHookNativeBack = false;
        try {
            WVUTCrashCaughtListener.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        lm2.e();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || (browserHybridWebView = this.browserWebView) == null) {
            return false;
        }
        if (!this.isHookNativeBack || this.isHookNativeBackByJs) {
            this.isHookNativeBackByJs = false;
            browserHybridWebView.getWVCallBackContext().fireEvent("WV.Event.Key.Back", "{}");
            if (trw.getPerformanceMonitor() != null) {
                trw.getPerformanceMonitor().didExitAtTime(this.browserWebView.getUrl(), System.currentTimeMillis());
            }
            TBProgressBar tBProgressBar = this.progressbar;
            if (tBProgressBar != null && tBProgressBar.isShown()) {
                this.browserWebView.stopLoading();
            }
            String url = this.browserWebView.getUrl();
            this.quitWebViewDirectlyUrls = getQuitWebViewDirectlyList();
            if (!TextUtils.isEmpty(url)) {
                try {
                    Uri parse = Uri.parse(url);
                    if (parse != null && "true".equals(parse.getQueryParameter("disallowback"))) {
                        this.alloweWebViewHistoryBack = false;
                    }
                    if (!TextUtils.isEmpty(this.quitWebViewDirectlyUrls) && mov.b(this.quitWebViewDirectlyUrls, url)) {
                        this.alloweWebViewHistoryBack = false;
                    }
                } catch (Exception unused) {
                }
            }
            if (this.alloweWebViewHistoryBack) {
                return this.browserWebView.back();
            }
            finishSelf();
            return true;
        }
        browserHybridWebView.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.taobao.browser.fragment.BrowserFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str) {
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                } else if (BrowserFragment.access$000(BrowserFragment.this) != null) {
                    if (!TextUtils.isEmpty(str)) {
                        z = !"false".equals(str.replace("\"", "").replace("'", ""));
                    }
                    if (z) {
                        BrowserFragment.access$000(BrowserFragment.this).getWVCallBackContext().fireEvent(RPWebViewActivity.l, "{}");
                        return;
                    }
                    try {
                        Runtime.getRuntime().exec("input keyevent 4");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    BrowserFragment.access$202(BrowserFragment.this, true);
                }
            }
        });
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 59:
                AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.HANDLER_WHAT_FILTERURLSID", 1.0d);
                this.browserWebView.loadUrl((String) message.obj);
                break;
            case 88:
                getOriginIntent().putExtra("data", (String) message.obj);
                if (!this.browserWebView.back()) {
                    finishSelf();
                    break;
                }
                break;
            case 136:
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj)));
                    break;
                } catch (ActivityNotFoundException unused) {
                    Toast makeText = Toast.makeText(getActivityOrContext(), "对不起，您的设备找不到相应程序", 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                    break;
                }
            case 400:
                k7r.b("exchain.FullTrace", "BrowserActivity.NOTIFY_PAGE_START: " + System.currentTimeMillis());
                TBProgressBar tBProgressBar = this.progressbar;
                if (tBProgressBar != null) {
                    tBProgressBar.resetProgress();
                }
                mrw.b().a();
                break;
            case 401:
                this.mYyzUrl = (String) message.obj;
                FragmentActivity activity = getActivity();
                String str = this.className;
                String str2 = this.mYyzUrl;
                vtv.b(activity, str, str2, str2);
                TBProgressBar tBProgressBar2 = this.progressbar;
                if (tBProgressBar2 != null) {
                    tBProgressBar2.setCurrentProgress(100);
                }
                getMetaInfo(this.mYyzUrl);
                Intent originIntent = getOriginIntent();
                originIntent.putExtra("ActivityName", "BrowserActivity:" + gtw.i(this.mYyzUrl));
                break;
            case 402:
                TBProgressBar tBProgressBar3 = this.progressbar;
                if (tBProgressBar3 != null) {
                    tBProgressBar3.setCurrentProgress(100);
                    break;
                }
                break;
            case 900:
                finishSelf();
                break;
            case 1001:
                AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOBAO_BIND_CARD", 1.0d);
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.mytaobao.bindcard");
                intent.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
                intent.setPackage("com.taobao.taobao");
                Bundle bundle = new Bundle();
                try {
                    JSONObject jSONObject = new JSONObject(message.getData().getString("data"));
                    bundle.putInt("fromSource", Integer.valueOf(jSONObject.getString("fromSource")).intValue());
                    bundle.putBoolean("bind_card_switch", jSONObject.getBoolean("bind_card_switch"));
                    bundle.putString("user_id", jSONObject.getString("user_id"));
                } catch (Exception unused2) {
                }
                intent.putExtras(bundle);
                try {
                    startActivityForResult(intent, 1001);
                    break;
                } catch (Exception e) {
                    String str3 = TAG;
                    v7t.i(str3, "start BindCardActivity failed: " + e.toString());
                    break;
                }
            case 1003:
                AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOIAOPU_BIND_CARD", 1.0d);
                Intent intent2 = new Intent();
                intent2.setAction("com.taobao.tao.mytaobao.bindcard");
                intent2.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
                Bundle bundle2 = new Bundle();
                try {
                    JSONObject jSONObject2 = new JSONObject(message.getData().getString("data"));
                    bundle2.putInt("fromSource", Integer.valueOf(jSONObject2.getString("fromSource")).intValue());
                    bundle2.putBoolean("bind_card_switch", jSONObject2.getBoolean("bind_card_switch"));
                    bundle2.putString("user_id", jSONObject2.getString("user_id"));
                    bundle2.putString("tb_user_id", jSONObject2.getString("tb_user_id"));
                } catch (Exception unused3) {
                }
                intent2.putExtras(bundle2);
                try {
                    startActivityForResult(intent2, 1003);
                    break;
                } catch (Exception e2) {
                    String str4 = TAG;
                    v7t.i(str4, "start BindCardActivity failed: " + e2.toString());
                    break;
                }
            case 1102:
                if (!getOriginIntent().hasExtra("isfrompushMsg")) {
                    finishSelf();
                    break;
                } else {
                    Nav.from(getActivityOrContext()).toUri("http://m.taobao.com/index.htm");
                    break;
                }
            case 1103:
                BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
                if (browserHybridWebView2 != null && this.hasCustomButton) {
                    browserHybridWebView2.loadUrl(m7r.f23827a);
                }
                BrowserUtil.u(getActivityOrContext(), this.browserWebView);
                String noMetaPageList = getNoMetaPageList();
                this.noMetaPageList = noMetaPageList;
                if (!TextUtils.isEmpty(noMetaPageList) && (browserHybridWebView = this.browserWebView) != null && mov.b(this.noMetaPageList, browserHybridWebView.getCurrentUrl())) {
                    this.browserWebView.loadUrl(m7r.b);
                    break;
                }
                break;
            case 1105:
                if (!this.mAppLinkIsNewIntent) {
                    Bundle data = message.getData();
                    if (!(data == null || data.getString("result") == null)) {
                        String string = data.getString("result");
                        Intent intent3 = new Intent();
                        intent3.setAction("Broadcast_Activity");
                        intent3.putExtra("result", string);
                        intent3.setPackage(getContext().getPackageName());
                        getContext().sendBroadcast(intent3);
                    }
                    finishSelf();
                    break;
                } else {
                    this.mAppLinkIsNewIntent = false;
                    break;
                }
                break;
            case 1109:
                new Intent().putExtra("data", (String) message.obj);
                finishSelf();
                break;
            case m7r.TRADE_SETINFO /* 1114 */:
                new Intent().putExtra("data", (String) message.obj);
                finishSelf();
                break;
            case 1121:
                this.isHookNativeBack = true;
                break;
            case m7r.TRADE_SELFPICKUP /* 1122 */:
                new Intent().putExtra("data", (String) message.obj);
                finishSelf();
                break;
            case m7r.WEBVIEW_PROGRESS_CHANGE /* 1126 */:
                TBProgressBar tBProgressBar4 = this.progressbar;
                if (tBProgressBar4 != null) {
                    tBProgressBar4.setCurrentProgress(message.arg1);
                    break;
                }
                break;
            case m7r.HIDE_LOADING_DIALOG /* 1131 */:
                hideLoadingDialog();
                break;
        }
        return true;
    }
}
