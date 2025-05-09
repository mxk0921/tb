package com.taobao.login4android.weex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.model.SSOMasterParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.safe.RSAKey;
import com.ali.user.mobile.rpc.safe.Rsa;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SSOSecurityService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alibaba.fastjson.JSON;
import com.alibaba.wireless.security.open.SecException;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.auth.AuthEntranceActivity;
import com.taobao.android.sso.v2.model.ApplySsoTokenRequest;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.android.sso.v2.model.SSOSlaveParam;
import com.taobao.android.sso.v2.model.SSOV2ApplySsoTokenResponseData;
import com.taobao.login4android.Login;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WVUserModule extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_BASE_INFO = "getBaseInfo";
    private static final String ACTION_GET_INTENT = "getUser";
    private static final String ACTION_GET_RISK_CONTROL = "getRiskControlInfo";
    private static final String GET_SSO_TOKEN = "getTbSsoToken";
    private static final String GET_TB_AUTHCODE = "getTbAuthCode";
    public static final int OPEN_TAOBAO_FOR_AUTHCODE = 59995;
    public static String authCodeCallerUrl = "";
    public static String url = "";
    public WVCallBackContext mCallback;

    static {
        t2o.a(517996635);
    }

    private ApplySsoTokenRequest buildApplySsoTokenRequest(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplySsoTokenRequest) ipChange.ipc$dispatch("9f99e92c", new Object[]{this, context});
        }
        SSOSlaveParam ssoParam = getSsoParam(context);
        ApplySsoTokenRequest applySsoTokenRequest = new ApplySsoTokenRequest();
        String str = ssoParam.appKey;
        applySsoTokenRequest.slaveAppKey = str;
        applySsoTokenRequest.masterAppKey = str;
        applySsoTokenRequest.ssoVersion = ssoParam.ssoVersion;
        applySsoTokenRequest.slaveT = ssoParam.t;
        applySsoTokenRequest.uuidKey = ssoParam.uuidKey;
        applySsoTokenRequest.targetUrl = ssoParam.targetUrl;
        applySsoTokenRequest.sign = ssoParam.sign;
        SessionManager instance = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        applySsoTokenRequest.sid = instance.getSid();
        applySsoTokenRequest.hid = instance.getUserId();
        applySsoTokenRequest.sdkVersion = AppInfo.getInstance().getSdkVersion();
        applySsoTokenRequest.appVersion = AppInfo.getInstance().getAppVersion();
        applySsoTokenRequest.deviceTokenKey = SecurityGuardManagerWraper.getDeviceTokenKey(applySsoTokenRequest.hid);
        DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
        deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
        deviceTokenSignParam.addAppVersion(applySsoTokenRequest.appVersion);
        deviceTokenSignParam.addHavanaId(String.valueOf(applySsoTokenRequest.hid));
        deviceTokenSignParam.addTimestamp(String.valueOf(applySsoTokenRequest.masterT));
        deviceTokenSignParam.addSDKVersion(applySsoTokenRequest.sdkVersion);
        applySsoTokenRequest.deviceTokenSign = AlibabaSecurityTokenService.sign(applySsoTokenRequest.deviceTokenKey, deviceTokenSignParam.build());
        applySsoTokenRequest.slaveBundleId = applySsoTokenRequest.targetUrl;
        return applySsoTokenRequest;
    }

    private synchronized void getBaseInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc959a3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appName", DataProviderFactory.getDataProvider().getAppkey());
            jSONObject.put("deviceId", DataProviderFactory.getDataProvider().getDeviceId());
            jSONObject.put("sdkVersion", AppInfo.getInstance().getSdkVersion());
            jSONObject.put("appVersion", AppInfo.getInstance().getAndroidAppVersion());
            jSONObject.put("ttid", DataProviderFactory.getDataProvider().getTTID());
            jSONObject.put("utdid", AppInfo.getInstance().getUtdid());
            jSONObject.put(SessionConstants.LOGIN_SITE, Login.getLoginSite());
            jSONObject.put("site", DataProviderFactory.getDataProvider().getSite());
            try {
                jSONObject.put("deviceName", Build.MODEL);
                jSONObject.put("brand", Build.BRAND);
                jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, Build.DEVICE);
                jSONObject.put("display", Build.DISPLAY);
                jSONObject.put("sdk_int", Build.VERSION.SDK_INT);
                jSONObject.put("board", Build.BOARD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        nsw nswVar = new nsw();
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    private synchronized void getRiskControlInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fe92f4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("riskControl", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        nsw nswVar = new nsw();
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    private synchronized void getTbAuthCode(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46197847", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context context = wVCallBackContext.getWebview().getContext();
        if ((context instanceof Activity) && !TextUtils.isEmpty(str)) {
            authCodeCallerUrl = wVCallBackContext.getWebview().getUrl();
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            if (TextUtils.isEmpty(parseObject.getString("appkey"))) {
                nsw nswVar = new nsw();
                nswVar.b("code", "10021");
                wVCallBackContext.error(nswVar);
                return;
            }
            String str2 = "tbopen://m.taobao.com/getway/oauth?pluginName=taobao.oauth.code.create";
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                str2 = str2 + "&" + ((Object) entry.getKey()) + "=" + entry.getValue();
            }
            Intent intent = new Intent(context, AuthEntranceActivity.class);
            intent.setAction("com.taobao.open.intent.action.GETWAY");
            intent.setData(Uri.parse(str2));
            this.mCallback = wVCallBackContext;
            ((Activity) context).startActivityForResult(intent, OPEN_TAOBAO_FOR_AUTHCODE);
        }
    }

    private synchronized void getTbSsoToken(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e4537c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context context = wVCallBackContext.getWebview().getContext();
        if ((context instanceof Activity) && !TextUtils.isEmpty(str)) {
            try {
                url = wVCallBackContext.getWebview().getUrl();
                getSsoTokenFromRemote(context, wVCallBackContext);
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void getUser(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b065a4f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        nsw nswVar = new nsw();
        if (Login.session != null) {
            try {
                jSONObject.put("userId", Login.getUserId());
                jSONObject.put("nick", Login.getNick());
                jSONObject.put("sid", Login.getSid());
                jSONObject.put("email", Login.getEmail());
                jSONObject.put("displayNick", Login.getDisplayNick());
                jSONObject.put("extJson", Login.getExtJson());
                jSONObject.put(SessionConstants.LOGIN_PHONE, Login.getLoginPhone());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.error(nswVar);
        }
    }

    public static /* synthetic */ Object ipc$super(WVUserModule wVUserModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/login4android/weex/WVUserModule");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                UserTrackAdapter.sendUT(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ACTION_GET_INTENT.equals(str)) {
            getUser(str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_BASE_INFO.equals(str)) {
            getBaseInfo(str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_RISK_CONTROL.equals(str)) {
            getRiskControlInfo(str2, wVCallBackContext);
            return true;
        } else if (GET_SSO_TOKEN.equals(str)) {
            getTbSsoToken(str2, wVCallBackContext);
            return true;
        } else if (!GET_TB_AUTHCODE.equals(str)) {
            return false;
        } else {
            getTbAuthCode(str2, wVCallBackContext);
            return true;
        }
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 59995) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("result");
            if (this.mCallback != null && !TextUtils.isEmpty(stringExtra)) {
                nsw nswVar = new nsw();
                nswVar.b("authCode", stringExtra);
                this.mCallback.success(nswVar);
            } else if (this.mCallback != null) {
                nsw nswVar2 = new nsw();
                nswVar2.b("code", "10004");
                this.mCallback.error(nswVar2);
            }
        } else if (this.mCallback != null) {
            nsw nswVar3 = new nsw();
            nswVar3.b("code", "10004");
            this.mCallback.error(nswVar3);
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCallback = null;
        super.onDestroy();
    }

    private SSOSlaveParam getSsoParam(Context context) {
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSOSlaveParam) ipChange.ipc$dispatch("801be25f", new Object[]{this, context});
        }
        SSOSlaveParam sSOSlaveParam = new SSOSlaveParam();
        sSOSlaveParam.appKey = DataProviderFactory.getDataProvider().getAppkey();
        sSOSlaveParam.ssoVersion = SSOIPCConstants.CURRENT_SSO_VERSION;
        sSOSlaveParam.t = System.currentTimeMillis();
        sSOSlaveParam.targetUrl = context.getPackageName();
        String uuid = UUID.randomUUID().toString();
        context.getSharedPreferences("uuid", 0).edit().putString("uuid", uuid).apply();
        try {
            sSOSlaveParam.uuidKey = Rsa.encrypt(uuid, RSAKey.SSO_RSA_KEY);
            str = SSOSecurityService.getInstace(context.getApplicationContext()).sign(DataProviderFactory.getDataProvider().getAppkey(), sSOSlaveParam.toMap(), DataProviderFactory.getDataProvider().getEnvType() == LoginEnvType.DEV.getSdkEnvType() ? "daily" : str);
        } catch (SecException unused) {
        }
        sSOSlaveParam.sign = str;
        return sSOSlaveParam;
    }

    private void getSsoTokenFromRemote(final Context context, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd4cc8e", new Object[]{this, context, wVCallBackContext});
            return;
        }
        try {
            final ApplySsoTokenRequest buildApplySsoTokenRequest = buildApplySsoTokenRequest(context);
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.API_NAME = ApiConstants.ApiName.APPLY_SSO_TOKEN_V2;
            rpcRequest.VERSION = "1.0";
            rpcRequest.NEED_ECODE = true;
            rpcRequest.NEED_SESSION = true;
            rpcRequest.requestSite = DataProviderFactory.getDataProvider().getSite();
            rpcRequest.addParam(ApiConstants.ApiField.SSO_TOKEN_APPLY_REQUEST, JSON.toJSONString(buildApplySsoTokenRequest));
            rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
            HashMap hashMap = new HashMap();
            hashMap.put("imei", "");
            if (!TextUtils.isEmpty(url)) {
                hashMap.put("url", URLEncoder.encode(url));
            }
            url = "";
            rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, SSOV2ApplySsoTokenResponseData.class, new RpcRequestCallback() { // from class: com.taobao.login4android.weex.WVUserModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else if (wVCallBackContext != null) {
                        nsw nswVar = new nsw();
                        if (rpcResponse == null) {
                            i = 503;
                        } else {
                            i = rpcResponse.code;
                        }
                        nswVar.b("code", i + "");
                        wVCallBackContext.error(nswVar);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    WVCallBackContext wVCallBackContext2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else if (rpcResponse == null || rpcResponse.returnValue == 0 || (wVCallBackContext2 = wVCallBackContext) == null) {
                        if (wVCallBackContext != null) {
                            nsw nswVar = new nsw();
                            int i = rpcResponse == null ? 502 : rpcResponse.code;
                            nswVar.b("code", i + "");
                            wVCallBackContext.error(nswVar);
                        }
                    } else if (wVCallBackContext2 != null) {
                        SSOV2ApplySsoTokenResponseData sSOV2ApplySsoTokenResponseData = (SSOV2ApplySsoTokenResponseData) rpcResponse;
                        SSOMasterParam sSOMasterParam = new SSOMasterParam();
                        sSOMasterParam.appKey = DataProviderFactory.getDataProvider().getAppkey();
                        sSOMasterParam.ssoToken = (String) sSOV2ApplySsoTokenResponseData.returnValue;
                        sSOMasterParam.ssoVersion = buildApplySsoTokenRequest.ssoVersion;
                        long currentTimeMillis = System.currentTimeMillis();
                        sSOMasterParam.t = System.currentTimeMillis();
                        sSOMasterParam.userId = SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getUserId();
                        try {
                            sSOMasterParam.sign = SSOSecurityService.getInstace(DataProviderFactory.getApplicationContext()).sign(sSOMasterParam.appKey, sSOMasterParam.toMap());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        nsw nswVar2 = new nsw();
                        nswVar2.b("ssoToken", (String) sSOV2ApplySsoTokenResponseData.returnValue);
                        nswVar2.b("userId", com.taobao.login4android.api.Login.getUserId());
                        nswVar2.b("sourceAppKey", sSOMasterParam.appKey);
                        nswVar2.b(SSOSlaveParam.KEY_APPKEY, sSOMasterParam.appKey);
                        nswVar2.b("ssoVersion", buildApplySsoTokenRequest.ssoVersion);
                        nswVar2.b("sign", sSOMasterParam.sign);
                        nswVar2.b(SSOIPCConstants.IPC_MASTER_T, currentTimeMillis + "");
                        nswVar2.b("uuid", context.getSharedPreferences("uuid", 0).getString("uuid", ""));
                        wVCallBackContext.success(nswVar2);
                    }
                }
            });
        } catch (RpcException e) {
            e.printStackTrace();
            if (wVCallBackContext != null) {
                nsw nswVar = new nsw();
                nswVar.b("code", e.getCode() + "");
                wVCallBackContext.error(nswVar);
            }
        }
    }
}
