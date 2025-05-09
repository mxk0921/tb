package com.ali.user.open.ucc.biz;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccServiceProviderFactory;
import com.ali.user.open.ucc.data.DataRepository;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.ali.user.open.ucc.util.Utils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccOauthLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile UccOauthLoginPresenter instance;

    static {
        t2o.a(76546127);
    }

    public static UccOauthLoginPresenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccOauthLoginPresenter) ipChange.ipc$dispatch("3b50fe9c", new Object[0]);
        }
        if (instance == null) {
            synchronized (UccOauthLoginPresenter.class) {
                try {
                    if (instance == null) {
                        instance = new UccOauthLoginPresenter();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void doUccOAuthLogin(final Activity activity, final UccParams uccParams, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a90ab8d", new Object[]{this, activity, uccParams, map, uccCallback});
        } else {
            DataRepository.uccOAuthLogin(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccOauthLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private void rpcResultHit(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c95db6", new Object[]{this, str, str2, str3});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", str);
                    hashMap.put("actionType", str2);
                    hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str3);
                    UTHitUtils.send(UTHitConstants.PageUccOAuthLogin, "UccOAuthLogin_Result", uccParams, hashMap);
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    } else if (rpcResponse != null) {
                        rpcResultHit(rpcResponse.code + "", rpcResponse.actionType, "");
                        if (rpcResponse.code == 3000 || TextUtils.equals("SUCCESS", rpcResponse.actionType)) {
                            UccBizContants.mBusyControlMap.put(uccParams.bindSite, Long.valueOf(System.currentTimeMillis()));
                            String str = (String) rpcResponse.returnValue;
                            UccServiceProviderFactory.getInstance().getUccServiceProvider(uccParams.bindSite).refreshWhenLogin(uccParams.bindSite, str, UccOauthLoginPresenter.isCookieOnly(map));
                            if (uccCallback != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put(UccConstants.PARAM_LOGIN_DATA, JSON.parseObject(str).getString("authorizationResponse"));
                                uccCallback.onSuccess(uccParams.bindSite, hashMap);
                                return;
                            }
                            return;
                        }
                        rpcResultHit(rpcResponse.code + "", "", "");
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 != null) {
                            uccCallback2.onFail(uccParams.bindSite, rpcResponse.code, Utils.buidErrorMessage(rpcResponse, "免登response为空"));
                        }
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str, RpcResponse rpcResponse) {
                    T t;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1005);
                    String str3 = "";
                    if (TextUtils.equals("NEED_BIND", rpcResponse.actionType)) {
                        rpcResultHit(buidErrorCode + str3, rpcResponse.actionType, str3);
                        JSONObject parseObject = JSON.parseObject((String) rpcResponse.returnValue);
                        if (parseObject != null) {
                            str3 = parseObject.getString("returnUrl");
                            str2 = parseObject.getString(ParamsConstants.Key.PARAM_H5_TYPE);
                        } else {
                            str2 = str3;
                        }
                        Map map2 = map;
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            map2.put(UccConstants.PARAM_BIND_URL, str3);
                        }
                        map2.put("needSession", "1");
                        map2.put("needToast", "0");
                        map2.put(ParamsConstants.Key.PARAM_H5_TYPE, str2);
                        UccH5Presenter.showH5BindPage(activity, uccParams, map2, false, uccCallback);
                    } else if (!TextUtils.equals("H5", rpcResponse.actionType) || (t = rpcResponse.returnValue) == 0) {
                        rpcResultHit(buidErrorCode + str3, rpcResponse.actionType, str3);
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 != null) {
                            uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                        }
                    } else {
                        JSONObject parseObject2 = JSON.parseObject((String) t);
                        if (parseObject2 != null) {
                            JSONObject parseObject3 = JSON.parseObject(parseObject2.getString("authorizationResponse"));
                            if (parseObject3 != null) {
                                String string = parseObject3.getString("h5Url");
                                String string2 = parseObject3.getString("token");
                                String string3 = parseObject3.getString("scene");
                                String string4 = parseObject3.getString(ParamsConstants.Key.PARAM_H5_TYPE);
                                Bundle bundle = new Bundle();
                                bundle.putString("url", string);
                                bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                                bundle.putString("needSession", "1");
                                bundle.putString("token", string2);
                                bundle.putString("scene", string3);
                                bundle.putString("params", Utils.convertMapToJsonStr(map));
                                bundle.putString(ParamsConstants.Key.PARAM_H5_TYPE, string4);
                                UccH5Presenter.openUrl(activity, bundle, uccCallback);
                            } else {
                                UccCallback uccCallback3 = uccCallback;
                                if (uccCallback3 != null) {
                                    uccCallback3.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                                }
                            }
                            rpcResultHit(buidErrorCode + str3, rpcResponse.actionType, str3);
                            return;
                        }
                        rpcResultHit(buidErrorCode + str3, rpcResponse.actionType, str3);
                        UccCallback uccCallback4 = uccCallback;
                        if (uccCallback4 != null) {
                            uccCallback4.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                        }
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str, RpcResponse rpcResponse) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1005);
                    String str3 = buidErrorCode + "";
                    if (rpcResponse == null) {
                        str2 = "";
                    } else {
                        str2 = rpcResponse.actionType;
                    }
                    rpcResultHit(str3, str2, "");
                    Integer num = UccBizContants.mTrustLoginErrorTime.get(uccParams.bindSite);
                    if (num == null) {
                        num = 0;
                    }
                    UccBizContants.mTrustLoginErrorTime.put(uccParams.bindSite, Integer.valueOf(num.intValue() + 1));
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 != null) {
                        uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                    }
                }
            });
        }
    }

    public static boolean isCookieOnly(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74b968e8", new Object[]{map})).booleanValue();
        }
        return map != null && "1".equals(map.get(ParamsConstants.Key.PARAM_NEED_LOCAL_COOKIE_ONLY));
    }
}
