package com.taobao.android.sso.v2.service;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.thread.LoginAsyncTask;
import com.taobao.taobaocompat.lifecycle.AppForgroundObserver;
import com.uc.webview.export.extension.UCCore;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LoginAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger NOTIFICATION_ID = new AtomicInteger(1);
    public String TAG = "loginsdk.accs";
    private AccsLoginReceiver mAccsLoginReceiver;

    public static /* synthetic */ void access$000(LoginAccsService loginAccsService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d69959c", new Object[]{loginAccsService, str});
        } else {
            loginAccsService.showWebViewPage(str);
        }
    }

    public static /* synthetic */ Object ipc$super(LoginAccsService loginAccsService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sso/v2/service/LoginAccsService");
        }
    }

    private boolean isForground() {
        try {
            IpChange ipChange = AppForgroundObserver.$ipChange;
            return AppForgroundObserver.class.getField("isForeground").getBoolean(AppForgroundObserver.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    private void showWebViewPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7a5f5c", new Object[]{this, str});
            return;
        }
        try {
            UserTrackAdapter.sendUT("Event_onekeylogin_showWebView");
            Intent intent = new Intent(this, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, str);
            intent.addFlags(805306368);
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.mAccsLoginReceiver = new AccsLoginReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AccsLoginReceiver.NOTIFICATION_ACTION);
        registerReceiver(this.mAccsLoginReceiver, intentFilter);
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AccsLoginReceiver accsLoginReceiver = this.mAccsLoginReceiver;
        if (accsLoginReceiver != null) {
            unregisterReceiver(accsLoginReceiver);
        }
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    private void saveLoginMessage(AccsLoginMessageModel2 accsLoginMessageModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48da7e", new Object[]{this, accsLoginMessageModel2});
        } else if (accsLoginMessageModel2 != null) {
            SharedPreferences.Editor edit = getSharedPreferences("userinfo", 4).edit();
            edit.putString("accs_login", accsLoginMessageModel2.url + (char) 5 + System.currentTimeMillis());
            edit.apply();
            LoginContext.NEED_ACCS_LOGIN = true;
        }
    }

    private void showLoginNotification(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686b3ddc", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            int incrementAndGet = NOTIFICATION_ID.incrementAndGet();
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
            Intent intent = new Intent();
            intent.setAction(AccsLoginReceiver.NOTIFICATION_ACTION);
            intent.putExtra(WebConstant.WEBURL, str3);
            builder.setContentTitle(str).setSmallIcon(ResourceUtil.getDrawableId("tao_mag_icon_white")).setLargeIcon(BitmapFactory.decodeResource(getResources(), ResourceUtil.getDrawableId("tao_mag_icon"))).setAutoCancel(true).setContentText(str2).setTicker(str2).setContentIntent(ya.e(this, incrementAndGet, intent, 201326592));
            ((NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION)).notify(incrementAndGet, builder.build());
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.trace(this.TAG, "showLoginNotification error", th);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (bArr != null && DataProviderFactory.getDataProvider().needAccsLogin()) {
            try {
                final AccsLoginMessageModel2 accsLoginMessageModel2 = (AccsLoginMessageModel2) JSON.parseObject(new String(bArr, "utf-8"), AccsLoginMessageModel2.class);
                if (accsLoginMessageModel2 != null && TextUtils.equals(accsLoginMessageModel2.type, "logoutEventType")) {
                    LoginTLogAdapter.e(this.TAG, "received logoutEventType");
                    SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "pushLogoutContent", accsLoginMessageModel2.content);
                    SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "pushLogoutTime", Long.valueOf(System.currentTimeMillis()));
                    LoginTLogAdapter.e(this.TAG, "local session valid, call logout");
                    Login.logout();
                } else if (accsLoginMessageModel2 != null && !TextUtils.isEmpty(accsLoginMessageModel2.url)) {
                    UserTrackAdapter.sendUT("Event_onekeylogin_receive_token");
                    if (isForground()) {
                        new LoginAsyncTask<Void, Void, Void>() { // from class: com.taobao.android.sso.v2.service.LoginAccsService.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str4, Object... objArr) {
                                str4.hashCode();
                                int hashCode = str4.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/android/sso/v2/service/LoginAccsService$1");
                            }

                            public Void excuteTask(Void... voidArr) throws RemoteException {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return (Void) ipChange2.ipc$dispatch("35b37603", new Object[]{this, voidArr});
                                }
                                if (Login.checkSessionValid() || TextUtils.isEmpty(Login.getLoginToken()) || TextUtils.isEmpty(Login.getUserId())) {
                                    return null;
                                }
                                LoginTLogAdapter.e(LoginAsyncTask.TAG, "checkSessionValid, do autoLogin");
                                try {
                                    LoginController.getInstance().processAutoLoginResponse(new AutoLoginBusiness().autoLogin(Login.getLoginToken(), Login.getUserId(), DataProviderFactory.getDataProvider().getSite(), true, "auto login for accs"), false);
                                    return null;
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return null;
                                }
                            }

                            public void onPostExecute(Void r5) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("213d104", new Object[]{this, r5});
                                } else {
                                    LoginAccsService.access$000(LoginAccsService.this, accsLoginMessageModel2.url);
                                }
                            }
                        }.execute(new Void[0]);
                    } else {
                        showLoginNotification(accsLoginMessageModel2.title, accsLoginMessageModel2.content, accsLoginMessageModel2.url);
                        saveLoginMessage(accsLoginMessageModel2);
                    }
                } else if (accsLoginMessageModel2 != null && TextUtils.equals(accsLoginMessageModel2.type, "dynamicCodeVerify")) {
                    LoginParam loginParam = new LoginParam();
                    loginParam.hid = Long.parseLong(Login.getUserId());
                    loginParam.token = accsLoginMessageModel2.body;
                    LoginDataRepository.getInstance().dynamicCodePopup(loginParam, new RpcRequestCallback() { // from class: com.taobao.android.sso.v2.service.LoginAccsService.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.callback.RpcRequestCallback
                        public void onError(RpcResponse rpcResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                return;
                            }
                            LoginTLogAdapter.e("dynamicCodeVerify", "response is error :" + rpcResponse);
                        }

                        @Override // com.ali.user.mobile.callback.RpcRequestCallback
                        public void onSuccess(RpcResponse rpcResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                            } else if (rpcResponse == null) {
                                LoginTLogAdapter.e("dynamicCodeVerify", "response is null");
                            } else if (TextUtils.equals("SUCCESS", rpcResponse.actionType)) {
                                LoginReturnData loginReturnData = (LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue;
                                LoginTLogAdapter.e("dynamicCodeVerify", "response suc h5url:" + loginReturnData.h5Url);
                                if (!TextUtils.isEmpty(loginReturnData.h5Url)) {
                                    UrlParam urlParam = new UrlParam();
                                    urlParam.url = loginReturnData.h5Url;
                                    urlParam.site = DataProviderFactory.getDataProvider().getSite();
                                    urlParam.flags = UCCore.VERIFY_POLICY_PAK_QUICK;
                                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(DataProviderFactory.getApplicationContext(), urlParam);
                                }
                            }
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
