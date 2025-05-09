package com.ali.user.mobile.app.init;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.IDataProvider;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.ali.user.mobile.service.UIService;
import com.ali.user.mobile.service.UserTrackService;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.open.core.model.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c21;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static AtomicBoolean INITED = new AtomicBoolean(false);
    public static final String INIT_TAG = "init.login-tag";
    private static final String TAG = "login.AliUserSdkInit";

    static {
        t2o.a(68157460);
    }

    public static void addTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c27643b", new Object[]{str});
            return;
        }
        try {
            SessionManager.getInstance(DataProviderFactory.getApplicationContext()).trackLoginValid("sessionValid", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void backToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e596ac", new Object[0]);
            return;
        }
        try {
            c21.c(new IApmEventListener() { // from class: com.ali.user.mobile.app.init.AliUserInit.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            AliUserInit.addTrack("backToForeground");
                            try {
                                if (CommonUtil.isInABTestRegion("backToForeground", 10000)) {
                                    if (!LoginStatus.isUserLogin() && !TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getLoginToken())) {
                                        return;
                                    }
                                    NetworkUtil.preFecth("backToForeground");
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th.printStackTrace();
                                return;
                            }
                        } else if (i != 50) {
                            return;
                        }
                    }
                    AliUserInit.addTrack("toBackground");
                }
            });
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "backToForegroundException:" + th.getMessage());
        }
    }

    public static void init(IDataProvider iDataProvider, final DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd612d0", new Object[]{iDataProvider, dataCallback});
            return;
        }
        LoginTLogAdapter.e(TAG, "AliUserInit 初始化开始");
        if (!INITED.compareAndSet(false, true)) {
            LoginTLogAdapter.e("AliUserSdkInit", "duplicate init");
        } else if (iDataProvider == null || iDataProvider.getContext() == null) {
            LoginTLogAdapter.e("login.LaunchInit", new RuntimeException("DataProvider object is null, Failed to initialize"));
        } else {
            LoginTLogAdapter.e("init.login-tag", "AliUserInit init: start");
            DataProviderFactory.setDataProvider(iDataProvider);
            try {
                AlipayInfo.getInstance().init();
            } catch (Throwable th) {
                th.printStackTrace();
                LoginTLogAdapter.e(TAG, "AliUserInit init exception: ", th);
            }
            AppInfo.getInstance().init(new DataCallback<String>() { // from class: com.ali.user.mobile.app.init.AliUserInit.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void result(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str});
                        return;
                    }
                    LoginTLogAdapter.e(AliUserInit.TAG, "AppInfo 初始化结束");
                    DataCallback dataCallback2 = DataCallback.this;
                    if (dataCallback2 != null) {
                        dataCallback2.result(str);
                    }
                }
            });
            LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).sendBroadcast(new Intent(AppInfo.INITED_ACTION));
            LoginTLogAdapter.e(TAG, "AliUserInit start send broadcast");
            CommonCallback commonCallback = LoginContext.callback;
            if (commonCallback != null) {
                commonCallback.onSuccess();
            }
            initACCSLogin();
            LoginTLogAdapter.e("init.login-tag", "AliUserInit init: end ~");
            backToForeground();
        }
    }

    private static void initACCSLogin() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a706e", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = DataProviderFactory.getApplicationContext().getSharedPreferences("userinfo", 4);
        String string = sharedPreferences.getString("accs_login", "");
        if (!TextUtils.isEmpty(string) && (split = TextUtils.split(string, Constants.COOKIE_SPLIT)) != null && split.length == 2) {
            try {
                if (System.currentTimeMillis() - Long.parseLong(split[1]) <= 300000) {
                    LoginContext.NEED_ACCS_LOGIN = true;
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("accs_login");
                edit.apply();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        LoginContext.NEED_ACCS_LOGIN = false;
    }

    public static void initSystemService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb13d7dd", new Object[0]);
            return;
        }
        ServiceFactory.registerService(RpcService.class);
        ServiceFactory.registerService(StorageService.class);
        ServiceFactory.registerService(NavigatorService.class);
        ServiceFactory.registerService(UIService.class);
        ServiceFactory.registerService(FaceService.class);
        ServiceFactory.registerService(SNSService.class);
        ServiceFactory.registerService(FingerprintService.class);
        ServiceFactory.registerService(UserTrackService.class);
        ServiceFactory.registerService(NumberAuthService.class);
    }
}
