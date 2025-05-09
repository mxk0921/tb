package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.OauthPlatformConfig;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ts0 extends vmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = SNSPlatform.PLATFORM_ALIPAY.getPlatform();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements OauthCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wmo f28919a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ boolean f;

        public a(wmo wmoVar, String str, boolean z, Activity activity, Context context) {
            this.f28919a = wmoVar;
            this.b = str;
            this.f = z;
            this.c = activity;
            this.d = context;
        }

        @Override // com.ali.user.open.oauth.OauthCallback
        public void onFail(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            ts0.this.d(this.b, UTConstant.Args.UT_SUCCESS_F);
            wmo wmoVar = this.f28919a;
            if (wmoVar == null) {
                return;
            }
            if (i == 204) {
                wmoVar.onCancel(this.c, ts0.b, this.b);
            } else {
                wmoVar.onError(this.c, ts0.b, i, this.d.getString(R.string.aliuser_sns_platform_auth_fail), this.b);
            }
        }

        @Override // com.ali.user.open.oauth.OauthCallback
        public void onSuccess(String str, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5e17230", new Object[]{this, str, map});
                return;
            }
            ts0.this.d("Page_Extent_Alipay", "T");
            if (this.f28919a != null) {
                SNSSignInAccount sNSSignInAccount = new SNSSignInAccount();
                sNSSignInAccount.token = (String) map.get("authCode");
                sNSSignInAccount.snsType = ts0.b;
                sNSSignInAccount.utPageName = this.b;
                sNSSignInAccount.regXianyu = this.f;
                this.f28919a.onSucceed(this.c, sNSSignInAccount);
            }
        }
    }

    public static ts0 i(smo smoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ts0) ipChange.ipc$dispatch("ee5345fa", new Object[]{smoVar});
        }
        try {
            LoginTLogAdapter.e("Login.alipay3", "in Alipay3SignInHelper create");
            AppCredential appCredential = new AppCredential();
            appCredential.appKey = smoVar.b;
            appCredential.pid = null;
            appCredential.signType = null;
            appCredential.targetId = "";
            appCredential.scope = null;
            OauthPlatformConfig.setOauthConfig("alipay", appCredential);
        } catch (Throwable unused) {
        }
        return new ts0();
    }

    public static /* synthetic */ Object ipc$super(ts0 ts0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay3/Alipay3SignInHelper");
    }

    @Override // tb.vmo
    public void b(Activity activity, wmo wmoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df5b00d", new Object[]{this, activity, wmoVar, jSONObject});
        } else {
            g(false, activity, wmoVar, jSONObject);
        }
    }

    @Override // tb.vmo
    public void f(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958c604a", new Object[]{this, activity, map});
        } else {
            h(true, activity, this.f30110a, null, map);
        }
    }

    public final void g(boolean z, Activity activity, wmo wmoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86baeddd", new Object[]{this, new Boolean(z), activity, wmoVar, jSONObject});
        } else {
            h(z, activity, wmoVar, jSONObject, null);
        }
    }

    public final void h(boolean z, Activity activity, wmo wmoVar, JSONObject jSONObject, Map<String, String> map) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebabd808", new Object[]{this, new Boolean(z), activity, wmoVar, jSONObject, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ParamsConstants.Key.PARAM_ONLY_AUTHCODE, "1");
        if (z) {
            hashMap.put(ParamsConstants.Key.PARAM_ALIPAY_QUICK_LOGIN, "1");
        }
        String str = "Page_Extent_Alipay";
        if (jSONObject != null) {
            try {
                hashMap.put(ParamsConstants.Key.PARAM_ALIPAY_URL, jSONObject.opt(ParamsConstants.Key.PARAM_ALIPAY_URL));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (map != null && !map.isEmpty()) {
            if (map.containsKey(UTConstant.PageName.UT_KEY_PAGE_NAME)) {
                str = map.remove(UTConstant.PageName.UT_KEY_PAGE_NAME);
            }
            z2 = map.containsKey("unionReg");
            if (!TextUtils.isEmpty(str)) {
                UserTrackAdapter.sendControlUT(str, "Btn_Login");
            }
            hashMap.putAll(map);
        }
        Context applicationContext = DataProviderFactory.getApplicationContext();
        if (AliMemberSDK.getService(OauthService.class) != null) {
            LoginTLogAdapter.e("Login.alipay3", "oauthservice != null");
            ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(activity, "alipay", hashMap, new a(wmoVar, str, z2, activity, applicationContext));
            return;
        }
        LoginTLogAdapter.e("Login.alipay3", "OauthService is null");
        if (wmoVar != null) {
            wmoVar.onError(activity, b, 10012, applicationContext.getString(R.string.aliuser_SNS_platform_auth_not_init_ucc), str);
        }
    }
}
