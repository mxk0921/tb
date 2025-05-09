package tb;

import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tmo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.SNSBusiness";

    /* renamed from: a  reason: collision with root package name */
    public static tmo f28805a;

    public static tmo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tmo) ipChange.ipc$dispatch("ec915e80", new Object[0]);
        }
        if (f28805a == null) {
            synchronized (tmo.class) {
                try {
                    if (f28805a == null) {
                        f28805a = new tmo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28805a;
    }

    public void b(SNSSignInAccount sNSSignInAccount, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf1530a", new Object[]{this, sNSSignInAccount, rpcRequestCallback});
        } else if (sNSSignInAccount != null) {
            LoginBaseParam loginBaseParam = new LoginBaseParam();
            loginBaseParam.snsType = sNSSignInAccount.snsType;
            loginBaseParam.snsTrustLoginToken = sNSSignInAccount.token;
            loginBaseParam.appId = sNSSignInAccount.app_id;
            loginBaseParam.regXianyu = sNSSignInAccount.regXianyu;
            UserLoginServiceImpl.getInstance().snslogin(loginBaseParam, rpcRequestCallback);
        }
    }
}
