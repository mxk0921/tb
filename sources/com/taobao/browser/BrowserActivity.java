package com.taobao.browser;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.crash.WVUTCrashCaughtListener;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.taobao.TBActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.nav.Nav;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver;
import com.taobao.browser.fragment.SplashFragment;
import com.taobao.browser.jsbridge.ui.ActionBarMenuItem;
import com.taobao.browser.urlFilter.BrowserUrlFilter;
import com.taobao.browser.urlFilter.UrlpreLoadFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.view.FlowBar;
import com.taobao.browser.view.TabBar;
import com.taobao.falco.m;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.login4android.api.Login;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.TrackBuried;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.NavUrls;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.UrlFormator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTPageStatus;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.acq;
import tb.aqw;
import tb.avt;
import tb.avv;
import tb.b2i;
import tb.c29;
import tb.c40;
import tb.d8s;
import tb.epo;
import tb.eqw;
import tb.fm2;
import tb.gm2;
import tb.gtw;
import tb.j9l;
import tb.jjx;
import tb.k7r;
import tb.knj;
import tb.lcn;
import tb.lm4;
import tb.lqw;
import tb.m7r;
import tb.mdd;
import tb.mol;
import tb.mov;
import tb.mrw;
import tb.px9;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.to8;
import tb.trw;
import tb.tz8;
import tb.uqx;
import tb.uy8;
import tb.v7t;
import tb.vmm;
import tb.vpw;
import tb.vxm;
import tb.w0a;
import tb.y71;
import tb.y7t;
import tb.z8l;
import tb.zt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserActivity extends BaseActivity implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_SAVE_FORMAT_DATA = "SAVE_FORMAT_DATA";
    public static final String KEY_IMAGE_LIST = "imagelist";
    private static final String MONITOR_POINT_AFC_NAV_FAIL = "afcNavFail";
    private static final String MONITOR_POINT_TIME_OUT_GO_TO_HOME = "timeoutGoToHome";
    private static final int MSG_FINISH = 900;
    public static final int MYTAOBAO_BIND_CARD = 1001;
    public static final int MYTAOXIAOPU_BIND_CARD = 1003;
    private static final String TAG = "BrowserActivity";
    private static final String TAG_FAV = "Favorite";
    private static final String URI_HOMEPAGE = "http://m.taobao.com/index.htm";
    private static int browserActivityID = 0;
    private static final String nextPageAnimationParam = "nextPageAnimation=false";
    private Uri _uri;
    private BrowserHybridWebView browserWebView;
    private uy8 businessSpan;
    private long creatActivityTimeStamp;
    private BrowserUrlFilter filter;
    private boolean isAfcMergeOpenH5;
    private boolean isBkpg;
    private boolean isHideTitle;
    private boolean isIntentSetAfcH5Url;
    private boolean isPostUrl;
    private boolean isUCCorePreparedCallback;
    private boolean isWaitUCReady;
    private boolean loaded;
    public epo mHandle;
    private m mRumBizSpan;
    private String mYyzUrl;
    private String navAfcMergeUrl;
    private long onCreateTime;
    private Map<String, String> openTracingContextMap;
    private String orderId;
    private String originalurl;
    private long start;
    public String url;
    private long webViewStart;
    private WVCallBackContext wvContext;
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
    public boolean enableUCVisibility = true;
    private String noMetaPageList = "";
    private String quitWebViewDirectlyUrls = "";
    @Deprecated
    private l webOrange = null;
    private boolean statusImmersive = false;
    private String mActivityHashCode = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class FavContentCallBack implements IFavContentCallBack {

        /* renamed from: a  reason: collision with root package name */
        public final String f10229a;
        public final FavType b;

        static {
            t2o.a(619708438);
            t2o.a(462422028);
        }

        public FavContentCallBack(String str, FavType favType) {
            this.f10229a = str;
            this.b = favType;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.tao.favorite.aidl.IFavContentCallBack
        public void onResult(Map map) throws RemoteException {
            v7t.d(BrowserActivity.TAG_FAV, "into--[onResult] map:" + map.toString());
            if (TextUtils.equals((String) map.get("com.taobao.tao.mytaobao.favContent.contentUrl"), this.f10229a)) {
                int i = d.$SwitchMap$com$taobao$browser$BrowserActivity$FavType[this.b.ordinal()];
                boolean z = true;
                String str = "收藏";
                String str2 = "favor_light";
                BrowserActivity browserActivity = BrowserActivity.this;
                if (i == 1) {
                    boolean equals = TextUtils.equals((CharSequence) map.get("com.taobao.tao.mytaobao.favContent.result"), "success");
                    if (equals) {
                        str2 = "favor_fill_light";
                    }
                    BrowserActivity.access$1102(browserActivity, str2);
                    if (equals) {
                        str = "取消收藏";
                    }
                    BrowserActivity.access$1302(browserActivity, str);
                } else if (i == 2) {
                    boolean equals2 = TextUtils.equals((CharSequence) map.get("com.taobao.tao.mytaobao.favContent.result"), "success");
                    if (!equals2) {
                        str2 = "favor_fill_light";
                    }
                    BrowserActivity.access$1102(browserActivity, str2);
                    if (!equals2) {
                        str = "取消收藏";
                    }
                    BrowserActivity.access$1302(browserActivity, str);
                } else if (i == 3) {
                    if (!TextUtils.equals((CharSequence) map.get("com.taobao.tao.mytaobao.favContent.result"), "success") || !((String) map.get("com.taobao.tao.mytaobao.favContent.data")).equals("true")) {
                        z = false;
                    }
                    if (z) {
                        str2 = "favor_fill_light";
                    }
                    BrowserActivity.access$1102(browserActivity, str2);
                    if (z) {
                        str = "取消收藏";
                    }
                    BrowserActivity.access$1302(browserActivity, str);
                }
                browserActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum FavType {
        IsFavorite,
        AddFavorite,
        DeleteFavorite;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FavType favType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserActivity$FavType");
        }

        public static FavType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavType) ipChange.ipc$dispatch("682ae5fe", new Object[]{str});
            }
            return (FavType) Enum.valueOf(FavType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f10230a;
        public final /* synthetic */ ActionBar b;

        public a(ImageView imageView, ActionBar actionBar) {
            this.f10230a = imageView;
            this.b = actionBar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable == null) {
                return false;
            }
            this.f10230a.setImageDrawable(drawable);
            ActionBar actionBar = this.b;
            if (actionBar != null) {
                i = (int) (actionBar.getHeight() * 0.6d);
            }
            if (BrowserActivity.access$800(BrowserActivity.this).stretch) {
                this.f10230a.setLayoutParams(new Toolbar.LayoutParams(-1, i));
                this.f10230a.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                Bitmap bitmap = drawable.getBitmap();
                this.f10230a.setLayoutParams(new Toolbar.LayoutParams((int) ((i / bitmap.getHeight()) * bitmap.getWidth()), i));
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                BrowserActivity.access$900(BrowserActivity.this).fireEvent("TBNaviBar.titleItem.clicked", "{}");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            JSONObject jSONObject = new JSONObject();
            int i = -1;
            if (menuItem.getIntent() != null) {
                try {
                    i = menuItem.getIntent().getIntExtra("index", -1);
                } catch (Exception unused) {
                }
            }
            if (i >= 0) {
                try {
                    jSONObject.put("index", i);
                } catch (JSONException unused2) {
                }
            }
            if (BrowserActivity.access$900(BrowserActivity.this) != null) {
                BrowserActivity.access$900(BrowserActivity.this).fireEvent("TBNaviBar.moreItem.clicked", jSONObject.toString());
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$browser$BrowserActivity$FavType;

        static {
            int[] iArr = new int[FavType.values().length];
            $SwitchMap$com$taobao$browser$BrowserActivity$FavType = iArr;
            try {
                iArr[FavType.AddFavorite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$browser$BrowserActivity$FavType[FavType.DeleteFavorite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$browser$BrowserActivity$FavType[FavType.IsFavorite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends aqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f10233a;

        public e(BrowserActivity browserActivity, CountDownLatch countDownLatch) {
            this.f10233a = countDownLatch;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1847240272) {
                super.onUCCorePrepared();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserActivity$1");
        }

        @Override // tb.aqw
        public void onUCCorePrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
                return;
            }
            super.onUCCorePrepared();
            v7t.i("WVUCWebView", "countDown");
            this.f10233a.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserActivity$2");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k7r.a("exchain.FullTrace", "UC Core init timeout,  Back to Home");
            epo epoVar = BrowserActivity.this.mHandle;
            if (epoVar != null) {
                epoVar.sendEmptyMessage(m7r.GO_TO_HOME);
            }
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("url", (Object) BrowserActivity.access$100(BrowserActivity.this));
            AppMonitor.Alarm.commitFail(m7r.KEY_MONITOR_MODULE, "WebViewInitAsync", "UCCoreTimeout", jSONObject.toJSONString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends zt4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10235a;
        public final /* synthetic */ Timer b;
        public final /* synthetic */ mdd c;
        public final /* synthetic */ Bundle d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g.this.b.cancel();
                k7r.a("exchain.FullTrace", "Timer cancel");
                g gVar = g.this;
                BrowserActivity.access$300(BrowserActivity.this, gVar.c, gVar.d);
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("url", (Object) BrowserActivity.access$100(BrowserActivity.this));
                AppMonitor.Alarm.commitSuccess(m7r.KEY_MONITOR_MODULE, "WebViewInitAsync", jSONObject.toJSONString());
            }
        }

        public g(long j, Timer timer, mdd mddVar, Bundle bundle) {
            this.f10235a = j;
            this.b = timer;
            this.c = mddVar;
            this.d = bundle;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == 1847240272) {
                super.onUCCorePrepared();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserActivity$3");
        }

        @Override // tb.zt4
        public void onUCCorePrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
                return;
            }
            super.onUCCorePrepared();
            if (!BrowserActivity.access$200(BrowserActivity.this)) {
                BrowserActivity.access$202(BrowserActivity.this, true);
                k7r.a("exchain.FullTrace", "UC Core is ready now, wait time:" + (SystemClock.uptimeMillis() - this.f10235a));
                epo epoVar = BrowserActivity.this.mHandle;
                if (epoVar != null) {
                    epoVar.removeMessages(m7r.GO_TO_HOME);
                }
                new Handler(Looper.getMainLooper()).post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BrowserActivity browserActivity = BrowserActivity.this;
            BrowserUtil.u(browserActivity, BrowserActivity.access$400(browserActivity));
            BrowserActivity browserActivity2 = BrowserActivity.this;
            LoginBroadcastReceiver.a(browserActivity2, BrowserActivity.access$400(browserActivity2), null, 101);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            BrowserActivity.access$502(BrowserActivity.this, mVar);
            BrowserActivity.access$500(BrowserActivity.this).Z("h5");
            BrowserActivity.access$500(BrowserActivity.this).T(5000L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends c40 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10239a;

        public j(long j) {
            this.f10239a = j;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserActivity$6");
        }

        @Override // tb.c40, tb.cce
        public void onProperty(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
            }
        }

        @Override // tb.c40, tb.cce
        public void onStage(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            } else if (BrowserActivity.access$500(BrowserActivity.this) != null) {
                if (TextUtils.equals(str, "H5_JST_displayedTime_SSR")) {
                    BrowserActivity.access$500(BrowserActivity.this).u(Long.valueOf(this.f10239a + j));
                } else if (TextUtils.equals(str, "H5_JST_displayedTime")) {
                    BrowserActivity.access$500(BrowserActivity.this).u(Long.valueOf(this.f10239a + j));
                }
                if (TextUtils.equals(str, "H5_JST_FCP")) {
                    BrowserActivity.access$500(BrowserActivity.this).q0(Long.valueOf(j + this.f10239a));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BrowserActivity.access$602(BrowserActivity.this, succPhenixEvent.getDrawable().getBitmap());
                if (BrowserActivity.access$600(BrowserActivity.this) != null) {
                    BrowserActivity.this.supportInvalidateOptionsMenu();
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class l implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f10241a;

        static {
            t2o.a(619708440);
            t2o.a(613417024);
        }

        public l(Context context) {
            if (context != null) {
                this.f10241a = new WeakReference<>(context);
            }
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            BrowserActivity browserActivity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (TextUtils.isEmpty(str)) {
                TLog.logd(BrowserActivity.TAG, "the groupName is empty!");
            } else if (str.equalsIgnoreCase("WindVane") && (browserActivity = (BrowserActivity) this.f10241a.get()) != null) {
                BrowserActivity.access$000(browserActivity);
            }
        }
    }

    static {
        t2o.a(619708420);
    }

    public static /* synthetic */ void access$000(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b55449", new Object[]{browserActivity});
        } else {
            browserActivity.updateOrangeConfigs();
        }
    }

    public static /* synthetic */ String access$100(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9af466d6", new Object[]{browserActivity});
        }
        return browserActivity.originalurl;
    }

    public static /* synthetic */ boolean access$1000(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6795fc", new Object[]{browserActivity})).booleanValue();
        }
        return browserActivity.mAutoShowNavbar;
    }

    public static /* synthetic */ String access$1102(BrowserActivity browserActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebdeeb7b", new Object[]{browserActivity, str});
        }
        browserActivity.mFavorIcon = str;
        return str;
    }

    public static /* synthetic */ void access$1200(BrowserActivity browserActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4b72c4", new Object[]{browserActivity, str});
        } else {
            browserActivity.checkFavoriteState(str);
        }
    }

    public static /* synthetic */ String access$1302(BrowserActivity browserActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1de18eb9", new Object[]{browserActivity, str});
        }
        browserActivity.mFavorText = str;
        return str;
    }

    public static /* synthetic */ boolean access$200(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b3831cf", new Object[]{browserActivity})).booleanValue();
        }
        return browserActivity.isUCCorePreparedCallback;
    }

    public static /* synthetic */ boolean access$202(BrowserActivity browserActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a9924ab", new Object[]{browserActivity, new Boolean(z)})).booleanValue();
        }
        browserActivity.isUCCorePreparedCallback = z;
        return z;
    }

    public static /* synthetic */ void access$300(BrowserActivity browserActivity, mdd mddVar, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff5a70d", new Object[]{browserActivity, mddVar, bundle});
        } else {
            browserActivity.doOnCreateLater(mddVar, bundle);
        }
    }

    public static /* synthetic */ BrowserHybridWebView access$400(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserHybridWebView) ipChange.ipc$dispatch("a7460dcf", new Object[]{browserActivity});
        }
        return browserActivity.browserWebView;
    }

    public static /* synthetic */ m access$500(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("98c2f079", new Object[]{browserActivity});
        }
        return browserActivity.mRumBizSpan;
    }

    public static /* synthetic */ m access$502(BrowserActivity browserActivity, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("60c455a6", new Object[]{browserActivity, mVar});
        }
        browserActivity.mRumBizSpan = mVar;
        return mVar;
    }

    public static /* synthetic */ Bitmap access$600(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ca347ead", new Object[]{browserActivity});
        }
        return browserActivity.bitmap;
    }

    public static /* synthetic */ Bitmap access$602(BrowserActivity browserActivity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fd54dc5b", new Object[]{browserActivity, bitmap});
        }
        browserActivity.bitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ boolean access$702(BrowserActivity browserActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9373386", new Object[]{browserActivity, new Boolean(z)})).booleanValue();
        }
        browserActivity.isHookNativeBackByJs = z;
        return z;
    }

    public static /* synthetic */ ActionBarMenuItem access$800(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBarMenuItem) ipChange.ipc$dispatch("a76e9f7d", new Object[]{browserActivity});
        }
        return browserActivity.menuItemTitle;
    }

    public static /* synthetic */ WVCallBackContext access$900(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("cd3ffbc1", new Object[]{browserActivity});
        }
        return browserActivity.wvContext;
    }

    private void checkFavoriteState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e58efe", new Object[]{this, str});
            return;
        }
        JSONObject c2 = mrw.b().c();
        if (!Login.checkSessionValid() || !c2.has("WV.Meta.Favorite.Image")) {
            v7t.a(TAG_FAV, "未登录或者不包含Image Meta");
            this.mFavorIcon = to8.FAVOR;
            return;
        }
        int optInt = c2.optInt("WV.Meta.Favorite.BizId", 11);
        c29.m(this).p(optInt, 0L, str, true, new FavContentCallBack(str, FavType.IsFavorite));
        v7t.a(TAG_FAV, "into--[checkFavoriteState] bizId:" + optInt + " feedId:0 contentUrl:" + str + " showToast:true");
    }

    private Uri getH5UriFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a9e484e6", new Object[]{this, intent});
        }
        try {
            String queryParameter = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            String queryParameter2 = Uri.parse(queryParameter).getQueryParameter("u");
            if (!TextUtils.isEmpty(queryParameter2) && Uri.parse(queryParameter2).isHierarchical()) {
                queryParameter = queryParameter2;
            }
            return Uri.parse(queryParameter);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private String getH5UrlFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719ec354", new Object[]{this, intent});
        }
        String str = null;
        try {
            epo epoVar = this.mHandle;
            if (epoVar != null) {
                epoVar.removeMessages(m7r.GO_TO_HOME);
            }
            str = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            v7t.a(TAG, "getH5UrlFromAfc url=" + str);
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    private static String getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b12904a8", new Object[0]);
        }
        return "BA_" + browserActivityID;
    }

    private void getMetaInfo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe96f9a", new Object[]{this, str});
            return;
        }
        String p = BrowserUtil.p();
        if (p != null) {
            this.hideShareItem = BrowserUtil.c(str);
            final WeakReference weakReference = new WeakReference(this);
            this.browserWebView.evaluateJavascript("(function(){var e=document.getElementsByName('unique-bizid')[0];return (e&&e.getAttribute('content'))||''})()", new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            if (str2.startsWith("\"") && str2.endsWith("\"")) {
                                str2 = str2.substring(1, str2.length() - 1);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                knj.c(str2, weakReference);
                                knj.b(str2, weakReference);
                            }
                        }
                    } catch (Exception e2) {
                        v7t.d(BrowserActivity.TAG, "uniqueMeta parse error : " + e2.getMessage());
                    }
                }
            });
            this.browserWebView.evaluateJavascript(p, new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str2) {
                    boolean z = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    mrw.b().e(str2);
                    JSONObject c2 = mrw.b().c();
                    if (c2 != null) {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put("metaData", c2.toString());
                            BrowserUtil.b(BrowserActivity.TAG, uqx.ZIM_IDENTIFY_GET_META_INFO, null, str, hashMap);
                        } catch (Exception unused) {
                        }
                        boolean z2 = BrowserActivity.this.getSupportActionBar() != null && BrowserActivity.this.getSupportActionBar().isShowing();
                        if (c2.has("WV.Meta.Nav.HideNavBar")) {
                            String optString = c2.optString("WV.Meta.Nav.HideNavBar", "false");
                            if (!"true".equals(optString) && !"HideStatusBar".equals(optString)) {
                                z = false;
                            }
                            if (z && z2) {
                                BrowserActivity.this.getSupportActionBar().hide();
                            } else if (!z2 && !z && BrowserActivity.this.getSupportActionBar() != null) {
                                BrowserActivity.this.getSupportActionBar().show();
                            }
                        } else if (!z2 && BrowserActivity.access$1000(BrowserActivity.this)) {
                            try {
                                Uri parse = Uri.parse(str);
                                if (!(parse == null || BrowserUtil.e(parse) || BrowserActivity.this.getSupportActionBar() == null)) {
                                    BrowserActivity.this.getSupportActionBar().show();
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        BrowserActivity.access$1102(BrowserActivity.this, to8.FAVOR);
                        BrowserActivity.access$1200(BrowserActivity.this, str);
                        BrowserActivity.this.supportInvalidateOptionsMenu();
                        if (!c2.has("WV.Meta.StopSaveImage") || !"true".equalsIgnoreCase(c2.optString("WV.Meta.StopSaveImage"))) {
                            try {
                                View.OnLongClickListener longClickListener = BrowserActivity.access$400(BrowserActivity.this).getLongClickListener();
                                if (BrowserActivity.access$400(BrowserActivity.this) != null) {
                                    BrowserActivity.access$400(BrowserActivity.this).setOnLongClickListener(longClickListener);
                                    v7t.a(BrowserActivity.TAG, "reset SaveImage");
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else if (BrowserActivity.access$400(BrowserActivity.this) != null) {
                            BrowserActivity.access$400(BrowserActivity.this).setOnLongClickListener(null);
                            v7t.a(BrowserActivity.TAG, "StopSaveImage");
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getUrlReferer(java.lang.String r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "weex_original_url"
            java.lang.String r1 = "BrowserActivity"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.browser.BrowserActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.String r0 = "df2dbde"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r6
            r3 = 1
            r1[r3] = r7
            r7 = 2
            r1[r7] = r8
            java.lang.Object r7 = r2.ipc$dispatch(r0, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0020:
            java.lang.String r2 = "getUrlReferer"
            r3 = 0
            android.os.Bundle r4 = r8.getExtras()     // Catch: Exception -> 0x005a
            if (r4 == 0) goto L_0x005f
            boolean r4 = r8.hasExtra(r0)     // Catch: Exception -> 0x005a
            if (r4 == 0) goto L_0x0042
            android.os.Bundle r8 = r8.getExtras()     // Catch: Exception -> 0x005a
            java.lang.Object r8 = r8.get(r0)     // Catch: Exception -> 0x005a
            java.lang.String r8 = (java.lang.String) r8     // Catch: Exception -> 0x005a
            java.lang.String r0 = "bundle_has_weex_origin_url"
            com.taobao.browser.utils.BrowserUtil.b(r1, r2, r0, r8, r3)     // Catch: Exception -> 0x0040
        L_0x003e:
            r3 = r8
            goto L_0x005f
        L_0x0040:
            r3 = r8
            goto L_0x005a
        L_0x0042:
            android.os.Bundle r8 = r8.getExtras()     // Catch: Exception -> 0x005a
            java.lang.String r0 = "URL_REFERER_ORIGIN"
            java.lang.Object r8 = r8.get(r0)     // Catch: Exception -> 0x005a
            java.lang.String r8 = (java.lang.String) r8     // Catch: Exception -> 0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x0040
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "bundle_has_referer_origin_url"
            com.taobao.browser.utils.BrowserUtil.b(r1, r2, r0, r8, r3)     // Catch: Exception -> 0x0040
            goto L_0x003e
        L_0x005a:
            java.lang.String r8 = "error extras"
            com.taobao.tao.log.TLog.loge(r1, r8)
        L_0x005f:
            if (r3 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r7 = r3
        L_0x0063:
            tb.qsw r8 = tb.psw.a()
            if (r8 != 0) goto L_0x0071
            android.taobao.windvane.extra.WVSchemeProcessor r8 = new android.taobao.windvane.extra.WVSchemeProcessor
            r8.<init>()
            tb.psw.b(r8)
        L_0x0071:
            java.lang.String r0 = r8.dealUrlScheme(r7)
            if (r7 == 0) goto L_0x0094
            boolean r3 = r7.equals(r0)
            if (r3 != 0) goto L_0x0094
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r0 == 0) goto L_0x0086
            r4 = r0
            goto L_0x0088
        L_0x0086:
            java.lang.String r4 = ""
        L_0x0088:
            java.lang.String r5 = "new_url"
            r3.put(r5, r4)
            java.lang.String r4 = "wvscheme_url_not_equal"
            com.taobao.browser.utils.BrowserUtil.b(r1, r2, r4, r7, r3)
        L_0x0094:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "intercepted by ["
            r2.<init>(r3)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r2.append(r8)
            java.lang.String r8 = "],origin_url=["
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = "], new_url=["
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = "]"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.taobao.tao.log.TLog.loge(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.BrowserActivity.getUrlReferer(java.lang.String, android.content.Intent):java.lang.String");
    }

    private void hiddenFlowBar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6c6f4c", new Object[]{this, str});
            return;
        }
        RelativeLayout relativeLayout = this.flowBarMap.get(str);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        if (this.flowBarMap.containsKey(str)) {
            this.flowBarMap.remove(str);
        }
        if (relativeLayout != null && relativeLayout.getParent() != null) {
            viewGroup.removeView(relativeLayout);
        }
    }

    private void hiddenTabBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4c30f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        RelativeLayout relativeLayout = this.mTabBarLayout;
        if (relativeLayout != null && relativeLayout.getParent() != null) {
            viewGroup.removeView(this.mTabBarLayout);
            this.mTabBarLayout = null;
        }
    }

    public static void hideLoadingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395c4f09", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserActivity browserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserActivity");
        }
    }

    private String preBrowserFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6595bcb2", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            v7t.n(TAG, "originalurl is null, and finish activity.");
            epo epoVar = this.mHandle;
            if (epoVar != null) {
                epoVar.sendEmptyMessage(900);
            }
            return null;
        }
        UrlpreLoadFilter urlpreLoadFilter = new UrlpreLoadFilter(this, getIntent(), this.mHandle, this.browserWebView);
        String preloadURL = urlpreLoadFilter.preloadURL(str, getIntent());
        if (preloadURL == null) {
            this.browserWebView.loadUrl(str);
            v7t.n(TAG, "UrlpreLoadFilter result is null, and call superLoadUrl.");
            return null;
        } else if (urlpreLoadFilter.filtrate(preloadURL)) {
            return null;
        } else {
            return preloadURL;
        }
    }

    private void reportRum(BrowserHybridWebView browserHybridWebView) {
        tz8 tz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda61a35", new Object[]{this, browserHybridWebView});
        } else if (browserHybridWebView != null && fm2.commonConfig.B && (tz8Var = FalcoGlobalTracer.get()) != null) {
            tz8Var.j(new i());
            browserHybridWebView.getWebViewContext().addWebViewPageModel(new j(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        }
    }

    private void resetStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75beed29", new Object[]{this});
        } else {
            FestivalMgr.i().D(this, TBActionBar.ActionBarStyle.NORMAL, true);
        }
    }

    private void setDounble11Style(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d57bad", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (!str.equals("festivalWithRainbowLine")) {
                if (str.equals("festival")) {
                    z = false;
                } else {
                    resetStyle();
                    return;
                }
            }
            useDounble11Style(z);
        }
    }

    private void showFlowBar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e5f6d9", new Object[]{this, str});
            return;
        }
        FlowBar flowBar = new FlowBar(this);
        String init = flowBar.init(str);
        if (this.flowBarMap.containsKey(init)) {
            hiddenFlowBar(init);
        }
        RelativeLayout createLayout = flowBar.createLayout();
        ((ViewGroup) findViewById(16908290)).addView(createLayout);
        this.flowBarMap.put(init, createLayout);
    }

    private void showTabBar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9ec", new Object[]{this, str});
        } else if (this.mTabBarLayout == null) {
            TabBar tabBar = new TabBar(this);
            tabBar.init(str, this.wvContext);
            this.mTabBarLayout = tabBar.createLayout();
            ((ViewGroup) findViewById(16908290)).addView(this.mTabBarLayout);
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

    private void updateOrangeConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d54a1", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_ALLOW_OPEN_CLIENT, "0");
        OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_QUIT_WEBVIEW_DIRECTLY_LIST, "");
        OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_NO_META_PAGE_LIST, "");
        OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_THIRD_MIDDLE_JUMP_REGEX, "");
    }

    private void useDounble11Style(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bdf854c", new Object[]{this, new Boolean(z)});
        } else {
            FestivalMgr.i().D(this, TBActionBar.ActionBarStyle.NORMAL, false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!(motionEvent == null || motionEvent.getAction() != 0 || this.browserWebView == null)) {
            mol.b().g(this.mActivityHashCode, this.browserWebView.getOriginalUrl());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (disableTransition()) {
            overridePendingTransition(0, 0);
        }
    }

    public String getAllowOpenClientFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a68d0745", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_ALLOW_OPEN_CLIENT, "0");
    }

    @Deprecated
    public epo getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epo) ipChange.ipc$dispatch("27d8787b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String q = BrowserUtil.q(Thread.currentThread().getStackTrace());
        if (!TextUtils.isEmpty(q)) {
            hashMap.put("call_stack", q);
        }
        BrowserUtil.b(TAG, "getHandler", null, this.url, hashMap);
        return this.mHandle;
    }

    public String getNoMetaPageList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a6ac450", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_NO_META_PAGE_LIST, "");
    }

    public String getQuitWebViewDirectlyList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4481f51", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_QUIT_WEBVIEW_DIRECTLY_LIST, "");
    }

    public String getThirdMiddleJumpRegex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9c7a226", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_THIRD_MIDDLE_JUMP_REGEX, "");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        BrowserHybridWebView browserHybridWebView;
        String str;
        String queryParameter;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i2 = message.what;
        if (i2 == 59) {
            AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.HANDLER_WHAT_FILTERURLSID", 1.0d);
            this.browserWebView.loadUrl((String) message.obj);
            return true;
        } else if (i2 == 88) {
            Intent intent = getIntent();
            intent.putExtra("data", (String) message.obj);
            setResult(-1, intent);
            if (this.browserWebView.back()) {
                return true;
            }
            finish();
            overridePendingTransition(R.anim.activity_push_right_in, R.anim.push_right_out);
            return true;
        } else if (i2 == 136) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj)));
                return true;
            } catch (ActivityNotFoundException unused) {
                Toast makeText = Toast.makeText(this, "对不起，您的设备找不到相应程序", 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                return true;
            }
        } else if (i2 == 900) {
            finish();
            if (disableTransition()) {
                return true;
            }
            overridePendingTransition(R.anim.activity_push_right_in, R.anim.push_right_out);
            return true;
        } else if (i2 == 1001) {
            AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOBAO_BIND_CARD", 1.0d);
            Intent intent2 = new Intent();
            intent2.setAction("com.taobao.tao.mytaobao.bindcard");
            intent2.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
            intent2.setPackage("com.taobao.taobao");
            Bundle bundle = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(message.getData().getString("data"));
                bundle.putInt("fromSource", Integer.valueOf(jSONObject.getString("fromSource")).intValue());
                bundle.putBoolean("bind_card_switch", jSONObject.getBoolean("bind_card_switch"));
                bundle.putString("user_id", jSONObject.getString("user_id"));
            } catch (Exception unused2) {
            }
            intent2.putExtras(bundle);
            try {
                startActivityForResult(intent2, 1001);
                return true;
            } catch (Exception e2) {
                v7t.i(TAG, "start BindCardActivity failed: " + e2.toString());
                return true;
            }
        } else if (i2 != 1003) {
            Bundle bundle2 = null;
            switch (i2) {
                case 400:
                    k7r.b("exchain.FullTrace", "BrowserActivity.NOTIFY_PAGE_START: " + System.currentTimeMillis());
                    TBProgressBar tBProgressBar = this.progressbar;
                    if (tBProgressBar != null) {
                        tBProgressBar.resetProgress();
                    }
                    this.hideShareItem = false;
                    this.hideUserHelperItem = false;
                    if (this.isAutoResetMenu) {
                        togglePublicMenu(true);
                        this.isAutoResetMenu = false;
                    }
                    this.useDounble11Style = j9l.c("android_windvane_config", "defaultFestivalStyle", "festivalWithRainbowLine");
                    this.mFavorIcon = null;
                    this.mFavorText = "收藏";
                    mrw.b().a();
                    return true;
                case 401:
                    String str2 = (String) message.obj;
                    this.mYyzUrl = str2;
                    avv.b(this.className, str2, str2);
                    TBProgressBar tBProgressBar2 = this.progressbar;
                    if (tBProgressBar2 != null) {
                        tBProgressBar2.setCurrentProgress(100);
                    }
                    getMetaInfo(this.mYyzUrl);
                    Intent intent3 = getIntent();
                    intent3.putExtra("ActivityName", "BrowserActivity:" + gtw.i(this.mYyzUrl));
                    return true;
                case 402:
                    TBProgressBar tBProgressBar3 = this.progressbar;
                    if (tBProgressBar3 == null) {
                        return true;
                    }
                    tBProgressBar3.setCurrentProgress(100);
                    return true;
                default:
                    switch (i2) {
                        case 1102:
                            if (getIntent().hasExtra("isfrompushMsg")) {
                                Nav.from(getApplicationContext()).toUri("http://m.taobao.com/index.htm");
                            } else {
                                finish();
                            }
                            if (disableTransition()) {
                                return true;
                            }
                            overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                            return true;
                        case 1103:
                            BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
                            if (browserHybridWebView2 != null && this.hasCustomButton) {
                                browserHybridWebView2.loadUrl(m7r.f23827a);
                            }
                            BrowserUtil.u(this, this.browserWebView);
                            String noMetaPageList = getNoMetaPageList();
                            this.noMetaPageList = noMetaPageList;
                            if (TextUtils.isEmpty(noMetaPageList) || (browserHybridWebView = this.browserWebView) == null || !mov.b(this.noMetaPageList, browserHybridWebView.getCurrentUrl())) {
                                return true;
                            }
                            this.browserWebView.loadUrl(m7r.b);
                            return true;
                        case 1104:
                            BrowserUtil.b(TAG, "handleMessage", "get_title", null, null);
                            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem();
                            Object obj = message.obj;
                            if (obj instanceof Bundle) {
                                bundle2 = (Bundle) obj;
                                str = bundle2.getString("title");
                            } else {
                                str = (String) obj;
                            }
                            BrowserHybridWebView browserHybridWebView3 = this.browserWebView;
                            if (!(browserHybridWebView3 == null || browserHybridWebView3.getUrl() == null)) {
                                Uri parse = Uri.parse(this.browserWebView.getUrl());
                                if (parse.isHierarchical() && (queryParameter = parse.getQueryParameter("customtitle")) != null && !queryParameter.isEmpty()) {
                                    str = queryParameter;
                                }
                            }
                            if (!this.readTitle && message.arg1 != 111) {
                                str = " ";
                            }
                            if (!TextUtils.isEmpty(str)) {
                                actionBarMenuItem.setTitle(str);
                                this.menuItemTitle = actionBarMenuItem;
                                supportInvalidateOptionsMenu();
                                return true;
                            } else if (bundle2 == null || !bundle2.containsKey("icon")) {
                                actionBarMenuItem.setTitle(" ");
                                this.menuItemTitle = actionBarMenuItem;
                                return true;
                            } else {
                                Boolean bool = Boolean.FALSE;
                                String string = bundle2.getString("icon");
                                String string2 = bundle2.getString("iconType");
                                if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
                                    return true;
                                }
                                actionBarMenuItem.stretch = bundle2.getBoolean("stretch");
                                if (string2.equals("IconFont")) {
                                    if (actionBarMenuItem.setIconFontId(string) >= 0) {
                                        z = true;
                                    }
                                    bool = Boolean.valueOf(z);
                                } else if (string2.equals("Native")) {
                                    if (actionBarMenuItem.setIconResId(string) >= 0) {
                                        z = true;
                                    }
                                    bool = Boolean.valueOf(z);
                                } else if (string2.equals("Base64")) {
                                    bool = Boolean.valueOf(actionBarMenuItem.setIconBitmap(string, BrowserUtil.l(this)));
                                } else if (string2.equals(MonitorItemConstants.KEY_URL)) {
                                    actionBarMenuItem.href = string;
                                    bool = Boolean.TRUE;
                                }
                                if (!bool.booleanValue()) {
                                    return true;
                                }
                                this.menuItemTitle = actionBarMenuItem;
                                supportInvalidateOptionsMenu();
                                return true;
                            }
                        case 1105:
                            if (this.mAppLinkIsNewIntent) {
                                this.mAppLinkIsNewIntent = false;
                                return true;
                            }
                            Bundle data = message.getData();
                            if (!(data == null || data.getString("result") == null)) {
                                String string3 = data.getString("result");
                                Intent intent4 = new Intent();
                                intent4.setAction("Broadcast_Activity");
                                intent4.putExtra("result", string3);
                                intent4.setPackage(getPackageName());
                                getApplicationContext().sendBroadcast(intent4);
                            }
                            finish(!AfcLifeCycleCenter.isLauncherStart);
                            if (disableTransition()) {
                                return true;
                            }
                            overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                            return true;
                        default:
                            switch (i2) {
                                case 1108:
                                    Bundle bundle3 = (Bundle) message.obj;
                                    this.mlinkhref = bundle3.getString("linkhref");
                                    this.mlinkonclick = bundle3.getString("linkonclick");
                                    if (TextUtils.isEmpty(this.mlinkhref) && TextUtils.isEmpty(this.mlinkonclick)) {
                                        return true;
                                    }
                                    try {
                                        s0m.B().T(this.mlinkhref).succListener(new k()).fetch();
                                    } catch (Exception unused3) {
                                        return true;
                                    }
                                    break;
                                case 1109:
                                    Intent intent5 = new Intent();
                                    intent5.putExtra("data", (String) message.obj);
                                    setResult(1, intent5);
                                    finish();
                                    return true;
                                case m7r.ACTIONBAR_MENU_RIGHT /* 1110 */:
                                    Bundle bundle4 = (Bundle) message.obj;
                                    ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem();
                                    if (bundle4.getBoolean(m7r.ACTION_BAR_ITEM_HIDE, false)) {
                                        this.menuItemRight = null;
                                        supportInvalidateOptionsMenu();
                                        return true;
                                    }
                                    String string4 = bundle4.getString("title");
                                    if (!TextUtils.isEmpty(string4)) {
                                        actionBarMenuItem2.setTitle(string4);
                                        this.menuItemRight = actionBarMenuItem2;
                                        supportInvalidateOptionsMenu();
                                        return true;
                                    }
                                    String string5 = bundle4.getString("icon");
                                    if (!bundle4.getBoolean("fromNative")) {
                                        z = actionBarMenuItem2.setIconBitmap(string5, BrowserUtil.l(this));
                                    } else if (!bundle4.getBoolean("iconFont") ? actionBarMenuItem2.setIconResId(string5) >= 0 : actionBarMenuItem2.setIconFontId(string5) >= 0) {
                                        z = true;
                                    }
                                    if (!z) {
                                        return true;
                                    }
                                    this.menuItemRight = actionBarMenuItem2;
                                    supportInvalidateOptionsMenu();
                                    return true;
                                case m7r.ACTIONBAR_MENU_LIST /* 1111 */:
                                    List<ActionBarMenuItem> list = this.menuItemList;
                                    if (list == null) {
                                        this.menuItemList = new ArrayList();
                                    } else {
                                        list.clear();
                                    }
                                    Bundle bundle5 = (Bundle) message.obj;
                                    if (!bundle5.getBoolean(m7r.ACTION_BAR_ITEM_HIDE, false)) {
                                        String string6 = bundle5.getString("param");
                                        try {
                                            JSONArray optJSONArray = new JSONObject(string6).optJSONArray("items");
                                            if (optJSONArray != null) {
                                                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                                                    ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem();
                                                    String optString = optJSONObject.optString("text");
                                                    if (!TextUtils.isEmpty(optString)) {
                                                        actionBarMenuItem3.title = optString;
                                                        boolean optBoolean = optJSONObject.optBoolean("fromNative", false);
                                                        boolean optBoolean2 = optJSONObject.optBoolean("iconFont", false);
                                                        String optString2 = optJSONObject.optString("icon");
                                                        if (!optBoolean) {
                                                            actionBarMenuItem3.setIconBitmap(optString2, BrowserUtil.l(this));
                                                        } else if (optBoolean2) {
                                                            actionBarMenuItem3.setIconFontId(optString2);
                                                        } else {
                                                            actionBarMenuItem3.setIconResId(optString2);
                                                        }
                                                        Intent intent6 = new Intent();
                                                        actionBarMenuItem3.data = intent6;
                                                        intent6.putExtra("index", i3);
                                                        this.menuItemList.add(actionBarMenuItem3);
                                                    }
                                                }
                                            }
                                        } catch (JSONException unused4) {
                                            v7t.d(TAG, "actionbar_menu_list parse param error, param: " + string6);
                                            return true;
                                        }
                                    }
                                    supportInvalidateOptionsMenu();
                                    return true;
                                case m7r.ACTIONBAR_ADDTODESKTOP /* 1112 */:
                                    Bundle bundle6 = (Bundle) message.obj;
                                    if (bundle6.getBoolean(m7r.ACTION_BAR_ITEM_HIDE, false)) {
                                        this.isaddDesktop = false;
                                    } else {
                                        this.shortcut_title = bundle6.getString("title");
                                        this.shortcut_icon = bundle6.getString("icon");
                                        this.shortcut_url = bundle6.getString("url");
                                        this.shortcut_buttonText = bundle6.getString("buttonText");
                                        byte[] byteArray = bundle6.getByteArray(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                                        this.shortcut_bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                                        this.isaddDesktop = true;
                                    }
                                    supportInvalidateOptionsMenu();
                                    return true;
                                default:
                                    switch (i2) {
                                        case m7r.TRADE_SETINFO /* 1114 */:
                                            Intent intent7 = new Intent();
                                            intent7.putExtra("data", (String) message.obj);
                                            setResult(1, intent7);
                                            finish();
                                            return true;
                                        case m7r.SHOW_FLOWBAR /* 1115 */:
                                            Bundle data2 = message.getData();
                                            if (data2 == null || data2.getString("params") == null) {
                                                return true;
                                            }
                                            showFlowBar(data2.getString("params"));
                                            return true;
                                        case m7r.SHOW_TABBAR /* 1116 */:
                                            Bundle data3 = message.getData();
                                            if (data3 == null || data3.getString("params") == null) {
                                                return true;
                                            }
                                            showTabBar(data3.getString("params"));
                                            return true;
                                        case m7r.HIDDEN_FLOWBAR /* 1117 */:
                                            Bundle data4 = message.getData();
                                            if (data4 == null || data4.getString("params") == null) {
                                                return true;
                                            }
                                            hiddenFlowBar(data4.getString("params"));
                                            return true;
                                        case m7r.HIDDEN_TABBAR /* 1118 */:
                                            hiddenTabBar();
                                            return true;
                                        case m7r.FULL_SCREEN /* 1119 */:
                                            if (!((Boolean) message.obj).booleanValue()) {
                                                return true;
                                            }
                                            knj.d(this, Uri.parse(this.browserWebView.getUrl()), false);
                                            return true;
                                        case m7r.HIDDEN_NAVBAR /* 1120 */:
                                            String str3 = (String) message.obj;
                                            if (getSupportActionBar() == null) {
                                                return true;
                                            }
                                            if ("1".equals(str3)) {
                                                getSupportActionBar().hide();
                                                this.mAutoShowNavbar = false;
                                                return true;
                                            } else if ("2".equals(str3)) {
                                                getSupportActionBar().hide();
                                                return true;
                                            } else {
                                                getSupportActionBar().show();
                                                this.mAutoShowNavbar = true;
                                                return true;
                                            }
                                        case 1121:
                                            this.isHookNativeBack = true;
                                            return true;
                                        case m7r.TRADE_SELFPICKUP /* 1122 */:
                                            Intent intent8 = new Intent();
                                            intent8.putExtra("data", (String) message.obj);
                                            setResult(9876, intent8);
                                            finish();
                                            return true;
                                        case m7r.HIDE_DEAFAULT_MORE_ITEM /* 1123 */:
                                            if (!((Bundle) message.obj).getBoolean(m7r.ACTION_BAR_ITEM_USER_HELPER_HIDE, false)) {
                                                return true;
                                            }
                                            this.hideUserHelperItem = true;
                                            supportInvalidateOptionsMenu();
                                            return true;
                                        case m7r.FESTIVAL_STYLE /* 1124 */:
                                            this.useDounble11Style = (String) message.obj;
                                            supportInvalidateOptionsMenu();
                                            return true;
                                        default:
                                            switch (i2) {
                                                case m7r.WEBVIEW_PROGRESS_CHANGE /* 1126 */:
                                                    TBProgressBar tBProgressBar4 = this.progressbar;
                                                    if (tBProgressBar4 == null) {
                                                        return true;
                                                    }
                                                    tBProgressBar4.setCurrentProgress(message.arg1);
                                                    return true;
                                                case m7r.ACTIONBAR_MENU_SECOND_RIGHT /* 1127 */:
                                                    Bundle bundle7 = (Bundle) message.obj;
                                                    ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem();
                                                    if (bundle7.getBoolean(m7r.ACTION_BAR_ITEM_HIDE, false)) {
                                                        this.menuItemSecondRight = null;
                                                        supportInvalidateOptionsMenu();
                                                        return true;
                                                    }
                                                    String string7 = bundle7.getString("title");
                                                    if (!TextUtils.isEmpty(string7)) {
                                                        actionBarMenuItem4.setTitle(string7);
                                                        this.menuItemSecondRight = actionBarMenuItem4;
                                                        supportInvalidateOptionsMenu();
                                                        return true;
                                                    }
                                                    String string8 = bundle7.getString("icon");
                                                    if (!bundle7.getBoolean("fromNative")) {
                                                        z = actionBarMenuItem4.setIconBitmap(string8, BrowserUtil.l(this));
                                                    } else if (!bundle7.getBoolean("iconFont") ? actionBarMenuItem4.setIconResId(string8) >= 0 : actionBarMenuItem4.setIconFontId(string8) >= 0) {
                                                        z = true;
                                                    }
                                                    if (!z) {
                                                        return true;
                                                    }
                                                    this.menuItemSecondRight = actionBarMenuItem4;
                                                    supportInvalidateOptionsMenu();
                                                    return true;
                                                case m7r.ACTIONBAR_HAS_MENU /* 1128 */:
                                                    Bundle bundle8 = (Bundle) message.obj;
                                                    if (bundle8 == null) {
                                                        return true;
                                                    }
                                                    boolean z2 = bundle8.getBoolean("hasMenu");
                                                    this.isAutoResetMenu = bundle8.getBoolean("autoReset");
                                                    togglePublicMenu(z2);
                                                    supportInvalidateOptionsMenu();
                                                    return true;
                                                case m7r.SPLASH_HIDE /* 1129 */:
                                                    v7t.a(TAG, "splash hide");
                                                    try {
                                                        SplashFragment.dismiss(getSupportFragmentManager());
                                                        return true;
                                                    } catch (Throwable th) {
                                                        th.printStackTrace();
                                                        return true;
                                                    }
                                                case m7r.GO_TO_HOME /* 1130 */:
                                                    v7t.a(TAG, "go to home");
                                                    try {
                                                        SplashFragment.dismiss(getSupportFragmentManager());
                                                        Nav.from(this).withExtras(null).disableTransition().withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).toUri("http://m.taobao.com/index.htm");
                                                        y71.commitFail(MONITOR_POINT_TIME_OUT_GO_TO_HOME, 1, "TIMEOUT,go to home", this.url);
                                                        if (!fm2.commonConfig.f) {
                                                            return true;
                                                        }
                                                        finish(true);
                                                        return true;
                                                    } catch (Throwable th2) {
                                                        th2.printStackTrace();
                                                        return true;
                                                    }
                                                case m7r.HIDE_LOADING_DIALOG /* 1131 */:
                                                    hideLoadingDialog();
                                                    return true;
                                                default:
                                                    return true;
                                            }
                                    }
                            }
                    }
            }
        } else {
            AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOIAOPU_BIND_CARD", 1.0d);
            Intent intent9 = new Intent();
            intent9.setAction("com.taobao.tao.mytaobao.bindcard");
            intent9.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
            Bundle bundle9 = new Bundle();
            try {
                JSONObject jSONObject2 = new JSONObject(message.getData().getString("data"));
                bundle9.putInt("fromSource", Integer.valueOf(jSONObject2.getString("fromSource")).intValue());
                bundle9.putBoolean("bind_card_switch", jSONObject2.getBoolean("bind_card_switch"));
                bundle9.putString("user_id", jSONObject2.getString("user_id"));
                bundle9.putString("tb_user_id", jSONObject2.getString("tb_user_id"));
            } catch (Exception unused5) {
            }
            intent9.putExtras(bundle9);
            try {
                startActivityForResult(intent9, 1003);
                return true;
            } catch (Exception e3) {
                v7t.i(TAG, "start BindCardActivity failed: " + e3.toString());
                return true;
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return this.statusImmersive;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        super.onActivityResult(i2, i3, intent);
        this.browserWebView.onActivityResult(i2, i3, intent);
        if (i2 == 7000 && intent != null) {
            try {
                this.browserWebView.setDataOnActive(intent.getStringExtra("data"));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        TBProgressBar tBProgressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        super.onAttachedToWindow();
        if (this.browserWebView != null) {
            enableH5Progress();
            if (this.browserWebView.isPreRender() && (tBProgressBar = this.progressbar) != null) {
                tBProgressBar.setCurrentProgress(this.browserWebView.getProgress());
            }
            k7r.b("exchain.FullTrace", "BrowserActivity.onAttachedToWindow end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        mdd e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (fm2.commonConfig.s && ABGlobal.isFeatureOpened(this, "disable_fragment_restore") && bundle != null && intent != null && intent.getBooleanExtra("afc_nav_merge", false)) {
            try {
                px9.a(bundle);
                BrowserUtil.b(TAG, BrowserUtil.b, "disable_fragment_restore", this.originalurl, null);
            } catch (Exception unused) {
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.onCreateTime = currentTimeMillis;
        this.start = currentTimeMillis;
        if (fm2.commonConfig.x && (e2 = vxm.b.e()) != null && e2.isAlive()) {
            e2.j("H5_containerStart", SystemClock.uptimeMillis());
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            uy8 d2 = tz8Var.d(TAG, "H5display").d();
            this.businessSpan = d2;
            this.openTracingContextMap = tz8Var.c(d2.a());
        }
        w0a.a(this.businessSpan, "H5_initContainer");
        k7r.b("exchain.FullTrace", "BrowserActivity.onCreate start time: " + this.onCreateTime);
        updateID();
        lcn.a(RVLLevel.Error, TAG).k("H5_initContainer", getID()).n(this.onCreateTime).f();
        d8s.a().f(getClass().getName());
        b2i.b().c("onCreate start");
        fm2.b().c();
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this, UTPageStatus.UT_H5_IN_WebView);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        String str = BrowserUtil.b;
        String dataString = intent.getDataString();
        this.originalurl = dataString;
        if (TextUtils.isEmpty(dataString)) {
            BrowserUtil.b(TAG, str, "intent_url_empty", null, null);
            try {
                String stringExtra = getIntent().getStringExtra(Constants.MYBROWSERURL);
                this.originalurl = stringExtra;
                if (stringExtra != null) {
                    BrowserUtil.b(TAG, str, "intent_has_myborwser_url", stringExtra, null);
                }
            } catch (Exception unused2) {
                v7t.d(TAG, "fail to get intent data");
            }
        }
        try {
            AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "PageCreate", this.originalurl, 1.0d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (TextUtils.isEmpty(this.originalurl)) {
            super.onCreate(bundle);
            v7t.n(TAG, "originalurl is null, and finish activity.");
            finish();
            return;
        }
        String trim = this.originalurl.trim();
        this.originalurl = trim;
        this.url = trim;
        String urlReferer = getUrlReferer(trim, intent);
        if (urlReferer != null) {
            this.originalurl = urlReferer;
        }
        this._uri = Uri.parse(this.originalurl);
        if (!eqw.c().d()) {
            b2i.b().c("init domain config");
            eqw.c().e();
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.dealURL cost time: " + (System.currentTimeMillis() - this.start));
        this.start = System.currentTimeMillis();
        try {
            bundle2 = intent.getExtras();
        } catch (Exception unused3) {
            v7t.d(TAG, "fail to get intent extras");
            bundle2 = null;
        }
        this.isHideTitle = false;
        this.isPostUrl = false;
        if (bundle2 != null) {
            this.isHideTitle = bundle2.getBoolean(Constants.MYBROWSERHIDETITLE, false);
            boolean z = bundle2.getBoolean("is_refund_order_url", false);
            this.isRefundOrderUrl = z;
            if (z) {
                BrowserUtil.b(TAG, str, "bundle_isRefundOrderUrl", this.originalurl, null);
            }
            String string = bundle2.getString("bizOrderId");
            this.orderId = string;
            if (!TextUtils.isEmpty(string)) {
                HashMap hashMap = new HashMap();
                hashMap.put("orderId", this.orderId);
                BrowserUtil.b(TAG, str, "bundle_has_orderId", this.originalurl, hashMap);
            }
            boolean z2 = bundle2.getBoolean("alloweWebViewHistoryBack", true);
            this.alloweWebViewHistoryBack = z2;
            if (!z2) {
                BrowserUtil.b(TAG, str, "bundle_not_alloweWebViewHistoryBack", this.originalurl, null);
            }
            boolean z3 = bundle2.getBoolean("SAVE_FORMAT_DATA", true);
            this.saveFormatData = z3;
            if (!z3) {
                BrowserUtil.b(TAG, str, "bundle_not_SAVE_FORMAT_DATA", this.originalurl, null);
            }
            boolean z4 = bundle2.getBoolean("isPostUrl", false);
            this.isPostUrl = z4;
            if (z4) {
                BrowserUtil.b(TAG, str, "bundle_isPostUrl", this.originalurl, null);
            }
        }
        Uri uri = this._uri;
        if (uri != null && uri.isHierarchical()) {
            if (!this.isHideTitle) {
                this.isHideTitle = BrowserUtil.e(this._uri);
            }
            String queryParameter = this._uri.getQueryParameter("hasCustomButton");
            if (queryParameter != null && "true".equals(queryParameter.trim())) {
                BrowserUtil.b(TAG, str, "query_hasCustomButton", this.originalurl, null);
                this.hasCustomButton = true;
            }
            this.statusImmersive = this._uri.getBooleanQueryParameter("status_bar_transparent", false);
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.dealBundle cost time: " + (System.currentTimeMillis() - this.start));
        this.start = System.currentTimeMillis();
        b2i.b().c("super.onCreate start");
        setTheme(R.style.Theme_BrowserActivity);
        super.onCreate(bundle);
        k7r.b("exchain.FullTrace", "BrowserActivity.superOnCreate cost time: " + (System.currentTimeMillis() - this.start));
        this.start = System.currentTimeMillis();
        getAllowOpenClientFlag();
        getQuitWebViewDirectlyList();
        getNoMetaPageList();
        getThirdMiddleJumpRegex();
        k7r.b("exchain.FullTrace", "BrowserActivity.ObtainOrange cost time: " + (System.currentTimeMillis() - this.start));
        b2i.b().c("ObtainOrange start");
        this.start = System.currentTimeMillis();
        getWindow().setFormat(-3);
        k7r.b("exchain.FullTrace", "BrowserActivity.InflateLayout cost time: " + (System.currentTimeMillis() - this.start));
        this.webViewStart = System.currentTimeMillis();
        this.mHandle = new epo(this, this);
        boolean z5 = vpw.commonConfig.e;
        if (BrowserUtil.g(this._uri)) {
            BrowserUtil.b(TAG, str, "query_wvUseSystemWebView", this.originalurl, null);
            y71.commitFail("wvUseSysWebView", 1, "wvUseSysWebView", this.originalurl);
            z5 = true;
        }
        WVUCWebView.setUseSystemWebView(z5);
        if (this.originalurl.contains("waitUCPrepared=true")) {
            BrowserUtil.b(TAG, str, "query_waitUCPrepare", this.originalurl, null);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            lqw.d().b(new e(this, countDownLatch));
            if (z5 || WVCore.getInstance().isUCSupport()) {
                v7t.i("WVUCWebView", "need not wait");
            } else {
                v7t.i("WVUCWebView", "need wait");
                try {
                    countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
        }
        k7r.b("exchain.FullTrace", "init webveiw start: " + this.webViewStart);
        lcn.a(RVLLevel.Error, TAG).k("H5_initWebview", getID()).n(this.webViewStart).f();
        b2i.b().c("init webveiw start");
        TLog.logi("WVUCWebView", "use uc core = [" + WVCore.getInstance().isUCSupport() + "]");
        this.loaded = false;
        mdd a2 = vxm.b.a(this);
        a2.i("containerInit", avt.a(this.onCreateTime), avt.a(System.currentTimeMillis()));
        a2.v("webviewInit");
        w0a.a(this.businessSpan, "H5_initWebview");
        if (WVCore.getInstance().isUCSupport()) {
            try {
                this.browserWebView = vmm.a().getPreRender(this.originalurl, this);
            } catch (Throwable unused4) {
            }
            if (this.browserWebView != null) {
                this.loaded = true;
                v7t.d(vmm.TAG, "getPreRender by key=[" + this.originalurl + "] success");
            } else if (!z5) {
                this.browserWebView = vmm.a().getPreWeb();
                vmm.a();
                vmm.b(this);
                v7t.d(vmm.TAG, "getPreRender by key=[" + this.originalurl + "] failed");
            }
        }
        if (intent.hasExtra("BizId")) {
            try {
                String stringExtra2 = intent.getStringExtra("BizId");
                WVUCWebView.setBizCode(stringExtra2);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("BizId", stringExtra2);
                BrowserUtil.b(TAG, str, "intent_has_bizId", this.originalurl, hashMap2);
            } catch (Exception e5) {
                v7t.d(TAG, e5.getMessage());
            }
        }
        this.isAfcMergeOpenH5 = false;
        if (intent.getBooleanExtra("afc_nav_merge", false) && fm2.commonConfig.p && ABGlobal.isFeatureOpened(this, "browser_webview_init_async_v2")) {
            this.isAfcMergeOpenH5 = isH5UrlFromAfc(intent);
        }
        if (this.browserWebView != null) {
            v7t.d(vmm.TAG, "browserWebView != null");
            this.browserWebView.setOuterContext(this);
            if (!this.loaded) {
                this.browserWebView.init();
                vmm.a().clear();
            }
            doOnCreateLater(a2, bundle2);
        } else if (!this.isAfcMergeOpenH5 || z5 || WVCore.getInstance().isUCSupport() || !WVUCRemoteFetcher.hasUCRemoteLocal()) {
            k7r.a("exchain.FullTrace", "UC is Ready, new BrowserHybridWebView");
            doOnCreateLater(a2, bundle2);
        } else {
            this.isWaitUCReady = true;
            SplashFragment.show(getSupportFragmentManager());
            k7r.a("exchain.FullTrace", "Wait UC Core ready");
            f fVar = new f();
            Timer timer = new Timer();
            this.isUCCorePreparedCallback = false;
            WVCore.getInstance().initUCCore(this, new g(SystemClock.uptimeMillis(), timer, a2, bundle2));
            timer.schedule(fVar, 20000L);
            k7r.a("exchain.FullTrace", "Timer start");
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean v = FestivalMgr.i().v("global");
        if (TextUtils.isEmpty(this.useDounble11Style) || !v) {
            resetStyle();
        } else {
            setDounble11Style(this.useDounble11Style);
        }
        JSONObject c2 = mrw.b().c();
        if (!(c2 != null ? c2.optBoolean("WV.Meta.DisableRefresh", false) : false)) {
            getMenuInflater().inflate(R.menu.browser_refresh_menu, menu);
        }
        if (this.isRefundOrderUrl && !StringUtil.isEmpty(this.orderId)) {
            AppMonitor.Counter.commit(m7r.KEY_MONITOR_MODULE, "BrowserActivity.onCreateOptionsMenu.refund", 1.0d);
            int i2 = R.id.browser_menu_order_detail;
            MenuItemCompat.setShowAsAction(menu.add(0, i2, 0, getString(R.string.uik_icon_form_light) + ":订单详情"), 0);
        }
        if (!TextUtils.isEmpty(this.mlinkhref) && this.bitmap != null) {
            getMenuInflater().inflate(R.menu.browser_custom_menu, menu);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.bitmap);
            MenuItem item = menu.getItem(R.id.browser_menu_custom);
            if (item != null) {
                item.setIcon(bitmapDrawable);
            }
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            this.wvContext = browserHybridWebView.getWVCallBackContext();
        }
        if (this.menuItemSecondRight != null) {
            MenuItem add = menu.add(0, R.id.browser_menu_second_right_item, 0, "");
            MenuItemCompat.setShowAsAction(add, 2);
            if (!TextUtils.isEmpty(this.menuItemSecondRight.title)) {
                add.setTitle(this.menuItemSecondRight.title);
            } else {
                ActionBarMenuItem actionBarMenuItem = this.menuItemSecondRight;
                int i3 = actionBarMenuItem.iconResId;
                if (i3 > 0) {
                    add.setIcon(i3);
                } else if (actionBarMenuItem.iconFontId > 0) {
                    add.setTitle(getResources().getString(this.menuItemSecondRight.iconFontId) + ":");
                } else {
                    Bitmap bitmap = actionBarMenuItem.iconBitemap;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        add.setIcon(new BitmapDrawable(getResources(), this.menuItemSecondRight.iconBitemap));
                    }
                }
            }
        }
        if (this.menuItemRight != null) {
            MenuItem add2 = menu.add(0, R.id.browser_menu_right_item, 0, "");
            MenuItemCompat.setShowAsAction(add2, 2);
            if (!TextUtils.isEmpty(this.menuItemRight.title)) {
                add2.setTitle(this.menuItemRight.title);
            } else {
                ActionBarMenuItem actionBarMenuItem2 = this.menuItemRight;
                int i4 = actionBarMenuItem2.iconResId;
                if (i4 > 0) {
                    add2.setIcon(i4);
                } else if (actionBarMenuItem2.iconFontId > 0) {
                    add2.setTitle(getResources().getString(this.menuItemRight.iconFontId) + ":");
                } else {
                    Bitmap bitmap2 = actionBarMenuItem2.iconBitemap;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        add2.setIcon(new BitmapDrawable(getResources(), this.menuItemRight.iconBitemap));
                    }
                }
            }
        } else if ((c2 != null ? !c2.optBoolean("WV.Meta.Share.Disabled", false) : false) && !this.hideShareItem) {
            int i5 = R.id.browser_menu_share;
            MenuItemCompat.setShowAsAction(menu.add(0, i5, 0, getString(R.string.uik_icon_share_light) + ":分享"), 2);
        }
        if (this.menuItemTitle != null) {
            ActionBar supportActionBar = getSupportActionBar();
            if (TextUtils.isEmpty(this.menuItemTitle.title)) {
                if (supportActionBar != null) {
                    supportActionBar.setDisplayShowTitleEnabled(false);
                }
                ImageView imageView = new ImageView(this);
                ActionBarMenuItem actionBarMenuItem3 = this.menuItemTitle;
                int i6 = actionBarMenuItem3.iconResId;
                if (i6 > 0) {
                    imageView.setImageResource(i6);
                } else {
                    int i7 = actionBarMenuItem3.iconFontId;
                    if (i7 > 0) {
                        imageView.setImageDrawable(getIconFontDrawable(i7));
                    } else {
                        Bitmap bitmap3 = actionBarMenuItem3.iconBitemap;
                        if (bitmap3 != null && !bitmap3.isRecycled()) {
                            imageView.setImageDrawable(new BitmapDrawable(getResources(), this.menuItemTitle.iconBitemap));
                        } else if (!TextUtils.isEmpty(this.menuItemTitle.href)) {
                            s0m.B().T(this.menuItemTitle.href).succListener(new a(imageView, supportActionBar)).fetch();
                        }
                    }
                }
                imageView.setClickable(true);
                if (supportActionBar != null) {
                    supportActionBar.setCustomView(imageView);
                    supportActionBar.setDisplayShowCustomEnabled(true);
                    supportActionBar.setDisplayShowHomeEnabled(true);
                }
                imageView.setOnClickListener(new b());
            } else if (supportActionBar != null) {
                supportActionBar.setDisplayShowTitleEnabled(true);
                supportActionBar.setDisplayShowCustomEnabled(false);
                supportActionBar.setTitle(this.menuItemTitle.title);
            }
        }
        View findViewById = findViewById(R.id.uik_action_overflow);
        if (!(c2 != null ? c2.optBoolean("WV.Meta.Nav.HideMoreItem", false) : false)) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            List<ActionBarMenuItem> list = this.menuItemList;
            if (list != null && !list.isEmpty()) {
                for (ActionBarMenuItem actionBarMenuItem4 : this.menuItemList) {
                    MenuItem add3 = menu.add(actionBarMenuItem4.title);
                    int i8 = actionBarMenuItem4.iconResId;
                    if (i8 > 0) {
                        add3.setIcon(i8);
                    } else if (actionBarMenuItem4.iconFontId > 0) {
                        add3.setTitle(getResources().getString(actionBarMenuItem4.iconFontId) + ":" + actionBarMenuItem4.title);
                    } else {
                        Bitmap bitmap4 = actionBarMenuItem4.iconBitemap;
                        if (bitmap4 != null && !bitmap4.isRecycled()) {
                            add3.setIcon(new BitmapDrawable(getResources(), actionBarMenuItem4.iconBitemap));
                        }
                    }
                    add3.setIntent(actionBarMenuItem4.data);
                    MenuItemCompat.setShowAsAction(add3, 8);
                    add3.setOnMenuItemClickListener(new c());
                }
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (this.isaddDesktop) {
            if (TextUtils.isEmpty(this.shortcut_buttonText)) {
                this.shortcut_buttonText = "添加到桌面";
            }
            int i9 = R.id.browser_menu_desktop;
            MenuItemCompat.setShowAsAction(menu.add(0, i9, 0, getString(R.string.uik_icon_down_light) + ":" + this.shortcut_buttonText), 0);
        }
        if (c2 != null && c2.has("WV.Meta.Favorite.Image") && !TextUtils.isEmpty(this.mFavorIcon)) {
            int i10 = R.id.browser_menu_favor;
            MenuItemCompat.setShowAsAction(menu.add(0, i10, 0, getString(R.string.uik_icon_favor_light) + ":" + this.mFavorText), 0);
        }
        if (this.hideUserHelperItem) {
            TBPublicMenu.removePublicMenu(R.id.uik_menu_service);
        }
        k7r.b("exchain.FullTrace", "BrowserActivity.onCreateOptionsMenu end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
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

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        String minimalistStartupUrl;
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
                String stringExtra = intent.getStringExtra(Constants.MYBROWSERURL);
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = intent.getDataString();
                }
                String urlReferer = getUrlReferer(stringExtra, intent);
                if (urlReferer != null) {
                    stringExtra = urlReferer;
                }
                str = preBrowserFilter(stringExtra);
            } catch (Exception unused2) {
                TLog.loge(TAG, "fail to get intent extras");
            }
            if (!(this.browserWebView == null || (minimalistStartupUrl = getMinimalistStartupUrl(intent, str)) == null)) {
                v7t.a(y7t.TAOBAO_TAG, "Browser : onNewIntent 2:".concat(minimalistStartupUrl));
                reSetActionbarDefault();
                if (!fm2.commonConfig.w || !isFinishing()) {
                    this.browserWebView.resume();
                    this.browserWebView.loadUrl(UrlFormator.formatUrl(minimalistStartupUrl));
                    this.browserWebView.wpData.timeLoadurl = System.currentTimeMillis();
                }
                epo epoVar = this.mHandle;
                if (epoVar != null && epoVar.hasMessages(1105)) {
                    this.mHandle.removeMessages(1105);
                }
                if (isFinishing()) {
                    Nav.from(this).withCategory("com.taobao.intent.category.HYBRID_UI").toUri(minimalistStartupUrl);
                }
                Intent intent2 = getIntent();
                intent2.putExtra("ActivityName", "BrowserActivity:" + gtw.i(minimalistStartupUrl));
            }
        }
        super.onNewIntent(intent);
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            browserHybridWebView.pause();
            epo epoVar = this.mHandle;
            if (epoVar != null) {
                epoVar.postDelayed(new Runnable() { // from class: com.taobao.browser.BrowserActivity.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            BrowserActivity.access$400(BrowserActivity.this).evaluateJavascript("(function() { return (!!document.body.innerHTML);})()", new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public void onReceiveValue(String str) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str});
                                        return;
                                    }
                                    epo epoVar2 = BrowserActivity.this.mHandle;
                                    if (epoVar2 != null) {
                                        if (epoVar2.hasMessages(1105)) {
                                            BrowserActivity.this.mHandle.removeMessages(1105);
                                        }
                                        if ("false".equalsIgnoreCase(str)) {
                                            Message obtain = Message.obtain();
                                            obtain.what = 1105;
                                            BrowserActivity.this.mHandle.dispatchMessage(obtain);
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
        TBS.Page.leave(this.className);
        if (this.browserWebView != null) {
            mol.b().e(this.mActivityHashCode, this.browserWebView.getOriginalUrl(), isFinishing());
            if (!TextUtils.isEmpty(this.browserWebView.getCurrentUrl())) {
                Properties properties = new Properties();
                properties.put("url", this.browserWebView.getCurrentUrl());
                TBS.EasyTrace.updateEasyTraceActivityProperties(this, properties);
            }
        }
        try {
            WVUTCrashCaughtListener.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i2), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
        try {
            BrowserHybridWebView browserHybridWebView = this.browserWebView;
            if (browserHybridWebView != null) {
                browserHybridWebView.onRequestPermissionsResult(i2, strArr, iArr);
            }
        } catch (Throwable th) {
            v7t.d(TAG, th.toString());
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(TrackBuried.list_Type)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "kpv");
            if (!TextUtils.isEmpty(this.mYyzUrl)) {
                hashMap.put("url", this.mYyzUrl);
            }
            TrackBuried.effectupdatePageProperties(this.className, hashMap);
        }
        v7t.a(TAG, "onRestart.");
        super.onRestart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (disableTransition()) {
            overridePendingTransition(0, 0);
        }
        try {
            super.onStart();
        } catch (Throwable unused) {
        }
        if (this.enableUCVisibility && (browserHybridWebView = this.browserWebView) != null) {
            browserHybridWebView.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (this.enableUCVisibility && (browserHybridWebView = this.browserWebView) != null) {
            browserHybridWebView.setVisibility(4);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        String str = Build.MANUFACTURER;
        if (str != null && str.equalsIgnoreCase("Xiaomi") && !this.invalidateOnce) {
            supportInvalidateOptionsMenu();
            this.invalidateOnce = true;
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        if (this.browserWebView == null) {
            return null;
        }
        BrowserUtil.b(TAG, "pageUserInfo", "pageUserInfo", null, null);
        String data2H5 = this.browserWebView.getData2H5();
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(data2H5)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", this.browserWebView.getUrl());
            bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, bundle2);
        } else {
            bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, BrowserUtil.a(data2H5));
        }
        return bundle;
    }

    public void reSetActionbarDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988317ba", new Object[]{this});
            return;
        }
        this.isRefundOrderUrl = false;
        this.isaddDesktop = false;
        this.mlinkhref = null;
        this.menuItemRight = null;
        this.menuItemSecondRight = null;
        this.menuItemList = null;
        if (this.isAutoResetMenu) {
            togglePublicMenu(true);
            this.isAutoResetMenu = false;
        }
        supportInvalidateOptionsMenu();
    }

    private String getFinalUrlFromAfc(Intent intent) {
        Throwable th;
        epo epoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8737ddb7", new Object[]{this, intent});
        }
        String str = null;
        try {
            epo epoVar2 = this.mHandle;
            if (epoVar2 != null) {
                epoVar2.removeMessages(m7r.GO_TO_HOME);
            }
            str = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            v7t.d(TAG, "afc_nav_merge url=" + str);
            String queryParameter = Uri.parse(str).getQueryParameter("u");
            if (!TextUtils.isEmpty(queryParameter) && Uri.parse(queryParameter).isHierarchical()) {
                try {
                    v7t.d(TAG, "afc_nav_merge parsedU=" + queryParameter);
                    str = queryParameter;
                } catch (Throwable th2) {
                    th = th2;
                    str = queryParameter;
                    th.printStackTrace();
                    return str;
                }
            }
            if (!this.isIntentSetAfcH5Url) {
                this.isIntentSetAfcH5Url = true;
                intent.setData(Uri.parse(str));
            }
            BrowserHybridWebView browserHybridWebView = this.browserWebView;
            if ((browserHybridWebView != null && browserHybridWebView.getUCExtension() == null) || !j9l.a()) {
                SplashFragment.dismiss(getSupportFragmentManager());
            } else if (!this.isWaitUCReady && (epoVar = this.mHandle) != null) {
                epoVar.removeMessages(m7r.SPLASH_HIDE);
                epo epoVar3 = this.mHandle;
                vpw.b();
                epoVar3.sendEmptyMessageDelayed(m7r.SPLASH_HIDE, vpw.commonConfig.j0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return str;
    }

    private BitmapDrawable getIconFontDrawable(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("db44474b", new Object[]{this, new Integer(i2)});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this);
        tIconFontTextView.setText(i2);
        tIconFontTextView.setTextSize(24.0f);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        if (TextUtils.isEmpty(this.useDounble11Style) || (!this.useDounble11Style.equals("festivalWithRainbowLine") && !this.useDounble11Style.equals("festival"))) {
            tIconFontTextView.setTextColor(getResources().getColor(R.color.abc_title_color));
        } else {
            tIconFontTextView.setTextColor(FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, getResources().getColor(R.color.abc_title_color)));
        }
        try {
            tIconFontTextView.setTypeface(Typeface.createFromAsset(getAssets(), "uik_iconfont.ttf"));
            return new BitmapDrawable(getResources(), BrowserUtil.j(tIconFontTextView));
        } catch (Throwable unused) {
            return new BitmapDrawable();
        }
    }

    public void enableH5Progress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7778e04", new Object[]{this});
            return;
        }
        int i2 = R.id.uik_page_progressbar;
        TBProgressBar tBProgressBar = (TBProgressBar) findViewById(i2);
        this.progressbar = tBProgressBar;
        if (tBProgressBar != null) {
            TLog.loge(TAG, "progress bar has a parent already.");
            return;
        }
        this.progressbar = new TBProgressBar(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(16908290);
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                layoutParams.height = (int) (displayMetrics.density * 1.0f);
            }
            layoutParams.gravity = 48;
            this.progressbar.setId(i2);
            frameLayout.addView(this.progressbar, layoutParams);
            this.progressbar.setCurrentProgress(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
        lm4.d().e(this);
        LoginBroadcastReceiver.b(this);
        v7t.a(TAG, "onDestroy.");
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
            browserHybridWebView2.setFilter(null);
            this.browserWebView.setOutHandler(null);
            this.browserWebView.setVisibility(8);
            this.browserWebView.removeAllViews();
            if (fm2.commonConfig.z) {
                ViewParent parent = this.browserWebView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.browserWebView);
                }
                this.browserWebView.destroy();
            } else {
                this.browserWebView.coreDestroy();
            }
            this.browserWebView = null;
        }
        TBS.Page.destroy(this.className);
        this.isHookNativeBack = false;
        c29.m(this).q();
        try {
            WVUTCrashCaughtListener.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        if (this.webOrange != null) {
            OrangeConfig.getInstance().unregisterListener(new String[]{"WindVane"});
        }
        uy8 uy8Var = this.businessSpan;
        if (uy8Var != null) {
            uy8Var.finish();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.enableUCVisibility = TextUtils.equals("true", OrangeConfig.getInstance().getConfig("group_common_browser", m7r.KEY_ORANGE_CONFIG_ENABLE_UC_VISIBILITY, "false"));
        long currentTimeMillis = System.currentTimeMillis();
        TBS.Page.enter(this.className);
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !TextUtils.isEmpty(browserHybridWebView.getCurrentUrl())) {
            Properties properties = new Properties();
            properties.put("url", this.browserWebView.getCurrentUrl());
            TBS.EasyTrace.updateEasyTraceActivityProperties(this, properties);
        }
        v7t.a(TAG, "onResume.");
        super.onResume();
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
        BrowserUtil.u(this, this.browserWebView);
        k7r.b("exchain.FullTrace", "BrowserActivity.onResume end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    private boolean disableTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96d9f868", new Object[]{this})).booleanValue();
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        return (browserHybridWebView == null || browserHybridWebView.getCurrentUrl() == null || !this.browserWebView.getCurrentUrl().contains(nextPageAnimationParam)) ? false : true;
    }

    private String getMinimalistStartupUrl(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98f6b9e1", new Object[]{this, intent, str});
        }
        boolean booleanExtra = intent.getBooleanExtra("cold_startup_h5", false);
        boolean booleanExtra2 = intent.getBooleanExtra("afc_nav_merge", false);
        boolean booleanExtra3 = intent.getBooleanExtra("afc_nav_native", false);
        if (booleanExtra && booleanExtra2) {
            String finalUrlFromAfc = getFinalUrlFromAfc(intent);
            if (TextUtils.equals(finalUrlFromAfc, this.navAfcMergeUrl)) {
                finalUrlFromAfc = null;
            }
            getIntent().putExtra("cold_startup_h5", true);
            getIntent().putExtra("afc_nav_merge", true);
            return finalUrlFromAfc;
        } else if (!booleanExtra || !booleanExtra3) {
            return str;
        } else {
            String h5UrlFromAfc = getH5UrlFromAfc(intent);
            if (TextUtils.isEmpty(h5UrlFromAfc)) {
                v7t.d(TAG, "onNewIntent afcNavNative failed, there is no h5Url");
                y71.commitFail(MONITOR_POINT_AFC_NAV_FAIL, 5, "onNewIntent afcNavNative failed, there is no h5Url", h5UrlFromAfc);
                return str;
            } else if (Nav.from(this).withExtras(intent.getExtras()).toUri(h5UrlFromAfc)) {
                NotifyApm.b().c(this);
                fm2.b();
                gm2 gm2Var = fm2.commonConfig;
                if (gm2Var.b) {
                    v7t.d(TAG, "fixAfcBug onNewIntent");
                    finish(true);
                    return str;
                }
                fm2.b();
                if (gm2Var.d) {
                    v7t.d(TAG, "fixAfcBug onNewIntent2");
                    finish(true);
                    return str;
                }
                v7t.d(TAG, "not fixAfcBug onNewIntent");
                finish();
                return str;
            } else {
                v7t.d(TAG, "onNewIntent afcNavNative failed, nav cannot handle it");
                y71.commitFail(MONITOR_POINT_AFC_NAV_FAIL, 4, "onNewIntent afcNavNative failed, nav cannot handle it", h5UrlFromAfc);
                return str;
            }
        }
    }

    private boolean isH5UrlFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f4bca4", new Object[]{this, intent})).booleanValue();
        }
        try {
            String queryParameter = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            String queryParameter2 = Uri.parse(queryParameter).getQueryParameter("u");
            if (!TextUtils.isEmpty(queryParameter2) && Uri.parse(queryParameter2).isHierarchical()) {
                queryParameter = queryParameter2;
            }
            return !TextUtils.isEmpty(queryParameter);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private void showShareModule() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55e1975", new Object[]{this});
            return;
        }
        ShareContent shareContent = new ShareContent();
        JSONObject c2 = mrw.b().c();
        shareContent.businessId = "windvane";
        String str4 = "wxfriend,qq,contacts";
        String str5 = "";
        if (c2 != null) {
            String optString = c2.optString("WV.Meta.Share.Title", str5);
            String optString2 = c2.optString("WV.Meta.Share.Image", str5);
            str2 = c2.optString("WV.Meta.Share.Url", this.browserWebView.getUrl());
            ActionBarMenuItem actionBarMenuItem = this.menuItemTitle;
            if (actionBarMenuItem == null || !TextUtils.isEmpty(actionBarMenuItem.title)) {
                str = c2.optString("WV.Meta.Share.Text", this.browserWebView.getTitle());
            } else {
                str = c2.optString("WV.Meta.Share.Text", this.menuItemTitle.title);
            }
            str4 = c2.optString("WV.Meta.Share.Targets", str4);
            shareContent.businessId = c2.optString("WV.Meta.Share.BizId", "windvane");
            str3 = optString2;
            str5 = optString;
        } else {
            str2 = this.browserWebView.getUrl();
            ActionBarMenuItem actionBarMenuItem2 = this.menuItemTitle;
            if (actionBarMenuItem2 == null || !TextUtils.isEmpty(actionBarMenuItem2.title)) {
                str = this.browserWebView.getTitle();
            } else {
                str = this.menuItemTitle.title;
            }
            str3 = str5;
        }
        if (TextUtils.isEmpty(str)) {
            str = "我分享给你了一个淘宝页面，快来看看吧";
        }
        shareContent.title = str5;
        shareContent.imageUrl = str3;
        shareContent.url = str2;
        shareContent.description = str;
        if (str4.equals("all")) {
            ShareBusiness.share(this, shareContent);
            return;
        }
        String[] split = str4.split(",");
        if (split != null) {
            ArrayList arrayList = new ArrayList();
            for (String str6 : split) {
                arrayList.add(str6);
            }
            ShareBusiness.share(this, arrayList, shareContent);
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean onPanelKeyDown(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 != 4) {
            return super.onPanelKeyDown(i2, keyEvent);
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView == null) {
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
            finish();
            return true;
        }
        browserHybridWebView.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str) {
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                } else if (BrowserActivity.access$400(BrowserActivity.this) != null) {
                    if (!TextUtils.isEmpty(str)) {
                        z = !"false".equals(str.replace("\"", "").replace("'", ""));
                    }
                    if (z) {
                        BrowserActivity.access$400(BrowserActivity.this).getWVCallBackContext().fireEvent(RPWebViewActivity.l, "{}");
                        BrowserUtil.b(BrowserActivity.TAG, "backControl", "true", BrowserActivity.access$400(BrowserActivity.this).getCurrentUrl(), null);
                        return;
                    }
                    try {
                        Runtime.getRuntime().exec("input keyevent 4");
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    BrowserActivity.access$702(BrowserActivity.this, true);
                    BrowserUtil.b(BrowserActivity.TAG, "backControl", "false", BrowserActivity.access$400(BrowserActivity.this).getCurrentUrl(), null);
                }
            }
        });
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.browser_menu_refresh) {
            TBProgressBar tBProgressBar = this.progressbar;
            if (tBProgressBar != null && (tBProgressBar.getProgress() == 100 || this.progressbar.getProgress() == 0)) {
                TBS.Adv.ctrlClickedOnPage(this.className, CT.Button, "RefreshWebView");
                BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
                if (browserHybridWebView2 != null) {
                    browserHybridWebView2.getWVCallBackContext().fireEvent("WV.Event.Page.Refresh");
                    this.browserWebView.reload();
                }
                return true;
            }
        } else if (itemId == R.id.browser_menu_order_detail) {
            Bundle bundle = new Bundle();
            bundle.putString("bizOrderId", this.orderId);
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_DETAIL);
            finish();
            return true;
        } else if (itemId == R.id.browser_menu_custom) {
            if (!TextUtils.isEmpty(this.mlinkonclick) && (browserHybridWebView = this.browserWebView) != null) {
                browserHybridWebView.loadUrl("javascript:" + this.mlinkonclick);
                return true;
            }
        } else if (itemId == R.id.browser_menu_right_item) {
            WVCallBackContext wVCallBackContext = this.wvContext;
            if (wVCallBackContext != null) {
                wVCallBackContext.fireEvent("TBNaviBar.rightItem.clicked", "{}");
            }
            return true;
        } else if (itemId == R.id.browser_menu_second_right_item) {
            WVCallBackContext wVCallBackContext2 = this.wvContext;
            if (wVCallBackContext2 != null) {
                wVCallBackContext2.fireEvent("TBNaviBar.secondRightItem.clicked", "{}");
            }
            return true;
        } else if (itemId == R.id.browser_menu_share) {
            showShareModule();
            return true;
        } else if (itemId == R.id.browser_menu_desktop) {
            BrowserUtil.k(this, this.shortcut_url, this.shortcut_title, this.shortcut_bitmap);
            return true;
        } else if (itemId == R.id.browser_menu_favor) {
            JSONObject c2 = mrw.b().c();
            if (TextUtils.equals(to8.FAVOR, this.mFavorIcon)) {
                int optInt = c2.optInt("WV.Meta.Favorite.BizId", 11);
                String optString = c2.optString("WV.Meta.Favorite.Url", this.mYyzUrl);
                String optString2 = c2.optString("WV.Meta.Favorite.Title", this.browserWebView.getTitle());
                String optString3 = c2.optString("WV.Meta.Favorite.Image");
                String optString4 = c2.optString("WV.Meta.Favorite.Summary");
                v7t.a(TAG_FAV, "bizId:" + optInt + " feedId:0 contentUrl:" + optString + " title:" + optString2 + " picUrl:" + optString3 + " summary:" + optString4 + " showToast:true");
                c29.m(this).n(optInt, 0L, optString, optString2, optString3, optString4, true, new FavContentCallBack(optString, FavType.AddFavorite));
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders$UTControlHitBuilder("Page_Webview", "Button-addfav").build());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (TextUtils.equals("favor_fill", this.mFavorIcon)) {
                int optInt2 = c2.optInt("WV.Meta.Favorite.BizId", 11);
                String optString5 = c2.optString("WV.Meta.Favorite.Url", this.mYyzUrl);
                v7t.a(TAG_FAV, "bizId:" + optInt2 + " feedId:0 contentUrl:" + optString5 + " showToast:true");
                c29.m(this).o(optInt2, 0L, optString5, true, new FavContentCallBack(optString5, FavType.DeleteFavorite));
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders$UTControlHitBuilder("Page_Webview", "Button-cancelfav").build());
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:69|(1:71)(1:72)|73|(3:75|(2:77|(2:79|(1:81)(1:82))(1:83))(1:84)|85)(2:88|(2:90|(4:92|(2:100|(2:102|104))|103|104)(1:105))(2:106|(6:108|(1:110)(1:111)|112|(1:115)|116|(10:139|(2:145|(8:147|148|(2:151|(1:155))|156|191|157|159|(1:161)(15:162|(1:164)|165|(1:167)|168|(1:170)(1:171)|172|189|173|176|(1:178)(3:179|(1:181)|182)|183|(1:185)|186|187)))|149|148|(0)|156|191|157|159|(0)(0))(7:126|(2:130|(3:132|137|138))|129|133|(1:135)(1:136)|137|138))(15:113|87|(0)|116|(1:118)|139|(4:141|143|145|(0))|149|148|(0)|156|191|157|159|(0)(0))))|86|87|(0)|116|(0)|139|(0)|149|148|(0)|156|191|157|159|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doOnCreateLater(tb.mdd r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instructions count: 2123
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.BrowserActivity.doOnCreateLater(tb.mdd, android.os.Bundle):void");
    }
}
