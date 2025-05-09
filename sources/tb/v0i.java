package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.a;
import com.taobao.tao.TaobaoApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v0i extends x42 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public v0i(Application application, String str, String str2) {
        super(application, str, str2);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74cd1c87", new Object[]{this});
            return;
        }
        ppo b = ppo.b();
        b.f(TaobaoApplication.sAppVersion);
        b.e(this.f27892a);
        b.d(this.f27892a);
    }

    public static /* synthetic */ Object ipc$super(v0i v0iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/MainPreLaunch");
    }

    @Override // tb.x42, tb.s9t
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        g();
        f();
        a.c(this.f27892a);
        e();
    }
}
