package com.taobao.android.sns4android.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.Properties;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.rmo;
import tb.tn1;
import tb.wmo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SNSJsbridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUHT_UNINSTALL_CODE = 10011;
    public static final int AUTH_CANCEL_CODE = 1009;
    public static final String AUTH_CANCEL_MESSAGE = "用户取消(E_USER_CANCEL)";
    public static final int AUTH_FAIL_CODE = 10010;
    public static final String AUTH_FAIL_MESSAGE = "用户授权失败(E_USER_AUTH_FAIL)";
    public static final String AUTH_UNINSTALL_MESSAGE = "当前授权应用未安装";
    public static int PARAM_ERROR_CODE = 1003;
    public static String PARAM_ERROR_MESSAGE = "参数错误(E_PARAM_ERROR)";
    public static final int SNS_AUTH_NOT_INITED = 10012;
    public static wmo mWeixinListener;
    public WVCallBackContext mCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements wmo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Properties f9491a;
        public final /* synthetic */ String b;

        public a(Properties properties, String str) {
            this.f9491a = properties;
            this.b = str;
        }

        @Override // tb.wmo
        public void onCancel(Activity activity, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77c620a6", new Object[]{this, activity, str, str2});
                return;
            }
            UserTrackAdapter.sendUT("SNSJsbridgeAuthCancel");
            LoginTLogAdapter.e(ApiReferer.TAG, "auth jsbridge oncancel");
            SNSJsbridge.mWeixinListener = null;
            SNSJsbridge.access$100(SNSJsbridge.this, 1009, SNSJsbridge.AUTH_CANCEL_MESSAGE);
            SNSJsbridge.access$000(SNSJsbridge.this, this.b);
        }

        @Override // tb.wmo
        public void onError(Activity activity, String str, int i, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7321aa0b", new Object[]{this, activity, str, new Integer(i), str2, str3});
                return;
            }
            Properties properties = this.f9491a;
            if (properties != null) {
                properties.setProperty("code", String.valueOf(i));
            }
            UserTrackAdapter.sendUT("SNSJsbridgeAuthFail", this.f9491a);
            LoginTLogAdapter.e(ApiReferer.TAG, "auth jsbridge onError:" + i + "," + str2);
            SNSJsbridge.mWeixinListener = null;
            SNSJsbridge sNSJsbridge = SNSJsbridge.this;
            if (TextUtils.isEmpty(str2)) {
                str2 = SNSJsbridge.AUTH_FAIL_MESSAGE;
            }
            SNSJsbridge.access$100(sNSJsbridge, i, str2);
            SNSJsbridge.access$000(SNSJsbridge.this, this.b);
        }

        @Override // tb.wmo
        public void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8032b9ea", new Object[]{this, activity, sNSSignInAccount});
                return;
            }
            UserTrackAdapter.sendUT("SNSJsbridgeAuthSuccess", this.f9491a);
            SNSJsbridge.mWeixinListener = null;
            if (SNSJsbridge.this.mCallback != null) {
                nsw nswVar = new nsw();
                nswVar.b("authCode", sNSSignInAccount.token);
                nswVar.b("token", sNSSignInAccount.token);
                nswVar.b("userId", sNSSignInAccount.userId);
                nswVar.j("HY_SUCCESS");
                SNSJsbridge.this.mCallback.success(nswVar);
            }
            SNSJsbridge.access$000(SNSJsbridge.this, this.b);
        }
    }

    public static /* synthetic */ void access$000(SNSJsbridge sNSJsbridge, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9039b8", new Object[]{sNSJsbridge, str});
        } else {
            sNSJsbridge.afterCallback(str);
        }
    }

    public static /* synthetic */ void access$100(SNSJsbridge sNSJsbridge, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6dd220", new Object[]{sNSJsbridge, new Integer(i), str});
        } else {
            sNSJsbridge.setErrorCallback(i, str);
        }
    }

    private void afterCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c49212", new Object[]{this, str});
        } else if (SNSPlatform.PLATFORM_ALIPAYHK.getPlatform().equals(str)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_CLOSE_ALIPAY_RESULT);
        }
    }

    public static /* synthetic */ Object ipc$super(SNSJsbridge sNSJsbridge, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/jsbridge/SNSJsbridge");
    }

    private void setErrorCallback(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51af89b", new Object[]{this, new Integer(i), str});
        } else if (this.mCallback != null) {
            nsw nswVar = new nsw();
            nswVar.a("code", Integer.valueOf(i));
            nswVar.b("message", str);
            this.mCallback.error(nswVar);
        }
    }

    private void setSuccessCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05c3a47", new Object[]{this, new Boolean(z)});
        } else if (this.mCallback != null) {
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            nswVar.a("supported", Boolean.valueOf(z));
            this.mCallback.success(nswVar);
        }
    }

    public synchronized void auth(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        String string;
        SNSPlatform convertSNSPlatform;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1d6f6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString("type");
            convertSNSPlatform = SNSPlatform.convertSNSPlatform(string);
        } catch (Exception unused) {
            setErrorCallback(PARAM_ERROR_CODE, PARAM_ERROR_MESSAGE);
        }
        if (convertSNSPlatform == null) {
            setErrorCallback(PARAM_ERROR_CODE, PARAM_ERROR_MESSAGE);
            return;
        }
        Properties properties = new Properties();
        if (!TextUtils.isEmpty(string)) {
            properties.put("type", string);
        }
        Activity activity = (Activity) this.mContext;
        a aVar = new a(properties, string);
        if (SNSPlatform.PLATFORM_WEIXIN == convertSNSPlatform) {
            mWeixinListener = aVar;
        }
        UserTrackAdapter.sendUT("SNSJsbridgeAuth");
        rmo.a(convertSNSPlatform, activity, aVar, jSONObject);
    }

    public synchronized void isAppAuthSupport(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988e533e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        String string = new JSONObject(str).getString("type");
        if (SNSPlatform.convertSNSPlatform(string) == null) {
            setErrorCallback(PARAM_ERROR_CODE, PARAM_ERROR_MESSAGE);
            return;
        }
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_ALIPAYHK;
        if (sNSPlatform.getPlatform().equals(string)) {
            setSuccessCallback(BundleUtil.isAppInstalled(this.mContext, sNSPlatform.getPackageName()));
            return;
        }
        Activity activity = (Activity) this.mContext;
        if (AliMemberSDK.getService(OauthService.class) != null) {
            if (tn1.KEY_SHARE_CONFIG_WEIXIN.equals(string)) {
                string = "wechat";
            }
            setSuccessCallback(((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(activity, string));
        } else {
            setErrorCallback(10012, activity.getString(R.string.aliuser_SNS_platform_auth_not_init_ucc));
        }
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 11101) {
            rmo.k(SNSPlatform.PLATFORM_QQ, i, i2, intent);
        } else {
            rmo.k(SNSPlatform.PLATFORM_WEIBO, i, i2, intent);
            rmo.k(SNSPlatform.PLATFORM_WEIXIN, i, i2, intent);
            rmo.k(SNSPlatform.PLATFORM_ALIPAY, i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("auth".equals(str)) {
            auth(str2, wVCallBackContext);
            return true;
        } else if (!"isAppAuthSupport".equals(str)) {
            return false;
        } else {
            isAppAuthSupport(str2, wVCallBackContext);
            return true;
        }
    }
}
