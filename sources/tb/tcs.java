package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.preload.a;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tcs extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249520);
    }

    public tcs(String str) {
        super(str);
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9928bc", new Object[0]);
            return;
        }
        a.d();
        v2i.a();
    }

    public static /* synthetic */ Object ipc$super(tcs tcsVar, String str, Object... objArr) {
        if (str.hashCode() == -1265548210) {
            super.f((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/idle/TMSSDKDoPreLoadTask");
    }

    @Override // tb.z8s
    public TMSInitTaskExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSInitTaskExecutorType) ipChange.ipc$dispatch("45d39259", new Object[]{this});
        }
        return TMSInitTaskExecutorType.IDLE;
    }

    @Override // tb.z8s
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSSDK.doPreLoad";
    }

    @Override // tb.z8s
    public void f(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b491444e", new Object[]{this, application, hashMap});
            return;
        }
        super.f(application, hashMap);
        h();
        p9s.e().set(1);
    }

    @Override // tb.z8s
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35afa6c7", new Object[]{this})).booleanValue();
        }
        if (p9s.e().get() == 0 || p9s.e().get() == 1) {
            return true;
        }
        return false;
    }
}
