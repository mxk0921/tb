package com.taobao.weex.weexv2.page;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.core.util.Pair;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.acq;
import tb.bzr;
import tb.d7r;
import tb.dwh;
import tb.jjx;
import tb.jwh;
import tb.npc;
import tb.psw;
import tb.qsw;
import tb.w4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WeexV2Activity extends CustomBaseActivity implements WeexFragment.c, npc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    private static final String DEGRADE_MSG = "degrade_msg";
    private static final String DEGRADE_TYPE = "degrade_type";
    private static final String DEGRADE_TYPE_INIT_ERROR = "DEGRADE_TYPE_INIT_ERROR";
    private static final String DEGRADE_TYPE_JS_ERROR = "DEGRADE_TYPE_JS_ERROR";
    private static final String DEGRADE_TYPE_PARAMS_ERROR = "DEGRADE_TYPE_PARAMS_ERROR";
    public static final String EXTRA_BUNDLE_URL = "secondFloorBundleUrl";
    private static final String FROM = "_wx_f_";
    private static final String FROM_WEEX = "1";
    private static final String FROM_WEEX_DEGRADE_H5 = "2";
    private static final String HIDDEN_STATUS_BAR_WITH_DARK_TEXT = "hidden_dark_text";
    private static final String HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT = "hidden_light_text";
    private static final String KEY_BROADCAST_DATA_WHITE = "com.taobao.android.abnormal.action.weex.white";
    private static final String KEY_BUNDLE_URL = "bundleUrl";
    private static final String KEY_MUS_TPL = "_mus_tpl";
    private static final String NAV_HIDDEN = "wx_navbar_hidden";
    private static final String NAV_OVERLAY = "wx_navbar_transparent";
    private static final String ORIENTATION = "orientation";
    private static final String ORIENTATION_VALUE_LANDSCAPE = "landscape";
    private static final String TAG = "WXActivity";
    private static final String WEEX_ORIGINAL_URL = "weex_original_url";
    public static final String WH_QUERY_FALSE = "wh_weex=false";
    public static final String WH_QUERY_TRUE = "wh_weex=true";
    private static final String WX_APPBAR = "_wx_appbar";
    private static final String WX_KEY_INIT_DATA = "initData";
    private static final String WX_SECURE = "wx_secure";
    private static final String WX_STATUSBAR_HIDDEN = "_wx_statusbar_hidden";
    private static final String WX_STATUSBAR_HIDDEN2 = "wx_statusbar_hidden";
    private static final String WX_VIEW_TRANSPARENT = "wx_root_transparent";
    private static volatile Boolean usePrefetchXUrlMapping;
    private String mBundleUrl;
    private ImageView mFakeTitle;
    private JSONObject mInitData;
    private com.taobao.android.weex_ability.page.a mMusNavigationAdapter;
    private WeexFragment mPageFragment;
    private String mPageName;
    private String mPageUserInfo;
    private String mWeexUrl;
    private String mWeexUserInfo;
    private String musUrl;
    public TBActionView overflowButton;
    private String webUrl;
    private long mNavStartTime = -1;
    private long mContainerStartTime = -1;
    private boolean mMainHcNaviShow = false;
    private boolean mIsDegrade = false;
    private boolean actionBarOverlay = false;
    private boolean isMainHc = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum StatusBarTextColor {
        Dark,
        Light,
        Undefine;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StatusBarTextColor statusBarTextColor, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/WeexV2Activity$StatusBarTextColor");
        }

        public static StatusBarTextColor valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatusBarTextColor) ipChange.ipc$dispatch("c86c9a26", new Object[]{str});
            }
            return (StatusBarTextColor) Enum.valueOf(StatusBarTextColor.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                WeexV2Activity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
                WeexV2Activity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$weex$weexv2$page$WeexV2Activity$StatusBarTextColor;

        static {
            int[] iArr = new int[StatusBarTextColor.values().length];
            $SwitchMap$com$taobao$weex$weexv2$page$WeexV2Activity$StatusBarTextColor = iArr;
            try {
                iArr[StatusBarTextColor.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$weex$weexv2$page$WeexV2Activity$StatusBarTextColor[StatusBarTextColor.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void addMSFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e81e7e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WMInstanceApm.KEY_PAGE_STAGES_NAV_START, String.valueOf(this.mNavStartTime));
        hashMap.put(WMInstanceApm.KEY_PAGE_STAGES_STANDARD_CONTAINER_START, String.valueOf(this.mContainerStartTime));
        WeexFragment B2 = WeexFragment.B2(this.musUrl, this.webUrl, null, this.mInitData, hashMap);
        this.mPageFragment = B2;
        B2.R2(this);
        this.mPageFragment.T2(this);
        getApplication();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.wa_plus_root_layout, this.mPageFragment, "ali_mus_fragment_tag");
        beginTransaction.commit();
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
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void chooseAppBarMode(android.os.Bundle r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.weexv2.page.WeexV2Activity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "2b854301"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            boolean r0 = r4.useWXappbar()
            if (r0 == 0) goto L_0x0024
            int r0 = com.taobao.taobao.R.style.Theme_NoBackgroundAndTitle_NoActionBar
            r4.setTheme(r0)
            super.onCreate(r5)
            goto L_0x0060
        L_0x0024:
            r0 = 8
            r1 = -3
            boolean r2 = r4.isAppBarOverlay()     // Catch: all -> 0x003e, Exception -> 0x0050
            r4.actionBarOverlay = r2     // Catch: all -> 0x003e, Exception -> 0x0050
            boolean r2 = r4.isMainHc()     // Catch: all -> 0x003e, Exception -> 0x0050
            r4.isMainHc = r2     // Catch: all -> 0x003e, Exception -> 0x0050
            boolean r3 = r4.actionBarOverlay     // Catch: all -> 0x003e, Exception -> 0x0050
            if (r3 != 0) goto L_0x0040
            if (r2 == 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            r4.supportRequestWindowFeature(r0)     // Catch: all -> 0x003e, Exception -> 0x0050
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            goto L_0x0061
        L_0x0040:
            r2 = 9
            r4.supportRequestWindowFeature(r2)     // Catch: all -> 0x003e, Exception -> 0x0050
        L_0x0045:
            android.view.Window r0 = r4.getWindow()
            r0.setFormat(r1)
            super.onCreate(r5)
            goto L_0x0054
        L_0x0050:
            r4.supportRequestWindowFeature(r0)     // Catch: all -> 0x003e
            goto L_0x0045
        L_0x0054:
            androidx.appcompat.app.ActionBar r5 = r4.getSupportActionBar()
            if (r5 == 0) goto L_0x0060
            java.lang.String r0 = "手机淘宝"
            r5.setTitle(r0)
        L_0x0060:
            return
        L_0x0061:
            android.view.Window r2 = r4.getWindow()
            r2.setFormat(r1)
            super.onCreate(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.weexv2.page.WeexV2Activity.chooseAppBarMode(android.os.Bundle):void");
    }

    private void initFragmentWithAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d37410", new Object[]{this});
            return;
        }
        addMSFragment();
        jwh jwhVar = new jwh(this);
        this.mMusNavigationAdapter = jwhVar;
        this.mPageFragment.Q2(jwhVar);
    }

    public static /* synthetic */ Object ipc$super(WeexV2Activity weexV2Activity, String str, Object... objArr) {
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
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
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
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/WeexV2Activity");
        }
    }

    private boolean isServerLimit(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e70bbc", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i != 0 || TextUtils.isEmpty(str) || !str.startsWith("download failed: code: 1004")) {
            return false;
        }
        if (str.contains("invalid status code 403,") || str.contains("invalid status code 429,") || str.contains("invalid status code 503,") || str.contains("invalid status code 502,")) {
            return true;
        }
        return false;
    }

    private void pageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8515761a", new Object[]{this});
        } else {
            this.mContainerStartTime = System.currentTimeMillis();
        }
    }

    private void parseIntent() {
        String str;
        String stringExtra;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcc8036", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            this.mNavStartTime = intent.getLongExtra("NAV_TO_URL_START_TIME", -1L);
            this.webUrl = data.toString();
            if (data.isHierarchical()) {
                str = data.getQueryParameter(KEY_MUS_TPL);
            } else {
                str = "";
            }
            if (data.isHierarchical() && "true".equals(data.getQueryParameter("wh_weex"))) {
                String stringExtra2 = intent.getStringExtra("weexV2BundleUrl");
                if (TextUtils.isEmpty(stringExtra2)) {
                    if (!TextUtils.isEmpty(intent.getStringExtra(EXTRA_BUNDLE_URL))) {
                        String str2 = stringExtra.replace(WH_QUERY_FALSE, "wh_weex=true") + "&wx_mute_loading_indicator=true";
                        if (!TextUtils.isEmpty(str2)) {
                            intent.putExtra("weexBundleUrl", str2);
                            intent.putExtra("weexUrl", str2);
                            stringExtra2 = str2;
                        }
                    }
                }
                this.webUrl = stringExtra2;
                if (!TextUtils.isEmpty(stringExtra2)) {
                    Uri parse = Uri.parse(this.webUrl);
                    if (parse.isHierarchical()) {
                        String queryParameter = parse.getQueryParameter(KEY_MUS_TPL);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.musUrl = queryParameter;
                            this.webUrl = this.webUrl.replaceFirst("wh_weex=true", WH_QUERY_FALSE);
                        } else {
                            this.musUrl = this.webUrl;
                        }
                    } else {
                        this.musUrl = this.webUrl;
                    }
                }
                Serializable serializableExtra = getIntent().getSerializableExtra("initData");
                if (serializableExtra instanceof JSONObject) {
                    this.mInitData = (JSONObject) serializableExtra;
                } else if (serializableExtra instanceof Map) {
                    this.mInitData = new JSONObject((Map) serializableExtra);
                }
            } else if (!TextUtils.isEmpty(str)) {
                this.musUrl = str;
            }
            String path = data.getPath();
            if (path != null) {
                setUTPageName(path);
            }
        }
    }

    private void prepareStatusBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bd901", new Object[]{this});
            return;
        }
        Pair<Boolean, StatusBarTextColor> hideStatusBar = hideStatusBar();
        if (hideStatusBar.first.booleanValue()) {
            View findViewById = findViewById(R.id.wa_plus_root_layout);
            findViewById.setFitsSystemWindows(true);
            int i = c.$SwitchMap$com$taobao$weex$weexv2$page$WeexV2Activity$StatusBarTextColor[hideStatusBar.second.ordinal()];
            if (i == 1) {
                new SystemBarDecorator(this).enableImmersiveStatusBar(true);
            } else if (i == 2) {
                new SystemBarDecorator(this).enableImmersiveStatusBar(false);
            }
            ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener(this) { // from class: com.taobao.weex.weexv2.page.WeexV2Activity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (WindowInsetsCompat) ipChange2.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
                    }
                    return windowInsetsCompat.consumeSystemWindowInsets();
                }
            });
        }
    }

    private void setScreenCaptureEnabledOrNot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e3f44e", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mWeexUrl)) {
            try {
                if ("true".equalsIgnoreCase(Uri.parse(this.mWeexUrl).getQueryParameter(WX_SECURE))) {
                    getWindow().addFlags(8192);
                } else {
                    getWindow().clearFlags(8192);
                }
            } catch (Throwable th) {
                dwh.h(TAG, th);
            }
        }
    }

    private void showPredefinedAppbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f213071c", new Object[]{this});
        } else if (useWXappbar()) {
            View findViewById = findViewById(R.id.weex_appbar);
            if (findViewById instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) findViewById;
                imageButton.setVisibility(0);
                imageButton.setOnClickListener(new b());
            }
        }
    }

    private boolean useWXappbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39e42685", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            dwh.h(TAG, e);
        }
        if (TextUtils.equals(Uri.parse(this.mWeexUrl).getQueryParameter("_wx_appbar"), Boolean.toString(true))) {
            return true;
        }
        return false;
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

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return hideStatusBar().first.booleanValue();
    }

    public boolean isInterceptOnBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a8a08f", new Object[]{this})).booleanValue();
        }
        WeexFragment weexFragment = this.mPageFragment;
        if (weexFragment == null || weexFragment.isDetached() || !this.mPageFragment.onBackPressed()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexFragment weexFragment = this.mPageFragment;
        if (weexFragment != null) {
            weexFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        parseIntent();
        if (!isParamValid(getIntent())) {
            super.onCreate(bundle);
            Intent intent = getIntent();
            intent.putExtra("degrade_type", DEGRADE_TYPE_PARAMS_ERROR);
            if (getIntent().getData() != null) {
                str = getIntent().getData().toString();
            } else {
                str = "null";
            }
            intent.putExtra("degrade_msg", "参数非法 ! 降级到h5! params is " + str);
            return;
        }
        d7r.a(this);
        pageStart();
        setScreenCaptureEnabledOrNot();
        chooseAppBarMode(bundle);
        setContentView(R.layout.weex2_activity_root_layout);
        parseUrlForContainer();
        showPredefinedAppbar();
        prepareStatusBar();
        this.mPageName = assemblePageName(this.mBundleUrl);
        hideAppBar();
        initFragmentWithAdapter();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        com.taobao.android.weex_ability.page.a aVar = this.mMusNavigationAdapter;
        if (aVar != null) {
            aVar.e(null, menu);
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if (menu != null) {
            try {
                if (menu.findItem(R.id.uik_menu_overflow) == null) {
                }
                i = R.id.uik_menu_overflow;
                if (menu.findItem(i) != null || menu.findItem(i).getActionView() == null) {
                    this.overflowButton = getPublicMenu().getCustomOverflow();
                    getPublicMenu().setCustomOverflow(this.overflowButton);
                } else {
                    this.overflowButton = (TBActionView) menu.findItem(i).getActionView();
                }
            } catch (Exception e) {
                dwh.b(TAG, "error in find overflow menu button. " + e.getMessage());
            }
            return onCreateOptionsMenu;
        }
        menu = new TBPublicMenu(this).onCreateOptionsMenu(getMenuInflater(), menu);
        i = R.id.uik_menu_overflow;
        if (menu.findItem(i) != null) {
        }
        this.overflowButton = getPublicMenu().getCustomOverflow();
        getPublicMenu().setCustomOverflow(this.overflowButton);
        return onCreateOptionsMenu;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBPublicMenu publicMenu = getPublicMenu();
        if (publicMenu != null) {
            publicMenu.hide();
        }
        try {
            WeexFragment weexFragment = this.mPageFragment;
            if (weexFragment != null) {
                weexFragment.onDestroy();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    public void onFatalException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba6b641", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    public void onForeground(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc5c834", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || !isInterceptOnBackPressed()) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
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
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (isInterceptOnBackPressed() || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        dwh.e("onRenderFailed: type:" + i + ",errorMsg:" + str);
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.isMainHc) {
            setNaviTransparent(this.mMainHcNaviShow);
        } else if (this.actionBarOverlay) {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(17170445));
            }
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        String str = this.mPageUserInfo;
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", this.mBundleUrl);
            bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, bundle2);
        } else {
            Bundle bundle3 = new Bundle();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.mPageUserInfo);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle3.putString(next, jSONObject.optString(next));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, bundle3);
        }
        return bundle;
    }

    public void setNaviTransparent(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15858463", new Object[]{this, new Boolean(z)});
        } else if (isMainHc()) {
            this.mMainHcNaviShow = z;
            if (this.mFakeTitle == null) {
                this.mFakeTitle = (ImageView) findViewById(R.id.fake_title);
            }
            View findViewById = findViewById(R.id.action_bar);
            if (z) {
                ViewGroup.LayoutParams layoutParams = this.mFakeTitle.getLayoutParams();
                if (findViewById != null) {
                    layoutParams.height = findViewById.getHeight();
                    this.mFakeTitle.setLayoutParams(layoutParams);
                }
                this.mFakeTitle.setVisibility(0);
            } else {
                this.mFakeTitle.setVisibility(8);
            }
            View findViewById2 = findViewById(R.id.action_bar_container);
            if (z) {
                i = 17170443;
            } else {
                i = 17170445;
            }
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(i));
            }
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(i));
            }
        }
    }

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
        } else {
            this.mPageUserInfo = str;
        }
    }

    private void hideAppBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcdf49b", new Object[]{this});
            return;
        }
        try {
            String queryParameter = Uri.parse(this.mWeexUrl).getQueryParameter("wx_navbar_hidden");
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null && TextUtils.equals(queryParameter, Boolean.toString(true))) {
                supportActionBar.hide();
            }
        } catch (Exception e) {
            dwh.h(TAG, e);
        }
    }

    private Pair<Boolean, StatusBarTextColor> hideStatusBar() {
        String queryParameter;
        String queryParameter2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("aa8b7b1a", new Object[]{this});
        }
        int i = Build.VERSION.SDK_INT;
        try {
            Uri parse = Uri.parse(this.mWeexUrl);
            queryParameter = parse.getQueryParameter(WX_STATUSBAR_HIDDEN);
            queryParameter2 = parse.getQueryParameter(WX_STATUSBAR_HIDDEN2);
        } catch (Exception e) {
            dwh.h(TAG, e);
        }
        if (!TextUtils.equals(queryParameter, Boolean.toString(true)) && !"true".equals(queryParameter2)) {
            if (!TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_DARK_TEXT)) {
                if (TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT)) {
                    if (i >= 23) {
                        return new Pair<>(Boolean.TRUE, StatusBarTextColor.Light);
                    }
                    return new Pair<>(Boolean.FALSE, StatusBarTextColor.Light);
                }
                return new Pair<>(Boolean.FALSE, StatusBarTextColor.Undefine);
            } else if (i >= 23) {
                return new Pair<>(Boolean.TRUE, StatusBarTextColor.Dark);
            } else {
                return new Pair<>(Boolean.FALSE, StatusBarTextColor.Dark);
            }
        }
        return new Pair<>(Boolean.TRUE, StatusBarTextColor.Undefine);
    }

    @Override // com.taobao.android.weex_ability.page.WeexFragment.c
    public void onDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877656dd", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("weex_original_url");
            if (!TextUtils.isEmpty(queryParameter) && !checkServerLimit(queryParameter)) {
                String a2 = bzr.b().a(queryParameter);
                this.mIsDegrade = true;
                if (!TextUtils.isEmpty(a2)) {
                    Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
                    buildUpon.appendQueryParameter("downgradeV1", "true");
                    Nav.from(this).toUri(buildUpon.toString());
                    finish();
                    return;
                }
                Nav.from(this).withCategory("com.taobao.intent.category.HYBRID_UI").skipPreprocess().disableTransition().disallowLoopback().toUri(queryParameter);
                finish();
            }
        }
    }

    private boolean checkServerLimit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fbddaa5", new Object[]{this, str})).booleanValue();
        }
        try {
            WeexFragment weexFragment = this.mPageFragment;
            if (weexFragment != null && isServerLimit(weexFragment.A2(), this.mPageFragment.z2())) {
                dwh.e("IsServerLimitError: " + this.mPageFragment.A2() + " , " + this.mPageFragment.z2());
                String t = w4x.t("disable_downgrade_on_server_limit");
                if (TextUtils.isEmpty(t)) {
                    return false;
                }
                JSONArray parseArray = JSON.parseArray(t);
                Uri parse = Uri.parse(str);
                String str2 = parse.getHost() + parse.getPath();
                for (int i = 0; i < parseArray.size(); i++) {
                    if (TextUtils.equals(str2, parseArray.getString(i))) {
                        TBErrorViewWidget tBErrorViewWidget = new TBErrorViewWidget(this);
                        tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_CUSTOM);
                        tBErrorViewWidget.setCustomTitle("网络拥挤, 请稍后试试吧");
                        tBErrorViewWidget.setAdaptiveWidth(true);
                        tBErrorViewWidget.setCustomEnableButtons(4);
                        tBErrorViewWidget.setRefreshButtonWithoutProgress("返回", new a());
                        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.wa_plus_root_layout);
                        frameLayout.setBackgroundColor(-1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 81;
                        layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
                        frameLayout.addView(tBErrorViewWidget, layoutParams);
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            dwh.i(e);
        }
        return false;
    }

    private boolean isAppBarOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7663773f", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            dwh.h(TAG, e);
        }
        return TextUtils.equals(Uri.parse(this.mWeexUrl).getQueryParameter("wx_navbar_transparent"), Boolean.toString(true));
    }

    private boolean isParamValid(Intent intent) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a85c01", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        this.mBundleUrl = intent.getStringExtra("weexBundleUrl");
        this.mWeexUrl = intent.getStringExtra("weexUrl");
        if (TextUtils.isEmpty(this.mBundleUrl) || TextUtils.isEmpty(this.mWeexUrl)) {
            return false;
        }
        String queryParameter = data.getQueryParameter(FROM);
        if (TextUtils.isEmpty(queryParameter)) {
            dwh.b(TAG, "weex url from:" + queryParameter);
            try {
                HashMap hashMap = new HashMap();
                if (TextUtils.isEmpty(this.mWeexUrl)) {
                    str = getIntent().getStringExtra("weexUrl");
                } else {
                    str = this.mWeexUrl;
                }
                hashMap.put("weexUrl", str);
                if (TextUtils.isEmpty(this.mBundleUrl)) {
                    str2 = getIntent().getStringExtra("weexBundleUrl");
                } else {
                    str2 = this.mBundleUrl;
                }
                hashMap.put("bundleUrl", str2);
                if (TextUtils.isEmpty(this.mPageName)) {
                    str3 = assemblePageName(getIntent().getStringExtra("weexBundleUrl"));
                } else {
                    str3 = this.mPageName;
                }
                hashMap.put("pageName", str3);
                AppMonitor.Alarm.commitFail("weex", "from_not_nav", JSON.toJSONString(hashMap), "99402", WeexPopContainer.ACTION_DEGRADE_TO_WINDVANE);
            } catch (Throwable unused) {
            }
        }
        qsw a2 = psw.a();
        if (a2 != null) {
            this.mBundleUrl = a2.dealUrlScheme(this.mBundleUrl);
        }
        dwh.b(TAG, "bundleUrl:" + this.mBundleUrl);
        dwh.b(TAG, "weexUrl:" + this.mWeexUrl);
        return true;
    }

    private void parseUrlForContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cb81b", new Object[]{this});
            return;
        }
        try {
            String queryParameter = Uri.parse(this.mWeexUrl).getQueryParameter(WX_VIEW_TRANSPARENT);
            View findViewById = findViewById(R.id.wa_plus_root_layout);
            if (findViewById != null && TextUtils.equals(queryParameter, Boolean.toString(true))) {
                findViewById.setBackgroundColor(0);
            }
        } catch (Exception e) {
            dwh.h(TAG, e);
        }
    }

    public boolean isMainHc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894c9be9", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            dwh.h(TAG, e);
        }
        return TextUtils.equals(Uri.parse(this.mWeexUrl).getQueryParameter("wx_main_hc"), Boolean.toString(true));
    }
}
