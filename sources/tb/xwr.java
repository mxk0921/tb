package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.base.helper.LoginResultHelper;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.utils.ToastUtil;
import java.util.HashMap;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LoginParam f31648a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31650a;
        public final /* synthetic */ int b;

        public b(String str, int i) {
            this.f31650a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.f31650a)) {
                try {
                    ToastUtil.showToast(DataProviderFactory.getApplicationContext(), this.f31650a, this.b);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31651a;

        public c(String str) {
            this.f31651a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LoginStatus.setLastRefreshCookieTime(0L);
            Intent intent = new Intent(LoginResActions.LOGIN_NETWORK_ERROR);
            if (!TextUtils.isEmpty(this.f31651a)) {
                intent.putExtra("message", this.f31651a);
            }
            BroadCastHelper.sendLocalBroadCast(intent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends AsyncTask<Object, Void, RpcResponse<LoginReturnData>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginParam f31652a;
        public final /* synthetic */ Activity b;

        public d(LoginParam loginParam, Activity activity) {
            this.f31652a = loginParam;
            this.b = activity;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/TBSsoLogin$4");
        }

        /* renamed from: a */
        public RpcResponse<LoginReturnData> doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpcResponse) ipChange.ipc$dispatch("85055509", new Object[]{this, objArr});
            }
            try {
                LoginParam loginParam = this.f31652a;
                if (loginParam.ext == null) {
                    loginParam.ext = new HashMap();
                }
                this.f31652a.ext.put(LoginConstants.MTOP_API_REFERENCE, "SSOV2_H5_tokenLogin");
                return xwr.h(this.f31652a);
            } catch (RpcException e) {
                try {
                    Properties properties = new Properties();
                    properties.setProperty("username", this.f31652a.loginId + "");
                    properties.setProperty("errorCode", String.valueOf(e.getCode()));
                    properties.setProperty("target", "RPCException");
                    if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                        properties.setProperty("appName", DataProviderFactory.getDataProvider().getAppkey());
                    }
                    UserTrackAdapter.sendUT("Event_LoginFail", properties);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(RpcResponse<LoginReturnData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e04a30", new Object[]{this, rpcResponse});
                return;
            }
            try {
                if (rpcResponse == null) {
                    xwr.b(-1, ResourceUtil.getNetworkError());
                    return;
                }
                LoginReturnData loginReturnData = rpcResponse.returnValue;
                if ("SUCCESS".equals(rpcResponse.actionType) && loginReturnData != null) {
                    LoginReturnData loginReturnData2 = rpcResponse.returnValue;
                    if (loginReturnData2.extMap == null) {
                        loginReturnData2.extMap = new HashMap();
                    }
                    rpcResponse.returnValue.extMap.put("login_type", "auth");
                    HashMap hashMap = new HashMap();
                    hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.TOKEN_LOGIN);
                    LoginDataHelper.processLoginReturnData(true, rpcResponse.returnValue, hashMap);
                } else if ("H5".equals(rpcResponse.actionType)) {
                    LoginParam loginParam = new LoginParam();
                    loginParam.tokenType = TokenType.TAOBAO_SSO;
                    loginParam.errorCode = rpcResponse.code + "";
                    loginParam.sendLoginFailWhenWebviewCancel = true;
                    LoginResultHelper.gotoH5PlaceHolder(this.b, loginReturnData, loginParam);
                } else {
                    String networkError = ResourceUtil.getNetworkError();
                    if (!TextUtils.isEmpty(rpcResponse.message)) {
                        networkError = rpcResponse.message;
                    }
                    xwr.b(-2, networkError);
                }
            } catch (RpcException unused) {
                xwr.b(-1, ResourceUtil.getNetworkError());
            }
        }
    }

    public static /* synthetic */ void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e661c1a2", new Object[]{str, new Integer(i)});
        } else {
            g(str, i);
        }
    }

    public static /* synthetic */ void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88089455", new Object[]{new Integer(i), str});
        } else {
            e(i, str);
        }
    }

    public static void c(Activity activity, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf08eb96", new Object[]{activity, loginParam});
        } else {
            new CoordinatorWrapper().execute(new d(loginParam, activity), new Object[0]);
        }
    }

    public static void d(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d76ad1", new Object[]{activity, str, str2});
            return;
        }
        UserTrackAdapter.sendUT("Alipay_AuthCode_Login");
        new CoordinatorWrapper().execute(new a(str, str2, activity), new Object[0]);
    }

    public static void e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5daf5b2b", new Object[]{new Integer(i), str});
        } else {
            MainThreadExecutor.execute(new c(str));
        }
    }

    public static void f(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fa4cae", new Object[]{loginParam});
        } else {
            f31648a = loginParam;
        }
    }

    public static void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{str, new Integer(i)});
        } else {
            MainThreadExecutor.execute(new b(str, i));
        }
    }

    public static RpcResponse h(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("b0c545a7", new Object[]{loginParam});
        }
        if (loginParam.token != null) {
            return UserLoginServiceImpl.getInstance().loginByToken(loginParam);
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends AsyncTask<Object, Void, RpcResponse<LoginReturnData>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31649a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;

        public a(String str, String str2, Activity activity) {
            this.f31649a = str;
            this.b = str2;
            this.c = activity;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/TBSsoLogin$1");
        }

        /* renamed from: a */
        public RpcResponse<LoginReturnData> doInBackground(Object... objArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpcResponse) ipChange.ipc$dispatch("85055509", new Object[]{this, objArr});
            }
            try {
                if (xwr.f31648a != null) {
                    LoginContext.sSingleLoginStartTime = System.currentTimeMillis();
                    Properties properties = new Properties();
                    properties.setProperty("monitor", "T");
                    if (xwr.f31648a == null) {
                        str = "";
                    } else {
                        str = xwr.f31648a.sdkTraceId + "";
                    }
                    properties.setProperty("sdkTraceId", str);
                    UserTrackAdapter.sendUT(xwr.f31648a.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
                }
                HashMap hashMap = new HashMap();
                hashMap.put(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, this.f31649a);
                hashMap.put(AlipayConstant.SSO_ALIPAY_DES_KEY, this.b);
                hashMap.put(AlipayConstant.SSO_ALIPAY_ENABLE_KEY, "true");
                hashMap.put("uuid", AlipayInfo.getInstance().getApdidToken());
                return UserLoginServiceImpl.getInstance().loginByAlipaySSOToken(null, hashMap, xwr.f31648a);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(RpcResponse<LoginReturnData> rpcResponse) {
            String str;
            String str2;
            LoginReturnData loginReturnData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e04a30", new Object[]{this, rpcResponse});
                return;
            }
            if (rpcResponse != null) {
                try {
                    if (rpcResponse.returnValue != null && rpcResponse.code == 3000) {
                        if (xwr.f31648a != null) {
                            Properties properties = new Properties();
                            properties.setProperty("sdkTraceId", xwr.f31648a.sdkTraceId + "");
                            properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                            properties.setProperty("loginId", xwr.f31648a.loginId + "");
                            properties.setProperty("duration", (System.currentTimeMillis() - LoginContext.sLoginRpcStartTime) + "");
                            LoginContext.sLoginRpcStartTime = 0L;
                            UserTrackAdapter.sendUT(xwr.f31648a.utPageName, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
                            Properties properties2 = new Properties();
                            if (xwr.f31648a == null) {
                                str = "";
                            } else {
                                str = xwr.f31648a.sdkTraceId + "";
                            }
                            properties2.setProperty("sdkTraceId", str);
                            properties2.setProperty("monitor", "T");
                            properties2.setProperty("duration", (System.currentTimeMillis() - LoginContext.sSingleLoginStartTime) + "");
                            LoginContext.sSingleLoginStartTime = 0L;
                            UserTrackAdapter.sendUT(xwr.f31648a.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.ASO_LOGIN, properties2);
                        }
                        xwr.f31648a = null;
                        HashMap hashMap = new HashMap();
                        hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.ASO_LOGIN);
                        LoginDataHelper.processLoginReturnData(true, rpcResponse.returnValue, hashMap);
                        AppMonitorAdapter.commitSuccess("Page_Member_SSO", "AlipaySSO_Login");
                        return;
                    }
                } catch (RpcException e) {
                    e.printStackTrace();
                    SDKExceptionHelper.getInstance().rpcExceptionHandler(e);
                    BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_NETWORK_ERROR));
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
                    return;
                }
            }
            if (rpcResponse != null && "H5".equals(rpcResponse.actionType) && (loginReturnData = rpcResponse.returnValue) != null) {
                LoginReturnData loginReturnData2 = loginReturnData;
                LoginParam loginParam = new LoginParam();
                loginParam.tokenType = TokenType.ALIPAY_SSO;
                LoginParam loginParam2 = xwr.f31648a;
                if (loginParam2 != null) {
                    loginParam.loginSourceType = loginParam2.loginSourceType;
                    loginParam.utPageName = loginParam2.utPageName;
                    loginParam.sdkTraceId = loginParam2.sdkTraceId;
                    loginParam.source = loginParam2.source;
                }
                loginParam.errorCode = rpcResponse.code + "";
                loginParam.sendLoginFailWhenWebviewCancel = true;
                LoginResultHelper.gotoH5PlaceHolder(this.c, loginReturnData2, loginParam);
                UserTrackAdapter.sendUT("Alipay_AuthCode_Login_H5");
            } else if (rpcResponse == null || rpcResponse.actionType == null || TextUtils.isEmpty(rpcResponse.message)) {
                xwr.b(rpcResponse != null ? rpcResponse.code : -1, ResourceUtil.getNetworkError());
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
            } else {
                Properties properties3 = new Properties();
                properties3.setProperty("code", String.valueOf(rpcResponse.code));
                properties3.setProperty("message", rpcResponse.message);
                String str3 = rpcResponse.code + "";
                if (xwr.f31648a != null) {
                    Properties properties4 = new Properties();
                    properties4.setProperty("sdkTraceId", xwr.f31648a.sdkTraceId + "");
                    properties4.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                    properties4.setProperty("duration", (System.currentTimeMillis() - LoginContext.sLoginRpcStartTime) + "");
                    LoginContext.sLoginRpcStartTime = 0L;
                    UserTrackAdapter.sendUT(xwr.f31648a.utPageName, UTConstant.CustomEvent.UT_LOGIN_FAIL, str3, properties4);
                }
                Properties properties5 = new Properties();
                if (xwr.f31648a == null) {
                    str2 = "";
                } else {
                    str2 = xwr.f31648a.sdkTraceId + "";
                }
                properties5.setProperty("sdkTraceId", str2);
                properties5.setProperty("monitor", "T");
                properties5.setProperty("duration", (System.currentTimeMillis() - LoginContext.sSingleLoginStartTime) + "");
                LoginContext.sSingleLoginStartTime = 0L;
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_EXTEND, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str3, LoginType.LocalLoginType.ASO_LOGIN, properties5);
                xwr.f31648a = null;
                xwr.a(rpcResponse.message, 0);
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
            }
        }
    }
}
