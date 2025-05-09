package com.taobao.android.shop.activity;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.taobao.TBActionBar;
import androidx.core.util.Pair;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.aliweex.utils.MemoryMonitor;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.task.Coordinator;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.widgets.page.ShopDatasourceCreator;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.module.NavPrefetchShopFetchManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.ContainerMonitor;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXViewUtils;
import com.ut.mini.UTAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.acq;
import tb.c21;
import tb.e4x;
import tb.fdv;
import tb.hb0;
import tb.kr0;
import tb.lca;
import tb.n7x;
import tb.nuw;
import tb.opp;
import tb.oyu;
import tb.qj4;
import tb.rb;
import tb.rc4;
import tb.s0m;
import tb.stw;
import tb.t2o;
import tb.w11;
import tb.w6f;
import tb.wmc;
import tb.wnp;
import tb.ypp;
import tb.yqp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopRenderActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_DEGRADE_TO_WINDVANE = "degradeToWindVane";
    private static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    private static final String DEGRADE_MSG = "degrade_msg";
    private static final String DEGRADE_TYPE = "degrade_type";
    private static final String DEGRADE_TYPE_INIT_ERROR = "DEGRADE_TYPE_INIT_ERROR";
    private static final String DEGRADE_TYPE_JS_ERROR = "DEGRADE_TYPE_JS_ERROR";
    private static final String DEGRADE_TYPE_PARAMS_ERROR = "DEGRADE_TYPE_PARAMS_ERROR";
    private static final String FROM = "_wx_f_";
    private static final String FROM_WEEX_DEGRADE_H5 = "2";
    private static final String HIDDEN_STATUS_BAR_WITH_DARK_TEXT = "hidden_dark_text";
    private static final String HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT = "hidden_light_text";
    private static final int MAX_PRELOAD_IMAGE_EACH_COUNT = 3;
    private static final String NAV_HIDDEN = "wx_navbar_hidden";
    private static final String NAV_OVERLAY = "wx_navbar_transparent";
    public static final String SHOP_BIZ_MODULE = "Shop";
    public static final String SHOP_COST = "ShopCost";
    public static final String SHOP_NAVI = "shop_navi";
    public static final String SHOP_RENDER = "Page_ShopRender";
    public static final String SHOP_RENDER_ERROR = "Page_ShopRender_Error";
    public static final String STATUSBAR_HEIGHT = "statusbarHeight";
    private static final String TAG = "ShopRender";
    private static final String WX_STATUSBAR_HIDDEN = "_wx_statusbar_hidden";
    private ViewGroup embedView;
    private View innerView;
    public String mBundleUrl;
    private Runnable mErrorParallalRenderFailover;
    private NavPrefetchShopFetchManager.FetchDataResultListener mFetchDataListener;
    private Runnable mFrameRenderAlarm;
    private Runnable mFrameTemplateAlarm;
    private WeexPageFragment mInnerPageFragment;
    private Runnable mInnerTemplateAlarm;
    private Runnable mOverTimeFailover;
    private WeexPageFragment mPageFragment;
    private String mPageName;
    private String mSellerId;
    private String mShopId;
    private String mShopNavi;
    private String mShopNaviForLog;
    private q mShopPageListener;
    public TBPublicMenu mTBPublicMenu;
    public String mTargetInnerUrl;
    private String mWeexUrl;
    public static boolean sDebugEndableJSReport = false;
    public static boolean sDebugDisableWeexSDKBackThread = false;
    public static boolean sDebugUseOnlineJS = false;
    public static boolean mShowPerfPanel = false;
    private Map<String, String> mQueryMap = null;
    private String mParamForLog = "";
    private String mParamUUIDForLog = "";
    private Handler mHandler = new Handler();
    private long mCheckTime = 3000;
    private CommonBaseDatasource mAllItemsDatasource = null;
    private boolean mUseParallelRender = true;
    private boolean mUseLocalJS = true;
    private boolean mUseBackgroundJSThread = true;
    private boolean mUseImagePreload = true;
    private boolean mUseFestivalActionbar = false;
    private boolean mIsWapa = false;
    private String mDeviceLevel = "medium";
    private boolean enabledParallelRender = false;
    private boolean mIsDegrade = false;
    private stw mAnalyzerDelegate = null;
    private boolean actionBarOverlay = false;
    public boolean mActionBarShow = true;
    public boolean mHookBackPress = false;
    private Map<String, Long> startTimeForLog = new HashMap();
    private Map<String, List<Long>> eachTimeForLog = new HashMap();
    private yqp mTracker = new yqp();
    private long mCurrentClickTime = System.currentTimeMillis();
    public long mTotalCost = 0;
    public long mActivityInitTime = System.currentTimeMillis();
    public long mFirstLineOfOnCreate = System.currentTimeMillis();
    public long mRouterCost = 0;
    public long mActivityPrepareCost = 0;
    public long mDataPrefetchCost = 0;
    public long mFrameJSLoadCost = 0;
    public long mFrameJSRenderCost = 0;
    public long mFrameJSRenderCostStart = 0;
    public long mInnerJSLoadCost = 0;
    public long mInnerJSRenderCost = 0;
    public long mInnerJSRenderCostStart = 0;
    public long mPagedataCost = 0;
    public long mFetchImageCost = 0;
    public long mPagedataImageCost = 0;
    public long mApmInteractiveCost = 0;
    public long mActivityPrepareCostBegin = 0;
    public long mDataPrefetchCostBegin = 0;
    public long mFrameJSLoadCostBegin = 0;
    public long mFrameJSRenderCostBegin = 0;
    public long mInnerJSLoadCostBegin = 0;
    public long mInnerJSRenderCostBegin = 0;
    public long mPagedataCostBegin = 0;
    public long mFetchImageCostBegin = 0;
    public long mPagedataImageCostBegin = 0;
    private long mTimeNavStart = -1;
    private boolean mHasCommitPageTime = false;
    private ComponentCallbacks2 mLowMemoryTrim = new e();
    private BroadcastReceiver mDegradeReceive = new BroadcastReceiver() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$7");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(intent.getAction(), "degradeToWindVane")) {
                ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                ShopRenderActivity.access$2000(shopRenderActivity, shopRenderActivity.getIntent());
                ShopRenderActivity.this.finish();
            }
        }
    };
    private boolean mIsProcessedFetchDataResult = false;
    public ImageStrategyConfig mImageStrategyConfig = null;
    private Map<String, Object> mDataResponseMap = new HashMap();
    private SoftReference<JSCallback> mFetchCallback = null;
    private SoftReference<JSCallback> mPagedataCallback = null;
    private JSCallback mJsCallback = null;
    private boolean hasCanceledMerge = false;
    private Runnable mergeRunnable = new c();
    private boolean mReadyToShowPerfPanel = false;
    public PerfPanelFragment mPerfPanel = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum StatusBarTextColor {
        Dark,
        Light,
        Undefine;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StatusBarTextColor statusBarTextColor, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$StatusBarTextColor");
        }

        public static StatusBarTextColor valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatusBarTextColor) ipChange.ipc$dispatch("1fb0f648", new Object[]{str});
            }
            return (StatusBarTextColor) Enum.valueOf(StatusBarTextColor.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class WeexInnerPageFragment extends WeexPageFragment {
        static {
            t2o.a(764411945);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$shop$activity$ShopRenderActivity$StatusBarTextColor;

        static {
            int[] iArr = new int[StatusBarTextColor.values().length];
            $SwitchMap$com$taobao$android$shop$activity$ShopRenderActivity$StatusBarTextColor = iArr;
            try {
                iArr[StatusBarTextColor.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$shop$activity$ShopRenderActivity$StatusBarTextColor[StatusBarTextColor.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$8");
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ShopRenderActivity.access$2600(ShopRenderActivity.this)) {
                str = "//campaign.wapa.taobao.com";
            } else {
                str = "//campaigncdn.m.taobao.com";
            }
            ShopRenderActivity.access$2700(ShopRenderActivity.this, OrangeConfig.getInstance().getConfig("shop_render", "shop_downgrade_prerequest_url", str.concat("/moduledata/downgrade.htm?dataId=taobao")), "downgrade");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f9390a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9391a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super(str);
                this.f9391a = str2;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$9$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ShopRenderActivity.access$3100(ShopRenderActivity.this, this.f9391a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object obj) {
            super(str);
            this.f9390a = obj;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$9");
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x011c A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x002a, B:8:0x0032, B:11:0x0039, B:13:0x003d, B:27:0x0096, B:28:0x00d0, B:31:0x00fb, B:33:0x0110, B:36:0x011c, B:37:0x013e, B:38:0x015f, B:40:0x016b, B:42:0x0179, B:46:0x0183, B:48:0x018b, B:50:0x0197, B:52:0x01a3, B:53:0x01ae, B:55:0x01ba, B:57:0x01c4, B:58:0x01d3, B:61:0x01df, B:64:0x01fe, B:66:0x0204, B:67:0x020b, B:69:0x0211, B:71:0x0217, B:72:0x021e, B:75:0x0226, B:76:0x0256, B:78:0x0260, B:79:0x026f, B:80:0x028b), top: B:86:0x002a }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x013e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x002a, B:8:0x0032, B:11:0x0039, B:13:0x003d, B:27:0x0096, B:28:0x00d0, B:31:0x00fb, B:33:0x0110, B:36:0x011c, B:37:0x013e, B:38:0x015f, B:40:0x016b, B:42:0x0179, B:46:0x0183, B:48:0x018b, B:50:0x0197, B:52:0x01a3, B:53:0x01ae, B:55:0x01ba, B:57:0x01c4, B:58:0x01d3, B:61:0x01df, B:64:0x01fe, B:66:0x0204, B:67:0x020b, B:69:0x0211, B:71:0x0217, B:72:0x021e, B:75:0x0226, B:76:0x0256, B:78:0x0260, B:79:0x026f, B:80:0x028b), top: B:86:0x002a }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x016b A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x002a, B:8:0x0032, B:11:0x0039, B:13:0x003d, B:27:0x0096, B:28:0x00d0, B:31:0x00fb, B:33:0x0110, B:36:0x011c, B:37:0x013e, B:38:0x015f, B:40:0x016b, B:42:0x0179, B:46:0x0183, B:48:0x018b, B:50:0x0197, B:52:0x01a3, B:53:0x01ae, B:55:0x01ba, B:57:0x01c4, B:58:0x01d3, B:61:0x01df, B:64:0x01fe, B:66:0x0204, B:67:0x020b, B:69:0x0211, B:71:0x0217, B:72:0x021e, B:75:0x0226, B:76:0x0256, B:78:0x0260, B:79:0x026f, B:80:0x028b), top: B:86:0x002a }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0179 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x002a, B:8:0x0032, B:11:0x0039, B:13:0x003d, B:27:0x0096, B:28:0x00d0, B:31:0x00fb, B:33:0x0110, B:36:0x011c, B:37:0x013e, B:38:0x015f, B:40:0x016b, B:42:0x0179, B:46:0x0183, B:48:0x018b, B:50:0x0197, B:52:0x01a3, B:53:0x01ae, B:55:0x01ba, B:57:0x01c4, B:58:0x01d3, B:61:0x01df, B:64:0x01fe, B:66:0x0204, B:67:0x020b, B:69:0x0211, B:71:0x0217, B:72:0x021e, B:75:0x0226, B:76:0x0256, B:78:0x0260, B:79:0x026f, B:80:0x028b), top: B:86:0x002a }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 764
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.k.run():void");
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f9392a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, JSONObject jSONObject) {
                super(str);
                this.f9392a = jSONObject;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$9$2");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Object obj = this.f9392a.get("data");
                if (obj instanceof JSONObject) {
                    try {
                        JSONObject jSONObject = ((JSONObject) obj).getJSONObject("components");
                        if (jSONObject != null) {
                            ShopRenderActivity.access$3200(ShopRenderActivity.this, CredentialRpcData.ACTION_FETCH, jSONObject);
                        }
                    } catch (Throwable th) {
                        opp.b("-52011", "error in preloadImage fetch.", th, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                        ShopRenderActivity.access$1300(ShopRenderActivity.this).d("-52011", "error in preloadImage fetch.", fdv.F_PAGE_RENDER, th, new Object[0]);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class l implements n7x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764411934);
            t2o.a(85983284);
        }

        public l() {
        }

        @Override // tb.n7x
        public View a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("7e8959d9", new Object[]{this, context});
            }
            return new FrameLayout(ShopRenderActivity.this);
        }

        @Override // tb.n7x
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7cf0564", new Object[]{this, new Boolean(z)});
            }
        }

        public /* synthetic */ l(ShopRenderActivity shopRenderActivity, e eVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class m implements NavPrefetchShopFetchManager.FetchDataResultListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764411935);
            t2o.a(773849122);
        }

        public m() {
        }

        @Override // com.taobao.weex.module.NavPrefetchShopFetchManager.FetchDataResultListener
        public void onReceiveFetchData(String str, JSONObject jSONObject, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0b13e05", new Object[]{this, str, jSONObject, new Long(j)});
            } else if (str.equals(ShopRenderActivity.access$700(ShopRenderActivity.this))) {
                ShopRenderActivity.access$800(ShopRenderActivity.this, jSONObject, j);
            }
        }

        @Override // com.taobao.weex.module.NavPrefetchShopFetchManager.FetchDataResultListener
        public void onReceiveFetchDataString(String str, String str2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75bc6d18", new Object[]{this, str, str2, new Long(j)});
            } else if (str.equals(ShopRenderActivity.access$700(ShopRenderActivity.this))) {
                ShopRenderActivity.access$800(ShopRenderActivity.this, str2, j);
            }
        }

        public /* synthetic */ m(ShopRenderActivity shopRenderActivity, e eVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface n {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class o implements NetworkCallBack.ProgressListener, NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9395a;
        public final String b;
        public final ByteArrayOutputStream c = new ByteArrayOutputStream();

        static {
            t2o.a(764411937);
            t2o.a(607125968);
            t2o.a(607125966);
        }

        public o(String str, String str2) {
            this.f9395a = str;
            this.b = str2;
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent != null) {
                this.c.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f9396a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object obj) {
                super(str);
                this.f9396a = obj;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$PreVisitCdnListener$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                JSONArray jSONArray;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Object obj = this.f9396a;
                    if (obj instanceof String) {
                        jSONObject = JSON.parseObject((String) obj);
                    } else {
                        jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("module");
                    if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("moduleList")) != null) {
                        ShopRenderActivity.access$3600(ShopRenderActivity.this, "pagedata", jSONArray);
                    }
                } catch (Throwable th) {
                    opp.b("-52012", "error in preloadImage pagedata.", th, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                    ShopRenderActivity.access$1300(ShopRenderActivity.this).d("-52012", "error in preloadImage pagedata.", fdv.F_PAGE_RENDER, th, new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x02d8 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:12:0x0076, B:15:0x0081, B:17:0x0096, B:19:0x00a0, B:22:0x00e0, B:23:0x00e8, B:25:0x00f2, B:26:0x015a, B:27:0x0160, B:30:0x0168, B:33:0x0177, B:35:0x017f, B:36:0x021f, B:39:0x028c, B:41:0x0294, B:43:0x029c, B:45:0x02a8, B:47:0x02d8, B:48:0x02e3, B:50:0x02eb, B:52:0x02f5, B:53:0x0309, B:55:0x0313, B:56:0x0322, B:59:0x032c, B:61:0x0340), top: B:66:0x0076, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0313 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:12:0x0076, B:15:0x0081, B:17:0x0096, B:19:0x00a0, B:22:0x00e0, B:23:0x00e8, B:25:0x00f2, B:26:0x015a, B:27:0x0160, B:30:0x0168, B:33:0x0177, B:35:0x017f, B:36:0x021f, B:39:0x028c, B:41:0x0294, B:43:0x029c, B:45:0x02a8, B:47:0x02d8, B:48:0x02e3, B:50:0x02eb, B:52:0x02f5, B:53:0x0309, B:55:0x0313, B:56:0x0322, B:59:0x032c, B:61:0x0340), top: B:66:0x0076, inners: #0 }] */
        @Override // anetwork.channel.NetworkCallBack.FinishListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFinished(anetwork.channel.NetworkEvent.FinishEvent r28, java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 906
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.o.onFinished(anetwork.channel.NetworkEvent$FinishEvent, java.lang.Object):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9397a;
        public String b;
        public boolean c;
        public boolean d;

        static {
            t2o.a(764411939);
        }

        public p() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9397a);
            String str = this.b;
            if (str != null) {
                sb.append(str);
                sb.append(" ");
            }
            if (this.c) {
                sb.append("fullWidth");
            }
            if (this.d) {
                sb.append("orignalSize");
            }
            return sb.toString();
        }

        public /* synthetic */ p(e eVar) {
            this();
        }
    }

    static {
        t2o.a(764411918);
        t2o.a(815793728);
    }

    public static /* synthetic */ Map access$000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5668a5ca", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mDataResponseMap;
    }

    public static /* synthetic */ Map access$100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70d99ee9", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.startTimeForLog;
    }

    public static /* synthetic */ JSCallback access$1000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSCallback) ipChange.ipc$dispatch("3672087e", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mJsCallback;
    }

    public static /* synthetic */ boolean access$1100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c689e9", new Object[]{shopRenderActivity})).booleanValue();
        }
        return shopRenderActivity.hasCanceledMerge;
    }

    public static /* synthetic */ boolean access$1102(ShopRenderActivity shopRenderActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8076ff15", new Object[]{shopRenderActivity, new Boolean(z)})).booleanValue();
        }
        shopRenderActivity.hasCanceledMerge = z;
        return z;
    }

    public static /* synthetic */ String access$1200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d844fdc", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mParamForLog;
    }

    public static /* synthetic */ yqp access$1300(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yqp) ipChange.ipc$dispatch("7db46bb5", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mTracker;
    }

    public static /* synthetic */ long access$1400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebd1ebf6", new Object[]{shopRenderActivity})).longValue();
        }
        return shopRenderActivity.mCheckTime;
    }

    public static /* synthetic */ String access$1500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fefcb5f", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mDeviceLevel;
    }

    public static /* synthetic */ void access$1600(ShopRenderActivity shopRenderActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70257d4", new Object[]{shopRenderActivity, str, str2});
        } else {
            shopRenderActivity.sendDegradeBoradcast(str, str2);
        }
    }

    public static /* synthetic */ String access$1800(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("625b46e2", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mShopNavi;
    }

    public static /* synthetic */ WeexPageFragment access$1900(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("cffc4e12", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mInnerPageFragment;
    }

    public static /* synthetic */ Map access$200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b4a9808", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.eachTimeForLog;
    }

    public static /* synthetic */ void access$2000(ShopRenderActivity shopRenderActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329901c4", new Object[]{shopRenderActivity, intent});
        } else {
            shopRenderActivity.degradeToWindVane(intent);
        }
    }

    public static /* synthetic */ stw access$2100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (stw) ipChange.ipc$dispatch("b1cb70ef", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mAnalyzerDelegate;
    }

    public static /* synthetic */ void access$2200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3ff5c5", new Object[]{shopRenderActivity});
        } else {
            shopRenderActivity.cancelReportAlarmFrameRenderNoResponse();
        }
    }

    public static /* synthetic */ WeexPageFragment access$2300(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("db171bd9", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mPageFragment;
    }

    public static /* synthetic */ String access$2400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78229e7d", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.generateAppMonitorArgs();
    }

    public static /* synthetic */ long access$2500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac4b57d6", new Object[]{shopRenderActivity})).longValue();
        }
        return shopRenderActivity.mCurrentClickTime;
    }

    public static /* synthetic */ boolean access$2600(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b24f2345", new Object[]{shopRenderActivity})).booleanValue();
        }
        return shopRenderActivity.mIsWapa;
    }

    public static /* synthetic */ void access$2700(ShopRenderActivity shopRenderActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b53b4", new Object[]{shopRenderActivity, str, str2});
        } else {
            shopRenderActivity.preVistCdn(str, str2);
        }
    }

    public static /* synthetic */ String access$2800(ShopRenderActivity shopRenderActivity, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a67202b0", new Object[]{shopRenderActivity, map, str});
        }
        return shopRenderActivity.findInnerUrlFromFetchResponse(map, str);
    }

    public static /* synthetic */ String access$2900(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c2b1702", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mSellerId;
    }

    public static /* synthetic */ boolean access$3000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48adff8c", new Object[]{shopRenderActivity})).booleanValue();
        }
        return shopRenderActivity.mUseParallelRender;
    }

    public static /* synthetic */ CommonBaseDatasource access$302(ShopRenderActivity shopRenderActivity, CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("ffdfc6a6", new Object[]{shopRenderActivity, commonBaseDatasource});
        }
        shopRenderActivity.mAllItemsDatasource = commonBaseDatasource;
        return commonBaseDatasource;
    }

    public static /* synthetic */ void access$3100(ShopRenderActivity shopRenderActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed16a8f1", new Object[]{shopRenderActivity, str});
        } else {
            shopRenderActivity.processParallelRender(str);
        }
    }

    public static /* synthetic */ void access$3200(ShopRenderActivity shopRenderActivity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2edbd260", new Object[]{shopRenderActivity, str, jSONObject});
        } else {
            shopRenderActivity.preloadFetchImage(str, jSONObject);
        }
    }

    public static /* synthetic */ Map access$3400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("40ca2839", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mQueryMap;
    }

    public static /* synthetic */ SoftReference access$3500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoftReference) ipChange.ipc$dispatch("828360e3", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mPagedataCallback;
    }

    public static /* synthetic */ void access$3600(ShopRenderActivity shopRenderActivity, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9833ea34", new Object[]{shopRenderActivity, str, jSONArray});
        } else {
            shopRenderActivity.preloadPagedataImage(str, jSONArray);
        }
    }

    public static /* synthetic */ View access$3700(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a8d80123", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.innerView;
    }

    public static /* synthetic */ View access$3702(ShopRenderActivity shopRenderActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("36ab0295", new Object[]{shopRenderActivity, view});
        }
        shopRenderActivity.innerView = view;
        return view;
    }

    public static /* synthetic */ ViewGroup access$3800(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d12aef95", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.embedView;
    }

    public static /* synthetic */ ViewGroup access$3802(ShopRenderActivity shopRenderActivity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7b41b278", new Object[]{shopRenderActivity, viewGroup});
        }
        shopRenderActivity.embedView = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ void access$3900(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed025df", new Object[]{shopRenderActivity});
        } else {
            shopRenderActivity.mergeView();
        }
    }

    public static /* synthetic */ String access$400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b1436ef", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mShopNaviForLog;
    }

    public static /* synthetic */ Runnable access$4000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a10b8eeb", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mErrorParallalRenderFailover;
    }

    public static /* synthetic */ Runnable access$4002(ShopRenderActivity shopRenderActivity, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a2533e2f", new Object[]{shopRenderActivity, runnable});
        }
        shopRenderActivity.mErrorParallalRenderFailover = runnable;
        return runnable;
    }

    public static /* synthetic */ Handler access$4100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("c2a57a5e", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mHandler;
    }

    public static /* synthetic */ void access$4200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b36c7", new Object[]{shopRenderActivity});
        } else {
            shopRenderActivity.clearCallback();
        }
    }

    public static /* synthetic */ String access$500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6be2b570", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mParamUUIDForLog;
    }

    public static /* synthetic */ String access$700(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d7fb272", new Object[]{shopRenderActivity});
        }
        return shopRenderActivity.mShopId;
    }

    public static /* synthetic */ void access$800(ShopRenderActivity shopRenderActivity, Object obj, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a430f5fb", new Object[]{shopRenderActivity, obj, new Long(j2)});
        } else {
            shopRenderActivity.processFetchDataResult(obj, j2);
        }
    }

    private String assemblePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39fa303", new Object[]{this, str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Uri.parse(str).buildUpon().clearQuery().build().toString();
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    private void cancelReportAlarmFrameRenderNoResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dfb89", new Object[]{this});
            return;
        }
        Runnable runnable = this.mFrameRenderAlarm;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mFrameRenderAlarm = null;
        }
    }

    private void cancelReportAlarmFrameTemplateOverSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4517d24e", new Object[]{this});
            return;
        }
        Runnable runnable = this.mFrameTemplateAlarm;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mFrameTemplateAlarm = null;
        }
    }

    private void cancelReportAlarmInnerTemplateOverSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e1b745", new Object[]{this});
            return;
        }
        Runnable runnable = this.mInnerTemplateAlarm;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mInnerTemplateAlarm = null;
        }
    }

    private void clearCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2286f939", new Object[]{this});
            return;
        }
        Runnable runnable = this.mOverTimeFailover;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mOverTimeFailover = null;
        }
        Runnable runnable2 = this.mErrorParallalRenderFailover;
        if (runnable2 != null) {
            this.mHandler.removeCallbacks(runnable2);
            this.mErrorParallalRenderFailover = null;
        }
    }

    private String generateAppMonitorArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc42468e", new Object[]{this});
        }
        return JSON.toJSONString(generateAppMonitorArgsMap());
    }

    private Map<String, String> generateAppMonitorArgsMap() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("605b8c4d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(this.mBundleUrl)) {
            str = getIntent().getStringExtra(qj4.c);
        } else {
            str = this.mBundleUrl;
        }
        hashMap.put("url", str);
        if (TextUtils.isEmpty(this.mBundleUrl)) {
            str2 = getIntent().getStringExtra(qj4.c);
        } else {
            str2 = this.mBundleUrl;
        }
        hashMap.put("bundleUrl", str2);
        if (TextUtils.isEmpty(this.mPageName)) {
            str3 = assemblePageName(getIntent().getStringExtra(qj4.c));
        } else {
            str3 = this.mPageName;
        }
        hashMap.put("pageName", str3);
        return hashMap;
    }

    private long getCheckTime(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d78b3e28", new Object[]{this, str, new Long(j2)})).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "checkTime_" + str, String.valueOf(j2)));
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    private String getQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3e05edd", new Object[]{this, str});
        }
        Map<String, String> map = this.mQueryMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    private Pair<Boolean, StatusBarTextColor> hideStatusBar() {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("aa8b7b1a", new Object[]{this});
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            queryParameter = Uri.parse(this.mWeexUrl).getQueryParameter(WX_STATUSBAR_HIDDEN);
        } catch (Exception e2) {
            WXLogUtils.e(TAG, e2);
        }
        if (TextUtils.equals(queryParameter, Boolean.toString(true))) {
            return new Pair<>(Boolean.TRUE, StatusBarTextColor.Undefine);
        }
        if (!TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_DARK_TEXT)) {
            if (TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT)) {
                if (i2 >= 23) {
                    return new Pair<>(Boolean.TRUE, StatusBarTextColor.Light);
                }
                return new Pair<>(Boolean.FALSE, StatusBarTextColor.Light);
            }
            return new Pair<>(Boolean.FALSE, StatusBarTextColor.Undefine);
        } else if (i2 >= 23) {
            return new Pair<>(Boolean.TRUE, StatusBarTextColor.Dark);
        } else {
            return new Pair<>(Boolean.FALSE, StatusBarTextColor.Dark);
        }
    }

    private void initFragment(FragmentActivity fragmentActivity, int i2, WeexPageFragment weexPageFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d51e5c", new Object[]{this, fragmentActivity, new Integer(i2), weexPageFragment, str});
            return;
        }
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        if (TextUtils.isEmpty(str)) {
            str = WeexPageFragment.FRAGMENT_TAG;
        }
        beginTransaction.add(i2, weexPageFragment, str);
        beginTransaction.commitAllowingStateLoss();
    }

    public static /* synthetic */ Object ipc$super(ShopRenderActivity shopRenderActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -663187577:
                return new Boolean(super.onSupportNavigateUp());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
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
            case 1270686685:
                super.onLowMemory();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity");
        }
    }

    private boolean isEnvironmentReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43817025", new Object[]{this})).booleanValue();
        }
        boolean isDegrade = TBWXConfigManger.getInstance().isDegrade();
        boolean isCPUSupport = WXEnvironment.isCPUSupport();
        if (WXEnvironment.isApkDebugable()) {
            WXLogUtils.d(TAG, "Debug 模式下强制开启support=true,原始的WXEnvironment.isCPUSupport()为" + isCPUSupport);
            isCPUSupport = true;
        }
        boolean isInitialized = WXSDKEngine.isInitialized();
        WXLogUtils.d(TAG, "degrade:" + isDegrade + " support:" + isCPUSupport + " init:" + isInitialized);
        if (isDegrade || !isCPUSupport || !isInitialized) {
            return false;
        }
        return true;
    }

    private boolean isParamTrue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f00bd96", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Map<String, String> map = this.mQueryMap;
        if (map == null || !map.containsKey(str)) {
            return z;
        }
        String str2 = this.mQueryMap.get(str);
        if (str2 == null) {
            return z;
        }
        String lowerCase = str2.toLowerCase();
        if ("false".equals(lowerCase) || "0".equals(lowerCase)) {
            return false;
        }
        return true;
    }

    private void mergeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8533504", new Object[]{this});
        } else if (!this.hasCanceledMerge) {
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                this.mergeRunnable.run();
            } else {
                runOnUiThread(this.mergeRunnable);
            }
        }
    }

    private void preloadFetchImage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2e5595", new Object[]{this, str, jSONObject});
            return;
        }
        this.mTracker.t("preloadFetchImage");
        if (jSONObject != null && this.mUseImagePreload) {
            ArrayList arrayList = new ArrayList();
            findImageUrlInJson(jSONObject, arrayList, new HashMap());
            if (arrayList.size() > 0) {
                doPreloadImage(arrayList);
            }
            if (opp.f().booleanValue()) {
                this.mFetchImageCost = (System.currentTimeMillis() - this.mCurrentClickTime) - this.mFetchImageCostBegin;
            }
            this.mTracker.s("preloadFetchImage");
        }
    }

    private void preloadPagedataImage(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cedad92", new Object[]{this, str, jSONArray});
            return;
        }
        this.mTracker.t("preloadPagedataImage");
        if (jSONArray != null && this.mUseImagePreload) {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    findImageUrlInJson((JSONObject) next, arrayList, new HashMap());
                }
            }
            if (arrayList.size() > 0) {
                doPreloadImage(arrayList);
            }
            if (opp.f().booleanValue()) {
                this.mPagedataImageCost = (System.currentTimeMillis() - this.mCurrentClickTime) - this.mPagedataImageCostBegin;
            }
            this.mTracker.s("preloadPagedataImage");
        }
    }

    private String prepareShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a52fe761", new Object[]{this});
        }
        String str = this.mShopId;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(getIntent().getStringExtra(qj4.c));
        if (!parse.isHierarchical()) {
            return str;
        }
        String queryParameter = parse.getQueryParameter("shopId");
        this.mShopId = queryParameter;
        return queryParameter;
    }

    private void processPreVisitCdnDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2b8566", new Object[]{this});
        } else {
            Coordinator.execute(new j("shopRender-preVisitCdn-downgrade"), 35);
        }
    }

    private Map<String, String> queryMap(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c455507a", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null || !str.contains("?")) {
            return hashMap;
        }
        int indexOf = str.indexOf("?") + 1;
        do {
            int indexOf2 = str.indexOf(38, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                indexOf3 = indexOf2;
            }
            if (indexOf3 > indexOf) {
                String substring = str.substring(indexOf, indexOf3);
                int i2 = indexOf3 + 1;
                if (i2 <= indexOf2) {
                    str2 = str.substring(i2, indexOf2);
                } else {
                    str2 = "";
                }
                hashMap.put(Uri.decode(substring), Uri.decode(str2));
            }
            indexOf = indexOf2 + 1;
        } while (indexOf < str.length());
        return hashMap;
    }

    private Map<String, String> queryMap2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18aa344", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(str);
        if (parse != null && parse.isHierarchical()) {
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put(str2, parse.getQueryParameter(str2));
                }
            }
        }
        return hashMap;
    }

    private void reportAlarmFrameRenderNoResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94af0def", new Object[]{this});
            return;
        }
        g gVar = new g();
        this.mFrameRenderAlarm = gVar;
        this.mHandler.postDelayed(gVar, this.mCheckTime);
    }

    private void reportAlarmFrameTemplateOverSeconds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cccdf2", new Object[]{this, str});
            return;
        }
        this.mFrameTemplateAlarm = new h(str);
        this.mHandler.postDelayed(this.mFrameTemplateAlarm, Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "frame_template_alarm_delay", "3000")));
    }

    private void reportAlarmInnerTemplateOverSeconds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ca0329", new Object[]{this, str});
            return;
        }
        this.mInnerTemplateAlarm = new i(str);
        this.mHandler.postDelayed(this.mInnerTemplateAlarm, Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "inner_template_alarm_delay", "3000")));
    }

    private void sendDegradeBoradcast(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efdc554", new Object[]{this, str, str2});
            return;
        }
        WeexPageFragment weexPageFragment = this.mPageFragment;
        if (weexPageFragment != null) {
            weexPageFragment.destroyWeex();
        }
        WeexPageFragment weexPageFragment2 = this.mInnerPageFragment;
        if (weexPageFragment2 != null) {
            weexPageFragment2.destroyWeex();
        }
        Intent intent = new Intent("degradeToWindVane");
        intent.putExtra(qj4.c, this.mBundleUrl);
        intent.putExtra("degrade_type", "DEGRADE_TYPE_JS_ERROR");
        intent.putExtra("degrade_msg", "降级到h5 Instance创建失败或者网络错误ErrorCode= " + str + "详细错误信息\n" + str2);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        AppMonitor.Alarm.commitFail("weex", "renderResult", generateAppMonitorArgs(), "99301", str2);
    }

    private void updateFirstScreenTime() {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3baca7", new Object[]{this});
        } else if (oyu.d(this.mWeexUrl) && (weexPageFragment = this.mInnerPageFragment) != null) {
            WXSDKInstance wXSDKInstance = weexPageFragment.getWXSDKInstance();
            try {
                if (((ConcurrentHashMap) wXSDKInstance.E().d).containsKey("wxInteraction")) {
                    long longValue = ((Long) ((ConcurrentHashMap) wXSDKInstance.E().d).get("wxInteraction")).longValue();
                    if (longValue > 0) {
                        pageFinishCommit("https://market.m.taobao.com/apps/market/shop/weex_v2.html", longValue);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
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
        try {
            stw stwVar = this.mAnalyzerDelegate;
            if (stwVar != null) {
                stwVar.e(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (this.mIsDegrade) {
            overridePendingTransition(0, 0);
        }
    }

    public Object getShopData(String str, Map<String, String> map) {
        HashMap hashMap;
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87571994", new Object[]{this, str, map});
        }
        recordCostTime("getData " + str, System.currentTimeMillis());
        if ("pagedata".equals(str) || "downgrade".equals(str) || CredentialRpcData.ACTION_FETCH.equals(str)) {
            Object obj = this.mDataResponseMap.get(str);
            if (obj == null) {
                opp.p("main-cost", str, "数据未准备完成 同步。 getting ", str, " sync. but native has NOT got value.");
            }
            hashMap = obj;
        } else if (!"viewport".equals(str) || (weexPageFragment = this.mPageFragment) == null || weexPageFragment.getWXSDKInstance() == null) {
            hashMap = null;
        } else {
            float webPxByWidth = WXViewUtils.getWebPxByWidth(this.mPageFragment.getWXSDKInstance().getContainerView().getHeight(), this.mPageFragment.getWXSDKInstance().P());
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("height", Float.valueOf(webPxByWidth));
            hashMap = hashMap2;
        }
        showCostTime("getData " + str, hashMap == null ? "null" : "has return value");
        return hashMap;
    }

    public CommonBaseDatasource getShopDatasource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("5cb59aea", new Object[]{this});
        }
        return this.mAllItemsDatasource;
    }

    public void hidePerfPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4323d80", new Object[]{this});
        } else if (this.mPerfPanel != null) {
            getSupportFragmentManager().beginTransaction().hide(this.mPerfPanel).commit();
            mShowPerfPanel = false;
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return hideStatusBar().first.booleanValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        super.onActivityResult(i2, i3, intent);
        WeexPageFragment weexPageFragment = this.mPageFragment;
        if (weexPageFragment != null) {
            weexPageFragment.onActivityResult(i2, i3, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (this.mHookBackPress && (weexPageFragment = this.mPageFragment) != null && weexPageFragment.getWXSDKInstance() != null) {
            this.mPageFragment.getWXSDKInstance().B("backPressed", new HashMap());
        } else if (!processOnBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if (this.mUseFestivalActionbar) {
            FestivalMgr.i().C(this, TBActionBar.ActionBarStyle.NORMAL);
        }
        TBPublicMenu publicMenu = getPublicMenu();
        this.mTBPublicMenu = publicMenu;
        if (publicMenu != null) {
            publicMenu.onCreateOptionsMenu(getMenuInflater(), menu);
        }
        return onCreateOptionsMenu;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (processOnBackPressed() || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        try {
            updateFirstScreenTime();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        stw stwVar = this.mAnalyzerDelegate;
        if (stwVar != null) {
            stwVar.d();
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.mDegradeReceive);
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(w6f.PAGE_SHOP_PAUSE_ACTION));
        if (this.mFetchDataListener != null) {
            NavPrefetchShopFetchManager.getInstance().removeFetchDataListener(this.mFetchDataListener);
        }
        q qVar = this.mShopPageListener;
        if (qVar != null) {
            c21.m(qVar);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i2), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i2);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.mTracker.t("activityOnResume");
        super.onResume();
        stw stwVar = this.mAnalyzerDelegate;
        if (stwVar != null) {
            stwVar.f();
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(this.mDegradeReceive, new IntentFilter("degradeToWindVane"));
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(w6f.PAGE_SHOP_RESUME_ACTION));
        if (this.actionBarOverlay) {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(17170445));
            }
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_apm_page_change", "true"))) {
            q qVar = new q(this, null);
            this.mShopPageListener = qVar;
            c21.e(qVar);
        }
        this.mTracker.s("activityOnResume");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        stw stwVar = this.mAnalyzerDelegate;
        if (stwVar != null) {
            stwVar.g();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        stw stwVar = this.mAnalyzerDelegate;
        if (stwVar != null) {
            stwVar.h();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        if (processOnSupportNavigateUp()) {
            return true;
        }
        return super.onSupportNavigateUp();
    }

    public void pageFinishCommit(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3959ca5a", new Object[]{this, str, new Long(j2)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !this.mHasCommitPageTime) {
                this.mHasCommitPageTime = true;
                ContainerMonitor monitor = ContainerMonitor.monitor();
                if (!TextUtils.isEmpty(str)) {
                    long j3 = this.mTimeNavStart;
                    if (j3 > 0 && j2 > 0 && j2 - j3 > 0) {
                        monitor.fsTime(str, j2 - j3);
                        monitor.commitData(str);
                        Log.e("ShopPageFinished", "" + (j2 - this.mTimeNavStart));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean processOnBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8522e9b8", new Object[]{this})).booleanValue();
        }
        WeexPageFragment weexPageFragment = this.mPageFragment;
        if (weexPageFragment == null || weexPageFragment.isDetached() || !this.mPageFragment.onBackPressed()) {
            return false;
        }
        return true;
    }

    public boolean processOnSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29837c18", new Object[]{this})).booleanValue();
        }
        WeexPageFragment weexPageFragment = this.mPageFragment;
        if (weexPageFragment == null || weexPageFragment.isDetached() || !this.mPageFragment.onSupportNavigateUp()) {
            return false;
        }
        return true;
    }

    public void recordCostTimeDetail(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96366f7", new Object[]{this, str, new Long(j2)});
        } else if (opp.f().booleanValue()) {
            recordCostTime(str, j2);
            this.eachTimeForLog.put(str, new ArrayList());
            this.eachTimeForLog.get(str).add(Long.valueOf(j2));
        }
    }

    public void setNaviTransparent(boolean z) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15858463", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.fake_title);
        if (imageView != null) {
            View findViewById = findViewById(R.id.action_bar);
            if (z) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (findViewById != null) {
                    if (findViewById.getHeight() > 0) {
                        i3 = findViewById.getHeight();
                    } else {
                        i3 = findViewById.getMeasuredHeight();
                    }
                    layoutParams.height = i3;
                    imageView.setLayoutParams(layoutParams);
                }
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        View findViewById2 = findViewById(R.id.action_bar_container);
        if (z) {
            i2 = 17170443;
        } else {
            i2 = 17170445;
        }
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(getResources().getColor(i2));
        }
        View findViewById3 = findViewById(R.id.action_bar);
        if (findViewById3 != null) {
            findViewById3.setBackgroundColor(getResources().getColor(i2));
        }
    }

    public void showCostTime(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d659089", new Object[]{this, str, objArr});
        } else {
            showCostTime(str, Long.valueOf(System.currentTimeMillis()), objArr);
        }
    }

    public synchronized void showPerfPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f2a7a5", new Object[]{this});
            return;
        }
        if (this.mPerfPanel == null) {
            this.mPerfPanel = new PerfPanelFragment();
            getSupportFragmentManager().beginTransaction().add(16908290, this.mPerfPanel, "PerfPanel").addToBackStack("").commit();
        } else {
            getSupportFragmentManager().beginTransaction().show(this.mPerfPanel).commit();
        }
        mShowPerfPanel = true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements rc4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9381a;

        public a(String str) {
            this.f9381a = str;
        }

        @Override // tb.rc4
        public void onCreate(WXComponent wXComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcbed927", new Object[]{this, wXComponent});
            }
        }

        @Override // tb.rc4
        public void onPreDestory(WXComponent wXComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb808dc", new Object[]{this, wXComponent});
            }
        }

        @Override // tb.rc4
        public void onViewCreated(WXComponent wXComponent, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9884402", new Object[]{this, wXComponent, view});
            } else if (wXComponent != null && wXComponent.getRef().equals(this.f9381a)) {
                ShopRenderActivity.this.showCostTime("main-cost", "ComponentObserver.onViewCreated got embedView. will merge() ");
                ShopRenderActivity.access$3802(ShopRenderActivity.this, (ViewGroup) wXComponent.getHostView());
                ShopRenderActivity.access$3900(ShopRenderActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!(ShopRenderActivity.access$3700(ShopRenderActivity.this) == null || ShopRenderActivity.access$3700(ShopRenderActivity.this).getParent() == null)) {
                ((ViewGroup) ShopRenderActivity.access$3700(ShopRenderActivity.this).getParent()).removeAllViews();
            }
            if (ShopRenderActivity.access$3800(ShopRenderActivity.this) != null && ShopRenderActivity.access$3700(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$3800(ShopRenderActivity.this).addView(ShopRenderActivity.access$3700(ShopRenderActivity.this));
                if (ShopRenderActivity.access$1000(ShopRenderActivity.this) != null) {
                    ShopRenderActivity.access$1000(ShopRenderActivity.this).invoke("success");
                }
                ShopRenderActivity.this.showCostTime("main-cost", "merge-cost mergeView 完成合并. ");
                opp.d("mergeView", ShopRenderActivity.access$400(ShopRenderActivity.this), ShopRenderActivity.access$500(ShopRenderActivity.this));
                ShopRenderActivity.access$1300(ShopRenderActivity.this).h("mergeView", fdv.F_PAGE_RENDER);
                ShopRenderActivity.access$4200(ShopRenderActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ShopRenderActivity.access$1000(ShopRenderActivity.this) != null && !ShopRenderActivity.access$1100(ShopRenderActivity.this)) {
                ShopRenderActivity.access$1000(ShopRenderActivity.this).invoke("error. failover mode. no inner onRenderSuccess called");
                ShopRenderActivity.access$1102(ShopRenderActivity.this, true);
                opp.c("-60021", "inner onRenderSuccess not called.", ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60021", "inner onRenderSuccess not called.", fdv.F_PAGE_RENDER, new Object[0]);
                ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                StringBuilder sb = new StringBuilder("merge-cost mergeView 合并失败。no inner onRenderSuccess called. hasCanceledMerge: ");
                sb.append(ShopRenderActivity.access$1100(ShopRenderActivity.this));
                sb.append(" jscallback: ");
                if (ShopRenderActivity.access$1000(ShopRenderActivity.this) != null) {
                    str = " not null";
                } else {
                    str = "null";
                }
                sb.append(str);
                shopRenderActivity.showCostTime("main-cost", sb.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            opp.c("-60022", "frame render no response. over " + ShopRenderActivity.access$1400(ShopRenderActivity.this) + " ms.", ShopRenderActivity.access$1200(ShopRenderActivity.this));
            yqp access$1300 = ShopRenderActivity.access$1300(ShopRenderActivity.this);
            access$1300.f("-60022", "frame render no response. over " + ShopRenderActivity.access$1400(ShopRenderActivity.this) + " ms.", ShopRenderActivity.access$1500(ShopRenderActivity.this), fdv.F_PAGE_RENDER, new Object[0]);
            if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "degrade_to_windvane_when_frame_render_no_response", "false"))) {
                ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                ShopRenderActivity.access$1600(shopRenderActivity, "-60022", "shop frame render no response. over" + ShopRenderActivity.access$1400(ShopRenderActivity.this) + " ms");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9387a;

        public h(String str) {
            this.f9387a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            opp.c("-60031", "frame template seconds no get from cache.", ShopRenderActivity.access$1200(ShopRenderActivity.this), this.f9387a);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60031", "frame template seconds no get from cache.", fdv.F_PAGE_RENDER, this.f9387a);
            if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "degrade_to_windvane_when_frame_template_over_seconds", "false"))) {
                ShopRenderActivity.access$1600(ShopRenderActivity.this, "-60031", "shop frame template seconds no get from cache.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class r extends s implements n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764411942);
            t2o.a(764411936);
        }

        public r() {
            super();
        }

        public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$WXInnerRenderListenerImp");
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.s, com.alibaba.aliweex.bundle.WeexPageFragment.b
        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view});
            }
            return view;
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.s, com.alibaba.aliweex.bundle.WeexPageFragment.b
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            opp.c("-60026", "WXInnerRenderListenerImp onException", str, str2, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60026", "WXInnerRenderListenerImp onException.", "downgrade", str, str2);
            if (ShopRenderActivity.access$1000(ShopRenderActivity.this) != null) {
                JSCallback access$1000 = ShopRenderActivity.access$1000(ShopRenderActivity.this);
                access$1000.invoke("error. inner render exception. " + str);
                ShopRenderActivity.access$1102(ShopRenderActivity.this, true);
                opp.c("-60027", "inner render exception.", str, str2, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60027", "inner render exception.", "downgrade", str, str2);
            }
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.s, com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            if (ShopRenderActivity.access$4000(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$4100(ShopRenderActivity.this).removeCallbacks(ShopRenderActivity.access$4000(ShopRenderActivity.this));
                ShopRenderActivity.access$4002(ShopRenderActivity.this, null);
            }
            ShopRenderActivity.this.showCostTime("main-cost-render-inner", "after inner onRenderSuccess. just log");
            ShopRenderActivity.access$1300(ShopRenderActivity.this).s("innerJSRender");
            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
            if (shopRenderActivity.mInnerJSRenderCostStart > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                ShopRenderActivity shopRenderActivity2 = ShopRenderActivity.this;
                long j = shopRenderActivity2.mInnerJSRenderCostStart;
                shopRenderActivity.mInnerJSRenderCost = currentTimeMillis - j;
                shopRenderActivity2.mInnerJSRenderCostBegin = j - ShopRenderActivity.access$2500(shopRenderActivity2);
            }
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.s, com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            ShopRenderActivity.access$3702(ShopRenderActivity.this, view);
            ShopRenderActivity.this.showCostTime("main-cost", "after inner onViewCreated. got innerView");
            ShopRenderActivity.this.showCostTime("main-cost-render-inner", "after inner onViewCreated. got innerView");
            if (!(ShopRenderActivity.access$1900(ShopRenderActivity.this) == null || ShopRenderActivity.access$1900(ShopRenderActivity.this).getArguments() == null)) {
                ShopRenderActivity.access$1900(ShopRenderActivity.this).getArguments().remove(WeexPageFragment.FRAGMENT_ARG_TEMPLATE);
            }
            if (ShopRenderActivity.access$3800(ShopRenderActivity.this) == null || ShopRenderActivity.access$3700(ShopRenderActivity.this) == null) {
                ShopRenderActivity.this.showCostTime("main-cost", "merge-cost inner or embedView = null, 等待前端调用 merge() ");
            } else {
                ShopRenderActivity.access$3900(ShopRenderActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class s extends WeexPageFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (ShopRenderActivity.access$2300(ShopRenderActivity.this) != null && !TextUtils.isEmpty(ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalRenderUrl()) && !TextUtils.isEmpty(ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalUrl())) {
                    ShopRenderActivity.access$2300(ShopRenderActivity.this).replace(ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalUrl(), ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalRenderUrl());
                }
            }
        }

        static {
            t2o.a(764411943);
        }

        public s() {
        }

        public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopRenderActivity$WXRenderListenerImp");
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b
        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view});
            }
            View j = ShopRenderActivity.access$2100(ShopRenderActivity.this) != null ? ShopRenderActivity.access$2100(ShopRenderActivity.this).j(wXSDKInstance, view) : null;
            if (j == null) {
                return view;
            }
            ShopRenderActivity.this.showCostTime("main-cost-render-frame", "after frame onCreateView");
            return j;
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            if (ShopRenderActivity.access$2100(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$2100(ShopRenderActivity.this).i(wXSDKInstance);
            }
            ShopRenderActivity.access$2200(ShopRenderActivity.this);
            if (!(ShopRenderActivity.access$2300(ShopRenderActivity.this) == null || ShopRenderActivity.access$2300(ShopRenderActivity.this).getArguments() == null)) {
                ShopRenderActivity.access$2300(ShopRenderActivity.this).getArguments().remove(WeexPageFragment.FRAGMENT_ARG_TEMPLATE);
            }
            AppMonitor.Alarm.commitSuccess("weex", "renderResult", ShopRenderActivity.access$2400(ShopRenderActivity.this));
            ShopRenderActivity.this.showCostTime("main-cost-render-frame", "after frame onRenderSuccess. just log");
            ShopRenderActivity.access$1300(ShopRenderActivity.this).s("frameJSRender");
            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
            if (shopRenderActivity.mFrameJSRenderCostStart > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                ShopRenderActivity shopRenderActivity2 = ShopRenderActivity.this;
                long j = shopRenderActivity2.mFrameJSRenderCostStart;
                shopRenderActivity.mFrameJSRenderCost = currentTimeMillis - j;
                shopRenderActivity2.mFrameJSRenderCostBegin = j - ShopRenderActivity.access$2500(shopRenderActivity2);
            }
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
            shopRenderActivity.showCostTime("main-cost", "frame render exception !!!!!", wXSDKInstance.N() + " " + str2 + " errorCode " + str);
            super.onException(wXSDKInstance, z, str, str2);
            if (ShopRenderActivity.access$2100(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$2100(ShopRenderActivity.this).c(wXSDKInstance, str, str2);
            }
            opp.c("-60025", "WXRenderListenerImp onException.", Boolean.valueOf(z), str, str2, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60025", "WXRenderListenerImp onException.", "downgrade", Boolean.valueOf(z), str, str2);
            if (z) {
                ShopRenderActivity.access$1600(ShopRenderActivity.this, str, str2);
            }
            if (TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
                try {
                    TBErrorView tBErrorView = new TBErrorView(wXSDKInstance.getContext());
                    Error newError = Error.Factory.newError("ANDROID_SYS_NETWORK_ERROR", "网络错误,请稍后再试");
                    newError.url = wXSDKInstance.getBundleUrl();
                    tBErrorView.setError(newError);
                    tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, wmc.REFRESH, new a());
                    tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                    if (ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() != null && (ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() instanceof ViewGroup)) {
                        ((ViewGroup) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).addView(tBErrorView);
                    }
                    if (ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() != null) {
                        View findViewById = ShopRenderActivity.access$2300(ShopRenderActivity.this).getView().findViewById(R.id.wa_content_error_root);
                        if (findViewById != null) {
                            findViewById.setVisibility(4);
                        } else if ((ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() instanceof FrameLayout) && ((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildCount() > 0) {
                            for (int i = 0; i < ((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildCount(); i++) {
                                if (((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildAt(i) instanceof RelativeLayout) {
                                    ((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildAt(i).setVisibility(4);
                                    return;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    opp.b("-52002", "error in render TBErrorView.", th, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                    ShopRenderActivity.access$1300(ShopRenderActivity.this).d("-52002", "error in render TBErrorView.", "downgrade", th, new Object[0]);
                }
            }
        }
    }

    private void chooseAppBarMode(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b854301", new Object[]{this, bundle});
            return;
        }
        try {
            try {
                boolean isParamTrue = isParamTrue("wx_navbar_transparent", false);
                this.actionBarOverlay = isParamTrue;
                if (isParamTrue) {
                    supportRequestWindowFeature(109);
                } else {
                    supportRequestWindowFeature(8);
                }
            } catch (Throwable unused) {
                supportRequestWindowFeature(8);
            }
        } finally {
            getWindow().setFormat(-3);
            super.onCreate(bundle);
        }
    }

    private String findInnerUrlFromFetchResponse(Map<String, Object> map, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONArray jSONArray;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e96a8d97", new Object[]{this, map, str});
        }
        if (!(map == null || !(map.get("data") instanceof JSONObject) || TextUtils.isEmpty(((JSONObject) map.get("data")).getString("parallelRenderUrl")))) {
            return ((JSONObject) map.get("data")).getString("parallelRenderUrl");
        }
        if (map == null || !(map.get("data") instanceof JSONObject)) {
            jSONObject = null;
            jSONObject3 = null;
            jSONObject2 = null;
        } else {
            JSONObject jSONObject6 = (JSONObject) map.get("data");
            jSONObject3 = jSONObject6.getJSONObject("components");
            jSONObject = jSONObject6.getJSONObject("hierarchy");
            jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("structure") : null;
        }
        if (jSONObject == null || jSONObject3 == null || jSONObject2 == null) {
            return null;
        }
        String str2 = null;
        for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
            if (entry != null && (entry.getValue() instanceof JSONObject) && (jSONObject5 = ((JSONObject) entry.getValue()).getJSONObject("payload")) != null && str.equals(jSONObject5.getString("name"))) {
                str2 = entry.getKey();
            }
        }
        String string = (str2 == null || (jSONArray = jSONObject2.getJSONArray(str2)) == null || jSONArray.size() <= 0) ? null : jSONArray.getString(0);
        if (string == null || (jSONObject4 = jSONObject3.getJSONObject(string)) == null || jSONObject4.getJSONObject("payload") == null || jSONObject4.getJSONObject("payload").getJSONObject("source") == null) {
            return null;
        }
        return jSONObject4.getJSONObject("payload").getJSONObject("source").getString("url");
    }

    private ImageStrategyConfig getImageStrategyConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("3cbb9008", new Object[]{this});
        }
        if (this.mImageStrategyConfig == null) {
            synchronized (this) {
                try {
                    if (this.mImageStrategyConfig == null) {
                        ImageStrategyConfig.b v = ImageStrategyConfig.v("shop", 0);
                        v.i(TaobaoImageUrlStrategy.ImageQuality.q90);
                        v.d(false);
                        this.mImageStrategyConfig = v.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.mImageStrategyConfig;
    }

    private void hideAppBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcdf49b", new Object[]{this});
            return;
        }
        try {
            boolean isParamTrue = isParamTrue("wx_navbar_hidden", false);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null && isParamTrue) {
                supportActionBar.hide();
                this.mActionBarShow = false;
            }
        } catch (Exception e2) {
            WXLogUtils.e(TAG, e2);
        }
    }

    public void showCostTime(String str, Long l2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371869ea", new Object[]{this, str, l2, objArr});
        } else if (opp.f().booleanValue()) {
            StringBuilder sb = new StringBuilder("shopperf_cost ");
            if (this.startTimeForLog.get(str) != null) {
                sb.append(str);
                sb.append(" cost ");
                sb.append(l2.longValue() - this.startTimeForLog.get(str).longValue());
                sb.append(" ms.");
            } else {
                sb.append("new cost key. ");
                sb.append(str);
                sb.append(l2);
            }
            if (this.eachTimeForLog.get(str) != null) {
                long longValue = this.eachTimeForLog.get(str).get(this.eachTimeForLog.get(str).size() - 1).longValue();
                sb.append(" | last detla is ");
                sb.append(l2.longValue() - longValue);
            } else {
                sb.append("[done].");
            }
            if (objArr != null) {
                sb.append(" |");
                for (Object obj : objArr) {
                    if (obj != null) {
                        sb.append(" ");
                        sb.append(obj);
                    }
                }
            }
            sb.append(" | [");
            sb.append(Thread.currentThread().getName());
            sb.append("]");
            if (this.eachTimeForLog.get(str) != null) {
                this.eachTimeForLog.get(str).add(l2);
            }
            if ("main-cost".equals(str)) {
                opp.o("shop", "ShopCost", sb.toString());
            } else {
                opp.p("shop", "ShopCost", sb.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
                return;
            }
            opp.o("main-cost", "receiver ComponentCallbacks2.onTrimMemory ", Integer.valueOf(i));
            if (i <= 40) {
                e4x.t().n();
                ShopRenderActivity.access$000(ShopRenderActivity.this).clear();
                ShopRenderActivity.access$100(ShopRenderActivity.this).clear();
                ShopRenderActivity.access$200(ShopRenderActivity.this).clear();
                ShopRenderActivity.access$302(ShopRenderActivity.this, null);
                if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "log_when_ComponentCallbacks2", "false"))) {
                    opp.d("Release WeexCacheHelper by ComponentCallbacks2", ShopRenderActivity.access$400(ShopRenderActivity.this), ShopRenderActivity.access$500(ShopRenderActivity.this), String.valueOf(i));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9388a;

        public i(String str) {
            this.f9388a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            opp.c("-60032", "inner template seconds no get from cache.", ShopRenderActivity.access$1200(ShopRenderActivity.this), this.f9388a);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60032", "inner template seconds no get from cache.", fdv.F_PAGE_RENDER, this.f9388a);
            if (ShopRenderActivity.access$1000(ShopRenderActivity.this) != null && !ShopRenderActivity.access$1100(ShopRenderActivity.this)) {
                ShopRenderActivity.access$1000(ShopRenderActivity.this).invoke("error. inner template load over seconds");
                ShopRenderActivity.access$1102(ShopRenderActivity.this, true);
                opp.c("-60033", "error. inner template load over seconds.", ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).e("-60033", "error. inner template load over seconds.", fdv.F_PAGE_RENDER, this.f9388a);
            }
        }
    }

    private HashMap<String, Object> getExtraOption() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("74b07c59", new Object[]{this});
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        try {
            if (!(getIntent() == null || (hashMap = (HashMap) getIntent().getSerializableExtra("wx_options")) == null)) {
                hashMap2.putAll(hashMap);
            }
        } catch (Exception e2) {
            opp.b("-52027", "error in getExtraOption.", e2, this.mParamForLog, this.mBundleUrl);
            this.mTracker.d("-52027", "error in getExtraOption.", fdv.F_PAGE_RENDER, e2, new Object[0]);
        }
        return hashMap2;
    }

    private void prepareStatusBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bd901", new Object[]{this});
            return;
        }
        WXEnvironment.addCustomOptions(STATUSBAR_HEIGHT, Integer.toString(0));
        Pair<Boolean, StatusBarTextColor> hideStatusBar = hideStatusBar();
        if (hideStatusBar.first.booleanValue()) {
            View findViewById = findViewById(R.id.shop_render_root_layout);
            findViewById.setFitsSystemWindows(true);
            WXEnvironment.addCustomOptions(STATUSBAR_HEIGHT, Integer.toString(SystemBarDecorator.getStatusBarHeight(this)));
            int i2 = d.$SwitchMap$com$taobao$android$shop$activity$ShopRenderActivity$StatusBarTextColor[hideStatusBar.second.ordinal()];
            if (i2 == 1) {
                new SystemBarDecorator(this).enableImmersiveStatusBar(true);
            } else if (i2 != 2) {
                new SystemBarDecorator(this).enableImmersiveStatusBar(false);
            } else {
                new SystemBarDecorator(this).enableImmersiveStatusBar(false);
            }
            ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener(this) { // from class: com.taobao.android.shop.activity.ShopRenderActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (WindowInsetsCompat) ipChange2.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
                    }
                    if (TextUtils.equals(WXEnvironment.getCustomOptions().get(ShopRenderActivity.STATUSBAR_HEIGHT), "-1")) {
                        WXEnvironment.addCustomOptions(ShopRenderActivity.STATUSBAR_HEIGHT, Integer.toString(windowInsetsCompat.getSystemWindowInsetTop()));
                    }
                    return windowInsetsCompat.consumeSystemWindowInsets();
                }
            });
        }
    }

    public void addToParent(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43f2051", new Object[]{this, str, jSCallback});
        } else if (this.enabledParallelRender) {
            this.mJsCallback = jSCallback;
            showCostTime("main-cost", "before ComponentObserver.onViewCreated got embedView. ");
            this.mPageFragment.getWXSDKInstance().b1(new a(str));
            WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(this.mPageFragment.getWXSDKInstance().N(), str);
            if (wXComponent != null) {
                this.embedView = (ViewGroup) wXComponent.getHostView();
            }
            if (this.embedView != null) {
                mergeView();
            }
            b bVar = new b();
            this.mOverTimeFailover = bVar;
            this.mHandler.postDelayed(bVar, this.mCheckTime);
        } else {
            jSCallback.invoke("failed. parallelRender is NOT works (mtop prefetch not return)");
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        hb0.c().b(this);
        stw stwVar = this.mAnalyzerDelegate;
        if (stwVar != null) {
            stwVar.b();
        }
        try {
            unregisterComponentCallbacks(this.mLowMemoryTrim);
            NavPrefetchShopFetchManager.getInstance().clear();
            clearCallback();
            this.mJsCallback = null;
            WeexPageFragment weexPageFragment = this.mPageFragment;
            if (!(weexPageFragment == null || weexPageFragment.getActivity() == null)) {
                this.mPageFragment.onDestroy();
            }
            WeexPageFragment weexPageFragment2 = this.mInnerPageFragment;
            if (weexPageFragment2 != null && weexPageFragment2.getActivity() != null) {
                this.mInnerPageFragment.onDestroy();
            }
        } catch (Throwable th) {
            opp.b("-52001", "error in onDestroy.", th, this.mParamForLog, this.mBundleUrl);
            this.mTracker.d("-52001", "error in onDestroy.", fdv.F_PAGE_RENDER, th, new Object[0]);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 == 4) {
            if (!this.mHookBackPress || (weexPageFragment = this.mPageFragment) == null || weexPageFragment.getWXSDKInstance() == null) {
                return processOnBackPressed() || super.onKeyDown(i2, keyEvent);
            }
            this.mPageFragment.getWXSDKInstance().B("backPressed", new HashMap());
            return true;
        } else if (i2 != 24 || !opp.g() || !this.mReadyToShowPerfPanel) {
            return super.onKeyDown(i2, keyEvent);
        } else {
            if (!mShowPerfPanel) {
                showPerfPanel();
                opp.d("showPerfPanel", this.mShopNaviForLog, this.mParamUUIDForLog);
            } else {
                hidePerfPanel();
                opp.d("hidePerfPanel", this.mShopNaviForLog, this.mParamUUIDForLog);
            }
            return true;
        }
    }

    private void doPreloadImage(List<p> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113453f5", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (p pVar : list) {
                if (!TextUtils.isEmpty(pVar.b)) {
                    arrayList.add(pVar.f9397a + pVar.b);
                } else if (pVar.d) {
                    arrayList.add(pVar.f9397a);
                } else if (pVar.c) {
                    arrayList.add(TaobaoImageUrlStrategy.getInstance().decideUrl(pVar.f9397a, 360, getImageStrategyConfig()));
                }
            }
        }
        if (arrayList.size() > 0) {
            s0m.B().e0("common", arrayList).b();
        }
        showCostTime("main-cost", "preload image ", arrayList);
    }

    private boolean isParamValid(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a85c01", new Object[]{this, intent})).booleanValue();
        }
        this.mBundleUrl = intent.getStringExtra(qj4.c);
        this.mWeexUrl = intent.getStringExtra(qj4.e);
        if (TextUtils.isEmpty(this.mBundleUrl) || TextUtils.isEmpty(this.mWeexUrl)) {
            return false;
        }
        try {
            if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "use_string_way_generate_param_map", "true"))) {
                this.mQueryMap = queryMap(this.mBundleUrl);
            } else {
                this.mQueryMap = queryMap2(this.mBundleUrl);
            }
            this.mUseLocalJS = isParamTrue("_enable_local_js", true);
            boolean isParamTrue = isParamTrue("_parallel_render", true);
            this.mUseParallelRender = isParamTrue;
            if (isParamTrue && TextUtils.isEmpty(this.mShopNavi)) {
                this.mUseParallelRender = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "parallelrender_page_home", "true"));
            } else if (this.mUseParallelRender && "allitems".equals(this.mShopNavi)) {
                this.mUseParallelRender = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "parallelrender_page_allitems", "true"));
            }
            boolean isParamTrue2 = isParamTrue("_enable_background_js_thread", true);
            this.mUseBackgroundJSThread = isParamTrue2;
            if (isParamTrue2) {
                this.mUseBackgroundJSThread = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_background_js_thread", "true"));
            }
            boolean isParamTrue3 = isParamTrue("_enable_image_preload", true);
            this.mUseImagePreload = isParamTrue3;
            if (isParamTrue3) {
                this.mUseImagePreload = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_image_preload", "true"));
            }
            boolean isParamTrue4 = isParamTrue("_enable_navbar_festival", false);
            this.mUseFestivalActionbar = isParamTrue4;
            if (!isParamTrue4) {
                this.mUseFestivalActionbar = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_navbar_festival", "false"));
            }
            String assemblePageName = assemblePageName(this.mBundleUrl);
            this.mPageName = assemblePageName;
            kr0.i(assemblePageName);
            if (this.mQueryMap != null) {
                String query = getQuery("shopId");
                this.mShopId = query;
                this.mTracker.o(query);
                this.mSellerId = getQuery("sellerId");
                String query2 = getQuery(SHOP_NAVI);
                this.mShopNavi = query2;
                if (TextUtils.isEmpty(query2)) {
                    this.mShopNavi = getQuery("shopNavi");
                }
                if (!TextUtils.isEmpty(this.mShopNavi)) {
                    this.mShopNaviForLog = this.mShopNavi;
                } else if (this.mBundleUrl.contains("/apps/market/shop/weex_2.html?")) {
                    this.mShopNaviForLog = "home";
                } else {
                    this.mShopNaviForLog = this.mPageName;
                }
                this.mTracker.p(this.mShopNaviForLog);
                this.mIsWapa = this.mBundleUrl.contains("market.wapa.taobao.com/");
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(this.mShopId)) {
                    sb.append("Shop:");
                    sb.append(this.mShopId);
                } else if (!TextUtils.isEmpty(this.mShopId)) {
                    sb.append("Seller:");
                    sb.append(this.mSellerId);
                } else if (!TextUtils.isEmpty(this.mShopId)) {
                    sb.append("Navi:");
                    sb.append(this.mShopNavi);
                } else {
                    sb.append("No_id");
                }
                sb.append("UUID:");
                sb.append(this.mParamUUIDForLog);
                String sb2 = sb.toString();
                this.mParamForLog = sb2;
                this.mTracker.m(sb2);
            }
            String query3 = getQuery("currentClickTime");
            if (!TextUtils.isEmpty(query3)) {
                try {
                    long parseLong = Long.parseLong(query3);
                    this.mCurrentClickTime = parseLong;
                    this.mRouterCost = this.mFirstLineOfOnCreate - parseLong;
                    if (opp.f().booleanValue()) {
                        opp.p("main-cost shopperf_currentClickTime. currentClickTime - firstLineOfOnCreate cost", Long.valueOf(this.mRouterCost), "ms.", "currentClickTime - activiyInit = ", Long.valueOf(this.mActivityInitTime - parseLong));
                    }
                    this.mTracker.r("router", this.mRouterCost);
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb3 = new StringBuilder(this.mBundleUrl.replace("data_prefetch=true", "data_prefetch=false"));
            String a2 = MemoryMonitor.a();
            this.mDeviceLevel = a2;
            if ("high_end".equals(a2)) {
                this.mCheckTime = getCheckTime(this.mDeviceLevel, 1500L);
            } else if ("low_end".equals(this.mDeviceLevel)) {
                this.mCheckTime = getCheckTime(this.mDeviceLevel, 5000L);
            } else {
                this.mCheckTime = getCheckTime(this.mDeviceLevel, 3000L);
            }
            if (WXEnvironment.isApkDebugable()) {
                this.mCheckTime *= 2;
            }
            long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
            long currentTimeMillis = currentTimeStamp - System.currentTimeMillis();
            sb3.append("&shopRenderDeltaTime=");
            sb3.append(currentTimeMillis);
            sb3.append("&shopRenderWeexShopToken=");
            sb3.append(currentTimeStamp);
            sb3.append("&shopRenderDeviceLevel=");
            sb3.append(this.mDeviceLevel);
            sb3.append("&shopRenderIsLogin=");
            sb3.append(Login.checkSessionValid());
            boolean z = this.mUseBackgroundJSThread && !sDebugDisableWeexSDKBackThread && "true".equals(OrangeConfig.getInstance().getConfig("android_weex_ext_config", "enableBackUpThread", "true"));
            sb3.append("&shopRenderJSBackThread=");
            sb3.append(z);
            if (sDebugEndableJSReport) {
                sb3.append("&enableShopReport=true");
            }
            sb3.append("&_useless1=1");
            Map<String, String> map = this.mQueryMap;
            if (map != null) {
                map.put("shopRenderDeltaTime", String.valueOf(currentTimeMillis));
                this.mQueryMap.put("shopRenderDeviceLevel", this.mDeviceLevel);
                this.mQueryMap.put("shopRenderWeexShopToken", String.valueOf(currentTimeStamp));
                this.mQueryMap.put("shopRenderIsLogin", String.valueOf(Login.checkSessionValid()));
                this.mQueryMap.put("shopRenderJSBackThread", String.valueOf(z));
                if (sDebugEndableJSReport) {
                    this.mQueryMap.put("enableShopReport", "true");
                }
            }
            String sb4 = sb3.toString();
            this.mBundleUrl = sb4;
            this.mTracker.l(sb4);
            this.mWeexUrl = this.mBundleUrl;
        } catch (Throwable th) {
            opp.b("-52005", "error in isParamValid.", th, this.mParamForLog, this.mBundleUrl);
            this.mTracker.d("-52005", "error in isParamValid.", fdv.F_PAGE_RENDER, th, new Object[0]);
        }
        WXLogUtils.d(TAG, "bundleUrl:" + this.mBundleUrl);
        WXLogUtils.d(TAG, "weexUrl:" + this.mWeexUrl);
        return true;
    }

    private void preVistCdn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dca731", new Object[]{this, str, str2});
            return;
        }
        recordCostTime("main-cost preVistCdn " + str.hashCode(), System.currentTimeMillis());
        if ("downgrade".equals(str2)) {
            this.mTracker.t("preVistCdn-downgrade");
        } else if ("pagedata".equals(str2)) {
            this.mTracker.t("preVistCdn-pagedata");
        }
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setBizId("shop");
        requestImpl.addHeader("f-refer", "weex");
        requestImpl.setMethod("GET");
        requestImpl.setCharset("UTF-8");
        requestImpl.setRetryTime(1);
        requestImpl.setConnectTimeout(3000);
        requestImpl.addHeader(HttpConstant.USER_AGENT, nuw.a(WXEnvironment.getApplication(), WXEnvironment.getConfig()));
        try {
            new DegradableNetwork(getApplication()).asyncSend(requestImpl, requestImpl, null, new o(str, str2));
        } catch (Throwable th) {
            opp.b("-52041", "error in preVistCdn.", th, this.mParamForLog, this.mBundleUrl);
            this.mTracker.d("-52041", "error in preVistCdn.", fdv.F_DATA_PROCESS, th, new Object[0]);
        }
    }

    private Fragment prepareFragment(FragmentActivity fragmentActivity, String str, String str2, HashMap<String, Object> hashMap, String str3, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("14032b98", new Object[]{this, fragmentActivity, str, str2, hashMap, str3, serializable});
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (TextUtils.isEmpty(str3)) {
            str3 = WeexPageFragment.FRAGMENT_TAG;
        }
        if (supportFragmentManager.findFragmentByTag(str3) != null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(WeexPageFragment.FRAGMENT_ARG_TAG, str3);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, str2);
        } else {
            opp.c("-60002", "inner bundle url empty.", this.mParamForLog, this.mBundleUrl);
            this.mTracker.e("-60002", "inner bundle url empty.", fdv.F_PAGE_RENDER, new Object[0]);
        }
        if (hashMap != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (serializable != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        return Fragment.instantiate(fragmentActivity, WeexInnerPageFragment.class.getName(), bundle);
    }

    private void processFetchDataResult(Object obj, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a4c1ef", new Object[]{this, obj, new Long(j2)});
        } else if (this.mIsProcessedFetchDataResult) {
            opp.o("main-cost", "navFetchData has been processed");
        } else {
            this.mIsProcessedFetchDataResult = true;
            SoftReference<JSCallback> softReference = this.mFetchCallback;
            if (softReference == null || softReference.get() == null) {
                this.mDataResponseMap.put(CredentialRpcData.ACTION_FETCH, obj);
            } else {
                HashMap hashMap = new HashMap(2);
                hashMap.put("result", "success");
                hashMap.put(rb.RESULT_KEY, obj);
                this.mFetchCallback.get().invoke(hashMap);
                this.mFetchCallback.clear();
            }
            this.mTracker.r("dataPrefetch", System.currentTimeMillis() - j2);
            this.mDataPrefetchCost = System.currentTimeMillis() - j2;
            this.mDataPrefetchCostBegin = j2 - this.mCurrentClickTime;
            Coordinator.execute(new k("prefetchx-onComplete-shopRender", obj), 20);
        }
    }

    private void processParallelRender(String str) {
        String str2;
        Object obj;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c282d05d", new Object[]{this, str});
            return;
        }
        this.enabledParallelRender = true;
        opp.d("parallelRender", this.mShopNaviForLog, this.mParamUUIDForLog);
        this.mTracker.h("parallelRender", fdv.F_PAGE_RENDER);
        yqp.q(this.mQueryMap).put("innerUrl", str);
        recordCostTimeDetail("main-cost-render-inner", System.currentTimeMillis());
        HashMap<String, Object> extraOption = getExtraOption();
        StringBuilder sb = new StringBuilder(str);
        String config = OrangeConfig.getInstance().getConfig("shop_render", "blackListParam", "|wh_weex|_wx_tpl|wx_navbar_transparent|wx_navbar_hidden|wx_recycle_uuid|wx_recycle_biz|wx_recycle_max|data_prefetch|wh_prefetch|shopId|sellerId|pathInfo|pageId|");
        Map<String, String> map = this.mQueryMap;
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (!TextUtils.isEmpty(str4)) {
                    if (!config.contains("|" + str4 + "|")) {
                        sb.append("&");
                        sb.append(str4);
                        sb.append("=");
                        if (getQuery(str4) != null) {
                            sb.append(Uri.encode(getQuery(str4)));
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.mShopNavi)) {
            sb.append("&_useless2=2&parallelEmbed=true&_inNestedEmbed=true&inWeexShop=true&weexShopTabId=0.0&weexShopTransparentBG=true");
        } else if ("allitems".equals(this.mShopNavi)) {
            sb.append("&_useless3=3&parallelEmbed=true&_inNestedEmbed=true&inWeexShop=true&weexShopTabId=0.1");
        }
        String sb2 = sb.toString();
        this.mTargetInnerUrl = sb2;
        opp.e("main-cost inner targetInnerUrl is ", sb2);
        if (!Uri.parse(sb2).isHierarchical()) {
            opp.c("-60001", "url not Hierarchical.", sb2, this.mParamForLog, this.mBundleUrl);
            this.mTracker.e("-60001", "url not Hierarchical.", fdv.F_PAGE_RENDER, sb2);
            this.enabledParallelRender = false;
            return;
        }
        if (!this.mUseLocalJS || sDebugUseOnlineJS) {
            str2 = null;
        } else {
            reportAlarmInnerTemplateOverSeconds(sb2);
            long currentTimeMillis = System.currentTimeMillis();
            this.mTracker.t("innerJSLoad");
            str2 = e4x.t().q(sb2);
            this.mTracker.s("innerJSLoad");
            this.mInnerJSLoadCost = System.currentTimeMillis() - currentTimeMillis;
            this.mInnerJSLoadCostBegin = currentTimeMillis - this.mCurrentClickTime;
            cancelReportAlarmInnerTemplateOverSeconds();
        }
        this.mTracker.t("innerJSRender");
        this.mInnerJSRenderCostStart = System.currentTimeMillis();
        if (!this.mUseBackgroundJSThread || sDebugDisableWeexSDKBackThread) {
            opp.p("main-cost", "NOT using js back thread. No use_back_thread in extraOption ");
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("use_back_thread", "true");
            if (opp.f().booleanValue()) {
                hashMap.put("release_log", "true");
            }
            extraOption.put("extraOption", hashMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            extraOption.put("bundleUrl", sb2);
            synchronized (ShopRenderActivity.class) {
                try {
                    WeexPageFragment weexPageFragment = (WeexPageFragment) prepareFragment(this, str2, sb2, extraOption, "weex_page_shop_home", null);
                    if (weexPageFragment != null) {
                        weexPageFragment.setRenderListener(new r());
                        initFragment(this, R.id.shop_homepage_virtual, weexPageFragment, "weex_page_shop_home");
                        this.mInnerPageFragment = weexPageFragment;
                    }
                } finally {
                }
            }
            String str5 = this.mShopNaviForLog;
            String str6 = this.mParamUUIDForLog;
            if (str2 != null) {
                str3 = "innerTemplateLength=" + str2.length();
            } else {
                str3 = "innerTemplate is null";
            }
            opp.d("renderInnerByTemplate", str5, str6, str3);
        } else {
            synchronized (ShopRenderActivity.class) {
                try {
                    WeexPageFragment weexPageFragment2 = (WeexPageFragment) prepareFragment(this, null, sb2, extraOption, "weex_page_shop_home", null);
                    if (weexPageFragment2 != null) {
                        weexPageFragment2.setRenderListener(new r());
                        initFragment(this, R.id.shop_homepage_virtual, weexPageFragment2, "weex_page_shop_home");
                        this.mInnerPageFragment = weexPageFragment2;
                    }
                } finally {
                }
            }
            opp.d("renderInnerByUrl", this.mShopNaviForLog, this.mParamUUIDForLog, e4x.t().C(this, sb2));
            opp.o("main-cost", "renderInnerByUrl  注意。从网络加载了 JS-BUNDLE，理论上只会新装第一次出现。");
        }
        this.mInnerPageFragment.setProgressBarView(new l(this, null));
        if (str2 != null) {
            obj = Integer.valueOf(str2.hashCode());
        } else {
            obj = "innerTemplate is null";
        }
        showCostTime("main-cost", "after inner newInstanceWithXXX + setRenderListener ", obj);
        showCostTime("main-cost-render-inner", "inner fired");
        if (opp.f().booleanValue()) {
            opp.o("main-cost report WeexCacheHelper status after", e4x.t().C(this, sb2));
        }
        f fVar = new f();
        this.mErrorParallalRenderFailover = fVar;
        this.mHandler.postDelayed(fVar, this.mCheckTime + 1500);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object obj;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        wnp.b();
        try {
            Intent intent = getIntent();
            if (intent != null) {
                this.mTimeNavStart = intent.getLongExtra("WEEX_NAV_PROCESSOR_TIME", -1L);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mFirstLineOfOnCreate = System.currentTimeMillis();
        this.mParamUUIDForLog = UUID.randomUUID().toString();
        this.mTracker.c();
        this.mTracker.n(this.mParamUUIDForLog);
        opp.d("startActivity", "", this.mParamUUIDForLog);
        recordCostTimeDetail("main-cost", System.currentTimeMillis());
        showCostTime("main-cost", "after initUmbrellaPerformanceTracker");
        this.mTracker.t("activityOnCreate");
        hb0.c().a(this);
        if (opp.f().booleanValue()) {
            showToast("店铺私有窗体");
            opp.o("精彩从这里开始，店铺私有窗体 ");
        }
        showCostTime("main-cost", "after showToast");
        if (!isEnvironmentReady()) {
            if (WXEnvironment.isApkDebugable()) {
                Toast.makeText(this, "WEEX_SDK 初始化失败!", 0).show();
            }
            super.onCreate(bundle);
            Intent intent2 = getIntent();
            intent2.putExtra("degrade_type", DEGRADE_TYPE_INIT_ERROR);
            intent2.putExtra("degrade_msg", "WEEX_SDK 初始化失败!降级到h5");
            degradeToWindVane(intent2);
            AppMonitor.Alarm.commitFail("weex", "renderResult", generateAppMonitorArgs(), "99302", "weex framework init failed");
            finish();
        } else if (!isParamValid(getIntent())) {
            if (WXEnvironment.isApkDebugable()) {
                Toast.makeText(this, "参数非法!", 0).show();
            }
            super.onCreate(bundle);
            Intent intent3 = getIntent();
            intent3.putExtra("degrade_type", DEGRADE_TYPE_PARAMS_ERROR);
            StringBuilder sb = new StringBuilder("参数非法 ! 降级到h5! params==\n");
            if (getIntent().getData() != null) {
                str2 = getIntent().getData().toString();
            } else {
                str2 = "";
            }
            sb.append(str2);
            intent3.putExtra("degrade_msg", sb.toString());
            degradeToWindVane(intent3);
            AppMonitor.Alarm.commitFail("weex", "renderResult", generateAppMonitorArgs(), "99303", "error params");
            finish();
        } else {
            this.mTracker.g("url", this.mBundleUrl);
            showCostTime("main-cost", "after param valid");
            opp.d("totalCount", this.mShopNaviForLog, this.mParamUUIDForLog);
            this.mTracker.h("totalCount", fdv.F_PAGE_RENDER);
            chooseAppBarMode(bundle);
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
            String prepareShopId = prepareShopId();
            String str3 = null;
            this.mFetchDataListener = new m(this, null);
            NavPrefetchShopFetchManager.getInstance().setFetchDataListener(prepareShopId, this.mFetchDataListener);
            showCostTime("main-cost", "after navFetchData setFetchDataListener");
            processPreVisitCdnDowngrade();
            showCostTime("main-cost", "after processPreVisitCdnDowngrade async");
            if (TextUtils.isEmpty(this.mShopNavi)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, ShopConstants.PAGE_SHOP);
            } else if ("allitems".equals(this.mShopNavi) && "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "data_prefetch_page_allitems", "true"))) {
                try {
                    this.mAllItemsDatasource = ShopDatasourceCreator.getInstance().obtainDatasource(this.mQueryMap);
                } catch (Throwable th) {
                    opp.b("-52026", "error in allitems prefetch data.", th, this.mParamForLog, this.mBundleUrl);
                    this.mTracker.d("-52026", "error in allitems prefetch data.", fdv.F_DATA_PROCESS, th, new Object[0]);
                }
            }
            showCostTime("main-cost", "after chooseAppBarMode (include super.onCreate() )");
            setContentView(R.layout.shop_render_activity_root_layout);
            prepareStatusBar();
            hideAppBar();
            if (WXEnvironment.isApkDebugable()) {
                stw.b = !opp.l();
                stw stwVar = new stw(this);
                this.mAnalyzerDelegate = stwVar;
                stwVar.a();
            }
            HashMap<String, Object> extraOption = getExtraOption();
            showCostTime("main-cost", "after setContentView + prepareStatusBar + WXAnalyzerDelegate + getExtraOption");
            recordCostTimeDetail("main-cost-render-frame", System.currentTimeMillis());
            opp.e("main-cost frame mBundleUrl is ", this.mBundleUrl);
            this.mTracker.s("activityOnCreate");
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.mFirstLineOfOnCreate;
            this.mActivityPrepareCost = currentTimeMillis - j2;
            this.mActivityPrepareCostBegin = j2 - this.mCurrentClickTime;
            if (this.mUseLocalJS && !sDebugUseOnlineJS) {
                reportAlarmFrameTemplateOverSeconds(this.mBundleUrl);
                long currentTimeMillis2 = System.currentTimeMillis();
                this.mTracker.t("frameJSLoad");
                String q2 = e4x.t().q(this.mBundleUrl);
                this.mTracker.s("frameJSLoad");
                this.mFrameJSLoadCost = System.currentTimeMillis() - currentTimeMillis2;
                this.mFrameJSLoadCostBegin = currentTimeMillis2 - this.mCurrentClickTime;
                cancelReportAlarmFrameTemplateOverSeconds();
                str3 = q2;
            }
            this.mFrameJSRenderCostStart = System.currentTimeMillis();
            this.mTracker.t("frameJSRender");
            if (!TextUtils.isEmpty(str3)) {
                extraOption.put("bundleUrl", this.mBundleUrl);
                synchronized (ShopRenderActivity.class) {
                    this.mPageFragment = (WeexPageFragment) WeexPageFragment.newInstanceWithTemplate(this, WeexPageFragment.class, str3, this.mBundleUrl, extraOption, (String) null, R.id.shop_render_root_layout);
                }
                String str4 = this.mShopNaviForLog;
                String str5 = this.mParamUUIDForLog;
                Long valueOf = Long.valueOf(this.mFrameJSLoadCost);
                if (str3 != null) {
                    str = "frameTemplateLength=" + str3.length();
                } else {
                    str = "frameTemplate is null";
                }
                opp.d("renderFrameByTemplate", str4, str5, valueOf, str);
            } else {
                synchronized (ShopRenderActivity.class) {
                    this.mPageFragment = (WeexPageFragment) WeexPageFragment.newInstanceWithUrl(this, WeexPageFragment.class, this.mWeexUrl, this.mBundleUrl, extraOption, null, R.id.shop_render_root_layout);
                }
                opp.d("renderFrameByUrl", this.mShopNaviForLog, this.mParamUUIDForLog, e4x.t().C(this, this.mBundleUrl));
                opp.o("main-cost", "renderFrameByUrl 注意。从网络加载了 JS-BUNDLE，理论上只会新装第一次出现。");
            }
            if (opp.f().booleanValue()) {
                opp.o("main-cost report WeexCacheHelper status after", e4x.t().C(this, this.mBundleUrl));
            }
            this.mPageFragment.getArguments().putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, this.mBundleUrl);
            this.mPageFragment.setRenderListener(new s());
            this.mPageFragment.setUserTrackEnable(false);
            this.mPageFragment.setNavBarAdapter(new ypp(this, this.mQueryMap));
            reportAlarmFrameRenderNoResponse();
            if (str3 != null) {
                obj = Integer.valueOf(str3.hashCode());
            } else {
                obj = "frameTemplate is null";
            }
            showCostTime("main-cost", "after frame newInstanceWithXXX + setRenderListener", obj);
            showCostTime("main-cost-render-frame", "frame fired");
            registerComponentCallbacks(this.mLowMemoryTrim);
            showCostTime("main-cost", "activity onCreate end.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        if ("child".equals(r9) == false) goto L_0x0053;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendGlobalEvent(java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.String r9, com.taobao.weex.bridge.JSCallback r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.shop.activity.ShopRenderActivity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "39cc5579"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001e:
            java.lang.String r3 = "frame"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L_0x0055
            java.lang.String r3 = "main"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L_0x0055
            java.lang.String r3 = "parent"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0039
            goto L_0x0055
        L_0x0039:
            java.lang.String r3 = "inner"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L_0x0057
            java.lang.String r3 = "back"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L_0x0057
            java.lang.String r3 = "child"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            r2 = 1
            goto L_0x0057
        L_0x0055:
            r1 = 0
            goto L_0x0053
        L_0x0057:
            if (r1 == 0) goto L_0x006c
            com.alibaba.aliweex.bundle.WeexPageFragment r9 = r6.mInnerPageFragment
            if (r9 == 0) goto L_0x006c
            com.taobao.weex.WXSDKInstance r9 = r9.getWXSDKInstance()
            if (r9 == 0) goto L_0x006c
            com.alibaba.aliweex.bundle.WeexPageFragment r9 = r6.mInnerPageFragment
            com.taobao.weex.WXSDKInstance r9 = r9.getWXSDKInstance()
            r9.B(r7, r8)
        L_0x006c:
            if (r2 == 0) goto L_0x0081
            com.alibaba.aliweex.bundle.WeexPageFragment r9 = r6.mPageFragment
            if (r9 == 0) goto L_0x0081
            com.taobao.weex.WXSDKInstance r9 = r9.getWXSDKInstance()
            if (r9 == 0) goto L_0x0081
            com.alibaba.aliweex.bundle.WeexPageFragment r9 = r6.mPageFragment
            com.taobao.weex.WXSDKInstance r9 = r9.getWXSDKInstance()
            r9.B(r7, r8)
        L_0x0081:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>(r0)
            java.lang.String r8 = "result"
            java.lang.String r9 = "success"
            r7.put(r8, r9)
            r10.invoke(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.sendGlobalEvent(java.lang.String, java.util.Map, java.lang.String, com.taobao.weex.bridge.JSCallback):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(22:2|(1:4)|5|82|6|(1:8)(1:11)|(4:13|(1:15)(1:16)|17|(18:19|(1:21)(1:22)|23|(1:25)(3:26|(2:31|(1:33)(1:(1:35)))|36)|38|84|43|(1:45)(1:46)|47|(1:49)|52|(3:54|(1:56)|57)|(1:59)(3:60|(2:65|(1:67)(1:(1:69)(1:70)))|71)|72|76|(1:78)(1:79)|80|81))|37|38|84|43|(0)(0)|47|(0)|52|(0)|(0)(0)|72|76|(0)(0)|80|81) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0171, code lost:
            if ("true".equals(com.taobao.orange.OrangeConfig.getInstance().getConfig("shop_render", "report_error_of_exception", "true")) != false) goto L_0x0173;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0173, code lost:
            tb.opp.b("-52032", "error in checking mRenderListener is null ByWeexSDKInstance.", r0, com.taobao.android.shop.activity.ShopRenderActivity.access$1200(r21.f9382a), r21.f9382a.mBundleUrl);
            com.taobao.android.shop.activity.ShopRenderActivity.access$1300(r21.f9382a).d("-52032", "error in checking mRenderListener is null ByWeexSDKInstance.", tb.fdv.F_PAGE_RENDER, r0, new java.lang.Object[0]);
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0118 A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:43:0x00f5, B:47:0x0101, B:49:0x0118, B:52:0x0129, B:54:0x012d, B:57:0x0138, B:60:0x0148, B:62:0x014c, B:65:0x0151), top: B:84:0x00f5 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012d A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:43:0x00f5, B:47:0x0101, B:49:0x0118, B:52:0x0129, B:54:0x012d, B:57:0x0138, B:60:0x0148, B:62:0x014c, B:65:0x0151), top: B:84:0x00f5 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0148 A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:43:0x00f5, B:47:0x0101, B:49:0x0118, B:52:0x0129, B:54:0x012d, B:57:0x0138, B:60:0x0148, B:62:0x014c, B:65:0x0151), top: B:84:0x00f5 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 585
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.b.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class q implements w11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f9398a;
        public long b;
        public long c;
        public final AtomicBoolean d;
        public final AtomicBoolean e;

        static {
            t2o.a(764411940);
        }

        public q() {
            this.f9398a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.d = new AtomicBoolean(false);
            this.e = new AtomicBoolean(false);
        }

        @Override // com.taobao.application.common.IPageListener
        public void onPageChanged(String str, int i, long j) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
            } else if (!"com.taobao.android.shop.activity.PerfPanelFragment".equals(str)) {
                if (this.f9398a == 0) {
                    this.f9398a = j;
                }
                if (2 == i) {
                    this.b = j;
                } else if (3 == i) {
                    try {
                        this.c = j;
                        ShopRenderActivity.this.mApmInteractiveCost = j - this.f9398a;
                        HashMap hashMap = new HashMap();
                        long j2 = this.b;
                        if (j2 > 0) {
                            long j3 = this.f9398a;
                            if (j3 > 0) {
                                hashMap.put("visible", Long.valueOf(j2 - j3));
                            }
                        }
                        long j4 = this.f9398a;
                        if (j4 > 0) {
                            hashMap.put(lca.STAGE_INTERACTIVE, Long.valueOf(this.c - j4));
                        }
                        if (TextUtils.isEmpty(ShopRenderActivity.access$1800(ShopRenderActivity.this))) {
                            str2 = "home";
                        } else {
                            str2 = ShopRenderActivity.access$1800(ShopRenderActivity.this);
                        }
                        hashMap.put("page", str2);
                        if (str != null && "com.taobao.android.shop.activity.ShopRenderActivity$WeexInnerPageFragment".equals(str)) {
                            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                            shopRenderActivity.showTotalCostLog("apm_render_finish", shopRenderActivity.mApmInteractiveCost, null);
                            this.e.set(true);
                        } else if (str != null && "allitems".equals(ShopRenderActivity.access$1800(ShopRenderActivity.this)) && !this.e.get()) {
                            ShopRenderActivity shopRenderActivity2 = ShopRenderActivity.this;
                            shopRenderActivity2.showTotalCostLog("apm_render_finish", shopRenderActivity2.mApmInteractiveCost, hashMap);
                            this.e.set(true);
                        }
                        if (ShopRenderActivity.access$1900(ShopRenderActivity.this) != null && !TextUtils.isEmpty(ShopRenderActivity.access$1900(ShopRenderActivity.this).getRenderUrl()) && ShopRenderActivity.access$1900(ShopRenderActivity.this).getWXSDKInstance() != null && this.d.compareAndSet(false, true)) {
                            ShopRenderActivity.access$1900(ShopRenderActivity.this).getWXSDKInstance().B("native_apm", hashMap);
                        }
                    } catch (Throwable th) {
                        opp.b("-52014", "error in Apm onPageChanged.", th, str, Integer.valueOf(i), ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                        ShopRenderActivity.access$1300(ShopRenderActivity.this).d("-52014", "error in Apm onPageChanged.", "eventProcess", th, str, Integer.valueOf(i));
                    }
                }
            }
        }

        public /* synthetic */ q(ShopRenderActivity shopRenderActivity, e eVar) {
            this();
        }
    }

    public void recordCostTime(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0d6648", new Object[]{this, str, new Long(j2)});
        } else if (opp.f().booleanValue()) {
            if (this.startTimeForLog.containsKey(str)) {
                opp.o("shop", "ShopCost", " warning 重复的耗时记录key " + str + " delta time is " + (j2 - this.startTimeForLog.get(str).longValue()) + " ms");
            }
            this.startTimeForLog.put(str, Long.valueOf(j2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #6 {all -> 0x00b4, blocks: (B:40:0x00b0, B:45:0x00be, B:47:0x00e2, B:49:0x00e8, B:51:0x00ff, B:52:0x010c, B:53:0x010e, B:55:0x011b, B:56:0x0124, B:57:0x0126, B:59:0x0134, B:60:0x0141, B:61:0x0143), top: B:93:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8 A[Catch: all -> 0x010a, TryCatch #6 {all -> 0x00b4, blocks: (B:40:0x00b0, B:45:0x00be, B:47:0x00e2, B:49:0x00e8, B:51:0x00ff, B:52:0x010c, B:53:0x010e, B:55:0x011b, B:56:0x0124, B:57:0x0126, B:59:0x0134, B:60:0x0141, B:61:0x0143), top: B:93:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void degradeToWindVane(android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.degradeToWindVane(android.content.Intent):void");
    }

    public void getShopData(String str, Map<String, String> map, JSCallback jSCallback) {
        Object obj;
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9d9e6a", new Object[]{this, str, map, jSCallback});
            return;
        }
        recordCostTime("getData " + str, System.currentTimeMillis());
        if (CredentialRpcData.ACTION_FETCH.equals(str)) {
            obj = this.mDataResponseMap.get(str);
            if (obj == null) {
                opp.p("main-cost", "fetch 数据未准备完成 异步。 getting fetch async. but native has NOT got value.");
                this.mFetchCallback = new SoftReference<>(jSCallback);
            }
        } else if ("pagedata".equals(str)) {
            obj = this.mDataResponseMap.get(str);
            if (obj == null) {
                opp.o("main-cost", "pagedata 数据未准备完成 异步。 getting pagedata async. but native has NOT got value.");
                this.mPagedataCallback = new SoftReference<>(jSCallback);
            }
        } else if ("downgrade".equals(str)) {
            obj = this.mDataResponseMap.get(str);
        } else if (!"viewport".equals(str) || (weexPageFragment = this.mPageFragment) == null || weexPageFragment.getWXSDKInstance() == null) {
            obj = null;
        } else {
            float webPxByWidth = WXViewUtils.getWebPxByWidth(this.mPageFragment.getWXSDKInstance().getContainerView().getHeight(), this.mPageFragment.getWXSDKInstance().P());
            HashMap hashMap = new HashMap(2);
            hashMap.put("height", Float.valueOf(webPxByWidth));
            obj = hashMap;
        }
        if (obj != null) {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("result", "success");
            hashMap2.put(rb.RESULT_KEY, obj);
            opp.o("main-cost", "invoke callback, action is", str);
            jSCallback.invoke(hashMap2);
        }
        showCostTime("getData async " + str, obj == null ? "null" : "has return value");
    }

    private void findImageUrlInJson(JSONObject jSONObject, List<p> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5879205", new Object[]{this, jSONObject, list, map});
        } else if (list.size() < 3) {
            try {
                if (jSONObject.containsKey("width")) {
                    map.put("width", jSONObject.getFloat("width"));
                }
                if (jSONObject.containsKey(AliFestivalWVPlugin.PARAMS_MODULE_NAME)) {
                    map.put(AliFestivalWVPlugin.PARAMS_MODULE_NAME, jSONObject.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME));
                }
            } catch (Throwable unused) {
            }
            for (String str : jSONObject.keySet()) {
                if (!"defaultImage".equals(str) && !"designer_image_url".equals(str)) {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!TextUtils.isEmpty(str2) && (str2.contains(".png") || str2.contains(".jpg"))) {
                            if (str2.contains("gw.alicdn.com") || str2.contains("img.alicdn.com")) {
                                try {
                                    Float f2 = null;
                                    if ("bgImageUrl".equals(str)) {
                                        p pVar = new p(null);
                                        pVar.f9397a = str2;
                                        pVar.b = "_640x640q90.jpg";
                                        list.add(pVar);
                                    } else if ("shopLogo".equals(str)) {
                                        p pVar2 = new p(null);
                                        pVar2.f9397a = str2;
                                        pVar2.b = "_200x200q90.jpg";
                                        list.add(pVar2);
                                    } else if (jSONObject.containsKey("height") && !TextUtils.isEmpty(jSONObject.getString("height")) && jSONObject.getFloat("height").floatValue() >= 200.0f) {
                                        p pVar3 = new p(null);
                                        pVar3.f9397a = str2;
                                        if (jSONObject.containsKey("width")) {
                                            f2 = jSONObject.getFloat("width");
                                        }
                                        if (f2 == null && map.get("width") != null) {
                                            f2 = Float.valueOf(Float.parseFloat(String.valueOf(map.get("width"))));
                                        }
                                        if (f2 != null && (f2.floatValue() == 640.0f || f2.floatValue() == 750.0f)) {
                                            pVar3.c = true;
                                        }
                                        if (map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME) != null && "11ace51f080ed1dac402cc6ed3c883db".equals(map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME))) {
                                            pVar3.d = true;
                                        }
                                        list.add(pVar3);
                                        if (list.size() >= 3) {
                                            return;
                                        }
                                    }
                                } catch (Throwable th) {
                                    opp.b("-52004", "error in process preload image.", th, this.mParamForLog, this.mBundleUrl);
                                    this.mTracker.d("-52004", "error in process preload image.", fdv.F_PAGE_RENDER, th, new Object[0]);
                                }
                            }
                        }
                    } else if (obj instanceof JSONObject) {
                        findImageUrlInJson((JSONObject) obj, list, map);
                    } else if (obj instanceof JSONArray) {
                        Iterator<Object> it = ((JSONArray) obj).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof JSONObject) {
                                findImageUrlInJson((JSONObject) next, list, map);
                            }
                        }
                    }
                }
            }
        }
    }

    public void showTotalCostLog(String str, long j2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380938c2", new Object[]{this, str, new Long(j2), map});
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if ("allitems".equals(this.mShopNavi) && map != null && map.containsKey("visible")) {
            valueOf = (Long) map.get("visible");
        }
        long longValue = valueOf.longValue();
        long j3 = this.mCurrentClickTime;
        if (j3 <= 0) {
            j3 = this.mActivityInitTime;
        }
        this.mTotalCost = longValue - j3;
        if (j2 > 0) {
            this.mTotalCost = j2;
        }
        String str2 = opp.i("main-cost", "totalCost is ", Long.valueOf(this.mTotalCost), "ms", "[ activityInitTime to", str, "]") + opp.i("Detail: ", "interactive=", Long.valueOf(this.mApmInteractiveCost), "router=", Long.valueOf(this.mRouterCost), "activityPrepare=", Long.valueOf(this.mActivityPrepareCost), "dataPrefetch=", Long.valueOf(this.mDataPrefetchCost), "frameJSLoad=", Long.valueOf(this.mFrameJSLoadCost), "frameJSRender=", Long.valueOf(this.mFrameJSRenderCost), "innerJSLoad=", Long.valueOf(this.mInnerJSLoadCost), "innerJSRender=", Long.valueOf(this.mInnerJSRenderCost), "totalUmbrellaCost=", Long.valueOf(this.mTracker.b()), "deviceLevel=", this.mDeviceLevel);
        if (map != null && map.size() > 0) {
            str2 = str2 + " extra arg is " + map.toString();
        }
        Log.e(TAG, str2);
        this.mTracker.r("pageLoad", j2);
        this.mReadyToShowPerfPanel = true;
        if (mShowPerfPanel) {
            showPerfPanel();
            opp.d("auto_showPerfPanel", this.mShopNaviForLog, this.mParamUUIDForLog);
        }
    }
}
