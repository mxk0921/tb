package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.helper.DialogHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.service.impl.UrlUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ReflectionHelper;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f27471a;

    public static void a(SNSPlatform sNSPlatform, Activity activity, wmo wmoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36cf1f9a", new Object[]{sNSPlatform, activity, wmoVar, jSONObject});
        } else if (activity != null && umo.a().b(sNSPlatform) != null) {
            umo.a().b(sNSPlatform).b(activity, wmoVar, jSONObject);
        }
    }

    public static void b(SNSPlatform sNSPlatform, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd685afe", new Object[]{sNSPlatform, str, str2});
            return;
        }
        LoginTLogAdapter.e(LoginSwitch.TAG, "appid=" + str);
        c(sNSPlatform, str, str2, "");
    }

    public static void c(SNSPlatform sNSPlatform, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb980148", new Object[]{sNSPlatform, str, str2, str3});
            return;
        }
        if (f27471a == null) {
            f27471a = new a();
        }
        if (h(sNSPlatform) || g(sNSPlatform) || i(sNSPlatform)) {
            try {
                Class<?> cls = Class.forName("com.taobao.android.sns4android.SNSOverseaAuth");
                ReflectionHelper.invokeMethod(cls, cls.getDeclaredMethod("init", SNSPlatform.class, String.class, String.class, String.class, a.class), sNSPlatform, str, str2, str3, f27471a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void d(smo smoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adc6afb", new Object[]{smoVar});
        } else if (smoVar != null) {
            if (f27471a == null) {
                f27471a = new a();
            }
            if (e(smoVar.f28149a)) {
                ts0 i = ts0.i(smoVar);
                i.e(f27471a);
                umo.a().c(smoVar.f28149a, i);
            } else if (f(smoVar.f28149a)) {
                bt0 i2 = bt0.i(smoVar);
                i2.e(f27471a);
                umo.a().c(smoVar.f28149a, i2);
            } else {
                b(smoVar.f28149a, smoVar.b, "");
            }
        }
    }

    public static boolean e(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de8031f2", new Object[]{sNSPlatform})).booleanValue();
        }
        return TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_ALIPAY.getPlatform());
    }

    public static boolean f(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f17e53f5", new Object[]{sNSPlatform})).booleanValue();
        }
        return TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_ALIPAYHK.getPlatform());
    }

    public static boolean g(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf38afee", new Object[]{sNSPlatform})).booleanValue();
        }
        return TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_FACEBOOK.getPlatform());
    }

    public static boolean h(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eebe1", new Object[]{sNSPlatform})).booleanValue();
        }
        return TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_GOOGLE.getPlatform());
    }

    public static boolean i(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c2a61c", new Object[]{sNSPlatform})).booleanValue();
        }
        return TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_LINE.getPlatform());
    }

    public static void k(SNSPlatform sNSPlatform, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e794782", new Object[]{sNSPlatform, new Integer(i), new Integer(i2), intent});
            return;
        }
        try {
            if (umo.a().b(sNSPlatform) != null) {
                umo.a().b(sNSPlatform).c(i, i2, intent);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void l(SNSPlatform sNSPlatform, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729607ee", new Object[]{sNSPlatform, activity});
        } else {
            m(sNSPlatform, activity, null);
        }
    }

    public static void m(SNSPlatform sNSPlatform, Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a939d7", new Object[]{sNSPlatform, activity, map});
        } else {
            n(sNSPlatform, activity, map, null);
        }
    }

    public static void n(SNSPlatform sNSPlatform, Activity activity, Map<String, String> map, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb72db8f", new Object[]{sNSPlatform, activity, map, loginFilterCallback});
        } else if (activity != null) {
            LoginStatus.loginEntrance = null;
            if (umo.a().b(sNSPlatform) != null) {
                Properties properties = LoginComponent.getProperties();
                if (map != null) {
                    UserTrackAdapter.sendUT(map.get(UTConstant.PageName.UT_KEY_PAGE_NAME), "snsAuthCode_commit", "", o0v.a(sNSPlatform.getPlatform()), properties);
                } else {
                    UserTrackAdapter.sendExtendUT("snsAuthCode_commit", "", o0v.a(sNSPlatform.getPlatform()), properties);
                }
                umo.a().b(sNSPlatform).f(activity, map);
                return;
            }
            ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, activity.getResources().getString(R.string.aliuser_SNS_auth_init_failed));
            BroadCastHelper.sendLoginFailBroadcast(703, "exception");
        }
    }

    public static void o(RpcResponse<LoginReturnData> rpcResponse, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb0511a", new Object[]{rpcResponse, str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("result", str2);
        UserTrackAdapter.sendUT(str, "SNS_LoginResult", String.valueOf(rpcResponse != null ? rpcResponse.code : -1), properties);
    }

    public static boolean j() {
        try {
            return Boolean.TRUE.equals(Class.forName("com.taobao.login4android.LineAuth").getDeclaredMethod("isSupportLine", new Class[0]).invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements wmo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.rmo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C1049a implements RpcRequestCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f27472a;
            public final /* synthetic */ SNSSignInAccount b;

            public C1049a(Activity activity, SNSSignInAccount sNSSignInAccount) {
                this.f27472a = activity;
                this.b = sNSSignInAccount;
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                } else {
                    a.a(a.this, this.f27472a, this.b, rpcResponse);
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else {
                    a.a(a.this, this.f27472a, this.b, rpcResponse);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DialogHelper f27473a;
            public final /* synthetic */ Activity b;
            public final /* synthetic */ SNSSignInAccount c;
            public final /* synthetic */ String d;
            public final /* synthetic */ RpcResponse e;

            public b(a aVar, DialogHelper dialogHelper, Activity activity, SNSSignInAccount sNSSignInAccount, String str, RpcResponse rpcResponse) {
                this.f27473a = dialogHelper;
                this.b = activity;
                this.c = sNSSignInAccount;
                this.d = str;
                this.e = rpcResponse;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                this.f27473a.dismissAlertDialog();
                if (this.b != null) {
                    UrlParam urlParam = new UrlParam();
                    urlParam.needTitle = false;
                    LoginParam loginParam = new LoginParam();
                    loginParam.sdkTraceId = ApiReferer.generateTraceId(o0v.b(this.c.snsType), UTConstant.PageName.UT_PAGE_EXTEND);
                    loginParam.nativeLoginType = o0v.b(this.c.snsType);
                    loginParam.utPageName = this.d;
                    loginParam.loginSourceType = o0v.b(this.c.snsType);
                    urlParam.loginParam = loginParam;
                    LoginContext.sCurrentLoginParam = loginParam;
                    ((SNSService) ServiceFactory.getService(SNSService.class)).onH5(this.b, this.e, urlParam);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements CommonDataCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f27474a;
            public final /* synthetic */ SNSSignInAccount b;
            public final /* synthetic */ UrlParam c;
            public final /* synthetic */ String d;
            public final /* synthetic */ Activity e;

            public c(a aVar, String str, SNSSignInAccount sNSSignInAccount, UrlParam urlParam, String str2, Activity activity) {
                this.f27474a = str;
                this.b = sNSSignInAccount;
                this.c = urlParam;
                this.d = str2;
                this.e = activity;
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                Properties properties = LoginComponent.getProperties();
                if (i == 10003 || i == 10004 || i == 15 || i == 1403) {
                    UserTrackAdapter.sendUT(this.d, UTConstant.CustomEvent.UT_SINGLE_LOGIN_CANCEL, "", o0v.b(this.b.snsType), properties);
                    BroadCastHelper.sendLoginFailBroadcast(701, "user cancel");
                    return;
                }
                String str2 = this.d;
                UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, i + "", o0v.b(this.b.snsType), properties);
                BroadCastHelper.sendLoginFailBroadcast(i, str);
                if (this.e != null) {
                    ((SNSService) ServiceFactory.getService(SNSService.class)).toast(this.e, str);
                }
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else if (map != null) {
                    UserTrackAdapter.sendUT(this.f27474a, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", o0v.b(this.b.snsType), LoginComponent.getProperties());
                    String str = map.get(UccConstants.PARAM_LOGIN_DATA);
                    if (!TextUtils.isEmpty(str)) {
                        HashMap hashMap = new HashMap();
                        LoginTLogAdapter.e("login_optimize", "loginType=" + this.c.loginType);
                        if (!TextUtils.isEmpty(this.c.loginType)) {
                            hashMap.put(LoginConstants.LOGIN_TYPE, this.c.loginType);
                        }
                        LoginDataHelper.processLoginReturnData(true, (LoginReturnData) JSON.parseObject(str, LoginReturnData.class), hashMap);
                        return;
                    }
                    BroadCastHelper.sendLoginFailBroadcast(702, "");
                } else {
                    BroadCastHelper.sendLoginFailBroadcast(702, "");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class d implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RpcResponse f27475a;
            public final /* synthetic */ DialogHelper b;

            public d(a aVar, RpcResponse rpcResponse, DialogHelper dialogHelper) {
                this.f27475a = rpcResponse;
                this.b = dialogHelper;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                BroadCastHelper.sendLoginFailBroadcast(703, this.f27475a.message);
                this.b.dismissAlertDialog();
            }
        }

        public static /* synthetic */ void a(a aVar, Activity activity, SNSSignInAccount sNSSignInAccount, RpcResponse rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ed87d20", new Object[]{aVar, activity, sNSSignInAccount, rpcResponse});
            } else {
                aVar.b(activity, sNSSignInAccount, rpcResponse);
            }
        }

        @Override // tb.wmo
        public void onCancel(Activity activity, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77c620a6", new Object[]{this, activity, str, str2});
                return;
            }
            Properties properties = LoginComponent.getProperties();
            if (TextUtils.isEmpty(str2)) {
                str2 = UTConstant.PageName.UT_PAGE_EXTEND;
            }
            UserTrackAdapter.sendUT(str2, "snsAuthCode_cancel", "", o0v.b(str), properties);
            BroadCastHelper.sendCancelBroadcast("701", "用户取消");
        }

        @Override // tb.wmo
        public void onError(Activity activity, String str, int i, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7321aa0b", new Object[]{this, activity, str, new Integer(i), str2, str3});
                return;
            }
            Properties properties = LoginComponent.getProperties();
            if (TextUtils.isEmpty(str3)) {
                str3 = UTConstant.PageName.UT_PAGE_EXTEND;
            }
            UserTrackAdapter.sendUT(str3, "snsAuthCode_failure", i + "", o0v.b(str), properties);
            if (activity != null && !activity.isFinishing()) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str2);
            }
            BroadCastHelper.sendLoginFailBroadcast(i, str2);
        }

        @Override // tb.wmo
        public void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8032b9ea", new Object[]{this, activity, sNSSignInAccount});
                return;
            }
            if (activity != null) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).showLoading(activity);
            }
            if (TextUtils.isEmpty(sNSSignInAccount.utPageName)) {
                str = UTConstant.PageName.UT_PAGE_EXTEND;
            } else {
                str = sNSSignInAccount.utPageName;
            }
            Properties properties = LoginComponent.getProperties();
            UserTrackAdapter.sendUT(str, "snsAuthCode_success", "", o0v.b(sNSSignInAccount.snsType), properties);
            UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", o0v.b(sNSSignInAccount.snsType), properties);
            tmo.a().b(sNSSignInAccount, new C1049a(activity, sNSSignInAccount));
        }

        public final void b(Activity activity, SNSSignInAccount sNSSignInAccount, RpcResponse<LoginReturnData> rpcResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a42fb828", new Object[]{this, activity, sNSSignInAccount, rpcResponse});
                return;
            }
            if (activity != null) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).dismissLoading(activity);
            }
            try {
                if (TextUtils.isEmpty(sNSSignInAccount.utPageName)) {
                    str = UTConstant.PageName.UT_PAGE_EXTEND;
                } else {
                    str = sNSSignInAccount.utPageName;
                }
                o0v.c(sNSSignInAccount.snsType);
                if (rpcResponse == null) {
                    rmo.o(rpcResponse, str, "Other");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "704", o0v.b(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    BroadCastHelper.sendLoginFailBroadcast(704, "sns auth code login with empty response");
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, ResourceUtil.getNetworkError());
                        return;
                    }
                    return;
                }
                String str2 = rpcResponse.actionType;
                String str3 = rpcResponse.message;
                if (TextUtils.isEmpty(str3)) {
                    str3 = ResourceUtil.getNetworkError();
                }
                if ("SUCCESS".equals(str2) && rpcResponse.returnValue != null) {
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).onLoginSuccess(activity, sNSSignInAccount, rpcResponse);
                    }
                    try {
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", o0v.b(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    } catch (Throwable unused) {
                    }
                } else if (ApiConstants.ResultActionType.TOAST.equalsIgnoreCase(str2)) {
                    rmo.o(rpcResponse, str, "Other");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), o0v.b(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str3);
                    }
                    BroadCastHelper.sendLoginFailBroadcast(703, str3);
                } else if ("H5".equals(str2) && rpcResponse.returnValue != null) {
                    rmo.o(rpcResponse, str, "h5");
                    UrlParam urlParam = new UrlParam();
                    urlParam.loginType = o0v.b(sNSSignInAccount.snsType);
                    LoginParam loginParam = new LoginParam();
                    loginParam.sdkTraceId = ApiReferer.generateTraceId(o0v.b(sNSSignInAccount.snsType), UTConstant.PageName.UT_PAGE_EXTEND);
                    loginParam.nativeLoginType = o0v.b(sNSSignInAccount.snsType);
                    loginParam.utPageName = str;
                    loginParam.loginSourceType = o0v.b(sNSSignInAccount.snsType);
                    urlParam.loginParam = loginParam;
                    LoginContext.sCurrentLoginParam = loginParam;
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).onH5(activity, rpcResponse, urlParam);
                    }
                } else if (ApiConstants.ResultActionType.ALERT_WITH_H5.equals(str2)) {
                    rmo.o(rpcResponse, str, "alert_with_h5");
                    DialogHelper dialogHelper = new DialogHelper(activity);
                    dialogHelper.alert("", rpcResponse.message, activity.getResources().getString(R.string.aliuser_confirm), new b(this, dialogHelper, activity, sNSSignInAccount, str, rpcResponse), null, null);
                } else if (ApiConstants.ResultActionType.UCC_H5.equals(str2) && rpcResponse.returnValue != null) {
                    rmo.o(rpcResponse, str, "ucc_h5");
                    String str4 = rpcResponse.returnValue.h5Url;
                    UrlParam urlParam2 = new UrlParam();
                    urlParam2.loginType = o0v.b(sNSSignInAccount.snsType);
                    LoginReturnData loginReturnData = rpcResponse.returnValue;
                    urlParam2.token = loginReturnData.token;
                    urlParam2.scene = loginReturnData.scene;
                    urlParam2.url = str4;
                    UrlUtil.OpenUCC(activity, urlParam2, new c(this, str, sNSSignInAccount, urlParam2, str, activity));
                } else if (ApiConstants.ResultActionType.ALERT.equals(str2)) {
                    rmo.o(rpcResponse, str, "Alert");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), o0v.b(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    if (activity != null) {
                        DialogHelper dialogHelper2 = new DialogHelper(activity);
                        String string = activity.getResources().getString(R.string.aliuser_SNS_cancel);
                        String string2 = activity.getResources().getString(R.string.aliuser_confirm);
                        d dVar = new d(this, rpcResponse, dialogHelper2);
                        dialogHelper2.alert("", rpcResponse.message, string2, dVar, string, dVar);
                    }
                } else {
                    rmo.o(rpcResponse, str, "Other");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), o0v.b(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str3);
                    }
                    BroadCastHelper.sendLoginFailBroadcast(rpcResponse.code, rpcResponse.message);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                if (activity != null) {
                    ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, ResourceUtil.getNetworkError());
                }
                BroadCastHelper.sendLoginFailBroadcast(703, "exception");
            }
        }
    }
}
