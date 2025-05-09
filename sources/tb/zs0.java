package tb;

import android.app.Activity;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zs0 implements CommonDataCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wmo f32982a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Activity c;

    public zs0(bt0 bt0Var, wmo wmoVar, String str, Activity activity) {
        this.f32982a = wmoVar;
        this.b = str;
        this.c = activity;
    }

    @Override // com.ali.user.mobile.callback.CommonDataCallback
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        wmo wmoVar = this.f32982a;
        if (wmoVar != null) {
            IpChange ipChange2 = bt0.$ipChange;
            if (i == -3) {
                wmoVar.onCancel(this.c, bt0.b, this.b);
                return;
            }
            Activity activity = this.c;
            wmoVar.onError(activity, bt0.b, i, activity.getString(R.string.aliuser_sns_platform_auth_fail), this.b);
        }
    }

    @Override // com.ali.user.mobile.callback.CommonDataCallback
    public void onSuccess(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
        } else if (this.f32982a != null) {
            SNSSignInAccount sNSSignInAccount = new SNSSignInAccount();
            sNSSignInAccount.token = map.get("authCode");
            sNSSignInAccount.snsType = bt0.b;
            sNSSignInAccount.utPageName = this.b;
            this.f32982a.onSucceed(this.c, sNSSignInAccount);
        }
    }
}
