package com.taobao.android.sns4android.alipay2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alipay.auth.mobile.api.IAlipayAuthEventHandler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.Map;
import java.util.Properties;
import tb.acq;
import tb.xwr;
import tb.yeq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AlipaySSOResultActivity extends Activity implements IAlipayAuthEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f9488a;
    public BroadcastReceiver b;

    public static /* synthetic */ Object ipc$super(AlipaySSOResultActivity alipaySSOResultActivity, String str, Object... objArr) {
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
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/AlipaySSOResultActivity");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99bbaeb3", new Object[]{this});
        } else if (yeq.c(getIntent())) {
            yeq.b(getIntent(), this);
        } else {
            yeq.a(getIntent());
        }
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthEventHandler
    public void alipayAuthDidCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e729ee", new Object[]{this});
            return;
        }
        b("1001", UTConstant.CustomEvent.UT_SSO_AUTHCODE_CANCEL);
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_EXTEND, UTConstant.CustomEvent.UT_SINGLE_LOGIN_CANCEL, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthEventHandler
    public void alipayAuthFailure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b0429f", new Object[]{this});
            return;
        }
        b("1002", UTConstant.CustomEvent.UT_SSO_AUTHCODE_FAILURE);
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_EXTEND, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthEventHandler
    public void alipayAuthSuccess(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce07a062", new Object[]{this, str});
            return;
        }
        String alipaySsoDesKey = DataProviderFactory.getDataProvider().getAlipaySsoDesKey();
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        LoginParam loginParam = xwr.f31648a;
        if (loginParam == null) {
            str2 = UTConstant.PageName.UT_PAGE_EXTEND;
        } else {
            str2 = loginParam.utPageName;
        }
        UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_SSO_AUTHCODE_SUCCESS, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
        xwr.d(this, str, alipaySsoDesKey);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        colorDrawable.setAlpha(160);
        getWindow().setBackgroundDrawable(colorDrawable);
        super.onCreate(bundle);
        this.f9488a = new BroadcastReceiver() { // from class: com.taobao.android.sns4android.alipay2.AlipaySSOResultActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/AlipaySSOResultActivity$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    AlipaySSOResultActivity.this.finish();
                }
            }
        };
        this.b = new BroadcastReceiver() { // from class: com.taobao.android.sns4android.alipay2.AlipaySSOResultActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/AlipaySSOResultActivity$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (LoginAction.NOTIFY_ALIPAY_SSO_CANCEL.name().equals(intent.getAction())) {
                    AlipaySSOResultActivity.this.finish();
                } else if (LoginAction.NOTIFY_ALIPAY_SSO_FAIL.name().equals(intent.getAction())) {
                    AlipaySSOResultActivity.this.finish();
                } else if (LoginAction.NOTIFY_CLOSE_ALIPAY_RESULT.name().equals(intent.getAction())) {
                    AlipaySSOResultActivity.this.finish();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(LoginResActions.LOGIN_SUCCESS_ACTION);
        intentFilter.addAction(LoginResActions.LOGIN_FAIL_ACTION);
        intentFilter.addAction(LoginResActions.LOGIN_NETWORK_ERROR);
        intentFilter.addAction(LoginResActions.LOGIN_CANCEL_ACTION);
        intentFilter.addAction(LoginResActions.WEB_ACTIVITY_CANCEL);
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.f9488a, intentFilter);
        LoginBroadcastHelper.registerLoginReceiver(getApplicationContext(), this.b);
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.f9488a != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.f9488a);
        }
        if (this.b != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(getApplicationContext(), this.b);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    public final void b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce317b3", new Object[]{this, str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        LoginParam loginParam = xwr.f31648a;
        if (loginParam == null) {
            str3 = UTConstant.PageName.UT_PAGE_EXTEND;
        } else {
            str3 = loginParam.utPageName;
        }
        UserTrackAdapter.sendUT(str3, str2, str, LoginType.LocalLoginType.ASO_LOGIN, properties);
        Toast.makeText(getApplicationContext(), ResourceUtil.getStringById("aliuser_sns_alipay_failed"), 0).show();
        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LoginParam loginParam;
        Map<String, String> map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (!(i2 == 258 || i2 == 0)) {
            z = false;
        }
        if (i == 257 && z) {
            if (intent != null) {
                try {
                    loginParam = (LoginParam) intent.getSerializableExtra("loginParam");
                } catch (Exception unused) {
                    loginParam = null;
                }
                if (loginParam == null || (map = loginParam.ext) == null || !"continueLogin".equals(map.get(LoginConstant.EXT_ACTION))) {
                    finish();
                } else {
                    xwr.c(this, loginParam);
                }
            } else {
                finish();
            }
        }
    }
}
