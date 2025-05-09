package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class dqw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVCallBackContext f18020a;
    public String b;
    public String c;

    static {
        t2o.a(989856223);
    }

    public dqw(WVCallBackContext wVCallBackContext, String str) {
        this.f18020a = wVCallBackContext;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("msg", this.b);
        if (!TextUtils.isEmpty(this.c)) {
            nswVar.b("state", this.c);
        }
        this.f18020a.error(nswVar);
    }

    public dqw(WVCallBackContext wVCallBackContext, String str, String str2) {
        this.f18020a = wVCallBackContext;
        this.b = str;
        this.c = str2;
    }
}
