package com.taobao.android.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.fragment.WVWebViewFragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.LoginNavUtils;
import com.ali.user.mobile.utils.MD5Util;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import com.uc.webview.export.extension.UCExtension;
import com.ut.mini.UTAnalytics;
import java.lang.reflect.Method;
import java.util.List;
import tb.acq;
import tb.ek1;
import tb.h1p;
import tb.pj1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AuthEntranceActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6403a;
    public String b;
    public String c;
    public List<String> d;
    public boolean e = false;
    public boolean f = false;
    public final BroadcastReceiver g = new BroadcastReceiver() { // from class: com.taobao.android.auth.AuthEntranceActivity.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/auth/AuthEntranceActivity$6");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                int i = f.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                if (i == 1) {
                    AuthEntranceActivity.n3(AuthEntranceActivity.this);
                } else if (i == 2) {
                    if (AuthEntranceActivity.o3(AuthEntranceActivity.this) != null) {
                        AuthEntranceActivity authEntranceActivity = AuthEntranceActivity.this;
                        LoginBroadcastHelper.unregisterLoginReceiver(authEntranceActivity, AuthEntranceActivity.o3(authEntranceActivity));
                    }
                    Log.e("login.AuthEntrance", "nofify_cancel, finish auth entrance");
                    AuthEntranceActivity.this.setResult(0);
                    AuthEntranceActivity.this.finish();
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
                Login.login(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AuthEntranceActivity authEntranceActivity = AuthEntranceActivity.this;
            AuthEntranceActivity.m3(authEntranceActivity, AuthEntranceActivity.l3(authEntranceActivity), 268435456);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            AuthEntranceActivity authEntranceActivity = AuthEntranceActivity.this;
            AuthEntranceActivity.m3(authEntranceActivity, AuthEntranceActivity.l3(authEntranceActivity), UCExtension.EXTEND_INPUT_TYPE_IDCARD);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AuthEntranceActivity.this.onBackPressed();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (Debuggable.isDebug()) {
                Log.e("login.AuthEntrance", "Nav. finish auth entrance");
            }
            AuthEntranceActivity.this.finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AuthEntranceActivity authEntranceActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1628464379:
                super.startIntentSenderForResult((IntentSender) objArr[0], ((Number) objArr[1]).intValue(), (Intent) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
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
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/auth/AuthEntranceActivity");
        }
    }

    public static /* synthetic */ String l3(AuthEntranceActivity authEntranceActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("258c5d9b", new Object[]{authEntranceActivity});
        }
        return authEntranceActivity.getWeexUrl();
    }

    public static /* synthetic */ void m3(AuthEntranceActivity authEntranceActivity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69874d93", new Object[]{authEntranceActivity, str, new Integer(i)});
        } else {
            authEntranceActivity.x3(str, i);
        }
    }

    public static /* synthetic */ void n3(AuthEntranceActivity authEntranceActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191258a7", new Object[]{authEntranceActivity});
        } else {
            authEntranceActivity.y3();
        }
    }

    public static /* synthetic */ BroadcastReceiver o3(AuthEntranceActivity authEntranceActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("17fe741f", new Object[]{authEntranceActivity});
        }
        return authEntranceActivity.g;
    }

    public final void A3(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a55af28", new Object[]{this, new Integer(i), str});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", i);
        intent.putExtra("errorMsg", str);
        setResult(-2, intent);
        finish();
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

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "Page_Auth";
    }

    public final String getWeexUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        int envType = DataProviderFactory.getDataProvider().getEnvType();
        StringBuilder sb = new StringBuilder(h1p.HTTP_PREFIX);
        if (envType == LoginEnvType.DEV.getSdkEnvType() || envType == LoginEnvType.PRE.getSdkEnvType()) {
            sb.append("market.wapa.taobao.com");
        } else {
            sb.append("market.m.taobao.com");
        }
        sb.append("/app/vip/member4weex/pages/member_auth?wh_weex=false");
        return LoginSwitch.getConfig(LoginSwitch.MEMBER_AUTH_URL, sb.toString());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT(getPageName(), "onBackPressed");
        try {
            if (!TextUtils.isEmpty(pj1.f26119a)) {
                JSONObject parseObject = JSON.parseObject(pj1.f26119a);
                if (parseObject != null) {
                    parseObject.put(SSOIPCConstants.APPLY_SSO_RESULT, (Object) 504);
                }
                ek1.b(parseObject.toJSONString(), this);
                return;
            }
        } catch (Throwable unused) {
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(R.layout.aliauth_activity_auth_entrance);
        try {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(getPageName());
        } catch (Exception unused) {
        }
        w3(getIntent());
        z3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(this, broadcastReceiver);
        }
        this.e = false;
        super.onDestroy();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        w3(getIntent());
        z3();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            super.onResume();
            q3();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edaaf5b5", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT(getPageName(), "checkSessionValid");
        if (Login.checkSessionValid()) {
            LoginStatus.resetLoginFlag();
            y3();
            return;
        }
        LoginStatus.resetLoginFlag();
        new Handler().postDelayed(new a(), 400L);
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9189cd37", new Object[]{this});
        } else {
            new Handler().postDelayed(new e(), 1000L);
        }
    }

    public final String s3() {
        Method method;
        Method[] methods;
        try {
            Method[] methods2 = AuthEntranceActivity.class.getMethods();
            int length = methods2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods2[i];
                if (method.getName().equals("getActivityToken")) {
                    break;
                }
                i++;
            }
            if (method == null) {
                return "";
            }
            Object invoke = method.invoke(this, new Object[0]);
            Object invoke2 = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
            for (Method method2 : invoke2.getClass().getMethods()) {
                if (method2.getName().equals("getLaunchedFromPackage")) {
                    return String.valueOf(method2.invoke(invoke2, invoke));
                }
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public final String t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aece1b28", new Object[]{this});
        }
        int envType = DataProviderFactory.getDataProvider().getEnvType();
        if (envType == LoginEnvType.DEV.getSdkEnvType() || envType == LoginEnvType.PRE.getSdkEnvType()) {
            return "http://market.wapa.taobao.com/app/vip/member4weex/pages/member_auth?wh_weex=false";
        }
        return "http://market.m.taobao.com/app/vip/member4weex/pages/member_auth?wh_weex=false";
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9419476", new Object[]{this});
            return;
        }
        if (getIntent() != null) {
            Uri.Builder buildUpon = getIntent().getData().buildUpon();
            buildUpon.appendQueryParameter("type", ek1.AUTH_INNER);
            getIntent().setData(buildUpon.build());
        }
        try {
            runOnUiThread(new b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b3217a", new Object[]{this});
            return;
        }
        if (getIntent() != null) {
            Uri.Builder buildUpon = getIntent().getData().buildUpon();
            buildUpon.appendQueryParameter("type", "auth_open");
            buildUpon.appendQueryParameter("appKey", this.f6403a);
            getIntent().setData(buildUpon.build());
        }
        runOnUiThread(new c());
    }

    public final void w3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad69721", new Object[]{this, intent});
            return;
        }
        pj1.f26119a = "";
        if (intent == null || intent.getData() == null) {
            A3(301, pj1.THIRD_ERROR_NULL_INTENT_MSG);
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            try {
                this.f6403a = data.getQueryParameter("appkey");
                this.d = data.getPathSegments();
                this.b = data.getQueryParameter("targetUrl");
                this.c = data.getQueryParameter("action");
            } catch (Exception e2) {
                LoginTLogAdapter.e("login.AuthEntrance", e2.toString());
            }
        }
    }

    public final void x3(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa7a784", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.trace("login.AuthEntrance", "Nav.5 in navToWeexPage");
        }
        p3(str, i);
    }

    public final void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2611769f", new Object[]{this});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(this, this.g);
        }
    }

    public final void addWebFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a80496a", new Object[]{this});
            return;
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.trace("login.AuthEntrance", "addWebFragment");
            Log.e("login.AuthEntrance", "addWebFragment call,url=" + t3());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        View findViewById = findViewById(R.id.aliuser_auth_rl);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.aliuser_auth_title_back_tv);
        if (imageView != null) {
            imageView.setOnClickListener(new d());
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", t3());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        WVWebViewFragment wVWebViewFragment = new WVWebViewFragment(this);
        wVWebViewFragment.setArguments(bundle);
        beginTransaction.add(R.id.browser_fragment_layout, wVWebViewFragment);
        beginTransaction.commit();
    }

    public final void p3(String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d22387", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.trace("login.AuthEntrance", "Nav.6 in auth2Weex");
        }
        if (getIntent() != null) {
            Log.e("login.AuthEntrance", "Nav.6 in data!=null");
            String dataString = getIntent().getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                JSONObject bundleToJSON = BundleUtil.bundleToJSON(Uri.parse(dataString).getEncodedQuery());
                try {
                    long currentTimeMillis = System.currentTimeMillis() - bundleToJSON.getLong("t").longValue();
                    Log.e("login.AuthEntrance", "Nav.launchDelta=" + currentTimeMillis);
                    UserTrackAdapter.sendUT(getPageName(), "LaunchAuthTime", String.valueOf(currentTimeMillis), bundleToJSON.getString("appKey"), null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (bundleToJSON == null) {
                    str2 = "";
                } else {
                    str2 = bundleToJSON.toJSONString();
                }
                pj1.f26119a = str2;
                if (bundleToJSON != null) {
                    bundleToJSON.toString();
                    try {
                        if ("true".equals(bundleToJSON.getString("sso_tao_simple"))) {
                            LoginTLogAdapter.trace("login.AuthEntrance", "auth2Weex: sso_tao_simple=true");
                            UserTrackAdapter.sendUT("sso_tao_simple");
                            this.f = true;
                            addWebFragment();
                            return;
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (Debuggable.isDebug()) {
            Log.e("login.AuthEntrance", "call Nav in  auth2Weex 22");
        }
        Nav.from(this).withFlags(i).toUri(LoginNavUtils.preHandleUri(this, str));
        r3();
    }

    public final void y3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc08f5fc", new Object[]{this});
        } else if (!this.e || this.f) {
            this.e = true;
            List<String> list = this.d;
            String str = "";
            String str2 = (list == null || list.size() <= 0) ? str : this.d.get(0);
            if ("sso".equals(str2)) {
                u3();
            } else if ("getway".equals(str2)) {
                v3();
            } else if ("sso4browser".equals(str2)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(this.b));
                    if (!TextUtils.isEmpty(this.c)) {
                        intent.setAction(this.c);
                    }
                    List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
                    if (queryIntentActivities != null && queryIntentActivities.size() == 1) {
                        str = MD5Util.getApkPublicKeyDigest(queryIntentActivities.get(0).activityInfo.packageName);
                    }
                    if (queryIntentActivities != null) {
                        i = queryIntentActivities.size();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                String s3 = s3();
                if (getIntent() != null) {
                    Uri.Builder buildUpon = getIntent().getData().buildUpon();
                    buildUpon.appendQueryParameter("type", ek1.AUTH_BROWSER);
                    if (!TextUtils.isEmpty(s3)) {
                        buildUpon.appendQueryParameter("callingPackage", s3);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        buildUpon.appendQueryParameter("callingPackageSign", str);
                    }
                    buildUpon.appendQueryParameter("supportAppSize", String.valueOf(i));
                    getIntent().setData(buildUpon.build());
                }
                x3(getWeexUrl(), 268435456);
            } else {
                Log.e("login.AuthEntrance", "unknown scheme, finish AuthEntranceActivity");
                finish();
            }
        }
    }
}
