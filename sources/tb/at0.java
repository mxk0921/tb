package tb;

import android.app.Activity;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.open.oauth.alipay3.GetSignCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class at0 implements GetSignCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f15982a;
    public final /* synthetic */ wmo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ bt0 d;

    public at0(bt0 bt0Var, Activity activity, wmo wmoVar, String str) {
        this.d = bt0Var;
        this.f15982a = activity;
        this.b = wmoVar;
        this.c = str;
    }

    @Override // com.ali.user.open.core.callback.FailureCallback
    public void onFailure(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
            return;
        }
        if (this.f15982a != null) {
            ((SNSService) ServiceFactory.getService(SNSService.class)).dismissLoading(this.f15982a);
        }
        wmo wmoVar = this.b;
        Activity activity = this.f15982a;
        wmoVar.onError(activity, bt0.b, i, activity.getString(R.string.aliuser_sns_platform_auth_fail), this.c);
    }

    @Override // com.ali.user.open.oauth.alipay3.GetSignCallback
    public void onGetSignSuccessed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644662ff", new Object[]{this, str});
            return;
        }
        if (this.f15982a != null) {
            ((SNSService) ServiceFactory.getService(SNSService.class)).dismissLoading(this.f15982a);
        }
        bt0.g(this.d, this.f15982a, this.b, this.c, str);
    }
}
