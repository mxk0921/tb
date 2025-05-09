package com.ali.user.open.ucc.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.model.LoginDataModel;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccServiceProvider;
import com.ali.user.open.ucc.biz.UccBindPresenter;
import com.ali.user.open.ucc.biz.UccH5Presenter;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.pg1;
import tb.q0j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseUccServiceProvider implements UccServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaobaoUccServiceProviderImpl";

    static {
        t2o.a(76546085);
        t2o.a(76546082);
    }

    private void authByNatvie(final Activity activity, final UccParams uccParams, AppCredential appCredential, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5f3ec0", new Object[]{this, activity, uccParams, appCredential, map, uccCallback});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(ParamsConstants.Key.PARAM_ONLY_AUTHCODE, "1");
        map.put(ParamsConstants.Key.PARAM_IS_BIND, "1");
        map.put("traceId", uccParams.traceId);
        map.put("userToken", uccParams.userToken);
        ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(activity, uccParams.bindSite, map, new OauthCallback() { // from class: com.ali.user.open.ucc.base.BaseUccServiceProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void resultHit(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("366f9047", new Object[]{this, str});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoOauthResult", uccParams, hashMap);
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onFail(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                resultHit(i + "");
                if (i == 10003 || i == 15) {
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", uccParams, new HashMap());
                } else if (i == 1011) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("needSession", "1");
                    UccBindPresenter instance = UccBindPresenter.getInstance();
                    Activity activity2 = activity;
                    UccParams uccParams2 = uccParams;
                    instance.getUserInfo(activity2, uccParams2, uccParams2.userToken, "userToken", "native", hashMap, uccCallback);
                }
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(str, i, str2);
                }
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onSuccess(String str, Map map2) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map2});
                    return;
                }
                resultHit("3000");
                String str3 = (String) map2.get("authCode");
                String str4 = (String) map2.get("accessToken");
                String str5 = TextUtils.isEmpty(str4) ? str3 : str4;
                if (TextUtils.isEmpty(str4)) {
                    str2 = "oauthcode";
                } else {
                    str2 = HttpHeaderConstant.KEY_EXTDATA_ACCESSTOKEN;
                }
                UccBindPresenter.getInstance().bindByNativeAuth(activity, uccParams, str5, str2, map, uccCallback);
            }
        });
    }

    private void authByNatvieWithIbb(final Activity activity, final UccParams uccParams, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13d2276", new Object[]{this, activity, uccParams, map, uccCallback});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("traceId", uccParams.traceId);
        ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(activity, uccParams.bindSite, map, new OauthCallback() { // from class: com.ali.user.open.ucc.base.BaseUccServiceProvider.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void resultHit(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("366f9047", new Object[]{this, str});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GoOauthResult", uccParams, hashMap);
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onFail(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                resultHit(i + "");
                if (i == 10003 || i == 15) {
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_Cancel", uccParams, null);
                } else if (i == 1011) {
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_NativeSkip", uccParams, null);
                }
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 != null) {
                    uccCallback2.onFail(str, i, str2);
                }
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onSuccess(String str, Map map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map2});
                    return;
                }
                resultHit("3000");
                UccBindPresenter.getInstance().getUserInfo(activity, uccParams, (String) map2.get("authCode"), "oauthcode", "native", map, uccCallback);
            }
        });
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void applyToken(UccParams uccParams, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc9a730", new Object[]{this, uccParams, map, uccCallback});
        } else if (Site.isHavanaSite(uccParams.bindSite)) {
            UccBindPresenter.getInstance().applyToken(uccParams, "native", map, uccCallback);
        } else {
            uccCallback.onFail(uccParams.bindSite, 1601, "unsupportedSite");
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void bindWithIBB(Activity activity, UccParams uccParams, String str, Map<String, String> map, UccCallback uccCallback) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb3ad", new Object[]{this, activity, uccParams, str, map, uccCallback});
        } else if (uccParams == null || TextUtils.isEmpty(str)) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_InvalidParams", uccParams, null);
            if (uccCallback != null) {
                uccCallback.onFail(uccParams.bindSite, 102, "参数错误");
            }
        } else if (isAuthByNative(activity, uccParams.bindSite, map)) {
            HashMap hashMap = new HashMap();
            hashMap.put("from", pg1.ATOM_EXT_bind);
            if (map != null) {
                hashMap.put("scene", map.get("scene"));
                if (TextUtils.equals(map.get("needSession"), "1")) {
                    str2 = "T";
                } else {
                    str2 = UTConstant.Args.UT_SUCCESS_F;
                }
                hashMap.put("needSession", str2);
            }
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GoOauthBindAction", uccParams, hashMap);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(ParamsConstants.Key.PARAM_SCENE_CODE, q0j.ERROR_CODE_DESC_RENDER_ERROR);
            map.put(ParamsConstants.Key.PARAM_IBB, str);
            authByNatvieWithIbb(activity, uccParams, map, uccCallback);
        } else {
            UccH5Presenter.showH5BindPageFoeNewBind(activity, uccParams, str, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public Map<String, String> buildSessionInfo(String str, String str2) {
        LoginDataModel loginDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9649eda6", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (Site.isHavanaSite(str)) {
            try {
                LoginReturnData loginReturnData = (LoginReturnData) JSON.parseObject(str2, LoginReturnData.class);
                if (!(loginReturnData == null || (loginDataModel = (LoginDataModel) JSON.parseObject(loginReturnData.data, LoginDataModel.class)) == null)) {
                    hashMap.put("openId", loginDataModel.openId);
                    hashMap.put(ParamsConstants.Key.PARAM_BIND_TOKEN, loginDataModel.bindToken);
                    hashMap.put("accessToken", loginDataModel.topAccessToken);
                    hashMap.put("authCode", loginDataModel.topAuthCode);
                    hashMap.put("userId", loginDataModel.userId);
                    hashMap.put("sid", loginDataModel.sid);
                    hashMap.put("nick", loginDataModel.nick);
                    hashMap.put("avatarUrl", loginDataModel.headPicLink);
                    hashMap.put("openSid", loginDataModel.openSid);
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void cleanUp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426bb0dd", new Object[]{this, context});
        }
    }

    public abstract boolean isAuthByNative(Context context, String str, Map<String, String> map);

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void logout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40ebd7", new Object[]{this, context});
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void refreshWhenLogin(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852e92e5", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshCookie(str, (LoginReturnData) JSON.parseObject(str2, LoginReturnData.class));
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void bind(Activity activity, UccParams uccParams, AppCredential appCredential, Map<String, String> map, UccCallback uccCallback) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf24a06d", new Object[]{this, activity, uccParams, appCredential, map, uccCallback});
        } else if ((uccParams == null || TextUtils.isEmpty(uccParams.userToken)) && (map == null || TextUtils.isEmpty(map.get("requestToken")))) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_InvalidParams", uccParams, null);
            if (uccCallback != null) {
                uccCallback.onFail(uccParams.bindSite, 102, "参数错误");
            }
        } else if (map != null && !TextUtils.isEmpty(map.get("authCode"))) {
            HashMap hashMap = new HashMap();
            String str2 = map.get("authCode");
            hashMap.put("authCode", str2);
            map.put(ParamsConstants.Key.PARAM_ONLY_AUTHCODE, "1");
            map.put(ParamsConstants.Key.PARAM_IS_BIND, "1");
            map.put("traceId", uccParams.traceId);
            map.put("userToken", uccParams.userToken);
            UccBindPresenter.getInstance().bindByNativeAuth(activity, uccParams, str2, "oauthcode", map, uccCallback);
        } else if (map == null || TextUtils.isEmpty(map.get(ParamsConstants.Key.PARAM_BIND_TOKEN))) {
            boolean isH5OnlyBindSites = ConfigManager.getInstance().isH5OnlyBindSites(uccParams.bindSite);
            if (map != null && !TextUtils.isEmpty(map.get(ParamsConstants.Key.PARAM_H5ONLY))) {
                if (TextUtils.equals(map.get(ParamsConstants.Key.PARAM_H5ONLY), "1")) {
                    isH5OnlyBindSites = true;
                } else if (TextUtils.equals(map.get(ParamsConstants.Key.PARAM_H5ONLY), "0")) {
                    isH5OnlyBindSites = false;
                }
            }
            if (!isH5OnlyBindSites && isAuthByNative(activity, uccParams.bindSite, map)) {
                z = false;
            }
            if (z || (map != null && TextUtils.equals(map.get(ParamsConstants.Key.PARAM_ENABLE_RECOMMEND_BIND), "true"))) {
                UccH5Presenter.showH5BindPage(activity, uccParams, map, z, uccCallback);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("from", pg1.ATOM_EXT_bind);
            if (map != null) {
                hashMap2.put("scene", map.get("scene"));
                if (TextUtils.equals(map.get("needSession"), "1")) {
                    str = "T";
                } else {
                    str = UTConstant.Args.UT_SUCCESS_F;
                }
                hashMap2.put("needSession", str);
            }
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoOauthBindAction", uccParams, hashMap2);
            authByNatvie(activity, uccParams, appCredential, map, uccCallback);
        } else {
            map.put("traceId", uccParams.traceId);
            map.put("userToken", uccParams.userToken);
            String str3 = map.get(ParamsConstants.Key.PARAM_BIND_TOKEN_TYPE);
            if (TextUtils.isEmpty(str3)) {
                str3 = "oauthcode";
            }
            UccBindPresenter.getInstance().bindByNativeAuth(activity, uccParams, map.get(ParamsConstants.Key.PARAM_BIND_TOKEN), str3, map, uccCallback);
        }
    }
}
