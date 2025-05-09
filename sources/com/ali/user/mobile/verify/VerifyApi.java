package com.ali.user.mobile.verify;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.eventbus.Event;
import com.ali.user.mobile.eventbus.EventBus;
import com.ali.user.mobile.eventbus.EventBusEnum;
import com.ali.user.mobile.eventbus.EventListener;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.FingerInfo;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.safe.AES;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.verify.impl.VerifyServiceImpl;
import com.ali.user.mobile.verify.model.OpenBiometricData;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.BackgroundExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class VerifyApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLOSE_FINGER_ERROR = 4010;
    public static final int CLOSE_FINGER_ILLEGAL = 4010;
    public static final int FINGER_VERIFY_INVALID_PARAM = 4020;
    public static final int FINGER_VERIFY_NO_BIO_KEY = 4021;
    public static final int OPEN_FINGER_CANCEL = 4002;
    public static final int OPEN_FINGER_ERROR = 4001;
    public static final int OPEN_FINGER_ILLEGAL = 4003;
    public static final int OPEN_FINGER_UNROLL = 4004;
    private static String TAG = "login.verify";

    /* compiled from: Taobao */
    /* renamed from: com.ali.user.mobile.verify.VerifyApi$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AnonymousClass4 implements RpcRequestCallback<OpenBiometricData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CommonCallback val$callback;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ VerifyParam val$param;

        public AnonymousClass4(Context context, CommonCallback commonCallback, VerifyParam verifyParam) {
            this.val$context = context;
            this.val$callback = commonCallback;
            this.val$param = verifyParam;
        }

        @Override // com.ali.user.mobile.callback.RpcRequestCallback
        public void onError(final RpcResponse<OpenBiometricData> rpcResponse) {
            OpenBiometricData openBiometricData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
            } else if (rpcResponse == null || (openBiometricData = rpcResponse.returnValue) == null || TextUtils.isEmpty(openBiometricData.h5Url) || !"H5".equals(rpcResponse.actionType)) {
                onSystemError(rpcResponse);
            } else {
                EventBus.getDefault().registerEventListener(EventBusEnum.EventName.ACTION_H5, new EventListener() { // from class: com.ali.user.mobile.verify.VerifyApi.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.eventbus.EventListener
                    public void onEvent(Event event) {
                        Map<String, Object> map;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91b32698", new Object[]{this, event});
                            return;
                        }
                        EventBus.getDefault().unregisterEventListener(EventBusEnum.EventName.ACTION_H5, this);
                        if (event == null || (map = event.params) == null) {
                            AnonymousClass4.this.onSystemError(rpcResponse);
                            return;
                        }
                        String str = (String) map.get("token");
                        String str2 = (String) event.params.get("result");
                        if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, "success")) {
                            VerifyParam verifyParam = new VerifyParam();
                            AnonymousClass4 r1 = AnonymousClass4.this;
                            VerifyParam verifyParam2 = r1.val$param;
                            verifyParam.biometricId = verifyParam2.biometricId;
                            verifyParam.requestScene = verifyParam2.requestScene;
                            verifyParam.ivToken = str;
                            verifyParam.loginToken = verifyParam2.loginToken;
                            VerifyApi.setAfterLogin(r1.val$context, verifyParam, r1.val$callback);
                        } else if (TextUtils.equals(str2, "cancel")) {
                            AnonymousClass4.this.val$callback.onFail(4002, "取消指纹开启");
                        } else {
                            AnonymousClass4.this.onSystemError(rpcResponse);
                        }
                    }
                });
                UrlParam urlParam = new UrlParam();
                urlParam.url = rpcResponse.returnValue.h5Url;
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToWebViewPage(EventBusEnum.EventName.ACTION_H5, urlParam);
            }
        }

        @Override // com.ali.user.mobile.callback.RpcRequestCallback
        public void onSuccess(RpcResponse<OpenBiometricData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
            } else {
                VerifyApi.afterOpenRpcSuccess(this.val$context, this.val$callback, rpcResponse);
            }
        }

        public void onSystemError(RpcResponse<OpenBiometricData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b87ed84c", new Object[]{this, rpcResponse});
            } else {
                this.val$callback.onFail(4001, "指纹开启失败");
            }
        }
    }

    static {
        t2o.a(69206211);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static void afterOpenRpcSuccess(Context context, final CommonCallback commonCallback, final RpcResponse<OpenBiometricData> rpcResponse) {
        OpenBiometricData openBiometricData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955d4e9f", new Object[]{context, commonCallback, rpcResponse});
        } else if (rpcResponse == null || (openBiometricData = rpcResponse.returnValue) == null || TextUtils.isEmpty(openBiometricData.biometricKey) || TextUtils.isEmpty(rpcResponse.returnValue.biometricId)) {
            commonCallback.onFail(4001, "指纹开启失败");
        } else if (ServiceFactory.getService(FingerprintService.class) != null) {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).fingerSet(context, new CommonCallback() { // from class: com.ali.user.mobile.verify.VerifyApi.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    } else {
                        commonCallback.onFail(i, str);
                    }
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    VerifyApi.handleResponse(RpcResponse.this);
                    commonCallback.onSuccess();
                }
            });
        } else {
            commonCallback.onFail(4001, "未引入指纹模块");
        }
    }

    public static void callOpenRpc(Context context, VerifyParam verifyParam, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951b1544", new Object[]{context, verifyParam, commonCallback});
            return;
        }
        try {
            VerifyServiceImpl.getInstance().openFinger(verifyParam, new AnonymousClass4(context, commonCallback, verifyParam));
        } catch (Throwable th) {
            th.printStackTrace();
            commonCallback.onFail(4001, "指纹开启失败");
        }
    }

    public static void closeBiometric(final VerifyParam verifyParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fb1b27", new Object[]{verifyParam, commonCallback});
        } else if (commonCallback != null) {
            if (verifyParam == null) {
                commonCallback.onFail(4010, "参数非法");
                return;
            }
            try {
                if (TextUtils.isEmpty(verifyParam.biometricId)) {
                    verifyParam.biometricId = SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getBiometricId();
                }
                VerifyServiceImpl.getInstance().closeFinger(verifyParam, new RpcRequestCallback<Void>() { // from class: com.ali.user.mobile.verify.VerifyApi.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onError(RpcResponse<Void> rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        } else {
                            onSystemError(rpcResponse);
                        }
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onSuccess(RpcResponse<Void> rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                            return;
                        }
                        if (VerifyParam.this.list != null) {
                            SecurityGuardManagerWraper.removeAllFinger();
                        } else {
                            FingerInfo fingerInfo = new FingerInfo();
                            fingerInfo.key = VerifyParam.this.biometricId;
                            SecurityGuardManagerWraper.removeFinger(fingerInfo);
                        }
                        commonCallback.onSuccess();
                    }

                    public void onSystemError(RpcResponse<Void> rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b87ed84c", new Object[]{this, rpcResponse});
                        } else {
                            commonCallback.onFail(4010, "指纹关闭失败");
                        }
                    }
                });
            } catch (Throwable unused) {
                commonCallback.onFail(4010, "指纹关闭失败");
            }
        }
    }

    public static void handleResponse(RpcResponse<OpenBiometricData> rpcResponse) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc448c5d", new Object[]{rpcResponse});
            return;
        }
        FingerInfo fingerInfo = new FingerInfo();
        OpenBiometricData openBiometricData = rpcResponse.returnValue;
        fingerInfo.key = openBiometricData.biometricId;
        fingerInfo.value = openBiometricData.biometricKey;
        if (openBiometricData.biometricOpenTime == 0) {
            j = System.currentTimeMillis();
        } else {
            j = openBiometricData.biometricOpenTime;
        }
        fingerInfo.loginTime = j;
        saveFingerInBackground(fingerInfo, rpcResponse.returnValue.biometricIdList);
    }

    public static void invalidAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69917b1", new Object[0]);
            return;
        }
        UserTrackAdapter.sendUT("FingerInvalidAll");
        BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.verify.VerifyApi.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                List<FingerInfo> fingerList = SecurityGuardManagerWraper.getFingerList();
                if (fingerList != null && fingerList.size() != 0) {
                    VerifyParam verifyParam = new VerifyParam();
                    verifyParam.list = fingerList;
                    verifyParam.requestScene = "biometric_changed";
                    VerifyApi.closeBiometric(verifyParam, new CommonCallback() { // from class: com.ali.user.mobile.verify.VerifyApi.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.model.CommonCallback
                        public void onFail(int i, String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                return;
                            }
                            LoginTLogAdapter.e(VerifyApi.access$000(), "close biometric failed");
                            SecurityGuardManagerWraper.removeAllFinger();
                        }

                        @Override // com.ali.user.mobile.model.CommonCallback
                        public void onSuccess() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginTLogAdapter.e(VerifyApi.access$000(), "close biometric success");
                            }
                        }
                    });
                }
            }
        });
    }

    public static void openBiometric(final Context context, final VerifyParam verifyParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abc7353", new Object[]{context, verifyParam, commonCallback});
        } else if (commonCallback != null) {
            if (verifyParam != null) {
                try {
                    if (!TextUtils.isEmpty(verifyParam.requestScene)) {
                        if (ServiceFactory.getService(FingerprintService.class) == null) {
                            commonCallback.onFail(4001, "未接入指纹SDK");
                            return;
                        } else if (!((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintSetable()) {
                            commonCallback.onFail(4001, "指纹硬件不支持");
                            return;
                        } else if ("account_center".equals(verifyParam.requestScene) || ((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintAvailable()) {
                            UserTrackAdapter.sendUT("setFingerCheck");
                            new AES().checkValid(new CommonCallback() { // from class: com.ali.user.mobile.verify.VerifyApi.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onFail(int i, String str) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                        return;
                                    }
                                    UserTrackAdapter.sendExtendUT("setFingerCheck_fail", String.valueOf(i));
                                    if ("login_success".equals(VerifyParam.this.requestScene)) {
                                        VerifyApi.setAfterLogin(context, VerifyParam.this, commonCallback);
                                    } else {
                                        VerifyApi.callOpenRpc(context, VerifyParam.this, commonCallback);
                                    }
                                }

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onSuccess() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                                        return;
                                    }
                                    UserTrackAdapter.sendUT("setFingerCheck_success");
                                    if ("login_success".equals(VerifyParam.this.requestScene)) {
                                        VerifyApi.setAfterLogin(context, VerifyParam.this, commonCallback);
                                    } else {
                                        VerifyApi.callOpenRpc(context, VerifyParam.this, commonCallback);
                                    }
                                }
                            });
                            return;
                        } else {
                            commonCallback.onFail(4004, "指纹未录入");
                            return;
                        }
                    }
                } catch (Throwable th) {
                    UserTrackAdapter.sendExtendUT("setFingerCheck_fail", th.getMessage());
                    commonCallback.onFail(4001, "指纹开启失败");
                    th.printStackTrace();
                    return;
                }
            }
            commonCallback.onFail(4003, "参数不合法");
        }
    }

    public static void saveFingerInBackground(final FingerInfo fingerInfo, final ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47354da0", new Object[]{fingerInfo, arrayList});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.verify.VerifyApi.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SecurityGuardManagerWraper.saveFinger(FingerInfo.this, arrayList);
                    try {
                        if (TextUtils.isEmpty(SecurityGuardManagerWraper.getFingerValue(FingerInfo.this.key))) {
                            UserTrackAdapter.sendUT("LostFingerToken");
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public static void setAfterLogin(Context context, final VerifyParam verifyParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be060692", new Object[]{context, verifyParam, commonCallback});
        } else if (ServiceFactory.getService(FingerprintService.class) != null) {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).fingerSet(context, new CommonCallback() { // from class: com.ali.user.mobile.verify.VerifyApi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    } else {
                        commonCallback.onFail(i, str);
                    }
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        VerifyServiceImpl.getInstance().openFinger(VerifyParam.this, new RpcRequestCallback<OpenBiometricData>() { // from class: com.ali.user.mobile.verify.VerifyApi.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onError(RpcResponse<OpenBiometricData> rpcResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                } else {
                                    commonCallback.onFail(4001, "指纹开启失败");
                                }
                            }

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onSuccess(RpcResponse<OpenBiometricData> rpcResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                                    return;
                                }
                                VerifyApi.handleResponse(rpcResponse);
                                commonCallback.onSuccess();
                            }
                        });
                    }
                }
            });
        } else {
            commonCallback.onFail(4001, "未引入指纹模块");
        }
    }
}
