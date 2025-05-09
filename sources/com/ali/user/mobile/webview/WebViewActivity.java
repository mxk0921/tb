package com.ali.user.mobile.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.eventbus.EventBus;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.verify.impl.VerifyServiceImpl;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.ali.user.mobile.verify.model.VerifyTokenConsumedResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCCore;
import com.ut.mini.UTAnalytics;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Properties;
import tb.acq;
import tb.fsw;
import tb.mj4;
import tb.og8;
import tb.t2o;
import tb.v7t;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WebViewActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_LoginH5";
    public static final String TAG = "login.web";
    public static final String WINDVANECLOSEALL = "aliusersdkwindvane=closeAll";
    public String eventName;
    public RelativeLayout mAPRelativeLayout;
    private String mHelpUrl;
    public String mIVScene;
    public String mLoginId;
    public String mLoginType;
    public String mNativeLoginType;
    public String mOriginalLoginParam;
    public ProgressBar mProgressBar;
    public int mRequestCode;
    public String mSNSTrustLoginToken;
    public String mScene;
    public String mSecurityId;
    public int mSite;
    public String mToken;
    public String mTokenType;
    public String mUrl;
    public String mUserId;
    public LoginWebView mWebView;
    public boolean needCancelBroadcast;
    private LoginParam ssoLoginParam;
    public boolean allowReadTitle = true;
    public boolean isWebviewAlive = true;
    public boolean isLoginPost = false;
    public boolean needCallback = false;
    public boolean skipLogin = false;
    public boolean loadFinishedOnce = false;
    private boolean isShowHelpMenu = false;
    private boolean isShowSkipMenu = false;
    private final int SKIP_MENU_ITEM_ID = 257;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MyLoginWebViewClient extends LoginWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public WeakReference<WebViewActivity> reference;

        static {
            t2o.a(70254914);
        }

        public MyLoginWebViewClient(WebViewActivity webViewActivity) {
            super(webViewActivity);
            this.reference = new WeakReference<>(webViewActivity);
        }

        public static /* synthetic */ Object ipc$super(MyLoginWebViewClient myLoginWebViewClient, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/webview/WebViewActivity$MyLoginWebViewClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressBar progressBar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            WebViewActivity webViewActivity = this.reference.get();
            if (!(webViewActivity == null || (progressBar = webViewActivity.mProgressBar) == null)) {
                progressBar.setVisibility(8);
                webViewActivity.loadFinishedOnce = true;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            WebViewActivity webViewActivity = this.reference.get();
            if (webViewActivity != null) {
                webViewActivity.onWebViewReceivedError(i, str, str2);
            }
        }

        @Override // com.ali.user.mobile.webview.LoginWebViewClient
        public boolean overrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("adbdcb28", new Object[]{this, webView, str})).booleanValue();
            }
            WebViewActivity webViewActivity = this.reference.get();
            if (webViewActivity != null) {
                return webViewActivity.overrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    static {
        t2o.a(70254907);
    }

    public static Intent getCallingIntent(Activity activity, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("1c554f0d", new Object[]{activity, urlParam});
        }
        Intent intent = new Intent(activity, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, urlParam.url);
        LoginBaseParam loginBaseParam = urlParam.loginParam;
        if (loginBaseParam != null) {
            intent.putExtra(WebConstant.WEB_NATIVE_LOGIN_TYPE, loginBaseParam.nativeLoginType);
            intent.putExtra(WebConstant.WEB_SNS_TRUST_LOGIN_TOKEN, urlParam.loginParam.snsTrustLoginToken);
            intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, urlParam.loginParam.tokenType);
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(urlParam.loginParam));
            intent.putExtra(WebConstant.WEB_CANCEL_BROADCAST, urlParam.loginParam.sendLoginFailWhenWebviewCancel);
        }
        intent.putExtra("scene", urlParam.scene);
        intent.putExtra("token", urlParam.token);
        String str = urlParam.loginId;
        if (str != null) {
            intent.putExtra(WebConstant.WEB_LOGIN_ID, str);
        } else {
            LoginBaseParam loginBaseParam2 = urlParam.loginParam;
            if (loginBaseParam2 != null && !TextUtils.isEmpty(loginBaseParam2.loginId)) {
                intent.putExtra(WebConstant.WEB_LOGIN_ID, urlParam.loginParam.loginId);
            }
        }
        intent.putExtra("site", urlParam.site);
        intent.putExtra(WebConstant.WEB_ALLOW_TITLE, urlParam.needTitle);
        return intent;
    }

    private LoginParam getLoginParam(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("1147d436", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z), new Boolean(z2), str6});
        }
        LoginParam loginParam = new LoginParam();
        if (str != null && !str.equals("null")) {
            loginParam.loginId = str;
        }
        loginParam.h5QueryString = str5;
        loginParam.isFromRegister = z;
        loginParam.isFoundPassword = z2;
        loginParam.site = this.mSite;
        if (str2 != null) {
            loginParam.token = str2;
            loginParam.scene = str4;
            loginParam.tokenType = str6;
        }
        loginParam.snsTrustLoginToken = this.mSNSTrustLoginToken;
        loginParam.nativeLoginType = this.mNativeLoginType;
        return loginParam;
    }

    private void initDataFromIntent() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9849fbe7", new Object[]{this});
            return;
        }
        try {
            LoginParam loginParam = (LoginParam) getIntent().getSerializableExtra("loginParam");
            this.ssoLoginParam = loginParam;
            if (loginParam != null) {
                this.mOriginalLoginParam = JSON.toJSONString(loginParam);
                String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(this.ssoLoginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginTypeByTraceId)) {
                    loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(this.ssoLoginParam.tokenType);
                }
                if (!TextUtils.isEmpty(loginTypeByTraceId)) {
                    Properties properties = LoginComponent.getProperties();
                    properties.setProperty("h5_code", this.ssoLoginParam.errorCode + "");
                    properties.setProperty("h5_scene", this.mScene + "");
                    if (TextUtils.isEmpty(this.ssoLoginParam.utPageName)) {
                        str = PAGE_NAME;
                    } else {
                        str = this.ssoLoginParam.utPageName;
                    }
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_TO_H5_COMMIT, "", loginTypeByTraceId, properties);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(WebViewActivity webViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
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
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/webview/WebViewActivity");
        }
    }

    private void loginHit(String str, String str2, String str3) {
        LoginParam loginParam;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac88ca0f", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.mOriginalLoginParam) && (loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class)) != null) {
                Properties properties = new Properties();
                properties.setProperty("sdkTraceId", loginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginParam.utPageName)) {
                    str4 = PAGE_NAME;
                } else {
                    str4 = loginParam.utPageName;
                }
                UserTrackAdapter.sendUT(str4, str, properties);
                String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginTypeByTraceId)) {
                    loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginParam.tokenType);
                }
                if (!TextUtils.isEmpty(loginTypeByTraceId)) {
                    Properties properties2 = LoginComponent.getProperties();
                    properties2.setProperty("scene", str3 + "");
                    properties2.setProperty("h5_code", loginParam.errorCode + "");
                    properties2.setProperty("h5_scene", this.mScene + "");
                    UserTrackAdapter.sendUT(str4, str2, "", loginTypeByTraceId, properties2);
                }
            }
        } catch (Exception unused) {
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

    public void createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a95184", new Object[]{this});
            return;
        }
        this.mWebView = new LoginWebView(this);
        this.mWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (LoginSwitch.getSwitch("clearFocus", "true")) {
            this.mWebView.clearFocus();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_activity_webview;
    }

    public void goConsumeIV(final VerifyParam verifyParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cb17f7", new Object[]{this, verifyParam});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, VerifyTokenConsumedResponse>() { // from class: com.ali.user.mobile.webview.WebViewActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/webview/WebViewActivity$3");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public VerifyTokenConsumedResponse doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (VerifyTokenConsumedResponse) ipChange2.ipc$dispatch("8fb5b084", new Object[]{this, objArr});
                    }
                    try {
                        return VerifyServiceImpl.getInstance().goNonLoginConsume(verifyParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                public void onPostExecute(VerifyTokenConsumedResponse verifyTokenConsumedResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("534dc7f7", new Object[]{this, verifyTokenConsumedResponse});
                    } else if (verifyTokenConsumedResponse == null) {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -1, "RET_NULL", "");
                        WebViewActivity.this.finish();
                    } else {
                        int i = verifyTokenConsumedResponse.code;
                        if (i != 3000) {
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, i, verifyTokenConsumedResponse.message, "");
                            WebViewActivity.this.finish();
                            return;
                        }
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_SUCCESS);
                        WebViewActivity.this.finish();
                    }
                }
            }, new Object[0]);
        }
    }

    public void goLogin(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, boolean z3, boolean z4, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197e27fc", new Object[]{this, str, str2, str3, new Boolean(z), str4, str5, new Boolean(z2), new Boolean(z3), new Boolean(z4), str6});
        } else {
            goLogin(str2, false, z, z2, getLoginParam(str, str2, str3, str4, str5, z2, z3, str6));
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mAPRelativeLayout.addView(this.mWebView);
        this.mWebView.init();
        setWebChromClient();
        setWebViewClient();
        loadUrl(this.mUrl);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.mAPRelativeLayout = (RelativeLayout) findViewById(R.id.aliuser_id_webview);
        this.mProgressBar = (ProgressBar) findViewById(R.id.aliuser_web_progress_bar);
        try {
            createWebView();
            init();
        } catch (Throwable th) {
            th.printStackTrace();
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", "cancel");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
            }
            finish();
        }
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mWebView.loadUrl(str);
            try {
                if (LoginSwitch.getSwitch("addIntentUrl", "true") && getIntent() != null) {
                    getIntent().setData(Uri.parse(str));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
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
        if (i2 == 720) {
            loadUrl(intent.getStringExtra("windvane"));
        } else if (i2 != 721) {
            LoginWebView loginWebView = this.mWebView;
            if (loginWebView != null) {
                loginWebView.onActivityResult(i, i2, intent);
            }
        } else {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            cancleOperation();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        menu.clear();
        getMenuInflater().inflate(R.menu.aliuser_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.isWebviewAlive) {
            try {
                this.mAPRelativeLayout.removeView(this.mWebView);
                this.mWebView.removeAllViews();
                this.mWebView.setVisibility(8);
                this.mWebView.destroy();
            } finally {
                try {
                } finally {
                }
            }
        }
        fsw.p("Verify");
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        cancleOperation();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        initDataFromIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(WebConstant.WEBURL);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = this.mUrl;
            }
            this.mUrl = stringExtra;
        }
        loadUrl(this.mUrl);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.aliuser_menu_item_help) {
            UrlParam urlParam = new UrlParam();
            urlParam.scene = "";
            urlParam.url = this.mHelpUrl;
            urlParam.site = DataProviderFactory.getDataProvider().getSite();
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(this, urlParam);
        } else if (itemId == 257) {
            BroadCastHelper.sendBroadcast(LoginAction.WEB_ACTIVITY_SKIP);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        LoginWebView loginWebView = this.mWebView;
        if (loginWebView != null) {
            loginWebView.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        if (menu != null) {
            int i = R.id.aliuser_menu_item_more;
            if (menu.findItem(i) != null) {
                int i2 = R.id.aliuser_menu_item_help;
                if (menu.findItem(i2) != null) {
                    menu.findItem(i).setVisible(false);
                    if (!this.isShowHelpMenu || TextUtils.isEmpty(this.mHelpUrl)) {
                        menu.findItem(i2).setVisible(false);
                    } else {
                        menu.findItem(i2).setVisible(true);
                    }
                    if (this.isShowSkipMenu) {
                        if (menu.findItem(257) == null) {
                            menu.add(0, 257, 0, R.string.aliuser_skip).setVisible(true).setShowAsAction(1);
                        }
                    } else if (menu.findItem(257) != null) {
                        menu.removeItem(257);
                    }
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, PAGE_NAME);
        LoginWebView loginWebView = this.mWebView;
        if (loginWebView != null) {
            loginWebView.onResume();
        }
        super.onResume();
    }

    public void onWebViewReceivedError(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda9cf83", new Object[]{this, new Integer(i), str, str2});
        }
    }

    public void registerPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39467d3d", new Object[]{this});
        } else {
            fsw.h("Verify", SecurityGuardBridge.class);
        }
    }

    public void setWebChromClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ef6a8b", new Object[]{this});
        } else {
            this.mWebView.setWebChromeClient(new LoginWebChromeClient(this));
        }
    }

    public void setWebViewClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be662f89", new Object[]{this});
            return;
        }
        try {
            this.mWebView.setWebViewClient(new MyLoginWebViewClient(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void switchHelpMenu(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f399a3", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.mHelpUrl = str;
        this.isShowHelpMenu = z;
        invalidateOptionsMenu();
    }

    public void switchSkipMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2858f39b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isShowSkipMenu = z;
        invalidateOptionsMenu();
    }

    public static void goFistLoginPage(Activity activity, boolean z, boolean z2, LoginParam loginParam) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8036842", new Object[]{activity, new Boolean(z), new Boolean(z2), loginParam});
        } else if (activity != null) {
            LoginApprearanceExtensions loginApprearanceExtensions = AliUserLogin.mAppreanceExtentions;
            if (loginApprearanceExtensions == null || loginApprearanceExtensions.getUserLoginActivity() == null) {
                cls = UserLoginActivity.class;
            } else {
                cls = AliUserLogin.mAppreanceExtentions.getUserLoginActivity();
            }
            Intent intent = new Intent(activity, cls);
            intent.putExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
            intent.putExtra(LoginConstant.LAUCNH_MOBILE_LOGIN_FRAGMENT_LABEL, true);
            intent.putExtra(UIBaseConstants.UT_FROM_REGIST_KEY, z2);
            if (loginParam != null) {
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
            }
            intent.putExtra(LoginConstant.FORCE_HIDE_ALL, true);
            if (z) {
                intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                activity.finish();
            }
            intent.putExtra("check", true);
            intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
            activity.startActivity(intent);
        }
    }

    public void cancleOperation() {
        LoginFilterCallback loginFilterCallback;
        LoginFilterCallback loginFilterCallback2;
        LoginParam loginParam;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22aa8a82", new Object[]{this});
        } else if (!onPanelKeyDown()) {
            setResult(0);
            sendCancelBroadcast();
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", "cancel");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
            }
            if (!TextUtils.isEmpty(this.mOriginalLoginParam) && (loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class)) != null) {
                String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginTypeByTraceId)) {
                    loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginParam.tokenType);
                }
                if (!TextUtils.isEmpty(loginTypeByTraceId)) {
                    Properties properties = LoginComponent.getProperties(loginParam);
                    if (TextUtils.isEmpty(loginParam.utPageName)) {
                        str = PAGE_NAME;
                    } else {
                        str = loginParam.utPageName;
                    }
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_CANCEL, "", loginTypeByTraceId, properties);
                    properties.setProperty("h5_code", loginParam.errorCode + "");
                    properties.setProperty("h5_scene", this.mScene + "");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_TO_H5_CANCEL, "", loginTypeByTraceId, properties);
                }
            }
            if (this.isLoginPost && (loginFilterCallback2 = LoginPostHandler.sCallback) != null) {
                loginFilterCallback2.onSuccess();
                LoginPostHandler.sCallback = null;
                UserTrackAdapter.sendUT("UserCancelPostUrl");
            } else if (this.needCallback && (loginFilterCallback = LoginH5Handler.sCallback) != null) {
                loginFilterCallback.onSuccess();
                LoginH5Handler.sCallback = null;
                UserTrackAdapter.sendUT("UserCancelUrl");
            }
            finish();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LoginParam loginParam;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            Intent intent = getIntent();
            this.mToken = intent.getStringExtra("token");
            this.mTokenType = intent.getStringExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE);
            this.mUrl = intent.getStringExtra(WebConstant.WEBURL);
            this.mSecurityId = intent.getStringExtra("securityId");
            this.mLoginId = intent.getStringExtra(WebConstant.WEB_LOGIN_ID);
            String stringExtra = intent.getStringExtra("scene");
            this.mScene = stringExtra;
            if (stringExtra == null) {
                this.mScene = "";
            }
            this.mNativeLoginType = intent.getStringExtra(WebConstant.WEB_NATIVE_LOGIN_TYPE);
            this.mSNSTrustLoginToken = intent.getStringExtra(WebConstant.WEB_SNS_TRUST_LOGIN_TOKEN);
            this.mSite = intent.getIntExtra("site", DataProviderFactory.getDataProvider().getSite());
            this.mTokenType = intent.getStringExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE);
            this.mIVScene = intent.getStringExtra(WebConstant.WEB_IV_SCENE);
            this.mUserId = intent.getStringExtra("USERID");
            this.eventName = intent.getStringExtra("eventName");
            this.mOriginalLoginParam = intent.getStringExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            JSONObject parseObject = JSON.parseObject(intent.getStringExtra("ext"));
            if (parseObject != null && parseObject.containsKey("showSkipMenu")) {
                this.isShowSkipMenu = ((Boolean) parseObject.get("showSkipMenu")).booleanValue();
            }
            if (parseObject != null && parseObject.containsKey("skipLogin")) {
                this.skipLogin = ((Boolean) parseObject.get("skipLogin")).booleanValue();
            }
            this.needCancelBroadcast = getIntent().getBooleanExtra(WebConstant.WEB_CANCEL_BROADCAST, false);
            this.mRequestCode = intent.getIntExtra("requestCode", 0);
            this.isLoginPost = intent.getBooleanExtra(WebConstant.WEB_POST_LOGIN, false);
            this.needCallback = intent.getBooleanExtra(WebConstant.WEB_CALLBACK, false);
            if (!TextUtils.isEmpty(this.mOriginalLoginParam) && (loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class)) != null) {
                String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginTypeByTraceId)) {
                    loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginParam.tokenType);
                }
                if (!TextUtils.isEmpty(loginTypeByTraceId)) {
                    Properties properties = LoginComponent.getProperties();
                    properties.setProperty("h5_code", loginParam.errorCode + "");
                    properties.setProperty("h5_scene", this.mScene + "");
                    if (TextUtils.isEmpty(loginParam.utPageName)) {
                        str = PAGE_NAME;
                    } else {
                        str = loginParam.utPageName;
                    }
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_TO_H5_COMMIT, "", loginTypeByTraceId, properties);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        registerPlugin();
        initDataFromIntent();
        super.onCreate(bundle);
    }

    public void sendCancelBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330477c6", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mIVScene)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -5, LoginConstant.FETCH_IV_FAIL_CANCEL, "");
        } else {
            Intent intent = new Intent(LoginResActions.WEB_ACTIVITY_CANCEL);
            intent.putExtra(LoginConstants.H5_SEND_CANCEL_BROADCAST, this.needCancelBroadcast);
            BroadCastHelper.sendLocalBroadCast(intent);
        }
    }

    public boolean sendTokenBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e9206d", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put("token", str);
                hashMap.put("result", "success");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LoginWebChromeClient extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final String KEY_CONFIRM;
        private static final String KEY_FROM;
        public WeakReference<WebViewActivity> reference;

        public LoginWebChromeClient(WebViewActivity webViewActivity) {
            super(webViewActivity);
            this.reference = new WeakReference<>(webViewActivity);
        }

        public static /* synthetic */ Object ipc$super(LoginWebChromeClient loginWebChromeClient, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 220271772) {
                return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/webview/WebViewActivity$LoginWebChromeClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
            }
            if (!(webView.getContext() instanceof Activity) || !((Activity) webView.getContext()).isFinishing()) {
                try {
                    AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper((Activity) webView.getContext(), 16973939));
                    String host = Uri.parse(str).getHost();
                    builder.setTitle(KEY_FROM + host).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.webview.WebViewActivity.LoginWebChromeClient.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                jsResult.confirm();
                            }
                        }
                    });
                    builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ali.user.mobile.webview.WebViewActivity.LoginWebChromeClient.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                            } else {
                                jsResult.cancel();
                            }
                        }
                    });
                    AlertDialog create = builder.create();
                    create.setCanceledOnTouchOutside(false);
                    create.show();
                } catch (Throwable th) {
                    v7t.d(WebViewActivity.TAG, th.getMessage());
                    jsResult.confirm();
                }
                return true;
            }
            jsResult.confirm();
            return true;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
            }
            try {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            WebViewActivity webViewActivity = this.reference.get();
            if (!(webViewActivity == null || !webViewActivity.allowReadTitle || webViewActivity.getSupportActionBar() == null)) {
                try {
                    webViewActivity.getSupportActionBar().setTitle(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            super.onReceivedTitle(webView, str);
        }

        static {
            String str;
            String str2;
            t2o.a(70254911);
            if (og8.c()) {
                str = "来自于：";
            } else {
                str = "From: ";
            }
            KEY_FROM = str;
            if (og8.c()) {
                str2 = wmc.CONFIRM;
            } else {
                str2 = mj4.CONTROL_NAME_OK;
            }
            KEY_CONFIRM = str2;
        }
    }

    public void goLogin(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, boolean z3, boolean z4, boolean z5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fbc304", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2), str4, str5, new Boolean(z3), new Boolean(z4), new Boolean(z5), str6});
        } else {
            goLogin(str2, z, z2, z3, getLoginParam(str, str2, str3, str4, str5, z3, z4, str6));
        }
    }

    public boolean onPanelKeyDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41116307", new Object[]{this})).booleanValue();
        }
        LoginWebView loginWebView = this.mWebView;
        if (loginWebView == null) {
            return false;
        }
        if (!this.isHookNativeBack || this.isHookNativeBackByJs) {
            this.isHookNativeBackByJs = false;
            loginWebView.getWVCallBackContext().fireEvent("WV.Event.Key.Back", "{}");
            return false;
        }
        loginWebView.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.ali.user.mobile.webview.WebViewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str) {
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                } else if (WebViewActivity.this.mWebView != null) {
                    if (!TextUtils.isEmpty(str)) {
                        z = !"false".equals(str.replace("\"", "").replace("'", ""));
                    }
                    if (z) {
                        WebViewActivity.this.mWebView.getWVCallBackContext().fireEvent(RPWebViewActivity.l, "{}");
                        return;
                    }
                    try {
                        Runtime.getRuntime().exec("input keyevent 4");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    WebViewActivity.this.isHookNativeBackByJs = true;
                }
            }
        });
        return true;
    }

    public void goLogin(String str, boolean z, boolean z2, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb8d14f", new Object[]{this, str, new Boolean(z), new Boolean(z2), loginParam});
        } else {
            goLogin(str, false, z, z2, loginParam);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x044d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean overrideUrlLoading(com.uc.webview.export.WebView r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.webview.WebViewActivity.overrideUrlLoading(com.uc.webview.export.WebView, java.lang.String):boolean");
    }

    public void goLogin(String str, boolean z, final boolean z2, boolean z3, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d5bff", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), loginParam});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.mOriginalLoginParam)) {
                LoginParam loginParam2 = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class);
                loginParam.utPageName = loginParam2.utPageName;
                loginParam.loginSourceType = loginParam2.loginSourceType;
                loginParam.sdkTraceId = loginParam2.sdkTraceId;
                loginParam.source = loginParam2.source;
                String str2 = loginParam2.sdkTraceId + "";
                if (!TextUtils.isEmpty(str) && TextUtils.equals(LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, UTConstant.getLoginTypeByTraceId(str2))) {
                    UserTrackAdapter.sendUT(loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, LoginComponent.getProperties(loginParam2));
                }
            }
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
                hashMap.put("result", "success");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
                finish();
            } else if (!z || !LoginSwitch.getSwitch("loginInWebActivity", "true")) {
                goFistLoginPage(this, z2, z3, loginParam);
            } else {
                LoginApi.tokenLogin(loginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.webview.WebViewActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onCancel() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        }
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onFail(LoginException<LoginReturnData> loginException) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        } else if (loginException != null) {
                            String msg = loginException.getMsg();
                            if (TextUtils.isEmpty(msg)) {
                                msg = ResourceUtil.getNetworkError();
                            }
                            WebViewActivity.this.toast(msg, 0);
                        }
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        } else if (z2) {
                            WebViewActivity.this.finish();
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
