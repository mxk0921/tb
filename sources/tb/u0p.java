package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u0p implements hk4<Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29064a;

    static {
        t2o.a(815792914);
        t2o.a(993001997);
    }

    public u0p(String str) {
        this.f29064a = TextUtils.isEmpty(str) ? "empty" : str;
    }

    /* renamed from: a */
    public void accept(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
            return;
        }
        AppMonitor.Alarm.commitFail("SearchRxSubscriber", "exception", this.f29064a, th.toString());
        b4p.b("SearchBaseSubscriber", "search rx error: " + ("bizName=" + this.f29064a + ",throwable=" + th.toString()));
        th.printStackTrace();
    }
}
