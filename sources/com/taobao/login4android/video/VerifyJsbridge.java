package com.taobao.login4android.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.helper.DialogHelper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.verify.VerifyApi;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.taobao.R;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.h1p;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VerifyJsbridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver mLoginReceiver;
    private WVCallBackContext mCallback = null;
    private final String TAG = "loginsdk.JSBridgeService";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.video.VerifyJsbridge$5  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_IV_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_IV_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(517996626);
    }

    public static /* synthetic */ void access$000(VerifyJsbridge verifyJsbridge, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2462b234", new Object[]{verifyJsbridge, wVCallBackContext, str});
        } else {
            verifyJsbridge.successCallback(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ Context access$100(VerifyJsbridge verifyJsbridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9204dc4", new Object[]{verifyJsbridge});
        }
        return verifyJsbridge.mContext;
    }

    public static /* synthetic */ Context access$200(VerifyJsbridge verifyJsbridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("22219f63", new Object[]{verifyJsbridge});
        }
        return verifyJsbridge.mContext;
    }

    public static /* synthetic */ void access$300(VerifyJsbridge verifyJsbridge, WVCallBackContext wVCallBackContext, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c750d2", new Object[]{verifyJsbridge, wVCallBackContext, str, new Integer(i)});
        } else {
            verifyJsbridge.errorCallback(wVCallBackContext, str, i);
        }
    }

    public static /* synthetic */ WVCallBackContext access$400(VerifyJsbridge verifyJsbridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("bdf814ca", new Object[]{verifyJsbridge});
        }
        return verifyJsbridge.mCallback;
    }

    public static /* synthetic */ void access$500(VerifyJsbridge verifyJsbridge, WVCallBackContext wVCallBackContext, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e770168", new Object[]{verifyJsbridge, wVCallBackContext, new Integer(i), str});
        } else {
            verifyJsbridge.ivErrorCallback(wVCallBackContext, i, str);
        }
    }

    private synchronized void applyIVToken(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec3276c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        try {
            String string = new JSONObject(str).getString("actionType");
            IWVWebView iWVWebView = this.mWebView;
            if (iWVWebView != null) {
                try {
                    String host = Uri.parse(iWVWebView.getUrl()).getHost();
                    if (DataProviderFactory.getDataProvider().getEnvType() == LoginEnvType.ONLINE.getSdkEnvType() && !host.endsWith(".taobao.com") && !host.endsWith(h1p.TMALL_HOST)) {
                        ivErrorCallback(wVCallBackContext, -3, "invalid host");
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (this.mLoginReceiver == null) {
                this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.video.VerifyJsbridge.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/video/VerifyJsbridge$4");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent != null) {
                            int i = AnonymousClass5.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                            if (i == 1) {
                                String stringExtra = intent.getStringExtra("token");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    nsw nswVar = new nsw();
                                    nswVar.j("HY_SUCCESS");
                                    nswVar.b("token", stringExtra);
                                    if (VerifyJsbridge.access$400(VerifyJsbridge.this) != null) {
                                        VerifyJsbridge.access$400(VerifyJsbridge.this).success(nswVar);
                                        return;
                                    }
                                    return;
                                }
                                VerifyJsbridge.access$500(VerifyJsbridge.this, wVCallBackContext, -2, "empty token");
                            } else if (i == 2) {
                                VerifyJsbridge.access$500(VerifyJsbridge.this, wVCallBackContext, intent.getIntExtra("errorCode", 1100), intent.getStringExtra("message"));
                            }
                        }
                    }
                };
                LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            }
            LoginController.getInstance().navToIVByScene(DataProviderFactory.getApplicationContext(), string, DataProviderFactory.getDataProvider().getSite());
        } catch (Exception unused) {
            ivErrorCallback(wVCallBackContext, -1, "error param");
        }
    }

    private synchronized void biometricIV(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31ef0f3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        final nsw nswVar = new nsw();
        String optString = new JSONObject(str).optString(SessionConstants.BIOMETRIC);
        if (ServiceFactory.getService(FingerprintService.class) != null) {
            final String fingerValue = SecurityGuardManagerWraper.getFingerValue(optString);
            if (!TextUtils.isEmpty(fingerValue)) {
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).fingerIV(this.mContext, new CommonCallback() { // from class: com.taobao.login4android.video.VerifyJsbridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onFail(int i, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                            return;
                        }
                        nswVar.a("code", Integer.valueOf(i));
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 != null) {
                            wVCallBackContext2.error(nswVar);
                        }
                    }

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        nswVar.b("biometricKey", fingerValue);
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 != null) {
                            wVCallBackContext2.success(nswVar);
                        }
                    }
                });
                return;
            }
            nswVar.a("code", 4021);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(nswVar);
        }
    }

    public static VerifyParam buildVerifyParam(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyParam) ipChange.ipc$dispatch("9775b46e", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(SessionConstants.BIOMETRIC);
        String string = jSONObject.getString("requestScene");
        String string2 = jSONObject.getString("biometricType");
        String optString2 = jSONObject.optString("token");
        VerifyParam verifyParam = new VerifyParam();
        verifyParam.biometricId = optString;
        verifyParam.requestScene = string;
        verifyParam.biometricType = string2;
        verifyParam.loginToken = optString2;
        return verifyParam;
    }

    private synchronized void checkBiometricStatus(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcca3970", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        String optString = new JSONObject(str).optString(SessionConstants.BIOMETRIC);
        if (ServiceFactory.getService(FingerprintService.class) != null) {
            if (!TextUtils.isEmpty(SecurityGuardManagerWraper.getFingerValue(optString))) {
                if (wVCallBackContext != null) {
                    nswVar.b("supportBiometricType", "fingerprint");
                    wVCallBackContext.success(nswVar);
                }
                return;
            }
            nswVar.a("code", 4021);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(nswVar);
        }
    }

    private synchronized void closeBiometric(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e152a8ee", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            final VerifyParam buildVerifyParam = buildVerifyParam(str);
            String str2 = buildVerifyParam.requestScene;
            UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.CLOSE_BIO_C, str2, str2, null);
            VerifyApi.closeBiometric(buildVerifyParam, new CommonCallback() { // from class: com.taobao.login4android.video.VerifyJsbridge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str3});
                        return;
                    }
                    String str4 = buildVerifyParam.requestScene;
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.CLOSE_BIO_F, str4, str4, null);
                    VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "closeBiometric", i);
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    String str3 = buildVerifyParam.requestScene;
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.CLOSE_BIO_S, str3, str3, null);
                    VerifyJsbridge.access$000(VerifyJsbridge.this, wVCallBackContext, "closeBiometric");
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            errorCallback(wVCallBackContext, "closeBiometric", 4010);
        }
    }

    private void errorCallback(WVCallBackContext wVCallBackContext, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a9f128", new Object[]{this, wVCallBackContext, str, new Integer(i)});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_FAILED");
        nswVar.a("code", Integer.valueOf(i));
        nswVar.b(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        wVCallBackContext.error(nswVar);
        Properties properties = new Properties();
        properties.put(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
        properties.put("code", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            UserTrackAdapter.sendUT(str, properties);
        }
    }

    public static void goSettings(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdaa2204", new Object[]{activity});
        } else if (activity != null) {
            try {
                activity.startActivity(new Intent("android.settings.SETTINGS"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(VerifyJsbridge verifyJsbridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/video/VerifyJsbridge");
    }

    private void ivErrorCallback(WVCallBackContext wVCallBackContext, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43734309", new Object[]{this, wVCallBackContext, new Integer(i), str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_FAILED");
        nswVar.a("code", Integer.valueOf(i));
        nswVar.b("message", str);
        wVCallBackContext.error(nswVar);
    }

    private synchronized void openBiometric(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25b9b5c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            final VerifyParam buildVerifyParam = buildVerifyParam(str);
            String str2 = buildVerifyParam.requestScene;
            UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.OPEN_BIO_C, str2, str2, null);
            VerifyApi.openBiometric(this.mContext, buildVerifyParam, new CommonCallback() { // from class: com.taobao.login4android.video.VerifyJsbridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str3});
                        return;
                    }
                    String str4 = buildVerifyParam.requestScene;
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.OPEN_BIO_F, str4, str4, null);
                    if (i != 4004) {
                        VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "openBiometric", i);
                    } else if (VerifyJsbridge.access$100(VerifyJsbridge.this) instanceof Activity) {
                        final Activity activity = (Activity) VerifyJsbridge.access$200(VerifyJsbridge.this);
                        new DialogHelper(activity).alert("", activity.getString(R.string.aliuser_finger_not_roll), activity.getString(R.string.aliuser_finger_go_set), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.video.VerifyJsbridge.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                    return;
                                }
                                AnonymousClass2 r4 = AnonymousClass2.this;
                                VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "openBiometricGoSetting", 4002);
                                VerifyJsbridge.goSettings(activity);
                            }
                        }, activity.getString(R.string.aliuser_cancel), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.video.VerifyJsbridge.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                    return;
                                }
                                AnonymousClass2 r4 = AnonymousClass2.this;
                                VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "openBiometricCancelSetting", 4002);
                            }
                        });
                    }
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    String str3 = buildVerifyParam.requestScene;
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.OPEN_BIO_S, str3, str3, null);
                    VerifyJsbridge.access$000(VerifyJsbridge.this, wVCallBackContext, "openBiometric");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            UserTrackAdapter.sendUT(UTConstant.CustomEvent.OPEN_BIO_S);
            errorCallback(wVCallBackContext, "openBiometric", 4003);
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            fsw.h("aluVerifyJSBridge", VerifyJsbridge.class);
        } catch (Exception unused) {
        }
    }

    private void successCallback(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e15676", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_SUCCESS");
        nswVar.b(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        wVCallBackContext.success(nswVar);
        Properties properties = new Properties();
        properties.put(UTConstant.Args.UT_PROPERTY_SUCCESS, "T");
        if (!TextUtils.isEmpty(str)) {
            UserTrackAdapter.sendUT(str, properties);
        }
    }

    private synchronized void supportBiometricType(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793eadc7", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_SUCCESS");
        if (ServiceFactory.getService(FingerprintService.class) == null || !((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintSetable()) {
            nswVar.b("supportBiometricType", "");
        } else {
            nswVar.b("supportBiometricType", "fingerprint");
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nswVar);
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
        this.mCallback = null;
        super.onDestroy();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            UserTrackAdapter.sendUT(str);
        }
        if ("supportBiometricType".equals(str)) {
            supportBiometricType(wVCallBackContext);
        } else if ("openBiometric".equals(str)) {
            openBiometric(str2, wVCallBackContext);
        } else if ("closeBiometric".equals(str)) {
            closeBiometric(str2, wVCallBackContext);
        } else if ("checkBiometricStatus".equals(str)) {
            checkBiometricStatus(str2, wVCallBackContext);
        } else if ("biometricIV".equals(str)) {
            biometricIV(str2, wVCallBackContext);
        } else if ("aluApplyIVToken".equals(str)) {
            applyIVToken(str2, wVCallBackContext);
        } else if (!"checkEnv".equals(str)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        }
        return true;
    }
}
