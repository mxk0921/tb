package com.taobao.login4android.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.UIService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SDKJSBridgeService extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "Login.SDKJSBridge";

    public static /* synthetic */ void access$000(SDKJSBridgeService sDKJSBridgeService, WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32f8ccf", new Object[]{sDKJSBridgeService, wVCallBackContext, str, str2});
        } else {
            sDKJSBridgeService.failCallback(wVCallBackContext, str, str2);
        }
    }

    private void failCallback(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fa1c5b", new Object[]{this, wVCallBackContext, str, str2});
            return;
        }
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("code", str2);
        } catch (Exception unused) {
        }
        nswVar.h(jSONObject);
        nswVar.j("HY_FAILED");
        wVCallBackContext.error(nswVar);
    }

    public static /* synthetic */ Object ipc$super(SDKJSBridgeService sDKJSBridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/SDKJSBridgeService");
    }

    private void paramError(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d93f2bf", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
    }

    private void paramErrorCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7beb5924", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            paramError(wVCallBackContext);
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            fsw.h("SDKJSBridgeService", SDKJSBridgeService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void setHelp(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a903611", new Object[]{this, wVCallBackContext, str});
        } else {
            requestHelp(wVCallBackContext, str);
        }
    }

    public synchronized void testSsoLogin(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792415a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = (String) jSONObject.get("action");
                String str3 = (String) jSONObject.get("token");
                if (!TextUtils.isEmpty(str3) && "testAccountSso".equals(str2)) {
                    LoginParam loginParam = new LoginParam();
                    loginParam.token = str3;
                    loginParam.site = DataProviderFactory.getDataProvider().getSite();
                    try {
                        UserLoginServiceImpl.getInstance().unifySsoTokenLogin(loginParam, new RpcRequestCallback() { // from class: com.taobao.login4android.jsbridge.SDKJSBridgeService.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onError(RpcResponse rpcResponse) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                } else {
                                    onSuccess(rpcResponse);
                                }
                            }

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onSuccess(RpcResponse rpcResponse) {
                                String str4;
                                int i;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                                } else if (rpcResponse == null || rpcResponse.returnValue == 0 || rpcResponse.code != 3000) {
                                    if (rpcResponse != null) {
                                        i = rpcResponse.code;
                                        str4 = rpcResponse.message;
                                    } else {
                                        i = -1;
                                        str4 = "Error";
                                    }
                                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                                    if (wVCallBackContext2 != null) {
                                        SDKJSBridgeService.access$000(SDKJSBridgeService.this, wVCallBackContext2, str4, String.valueOf(i));
                                    }
                                } else {
                                    LoginDataHelper.processLoginReturnData(true, (LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue);
                                    nsw nswVar = new nsw();
                                    nswVar.j("HY_SUCCESS");
                                    WVCallBackContext wVCallBackContext3 = wVCallBackContext;
                                    if (wVCallBackContext3 != null) {
                                        wVCallBackContext3.success(nswVar);
                                    }
                                }
                            }
                        });
                    } catch (Exception unused) {
                        paramErrorCallback(wVCallBackContext);
                    }
                }
            } catch (JSONException unused2) {
                paramErrorCallback(wVCallBackContext);
            }
        } else {
            paramErrorCallback(wVCallBackContext);
        }
    }

    public void requestHelp(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb06b17e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext == null) {
            LoginTLogAdapter.e("Login.SDKJSBridge", "Callback is null");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                ((UIService) ServiceFactory.getService(UIService.class)).switchWebViewTitleBarRightButton(this.mContext, true, (String) new JSONObject(str).get("key1"));
                nsw nswVar = new nsw();
                nswVar.j("success");
                wVCallBackContext.success(nswVar);
            } catch (JSONException unused) {
                paramError(wVCallBackContext);
            }
        }
    }

    public void showSkipMenu(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eada52e9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext == null) {
            LoginTLogAdapter.e("Login.SDKJSBridge", "Callback is null");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                new JSONObject(str);
                ((UIService) ServiceFactory.getService(UIService.class)).switchWebViewTitleBarRightButton(this.mContext, true, "skip");
                nsw nswVar = new nsw();
                nswVar.j("success");
                wVCallBackContext.success(nswVar);
            } catch (JSONException unused) {
                paramError(wVCallBackContext);
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("execute() called with: action = [");
        sb.append(str);
        sb.append("], params = [");
        sb.append(str2);
        sb.append("], callback = [");
        sb.append(wVCallBackContext);
        sb.append("]");
        if ("help".equals(str)) {
            setHelp(wVCallBackContext, str2);
        } else if ("showSkipMenu".equals(str)) {
            showSkipMenu(wVCallBackContext, str2);
        } else if (!"testAccountSsoLogin".equals(str)) {
            return false;
        } else {
            testSsoLogin(wVCallBackContext, str2);
        }
        return true;
    }
}
