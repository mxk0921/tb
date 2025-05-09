package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tpw implements xkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f28875a;

    static {
        t2o.a(464519244);
        t2o.a(464519243);
    }

    public tpw(WVCallBackContext wVCallBackContext) {
        this.f28875a = wVCallBackContext;
    }

    @Override // tb.xkb
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
        } else if (this.f28875a != null) {
            nsw nswVar = new nsw();
            nswVar.b("data", str);
            nswVar.b("code", "WV_FAILED");
            nswVar.b("errorMsg", str3);
            nswVar.b("errorCode", str2);
            this.f28875a.error(nswVar);
        }
    }

    @Override // tb.xkb
    public void onSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
        } else if (this.f28875a != null) {
            nsw nswVar = new nsw();
            nswVar.b("data", str);
            nswVar.b("code", "WV_SUCCESS");
            this.f28875a.success(nswVar);
        }
    }
}
