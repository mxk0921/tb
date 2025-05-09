package com.ali.user.open.oauth.alipay3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.trace.TLogAdapter;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl;
import com.alipay.sdk.auth.OpenAuthTask;
import com.alipay.sdk.auth.manager.AFReportManager;
import com.alipay.sdk.auth.manager.IReportProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlipayOauthServiceProviderImpl extends BaseOauthServiceProviderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Login.AlipayOauthServiceProviderImpl";
    private boolean mLoginAfterOauth = true;

    private void authTask(Activity activity, final String str, AppCredential appCredential, Map<String, String> map, final OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579ada09", new Object[]{this, activity, str, appCredential, map, oauthCallback});
            return;
        }
        try {
            IpChange ipChange2 = OpenAuthTask.$ipChange;
            HashMap hashMap = new HashMap();
            if (map != null && !TextUtils.isEmpty(map.get(ParamsConstants.Key.PARAM_ALIPAY_URL))) {
                hashMap.put("url", map.get(ParamsConstants.Key.PARAM_ALIPAY_URL));
            } else if (map == null || !"1".equals(map.get(ParamsConstants.Key.PARAM_ALIPAY_QUICK_LOGIN))) {
                hashMap.put("url", "https://authweb.alipay.com/auth?auth_type=PURE_OAUTH_SDK&app_id=" + appCredential.appKey + "&scope=auth_user&auth_token_type=once&state=init");
            } else {
                hashMap.put("url", "https://authweb.alipay.com/auth?auth_type=PURE_OAUTH_SDK&app_id=" + appCredential.appKey + "&scope=login_getPayInfo&state=init");
            }
            TLogAdapter.e(TAG, "in authTask,URL=" + ((String) hashMap.get("url")));
            setLog();
            new OpenAuthTask(activity).execute("__alipaysdkauth__", OpenAuthTask.BizType.AccountAuth, hashMap, new OpenAuthTask.Callback() { // from class: com.ali.user.open.oauth.alipay3.AlipayOauthServiceProviderImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.sdk.auth.OpenAuthTask.Callback
                public void onResult(int i, String str2, Bundle bundle) {
                    IpChange ipChange3 = $ipChange;
                    if (ipChange3 instanceof IpChange) {
                        ipChange3.ipc$dispatch("194738ca", new Object[]{this, new Integer(i), str2, bundle});
                        return;
                    }
                    TLogAdapter.e(AlipayOauthServiceProviderImpl.TAG, "in onResult,i=" + i);
                    HashMap hashMap2 = new HashMap();
                    if (i != 9000) {
                        hashMap2.put(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
                        hashMap2.put("code", "202");
                        hashMap2.put("iCode", String.valueOf(i));
                        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Fail", hashMap2);
                        oauthCallback.onFail(str, 202, "");
                    } else if (!TextUtils.isEmpty(bundle.getString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY))) {
                        hashMap2.put("authCode", bundle.getString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY));
                        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Code9000", hashMap2);
                        oauthCallback.onSuccess(str, hashMap2);
                    } else if (TextUtils.equals(bundle.getString("authStatus"), LoginConstant.FETCH_IV_FAIL_CANCEL) || TextUtils.equals(bundle.getString("authStatus"), "USER_BACK")) {
                        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Code9000_CANCEL", hashMap2);
                        oauthCallback.onFail(str, 204, "");
                    } else {
                        hashMap2.put("iCode", String.valueOf(i));
                        if (TextUtils.isEmpty(bundle.getString("authStatus"))) {
                            hashMap2.put("authStatus", "empty");
                        } else {
                            hashMap2.put("authStatus", bundle.getString("authStatus"));
                        }
                        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Fail", hashMap2);
                        oauthCallback.onFail(str, 202, "");
                    }
                }
            }, true);
            TLogAdapter.e(TAG, "after task.execute");
        } catch (Throwable th) {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Exception", new HashMap());
            th.printStackTrace();
            oauthCallback.onFail(str, 200, "");
        }
    }

    public static /* synthetic */ Object ipc$super(AlipayOauthServiceProviderImpl alipayOauthServiceProviderImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/oauth/alipay3/AlipayOauthServiceProviderImpl");
    }

    private void setLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58a6f09", new Object[]{this});
            return;
        }
        try {
            AFReportManager.setProvider(new IReportProvider() { // from class: com.ali.user.open.oauth.alipay3.AlipayOauthServiceProviderImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.sdk.auth.manager.IReportProvider
                public void report(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb4f1a72", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", i + "");
                    if (TextUtils.isEmpty(str)) {
                        str = "empty";
                    }
                    hashMap.put("msg", str);
                    ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_report", hashMap);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: NameNotFoundException -> 0x0043
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    @Override // com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl, com.ali.user.open.oauth.OauthServiceProvider
    public boolean isAppAuthSurpport(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.open.oauth.alipay3.AlipayOauthServiceProviderImpl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "d3275c85"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r2.ipc$dispatch(r3, r4)
            r6 = move-result
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            r6 = move-result
            return r6
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.sdk.auth.OpenAuthTask.$ipChange     // Catch: Exception -> 0x002f
            boolean r2 = r6 instanceof android.app.Activity     // Catch: Exception -> 0x002f
            if (r2 == 0) goto L_0x0033     // Catch: Exception -> 0x002f
            com.alipay.sdk.auth.OpenAuthTask r2 = new com.alipay.sdk.auth.OpenAuthTask     // Catch: Exception -> 0x002f
            r3 = r6     // Catch: Exception -> 0x002f
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: Exception -> 0x002f
            r2.<init>(r3)     // Catch: Exception -> 0x002f
            r2.isAliPaySupportOpenAuth()     // Catch: Exception -> 0x002f
            r6 = move-result     // Catch: Exception -> 0x002f
            return r6
        L_0x002f:
            r2 = move-exception
            r2.printStackTrace()
            if (r6 != 0) goto L_0x0039
            com.ali.user.open.core.context.KernelContext.getApplicationContext()
            r6 = move-result
            r6.getPackageManager()
            r6 = move-result
            java.lang.String r2 = "com.eg.android.AlipayGphone"
            r6.getPackageInfo(r2, r1)
            goto L_0x0044
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.oauth.alipay3.AlipayOauthServiceProviderImpl.isAppAuthSurpport(android.content.Context):boolean");
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void logout(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
        } else {
            SDKLogger.e(TAG, "logout alipay inside");
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void oauth(Activity activity, String str, AppCredential appCredential, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2f1ff", new Object[]{this, activity, str, appCredential, map, oauthCallback});
            return;
        }
        this.mLoginAfterOauth = true;
        HashMap hashMap = new HashMap();
        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Invoke", hashMap);
        if (activity == null) {
            hashMap.put("code", String.valueOf(102));
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Fail", hashMap);
            oauthCallback.onFail(str, 102, "param is null");
        } else if (appCredential == null || TextUtils.isEmpty(appCredential.appKey)) {
            hashMap.put("code", String.valueOf(101));
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_AlipayOauth", "Page_AlipayOauth_Fail", hashMap);
            oauthCallback.onFail(str, 101, "app credential is null");
        } else {
            authTask(activity, str, appCredential, map, oauthCallback);
        }
    }
}
