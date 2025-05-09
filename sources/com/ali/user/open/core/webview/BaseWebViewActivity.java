package com.ali.user.open.core.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.WindVaneSDK;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.WebViewOption;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.ResultCode;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BaseWebViewActivity extends AppCompatActivity implements IWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = BaseWebViewActivity.class.getSimpleName();
    public String CALLBACK = StringUtil.CALLBACK;
    public boolean forceUcWebView;
    public IWebViewProxy memberWebView;

    static {
        t2o.a(71303262);
        t2o.a(71303276);
    }

    public static /* synthetic */ Object ipc$super(BaseWebViewActivity baseWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/BaseWebViewActivity");
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

    public boolean checkWebviewBridge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80b177cf", new Object[]{this, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (this.CALLBACK.contains(parse.getAuthority() + parse.getPath())) {
            return true;
        }
        return false;
    }

    public boolean checkWindVaneExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88bfad30", new Object[]{this})).booleanValue();
        }
        try {
            IpChange ipChange2 = WindVaneSDK.$ipChange;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public IWebViewProxy createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWebViewProxy) ipChange.ipc$dispatch("d6765a09", new Object[]{this});
        }
        if (ConfigManager.getInstance().getWebViewOption() != WebViewOption.UC && !this.forceUcWebView) {
            return new SystemWebViewProxy(this);
        }
        if (checkWindVaneExist()) {
            return new WVUcWebViewProxy(this);
        }
        return new SystemWebViewProxy(this);
    }

    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        return R.layout.member_sdk_activity_webview;
    }

    public void initParams(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a658fa", new Object[]{this, intent});
        } else {
            checkWindVaneExist();
        }
    }

    public void initViews(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7002b7ef", new Object[]{this, bundle});
            return;
        }
        setContentView(getLayout());
        setActionBar();
        this.memberWebView = createWebView();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ali_user_webview_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy == null || iWebViewProxy.getWebView() == null) {
            finish();
            return;
        }
        frameLayout.addView(this.memberWebView.getWebView(), layoutParams);
        String stringExtra = getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra) && (data = getIntent().getData()) != null) {
            stringExtra = data.getQueryParameter("url");
            SDKLogger.e(TAG, "read url fomr uri:");
        }
        String str = TAG;
        SDKLogger.d(str, "onCreate url=" + stringExtra);
        if (!KernelContext.checkServiceValid() || TextUtils.isEmpty(stringExtra)) {
            finish();
        } else if (!CommonUtils.isNetworkAvailable()) {
            CommonUtils.toast("member_sdk_network_not_available_message");
        } else {
            try {
                this.memberWebView.resumeTimers();
                this.memberWebView.onResume();
            } catch (Exception unused) {
            }
            loadUrl(stringExtra);
        }
    }

    public void loadUrl(String str) {
        IWebViewProxy iWebViewProxy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (iWebViewProxy = this.memberWebView) != null) {
            iWebViewProxy.loadUrl(str);
        }
    }

    public void onBackHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922dabd5", new Object[]{this});
            return;
        }
        setResult(ResultCode.USER_CANCEL.code, new Intent());
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            onBackHistory();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (!(iWebViewProxy == null || iWebViewProxy.getWebView() == null)) {
            ViewGroup viewGroup = (ViewGroup) this.memberWebView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.memberWebView.getWebView());
            }
            this.memberWebView.removeAllViews();
            this.memberWebView.destroy();
            this.memberWebView = null;
        }
        super.onDestroy();
    }

    public void onFailure(ResultCode resultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf369af", new Object[]{this, resultCode});
        } else {
            finish();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public void onPageFinished(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509cd631", new Object[]{this, str});
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public void onPageStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (AliMemberSDK.getService(UserTrackerService.class) != null) {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).pageDisAppear(this);
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public void onReceivedTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124d59e9", new Object[]{this, str});
        } else if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(str);
            getSupportActionBar().show();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy != null) {
            try {
                iWebViewProxy.resumeTimers();
                this.memberWebView.onResume();
            } catch (Exception unused) {
            }
        }
    }

    public String pipOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e894174", new Object[]{this});
        }
        return "true";
    }

    public Bundle serialBundle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("f4537aab", new Object[]{this, str});
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        String[] split = str.split("&");
        Bundle bundle = new Bundle();
        for (String str2 : split) {
            int indexOf = str2.indexOf("=");
            if (indexOf > 0 && indexOf < str2.length() - 1) {
                bundle.putString(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
        return bundle;
    }

    public void setActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef9b2c2", new Object[]{this});
            return;
        }
        AliUccCustomToolbar aliUccCustomToolbar = (AliUccCustomToolbar) findViewById(R.id.ali_user_webview_toolbar);
        setSupportActionBar(aliUccCustomToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            if (aliUccCustomToolbar != null) {
                aliUccCustomToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.ali.user.open.core.webview.BaseWebViewActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            BaseWebViewActivity.this.onBackHistory();
                        }
                    }
                });
            }
        }
    }

    public void setResult(ResultCode resultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585729bb", new Object[]{this, resultCode});
        } else {
            onFailure(resultCode);
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public boolean shouldOverrideUrlLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40e7661", new Object[]{this, str})).booleanValue();
        }
        loadUrl(str);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if ("true".equals(pipOrange()) && Build.VERSION.SDK_INT >= 26) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            int height = defaultDisplay.getHeight();
            int width = defaultDisplay.getWidth();
            String str = TAG;
            Log.e(str, "height=" + height + ",width=" + width);
            if (height > width) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                Log.e(str, "height=" + i2 + ",width=" + i);
                float f = displayMetrics.density;
                int i3 = (int) (((float) i) / f);
                int i4 = (int) (((float) i2) / f);
                Log.e(str, "dp width=" + i3 + ",height=" + i4);
                Configuration configuration = getResources().getConfiguration();
                if (getResources().getConfiguration().orientation != 1) {
                    Log.e(str, "force portrait");
                    configuration.orientation = 1;
                    configuration.screenHeightDp = i4;
                    configuration.screenWidthDp = i3;
                    onConfigurationChanged(configuration);
                }
            }
        }
        super.onCreate(bundle);
        try {
            initParams(getIntent());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            initViews(bundle);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy == null || iWebViewProxy.getWebView() == null) {
            SDKLogger.e(TAG, "init webview failed,finish");
            finish();
            return;
        }
        if (KernelContext.applicationContext == null) {
            KernelContext.applicationContext = getApplicationContext();
        }
        if (ConfigManager.getInstance().getWebViewOption() == WebViewOption.SYSTEM && this.memberWebView != null) {
            if (AliMemberSDK.getService(UserTrackerService.class) != null) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).skipPage(this);
            }
            this.memberWebView.addBridgeObject("ALBBUserTrackJSBridge", new UserTrackBridge());
            this.memberWebView.addBridgeObject("aluWVJSBridge", new UserInfoBridge());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        try {
            String stringExtra = intent.getStringExtra("url");
            if (TextUtils.isEmpty(stringExtra) && (data = getIntent().getData()) != null) {
                stringExtra = data.getQueryParameter("url");
                this.forceUcWebView = true;
                SDKLogger.e(TAG, "read url fomr uri:");
            }
            String str = TAG;
            SDKLogger.d(str, "onCreate url=" + stringExtra);
            if (!KernelContext.checkServiceValid()) {
                finish();
            } else if (!CommonUtils.isNetworkAvailable()) {
                CommonUtils.toast("member_sdk_network_not_available_message");
            } else {
                try {
                    this.memberWebView.resumeTimers();
                    this.memberWebView.onResume();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loadUrl(stringExtra);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
