package com.taobao.tao.topmultitab.service.login;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import com.taobao.wangxin.proxy.WangxinControlerProxy;
import java.lang.ref.WeakReference;
import tb.bqa;
import tb.cfc;
import tb.czj;
import tb.ge2;
import tb.m0b;
import tb.qul;
import tb.r5a;
import tb.s2b;
import tb.t2o;
import tb.wcc;
import tb.wk0;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LoginServiceImpl implements ILoginService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APPLICATION_ID = "com.android.browser.application_id";
    private static final String Id_Key = "feedId";
    public static final int NETWORK_PUSH_VIEW = 4004;
    private static final String OVERLAYTIME_KEY = "overlayTime";
    private static final String SnsId_Key = "snsId";
    private static final String TAG = "LoginManager";
    private static final String WEI_TAO_PARAM_FROM_VALUE = "weitao_widget";
    private wcc mHomePageContext;
    private LoginBroadcastReceiver receiver;
    private int whereMainCome = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f12825a;

        public a(Bundle bundle) {
            this.f12825a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f12825a.putString(LoginServiceImpl.WEI_TAO_PARAM_FROM_VALUE, "");
            long j = this.f12825a.getLong(LoginServiceImpl.SnsId_Key, -1L);
            long j2 = this.f12825a.getLong("feedId", -1L);
            if (j > -1 && j2 > -1) {
                Bundle bundle = new Bundle();
                bundle.putLong("feedId", j2);
                bundle.putLong(LoginServiceImpl.SnsId_Key, j);
                int identifier = Globals.getApplication().getResources().getIdentifier("allspark_wapp_detail_url", "string", Globals.getApplication().getPackageName());
                if (identifier > 0) {
                    str = Globals.getApplication().getResources().getString(identifier);
                } else {
                    str = "http://h5.m.taobao.com/we/detail2.htm";
                }
                String str2 = str + "?feedId=" + j2 + "&snsId=" + j;
                Activity access$100 = LoginServiceImpl.access$100(LoginServiceImpl.access$000(LoginServiceImpl.this));
                if (access$100 != null) {
                    Nav.from(access$100).withExtras(bundle).toUri(str2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(729810238);
        t2o.a(729810237);
    }

    public static /* synthetic */ wcc access$000(LoginServiceImpl loginServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcc) ipChange.ipc$dispatch("dc536a7", new Object[]{loginServiceImpl});
        }
        return loginServiceImpl.mHomePageContext;
    }

    public static /* synthetic */ Activity access$100(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("e97a193f", new Object[]{wccVar});
        }
        return getCurActivity(wccVar);
    }

    private void autoLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5834ce81", new Object[]{this});
            return;
        }
        bqa.d(TAG, MspWebActivity.V2_FUNCTION_AUTOLOGIN);
        if (!Login.checkSessionValid() && !TextUtils.isEmpty(Login.getLoginToken())) {
            Login.login(false);
        }
    }

    private static Activity getCurActivity(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("88463ab7", new Object[]{wccVar});
        }
        if (wccVar == null) {
            bqa.d(TAG, "homePageContext == null");
            return null;
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        if (iHomePageProviderService == null) {
            bqa.d(TAG, "pageProviderService == null");
            return null;
        }
        z6d pageProvider = iHomePageProviderService.getPageProvider();
        if (pageProvider != null) {
            return pageProvider.k1();
        }
        bqa.d(TAG, "pageProvider == null");
        return null;
    }

    private void goToWeiTao(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29efb803", new Object[]{this, bundle});
        } else {
            new Handler().postDelayed(new a(bundle), 150L);
        }
    }

    private void initUriBundle(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8dc22", new Object[]{this, intent});
            return;
        }
        try {
            String dataString = intent.getDataString();
            String stringExtra = intent.getStringExtra(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
            if (!TextUtils.isEmpty(dataString)) {
                Uri parse = Uri.parse(dataString);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = parse.getQueryParameter(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        extras.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, stringExtra);
                    }
                }
                if (TextUtils.isEmpty(intent.getStringExtra("source"))) {
                    String queryParameter = parse.getQueryParameter("source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        extras.putString("source", queryParameter);
                    }
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    Login.setLaunchBundle(extras);
                    wk0.d("setLaunchBundle");
                }
            }
        } catch (Throwable th) {
            bqa.c("home.LoginManager", th, "initBundle error");
        }
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public int getWhereMainCome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19782828", new Object[]{this})).intValue();
        }
        return this.whereMainCome;
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public void handleInitLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93406f8", new Object[]{this});
            return;
        }
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.receiver);
        if (Login.getCommentUsed()) {
            autoLogin();
        } else if ("0".equals(BuiltConfig.getString(R.string.dynamic_package_switch))) {
            Login.setCommentUsed(true);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.receiver);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public void refreshForLoginSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acbdafef", new Object[]{this});
            return;
        }
        ge2.a(OVERLAYTIME_KEY);
        czj.d();
        s2b.c().h();
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public void setWhereMainCome(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb8d37a", new Object[]{this, new Integer(i)});
        } else {
            this.whereMainCome = i;
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomePageContext = wccVar;
        this.receiver = new LoginBroadcastReceiver(this.mHomePageContext);
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public void switchToWangWang() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2dfa9c", new Object[]{this});
            return;
        }
        TBS.Adv.ctrlClicked(CT.Button, "wangxinclick", new String[0]);
        WangxinControlerProxy.gotoWangxin(getCurActivity(this.mHomePageContext));
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public void handleOnCreateBundle(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8abe29", new Object[]{this, intent});
        } else if (intent == null) {
            bqa.d(TAG, "intent == null");
        } else {
            try {
                initUriBundle(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    setWhereMainCome(0);
                    return;
                }
                if (extras.getString("msg_ww") != null) {
                    setWhereMainCome(2);
                    wk0.d("onCreate_goToWangWang");
                } else if ("com.android.mms".equals(extras.getString(APPLICATION_ID))) {
                    setWhereMainCome(0);
                } else if (WEI_TAO_PARAM_FROM_VALUE.equals(extras.getString("fromWidget"))) {
                    goToWeiTao(extras);
                    wk0.d("onCreate_goToWeitao");
                } else {
                    setWhereMainCome(0);
                    qul.f();
                }
                goToShop(extras, "onCreate_goToShop");
            } catch (Exception unused) {
                setWhereMainCome(0);
            }
        }
    }

    private void goToShop(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc2527e", new Object[]{this, bundle, str});
            return;
        }
        String string = bundle.getString("uid");
        String string2 = bundle.getString("shop_id");
        if (!TextUtils.isEmpty(string)) {
            wk0.d(str);
            Nav.from(m0b.c()).toUri(String.format(NavUrls.nav_urls_shop[2], string));
        } else if (!TextUtils.isEmpty(string2)) {
            wk0.d(str);
            Nav.from(m0b.c()).toUri(String.format(NavUrls.nav_urls_shop[1], string2));
        }
    }

    @Override // com.taobao.tao.topmultitab.service.login.ILoginService
    public void handleOnNewIntentBundle(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d2419b", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            bqa.d(TAG, "bundle == null");
            setWhereMainCome(0);
            return;
        }
        initUriBundle(intent);
        if (extras.getString("msg_service") != null) {
            if ("logistic".equals(extras.getString("msg_type"))) {
                TBS.Ext.commitEvent(r5a.f27121a, 4004, "Logistic", null, null, "NewStart=False");
                wk0.d("onNewIntent_goToLogisic");
                setWhereMainCome(1);
                Activity curActivity = getCurActivity(this.mHomePageContext);
                if (Login.getSid() != null) {
                    setWhereMainCome(0);
                    Nav.from(curActivity).toUri(NavUrls.NAV_URL_LOGISTIC_LIST);
                } else {
                    Login.login(true);
                }
            } else if ("browser".equals(extras.getString("msg_type"))) {
                TBS.Ext.commitEvent(r5a.f27121a, 4004, Dispatchers.TYPE_ACTIVITY, null, null, "NewStart=False");
                wk0.d("onNewIntent_goToMyBrowser");
                String string = extras.getString(Constants.MYBROWSERURL);
                Bundle bundle = new Bundle();
                bundle.putString(Constants.MYBROWSERURL, string);
                bundle.putString("msg_service", "msg_service");
                Activity curActivity2 = getCurActivity(this.mHomePageContext);
                if (curActivity2 != null) {
                    Nav.from(curActivity2).withExtras(bundle).skipPreprocess().withCategory("com.taobao.intent.category.HYBRID_UI").toUri(string);
                } else {
                    return;
                }
            }
        } else if (extras.getString("msg_ww") != null) {
            setWhereMainCome(2);
            wk0.d("onNewIntent_goToWangWang");
            if (Login.getSid() != null) {
                setWhereMainCome(0);
                switchToWangWang();
            } else {
                Login.login(true);
            }
        } else if (WEI_TAO_PARAM_FROM_VALUE.equals(extras.getString("fromWidget"))) {
            goToWeiTao(extras);
            wk0.d("onNewIntent_goToWeitao");
        } else {
            setWhereMainCome(0);
        }
        goToShop(extras, "onNewIntent_goToShop");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<wcc> f12824a;

        static {
            t2o.a(729810241);
        }

        public LoginBroadcastReceiver(wcc wccVar) {
            this.f12824a = new WeakReference<>(wccVar);
        }

        public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/login/LoginServiceImpl$LoginBroadcastReceiver");
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0137 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:14:0x0042, B:21:0x0069, B:23:0x0073, B:24:0x007b, B:25:0x0080, B:26:0x008f, B:28:0x009e, B:30:0x00a4, B:31:0x00a9, B:33:0x00b8, B:34:0x00be, B:36:0x00f4, B:39:0x00ff, B:42:0x010d, B:43:0x0114, B:45:0x0137, B:46:0x013f, B:49:0x0152, B:51:0x0158, B:53:0x015e, B:55:0x0168, B:57:0x016e, B:59:0x0174, B:62:0x017c, B:64:0x0182, B:66:0x018d, B:67:0x0190), top: B:70:0x0042 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r17, android.content.Intent r18) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.topmultitab.service.login.LoginServiceImpl.LoginBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }
}
