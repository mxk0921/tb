package com.ali.user.open.ucc.biz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.CallbackManager;
import com.ali.user.open.core.config.WebViewOption;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthPlatformConfig;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccServiceProviderFactory;
import com.ali.user.open.ucc.data.DataRepository;
import com.ali.user.open.ucc.model.FetchBindPageUrlResult;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.ali.user.open.ucc.util.Utils;
import com.ali.user.open.ucc.webview.UccWebViewActivity;
import com.ali.user.open.ucc.webview.WebViewDialogActivity;
import com.ali.user.open.ucc.webview.WebViewTransparentActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccH5Presenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(76546122);
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            dismissProgressContext(context);
        }
    }

    private static void dismissProgressContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9bdd49", new Object[]{context});
        } else if (context instanceof Activity) {
            UccBindPresenter.dismissProgress((Activity) context);
        }
    }

    public static void leadNewUserH5Page(final Context context, final UccParams uccParams, final Map<String, String> map, final UccCallback uccCallback) {
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b56c54c", new Object[]{context, uccParams, map, uccCallback});
            return;
        }
        final String str2 = "0";
        if (map != null) {
            str = TextUtils.isEmpty(map.get("needSession")) ? str2 : map.get("needSession");
            if (!TextUtils.isEmpty(map.get("needToast"))) {
                str2 = map.get("needToast");
            }
            uccParams.targetPackageName = map.get(ParamsConstants.Key.PARAM_TARGET_PACKAGE_NAME);
        } else {
            str = str2;
            str2 = str;
        }
        if (map == null || TextUtils.isEmpty(map.get("site"))) {
            uccParams.site = AliMemberSDK.getMasterSite();
        } else {
            uccParams.site = map.get("site");
        }
        if (map != null && !TextUtils.isEmpty(map.get("scene"))) {
            uccParams.scene = map.get("scene");
        }
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetLocalSiteUrl", uccParams, null);
        if (context instanceof Activity) {
            UccBindPresenter.showProgress((Activity) context);
        }
        DataRepository.fetchNewUser(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccH5Presenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void rpcResultHit(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f76b96ec", new Object[]{this, str3, str4});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str3);
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str4);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetLocalSiteUrlResult", uccParams, hashMap);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str3, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str3, rpcResponse});
                    return;
                }
                UccH5Presenter.access$000(context);
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                rpcResultHit(buidErrorCode + "", "");
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "fetchBindPageUrl fail"));
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                UccH5Presenter.access$000(context);
                FetchBindPageUrlResult fetchBindPageUrlResult = (FetchBindPageUrlResult) rpcResponse.returnValue;
                if (fetchBindPageUrlResult == null || TextUtils.isEmpty(fetchBindPageUrlResult.returnUrl)) {
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 != null) {
                        uccCallback2.onFail(uccParams.bindSite, 1401, Utils.buidErrorMessage(rpcResponse, "url 为空"));
                        return;
                    }
                    return;
                }
                rpcResultHit(rpcResponse.code + "", fetchBindPageUrlResult.h5Type);
                HashMap hashMap = new HashMap();
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, fetchBindPageUrlResult.h5Type);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoH5BindAction", uccParams, hashMap);
                Bundle bundle = new Bundle();
                bundle.putString("url", fetchBindPageUrlResult.returnUrl);
                bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                bundle.putString("needSession", str);
                bundle.putString("needToast", str2);
                bundle.putString("params", Utils.convertMapToJsonStr(map));
                bundle.putString(ParamsConstants.Key.PARAM_HALF_H5, (String) map.get(ParamsConstants.Key.PARAM_HALF_H5));
                if (!"default".equals(fetchBindPageUrlResult.urlType)) {
                    bundle.putString(ParamsConstants.Key.PRAMA_TRANSPARENT_H5, (String) map.get(ParamsConstants.Key.PRAMA_TRANSPARENT_H5));
                }
                Map map2 = map;
                if (map2 == null || !TextUtils.equals((CharSequence) map2.get("callbackType"), "pageClose")) {
                    UccH5Presenter.openUrl(context, bundle, null);
                    uccCallback.onSuccess(uccParams.bindSite, new HashMap());
                    return;
                }
                UccH5Presenter.openUrl(context, bundle, uccCallback);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str3, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str3, rpcResponse});
                    return;
                }
                UccH5Presenter.access$000(context);
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                rpcResultHit(buidErrorCode + "", "");
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "获取页面失败"));
                }
            }
        });
    }

    public static void leadNoLoginNewUserH5Page(final Context context, final UccParams uccParams, final Map<String, String> map, final UccCallback uccCallback) {
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a63777c", new Object[]{context, uccParams, map, uccCallback});
            return;
        }
        final String str2 = "0";
        if (map != null) {
            str = TextUtils.isEmpty(map.get("needSession")) ? str2 : map.get("needSession");
            if (!TextUtils.isEmpty(map.get("needToast"))) {
                str2 = map.get("needToast");
            }
        } else {
            str = str2;
            str2 = str;
        }
        if (map == null || TextUtils.isEmpty(map.get("site"))) {
            uccParams.site = AliMemberSDK.getMasterSite();
        } else {
            uccParams.site = map.get("site");
        }
        if (map != null && !TextUtils.isEmpty(map.get("scene"))) {
            uccParams.scene = map.get("scene");
        }
        if (map != null && !TextUtils.isEmpty(map.get("mobile"))) {
            uccParams.maskMobile = map.get("mobile");
        }
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetLocalSiteUrl", uccParams, null);
        if (context instanceof Activity) {
            UccBindPresenter.showProgress((Activity) context);
        }
        DataRepository.fetchNoLoginNewUserUrl(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccH5Presenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void rpcResultHit(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f76b96ec", new Object[]{this, str3, str4});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str3);
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str4);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetLocalSiteUrlResult", uccParams, hashMap);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str3, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str3, rpcResponse});
                    return;
                }
                UccH5Presenter.access$000(context);
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                rpcResultHit(buidErrorCode + "", "");
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "fetchBindPageUrl fail"));
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                UccH5Presenter.access$000(context);
                FetchBindPageUrlResult fetchBindPageUrlResult = (FetchBindPageUrlResult) rpcResponse.returnValue;
                if (fetchBindPageUrlResult == null || TextUtils.isEmpty(fetchBindPageUrlResult.returnUrl)) {
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 != null) {
                        uccCallback2.onFail(uccParams.bindSite, 1401, Utils.buidErrorMessage(rpcResponse, "url 为空"));
                        return;
                    }
                    return;
                }
                rpcResultHit(rpcResponse.code + "", fetchBindPageUrlResult.h5Type);
                HashMap hashMap = new HashMap();
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, fetchBindPageUrlResult.h5Type);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoH5BindAction", uccParams, hashMap);
                Bundle bundle = new Bundle();
                bundle.putString("url", fetchBindPageUrlResult.returnUrl);
                bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                bundle.putString("needSession", str);
                bundle.putString("needToast", str2);
                bundle.putString("params", Utils.convertMapToJsonStr(map));
                bundle.putString(ParamsConstants.Key.PARAM_HALF_H5, (String) map.get(ParamsConstants.Key.PARAM_HALF_H5));
                if (!"default".equals(fetchBindPageUrlResult.urlType)) {
                    bundle.putString(ParamsConstants.Key.PRAMA_TRANSPARENT_H5, (String) map.get(ParamsConstants.Key.PRAMA_TRANSPARENT_H5));
                }
                bundle.putString("webviewOption", WebViewOption.UC.name());
                UccH5Presenter.openUrl(context, bundle, null);
                uccCallback.onSuccess(uccParams.bindSite, new HashMap());
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str3, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str3, rpcResponse});
                    return;
                }
                UccH5Presenter.access$000(context);
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                rpcResultHit(buidErrorCode + "", "");
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "获取页面失败"));
                }
            }
        });
    }

    public static void openUrl(Context context, Bundle bundle, UccCallback uccCallback) {
        Intent intent;
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39169f89", new Object[]{context, bundle, uccCallback});
            return;
        }
        if (context == null) {
            context = KernelContext.getApplicationContext();
        }
        if (uccCallback != null) {
            CallbackManager.registerCallback(UccConstants.UCC_H5_CALLBACK_TYPE, uccCallback);
        }
        if (bundle != null && "1".equals(bundle.get(ParamsConstants.Key.PARAM_HALF_H5))) {
            intent = new Intent(context, WebViewDialogActivity.class);
            if (bundle.getString("url") != null) {
                boolean darkModeStatus = CommonUtils.getDarkModeStatus(context);
                String string = bundle.getString("url");
                if (darkModeStatus && !string.contains("theme=dark")) {
                    if (string.indexOf("?") > -1) {
                        str3 = string.concat("&theme=dark");
                    } else {
                        str3 = string.concat("?theme=dark");
                    }
                    bundle.putString("url", str3);
                }
            }
        } else if (bundle == null || !isTransparent(bundle)) {
            intent = new Intent(context, UccWebViewActivity.class);
        } else {
            intent = new Intent(context, WebViewTransparentActivity.class);
            if (bundle.getString("url") != null) {
                boolean darkModeStatus2 = CommonUtils.getDarkModeStatus(context);
                String string2 = bundle.getString("url");
                if (darkModeStatus2 && !string2.contains("theme=dark")) {
                    if (string2.indexOf("?") > -1) {
                        str2 = string2.concat("&theme=dark");
                    } else {
                        str2 = string2.concat("?theme=dark");
                    }
                    bundle.putString("url", str2);
                }
            }
        }
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        try {
            if (context instanceof WebViewDialogActivity) {
                ((WebViewDialogActivity) context).finish();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (bundle == null) {
            str = "";
        } else {
            str = bundle.getString(ParamsConstants.Key.PARAM_NAVIGATOR_TYPE);
        }
        try {
            if ("cover".equals(str) && (context instanceof Activity)) {
                ((Activity) context).finish();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void showH5BindPageFoeNewBind(final Context context, final UccParams uccParams, String str, final Map<String, String> map, final UccCallback uccCallback) {
        final String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ae35a2", new Object[]{context, uccParams, str, map, uccCallback});
            return;
        }
        final String str3 = "0";
        if (map != null) {
            str2 = TextUtils.isEmpty(map.get("needSession")) ? str3 : map.get("needSession");
            if (!TextUtils.isEmpty(map.get("needToast"))) {
                str3 = map.get("needToast");
            }
        } else {
            str2 = str3;
            str3 = str2;
        }
        UccParams uccParams2 = new UccParams();
        if (map == null || TextUtils.isEmpty(map.get("site"))) {
            uccParams2.site = AliMemberSDK.getMasterSite();
        } else {
            uccParams2.site = map.get("site");
        }
        uccParams2.bindSite = uccParams.bindSite;
        uccParams2.userToken = uccParams.userToken;
        if (map != null && !TextUtils.isEmpty(map.get("scene"))) {
            uccParams2.scene = map.get("scene");
        }
        uccParams2.createBindSiteSession = TextUtils.equals("1", str2);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GetLocalSiteUrl", uccParams, null);
        DataRepository.fetchNewBindPageUrl(uccParams2, str, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccH5Presenter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void rpcResultHit(String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f76b96ec", new Object[]{this, str4, str5});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str4);
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str5);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GetLocalSiteUrlResult", UccParams.this, hashMap);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str4, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                rpcResultHit(buidErrorCode + "", "");
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(UccParams.this.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "fetchBindPageUrl fail"));
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                FetchBindPageUrlResult fetchBindPageUrlResult = (FetchBindPageUrlResult) rpcResponse.returnValue;
                if (fetchBindPageUrlResult == null || TextUtils.isEmpty(fetchBindPageUrlResult.returnUrl)) {
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 != null) {
                        uccCallback2.onFail(UccParams.this.bindSite, 1401, Utils.buidErrorMessage(rpcResponse, "url 为空"));
                        return;
                    }
                    return;
                }
                rpcResultHit(rpcResponse.code + "", fetchBindPageUrlResult.h5Type);
                HashMap hashMap = new HashMap();
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, fetchBindPageUrlResult.h5Type);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GoH5BindAction", UccParams.this, hashMap);
                Bundle bundle = new Bundle();
                bundle.putString("url", fetchBindPageUrlResult.returnUrl);
                bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(UccParams.this));
                bundle.putString("needSession", str2);
                bundle.putString("needToast", str3);
                bundle.putString("params", Utils.convertMapToJsonStr(map));
                bundle.putString(ParamsConstants.Key.PARAM_H5_TYPE, fetchBindPageUrlResult.h5Type);
                UccH5Presenter.openUrl(context, bundle, uccCallback);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str4, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                rpcResultHit(buidErrorCode + "", "");
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(UccParams.this.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "获取页面失败"));
                }
            }
        });
    }

    private static boolean isTransparent(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cedf229", new Object[]{bundle})).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.get(ParamsConstants.Key.PRAMA_TRANSPARENT_H5)) || ParamsConstants.Key.PRAMA_TRANSPARENT_H5.equals(bundle.get(ParamsConstants.Key.PARAM_H5_TYPE));
    }

    public static void showH5BindPage(final Activity activity, final UccParams uccParams, final Map<String, String> map, final boolean z, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edd41fb", new Object[]{activity, uccParams, map, new Boolean(z), uccCallback});
            return;
        }
        final String str = "0";
        if (map != null) {
            str = TextUtils.isEmpty(map.get("needSession")) ? str : map.get("needSession");
            if (!TextUtils.isEmpty(map.get("needToast"))) {
                str = map.get("needToast");
            }
        } else {
            str = str;
        }
        if (map == null || TextUtils.isEmpty(map.get(UccConstants.PARAM_BIND_URL))) {
            if (map == null || TextUtils.isEmpty(map.get("site"))) {
                uccParams.site = AliMemberSDK.getMasterSite();
            } else {
                uccParams.site = map.get("site");
            }
            if (map != null && !TextUtils.isEmpty(map.get("scene"))) {
                uccParams.scene = map.get("scene");
            }
            uccParams.createBindSiteSession = TextUtils.equals("1", str);
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetLocalSiteUrl", uccParams, null);
            DataRepository.fetchBindPageUrl(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccH5Presenter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private void rpcResultHit(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f76b96ec", new Object[]{this, str2, str3});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", str2);
                    hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str3);
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetLocalSiteUrlResult", uccParams, hashMap);
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                    rpcResultHit(buidErrorCode + "", "");
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 != null) {
                        uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "fetchBindPageUrl fail"));
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    FetchBindPageUrlResult fetchBindPageUrlResult = (FetchBindPageUrlResult) rpcResponse.returnValue;
                    if (fetchBindPageUrlResult != null && fetchBindPageUrlResult.nativeFirst && !z) {
                        AppCredential oauthConfigByPlatform = OauthPlatformConfig.getOauthConfigByPlatform(uccParams.bindSite);
                        Map map2 = map;
                        if (map2 != null) {
                            map2.remove(ParamsConstants.Key.PARAM_ENABLE_RECOMMEND_BIND);
                        }
                        if (((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(activity, uccParams.bindSite)) {
                            map.put(ParamsConstants.Key.PARAM_FORCE_NATIVE, "1");
                        }
                        UccServiceProviderFactory.getInstance().getUccServiceProvider(uccParams.bindSite).bind(activity, uccParams, oauthConfigByPlatform, map, uccCallback);
                    } else if (fetchBindPageUrlResult == null || TextUtils.isEmpty(fetchBindPageUrlResult.returnUrl)) {
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 != null) {
                            uccCallback2.onFail(uccParams.bindSite, 1401, Utils.buidErrorMessage(rpcResponse, "url 为空"));
                        }
                    } else {
                        rpcResultHit(rpcResponse.code + "", fetchBindPageUrlResult.h5Type);
                        HashMap hashMap = new HashMap();
                        hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, fetchBindPageUrlResult.h5Type);
                        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoH5BindAction", uccParams, hashMap);
                        Bundle bundle = new Bundle();
                        bundle.putString("url", fetchBindPageUrlResult.returnUrl);
                        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                        bundle.putString("needSession", str);
                        bundle.putString("needToast", str);
                        bundle.putString("params", Utils.convertMapToJsonStr(map));
                        Map map3 = map;
                        if (map3 != null) {
                            bundle.putString(ParamsConstants.Key.PARAM_HALF_H5, (String) map3.get(ParamsConstants.Key.PARAM_HALF_H5));
                        }
                        bundle.putString(ParamsConstants.Key.PARAM_H5_TYPE, fetchBindPageUrlResult.h5Type);
                        UccH5Presenter.openUrl(activity, bundle, uccCallback);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1402);
                    rpcResultHit(buidErrorCode + "", "");
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 != null) {
                        uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "获取页面失败"));
                    }
                }
            });
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, map.get(ParamsConstants.Key.PARAM_H5_TYPE));
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoH5BindAction", uccParams, hashMap);
        Bundle bundle = new Bundle();
        bundle.putString("url", map.get(UccConstants.PARAM_BIND_URL));
        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
        bundle.putString("needSession", str);
        bundle.putString("needToast", str);
        bundle.putString("params", Utils.convertMapToJsonStr(map));
        bundle.putString(ParamsConstants.Key.PARAM_HALF_H5, map.get(ParamsConstants.Key.PARAM_HALF_H5));
        bundle.putString("requestToken", map.get("requestToken"));
        bundle.putString(ParamsConstants.Key.PARAM_H5_TYPE, map.get(ParamsConstants.Key.PARAM_H5_TYPE));
        openUrl(activity, bundle, uccCallback);
    }
}
