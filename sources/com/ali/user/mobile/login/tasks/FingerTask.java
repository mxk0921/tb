package com.ali.user.mobile.login.tasks;

import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.utils.BackgroundExecutor;
import java.util.HashMap;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FingerTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206166);
    }

    public static /* synthetic */ Object ipc$super(FingerTask fingerTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/FingerTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else if (commonDataCallback != null) {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FingerTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    final String str;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FingerTask fingerTask = FingerTask.this;
                    LoginBaseParam loginBaseParam = fingerTask.loginParam;
                    if (loginBaseParam != null) {
                        TrackingModel trackingModel = fingerTask.trackingModel;
                        if (trackingModel == null) {
                            str = UTConstant.PageName.UT_PAGE_EXTEND;
                        } else {
                            str = trackingModel.pageName;
                        }
                        if (loginBaseParam.ext == null) {
                            loginBaseParam.ext = new HashMap();
                        }
                        FingerTask.this.loginParam.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.getApiRefer());
                        FingerTask.this.matchHistoryAccount();
                        FingerTask.this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
                        FingerTask fingerTask2 = FingerTask.this;
                        fingerTask2.loginParam.nativeLoginType = fingerTask2.getLoginType();
                        FingerTask fingerTask3 = FingerTask.this;
                        LoginBaseParam loginBaseParam2 = fingerTask3.loginParam;
                        TrackingModel trackingModel2 = fingerTask3.trackingModel;
                        if (trackingModel2 != null) {
                            str2 = trackingModel2.traceId;
                        } else {
                            str2 = ApiReferer.generateTraceId(fingerTask3.getLocalLoginType(), str);
                        }
                        loginBaseParam2.sdkTraceId = str2;
                        FingerTask fingerTask4 = FingerTask.this;
                        fingerTask4.loginParam.loginSourceType = fingerTask4.getLocalLoginType();
                        FingerTask fingerTask5 = FingerTask.this;
                        LoginBaseParam loginBaseParam3 = fingerTask5.loginParam;
                        loginBaseParam3.utPageName = str;
                        loginBaseParam3.nativeLoginType = fingerTask5.getLoginType();
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.FINGER_TOKEN_COMMIT, "", FingerTask.this.getLocalLoginType(), LoginComponent.getProperties(FingerTask.this.loginParam));
                        if (TextUtils.isEmpty(SecurityGuardManagerWraper.getFingerValue(FingerTask.this.loginParam.biometricId))) {
                            FingerTask.this.fail(1601, ResourceUtil.getStringById("aliuser_finger_login_failed"), str, commonDataCallback);
                        } else if (ServiceFactory.getService(FingerprintService.class) != null) {
                            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).fingerLogin(DataProviderFactory.getApplicationContext(), new CommonCallback() { // from class: com.ali.user.mobile.login.tasks.FingerTask.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onFail(int i, String str3) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str3});
                                        return;
                                    }
                                    AnonymousClass1 r0 = AnonymousClass1.this;
                                    FingerTask.this.fail(i, str3, str, commonDataCallback);
                                }

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onSuccess() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                        return;
                                    }
                                    String fingerValue = SecurityGuardManagerWraper.getFingerValue(FingerTask.this.loginParam.biometricId);
                                    if (TextUtils.isEmpty(fingerValue)) {
                                        FingerTask.this.fail(1601, ResourceUtil.getStringById("aliuser_finger_login_failed"), str, commonDataCallback);
                                        return;
                                    }
                                    AnonymousClass1 r1 = AnonymousClass1.this;
                                    FingerTask fingerTask6 = FingerTask.this;
                                    fingerTask6.loginParam.token = fingerValue;
                                    fingerTask6.success(commonDataCallback);
                                    Properties properties = new Properties();
                                    properties.setProperty("monitor", "T");
                                    UserTrackAdapter.sendUT(FingerTask.this.loginParam.utPageName, UTConstant.CustomEvent.FINGER_TOKEN_SUCCESS, properties);
                                    Properties properties2 = LoginComponent.getProperties(FingerTask.this.loginParam);
                                    FingerTask fingerTask7 = FingerTask.this;
                                    UserTrackAdapter.sendUT(fingerTask7.loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", fingerTask7.getLocalLoginType(), properties2);
                                }
                            });
                        } else {
                            FingerTask.this.fail(1600, ResourceUtil.getStringById("aliuser_finger_login_failed"), str, commonDataCallback);
                        }
                    }
                }
            });
        }
    }

    public void fail(final int i, final String str, String str2, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986855d3", new Object[]{this, new Integer(i), str, str2, commonDataCallback});
        } else if (commonDataCallback != null) {
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            String str3 = this.loginParam.utPageName;
            UserTrackAdapter.sendUT(str3, UTConstant.CustomEvent.FINGER_TOKEN_FAIL, i + "", properties);
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FingerTask.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onFail(i, str);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.BIO_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        return LoginType.ServerLoginType.BIOLOGIN.getType();
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().finger(loginBaseParam, rpcRequestCallback);
        }
    }

    public void success(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b149d2db", new Object[]{this, commonDataCallback});
        } else if (commonDataCallback != null) {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FingerTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        commonDataCallback.onSuccess(null);
                    }
                }
            });
        }
    }
}
